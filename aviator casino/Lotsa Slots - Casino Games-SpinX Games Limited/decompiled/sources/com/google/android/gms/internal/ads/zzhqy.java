package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhqy extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhqy zzb;
    private static volatile com.google.android.gms.internal.ads.zzifx zzc;
    private int zza;

    static {
        com.google.android.gms.internal.ads.zzhqy zzhqyVar = new com.google.android.gms.internal.ads.zzhqy();
        zzb = zzhqyVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhqy.class, zzhqyVar);
    }

    private zzhqy() {
    }

    public static com.google.android.gms.internal.ads.zzhqx zzb() {
        return (com.google.android.gms.internal.ads.zzhqx) zzb.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzhqy zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhqy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhqx(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzc;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhqy.class) {
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
