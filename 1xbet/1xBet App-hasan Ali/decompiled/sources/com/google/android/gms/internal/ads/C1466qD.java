package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.qD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1466qD extends MB {
    private static final C1466qD zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private QB zzf = NB.f10781o;
    private UB zzh = C1330nC.f14598o;
    private AbstractC1823yB zzi = AbstractC1823yB.f16414l;

    static {
        C1466qD c1466qD = new C1466qD();
        zza = c1466qD;
        MB.k(C1466qD.class, c1466qD);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", C1376oD.class, "zzi"});
        }
        if (b3 == 3) {
            return new C1466qD();
        }
        if (b3 == 4) {
            return new C1421pD(zza);
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
        synchronized (C1466qD.class) {
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
