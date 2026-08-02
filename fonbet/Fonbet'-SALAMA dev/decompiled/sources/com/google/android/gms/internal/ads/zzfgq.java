package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfgq extends zzgxg implements zzgys {
    private static final zzfgq zza;
    private static volatile zzgyz zzb;
    private String zzc = "";
    private int zzd;

    static {
        zzfgq zzfgqVar = new zzfgq();
        zza = zzfgqVar;
        zzgxg.zzbZ(zzfgq.class, zzfgqVar);
    }

    private zzfgq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzfgq();
        }
        zzfgp zzfgpVar = null;
        if (ordinal == 4) {
            return new zzfgo(zzfgpVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzfgq.class) {
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
