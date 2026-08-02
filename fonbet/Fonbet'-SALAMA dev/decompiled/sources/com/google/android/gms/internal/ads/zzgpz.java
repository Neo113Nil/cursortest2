package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpz extends zzgxg implements zzgys {
    private static final zzgpz zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgqf zze;
    private zzgrq zzf;

    static {
        zzgpz zzgpzVar = new zzgpz();
        zza = zzgpzVar;
        zzgxg.zzbZ(zzgpz.class, zzgpzVar);
    }

    private zzgpz() {
    }

    public static zzgpx zzb() {
        return (zzgpx) zza.zzaZ();
    }

    public static zzgpz zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgpz) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgpz zzgpzVar, zzgqf zzgqfVar) {
        zzgqfVar.getClass();
        zzgpzVar.zze = zzgqfVar;
        zzgpzVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgpz zzgpzVar, zzgrq zzgrqVar) {
        zzgrqVar.getClass();
        zzgpzVar.zzf = zzgrqVar;
        zzgpzVar.zzc |= 2;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzgpz();
        }
        zzgpy zzgpyVar = null;
        if (ordinal == 4) {
            return new zzgpx(zzgpyVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgpz.class) {
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

    public final zzgqf zzf() {
        zzgqf zzgqfVar = this.zze;
        return zzgqfVar == null ? zzgqf.zzd() : zzgqfVar;
    }

    public final zzgrq zzg() {
        zzgrq zzgrqVar = this.zzf;
        return zzgrqVar == null ? zzgrq.zzd() : zzgrqVar;
    }
}
