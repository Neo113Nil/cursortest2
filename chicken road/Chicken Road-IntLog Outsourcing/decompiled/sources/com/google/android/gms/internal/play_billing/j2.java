package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class j2 extends AbstractC0334g1 {
    private static final j2 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC0346k1 zze = B1.f5027e;
    private String zzg = "";

    static {
        j2 j2Var = new j2();
        zzb = j2Var;
        AbstractC0334g1.k(j2.class, j2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new j2();
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
