package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class u implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.t> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.u.a d = new com.moloco.sdk.internal.services.bidtoken.providers.u.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "NISignalProvider";
    public final com.moloco.sdk.internal.services.B b;
    public com.moloco.sdk.internal.services.bidtoken.providers.t c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public u(com.moloco.sdk.internal.services.B networkInfoService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        this.b = networkInfoService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.t e2 = e();
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(e2, this.c);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] NIS needsRefresh: " + z + ", with nis: " + e2 + ", cached: " + this.c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.t e() {
        try {
            com.moloco.sdk.internal.services.bidtoken.providers.t tVar = new com.moloco.sdk.internal.services.bidtoken.providers.t(this.b.d(), this.b.b(), java.lang.Boolean.valueOf(this.b.a()), this.b.c());
            com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] NIS providing " + tVar, false, 4, null);
            return tVar;
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[CBT] NIS Error", e2, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.t(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.t d() {
        return this.c;
    }
}
