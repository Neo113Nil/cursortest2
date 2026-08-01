package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaxo extends zzifm implements zzigx {
    private static final zzaxo zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb = 2;

    static {
        zzaxo zzaxoVar = new zzaxo();
        zzc = zzaxoVar;
        zzifm.zzbu(zzaxo.class, zzaxoVar);
    }

    private zzaxo() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", zzaxp.zza});
        }
        if (ordinal == 3) {
            return new zzaxo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxn(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzaxo.class) {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
