package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Sz extends MB {
    private static final Sz zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private Wz zzd;
    private C1687vA zze;

    static {
        Sz sz = new Sz();
        zza = sz;
        MB.k(Sz.class, sz);
    }

    public static /* synthetic */ void A(Sz sz, Wz wz) {
        sz.zzd = wz;
        sz.zzc |= 1;
    }

    public static /* synthetic */ void B(Sz sz, C1687vA c1687vA) {
        sz.zze = c1687vA;
        sz.zzc |= 2;
    }

    public static Rz w() {
        return (Rz) zza.g();
    }

    public static Sz x(AbstractC1823yB abstractC1823yB, GB gb) {
        return (Sz) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new Sz();
        }
        if (b3 == 4) {
            return new Rz(zza);
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
        synchronized (Sz.class) {
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

    public final Wz y() {
        Wz wz = this.zzd;
        return wz == null ? Wz.y() : wz;
    }

    public final C1687vA z() {
        C1687vA c1687vA = this.zze;
        return c1687vA == null ? C1687vA.z() : c1687vA;
    }
}
