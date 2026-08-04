package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfhm extends zzgxg implements zzgys {
    private static final zzfhm zza;
    private static volatile zzgyz zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzfhm zzfhmVar = new zzfhm();
        zza = zzfhmVar;
        zzgxg.zzbZ(zzfhm.class, zzfhmVar);
    }

    private zzfhm() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzfhm();
        }
        zzfhl zzfhlVar = null;
        if (iOrdinal == 4) {
            return new zzfhk(zzfhlVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfhm.class) {
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
