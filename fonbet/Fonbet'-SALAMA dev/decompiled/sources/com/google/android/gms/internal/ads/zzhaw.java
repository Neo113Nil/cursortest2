package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhav.zza, "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzhaw();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhau(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhaw.class) {
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
