package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class LA extends MB {
    private static final LA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private UB zzd = C1330nC.f14598o;

    static {
        LA la = new LA();
        zza = la;
        MB.k(LA.class, la);
    }

    public static HA w() {
        return (HA) zza.g();
    }

    public static void x(LA la, KA ka) {
        UB ub = la.zzd;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            la.zzd = ub.b(size + size);
        }
        la.zzd.add(ka);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", KA.class});
        }
        if (b3 == 3) {
            return new LA();
        }
        if (b3 == 4) {
            return new HA(zza);
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
        synchronized (LA.class) {
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
}
