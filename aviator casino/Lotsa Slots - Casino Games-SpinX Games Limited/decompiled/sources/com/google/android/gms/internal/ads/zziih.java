package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziih extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zziih zzy;
    private static volatile com.google.android.gms.internal.ads.zzifx zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private java.lang.String zzd = "";
    private com.google.android.gms.internal.ads.zzieq zze = zzbM();
    private java.lang.String zzj = "";
    private com.google.android.gms.internal.ads.zzieq zzo = zzbM();
    private com.google.android.gms.internal.ads.zziem zzv = zzbC();
    private com.google.android.gms.internal.ads.zziem zzx = zzbC();

    static {
        com.google.android.gms.internal.ads.zziih zziihVar = new com.google.android.gms.internal.ads.zziih();
        zzy = zziihVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zziih.class, zziihVar);
    }

    private zziih() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zziig.zza, "zzc", "zzd", "zze", "zzf", com.google.android.gms.internal.ads.zziie.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", com.google.android.gms.internal.ads.zziid.class, "zzp", "zzu", "zzv", com.google.android.gms.internal.ads.zzihv.zza(), "zzw", "zzx", com.google.android.gms.internal.ads.zziif.zza});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zziih();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zziia(bArr);
        }
        if (ordinal == 5) {
            return zzy;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzz;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zziih.class) {
                zzifxVar = zzz;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzy);
                    zzz = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
