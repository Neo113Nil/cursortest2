package com.unity3d.services.ads.gmascar.managers;

/* loaded from: classes5.dex */
public abstract class BiddingBaseManager implements com.unity3d.services.ads.gmascar.managers.IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final com.unity3d.services.ads.gmascar.utils.ScarRequestHandler _scarRequestHandler;
    protected final java.util.concurrent.atomic.AtomicBoolean isUploadPermitted;
    private final com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider scarAdFormatProvider;
    private final java.util.concurrent.atomic.AtomicReference<com.unity3d.services.ads.gmascar.models.BiddingSignals> signals;
    private final java.lang.String tokenIdentifier;
    private final com.unity3d.ads.IUnityAdsTokenListener unityAdsTokenListener;

    public abstract void start();

    protected BiddingBaseManager(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(null, iUnityAdsTokenListener, new com.unity3d.services.ads.gmascar.utils.ScarRequestHandler());
    }

    protected BiddingBaseManager(com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider iScarAdFormatProvider, com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(iScarAdFormatProvider, iUnityAdsTokenListener, new com.unity3d.services.ads.gmascar.utils.ScarRequestHandler());
    }

    protected BiddingBaseManager(com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider iScarAdFormatProvider, com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener, com.unity3d.services.ads.gmascar.utils.ScarRequestHandler scarRequestHandler) {
        this.isUploadPermitted = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.signals = new java.util.concurrent.atomic.AtomicReference<>();
        this.tokenIdentifier = java.util.UUID.randomUUID().toString();
        this.unityAdsTokenListener = iUnityAdsTokenListener;
        this._isAsyncTokenCall = iUnityAdsTokenListener != null;
        this._scarRequestHandler = scarRequestHandler;
        this.scarAdFormatProvider = iScarAdFormatProvider;
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public java.lang.String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public java.lang.String getFormattedToken(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        java.lang.String tokenIdentifier = getTokenIdentifier();
        return (tokenIdentifier == null || tokenIdentifier.isEmpty()) ? str : java.lang.String.format(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, tokenIdentifier, str);
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public final void onUnityAdsTokenReady(final java.lang.String str) {
        if (this.unityAdsTokenListener != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.this.m10349x87509455(str);
                }
            });
        }
    }

    /* renamed from: lambda$onUnityAdsTokenReady$0$com-unity3d-services-ads-gmascar-managers-BiddingBaseManager, reason: not valid java name */
    /* synthetic */ void m10349x87509455(java.lang.String str) {
        this.unityAdsTokenListener.onUnityAdsTokenReady(str);
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        attemptUpload();
    }

    public void fetchSignals() {
        getMetricSender().sendMetric(com.unity3d.services.core.request.metrics.ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.this.m10348xbd500567();
            }
        }).start();
    }

    /* renamed from: lambda$fetchSignals$1$com-unity3d-services-ads-gmascar-managers-BiddingBaseManager, reason: not valid java name */
    /* synthetic */ void m10348xbd500567() {
        com.unity3d.services.ads.gmascar.GMA.getInstance().getSCARBiddingSignals(this.scarAdFormatProvider.buildAdFormatList(), new com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener() { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1
            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsReady(com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals) {
                com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.this.onSignalsReady(biddingSignals);
                com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.this.sendFetchResult("");
            }

            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsFailure(java.lang.String str) {
                com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.this.sendFetchResult(str);
            }
        });
    }

    public void sendFetchResult(java.lang.String str) {
        if (str != "") {
            getMetricSender().sendMetric(com.unity3d.services.core.request.metrics.ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, str));
        } else {
            getMetricSender().sendMetric(com.unity3d.services.core.request.metrics.ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
        }
    }

    public void onSignalsReady(com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals) {
        this.signals.set(biddingSignals);
        attemptUpload();
    }

    private synchronized void attemptUpload() {
        if (this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
            uploadSignals();
        }
    }

    public void uploadSignals() {
        getMetricSender().sendMetric(com.unity3d.services.core.request.metrics.ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        final com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals = this.signals.get();
        if (biddingSignals == null || biddingSignals.isEmpty()) {
            getMetricSender().sendMetric(com.unity3d.services.core.request.metrics.ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
        } else {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.this.m10350xb93d3227(biddingSignals);
                }
            }).start();
        }
    }

    /* renamed from: lambda$uploadSignals$2$com-unity3d-services-ads-gmascar-managers-BiddingBaseManager, reason: not valid java name */
    /* synthetic */ void m10350xb93d3227(com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals) {
        try {
            this._scarRequestHandler.makeUploadRequest(this.tokenIdentifier, biddingSignals, new com.unity3d.services.core.configuration.ConfigurationReader().getCurrentConfiguration().getScarBiddingUrl());
            getMetricSender().sendMetric(com.unity3d.services.core.request.metrics.ScarMetric.hbSignalsUploadSuccess(this._isAsyncTokenCall));
        } catch (java.lang.Exception e) {
            getMetricSender().sendMetric(com.unity3d.services.core.request.metrics.ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, e.getLocalizedMessage()));
        }
    }

    public com.unity3d.services.core.request.metrics.SDKMetricsSender getMetricSender() {
        return (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);
    }
}
