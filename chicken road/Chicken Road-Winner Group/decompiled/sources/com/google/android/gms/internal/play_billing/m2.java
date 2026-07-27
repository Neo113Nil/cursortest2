package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class m2 extends AbstractC0190g1 {
    private static final m2 zzb;
    private int zzd;
    private int zze;

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        AbstractC0190g1.k(m2.class, m2Var);
    }

    public static m2 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", R0.f2675i});
        }
        if (i4 == 3) {
            return new m2();
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
