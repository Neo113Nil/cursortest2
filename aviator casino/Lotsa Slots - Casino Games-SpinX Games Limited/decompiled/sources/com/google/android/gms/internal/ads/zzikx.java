package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzikx extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzikx zzp;
    private static volatile com.google.android.gms.internal.ads.zzifx zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private java.lang.String zzb = "";
    private java.lang.String zzc = "";
    private int zzd = 4;
    private com.google.android.gms.internal.ads.zzieq zze = zzbM();
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.ads.zzieq zzj = zzbM();

    static {
        com.google.android.gms.internal.ads.zzikx zzikxVar = new com.google.android.gms.internal.ads.zzikx();
        zzp = zzikxVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzikx.class, zzikxVar);
    }

    private zzikx() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new java.lang.Object[]{"zza", "zzb", "zzd", com.google.android.gms.internal.ads.zzikw.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", com.google.android.gms.internal.ads.zzikv.class, "zzc", "zzk", com.google.android.gms.internal.ads.zzikt.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzikx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zziks(bArr);
        }
        if (ordinal == 5) {
            return zzp;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzu;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzikx.class) {
                zzifxVar = zzu;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzp);
                    zzu = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
