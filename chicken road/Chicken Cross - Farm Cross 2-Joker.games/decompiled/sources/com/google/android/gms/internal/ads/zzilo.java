package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzilo extends zzifm implements zzigx {
    private static final zzilo zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        zzilo zziloVar = new zzilo();
        zzd = zziloVar;
        zzifm.zzbu(zzilo.class, zziloVar);
    }

    private zzilo() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", zziln.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzilo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzilm(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzilo.class) {
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
