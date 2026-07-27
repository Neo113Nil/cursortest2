package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class o2 extends AbstractC0334g1 {
    private static final o2 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        o2 o2Var = new o2();
        zzb = o2Var;
        AbstractC0334g1.k(o2.class, o2Var);
    }

    public static /* synthetic */ void n(o2 o2Var) {
        o2Var.zzd |= 2;
        o2Var.zzf = true;
    }

    public static n2 o() {
        return (n2) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new o2();
        }
        if (i3 == 4) {
            return new n2(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
