package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhrc extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhrc zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private com.google.android.gms.internal.ads.zzhre zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzhrc zzhrcVar = new com.google.android.gms.internal.ads.zzhrc();
        zzd = zzhrcVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhrc.class, zzhrcVar);
    }

    private zzhrc() {
    }

    public static com.google.android.gms.internal.ads.zzhrc zzc(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhrc) com.google.android.gms.internal.ads.zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhrb zzd() {
        return (com.google.android.gms.internal.ads.zzhrb) zzd.zzbn();
    }

    public final com.google.android.gms.internal.ads.zzhre zza() {
        com.google.android.gms.internal.ads.zzhre zzhreVar = this.zzb;
        return zzhreVar == null ? com.google.android.gms.internal.ads.zzhre.zzc() : zzhreVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhrc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhrb(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhrc.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhre zzhreVar) {
        zzhreVar.getClass();
        this.zzb = zzhreVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
