package com.unity3d.ironsourceads.interstitial;

/* loaded from: classes5.dex */
public final class InterstitialAdRequest {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8026a;
    private final java.lang.String b;
    private final android.os.Bundle c;
    private final com.ironsource.Ed d;
    private final java.lang.String e;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f8027a;
        private final java.lang.String b;
        private android.os.Bundle c;

        public Builder(java.lang.String instanceId, java.lang.String adm) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
            this.f8027a = instanceId;
            this.b = adm;
        }

        public final com.unity3d.ironsourceads.interstitial.InterstitialAdRequest build() {
            com.ironsource.mediationsdk.logger.IronLog.API.info("instanceId: " + this.f8027a);
            return new com.unity3d.ironsourceads.interstitial.InterstitialAdRequest(this.f8027a, this.b, this.c, null);
        }

        public final java.lang.String getAdm() {
            return this.b;
        }

        public final java.lang.String getInstanceId() {
            return this.f8027a;
        }

        public final com.unity3d.ironsourceads.interstitial.InterstitialAdRequest.Builder withExtraParams(android.os.Bundle extraParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.c = extraParams;
            return this;
        }
    }

    public /* synthetic */ InterstitialAdRequest(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }

    public final java.lang.String getAdId$mediationsdk_release() {
        return this.e;
    }

    public final java.lang.String getAdm() {
        return this.b;
    }

    public final android.os.Bundle getExtraParams() {
        return this.c;
    }

    public final java.lang.String getInstanceId() {
        return this.f8026a;
    }

    public final com.ironsource.Ed getProviderName$mediationsdk_release() {
        return this.d;
    }

    private InterstitialAdRequest(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.f8026a = str;
        this.b = str2;
        this.c = bundle;
        this.d = new com.ironsource.C3349wc(str);
        java.lang.String b = com.ironsource.V9.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "generateMultipleUniqueInstanceId()");
        this.e = b;
    }
}
