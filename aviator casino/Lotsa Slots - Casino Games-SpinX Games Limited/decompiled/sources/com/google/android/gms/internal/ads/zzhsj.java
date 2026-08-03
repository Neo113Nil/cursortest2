package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhsj extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhsj zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private int zza;
    private int zzb;
    private com.google.android.gms.internal.ads.zzhsn zzc;
    private com.google.android.gms.internal.ads.zzida zzd = com.google.android.gms.internal.ads.zzida.zza;

    static {
        com.google.android.gms.internal.ads.zzhsj zzhsjVar = new com.google.android.gms.internal.ads.zzhsj();
        zze = zzhsjVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhsj.class, zzhsjVar);
    }

    private zzhsj() {
    }

    public static com.google.android.gms.internal.ads.zzhsj zzd(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhsj) com.google.android.gms.internal.ads.zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhsi zze() {
        return (com.google.android.gms.internal.ads.zzhsi) zze.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhsj zzg() {
        return zze;
    }

    public static com.google.android.gms.internal.ads.zzifx zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhsn zzb() {
        com.google.android.gms.internal.ads.zzhsn zzhsnVar = this.zzc;
        return zzhsnVar == null ? com.google.android.gms.internal.ads.zzhsn.zzd() : zzhsnVar;
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
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhsj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhsi(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhsj.class) {
                zzifxVar = zzf;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                    zzf = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhsn zzhsnVar) {
        zzhsnVar.getClass();
        this.zzc = zzhsnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzd = zzidaVar;
    }
}
