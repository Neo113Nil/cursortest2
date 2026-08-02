package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaru extends zzgxg implements zzgys {
    private static final zzaru zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;

    static {
        zzaru zzaruVar = new zzaru();
        zza = zzaruVar;
        zzgxg.zzbZ(zzaru.class, zzaruVar);
    }

    private zzaru() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzarx.zza});
        }
        if (ordinal == 3) {
            return new zzaru();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzart(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzaru.class) {
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
