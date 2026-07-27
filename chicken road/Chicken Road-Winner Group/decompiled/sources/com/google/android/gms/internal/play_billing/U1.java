package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class U1 extends AbstractC0190g1 {
    private static final U1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        U1 u1 = new U1();
        zzb = u1;
        AbstractC0190g1.k(U1.class, u1);
    }

    public static /* synthetic */ void n(U1 u1, String str) {
        u1.zzd |= 8;
        u1.zzh = str;
    }

    public static /* synthetic */ void o(U1 u1, String str) {
        str.getClass();
        u1.zzd |= 2;
        u1.zzf = str;
    }

    public static /* synthetic */ void p(U1 u1, int i3) {
        u1.zzd |= 1;
        u1.zze = i3;
    }

    public static /* synthetic */ void q(U1 u1, int i3) {
        u1.zzg = i3 - 1;
        u1.zzd |= 4;
    }

    public static T1 r() {
        return (T1) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0190g1
    public final Object d(int i3) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new C1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", R0.f2671d, "zzh"});
        }
        if (i4 == 3) {
            return new U1();
        }
        if (i4 == 4) {
            return new T1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
