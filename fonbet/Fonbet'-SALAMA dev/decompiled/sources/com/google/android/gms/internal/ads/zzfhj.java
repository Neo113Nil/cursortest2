package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfhj extends zzgxg implements zzgys {
    private static final zzfhj zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzfhj zzfhjVar = new zzfhj();
        zza = zzfhjVar;
        zzgxg.zzbZ(zzfhj.class, zzfhjVar);
    }

    private zzfhj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzfhj();
        }
        zzfhi zzfhiVar = null;
        if (ordinal == 4) {
            return new zzfhh(zzfhiVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzfhj.class) {
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
