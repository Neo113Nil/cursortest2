package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhse extends zzifm implements zzigx {
    private static final zzhse zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhsi zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhse zzhseVar = new zzhse();
        zze = zzhseVar;
        zzifm.zzbu(zzhse.class, zzhseVar);
    }

    private zzhse() {
    }

    public static zzhse zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhse) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhsd zze() {
        return (zzhsd) zze.zzbn();
    }

    public static zzihe zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsi zzb() {
        zzhsi zzhsiVar = this.zzc;
        return zzhsiVar == null ? zzhsi.zzc() : zzhsiVar;
    }

    public final zziei zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhse();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsd(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhse.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(zzhsi zzhsiVar) {
        zzhsiVar.getClass();
        this.zzc = zzhsiVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }
}
