package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.kD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1196kD extends MB {
    private static final C1196kD zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C1196kD c1196kD = new C1196kD();
        zza = c1196kD;
        MB.k(C1196kD.class, c1196kD);
    }

    public static C1151jD w() {
        return (C1151jD) zza.g();
    }

    public static /* synthetic */ void x(C1196kD c1196kD, String str) {
        c1196kD.zzc |= 1;
        c1196kD.zzd = str;
    }

    public static /* synthetic */ void y(C1196kD c1196kD, long j5) {
        c1196kD.zzc |= 2;
        c1196kD.zze = j5;
    }

    public static /* synthetic */ void z(C1196kD c1196kD, boolean z3) {
        c1196kD.zzc |= 4;
        c1196kD.zzf = z3;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C0795bD.f12784g, "zzh", "zzi", "zzj", "zzk"});
        }
        if (b3 == 3) {
            return new C1196kD();
        }
        if (b3 == 4) {
            return new C1151jD(zza);
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
        synchronized (C1196kD.class) {
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
