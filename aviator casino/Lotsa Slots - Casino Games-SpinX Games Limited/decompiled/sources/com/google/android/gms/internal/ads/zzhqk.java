package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqk extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhqk zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private int zza;
    private int zzb;
    private com.google.android.gms.internal.ads.zzida zzc = com.google.android.gms.internal.ads.zzida.zza;
    private com.google.android.gms.internal.ads.zzhqo zzd;

    static {
        com.google.android.gms.internal.ads.zzhqk zzhqkVar = new com.google.android.gms.internal.ads.zzhqk();
        zze = zzhqkVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhqk.class, zzhqkVar);
    }

    private zzhqk() {
    }

    public static com.google.android.gms.internal.ads.zzhqk zzd(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhqk) com.google.android.gms.internal.ads.zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhqj zze() {
        return (com.google.android.gms.internal.ads.zzhqj) zze.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzifx zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhqo zzc() {
        com.google.android.gms.internal.ads.zzhqo zzhqoVar = this.zzd;
        return zzhqoVar == null ? com.google.android.gms.internal.ads.zzhqo.zzc() : zzhqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhqk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhqj(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhqk.class) {
                zzifxVar = zzf;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                    zzf = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzc = zzidaVar;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhqo zzhqoVar) {
        zzhqoVar.getClass();
        this.zzd = zzhqoVar;
        this.zza |= 1;
    }
}
