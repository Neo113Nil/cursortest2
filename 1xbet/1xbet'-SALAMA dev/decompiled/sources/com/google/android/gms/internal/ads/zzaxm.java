package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzaxm extends zzgxg implements zzgys {
    private static final zzaxm zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzaxm zzaxmVar = new zzaxm();
        zza = zzaxmVar;
        zzgxg.zzbZ(zzaxm.class, zzaxmVar);
    }

    private zzaxm() {
    }

    public static zzaxk zzd() {
        return (zzaxk) zza.zzaZ();
    }

    public static zzaxm zzg() {
        return zza;
    }

    public static zzaxm zzh(zzgvy zzgvyVar) {
        return (zzaxm) zzgxg.zzbm(zza, zzgvyVar);
    }

    public static zzaxm zzi(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzaxm) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzl(zzaxm zzaxmVar, String str) {
        str.getClass();
        zzaxmVar.zzc |= 2;
        zzaxmVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzaxm zzaxmVar, long j) {
        zzaxmVar.zzc |= 8;
        zzaxmVar.zzg = j;
    }

    public static /* synthetic */ void zzn(zzaxm zzaxmVar, long j) {
        zzaxmVar.zzc |= 4;
        zzaxmVar.zzf = j;
    }

    public static /* synthetic */ void zzo(zzaxm zzaxmVar, long j) {
        zzaxmVar.zzc |= 16;
        zzaxmVar.zzh = j;
    }

    public static /* synthetic */ void zzp(zzaxm zzaxmVar, String str) {
        str.getClass();
        zzaxmVar.zzc |= 1;
        zzaxmVar.zzd = str;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzaxm();
        }
        zzaxl zzaxlVar = null;
        if (iOrdinal == 4) {
            return new zzaxk(zzaxlVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzaxm.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
