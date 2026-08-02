package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int i7 = this.zzc;
        zzgrn zzgrnVar = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? null : zzgrn.SHA224 : zzgrn.SHA512 : zzgrn.SHA256 : zzgrn.SHA384 : zzgrn.SHA1 : zzgrn.UNKNOWN_HASH;
        return zzgrnVar == null ? zzgrn.UNRECOGNIZED : zzgrnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzgrw();
        }
        zzgrv zzgrvVar = null;
        if (ordinal == 4) {
            return new zzgru(zzgrvVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgrw.class) {
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
