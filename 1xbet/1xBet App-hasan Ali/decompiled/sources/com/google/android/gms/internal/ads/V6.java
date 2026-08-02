package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class V6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final V6 zzd;
    private static volatile InterfaceC1195kC zze;
    private int zzf;
    private int zzg;
    private Y6 zzh;
    private C0744a7 zzi;

    static {
        V6 v6 = new V6();
        zzd = v6;
        MB.k(V6.class, v6);
    }

    public static void w(V6 v6) {
        v6.getClass();
        v6.zzg = AbstractC2462i.b(2);
        v6.zzf |= 1;
    }

    public static void x(V6 v6, Y6 y6) {
        v6.getClass();
        y6.getClass();
        v6.zzh = y6;
        v6.zzf |= 2;
    }

    public static void y(V6 v6, C0744a7 c0744a7) {
        v6.getClass();
        v6.zzi = c0744a7;
        v6.zzf |= 4;
    }

    public static U6 z() {
        return (U6) zzd.g();
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", W3.f12009q, "zzh", "zzi"});
        }
        if (b3 == 3) {
            return new V6();
        }
        if (b3 == 4) {
            return new U6(zzd);
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
        synchronized (V6.class) {
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
