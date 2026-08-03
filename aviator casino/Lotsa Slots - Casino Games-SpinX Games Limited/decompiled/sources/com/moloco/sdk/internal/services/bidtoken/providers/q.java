package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class q implements com.moloco.sdk.internal.services.bidtoken.providers.j<com.moloco.sdk.internal.services.bidtoken.providers.p> {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.q.a d = new com.moloco.sdk.internal.services.bidtoken.providers.q.a(null);
    public static final int e = 8;
    public static final java.lang.String f = "IlrdSignalProvider";
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ilrd.f> b;
    public com.moloco.sdk.internal.services.bidtoken.providers.p c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public q(kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ilrd.f> _ilrdService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(_ilrdService, "_ilrdService");
        this.b = _ilrdService;
        this.c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.p f2 = f();
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(f2, this.c);
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "[Ilrd] needsRefresh: " + z + ", with current: " + f2 + ", cached: " + this.c, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.p e() {
        return new com.moloco.sdk.internal.services.bidtoken.providers.p("", -1L, -1L, -1, -1, -1, -1, -1);
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.p f() {
        com.moloco.sdk.internal.services.bidtoken.providers.p b;
        try {
            com.moloco.sdk.internal.ilrd.f invoke = this.b.invoke();
            return (invoke == null || (b = invoke.b()) == null) ? e() : b;
        } catch (java.lang.Exception e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, "Error retrieving ILRD signal", e2, false, 8, null);
            return e();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.p d() {
        return this.c;
    }
}
