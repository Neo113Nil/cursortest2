package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzimk extends zzifm implements zzigx {
    private static final zzimk zzd;
    private static volatile zzihe zze;
    private int zza;
    private String zzb = "";
    private int zzc;

    static {
        zzimk zzimkVar = new zzimk();
        zzd = zzimkVar;
        zzifm.zzbu(zzimk.class, zzimkVar);
    }

    private zzimk() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzimx.zza});
        }
        if (ordinal == 3) {
            return new zzimk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzimj(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzimk.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
