package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzarb extends zzgxg implements zzgys {
    private static final zzarb zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzgxs zzo = zzgxg.zzbK();

    static {
        zzarb zzarbVar = new zzarb();
        zza = zzarbVar;
        zzgxg.zzbZ(zzarb.class, zzarbVar);
    }

    private zzarb() {
    }

    public static zzaqx zza() {
        return (zzaqx) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzarb zzarbVar, String str) {
        str.getClass();
        zzarbVar.zzc |= 1;
        zzarbVar.zzd = str;
    }

    public static /* synthetic */ void zzd(zzarb zzarbVar, String str) {
        zzarbVar.zzc |= 16;
        zzarbVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzarb zzarbVar, String str) {
        zzarbVar.zzc |= 1024;
        zzarbVar.zzn = str;
    }

    public static /* synthetic */ void zzg(zzarb zzarbVar, String str) {
        str.getClass();
        zzarbVar.zzc |= 8;
        zzarbVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzarb zzarbVar, long j) {
        zzarbVar.zzc |= 2;
        zzarbVar.zze = j;
    }

    public static /* synthetic */ void zzi(zzarb zzarbVar, String str) {
        str.getClass();
        zzarbVar.zzc |= 4;
        zzarbVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzarb zzarbVar, int i7) {
        zzarbVar.zzp = i7 - 1;
        zzarbVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzaqz.class, "zzp", zzara.zza});
        }
        if (ordinal == 3) {
            return new zzarb();
        }
        zzarc zzarcVar = null;
        if (ordinal == 4) {
            return new zzaqx(zzarcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzarb.class) {
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
