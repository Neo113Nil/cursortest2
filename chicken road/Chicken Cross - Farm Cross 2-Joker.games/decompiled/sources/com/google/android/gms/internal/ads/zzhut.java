package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhut extends zzifm implements zzigx {
    private static final zzhut zze;
    private static volatile zzihe zzf;
    private int zza;
    private zzhuv zzb;
    private int zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhut zzhutVar = new zzhut();
        zze = zzhutVar;
        zzifm.zzbu(zzhut.class, zzhutVar);
    }

    private zzhut() {
    }

    public static zzhut zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhut) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhus zze() {
        return (zzhus) zze.zzbn();
    }

    public final zzhuv zza() {
        zzhuv zzhuvVar = this.zzb;
        return zzhuvVar == null ? zzhuv.zzc() : zzhuvVar;
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
            return new zzhut();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhus(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhut.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(zzhuv zzhuvVar) {
        zzhuvVar.getClass();
        this.zzb = zzhuvVar;
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
