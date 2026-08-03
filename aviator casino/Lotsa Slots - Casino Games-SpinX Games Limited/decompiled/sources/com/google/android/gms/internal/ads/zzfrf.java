package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfrf extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzfrf zzg;
    private static volatile com.google.android.gms.internal.ads.zzifx zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private java.lang.String zza = "";
    private java.lang.String zze = "";

    static {
        com.google.android.gms.internal.ads.zzfrf zzfrfVar = new com.google.android.gms.internal.ads.zzfrf();
        zzg = zzfrfVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzfrf.class, zzfrfVar);
    }

    private zzfrf() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzfrf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzfre(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzh;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfrf.class) {
                zzifxVar = zzh;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzg);
                    zzh = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
