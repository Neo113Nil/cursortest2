package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.f> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.g.a d = new com.moloco.sdk.internal.services.bidtoken.providers.g.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "AudSignalProvider";
    public final com.moloco.sdk.internal.services.n b;
    public com.moloco.sdk.internal.services.bidtoken.providers.f c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public g(com.moloco.sdk.internal.services.n audioService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioService, "audioService");
        this.b = audioService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.f e2 = e();
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(e2, this.c);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] needsRefresh: " + z + ", with current: " + e2 + ", cached: " + this.c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.f e() {
        try {
            return new com.moloco.sdk.internal.services.bidtoken.providers.f(this.b.a(), java.lang.Integer.valueOf(this.b.b()));
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] AS Error", e2, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.f(null, null, 3, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.f d() {
        return this.c;
    }
}
