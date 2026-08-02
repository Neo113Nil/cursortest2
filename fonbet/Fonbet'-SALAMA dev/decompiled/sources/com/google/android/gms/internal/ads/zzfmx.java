package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfmx extends zzgxg implements zzgys {
    private static final zzfmx zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgxo zzd = zzgxg.zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfmx zzfmxVar = new zzfmx();
        zza = zzfmxVar;
        zzgxg.zzbZ(zzfmx.class, zzfmxVar);
    }

    private zzfmx() {
    }

    public static zzfmv zza() {
        return (zzfmv) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfmx zzfmxVar, String str) {
        str.getClass();
        zzfmxVar.zzc |= 1;
        zzfmxVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfmx zzfmxVar, int i7) {
        zzgxo zzgxoVar = zzfmxVar.zzd;
        if (!zzgxoVar.zzc()) {
            zzfmxVar.zzd = zzgxg.zzbH(zzgxoVar);
        }
        zzfmxVar.zzd.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfmu.zza, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzfmx();
        }
        zzfmw zzfmwVar = null;
        if (ordinal == 4) {
            return new zzfmv(zzfmwVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzfmx.class) {
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
