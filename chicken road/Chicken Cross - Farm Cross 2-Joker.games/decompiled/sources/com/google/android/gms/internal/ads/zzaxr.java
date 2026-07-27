package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaxr extends zzifm implements zzigx {
    private static final zzaxr zzh;
    private static volatile zzihe zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzaxr zzaxrVar = new zzaxr();
        zzh = zzaxrVar;
        zzifm.zzbu(zzaxr.class, zzaxrVar);
    }

    private zzaxr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzaxr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxq(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzi;
        if (zziheVar == null) {
            synchronized (zzaxr.class) {
                zziheVar = zzi;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzh);
                    zzi = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
