package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370o7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C1370o7 zzg;
    private static volatile InterfaceC1195kC zzh;
    private int zzi;
    private int zzj;
    private N6 zzk;
    private N6 zzl;
    private N6 zzm;
    private UB zzn = C1330nC.f14598o;
    private int zzo;

    static {
        C1370o7 c1370o7 = new C1370o7();
        zzg = c1370o7;
        MB.k(C1370o7.class, c1370o7);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", N6.class, "zzo"});
        }
        if (b3 == 3) {
            return new C1370o7();
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
        synchronized (C1370o7.class) {
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
