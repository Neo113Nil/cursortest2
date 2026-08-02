package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzasl extends zzgxg implements zzgys {
    private static final zzasl zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzasl zzaslVar = new zzasl();
        zza = zzaslVar;
        zzgxg.zzbZ(zzasl.class, zzaslVar);
    }

    private zzasl() {
    }

    public static zzask zza() {
        return (zzask) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasl zzaslVar, long j) {
        zzaslVar.zzc |= 32;
        zzaslVar.zzi = j;
    }

    public static /* synthetic */ void zzd(zzasl zzaslVar, long j) {
        zzaslVar.zzc |= 4;
        zzaslVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzasl zzaslVar, long j) {
        zzaslVar.zzc |= 1;
        zzaslVar.zzd = j;
    }

    public static /* synthetic */ void zzg(zzasl zzaslVar, long j) {
        zzaslVar.zzc |= 8;
        zzaslVar.zzg = j;
    }

    public static /* synthetic */ void zzh(zzasl zzaslVar, long j) {
        zzaslVar.zzc |= 16;
        zzaslVar.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new zzasl();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzask(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzasl.class) {
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
