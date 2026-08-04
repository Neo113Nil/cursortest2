package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzarx.zza});
        }
        if (iOrdinal == 3) {
            return new zzaru();
        }
        zzatc zzatcVar = null;
        if (iOrdinal == 4) {
            return new zzart(zzatcVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzaru.class) {
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
