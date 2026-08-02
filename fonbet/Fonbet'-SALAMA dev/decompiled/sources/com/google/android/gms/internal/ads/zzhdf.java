package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhdf extends zzgxg implements zzgys {
    private static final zzhdf zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgxo zzf = zzgxg.zzbG();
    private zzgxs zzh = zzgxg.zzbK();
    private zzgvy zzi = zzgvy.zzb;

    static {
        zzhdf zzhdfVar = new zzhdf();
        zza = zzhdfVar;
        zzgxg.zzbZ(zzhdf.class, zzhdfVar);
    }

    private zzhdf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhdd.class, "zzi"});
        }
        if (ordinal == 3) {
            return new zzhdf();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhde(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhdf.class) {
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
}
