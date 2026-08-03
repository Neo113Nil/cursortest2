package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhsy extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhsy zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private com.google.android.gms.internal.ads.zzhsq zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.ads.zzhsy zzhsyVar = new com.google.android.gms.internal.ads.zzhsy();
        zzf = zzhsyVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhsy.class, zzhsyVar);
    }

    private zzhsy() {
    }

    public static com.google.android.gms.internal.ads.zzhsx zze() {
        return (com.google.android.gms.internal.ads.zzhsx) zzf.zzbn();
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final com.google.android.gms.internal.ads.zzhsq zzb() {
        com.google.android.gms.internal.ads.zzhsq zzhsqVar = this.zzb;
        return zzhsqVar == null ? com.google.android.gms.internal.ads.zzhsq.zze() : zzhsqVar;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzhtm zzd() {
        com.google.android.gms.internal.ads.zzhtm zzb = com.google.android.gms.internal.ads.zzhtm.zzb(this.zze);
        return zzb == null ? com.google.android.gms.internal.ads.zzhtm.UNRECOGNIZED : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhsy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhsx(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhsy.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhsq zzhsqVar) {
        zzhsqVar.getClass();
        this.zzb = zzhsqVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzd = i;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzhtm zzhtmVar) {
        this.zze = zzhtmVar.zza();
    }

    public final int zzk() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzc = com.google.android.gms.internal.ads.zzhsr.zza(i);
    }
}
