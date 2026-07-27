package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class f2 extends AbstractC0334g1 {
    private static final f2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        f2 f2Var = new f2();
        zzb = f2Var;
        AbstractC0334g1.k(f2.class, f2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", R0.f5097h, "zzf"});
        }
        if (i3 == 3) {
            return new f2();
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
