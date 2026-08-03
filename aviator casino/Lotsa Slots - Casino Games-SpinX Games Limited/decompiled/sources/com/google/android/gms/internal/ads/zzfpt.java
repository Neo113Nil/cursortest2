package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfpt extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzfpt zzg;
    private static volatile com.google.android.gms.internal.ads.zzifx zzh;
    private long zza;
    private com.google.android.gms.internal.ads.zziem zzb = zzbC();
    private com.google.android.gms.internal.ads.zzieq zzc = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzd = zzbM();
    private com.google.android.gms.internal.ads.zzieq zze = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzf = zzbM();

    static {
        com.google.android.gms.internal.ads.zzfpt zzfptVar = new com.google.android.gms.internal.ads.zzfpt();
        zzg = zzfptVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzfpt.class, zzfptVar);
    }

    private zzfpt() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzfpt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzfps(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzh;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfpt.class) {
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
