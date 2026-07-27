package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class i2 extends AbstractC0190g1 {
    private static final i2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private a2 zzg;
    private b2 zzh;

    static {
        i2 i2Var = new i2();
        zzb = i2Var;
        AbstractC0190g1.k(i2.class, i2Var);
    }

    public static /* synthetic */ void n(i2 i2Var, Q1 q12) {
        i2Var.zzf = q12;
        i2Var.zze = 2;
    }

    public static /* synthetic */ void o(i2 i2Var, S1 s12) {
        i2Var.zzf = s12;
        i2Var.zze = 3;
    }

    public static /* synthetic */ void p(i2 i2Var, W1 w12) {
        w12.getClass();
        i2Var.zzf = w12;
        i2Var.zze = 7;
    }

    public static /* synthetic */ void q(i2 i2Var, a2 a2Var) {
        a2Var.getClass();
        i2Var.zzg = a2Var;
        i2Var.zzd |= 1;
    }

    public static /* synthetic */ void r(i2 i2Var, l2 l2Var) {
        i2Var.zzf = l2Var;
        i2Var.zze = 8;
    }

    public static /* synthetic */ void s(i2 i2Var, m2 m2Var) {
        i2Var.zzf = m2Var;
        i2Var.zze = 4;
    }

    public static h2 t() {
        return (h2) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", Q1.class, S1.class, m2.class, Y1.class, "zzh", W1.class, l2.class});
        }
        if (i4 == 3) {
            return new i2();
        }
        if (i4 == 4) {
            return new h2(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
