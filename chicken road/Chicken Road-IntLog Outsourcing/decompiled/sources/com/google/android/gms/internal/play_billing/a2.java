package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class a2 extends AbstractC0334g1 {
    private static final a2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        AbstractC0334g1.k(a2.class, a2Var);
    }

    public static /* synthetic */ void n(a2 a2Var, int i2) {
        a2Var.zzd |= 4;
        a2Var.zzg = i2;
    }

    public static /* synthetic */ void o(a2 a2Var, long j2) {
        a2Var.zzd |= 8;
        a2Var.zzh = j2;
    }

    public static /* synthetic */ void p(a2 a2Var, String str) {
        str.getClass();
        a2Var.zzd |= 2;
        a2Var.zzf = str;
    }

    public static /* synthetic */ void q(a2 a2Var, String str) {
        str.getClass();
        a2Var.zzd |= 1;
        a2Var.zze = str;
    }

    public static Z1 r() {
        return (Z1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new a2();
        }
        if (i3 == 4) {
            return new Z1(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
