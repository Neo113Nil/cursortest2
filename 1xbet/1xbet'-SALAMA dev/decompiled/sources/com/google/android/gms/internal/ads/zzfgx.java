package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfgx extends zzgxg implements zzgys {
    private static final zzfgx zza;
    private static volatile zzgyz zzb;
    private boolean zzc;

    static {
        zzfgx zzfgxVar = new zzfgx();
        zza = zzfgxVar;
        zzgxg.zzbZ(zzfgx.class, zzfgxVar);
    }

    private zzfgx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfgx();
        }
        zzfgw zzfgwVar = null;
        if (iOrdinal == 4) {
            return new zzfgv(zzfgwVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfgx.class) {
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
