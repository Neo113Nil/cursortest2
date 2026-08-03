package com.vungle.ads.internal.bidding;

/* compiled from: BidTokenEncoder.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0002J\r\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020 H\u0001¢\u0006\u0002\b#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\nR$\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/bidding/BidTokenEncoder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidTokenRequestedMetric", "Lcom/vungle/ads/SingleValueMetric;", "enterBackgroundTime", "", "getEnterBackgroundTime$vungle_ads_release$annotations", "()V", "getEnterBackgroundTime$vungle_ads_release", "()J", "setEnterBackgroundTime$vungle_ads_release", "(J)V", "json", "Lkotlinx/serialization/json/Json;", "getJson$annotations", "ordinalView", "", "getOrdinalView$vungle_ads_release$annotations", "getOrdinalView$vungle_ads_release", "()I", "setOrdinalView$vungle_ads_release", "(I)V", "constructV6Token", "", "constructV6Token$vungle_ads_release", "encode", "Lcom/vungle/ads/internal/bidding/BidTokenEncoder$BiddingTokenInfo;", "generateBidToken", com.ironsource.X3.i.t0, "", "onPause$vungle_ads_release", com.ironsource.X3.i.u0, "onResume$vungle_ads_release", "BiddingTokenInfo", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BidTokenEncoder {
    private static final java.lang.String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;
    private com.vungle.ads.SingleValueMetric bidTokenRequestedMetric;
    private final android.content.Context context;
    private long enterBackgroundTime;
    private final kotlinx.serialization.json.Json json;
    private int ordinalView;

    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }

    public BidTokenEncoder(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.bidTokenRequestedMetric = new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.json = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
                Json.setEncodeDefaults(true);
                Json.setExplicitNulls(false);
            }
        }, 1, null);
        com.vungle.ads.internal.util.ActivityManager.INSTANCE.addLifecycleListener(new com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onForeground() {
                com.vungle.ads.internal.bidding.BidTokenEncoder.this.onResume$vungle_ads_release();
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onBackground() {
                com.vungle.ads.internal.bidding.BidTokenEncoder.this.onPause$vungle_ads_release();
            }
        });
    }

    /* renamed from: getOrdinalView$vungle_ads_release, reason: from getter */
    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final void setOrdinalView$vungle_ads_release(int i) {
        this.ordinalView = i;
    }

    /* renamed from: getEnterBackgroundTime$vungle_ads_release, reason: from getter */
    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j) {
        this.enterBackgroundTime = j;
    }

    /* compiled from: BidTokenEncoder.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/bidding/BidTokenEncoder$BiddingTokenInfo;", "", "bidToken", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getBidToken", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class BiddingTokenInfo {
        private final java.lang.String bidToken;
        private final java.lang.String errorMessage;

        public static /* synthetic */ com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo copy$default(com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo biddingTokenInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = biddingTokenInfo.bidToken;
            }
            if ((i & 2) != 0) {
                str2 = biddingTokenInfo.errorMessage;
            }
            return biddingTokenInfo.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBidToken() {
            return this.bidToken;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo copy(java.lang.String bidToken, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidToken, "bidToken");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo(bidToken, errorMessage);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo)) {
                return false;
            }
            com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo biddingTokenInfo = (com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bidToken, biddingTokenInfo.bidToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, biddingTokenInfo.errorMessage);
        }

        public int hashCode() {
            return (this.bidToken.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public java.lang.String toString() {
            return "BiddingTokenInfo(bidToken=" + this.bidToken + ", errorMessage=" + this.errorMessage + ')';
        }

        public BiddingTokenInfo(java.lang.String bidToken, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidToken, "bidToken");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.bidToken = bidToken;
            this.errorMessage = errorMessage;
        }

        public final java.lang.String getBidToken() {
            return this.bidToken;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }
    }

    public final void onResume$vungle_ads_release() {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "BidTokenEncoder#onForeground()");
        if (java.lang.System.currentTimeMillis() > this.enterBackgroundTime + com.vungle.ads.internal.ConfigManager.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void onPause$vungle_ads_release() {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = java.lang.System.currentTimeMillis();
    }

    public final com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    private final com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo generateBidToken() {
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.bidTokenRequestedMetric, (com.vungle.ads.internal.util.LogEntry) null, (java.lang.String) null, 6, (java.lang.Object) null);
        try {
            java.lang.String constructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "BidToken: " + constructV6Token$vungle_ads_release);
            try {
                java.lang.String str = "6:" + com.vungle.ads.internal.util.InputOutputUtils.INSTANCE.convertForSending(constructV6Token$vungle_ads_release);
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "After conversion: " + str);
                return new com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo(str, "");
            } catch (java.lang.Throwable th) {
                java.lang.String str2 = "Fail to gzip token data. " + th.getLocalizedMessage();
                new com.vungle.ads.GzipEncodeError(str2).logErrorNoReturnValue$vungle_ads_release();
                return new com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo("", str2);
            }
        } catch (java.lang.Throwable th2) {
            java.lang.String str3 = "Failed to encode TokenParameters. " + th2.getLocalizedMessage();
            new com.vungle.ads.JsonEncodeError(str3).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.bidding.BidTokenEncoder.BiddingTokenInfo("", str3);
        }
    }

    /* renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.VungleApiClient m10423constructV6Token$lambda0(kotlin.Lazy<com.vungle.ads.internal.network.VungleApiClient> lazy) {
        return lazy.getValue();
    }

    public final java.lang.String constructV6Token$vungle_ads_release() {
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        com.vungle.ads.internal.model.CommonRequestBody requestBody = m10423constructV6Token$lambda0(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$constructV6Token$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.network.VungleApiClient invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.VungleApiClient.class);
            }
        })).requestBody(!com.vungle.ads.internal.ConfigManager.INSTANCE.signalsDisabled(), com.vungle.ads.internal.ConfigManager.INSTANCE.fpdEnabled());
        com.vungle.ads.internal.model.RtbToken rtbToken = new com.vungle.ads.internal.model.RtbToken(requestBody.getDevice(), requestBody.getUser(), requestBody.getExt(), new com.vungle.ads.internal.model.RtbRequest(com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa()), this.ordinalView);
        kotlinx.serialization.json.Json json = this.json;
        kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.RtbToken.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.encodeToString(serializer, rtbToken);
    }
}
