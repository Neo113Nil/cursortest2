package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbeb extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzbeb zzg;
    private static volatile com.google.android.gms.internal.ads.zzifx zzh;
    private int zza;
    private java.lang.String zzb = "";
    private java.lang.String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        com.google.android.gms.internal.ads.zzbeb zzbebVar = new com.google.android.gms.internal.ads.zzbeb();
        zzg = zzbebVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzbeb.class, zzbebVar);
    }

    private zzbeb() {
    }

    public static com.google.android.gms.internal.ads.zzbeb zzg(com.google.android.gms.internal.ads.zzida zzidaVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzbeb) com.google.android.gms.internal.ads.zziee.zzbS(zzg, zzidaVar);
    }

    public static com.google.android.gms.internal.ads.zzbeb zzh(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzbeb) com.google.android.gms.internal.ads.zziee.zzbT(zzg, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzbea zzi() {
        return (com.google.android.gms.internal.ads.zzbea) zzg.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzbeb zzj() {
        return zzg;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final java.lang.String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzbeb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzbea(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzh;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzbeb.class) {
                zzifxVar = zzh;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzg);
                    zzh = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    public final long zze() {
        return this.zzf;
    }

    final /* synthetic */ void zzk(java.lang.String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzl(java.lang.String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzm(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    final /* synthetic */ void zzn(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    final /* synthetic */ void zzo(long j) {
        this.zza |= 16;
        this.zzf = j;
    }
}
