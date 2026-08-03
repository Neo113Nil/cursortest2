package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhry extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhry zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private int zzb;
    private com.google.android.gms.internal.ads.zzhru zzc;
    private com.google.android.gms.internal.ads.zzida zzd;
    private com.google.android.gms.internal.ads.zzida zze;

    static {
        com.google.android.gms.internal.ads.zzhry zzhryVar = new com.google.android.gms.internal.ads.zzhry();
        zzf = zzhryVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhry.class, zzhryVar);
    }

    private zzhry() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzd = zzidaVar;
        this.zze = zzidaVar;
    }

    public static com.google.android.gms.internal.ads.zzhry zze(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhry) com.google.android.gms.internal.ads.zziee.zzbT(zzf, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhrx zzg() {
        return (com.google.android.gms.internal.ads.zzhrx) zzf.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhry zzh() {
        return zzf;
    }

    public static com.google.android.gms.internal.ads.zzifx zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhru zzb() {
        com.google.android.gms.internal.ads.zzhru zzhruVar = this.zzc;
        return zzhruVar == null ? com.google.android.gms.internal.ads.zzhru.zzc() : zzhruVar;
    }

    public final com.google.android.gms.internal.ads.zzida zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzida zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhry();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhrx(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhry.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzhru zzhruVar) {
        zzhruVar.getClass();
        this.zzc = zzhruVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzd = zzidaVar;
    }

    final /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zze = zzidaVar;
    }
}
