package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfxz extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzfxz zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private com.google.android.gms.internal.ads.zziem zzb = zzbC();
    private java.lang.String zzc = "";
    private java.lang.String zzd = "";
    private java.lang.String zze = "";

    static {
        com.google.android.gms.internal.ads.zzfxz zzfxzVar = new com.google.android.gms.internal.ads.zzfxz();
        zzf = zzfxzVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzfxz.class, zzfxzVar);
    }

    private zzfxz() {
    }

    public static com.google.android.gms.internal.ads.zzfxy zza() {
        return (com.google.android.gms.internal.ads.zzfxy) zzf.zzbn();
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(int i) {
        com.google.android.gms.internal.ads.zziem zziemVar = this.zzb;
        if (!zziemVar.zza()) {
            this.zzb = com.google.android.gms.internal.ads.zziee.zzbD(zziemVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zzfxx.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzfxz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzfxy(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzfxz.class) {
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
