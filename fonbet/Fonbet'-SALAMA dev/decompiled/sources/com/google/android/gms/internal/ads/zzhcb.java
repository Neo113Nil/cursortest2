package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzhcb extends zzgxg implements zzgys {
    private static final zzhcb zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzhca zze;
    private zzhca zzf;

    static {
        zzhcb zzhcbVar = new zzhcb();
        zza = zzhcbVar;
        zzgxg.zzbZ(zzhcb.class, zzhcbVar);
    }

    private zzhcb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhby.zza, "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzhcb();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhbx(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhcb.class) {
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
