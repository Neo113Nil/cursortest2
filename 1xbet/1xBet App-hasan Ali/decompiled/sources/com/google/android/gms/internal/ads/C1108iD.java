package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.iD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108iD extends MB {
    private static final C1108iD zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private WC zzf;
    private YC zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private QB zzi = NB.f10781o;
    private String zzj = "";
    private UB zzl = C1330nC.f14598o;

    static {
        C1108iD c1108iD = new C1108iD();
        zza = c1108iD;
        MB.k(C1108iD.class, c1108iD);
    }

    public static /* synthetic */ void A(C1108iD c1108iD, int i) {
        c1108iD.zzc |= 1;
        c1108iD.zzd = i;
    }

    public static /* synthetic */ void B(C1108iD c1108iD, WC wc) {
        c1108iD.zzf = wc;
        c1108iD.zzc |= 4;
    }

    public static /* synthetic */ void C(C1108iD c1108iD, String str) {
        str.getClass();
        c1108iD.zzc |= 2;
        c1108iD.zze = str;
    }

    public static /* synthetic */ void D(C1108iD c1108iD, int i) {
        c1108iD.zzk = i - 1;
        c1108iD.zzc |= 64;
    }

    public static C1063hD x() {
        return (C1063hD) zza.g();
    }

    public static void z(C1108iD c1108iD, String str) {
        str.getClass();
        UB ub = c1108iD.zzl;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            c1108iD.zzl = ub.b(size + size);
        }
        c1108iD.zzl.add(str);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        switch (AbstractC2462i.b(i)) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                this.zzm = mb == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C1375oC(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C0795bD.f, "zzl"});
            case 3:
                return new C1108iD();
            case 4:
                return new C1063hD(zza);
            case 5:
                return zza;
            case 6:
                InterfaceC1195kC interfaceC1195kC2 = zzb;
                if (interfaceC1195kC2 != null) {
                    return interfaceC1195kC2;
                }
                synchronized (C1108iD.class) {
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
            default:
                throw null;
        }
    }

    public final int w() {
        return this.zzl.size();
    }

    public final String y() {
        return this.zze;
    }
}
