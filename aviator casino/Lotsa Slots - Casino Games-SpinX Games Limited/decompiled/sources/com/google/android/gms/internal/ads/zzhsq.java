package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhsq extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhsq zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private java.lang.String zza = "";
    private com.google.android.gms.internal.ads.zzida zzb = com.google.android.gms.internal.ads.zzida.zza;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzhsq zzhsqVar = new com.google.android.gms.internal.ads.zzhsq();
        zzd = zzhsqVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhsq.class, zzhsqVar);
    }

    private zzhsq() {
    }

    public static com.google.android.gms.internal.ads.zzhso zzd() {
        return (com.google.android.gms.internal.ads.zzhso) zzd.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhsq zze() {
        return zzd;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhsp zzc() {
        int i = this.zzc;
        com.google.android.gms.internal.ads.zzhsp zzhspVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : com.google.android.gms.internal.ads.zzhsp.REMOTE : com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PUBLIC : com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PRIVATE : com.google.android.gms.internal.ads.zzhsp.SYMMETRIC : com.google.android.gms.internal.ads.zzhsp.UNKNOWN_KEYMATERIAL;
        return zzhspVar == null ? com.google.android.gms.internal.ads.zzhsp.UNRECOGNIZED : zzhspVar;
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
            return new com.google.android.gms.internal.ads.zzhsq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhso(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhsq.class) {
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
        this.zza = str;
    }

    final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzb = zzidaVar;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhsp zzhspVar) {
        this.zzc = zzhspVar.zza();
    }
}
