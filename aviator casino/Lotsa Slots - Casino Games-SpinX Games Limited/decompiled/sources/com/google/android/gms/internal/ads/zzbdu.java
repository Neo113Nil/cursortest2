package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbdu extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzbdu zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private int zza;
    private com.google.android.gms.internal.ads.zzbeb zzb;
    private com.google.android.gms.internal.ads.zzida zzc;
    private com.google.android.gms.internal.ads.zzida zzd;

    static {
        com.google.android.gms.internal.ads.zzbdu zzbduVar = new com.google.android.gms.internal.ads.zzbdu();
        zze = zzbduVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzbdu.class, zzbduVar);
    }

    private zzbdu() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzc = zzidaVar;
        this.zzd = zzidaVar;
    }

    public static com.google.android.gms.internal.ads.zzbdu zzd(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzbdu) com.google.android.gms.internal.ads.zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzbdu zze(byte[] bArr, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzbdu) com.google.android.gms.internal.ads.zziee.zzbV(zze, bArr, zzidoVar);
    }

    public final com.google.android.gms.internal.ads.zzbeb zza() {
        com.google.android.gms.internal.ads.zzbeb zzbebVar = this.zzb;
        return zzbebVar == null ? com.google.android.gms.internal.ads.zzbeb.zzj() : zzbebVar;
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzida zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzbdu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzbdt(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzbdu.class) {
                zzifxVar = zzf;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                    zzf = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
