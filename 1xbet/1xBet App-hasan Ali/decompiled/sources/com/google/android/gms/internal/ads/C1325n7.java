package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325n7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C1325n7 zzf;
    private static volatile InterfaceC1195kC zzg;
    private int zzh;
    private String zzi = "";
    private UB zzj = C1330nC.f14598o;
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        C1325n7 c1325n7 = new C1325n7();
        zzf = c1325n7;
        MB.k(C1325n7.class, c1325n7);
    }

    public static void w(C1325n7 c1325n7, String str) {
        c1325n7.getClass();
        str.getClass();
        c1325n7.zzh |= 1;
        c1325n7.zzi = str;
    }

    public static C1325n7 x() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            W3 w32 = W3.f12012t;
            return new C1375oC(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", C1190k7.class, "zzk", w32, "zzl", w32, "zzm", w32});
        }
        if (b3 == 3) {
            return new C1325n7();
        }
        if (b3 == 4) {
            return new C1280m7(zzf);
        }
        if (b3 == 5) {
            return zzf;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzg;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C1325n7.class) {
            try {
                interfaceC1195kC = zzg;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzg = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
