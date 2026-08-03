package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhua extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhua zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzhua zzhuaVar = new com.google.android.gms.internal.ads.zzhua();
        zzd = zzhuaVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhua.class, zzhuaVar);
    }

    private zzhua() {
    }

    public static com.google.android.gms.internal.ads.zzhtz zzd() {
        return (com.google.android.gms.internal.ads.zzhtz) zzd.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhua zze() {
        return zzd;
    }

    public final com.google.android.gms.internal.ads.zzhsh zza() {
        com.google.android.gms.internal.ads.zzhsh zzb = com.google.android.gms.internal.ads.zzhsh.zzb(this.zza);
        return zzb == null ? com.google.android.gms.internal.ads.zzhsh.UNRECOGNIZED : zzb;
    }

    public final com.google.android.gms.internal.ads.zzhsh zzb() {
        com.google.android.gms.internal.ads.zzhsh zzb = com.google.android.gms.internal.ads.zzhsh.zzb(this.zzb);
        return zzb == null ? com.google.android.gms.internal.ads.zzhsh.UNRECOGNIZED : zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhua();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhtz(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhua.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhsh zzhshVar) {
        this.zza = zzhshVar.zza();
    }

    final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzhsh zzhshVar) {
        this.zzb = zzhshVar.zza();
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
