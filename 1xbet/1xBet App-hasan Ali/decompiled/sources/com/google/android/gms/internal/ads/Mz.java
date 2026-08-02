package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Mz extends MB {
    private static final Mz zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private Oz zze;

    static {
        Mz mz = new Mz();
        zza = mz;
        MB.k(Mz.class, mz);
    }

    public static /* synthetic */ void B(Mz mz, Oz oz) {
        mz.zze = oz;
        mz.zzc |= 1;
    }

    public static Lz x() {
        return (Lz) zza.g();
    }

    public static Mz y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (Mz) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new Mz();
        }
        if (b3 == 4) {
            return new Lz(zza);
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
        synchronized (Mz.class) {
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
        return this.zzd;
    }

    public final Oz z() {
        Oz oz = this.zze;
        return oz == null ? Oz.y() : oz;
    }
}
