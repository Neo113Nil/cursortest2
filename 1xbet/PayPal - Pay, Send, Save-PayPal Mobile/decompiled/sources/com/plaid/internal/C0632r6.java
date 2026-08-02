package com.plaid.internal;

/* renamed from: com.plaid.internal.r6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0632r6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f6558a;
    public final com.plaid.internal.C0616p7 b;
    public final com.plaid.internal.C0659u6 c;
    public final com.plaid.internal.C0641s6 d;

    public C0632r6(android.content.Context context, com.plaid.internal.InterfaceC0535g7 interfaceC0535g7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0535g7, "");
        this.f6558a = java.util.concurrent.Executors.newSingleThreadExecutor();
        com.plaid.internal.C0659u6 c0659u6 = new com.plaid.internal.C0659u6(interfaceC0535g7);
        this.c = c0659u6;
        com.plaid.internal.C0641s6 c0641s6 = new com.plaid.internal.C0641s6(interfaceC0535g7);
        this.d = c0641s6;
        com.plaid.internal.C0577l4 c0577l4 = new com.plaid.internal.C0577l4(context);
        com.plaid.internal.E0 e0 = new com.plaid.internal.E0(context);
        com.plaid.internal.C0671w0 c0671w0 = new com.plaid.internal.C0671w0(new com.plaid.internal.C0662v0(c0577l4, com.plaid.internal.EnumC0559j4.CELLULAR, new com.plaid.internal.C0607o7(), new com.plaid.internal.C0644t0()));
        com.plaid.internal.C0635s0 c0635s0 = new com.plaid.internal.C0635s0();
        com.plaid.internal.C0616p7 c0616p7 = new com.plaid.internal.C0616p7(new com.plaid.internal.C0599o(new com.plaid.internal.A7(), c0671w0, new com.plaid.internal.C0653u0(), c0659u6, c0635s0, c0641s6), e0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c0616p7, "");
        this.b = c0616p7;
    }

    public final void a(final com.plaid.internal.C0650t6 c0650t6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0650t6, "");
        this.f6558a.submit(new java.lang.Runnable() { // from class: com.plaid.internal.r6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.plaid.internal.C0632r6.a(com.plaid.internal.C0632r6.this, c0650t6);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.plaid.internal.s6] */
    public static final void a(com.plaid.internal.C0632r6 c0632r6, com.plaid.internal.C0650t6 c0650t6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0632r6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0650t6, "");
        try {
            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "ProveSNA - start isAuthenticationPossible");
            c0632r6.b.b();
            com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "ProveSNA - isAuthenticationPossible success");
            java.lang.String a2 = c0650t6.a();
            c0632r6.c.b = a2;
            c0632r6.d.b = a2;
            try {
                try {
                    com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "ProveSNA - start authenticate");
                    c0632r6.b.a();
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Prove SNA success", true);
                    com.plaid.internal.F6.a.b(kotlin.collections.MapsKt.emptyMap(), "ProveSNA - authenticate success");
                    c0632r6.c.b = null;
                } catch (java.lang.Throwable th) {
                    c0632r6.c.b = null;
                    c0632r6.d.b = null;
                    throw th;
                }
            } catch (java.lang.Exception e) {
                com.plaid.internal.F6.a.a(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Exception", e.toString())), "ProveSNA - authenticate failure");
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Prove SNA failure - exception: ");
                sb.append(e);
                com.plaid.internal.Y6.a.a(sb.toString());
                c0632r6.c.b = null;
            }
            c0632r6 = c0632r6.d;
            c0632r6.b = null;
        } catch (java.lang.Exception e2) {
            com.plaid.internal.F6.a.a(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Exception", e2.toString())), "ProveSNA - isAuthenticationPossible failure");
            com.plaid.internal.Y6.a.a("Prove SNA authentication is not possible- exception: ".concat(java.lang.String.valueOf(e2)));
        }
    }
}
