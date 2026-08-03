package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhsl extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhsl zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private int zza;
    private com.google.android.gms.internal.ads.zzhsn zzb;
    private int zzc;
    private int zzd;

    static {
        com.google.android.gms.internal.ads.zzhsl zzhslVar = new com.google.android.gms.internal.ads.zzhsl();
        zze = zzhslVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhsl.class, zzhslVar);
    }

    private zzhsl() {
    }

    public static com.google.android.gms.internal.ads.zzhsl zzd(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhsl) com.google.android.gms.internal.ads.zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhsk zze() {
        return (com.google.android.gms.internal.ads.zzhsk) zze.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhsl zzg() {
        return zze;
    }

    public final com.google.android.gms.internal.ads.zzhsn zza() {
        com.google.android.gms.internal.ads.zzhsn zzhsnVar = this.zzb;
        return zzhsnVar == null ? com.google.android.gms.internal.ads.zzhsn.zzd() : zzhsnVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhsl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhsk(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhsl.class) {
                zzifxVar = zzf;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                    zzf = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzhsn zzhsnVar) {
        zzhsnVar.getClass();
        this.zzb = zzhsnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
