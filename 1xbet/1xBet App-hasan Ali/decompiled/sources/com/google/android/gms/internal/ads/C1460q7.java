package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.q7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460q7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C1460q7 zzi;
    private static volatile InterfaceC1195kC zzj;
    private int zzk;
    private N6 zzm;
    private int zzn;
    private P6 zzo;
    private int zzp;
    private String zzl = "";
    private int zzu = 1000;
    private int zzv = 1000;
    private int zzw = 1000;

    static {
        C1460q7 c1460q7 = new C1460q7();
        zzi = c1460q7;
        MB.k(C1460q7.class, c1460q7);
    }

    public static void w(C1460q7 c1460q7, String str) {
        c1460q7.getClass();
        c1460q7.zzk |= 1;
        c1460q7.zzl = str;
    }

    public static void x(C1460q7 c1460q7, P6 p6) {
        c1460q7.getClass();
        c1460q7.zzo = p6;
        c1460q7.zzk |= 8;
    }

    public static C1460q7 y() {
        return zzi;
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
            return new C1375oC(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", w32, "zzv", w32, "zzw", w32});
        }
        if (b3 == 3) {
            return new C1460q7();
        }
        if (b3 == 4) {
            return new C1415p7(zzi);
        }
        if (b3 == 5) {
            return zzi;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzj;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C1460q7.class) {
            try {
                interfaceC1195kC = zzj;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzj = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
