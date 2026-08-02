package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgsa extends zzgxg implements zzgys {
    private static final zzgsa zza;
    private static volatile zzgyz zzb;
    private String zzc = "";
    private zzgvy zzd = zzgvy.zzb;
    private int zze;

    static {
        zzgsa zzgsaVar = new zzgsa();
        zza = zzgsaVar;
        zzgxg.zzbZ(zzgsa.class, zzgsaVar);
    }

    private zzgsa() {
    }

    public static zzgrx zza() {
        return (zzgrx) zza.zzaZ();
    }

    public static zzgsa zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgsa zzgsaVar, String str) {
        str.getClass();
        zzgsaVar.zzc = str;
    }

    public static /* synthetic */ void zzj(zzgsa zzgsaVar, zzgvy zzgvyVar) {
        zzgvyVar.getClass();
        zzgsaVar.zzd = zzgvyVar;
    }

    public final zzgry zzb() {
        int i7 = this.zze;
        zzgry zzgryVar = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? null : zzgry.REMOTE : zzgry.ASYMMETRIC_PUBLIC : zzgry.ASYMMETRIC_PRIVATE : zzgry.SYMMETRIC : zzgry.UNKNOWN_KEYMATERIAL;
        return zzgryVar == null ? zzgry.UNRECOGNIZED : zzgryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgsa();
        }
        zzgrz zzgrzVar = null;
        if (ordinal == 4) {
            return new zzgrx(zzgrzVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgsa.class) {
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

    public final String zzg() {
        return this.zzc;
    }
}
