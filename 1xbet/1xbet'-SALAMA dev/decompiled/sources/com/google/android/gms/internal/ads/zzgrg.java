package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgrg extends zzgxg implements zzgys {
    private static final zzgrg zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;

    static {
        zzgrg zzgrgVar = new zzgrg();
        zza = zzgrgVar;
        zzgxg.zzbZ(zzgrg.class, zzgrgVar);
    }

    private zzgrg() {
    }

    public static zzgre zzc() {
        return (zzgre) zza.zzaZ();
    }

    public static zzgrg zzf(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgrg) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgrg();
        }
        zzgrf zzgrfVar = null;
        if (iOrdinal == 4) {
            return new zzgre(zzgrfVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgrg.class) {
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
