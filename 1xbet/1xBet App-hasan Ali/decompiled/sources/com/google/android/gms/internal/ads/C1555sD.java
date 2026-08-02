package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.sD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1555sD extends MB {
    private static final C1555sD zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private UB zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    private UB zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;

    static {
        C1555sD c1555sD = new C1555sD();
        zza = c1555sD;
        MB.k(C1555sD.class, c1555sD);
    }

    public C1555sD() {
        C1330nC c1330nC = C1330nC.f14598o;
        this.zzg = c1330nC;
        this.zzh = "";
        this.zzi = "";
        this.zzl = c1330nC;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", C0795bD.f12787k, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C1510rD.class, "zze", "zzm", C0795bD.f12786j, "zzn", "zzo", "zzp", "zzu"});
        }
        if (b3 == 3) {
            return new C1555sD();
        }
        if (b3 == 4) {
            return new C1421pD(zza);
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
        synchronized (C1555sD.class) {
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
