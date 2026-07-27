package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhvb extends zzifm implements zzigx {
    private static final zzhvb zze;
    private static volatile zzihe zzf;
    private int zza;
    private zzhvd zzb;
    private int zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhvb zzhvbVar = new zzhvb();
        zze = zzhvbVar;
        zzifm.zzbu(zzhvb.class, zzhvbVar);
    }

    private zzhvb() {
    }

    public static zzhvb zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhvb) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhva zze() {
        return (zzhva) zze.zzbn();
    }

    public final zzhvd zza() {
        zzhvd zzhvdVar = this.zzb;
        return zzhvdVar == null ? zzhvd.zze() : zzhvdVar;
    }

    public final int zzb() {
        return this.zzc;
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
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhvb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhva(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhvb.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(zzhvd zzhvdVar) {
        zzhvdVar.getClass();
        this.zzb = zzhvdVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzc = i;
    }

    final /* synthetic */ void zzi(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }
}
