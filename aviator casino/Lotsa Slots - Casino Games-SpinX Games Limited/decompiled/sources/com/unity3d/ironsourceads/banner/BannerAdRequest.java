package com.unity3d.ironsourceads.banner;

/* loaded from: classes5.dex */
public final class BannerAdRequest {

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f8013a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final com.unity3d.ironsourceads.AdSize d;
    private final android.os.Bundle e;
    private final com.ironsource.Ed f;
    private final java.lang.String g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final android.content.Context f8014a;
        private final java.lang.String b;
        private final java.lang.String c;
        private final com.unity3d.ironsourceads.AdSize d;
        private android.os.Bundle e;

        public Builder(android.content.Context context, java.lang.String instanceId, java.lang.String adm, com.unity3d.ironsourceads.AdSize size) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
            this.f8014a = context;
            this.b = instanceId;
            this.c = adm;
            this.d = size;
        }

        public final com.unity3d.ironsourceads.banner.BannerAdRequest build() {
            com.ironsource.mediationsdk.logger.IronLog.API.info("instanceId: " + this.b + ", size: " + this.d.getSizeDescription());
            return new com.unity3d.ironsourceads.banner.BannerAdRequest(this.f8014a, this.b, this.c, this.d, this.e, null);
        }

        public final java.lang.String getAdm() {
            return this.c;
        }

        public final android.content.Context getContext() {
            return this.f8014a;
        }

        public final java.lang.String getInstanceId() {
            return this.b;
        }

        public final com.unity3d.ironsourceads.AdSize getSize() {
            return this.d;
        }

        public final com.unity3d.ironsourceads.banner.BannerAdRequest.Builder withExtraParams(android.os.Bundle extraParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.e = extraParams;
            return this;
        }
    }

    public /* synthetic */ BannerAdRequest(android.content.Context context, java.lang.String str, java.lang.String str2, com.unity3d.ironsourceads.AdSize adSize, android.os.Bundle bundle, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }

    public final java.lang.String getAdId$mediationsdk_release() {
        return this.g;
    }

    public final java.lang.String getAdm() {
        return this.c;
    }

    public final android.content.Context getContext() {
        return this.f8013a;
    }

    public final android.os.Bundle getExtraParams() {
        return this.e;
    }

    public final java.lang.String getInstanceId() {
        return this.b;
    }

    public final com.ironsource.Ed getProviderName$mediationsdk_release() {
        return this.f;
    }

    public final com.unity3d.ironsourceads.AdSize getSize() {
        return this.d;
    }

    private BannerAdRequest(android.content.Context context, java.lang.String str, java.lang.String str2, com.unity3d.ironsourceads.AdSize adSize, android.os.Bundle bundle) {
        this.f8013a = context;
        this.b = str;
        this.c = str2;
        this.d = adSize;
        this.e = bundle;
        this.f = new com.ironsource.C3349wc(str);
        java.lang.String b = com.ironsource.V9.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "generateMultipleUniqueInstanceId()");
        this.g = b;
    }
}
