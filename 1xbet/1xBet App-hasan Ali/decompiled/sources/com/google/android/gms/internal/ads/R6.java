package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class R6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final R6 zzd;
    private static volatile InterfaceC1195kC zze;
    private int zzf;
    private int zzg = 1000;
    private S6 zzh;
    private N6 zzi;

    static {
        R6 r6 = new R6();
        zzd = r6;
        MB.k(R6.class, r6);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", W3.f12012t, "zzh", "zzi"});
        }
        if (b3 == 3) {
            return new R6();
        }
        if (b3 == 4) {
            return new Y3(zzd);
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
        synchronized (R6.class) {
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
