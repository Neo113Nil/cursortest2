package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhtl extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhtl zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private java.lang.String zzb = "";
    private com.google.android.gms.internal.ads.zzhst zzc;

    static {
        com.google.android.gms.internal.ads.zzhtl zzhtlVar = new com.google.android.gms.internal.ads.zzhtl();
        zzd = zzhtlVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhtl.class, zzhtlVar);
    }

    private zzhtl() {
    }

    public static com.google.android.gms.internal.ads.zzhtl zzc(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhtl) com.google.android.gms.internal.ads.zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhtk zzd() {
        return (com.google.android.gms.internal.ads.zzhtk) zzd.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhtl zze() {
        return zzd;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhst zzb() {
        com.google.android.gms.internal.ads.zzhst zzhstVar = this.zzc;
        return zzhstVar == null ? com.google.android.gms.internal.ads.zzhst.zzh() : zzhstVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhtl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhtk(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhtl.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzhst zzhstVar) {
        zzhstVar.getClass();
        this.zzc = zzhstVar;
        this.zza |= 1;
    }
}
