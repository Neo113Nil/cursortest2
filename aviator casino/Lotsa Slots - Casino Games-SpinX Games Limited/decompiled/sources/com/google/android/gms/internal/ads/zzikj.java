package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzikj extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzikj zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private java.lang.String zzb = "";
    private com.google.android.gms.internal.ads.zzida zzc = com.google.android.gms.internal.ads.zzida.zza;

    static {
        com.google.android.gms.internal.ads.zzikj zzikjVar = new com.google.android.gms.internal.ads.zzikj();
        zzd = zzikjVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzikj.class, zzikjVar);
    }

    private zzikj() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzikj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zziki(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzikj.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
