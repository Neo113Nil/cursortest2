package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1636u4 extends MB {
    private static final C1636u4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static {
        C1636u4 c1636u4 = new C1636u4();
        zza = c1636u4;
        MB.k(C1636u4.class, c1636u4);
    }

    public static /* synthetic */ void A(C1636u4 c1636u4, long j5) {
        c1636u4.zzc |= 4;
        c1636u4.zzf = j5;
    }

    public static /* synthetic */ void B(C1636u4 c1636u4, long j5) {
        c1636u4.zzc |= 16;
        c1636u4.zzh = j5;
    }

    public static C1591t4 w() {
        return (C1591t4) zza.g();
    }

    public static /* synthetic */ void x(C1636u4 c1636u4) {
        c1636u4.zzc |= 1;
        c1636u4.zzd = "1.671910402";
    }

    public static /* synthetic */ void y(C1636u4 c1636u4, String str) {
        str.getClass();
        c1636u4.zzc |= 2;
        c1636u4.zze = str;
    }

    public static /* synthetic */ void z(C1636u4 c1636u4, String str) {
        str.getClass();
        c1636u4.zzc |= 8;
        c1636u4.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (b3 == 3) {
            return new C1636u4();
        }
        if (b3 == 4) {
            return new C1591t4(zza);
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
        synchronized (C1636u4.class) {
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
