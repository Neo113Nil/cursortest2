package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgra extends zzgxg implements zzgys {
    private static final zzgra zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;

    static {
        zzgra zzgraVar = new zzgra();
        zza = zzgraVar;
        zzgxg.zzbZ(zzgra.class, zzgraVar);
    }

    private zzgra() {
    }

    public static zzgqy zzc() {
        return (zzgqy) zza.zzaZ();
    }

    public static zzgra zzf(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgra) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzgra();
        }
        zzgqz zzgqzVar = null;
        if (ordinal == 4) {
            return new zzgqy(zzgqzVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgra.class) {
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
