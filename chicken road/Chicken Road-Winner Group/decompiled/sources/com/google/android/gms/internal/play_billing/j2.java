package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class j2 extends AbstractC0190g1 {
    private static final j2 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC0202k1 zze = B1.f2603e;
    private String zzg = "";

    static {
        j2 j2Var = new j2();
        zzb = j2Var;
        AbstractC0190g1.k(j2.class, j2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new j2();
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
