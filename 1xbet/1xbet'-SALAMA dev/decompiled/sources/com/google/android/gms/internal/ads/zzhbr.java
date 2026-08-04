package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhbr extends zzgxg implements zzgys {
    private static final zzhbr zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgvy zzd;
    private zzgvy zze;
    private zzgvy zzf;

    static {
        zzhbr zzhbrVar = new zzhbr();
        zza = zzhbrVar;
        zzgxg.zzbZ(zzhbr.class, zzhbrVar);
    }

    private zzhbr() {
        zzgvy zzgvyVar = zzgvy.zzb;
        this.zzd = zzgvyVar;
        this.zze = zzgvyVar;
        this.zzf = zzgvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhbr();
        }
        zzhdm zzhdmVar = null;
        if (iOrdinal == 4) {
            return new zzhbq(zzhdmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhbr.class) {
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
