package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class i implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.h> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.i.a d = new com.moloco.sdk.internal.services.bidtoken.providers.i.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "BInfoSignalProvider";
    public final com.moloco.sdk.internal.services.q b;
    public com.moloco.sdk.internal.services.bidtoken.providers.h c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public i(com.moloco.sdk.internal.services.q batteryInfoService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryInfoService, "batteryInfoService");
        this.b = batteryInfoService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(this.c, e());
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT][BIS]: needsRefresh: " + z, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.h e() {
        try {
            com.moloco.sdk.internal.services.bidtoken.providers.h hVar = new com.moloco.sdk.internal.services.bidtoken.providers.h(java.lang.Integer.valueOf(this.b.b()), java.lang.Integer.valueOf(this.b.a()), java.lang.Boolean.valueOf(this.b.c()));
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT][BIS]: blev: " + hVar.e() + ", bst: " + hVar.d() + ", psm: " + hVar.f(), false, 4, null);
            return hVar;
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT][BIS]: Error", e2, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.h(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.h d() {
        return this.c;
    }
}
