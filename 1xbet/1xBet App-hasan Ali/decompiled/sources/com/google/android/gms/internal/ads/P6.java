package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class P6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final P6 zzd;
    private static volatile InterfaceC1195kC zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        P6 p6 = new P6();
        zzd = p6;
        MB.k(P6.class, p6);
    }

    public static void w(P6 p6, int i) {
        p6.zzf |= 1;
        p6.zzg = i;
    }

    public static void x(P6 p6, int i) {
        p6.zzf |= 4;
        p6.zzi = i;
    }

    public static void y(P6 p6, int i) {
        p6.zzf |= 2;
        p6.zzh = i;
    }

    public static O6 z() {
        return (O6) zzd.g();
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (b3 == 3) {
            return new P6();
        }
        if (b3 == 4) {
            return new O6(zzd);
        }
        if (b3 == 5) {
            return zzd;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zze;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (P6.class) {
            try {
                interfaceC1195kC = zze;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zze = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
