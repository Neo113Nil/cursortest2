package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.a> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.b.a d = new com.moloco.sdk.internal.services.bidtoken.providers.b.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "AcSignalProvider";
    public final com.moloco.sdk.internal.services.InterfaceC3428a b;
    public com.moloco.sdk.internal.services.bidtoken.providers.a c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(com.moloco.sdk.internal.services.InterfaceC3428a accessibilityInfoService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilityInfoService, "accessibilityInfoService");
        this.b = accessibilityInfoService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.a e2 = e();
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(e2, this.c);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] needsRefresh: " + z + ", with current: " + e2 + ", cached: " + this.c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.a e() {
        try {
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(java.lang.Boolean.valueOf(this.b.c()), java.lang.Boolean.valueOf(this.b.b()), java.lang.Boolean.valueOf(this.b.a()), java.lang.Float.valueOf(this.b.getFontScale()));
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] ACS Error", e2, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.a d() {
        return this.c;
    }
}
