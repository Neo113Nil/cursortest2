package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaxi extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzaxi zzi;
    private static volatile com.google.android.gms.internal.ads.zzifx zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.ads.zzaxi zzaxiVar = new com.google.android.gms.internal.ads.zzaxi();
        zzi = zzaxiVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
    }

    public static com.google.android.gms.internal.ads.zzaxh zza() {
        return (com.google.android.gms.internal.ads.zzaxh) zzi.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", com.google.android.gms.internal.ads.zzaxj.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzaxi();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzaxh(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzj;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzaxi.class) {
                zzifxVar = zzj;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzi);
                    zzj = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }
}
