package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgqi extends zzgxg implements zzgys {
    private static final zzgqi zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgql zzd;
    private int zze;

    static {
        zzgqi zzgqiVar = new zzgqi();
        zza = zzgqiVar;
        zzgxg.zzbZ(zzgqi.class, zzgqiVar);
    }

    private zzgqi() {
    }

    public static zzgqg zzb() {
        return (zzgqg) zza.zzaZ();
    }

    public static zzgqi zzd() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgqi zzgqiVar, zzgql zzgqlVar) {
        zzgqlVar.getClass();
        zzgqiVar.zzd = zzgqlVar;
        zzgqiVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgqi();
        }
        zzgqh zzgqhVar = null;
        if (iOrdinal == 4) {
            return new zzgqg(zzgqhVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgqi.class) {
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

    public final zzgql zzf() {
        zzgql zzgqlVar = this.zzd;
        return zzgqlVar == null ? zzgql.zzd() : zzgqlVar;
    }
}
