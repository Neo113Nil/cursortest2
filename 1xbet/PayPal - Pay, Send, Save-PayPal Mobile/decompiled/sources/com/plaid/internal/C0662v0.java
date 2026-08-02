package com.plaid.internal;

/* renamed from: com.plaid.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0662v0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0577l4 f6594a;
    public final com.plaid.internal.EnumC0559j4 b;
    public final com.plaid.internal.C0644t0 c;

    public C0662v0(com.plaid.internal.C0577l4 c0577l4, com.plaid.internal.EnumC0559j4 enumC0559j4, com.plaid.internal.C0607o7 c0607o7, com.plaid.internal.C0644t0 c0644t0) {
        this.f6594a = c0577l4;
        this.b = enumC0559j4;
        this.c = c0644t0;
    }

    public final com.plaid.internal.C0455b a() {
        if (this.f6594a.a()) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.PRE_CHECK_AIRPLANE_MODE_ENABLED);
        }
        com.plaid.internal.C0532g4 a2 = this.f6594a.a(this.b);
        if (a2 == null) {
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.PRE_CHECK_NO_CELLULAR_RADIO);
        }
        try {
            com.plaid.internal.C0455b c0455b = new com.plaid.internal.C0455b(a2);
            c0455b.f5997a.c = 10000;
            c0455b.b.c = 10000;
            if (this.c.a(c0455b)) {
                return c0455b;
            }
            throw new com.plaid.internal.C0617q(com.plaid.internal.T0.PRE_CHECK_NO_CELLULAR_CONNECTION);
        } catch (com.plaid.internal.C0617q | java.lang.RuntimeException e) {
            if (!a2.d) {
                a2.d = true;
                a2.b.run();
            }
            throw e;
        }
    }
}
