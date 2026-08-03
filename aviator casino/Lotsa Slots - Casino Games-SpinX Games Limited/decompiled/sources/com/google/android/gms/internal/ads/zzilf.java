package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzilf extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzilf zzn;
    private static volatile com.google.android.gms.internal.ads.zzifx zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private com.google.android.gms.internal.ads.zzilk zzk;
    private com.google.android.gms.internal.ads.zzile zzm;
    private java.lang.String zzb = "";
    private java.lang.String zzc = "";
    private int zze = 1;
    private java.lang.String zzg = "";
    private java.lang.String zzl = "";

    static {
        com.google.android.gms.internal.ads.zzilf zzilfVar = new com.google.android.gms.internal.ads.zzilf();
        zzn = zzilfVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzilf.class, zzilfVar);
    }

    private zzilf() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", com.google.android.gms.internal.ads.zzilo.zza, "zze", com.google.android.gms.internal.ads.zziln.zza, "zzf", "zzg", "zzh", "zzi", "zzj", com.google.android.gms.internal.ads.zzilg.zza, "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzilf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzilc(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzo;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzilf.class) {
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
