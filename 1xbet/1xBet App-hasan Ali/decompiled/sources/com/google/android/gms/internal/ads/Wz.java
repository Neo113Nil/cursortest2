package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Wz extends MB {
    private static final Wz zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private Yz zzd;
    private int zze;

    static {
        Wz wz = new Wz();
        zza = wz;
        MB.k(Wz.class, wz);
    }

    public static /* synthetic */ void B(Wz wz, Yz yz) {
        wz.zzd = yz;
        wz.zzc |= 1;
    }

    public static Vz x() {
        return (Vz) zza.g();
    }

    public static Wz y() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new Wz();
        }
        if (b3 == 4) {
            return new Vz(zza);
        }
        if (b3 == 5) {
            return zza;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzb;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (Wz.class) {
            try {
                interfaceC1195kC = zzb;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzb = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }

    public final int w() {
        return this.zze;
    }

    public final Yz z() {
        Yz yz = this.zzd;
        return yz == null ? Yz.y() : yz;
    }
}
