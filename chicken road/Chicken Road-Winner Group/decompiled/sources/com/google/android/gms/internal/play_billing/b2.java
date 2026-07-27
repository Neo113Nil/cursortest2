package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class b2 extends AbstractC0190g1 {
    private static final b2 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        b2 b2Var = new b2();
        zzb = b2Var;
        AbstractC0190g1.k(b2.class, b2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new b2();
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
