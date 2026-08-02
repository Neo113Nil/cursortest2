package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class SC extends MB {
    private static final SC zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private AbstractC1823yB zzd;
    private AbstractC1823yB zze;
    private byte zzf = 2;

    static {
        SC sc = new SC();
        zza = sc;
        MB.k(SC.class, sc);
    }

    public SC() {
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        this.zzd = c1733wB;
        this.zze = c1733wB;
    }

    public static RC w() {
        return (RC) zza.g();
    }

    public static /* synthetic */ void x(SC sc, C1733wB c1733wB) {
        sc.zzc |= 1;
        sc.zzd = c1733wB;
    }

    public static /* synthetic */ void y(SC sc, C1733wB c1733wB) {
        sc.zzc |= 2;
        sc.zze = c1733wB;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        switch (AbstractC2462i.b(i)) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = mb == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C1375oC(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new SC();
            case 4:
                return new RC(zza);
            case 5:
                return zza;
            case 6:
                InterfaceC1195kC interfaceC1195kC2 = zzb;
                if (interfaceC1195kC2 != null) {
                    return interfaceC1195kC2;
                }
                synchronized (SC.class) {
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
