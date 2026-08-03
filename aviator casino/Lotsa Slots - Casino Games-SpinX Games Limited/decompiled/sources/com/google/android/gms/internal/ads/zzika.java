package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzika extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzika zzj;
    private static volatile com.google.android.gms.internal.ads.zzifx zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private java.lang.String zzb = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.ads.zzika zzikaVar = new com.google.android.gms.internal.ads.zzika();
        zzj = zzikaVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzika.class, zzikaVar);
    }

    private zzika() {
    }

    public static com.google.android.gms.internal.ads.zzijz zzc() {
        return (com.google.android.gms.internal.ads.zzijz) zzj.zzbn();
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", com.google.android.gms.internal.ads.zzikb.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzika();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzijz(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzk;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzika.class) {
                zzifxVar = zzk;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzj);
                    zzk = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }
}
