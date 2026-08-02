package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class T6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final T6 zze;
    private static volatile InterfaceC1195kC zzf;
    private int zzg;
    private P6 zzh;
    private int zzi = 1000;
    private S6 zzj;
    private N6 zzk;

    static {
        T6 t6 = new T6();
        zze = t6;
        MB.k(T6.class, t6);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", W3.f12012t, "zzj", "zzk"});
        }
        if (b3 == 3) {
            return new T6();
        }
        if (b3 == 4) {
            return new Y3(zze);
        }
        if (b3 == 5) {
            return zze;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzf;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (T6.class) {
            try {
                interfaceC1195kC = zzf;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzf = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
