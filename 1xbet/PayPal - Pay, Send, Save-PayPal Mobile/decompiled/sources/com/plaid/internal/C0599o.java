package com.plaid.internal;

/* renamed from: com.plaid.internal.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0599o<R> {
    public static final com.plaid.internal.C0680x0 g;

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0671w0 f6511a;
    public final com.plaid.internal.C0653u0 b;
    public final com.plaid.internal.C0659u6 c;
    public final com.plaid.internal.C0635s0 d;
    public final com.plaid.internal.C0641s6 e;
    public final com.plaid.internal.A7 f;

    /* renamed from: com.plaid.internal.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.plaid.internal.InterfaceC0627r1 f6512a;
        public final com.plaid.internal.D0 b;

        public a(com.plaid.internal.D0 d0, com.plaid.internal.InterfaceC0627r1 interfaceC0627r1) {
            this.f6512a = interfaceC0627r1;
            this.b = d0;
        }
    }

    public C0599o(com.plaid.internal.A7 a7, com.plaid.internal.C0671w0 c0671w0, com.plaid.internal.C0653u0 c0653u0, com.plaid.internal.C0659u6 c0659u6, com.plaid.internal.C0635s0 c0635s0, com.plaid.internal.C0641s6 c0641s6) {
        this.f = a7;
        this.f6511a = c0671w0;
        this.b = c0653u0;
        this.c = c0659u6;
        this.d = c0635s0;
        this.e = c0641s6;
    }

    public static void a(com.plaid.internal.EnumC0580l7 enumC0580l7, com.plaid.internal.C0608p c0608p) {
        if (enumC0580l7 != com.plaid.internal.EnumC0580l7.FINISH && c0608p.f6523a) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.GENERIC_TIMEOUT);
        }
        c0608p.b = enumC0580l7;
    }

    static {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        g = new com.plaid.internal.C0680x0("auth");
    }

    public static <I, O> O a(com.plaid.internal.EnumC0580l7 enumC0580l7, com.plaid.internal.InterfaceC0571k7<I, O> interfaceC0571k7, I i, com.plaid.internal.C0608p c0608p) {
        try {
            a(enumC0580l7, c0608p);
            com.plaid.internal.C0680x0 c0680x0 = g;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("execute step: ");
            sb.append(enumC0580l7);
            c0680x0.a(com.plaid.internal.W3.INFO, sb.toString(), new java.lang.Object[0]);
            return (O) interfaceC0571k7.a(i, c0608p).a();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            throw new com.plaid.internal.r(enumC0580l7, e);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new com.plaid.internal.r(enumC0580l7, e2.getCause());
        } catch (java.lang.Exception e3) {
            throw new com.plaid.internal.r(enumC0580l7, e3);
        }
    }
}
