package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class YC extends MB {
    private static final YC zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private XC zzd;
    private AbstractC1823yB zzf;
    private AbstractC1823yB zzg;
    private int zzh;
    private AbstractC1823yB zzi;
    private byte zzj = 2;
    private UB zze = C1330nC.f14598o;

    static {
        YC yc = new YC();
        zza = yc;
        MB.k(YC.class, yc);
    }

    public YC() {
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        this.zzf = c1733wB;
        this.zzg = c1733wB;
        this.zzi = c1733wB;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        switch (AbstractC2462i.b(i)) {
            case 0:
                return Byte.valueOf(this.zzj);
            case 1:
                this.zzj = mb == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C1375oC(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", SC.class, "zzf", "zzg", "zzh", "zzi"});
            case 3:
                return new YC();
            case 4:
                return new C1504r7(zza);
            case 5:
                return zza;
            case 6:
                InterfaceC1195kC interfaceC1195kC2 = zzb;
                if (interfaceC1195kC2 != null) {
                    return interfaceC1195kC2;
                }
                synchronized (YC.class) {
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
