package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhuz extends zzifm implements zzigx {
    private static final zzhuz zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private zzhuv zzc;
    private zziei zzd;
    private zziei zze;

    static {
        zzhuz zzhuzVar = new zzhuz();
        zzf = zzhuzVar;
        zzifm.zzbu(zzhuz.class, zzhuzVar);
    }

    private zzhuz() {
        zziei zzieiVar = zziei.zza;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
    }

    public static zzhuz zze(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhuz) zzifm.zzbT(zzf, zzieiVar, zziewVar);
    }

    public static zzhuy zzg() {
        return (zzhuy) zzf.zzbn();
    }

    public static zzhuz zzh() {
        return zzf;
    }

    public static zzihe zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuv zzb() {
        zzhuv zzhuvVar = this.zzc;
        return zzhuvVar == null ? zzhuv.zzc() : zzhuvVar;
    }

    public final zziei zzc() {
        return this.zzd;
    }

    public final zziei zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhuz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhuy(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzhuz.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzj(zzhuv zzhuvVar) {
        zzhuvVar.getClass();
        this.zzc = zzhuvVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    final /* synthetic */ void zzl(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zze = zzieiVar;
    }
}
