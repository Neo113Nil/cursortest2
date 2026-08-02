package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.e7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922e7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C0922e7 zzg;
    private static volatile InterfaceC1195kC zzh;
    private int zzi;
    private int zzj = 1000;
    private S6 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        C0922e7 c0922e7 = new C0922e7();
        zzg = c0922e7;
        MB.k(C0922e7.class, c0922e7);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", W3.f12012t, "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (b3 == 3) {
            return new C0922e7();
        }
        if (b3 == 4) {
            return new Y3(zzg);
        }
        if (b3 == 5) {
            return zzg;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzh;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C0922e7.class) {
            try {
                interfaceC1195kC = zzh;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzh = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
