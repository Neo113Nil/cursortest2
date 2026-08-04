package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzasu extends zzgxg implements zzgys {
    private static final zzasu zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static {
        zzasu zzasuVar = new zzasu();
        zza = zzasuVar;
        zzgxg.zzbZ(zzasu.class, zzasuVar);
    }

    private zzasu() {
    }

    public static zzast zza() {
        return (zzast) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasu zzasuVar, String str) {
        zzasuVar.zzc |= 1;
        zzasuVar.zzd = "1.671910402";
    }

    public static /* synthetic */ void zzd(zzasu zzasuVar, String str) {
        str.getClass();
        zzasuVar.zzc |= 2;
        zzasuVar.zze = str;
    }

    public static /* synthetic */ void zzf(zzasu zzasuVar, String str) {
        str.getClass();
        zzasuVar.zzc |= 8;
        zzasuVar.zzg = str;
    }

    public static /* synthetic */ void zzg(zzasu zzasuVar, long j) {
        zzasuVar.zzc |= 4;
        zzasuVar.zzf = j;
    }

    public static /* synthetic */ void zzh(zzasu zzasuVar, long j) {
        zzasuVar.zzc |= 16;
        zzasuVar.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzasu();
        }
        zzatc zzatcVar = null;
        if (iOrdinal == 4) {
            return new zzast(zzatcVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzasu.class) {
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
