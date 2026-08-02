package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhcm extends zzgxg implements zzgys {
    private static final zzhcm zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgvy zzf;
    private zzgvy zzg;

    static {
        zzhcm zzhcmVar = new zzhcm();
        zza = zzhcmVar;
        zzgxg.zzbZ(zzhcm.class, zzhcmVar);
    }

    private zzhcm() {
        zzgvy zzgvyVar = zzgvy.zzb;
        this.zzf = zzgvyVar;
        this.zzg = zzgvyVar;
    }

    public static zzhck zzc() {
        return (zzhck) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhcm zzhcmVar, zzgvy zzgvyVar) {
        zzgvyVar.getClass();
        zzhcmVar.zzc |= 4;
        zzhcmVar.zzf = zzgvyVar;
    }

    public static /* synthetic */ void zzg(zzhcm zzhcmVar, String str) {
        zzhcmVar.zzc |= 2;
        zzhcmVar.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhcm zzhcmVar, int i7) {
        zzhcmVar.zzd = 1;
        zzhcmVar.zzc = 1 | zzhcmVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhcl.zza, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzhcm();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhck(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhcm.class) {
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
