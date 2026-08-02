package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.gD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018gD extends MB {
    private static final C1018gD zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private AbstractC1823yB zzf;
    private AbstractC1823yB zzg;

    static {
        C1018gD c1018gD = new C1018gD();
        zza = c1018gD;
        MB.k(C1018gD.class, c1018gD);
    }

    public C1018gD() {
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        this.zzf = c1733wB;
        this.zzg = c1733wB;
    }

    public static C0973fD w() {
        return (C0973fD) zza.g();
    }

    public static /* synthetic */ void x(C1018gD c1018gD, AbstractC1823yB abstractC1823yB) {
        abstractC1823yB.getClass();
        c1018gD.zzc |= 4;
        c1018gD.zzf = abstractC1823yB;
    }

    public static /* synthetic */ void y(C1018gD c1018gD) {
        c1018gD.zzc |= 2;
        c1018gD.zze = "image/png";
    }

    public static /* synthetic */ void z(C1018gD c1018gD) {
        c1018gD.zzd = 1;
        c1018gD.zzc = 1 | c1018gD.zzc;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", C0795bD.f12782d, "zze", "zzf", "zzg"});
        }
        if (b3 == 3) {
            return new C1018gD();
        }
        if (b3 == 4) {
            return new C0973fD(zza);
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
        synchronized (C1018gD.class) {
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
