package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpt extends zzgxg implements zzgys {
    private static final zzgpt zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgpw zze;

    static {
        zzgpt zzgptVar = new zzgpt();
        zza = zzgptVar;
        zzgxg.zzbZ(zzgpt.class, zzgptVar);
    }

    private zzgpt() {
    }

    public static zzgpr zzb() {
        return (zzgpr) zza.zzaZ();
    }

    public static zzgpt zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgpt) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzh(zzgpt zzgptVar, zzgpw zzgpwVar) {
        zzgpwVar.getClass();
        zzgptVar.zze = zzgpwVar;
        zzgptVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgpt();
        }
        zzgps zzgpsVar = null;
        if (ordinal == 4) {
            return new zzgpr(zzgpsVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgpt.class) {
                try {
                    zzgyzVar = zzb;
                    if (zzgyzVar == null) {
                        zzgyzVar = new zzgxb(zza);
                        zzb = zzgyzVar;
                    }
                } finally {
                }
            }
        }
        return zzgyzVar;
    }

    public final zzgpw zzf() {
        zzgpw zzgpwVar = this.zze;
        return zzgpwVar == null ? zzgpw.zzd() : zzgpwVar;
    }
}
