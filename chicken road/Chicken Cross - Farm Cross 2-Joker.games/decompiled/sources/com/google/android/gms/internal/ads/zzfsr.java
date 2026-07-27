package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfsr extends zzifm implements zzigx {
    private static final zzfsr zzf;
    private static volatile zzihe zzg;
    private long zza;
    private long zzb;
    private zzify zzc = zzbM();
    private zzify zzd = zzbM();
    private zzify zze = zzbM();

    static {
        zzfsr zzfsrVar = new zzfsr();
        zzf = zzfsrVar;
        zzifm.zzbu(zzfsr.class, zzfsrVar);
    }

    private zzfsr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfsr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfsq(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzfsr.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
