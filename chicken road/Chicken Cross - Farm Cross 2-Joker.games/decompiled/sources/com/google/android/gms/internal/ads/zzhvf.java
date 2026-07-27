package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhvf extends zzifm implements zzigx {
    private static final zzhvf zzj;
    private static volatile zzihe zzk;
    private int zza;
    private int zzb;
    private zzhvh zzc;
    private zziei zzd;
    private zziei zze;
    private zziei zzf;
    private zziei zzg;
    private zziei zzh;
    private zziei zzi;

    static {
        zzhvf zzhvfVar = new zzhvf();
        zzj = zzhvfVar;
        zzifm.zzbu(zzhvf.class, zzhvfVar);
    }

    private zzhvf() {
        zziei zzieiVar = zziei.zza;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
        this.zzf = zzieiVar;
        this.zzg = zzieiVar;
        this.zzh = zzieiVar;
        this.zzi = zzieiVar;
    }

    public static zzhvf zzj(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhvf) zzifm.zzbT(zzj, zzieiVar, zziewVar);
    }

    public static zzhve zzk() {
        return (zzhve) zzj.zzbn();
    }

    public static zzihe zzl() {
        return zzj.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhvh zzb() {
        zzhvh zzhvhVar = this.zzc;
        return zzhvhVar == null ? zzhvh.zzh() : zzhvhVar;
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
            return zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzhvf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhve(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzk;
        if (zziheVar == null) {
            synchronized (zzhvf.class) {
                zziheVar = zzk;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzj);
                    zzk = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    public final zziei zze() {
        return this.zzf;
    }

    public final zziei zzg() {
        return this.zzg;
    }

    public final zziei zzh() {
        return this.zzh;
    }

    public final zziei zzi() {
        return this.zzi;
    }

    final /* synthetic */ void zzm(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzn(zzhvh zzhvhVar) {
        zzhvhVar.getClass();
        this.zzc = zzhvhVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzo(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    final /* synthetic */ void zzp(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zze = zzieiVar;
    }

    final /* synthetic */ void zzq(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzf = zzieiVar;
    }

    final /* synthetic */ void zzr(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzg = zzieiVar;
    }

    final /* synthetic */ void zzs(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzh = zzieiVar;
    }

    final /* synthetic */ void zzt(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzi = zzieiVar;
    }
}
