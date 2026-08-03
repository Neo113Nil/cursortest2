package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzayy extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzayy zzh;
    private static volatile com.google.android.gms.internal.ads.zzifx zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private java.lang.String zzb = "";
    private java.lang.String zzc = "";
    private java.lang.String zze = "D";

    static {
        com.google.android.gms.internal.ads.zzayy zzayyVar = new com.google.android.gms.internal.ads.zzayy();
        zzh = zzayyVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzayy.class, zzayyVar);
    }

    private zzayy() {
    }

    public static com.google.android.gms.internal.ads.zzayx zza() {
        return (com.google.android.gms.internal.ads.zzayx) zzh.zzbn();
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzc(java.lang.String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzayy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzayx(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzi;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzayy.class) {
                zzifxVar = zzi;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzh);
                    zzi = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzh(long j) {
        this.zza |= 32;
        this.zzg = j;
    }
}
