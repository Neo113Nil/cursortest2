package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzayd extends zzifm implements zzigx {
    private static final zzayd zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzayd zzaydVar = new zzayd();
        zzc = zzaydVar;
        zzifm.zzbu(zzayd.class, zzaydVar);
    }

    private zzayd() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zza", "zzb", zzayg.zza});
        }
        if (ordinal == 3) {
            return new zzayd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayc(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzayd.class) {
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
