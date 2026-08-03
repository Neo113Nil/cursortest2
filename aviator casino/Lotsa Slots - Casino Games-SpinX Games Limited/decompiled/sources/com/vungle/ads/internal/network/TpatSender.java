package com.vungle.ads.internal.network;

/* compiled from: TpatSender.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\r\u0010'\u001a\u00020\u001fH\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\u001f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/network/TpatSender;", "", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "ioExecutor", "Ljava/util/concurrent/Executor;", "jobExecutor", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "(Lcom/vungle/ads/internal/network/VungleApiClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/signals/SignalManager;)V", "getJobExecutor", "()Ljava/util/concurrent/Executor;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "tpatFilePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "tpatLock", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "getStoredTpats", "", "", "Lcom/vungle/ads/internal/network/FailedTpat;", "injectSessionIdToUrl", "url", "isPriorityTpat", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "logTpatError", "", "request", "Lcom/vungle/ads/internal/network/TpatRequest;", "error", "Lcom/vungle/ads/internal/model/ErrorInfo;", "reason", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "performPriorityRetry", "resendStoredTpats", "resendStoredTpats$vungle_ads_release", "saveStoredTpats", "tpats", "sendTpat", "fromFailedTpat", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class TpatSender {
    private static final java.lang.String FAILED_TPATS = "FAILED_TPATS";
    private static final java.lang.String TAG = "TpatSender";
    private final java.util.concurrent.Executor jobExecutor;
    private final com.vungle.ads.internal.signals.SignalManager signalManager;
    private final com.vungle.ads.internal.persistence.FilePreferences tpatFilePreferences;
    private final java.lang.Object tpatLock;
    private final com.vungle.ads.internal.network.VungleApiClient vungleApiClient;

    public TpatSender(com.vungle.ads.internal.network.VungleApiClient vungleApiClient, java.util.concurrent.Executor ioExecutor, java.util.concurrent.Executor jobExecutor, com.vungle.ads.internal.util.PathProvider pathProvider, com.vungle.ads.internal.signals.SignalManager signalManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobExecutor, "jobExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = signalManager;
        this.tpatFilePreferences = com.vungle.ads.internal.persistence.FilePreferences.INSTANCE.get(ioExecutor, pathProvider, com.vungle.ads.internal.persistence.FilePreferences.TPAT_FAILED_FILENAME);
        this.tpatLock = new java.lang.Object();
    }

    public /* synthetic */ TpatSender(com.vungle.ads.internal.network.VungleApiClient vungleApiClient, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, com.vungle.ads.internal.util.PathProvider pathProvider, com.vungle.ads.internal.signals.SignalManager signalManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(vungleApiClient, executor, executor2, pathProvider, (i & 16) != 0 ? null : signalManager);
    }

    public final com.vungle.ads.internal.network.VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final java.util.concurrent.Executor getJobExecutor() {
        return this.jobExecutor;
    }

    public final com.vungle.ads.internal.signals.SignalManager getSignalManager() {
        return this.signalManager;
    }

    public static /* synthetic */ void sendTpat$default(com.vungle.ads.internal.network.TpatSender tpatSender, com.vungle.ads.internal.network.TpatRequest tpatRequest, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        tpatSender.sendTpat(tpatRequest, z);
    }

    public final void sendTpat(final com.vungle.ads.internal.network.TpatRequest request, final boolean fromFailedTpat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        final java.lang.String injectSessionIdToUrl = injectSessionIdToUrl(request.getUrl());
        this.jobExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.network.TpatSender$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.network.TpatSender.m10443sendTpat$lambda1(com.vungle.ads.internal.network.TpatSender.this, request, injectSessionIdToUrl, fromFailedTpat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m10443sendTpat$lambda1(com.vungle.ads.internal.network.TpatSender this$0, com.vungle.ads.internal.network.TpatRequest request, java.lang.String urlWithSessionId, boolean z) {
        com.vungle.ads.internal.network.FailedTpat failedTpat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlWithSessionId, "$urlWithSessionId");
        com.vungle.ads.internal.model.ErrorInfo performPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (performPriorityRetry == null || !performPriorityRetry.getErrorIsTerminal()) {
                if (performPriorityRetry != null || z) {
                    synchronized (this$0.tpatLock) {
                        java.util.Map<java.lang.String, com.vungle.ads.internal.network.FailedTpat> storedTpats = this$0.getStoredTpats();
                        com.vungle.ads.internal.network.FailedTpat failedTpat2 = storedTpats.get(request.getUrl());
                        int retryAttempt = failedTpat2 != null ? failedTpat2.getRetryAttempt() : 0;
                        if (performPriorityRetry == null && retryAttempt > 0) {
                            storedTpats.remove(request.getUrl());
                            this$0.saveStoredTpats(storedTpats);
                        } else if (performPriorityRetry != null && retryAttempt >= request.getRegularRetryCount()) {
                            storedTpats.remove(request.getUrl());
                            this$0.saveStoredTpats(storedTpats);
                            this$0.logTpatError(request, urlWithSessionId, performPriorityRetry, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED);
                        } else if (performPriorityRetry != null) {
                            com.vungle.ads.internal.network.FailedTpat failedTpat3 = storedTpats.get(request.getUrl());
                            if (failedTpat3 == null || (failedTpat = com.vungle.ads.internal.network.FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                                failedTpat = new com.vungle.ads.internal.network.FailedTpat(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                            }
                            storedTpats.put(request.getUrl(), failedTpat);
                            this$0.saveStoredTpats(storedTpats);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private final boolean isPriorityTpat(java.lang.String event) {
        return kotlin.jvm.internal.Intrinsics.areEqual(event, com.vungle.ads.internal.Constants.CHECKPOINT_0) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.vungle.ads.internal.Constants.CLICK_URL) || kotlin.jvm.internal.Intrinsics.areEqual(event, "impression") || kotlin.jvm.internal.Intrinsics.areEqual(event, com.vungle.ads.internal.Constants.LOAD_AD);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r1 < r9.getPriorityRetryCount()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        logTpatError(r9, r10, r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r0 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_ERROR;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.vungle.ads.internal.model.ErrorInfo performPriorityRetry(com.vungle.ads.internal.network.TpatRequest request, java.lang.String url) {
        com.vungle.ads.internal.model.ErrorInfo pingTPAT;
        java.lang.Boolean priorityRetry = request.getPriorityRetry();
        boolean booleanValue = priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(request.getTpatKey());
        int i = 0;
        do {
            pingTPAT = this.vungleApiClient.pingTPAT(url, request.getHeaders(), request.getBody(), request.getMethod(), request.getLogEntry());
            if (!booleanValue || pingTPAT == null || !pingTPAT.isRetryCode()) {
                break;
            }
            i++;
        } while (i < request.getPriorityRetryCount());
        return pingTPAT;
    }

    private final void logTpatError(com.vungle.ads.internal.network.TpatRequest request, java.lang.String url, com.vungle.ads.internal.model.ErrorInfo error, com.vungle.ads.internal.protos.Sdk.SDKError.Reason reason) {
        java.lang.String str = "tpat key: " + request.getTpatKey() + ", error: " + error.getDescription() + ", errorIsTerminal: " + error.getErrorIsTerminal() + " url: " + url;
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, str);
        new com.vungle.ads.TpatError(reason, str).setLogEntry$vungle_ads_release(request.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final java.util.Map<java.lang.String, com.vungle.ads.internal.network.FailedTpat> getStoredTpats() {
        java.util.LinkedHashMap m10798constructorimpl;
        java.lang.String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.vungle.ads.internal.network.TpatSender tpatSender = this;
                kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
                kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(companion2.getSerializersModule(), kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.Map.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.network.FailedTpat.class)))));
                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                m10798constructorimpl = kotlin.Result.m10798constructorimpl((java.util.Map) companion2.decodeFromString(serializer, string));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to decode stored tpats: " + m10801exceptionOrNullimpl);
            }
            if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
                m10798constructorimpl = new java.util.LinkedHashMap();
            }
            java.util.Map<java.lang.String, com.vungle.ads.internal.network.FailedTpat> map = (java.util.Map) m10798constructorimpl;
            if (map != null) {
                return map;
            }
        }
        return new java.util.LinkedHashMap();
    }

    private final void saveStoredTpats(java.util.Map<java.lang.String, com.vungle.ads.internal.network.FailedTpat> tpats) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.network.TpatSender tpatSender = this;
            com.vungle.ads.internal.persistence.FilePreferences filePreferences = this.tpatFilePreferences;
            kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
            kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(companion2.getSerializersModule(), kotlin.jvm.internal.Reflection.mutableCollectionType(kotlin.jvm.internal.Reflection.typeOf(java.util.Map.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.network.FailedTpat.class)))));
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(FAILED_TPATS, companion2.encodeToString(serializer, tpats)).apply();
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to encode the about to storing tpats: " + tpats);
        }
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (java.util.Map.Entry<java.lang.String, com.vungle.ads.internal.network.FailedTpat> entry : getStoredTpats().entrySet()) {
            java.lang.String key = entry.getKey();
            com.vungle.ads.internal.network.FailedTpat value = entry.getValue();
            sendTpat(new com.vungle.ads.internal.network.TpatRequest.Builder(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final java.lang.String injectSessionIdToUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.vungle.ads.internal.signals.SignalManager signalManager = this.signalManager;
        java.lang.String uuid = signalManager != null ? signalManager.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        java.lang.String quote = java.util.regex.Pattern.quote(com.vungle.ads.internal.Constants.SESSION_ID);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quote, "quote(Constants.SESSION_ID)");
        return new kotlin.text.Regex(quote).replace(url, uuid);
    }
}
