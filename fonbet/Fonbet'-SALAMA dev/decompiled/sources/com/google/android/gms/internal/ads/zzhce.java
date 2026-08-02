package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhce extends zzgxg implements zzgys {
    private static final zzhce zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzhce zzhceVar = new zzhce();
        zza = zzhceVar;
        zzgxg.zzbZ(zzhce.class, zzhceVar);
    }

    private zzhce() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhcd.zza, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzhce();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhcc(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhce.class) {
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
