package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzfgq();
        }
        zzfgp zzfgpVar = null;
        if (iOrdinal == 4) {
            return new zzfgo(zzfgpVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfgq.class) {
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
