package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhst extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhst zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private java.lang.String zza = "";
    private com.google.android.gms.internal.ads.zzida zzb = com.google.android.gms.internal.ads.zzida.zza;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzhst zzhstVar = new com.google.android.gms.internal.ads.zzhst();
        zzd = zzhstVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhst.class, zzhstVar);
    }

    private zzhst() {
    }

    public static com.google.android.gms.internal.ads.zzhst zzd(byte[] bArr, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhst) com.google.android.gms.internal.ads.zziee.zzbV(zzd, bArr, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhss zze() {
        return (com.google.android.gms.internal.ads.zzhss) zzd.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhss zzg(com.google.android.gms.internal.ads.zzhst zzhstVar) {
        return (com.google.android.gms.internal.ads.zzhss) zzd.zzbo(zzhstVar);
    }

    public static com.google.android.gms.internal.ads.zzhst zzh() {
        return zzd;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhtm zzc() {
        com.google.android.gms.internal.ads.zzhtm zzb = com.google.android.gms.internal.ads.zzhtm.zzb(this.zzc);
        return zzb == null ? com.google.android.gms.internal.ads.zzhtm.UNRECOGNIZED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhst();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhss(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhst.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzi(java.lang.String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzb = zzidaVar;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzhtm zzhtmVar) {
        this.zzc = zzhtmVar.zza();
    }
}
