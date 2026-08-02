package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgqu extends zzgxg implements zzgys {
    private static final zzgqu zza;
    private static volatile zzgyz zzb;
    private int zzc;

    static {
        zzgqu zzgquVar = new zzgqu();
        zza = zzgquVar;
        zzgxg.zzbZ(zzgqu.class, zzgquVar);
    }

    private zzgqu() {
    }

    public static zzgqs zzb() {
        return (zzgqs) zza.zzaZ();
    }

    public static zzgqu zzd() {
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
            return new zzgqu();
        }
        zzgqt zzgqtVar = null;
        if (ordinal == 4) {
            return new zzgqs(zzgqtVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgqu.class) {
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
