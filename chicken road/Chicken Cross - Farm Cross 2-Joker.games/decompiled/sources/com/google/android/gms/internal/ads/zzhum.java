package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhum extends zzifm implements zzigx {
    private static final zzhum zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhuo zzc;

    static {
        zzhum zzhumVar = new zzhum();
        zzd = zzhumVar;
        zzifm.zzbu(zzhum.class, zzhumVar);
    }

    private zzhum() {
    }

    public static zzhum zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhum) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhul zzd() {
        return (zzhul) zzd.zzbn();
    }

    public static zzihe zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuo zzb() {
        zzhuo zzhuoVar = this.zzc;
        return zzhuoVar == null ? zzhuo.zze() : zzhuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhum();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhul(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhum.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(zzhuo zzhuoVar) {
        zzhuoVar.getClass();
        this.zzc = zzhuoVar;
        this.zza |= 1;
    }
}
