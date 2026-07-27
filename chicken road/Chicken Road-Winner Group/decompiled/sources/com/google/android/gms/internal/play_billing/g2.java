package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class g2 extends AbstractC0190g1 {
    private static final g2 zzb;
    private InterfaceC0202k1 zzd = B1.f2603e;

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        AbstractC0190g1.k(g2.class, g2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", f2.class});
        }
        if (i4 == 3) {
            return new g2();
        }
        if (i4 == 4) {
            return new V1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
