package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhcx extends zzgxg implements zzgys {
    private static final zzhcx zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private String zzd = "";
    private zzgvy zze = zzgvy.zzb;

    static {
        zzhcx zzhcxVar = new zzhcx();
        zza = zzhcxVar;
        zzgxg.zzbZ(zzhcx.class, zzhcxVar);
    }

    private zzhcx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhcx();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhcw(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhcx.class) {
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
