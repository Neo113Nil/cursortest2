package com.vungle.ads.internal;

/* compiled from: VungleInternal.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/VungleInternal;", "", "()V", "getAvailableBidTokensAsync", "", "context", "Landroid/content/Context;", "callback", "Lcom/vungle/ads/BidTokenCallback;", "getSdkVersion", "", "vungle-ads_release", "bidTokenEncoder", "Lcom/vungle/ads/internal/bidding/BidTokenEncoder;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/SDKExecutors;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleInternal {
    public final void getAvailableBidTokensAsync(final android.content.Context context, final com.vungle.ads.BidTokenCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.vungle.ads.internal.util.Utils.INSTANCE.isOSVersionInvalid()) {
            new com.vungle.ads.SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            callback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!com.vungle.ads.VungleAds.INSTANCE.isInitialized()) {
            com.vungle.ads.internal.privacy.PrivacyManager privacyManager = com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE;
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            privacyManager.init(applicationContext);
        }
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.bidding.BidTokenEncoder>() { // from class: com.vungle.ads.internal.VungleInternal$getAvailableBidTokensAsync$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.bidding.BidTokenEncoder, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.bidding.BidTokenEncoder invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.bidding.BidTokenEncoder.class);
            }
        });
        com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
        m10421getAvailableBidTokensAsync$lambda1(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.SDKExecutors>() { // from class: com.vungle.ads.internal.VungleInternal$getAvailableBidTokensAsync$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.SDKExecutors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.executor.SDKExecutors invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.SDKExecutors.class);
            }
        })).getAPI_EXECUTOR().execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.VungleInternal$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.VungleInternal.m10422getAvailableBidTokensAsync$lambda2(com.vungle.ads.BidTokenCallback.this, lazy);
            }
        });
    }

    /* renamed from: getAvailableBidTokensAsync$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.bidding.BidTokenEncoder m10420getAvailableBidTokensAsync$lambda0(kotlin.Lazy<com.vungle.ads.internal.bidding.BidTokenEncoder> lazy) {
        return lazy.getValue();
    }

    /* renamed from: getAvailableBidTokensAsync$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.SDKExecutors m10421getAvailableBidTokensAsync$lambda1(kotlin.Lazy<com.vungle.ads.internal.executor.SDKExecutors> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAvailableBidTokensAsync$lambda-2, reason: not valid java name */
    public static final void m10422getAvailableBidTokensAsync$lambda2(com.vungle.ads.BidTokenCallback callback, kotlin.Lazy bidTokenEncoder$delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        com.vungle.ads.TimeIntervalMetric timeIntervalMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        timeIntervalMetric.markStart();
        com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo encode = m10420getAvailableBidTokensAsync$lambda0(bidTokenEncoder$delegate).encode();
        timeIntervalMetric.markEnd();
        if (encode.getBidToken().length() > 0) {
            callback.onBidTokenCollected(encode.getBidToken());
        } else {
            timeIntervalMetric.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            timeIntervalMetric.setMeta(encode.getErrorMessage());
            callback.onBidTokenError(encode.getErrorMessage());
        }
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, timeIntervalMetric, (com.vungle.ads.internal.util.LogEntry) null, (java.lang.String) null, 6, (java.lang.Object) null);
    }

    public final java.lang.String getSdkVersion() {
        return com.vungle.ads.BuildConfig.VERSION_NAME;
    }
}
