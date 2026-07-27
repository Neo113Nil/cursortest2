package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbep extends zzifm implements zzigx {
    private static final zzbep zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzbet zzb;
    private zziei zzc = zziei.zza;
    private long zzd;
    private long zze;

    static {
        zzbep zzbepVar = new zzbep();
        zzf = zzbepVar;
        zzifm.zzbu(zzbep.class, zzbepVar);
    }

    private zzbep() {
    }

    public static zzbep zzd() {
        return zzf;
    }

    public final zzbet zza() {
        zzbet zzbetVar = this.zzb;
        return zzbetVar == null ? zzbet.zzc() : zzbetVar;
    }

    public final zziei zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzbep();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbeo(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzbep.class) {
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
