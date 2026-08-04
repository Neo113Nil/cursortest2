package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfnb extends zzgxg implements zzgys {
    private static final zzfnb zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfmx zzg;

    static {
        zzfnb zzfnbVar = new zzfnb();
        zza = zzfnbVar;
        zzgxg.zzbZ(zzfnb.class, zzfnbVar);
    }

    private zzfnb() {
    }

    public static zzfmy zza() {
        return (zzfmy) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfnb zzfnbVar, String str) {
        str.getClass();
        zzfnbVar.zzc |= 2;
        zzfnbVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfnb zzfnbVar, zzfmx zzfmxVar) {
        zzfmxVar.getClass();
        zzfnbVar.zzg = zzfmxVar;
        zzfnbVar.zzc |= 8;
    }

    public static /* synthetic */ void zzf(zzfnb zzfnbVar, int i7) {
        zzfnbVar.zzd = 1;
        zzfnbVar.zzc = 1 | zzfnbVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfmz.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzfnb();
        }
        zzfna zzfnaVar = null;
        if (iOrdinal == 4) {
            return new zzfmy(zzfnaVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfnb.class) {
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
