package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfmu.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzfmx();
        }
        zzfmw zzfmwVar = null;
        if (iOrdinal == 4) {
            return new zzfmv(zzfmwVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfmx.class) {
                try {
                    zzgxbVar = zzb;
                    if (zzgxbVar == null) {
                        zzgxbVar = new zzgxb(zza);
                        zzb = zzgxbVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxbVar;
    }
}
