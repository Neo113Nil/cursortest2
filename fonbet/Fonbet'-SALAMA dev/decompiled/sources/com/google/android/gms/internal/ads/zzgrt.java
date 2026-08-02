package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgrt extends zzgxg implements zzgys {
    private static final zzgrt zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgrw zzd;
    private int zze;
    private int zzf;

    static {
        zzgrt zzgrtVar = new zzgrt();
        zza = zzgrtVar;
        zzgxg.zzbZ(zzgrt.class, zzgrtVar);
    }

    private zzgrt() {
    }

    public static zzgrr zzc() {
        return (zzgrr) zza.zzaZ();
    }

    public static zzgrt zzf() {
        return zza;
    }

    public static zzgrt zzg(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgrt) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzj(zzgrt zzgrtVar, zzgrw zzgrwVar) {
        zzgrwVar.getClass();
        zzgrtVar.zzd = zzgrwVar;
        zzgrtVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzgrt();
        }
        zzgrs zzgrsVar = null;
        if (ordinal == 4) {
            return new zzgrr(zzgrsVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgrt.class) {
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

    public final zzgrw zzh() {
        zzgrw zzgrwVar = this.zzd;
        return zzgrwVar == null ? zzgrw.zzf() : zzgrwVar;
    }
}
