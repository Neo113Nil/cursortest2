package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgrw extends zzgxg implements zzgys {
    private static final zzgrw zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;

    static {
        zzgrw zzgrwVar = new zzgrw();
        zza = zzgrwVar;
        zzgxg.zzbZ(zzgrw.class, zzgrwVar);
    }

    private zzgrw() {
    }

    public static zzgru zzc() {
        return (zzgru) zza.zzaZ();
    }

    public static zzgrw zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgrn zzb() {
        zzgrn zzgrnVar;
        int i7 = this.zzc;
        if (i7 == 0) {
            zzgrnVar = zzgrn.UNKNOWN_HASH;
        } else if (i7 == 1) {
            zzgrnVar = zzgrn.SHA1;
        } else if (i7 == 2) {
            zzgrnVar = zzgrn.SHA384;
        } else if (i7 == 3) {
            zzgrnVar = zzgrn.SHA256;
        } else if (i7 != 4) {
            zzgrnVar = i7 != 5 ? null : zzgrn.SHA224;
        } else {
            zzgrnVar = zzgrn.SHA512;
        }
        return zzgrnVar == null ? zzgrn.UNRECOGNIZED : zzgrnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzgrw();
        }
        zzgrv zzgrvVar = null;
        if (iOrdinal == 4) {
            return new zzgru(zzgrvVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgrw.class) {
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
