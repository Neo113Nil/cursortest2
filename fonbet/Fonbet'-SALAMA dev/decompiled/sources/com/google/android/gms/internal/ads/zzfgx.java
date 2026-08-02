package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new zzfgx();
        }
        zzfgw zzfgwVar = null;
        if (ordinal == 4) {
            return new zzfgv(zzfgwVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzfgx.class) {
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
