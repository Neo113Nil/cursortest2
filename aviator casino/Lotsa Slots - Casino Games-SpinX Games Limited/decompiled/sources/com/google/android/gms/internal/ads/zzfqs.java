package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfqs extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzfqs zzb;
    private static volatile com.google.android.gms.internal.ads.zzifx zzc;
    private java.lang.String zza = "";

    static {
        com.google.android.gms.internal.ads.zzfqs zzfqsVar = new com.google.android.gms.internal.ads.zzfqs();
        zzb = zzfqsVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzfqs.class, zzfqsVar);
    }

    private zzfqs() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzfqs();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzfqr(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzc;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfqs.class) {
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
