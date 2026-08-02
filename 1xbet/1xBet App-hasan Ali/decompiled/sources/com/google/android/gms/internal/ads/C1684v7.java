package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1684v7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1684v7 zze;
    private static volatile InterfaceC1195kC zzf;
    private int zzg;
    private int zzi;
    private N6 zzk;
    private String zzh = "";
    private QB zzj = NB.f10781o;

    static {
        C1684v7 c1684v7 = new C1684v7();
        zze = c1684v7;
        MB.k(C1684v7.class, c1684v7);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", W3.f12012t, "zzj", "zzk"});
        }
        if (b3 == 3) {
            return new C1684v7();
        }
        if (b3 == 4) {
            return new C1504r7(zze);
        }
        if (b3 == 5) {
            return zze;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzf;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C1684v7.class) {
            try {
                interfaceC1195kC = zzf;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzf = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
