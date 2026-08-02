package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Qz extends MB {
    private static final Qz zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private Uz zze;
    private C1597tA zzf;

    static {
        Qz qz = new Qz();
        zza = qz;
        MB.k(Qz.class, qz);
    }

    public static InterfaceC1195kC B() {
        return zza.h();
    }

    public static /* synthetic */ void C(Qz qz, Uz uz) {
        qz.zze = uz;
        qz.zzc |= 1;
    }

    public static /* synthetic */ void D(Qz qz, C1597tA c1597tA) {
        qz.zzf = c1597tA;
        qz.zzc |= 2;
    }

    public static Pz x() {
        return (Pz) zza.g();
    }

    public static Qz y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (Qz) MB.o(zza, abstractC1823yB, gb);
    }

    public final C1597tA A() {
        C1597tA c1597tA = this.zzf;
        return c1597tA == null ? C1597tA.y() : c1597tA;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new Qz();
        }
        if (b3 == 4) {
            return new Pz(zza);
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
        synchronized (Qz.class) {
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

    public final Uz z() {
        Uz uz = this.zze;
        return uz == null ? Uz.y() : uz;
    }
}
