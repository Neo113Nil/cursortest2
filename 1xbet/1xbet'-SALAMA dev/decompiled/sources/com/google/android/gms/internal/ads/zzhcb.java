package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhby.zza, "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhcb();
        }
        zzhdm zzhdmVar = null;
        if (iOrdinal == 4) {
            return new zzhbx(zzhdmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhcb.class) {
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
