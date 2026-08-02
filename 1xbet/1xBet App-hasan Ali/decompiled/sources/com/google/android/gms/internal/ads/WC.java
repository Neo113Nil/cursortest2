package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class WC extends MB {
    private static final WC zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private VC zzd;
    private AbstractC1823yB zzf;
    private AbstractC1823yB zzg;
    private int zzh;
    private byte zzi = 2;
    private UB zze = C1330nC.f14598o;

    static {
        WC wc = new WC();
        zza = wc;
        MB.k(WC.class, wc);
    }

    public WC() {
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        this.zzf = c1733wB;
        this.zzg = c1733wB;
    }

    public static UC w() {
        return (UC) zza.g();
    }

    public static void x(WC wc, SC sc) {
        UB ub = wc.zze;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            wc.zze = ub.b(size + size);
        }
        wc.zze.add(sc);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        switch (AbstractC2462i.b(i)) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                this.zzi = mb == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C1375oC(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", SC.class, "zzf", "zzg", "zzh"});
            case 3:
                return new WC();
            case 4:
                return new UC(zza);
            case 5:
                return zza;
            case 6:
                InterfaceC1195kC interfaceC1195kC2 = zzb;
                if (interfaceC1195kC2 != null) {
                    return interfaceC1195kC2;
                }
                synchronized (WC.class) {
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
            default:
                throw null;
        }
    }
}
