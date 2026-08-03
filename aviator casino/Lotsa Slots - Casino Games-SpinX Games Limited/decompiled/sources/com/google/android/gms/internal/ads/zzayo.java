package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzayo extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzayo zzn;
    private static volatile com.google.android.gms.internal.ads.zzifx zzo;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private com.google.android.gms.internal.ads.zzayq zzl;
    private com.google.android.gms.internal.ads.zziem zze = zzbC();
    private com.google.android.gms.internal.ads.zzieq zzh = zzbM();
    private com.google.android.gms.internal.ads.zziep zzm = zzbE();

    static {
        com.google.android.gms.internal.ads.zzayo zzayoVar = new com.google.android.gms.internal.ads.zzayo();
        zzn = zzayoVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzayo.class, zzayoVar);
    }

    private zzayo() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.ads.zzayu.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzayo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzayn(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzo;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzayo.class) {
                zzifxVar = zzo;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzn);
                    zzo = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
