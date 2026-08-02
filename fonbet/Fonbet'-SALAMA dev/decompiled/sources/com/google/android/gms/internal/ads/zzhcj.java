package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhcj extends zzgxg implements zzgys {
    private static final zzhcj zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzhcj zzhcjVar = new zzhcj();
        zza = zzhcjVar;
        zzgxg.zzbZ(zzhcj.class, zzhcjVar);
    }

    private zzhcj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhci.zza, "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzhcj();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhch(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhcj.class) {
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
