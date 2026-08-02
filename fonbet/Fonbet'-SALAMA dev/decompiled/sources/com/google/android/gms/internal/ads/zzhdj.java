package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhdj extends zzgxg implements zzgys {
    private static final zzhdj zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhdj zzhdjVar = new zzhdj();
        zza = zzhdjVar;
        zzgxg.zzbZ(zzhdj.class, zzhdjVar);
    }

    private zzhdj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhdj();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhdi(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhdj.class) {
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
