package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzawy extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzawy zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private com.google.android.gms.internal.ads.zzaxa zzb;
    private com.google.android.gms.internal.ads.zzaxd zzc;

    static {
        com.google.android.gms.internal.ads.zzawy zzawyVar = new com.google.android.gms.internal.ads.zzawy();
        zzd = zzawyVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzawy.class, zzawyVar);
    }

    private zzawy() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzawy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzawx(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzawy.class) {
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
