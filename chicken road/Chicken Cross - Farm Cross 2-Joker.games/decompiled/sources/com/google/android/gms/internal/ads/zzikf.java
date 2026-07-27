package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzikf extends zzifm implements zzigx {
    private static final zzikf zze;
    private static volatile zzihe zzf;
    private int zza;
    private zziei zzb;
    private zziei zzc;
    private zziei zzd;

    static {
        zzikf zzikfVar = new zzikf();
        zze = zzikfVar;
        zzifm.zzbu(zzikf.class, zzikfVar);
    }

    private zzikf() {
        zziei zzieiVar = zziei.zza;
        this.zzb = zzieiVar;
        this.zzc = zzieiVar;
        this.zzd = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzikf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzike(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzikf.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
