package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833c7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C0833c7 zzf;
    private static volatile InterfaceC1195kC zzg;
    private int zzh;
    private int zzi = 1000;
    private S6 zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        C0833c7 c0833c7 = new C0833c7();
        zzf = c0833c7;
        MB.k(C0833c7.class, c0833c7);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", W3.f12012t, "zzj", "zzk", "zzl", "zzm"});
        }
        if (b3 == 3) {
            return new C0833c7();
        }
        if (b3 == 4) {
            return new Y3(zzf);
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
        synchronized (C0833c7.class) {
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
