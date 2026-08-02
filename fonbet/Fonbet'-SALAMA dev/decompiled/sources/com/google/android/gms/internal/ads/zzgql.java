package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgql extends zzgxg implements zzgys {
    private static final zzgql zza;
    private static volatile zzgyz zzb;
    private int zzc;

    static {
        zzgql zzgqlVar = new zzgql();
        zza = zzgqlVar;
        zzgxg.zzbZ(zzgql.class, zzgqlVar);
    }

    private zzgql() {
    }

    public static zzgqj zzb() {
        return (zzgqj) zza.zzaZ();
    }

    public static zzgql zzd() {
        return zza;
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
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new zzgql();
        }
        zzgqk zzgqkVar = null;
        if (ordinal == 4) {
            return new zzgqj(zzgqkVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgql.class) {
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
