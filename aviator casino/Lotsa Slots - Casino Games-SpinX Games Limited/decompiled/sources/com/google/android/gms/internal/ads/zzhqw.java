package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqw extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhqw zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private com.google.android.gms.internal.ads.zzhqy zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzhqw zzhqwVar = new com.google.android.gms.internal.ads.zzhqw();
        zzd = zzhqwVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhqw.class, zzhqwVar);
    }

    private zzhqw() {
    }

    public static com.google.android.gms.internal.ads.zzhqv zzc() {
        return (com.google.android.gms.internal.ads.zzhqv) zzd.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhqw zzd() {
        return zzd;
    }

    public final com.google.android.gms.internal.ads.zzhqy zza() {
        com.google.android.gms.internal.ads.zzhqy zzhqyVar = this.zzb;
        return zzhqyVar == null ? com.google.android.gms.internal.ads.zzhqy.zzc() : zzhqyVar;
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
            return new com.google.android.gms.internal.ads.zzhqw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhqv(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhqw.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhqy zzhqyVar) {
        zzhqyVar.getClass();
        this.zzb = zzhqyVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
