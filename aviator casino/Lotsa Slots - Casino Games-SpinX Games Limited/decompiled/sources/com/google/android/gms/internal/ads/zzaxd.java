package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaxd extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzaxd zzh;
    private static volatile com.google.android.gms.internal.ads.zzifx zzi;
    private int zza;
    private java.lang.String zzb = "";
    private java.lang.String zzc = "";
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.ads.zzaxd zzaxdVar = new com.google.android.gms.internal.ads.zzaxd();
        zzh = zzaxdVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzaxd.class, zzaxdVar);
    }

    private zzaxd() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzaxd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzaxc(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzi;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzaxd.class) {
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
