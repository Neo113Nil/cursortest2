package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhca extends zzgxg implements zzgys {
    private static final zzhca zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhca zzhcaVar = new zzhca();
        zza = zzhcaVar;
        zzgxg.zzbZ(zzhca.class, zzhcaVar);
    }

    private zzhca() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzgxm zzgxmVar = zzhby.zza;
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzgxmVar, "zze", "zzf", zzgxmVar});
        }
        if (ordinal == 3) {
            return new zzhca();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhbz(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhca.class) {
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
