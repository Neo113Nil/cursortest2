package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaxj extends zzgxg implements zzgys {
    private static final zzaxj zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzaxm zzd;
    private zzgvy zze;
    private zzgvy zzf;

    static {
        zzaxj zzaxjVar = new zzaxj();
        zza = zzaxjVar;
        zzgxg.zzbZ(zzaxj.class, zzaxjVar);
    }

    private zzaxj() {
        zzgvy zzgvyVar = zzgvy.zzb;
        this.zze = zzgvyVar;
        this.zzf = zzgvyVar;
    }

    public static zzaxj zzb(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzaxj) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public final zzaxm zzc() {
        zzaxm zzaxmVar = this.zzd;
        return zzaxmVar == null ? zzaxm.zzg() : zzaxmVar;
    }

    public final zzgvy zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzaxj();
        }
        zzaxi zzaxiVar = null;
        if (ordinal == 4) {
            return new zzaxh(zzaxiVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzaxj.class) {
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

    public final zzgvy zzf() {
        return this.zze;
    }
}
