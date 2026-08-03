package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfqu extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzfqu zzi;
    private static volatile com.google.android.gms.internal.ads.zzifx zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private java.lang.String zza = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.ads.zzfqu zzfquVar = new com.google.android.gms.internal.ads.zzfqu();
        zzi = zzfquVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzfqu.class, zzfquVar);
    }

    private zzfqu() {
    }

    public static com.google.android.gms.internal.ads.zzfqt zza() {
        return (com.google.android.gms.internal.ads.zzfqt) zzi.zzbn();
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzd(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzfqu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzfqt(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzj;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfqu.class) {
                zzifxVar = zzj;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzi);
                    zzj = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzd = z;
    }

    final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    final /* synthetic */ void zzh(long j) {
        this.zzf = j;
    }

    final /* synthetic */ void zzi(java.lang.String str) {
        str.getClass();
        this.zzg = str;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzh = i - 2;
    }
}
