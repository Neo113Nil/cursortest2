package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhap extends zzgxg implements zzgys {
    private static final zzhap zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzhap zzhapVar = new zzhap();
        zza = zzhapVar;
        zzgxg.zzbZ(zzhap.class, zzhapVar);
    }

    private zzhap() {
    }

    public static zzhao zzc() {
        return (zzhao) zza.zzaZ();
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhap();
        }
        zzhas zzhasVar = null;
        if (ordinal == 4) {
            return new zzhao(zzhasVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhap.class) {
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
