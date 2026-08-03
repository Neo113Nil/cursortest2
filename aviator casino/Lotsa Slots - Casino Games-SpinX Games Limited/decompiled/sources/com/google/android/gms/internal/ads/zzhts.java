package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhts extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhts zzb;
    private static volatile com.google.android.gms.internal.ads.zzifx zzc;
    private int zza;

    static {
        com.google.android.gms.internal.ads.zzhts zzhtsVar = new com.google.android.gms.internal.ads.zzhts();
        zzb = zzhtsVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhts.class, zzhtsVar);
    }

    private zzhts() {
    }

    public static com.google.android.gms.internal.ads.zzhtr zzb() {
        return (com.google.android.gms.internal.ads.zzhtr) zzb.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhts zzc() {
        return zzb;
    }

    public final com.google.android.gms.internal.ads.zzhsh zza() {
        com.google.android.gms.internal.ads.zzhsh zzb2 = com.google.android.gms.internal.ads.zzhsh.zzb(this.zza);
        return zzb2 == null ? com.google.android.gms.internal.ads.zzhsh.UNRECOGNIZED : zzb2;
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
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhts();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhtr(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzc;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhts.class) {
                zzifxVar = zzc;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzb);
                    zzc = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
