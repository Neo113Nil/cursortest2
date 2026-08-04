package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        zzgry zzgryVar;
        int i7 = this.zze;
        if (i7 == 0) {
            zzgryVar = zzgry.UNKNOWN_KEYMATERIAL;
        } else if (i7 == 1) {
            zzgryVar = zzgry.SYMMETRIC;
        } else if (i7 == 2) {
            zzgryVar = zzgry.ASYMMETRIC_PRIVATE;
        } else if (i7 != 3) {
            zzgryVar = i7 != 4 ? null : zzgry.REMOTE;
        } else {
            zzgryVar = zzgry.ASYMMETRIC_PUBLIC;
        }
        return zzgryVar == null ? zzgry.UNRECOGNIZED : zzgryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgsa();
        }
        zzgrz zzgrzVar = null;
        if (iOrdinal == 4) {
            return new zzgrx(zzgrzVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgsa.class) {
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

    public final zzgvy zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
