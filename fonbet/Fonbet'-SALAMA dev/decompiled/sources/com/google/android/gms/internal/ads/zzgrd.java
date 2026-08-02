package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgrd extends zzgxg implements zzgys {
    private static final zzgrd zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgvy zzd = zzgvy.zzb;

    static {
        zzgrd zzgrdVar = new zzgrd();
        zza = zzgrdVar;
        zzgxg.zzbZ(zzgrd.class, zzgrdVar);
    }

    private zzgrd() {
    }

    public static zzgrb zzb() {
        return (zzgrb) zza.zzaZ();
    }

    public static zzgrd zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgrd) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzg() {
        return zza.zzbN();
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzgrd();
        }
        zzgrc zzgrcVar = null;
        if (ordinal == 4) {
            return new zzgrb(zzgrcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgrd.class) {
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

    public final zzgvy zzf() {
        return this.zzd;
    }
}
