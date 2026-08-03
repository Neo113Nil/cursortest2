package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibd extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzibd zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private com.google.android.gms.internal.ads.zzida zzb = com.google.android.gms.internal.ads.zzida.zza;
    private java.lang.String zzc = "";
    private com.google.android.gms.internal.ads.zzieq zzd = zzbM();
    private boolean zze;

    static {
        com.google.android.gms.internal.ads.zzibd zzibdVar = new com.google.android.gms.internal.ads.zzibd();
        zzf = zzibdVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzibd.class, zzibdVar);
    }

    private zzibd() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new java.lang.Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzibd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzibc(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzibd.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
