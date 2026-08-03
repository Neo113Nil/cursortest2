package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgdz extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzgdz zzl;
    private static volatile com.google.android.gms.internal.ads.zzifx zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = com.facebook.AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
    private long zzf = 3600000;
    private java.lang.String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        com.google.android.gms.internal.ads.zzgdz zzgdzVar = new com.google.android.gms.internal.ads.zzgdz();
        zzl = zzgdzVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzgdz.class, zzgdzVar);
    }

    private zzgdz() {
    }

    public static com.google.android.gms.internal.ads.zzgdy zzi() {
        return (com.google.android.gms.internal.ads.zzgdy) zzl.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzgdz zzj() {
        return zzl;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final java.lang.String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzgdz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzgdy(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzm;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgdz.class) {
                zzifxVar = zzm;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzl);
                    zzm = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final long zzg() {
        return this.zzj;
    }

    public final long zzh() {
        return this.zzk;
    }

    final /* synthetic */ void zzk(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    final /* synthetic */ void zzl(long j) {
        this.zza |= 64;
        this.zzh = j;
    }
}
