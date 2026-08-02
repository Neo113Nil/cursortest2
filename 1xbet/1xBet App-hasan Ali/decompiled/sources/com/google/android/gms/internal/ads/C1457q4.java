package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.q4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1457q4 extends MB {
    private static final C1457q4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private QB zzg = NB.f10781o;
    private long zzh;

    static {
        C1457q4 c1457q4 = new C1457q4();
        zza = c1457q4;
        MB.k(C1457q4.class, c1457q4);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (b3 == 3) {
            return new C1457q4();
        }
        if (b3 == 4) {
            return new Y3(zza);
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
        synchronized (C1457q4.class) {
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
