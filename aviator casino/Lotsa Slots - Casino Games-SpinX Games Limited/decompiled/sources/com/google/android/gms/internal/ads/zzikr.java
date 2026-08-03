package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzikr extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzikr zzh;
    private static volatile com.google.android.gms.internal.ads.zzifx zzi;
    private int zza;
    private int zzb;
    private int zze;
    private java.lang.String zzc = "";
    private com.google.android.gms.internal.ads.zziem zzd = zzbC();
    private com.google.android.gms.internal.ads.zzieq zzf = zzbM();
    private com.google.android.gms.internal.ads.zzida zzg = com.google.android.gms.internal.ads.zzida.zza;

    static {
        com.google.android.gms.internal.ads.zzikr zzikrVar = new com.google.android.gms.internal.ads.zzikr();
        zzh = zzikrVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzikr.class, zzikrVar);
    }

    private zzikr() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", com.google.android.gms.internal.ads.zzikp.class, "zzg"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzikr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzikq(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzi;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzikr.class) {
                zzifxVar = zzi;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzh);
                    zzi = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
