package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new zzfgn();
        }
        zzfgm zzfgmVar = null;
        if (ordinal == 4) {
            return new zzfgl(zzfgmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzfgn.class) {
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
