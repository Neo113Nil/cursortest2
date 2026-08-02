package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class J6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final J6 zzl;
    private static volatile InterfaceC1195kC zzm;
    private int zzA;
    private int zzB;
    private K6 zzC;
    private int zzn;
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        J6 j6 = new J6();
        zzl = j6;
        MB.k(J6.class, j6);
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
            return new C1375oC(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", w32, "zzp", w32, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (b3 == 3) {
            return new J6();
        }
        if (b3 == 4) {
            return new Y3(zzl);
        }
        if (b3 == 5) {
            return zzl;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzm;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (J6.class) {
            try {
                interfaceC1195kC = zzm;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzm = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
