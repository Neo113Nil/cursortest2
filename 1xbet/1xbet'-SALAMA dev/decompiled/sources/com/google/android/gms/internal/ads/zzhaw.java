package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhaw extends zzgxg implements zzgys {
    private static final zzhaw zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgvy zzf = zzgvy.zzb;

    static {
        zzhaw zzhawVar = new zzhaw();
        zza = zzhawVar;
        zzgxg.zzbZ(zzhaw.class, zzhawVar);
    }

    private zzhaw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhav.zza, "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhaw();
        }
        zzhdm zzhdmVar = null;
        if (iOrdinal == 4) {
            return new zzhau(zzhdmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhaw.class) {
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
