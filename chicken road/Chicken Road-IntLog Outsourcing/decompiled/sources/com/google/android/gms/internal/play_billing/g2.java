package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class g2 extends AbstractC0334g1 {
    private static final g2 zzb;
    private InterfaceC0346k1 zzd = B1.f5027e;

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        AbstractC0334g1.k(g2.class, g2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", f2.class});
        }
        if (i3 == 3) {
            return new g2();
        }
        if (i3 == 4) {
            return new V1(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
