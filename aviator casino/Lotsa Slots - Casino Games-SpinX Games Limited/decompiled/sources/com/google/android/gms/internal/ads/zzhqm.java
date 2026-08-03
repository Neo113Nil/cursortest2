package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqm extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhqm zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private int zzb;
    private com.google.android.gms.internal.ads.zzhqo zzc;

    static {
        com.google.android.gms.internal.ads.zzhqm zzhqmVar = new com.google.android.gms.internal.ads.zzhqm();
        zzd = zzhqmVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhqm.class, zzhqmVar);
    }

    private zzhqm() {
    }

    public static com.google.android.gms.internal.ads.zzhqm zzc(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhqm) com.google.android.gms.internal.ads.zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhql zzd() {
        return (com.google.android.gms.internal.ads.zzhql) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhqo zzb() {
        com.google.android.gms.internal.ads.zzhqo zzhqoVar = this.zzc;
        return zzhqoVar == null ? com.google.android.gms.internal.ads.zzhqo.zzc() : zzhqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhqm();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhql(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhqm.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb = i;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhqo zzhqoVar) {
        zzhqoVar.getClass();
        this.zzc = zzhqoVar;
        this.zza |= 1;
    }
}
