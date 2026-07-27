package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class l2 extends AbstractC0190g1 {
    private static final l2 zzb;
    private int zzd;
    private U1 zze;

    static {
        l2 l2Var = new l2();
        zzb = l2Var;
        AbstractC0190g1.k(l2.class, l2Var);
    }

    public static /* synthetic */ void n(l2 l2Var, U1 u1) {
        l2Var.zze = u1;
        l2Var.zzd |= 1;
    }

    public static k2 o() {
        return (k2) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new l2();
        }
        if (i4 == 4) {
            return new k2(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
