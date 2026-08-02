package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class VC extends MB {
    private static final VC zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private AbstractC1823yB zzd;
    private AbstractC1823yB zze;
    private AbstractC1823yB zzf;

    static {
        VC vc = new VC();
        zza = vc;
        MB.k(VC.class, vc);
    }

    public VC() {
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        this.zzd = c1733wB;
        this.zze = c1733wB;
        this.zzf = c1733wB;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new VC();
        }
        if (b3 == 4) {
            return new C1504r7(zza);
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
        synchronized (VC.class) {
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
