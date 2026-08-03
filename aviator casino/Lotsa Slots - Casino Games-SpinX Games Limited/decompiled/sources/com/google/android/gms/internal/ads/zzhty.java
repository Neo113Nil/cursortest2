package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhty extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhty zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private int zza;
    private com.google.android.gms.internal.ads.zzhua zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zzida zzd = com.google.android.gms.internal.ads.zzida.zza;

    static {
        com.google.android.gms.internal.ads.zzhty zzhtyVar = new com.google.android.gms.internal.ads.zzhty();
        zze = zzhtyVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhty.class, zzhtyVar);
    }

    private zzhty() {
    }

    public static com.google.android.gms.internal.ads.zzhty zzd(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhty) com.google.android.gms.internal.ads.zziee.zzbT(zze, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhtx zze() {
        return (com.google.android.gms.internal.ads.zzhtx) zze.zzbn();
    }

    public final com.google.android.gms.internal.ads.zzhua zza() {
        com.google.android.gms.internal.ads.zzhua zzhuaVar = this.zzb;
        return zzhuaVar == null ? com.google.android.gms.internal.ads.zzhua.zze() : zzhuaVar;
    }

    public final int zzb() {
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
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhty();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhtx(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhty.class) {
                zzifxVar = zzf;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                    zzf = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhua zzhuaVar) {
        zzhuaVar.getClass();
        this.zzb = zzhuaVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzc = i;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzd = zzidaVar;
    }
}
