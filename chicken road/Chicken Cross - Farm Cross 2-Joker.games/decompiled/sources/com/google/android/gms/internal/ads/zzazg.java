package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzazg extends zzifm implements zzigx {
    private static final zzazg zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zziei zzb;
    private zziei zzc;
    private zziei zzd;
    private zziei zze;

    static {
        zzazg zzazgVar = new zzazg();
        zzf = zzazgVar;
        zzifm.zzbu(zzazg.class, zzazgVar);
    }

    private zzazg() {
        zziei zzieiVar = zziei.zza;
        this.zzb = zzieiVar;
        this.zzc = zzieiVar;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
    }

    public static zzazg zze(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzazg) zzifm.zzbV(zzf, bArr, zziewVar);
    }

    public static zzazf zzg() {
        return (zzazf) zzf.zzbn();
    }

    public final zziei zza() {
        return this.zzb;
    }

    public final zziei zzb() {
        return this.zzc;
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
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzazg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzazf(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzazg.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 1;
        this.zzb = zzieiVar;
    }

    final /* synthetic */ void zzi(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 2;
        this.zzc = zzieiVar;
    }

    final /* synthetic */ void zzj(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 4;
        this.zzd = zzieiVar;
    }

    final /* synthetic */ void zzk(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 8;
        this.zze = zzieiVar;
    }
}
