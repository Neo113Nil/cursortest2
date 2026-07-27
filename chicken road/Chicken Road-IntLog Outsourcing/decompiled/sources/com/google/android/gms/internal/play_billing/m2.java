package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class m2 extends AbstractC0334g1 {
    private static final m2 zzb;
    private int zzd;
    private int zze;

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        AbstractC0334g1.k(m2.class, m2Var);
    }

    public static m2 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", R0.f5098i});
        }
        if (i3 == 3) {
            return new m2();
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
