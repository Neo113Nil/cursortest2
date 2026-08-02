package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Kz extends MB {
    private static final Kz zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private AbstractC1823yB zze = AbstractC1823yB.f16414l;
    private Oz zzf;

    static {
        Kz kz = new Kz();
        zza = kz;
        MB.k(Kz.class, kz);
    }

    public static InterfaceC1195kC B() {
        return zza.h();
    }

    public static /* synthetic */ void D(Kz kz, Oz oz) {
        kz.zzf = oz;
        kz.zzc |= 1;
    }

    public static Jz x() {
        return (Jz) zza.g();
    }

    public static Kz y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (Kz) MB.o(zza, abstractC1823yB, gb);
    }

    public final AbstractC1823yB A() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new Kz();
        }
        if (b3 == 4) {
            return new Jz(zza);
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
        synchronized (Kz.class) {
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
        Oz oz = this.zzf;
        return oz == null ? Oz.y() : oz;
    }
}
