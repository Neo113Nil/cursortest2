package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgqi();
        }
        zzgqh zzgqhVar = null;
        if (ordinal == 4) {
            return new zzgqg(zzgqhVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgqi.class) {
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

    public final zzgql zzf() {
        zzgql zzgqlVar = this.zzd;
        return zzgqlVar == null ? zzgql.zzd() : zzgqlVar;
    }
}
