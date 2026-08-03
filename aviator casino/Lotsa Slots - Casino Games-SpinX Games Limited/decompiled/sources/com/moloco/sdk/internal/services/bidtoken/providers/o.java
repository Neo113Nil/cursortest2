package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class o implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.n> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.o.a e = new com.moloco.sdk.internal.services.bidtoken.providers.o.a(null);
    public static final int f = 8;
    public static final java.lang.String g = "DSignalProvider";
    public final com.moloco.sdk.internal.services.y b;
    public final com.moloco.sdk.internal.services.F c;
    public com.moloco.sdk.internal.services.bidtoken.providers.n d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public o(com.moloco.sdk.internal.services.y deviceInfoService, com.moloco.sdk.internal.services.F screenInfoService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.b = deviceInfoService;
        this.c = screenInfoService;
        this.d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.n e2 = e();
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(e2, this.d);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "[CBT] DSP needsRefresh: " + z + ", with current: " + e2 + ", cached: " + this.d, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return g;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.n e() {
        try {
            return new com.moloco.sdk.internal.services.bidtoken.providers.n(this.c.b(), this.b.c(), this.b.d());
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "[CBT] DSP Error", e2, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.n(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.n d() {
        return this.d;
    }
}
