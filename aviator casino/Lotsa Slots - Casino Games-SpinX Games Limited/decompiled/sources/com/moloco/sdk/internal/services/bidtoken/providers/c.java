package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.AbstractC3432c> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.c.a d = new com.moloco.sdk.internal.services.bidtoken.providers.c.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "AdvertisingSignalProvider";
    public final com.moloco.sdk.internal.services.InterfaceC3433d b;
    public com.moloco.sdk.internal.services.AbstractC3432c c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(com.moloco.sdk.internal.services.InterfaceC3433d advertisingService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        this.b = advertisingService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(this.c, e());
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT][ASP]: needsRefresh: " + z, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final com.moloco.sdk.internal.services.AbstractC3432c e() {
        com.moloco.sdk.internal.services.AbstractC3432c a2 = this.b.a();
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT][ASP]: adData: " + a2, false, 4, null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.AbstractC3432c d() {
        return e();
    }
}
