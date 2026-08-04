package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfgn extends zzgxg implements zzgys {
    private static final zzfgn zza;
    private static volatile zzgyz zzb;
    private String zzc = "";

    static {
        zzfgn zzfgnVar = new zzfgn();
        zza = zzfgnVar;
        zzgxg.zzbZ(zzfgn.class, zzfgnVar);
    }

    private zzfgn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfgn();
        }
        zzfgm zzfgmVar = null;
        if (iOrdinal == 4) {
            return new zzfgl(zzfgmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfgn.class) {
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
