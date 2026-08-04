package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhbv extends zzgxg implements zzgys {
    private static final zzhbv zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgvy zze;
    private zzgvy zzf;

    static {
        zzhbv zzhbvVar = new zzhbv();
        zza = zzhbvVar;
        zzgxg.zzbZ(zzhbv.class, zzhbvVar);
    }

    private zzhbv() {
        zzgvy zzgvyVar = zzgvy.zzb;
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
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhbv();
        }
        zzhdm zzhdmVar = null;
        if (iOrdinal == 4) {
            return new zzhbu(zzhdmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhbv.class) {
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
