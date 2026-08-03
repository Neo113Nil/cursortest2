package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhsn extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhsn zzc;
    private static volatile com.google.android.gms.internal.ads.zzifx zzd;
    private int zza;
    private int zzb;

    static {
        com.google.android.gms.internal.ads.zzhsn zzhsnVar = new com.google.android.gms.internal.ads.zzhsn();
        zzc = zzhsnVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhsn.class, zzhsnVar);
    }

    private zzhsn() {
    }

    public static com.google.android.gms.internal.ads.zzhsm zzc() {
        return (com.google.android.gms.internal.ads.zzhsm) zzc.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhsn zzd() {
        return zzc;
    }

    public final com.google.android.gms.internal.ads.zzhsh zza() {
        com.google.android.gms.internal.ads.zzhsh zzb = com.google.android.gms.internal.ads.zzhsh.zzb(this.zza);
        return zzb == null ? com.google.android.gms.internal.ads.zzhsh.UNRECOGNIZED : zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new java.lang.Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhsn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhsm(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzd;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhsn.class) {
                zzifxVar = zzd;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzc);
                    zzd = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzhsh zzhshVar) {
        this.zza = zzhshVar.zza();
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = i;
    }
}
