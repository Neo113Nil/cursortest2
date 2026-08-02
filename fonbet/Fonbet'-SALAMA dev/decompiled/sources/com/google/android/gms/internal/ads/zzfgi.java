package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfgi extends zzgxg implements zzgys {
    private static final zzfgi zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzfgf zzd;

    static {
        zzfgi zzfgiVar = new zzfgi();
        zza = zzfgiVar;
        zzgxg.zzbZ(zzfgi.class, zzfgiVar);
    }

    private zzfgi() {
    }

    public static zzfgh zza() {
        return (zzfgh) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfgi zzfgiVar, zzfgf zzfgfVar) {
        zzfgfVar.getClass();
        zzfgiVar.zzd = zzfgfVar;
        zzfgiVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzfgi();
        }
        zzfgj zzfgjVar = null;
        if (ordinal == 4) {
            return new zzfgh(zzfgjVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzfgi.class) {
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
