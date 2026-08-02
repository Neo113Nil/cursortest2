package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.n4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1322n4 extends MB {
    private static final C1322n4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        C1322n4 c1322n4 = new C1322n4();
        zza = c1322n4;
        MB.k(C1322n4.class, c1322n4);
    }

    public static /* synthetic */ void A(C1322n4 c1322n4, long j5) {
        c1322n4.zzc |= 8;
        c1322n4.zzg = j5;
    }

    public static /* synthetic */ void B(C1322n4 c1322n4, long j5) {
        c1322n4.zzc |= 16;
        c1322n4.zzh = j5;
    }

    public static C1277m4 w() {
        return (C1277m4) zza.g();
    }

    public static /* synthetic */ void x(C1322n4 c1322n4, long j5) {
        c1322n4.zzc |= 32;
        c1322n4.zzi = j5;
    }

    public static /* synthetic */ void y(C1322n4 c1322n4, long j5) {
        c1322n4.zzc |= 4;
        c1322n4.zzf = j5;
    }

    public static /* synthetic */ void z(C1322n4 c1322n4, long j5) {
        c1322n4.zzc |= 1;
        c1322n4.zzd = j5;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (b3 == 3) {
            return new C1322n4();
        }
        if (b3 == 4) {
            return new C1277m4(zza);
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
        synchronized (C1322n4.class) {
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
