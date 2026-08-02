package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzhbv();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhbu(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhbv.class) {
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
