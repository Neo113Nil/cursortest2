package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfqr extends zzifm implements zzigx {
    private static final zzfqr zzg;
    private static volatile zzihe zzh;
    private long zza;
    private zzifu zzb = zzbC();
    private zzify zzc = zzbM();
    private zzify zzd = zzbM();
    private zzify zze = zzbM();
    private zzify zzf = zzbM();

    static {
        zzfqr zzfqrVar = new zzfqr();
        zzg = zzfqrVar;
        zzifm.zzbu(zzfqr.class, zzfqrVar);
    }

    private zzfqr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzfqr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfqq(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzh;
        if (zziheVar == null) {
            synchronized (zzfqr.class) {
                zziheVar = zzh;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzg);
                    zzh = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
