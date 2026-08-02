package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhbm extends zzgxg implements zzgys {
    private static final zzhbm zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    static {
        zzhbm zzhbmVar = new zzhbm();
        zza = zzhbmVar;
        zzgxg.zzbZ(zzhbm.class, zzhbmVar);
    }

    private zzhbm() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhbl.zza, "zze", zzhbj.zza, "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzhbm();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhbk(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhbm.class) {
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
