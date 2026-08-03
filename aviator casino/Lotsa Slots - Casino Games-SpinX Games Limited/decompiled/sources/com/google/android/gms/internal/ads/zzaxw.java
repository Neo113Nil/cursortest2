package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaxw extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzaxw zze;
    private static volatile com.google.android.gms.internal.ads.zzifx zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;
    private int zzd = 1000;

    static {
        com.google.android.gms.internal.ads.zzaxw zzaxwVar = new com.google.android.gms.internal.ads.zzaxw();
        zze = zzaxwVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            com.google.android.gms.internal.ads.zziek zziekVar = com.google.android.gms.internal.ads.zzayw.zza;
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"zza", "zzb", "zzc", zziekVar, "zzd", zziekVar});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzaxw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzaxv(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzf;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzaxw.class) {
                zzifxVar = zzf;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zze);
                    zzf = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
