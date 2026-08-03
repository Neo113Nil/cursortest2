package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhru extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhru zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzhru zzhruVar = new com.google.android.gms.internal.ads.zzhru();
        zzd = zzhruVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhru.class, zzhruVar);
    }

    private zzhru() {
    }

    public static com.google.android.gms.internal.ads.zzhrt zzb() {
        return (com.google.android.gms.internal.ads.zzhrt) zzd.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhru zzc() {
        return zzd;
    }

    public final com.google.android.gms.internal.ads.zzhsh zza() {
        com.google.android.gms.internal.ads.zzhsh zzb = com.google.android.gms.internal.ads.zzhsh.zzb(this.zza);
        return zzb == null ? com.google.android.gms.internal.ads.zzhsh.UNRECOGNIZED : zzb;
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzhsh zzhshVar) {
        this.zza = zzhshVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhru();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhrt(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhru.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb = com.google.android.gms.internal.ads.zzhsg.zza(i);
    }

    final /* synthetic */ void zzj(int i) {
        this.zzc = com.google.android.gms.internal.ads.zzhrz.zza(i);
    }
}
