package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqs extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhqs zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private com.google.android.gms.internal.ads.zzhqw zzb;
    private com.google.android.gms.internal.ads.zzhsl zzc;

    static {
        com.google.android.gms.internal.ads.zzhqs zzhqsVar = new com.google.android.gms.internal.ads.zzhqs();
        zzd = zzhqsVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhqs.class, zzhqsVar);
    }

    private zzhqs() {
    }

    public static com.google.android.gms.internal.ads.zzhqs zzc(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhqs) com.google.android.gms.internal.ads.zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhqr zzd() {
        return (com.google.android.gms.internal.ads.zzhqr) zzd.zzbn();
    }

    public final com.google.android.gms.internal.ads.zzhqw zza() {
        com.google.android.gms.internal.ads.zzhqw zzhqwVar = this.zzb;
        return zzhqwVar == null ? com.google.android.gms.internal.ads.zzhqw.zzd() : zzhqwVar;
    }

    public final com.google.android.gms.internal.ads.zzhsl zzb() {
        com.google.android.gms.internal.ads.zzhsl zzhslVar = this.zzc;
        return zzhslVar == null ? com.google.android.gms.internal.ads.zzhsl.zzg() : zzhslVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhqs();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhqr(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhqs.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhqw zzhqwVar) {
        zzhqwVar.getClass();
        this.zzb = zzhqwVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhsl zzhslVar) {
        zzhslVar.getClass();
        this.zzc = zzhslVar;
        this.zza |= 2;
    }
}
