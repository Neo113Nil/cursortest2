package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhct extends zzgxg implements zzgys {
    private static final zzhct zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhct zzhctVar = new zzhct();
        zza = zzhctVar;
        zzgxg.zzbZ(zzhct.class, zzhctVar);
    }

    private zzhct() {
    }

    public static zzhcs zzc() {
        return (zzhcs) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhct zzhctVar, String str) {
        zzhctVar.zzc |= 1;
        zzhctVar.zzd = str;
    }

    public static /* synthetic */ void zzg(zzhct zzhctVar, long j) {
        zzhctVar.zzc |= 2;
        zzhctVar.zze = j;
    }

    public static /* synthetic */ void zzh(zzhct zzhctVar, boolean z4) {
        zzhctVar.zzc |= 4;
        zzhctVar.zzf = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhcu.zza, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzhct();
        }
        zzhdm zzhdmVar = null;
        if (iOrdinal == 4) {
            return new zzhcs(zzhdmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhct.class) {
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
