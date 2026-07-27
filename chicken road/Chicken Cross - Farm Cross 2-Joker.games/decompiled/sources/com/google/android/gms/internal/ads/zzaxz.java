package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaxz extends zzifm implements zzigx {
    private static final zzaxz zzg;
    private static volatile zzihe zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzaxz zzaxzVar = new zzaxz();
        zzg = zzaxzVar;
        zzifm.zzbu(zzaxz.class, zzaxzVar);
    }

    private zzaxz() {
    }

    public static zzaxz zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzaxz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxy(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzh;
        if (zziheVar == null) {
            synchronized (zzaxz.class) {
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
