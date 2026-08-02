package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Uz extends MB {
    private static final Uz zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private Yz zze;
    private AbstractC1823yB zzf = AbstractC1823yB.f16414l;

    static {
        Uz uz = new Uz();
        zza = uz;
        MB.k(Uz.class, uz);
    }

    public static /* synthetic */ void C(Uz uz, Yz yz) {
        uz.zze = yz;
        uz.zzc |= 1;
    }

    public static Tz x() {
        return (Tz) zza.g();
    }

    public static Uz y() {
        return zza;
    }

    public final AbstractC1823yB A() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new Uz();
        }
        if (b3 == 4) {
            return new Tz(zza);
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
        synchronized (Uz.class) {
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

    public final Yz z() {
        Yz yz = this.zze;
        return yz == null ? Yz.y() : yz;
    }
}
