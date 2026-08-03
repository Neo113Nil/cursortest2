package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhrq extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhrq zza;
    private static volatile com.google.android.gms.internal.ads.zzifx zzb;

    static {
        com.google.android.gms.internal.ads.zzhrq zzhrqVar = new com.google.android.gms.internal.ads.zzhrq();
        zza = zzhrqVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhrq.class, zzhrqVar);
    }

    private zzhrq() {
    }

    public static com.google.android.gms.internal.ads.zzhrq zza(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhrq) com.google.android.gms.internal.ads.zziee.zzbT(zza, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhrq zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (ordinal == 2) {
            return zzbv(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhrq();
        }
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhrp(bArr);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzb;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhrq.class) {
                zzifxVar = zzb;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zza);
                    zzb = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
