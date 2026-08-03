package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziit extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zziit zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        com.google.android.gms.internal.ads.zziit zziitVar = new com.google.android.gms.internal.ads.zziit();
        zzf = zziitVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zziit.class, zziitVar);
    }

    private zziit() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zziis.zza, "zzc", com.google.android.gms.internal.ads.zziiq.zza, "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zziit();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zziir(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zziit.class) {
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
