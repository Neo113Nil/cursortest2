package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpq extends zzgxg implements zzgys {
    private static final zzgpq zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgvy zze = zzgvy.zzb;
    private zzgpw zzf;

    static {
        zzgpq zzgpqVar = new zzgpq();
        zza = zzgpqVar;
        zzgxg.zzbZ(zzgpq.class, zzgpqVar);
    }

    private zzgpq() {
    }

    public static zzgpo zzb() {
        return (zzgpo) zza.zzaZ();
    }

    public static zzgpq zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgpq) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgpq zzgpqVar, zzgpw zzgpwVar) {
        zzgpwVar.getClass();
        zzgpqVar.zzf = zzgpwVar;
        zzgpqVar.zzc |= 1;
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
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzgpq();
        }
        zzgpp zzgppVar = null;
        if (ordinal == 4) {
            return new zzgpo(zzgppVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgpq.class) {
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
        zzgpw zzgpwVar = this.zzf;
        return zzgpwVar == null ? zzgpw.zzd() : zzgpwVar;
    }

    public final zzgvy zzg() {
        return this.zze;
    }
}
