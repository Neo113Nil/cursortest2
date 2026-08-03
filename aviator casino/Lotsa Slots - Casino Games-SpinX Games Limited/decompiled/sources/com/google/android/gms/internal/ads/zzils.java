package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzils extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzils zzj;
    private static volatile com.google.android.gms.internal.ads.zzifx zzk;
    private int zza;
    private com.google.android.gms.internal.ads.zzilb zzh;
    private java.lang.String zzb = "";
    private java.lang.String zzc = "";
    private com.google.android.gms.internal.ads.zzieq zzd = zzbM();
    private com.google.android.gms.internal.ads.zzieq zze = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzf = zzbM();
    private int zzg = -1;
    private java.lang.String zzi = "";

    static {
        com.google.android.gms.internal.ads.zzils zzilsVar = new com.google.android.gms.internal.ads.zzils();
        zzj = zzilsVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzils.class, zzilsVar);
    }

    private zzils() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new java.lang.Object[]{"zza", "zzc", "zzd", com.google.android.gms.internal.ads.zzilf.class, "zze", com.google.android.gms.internal.ads.zzilm.class, "zzg", "zzb", "zzf", com.google.android.gms.internal.ads.zzilz.class, "zzi", "zzh"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzils();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzilr(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzk;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzils.class) {
                zzifxVar = zzk;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzj);
                    zzk = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
