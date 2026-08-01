package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhtn extends zzifm implements zzigx {
    private static final zzhtn zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhtr zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhtn zzhtnVar = new zzhtn();
        zze = zzhtnVar;
        zzifm.zzbu(zzhtn.class, zzhtnVar);
    }

    private zzhtn() {
    }

    public static zzhtn zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhtn) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhtm zze() {
        return (zzhtm) zze.zzbn();
    }

    public static zzhtn zzg() {
        return zze;
    }

    public static zzihe zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtr zzb() {
        zzhtr zzhtrVar = this.zzc;
        return zzhtrVar == null ? zzhtr.zzd() : zzhtrVar;
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
            return new zzhtn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtm(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhtn.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzi(zzhtr zzhtrVar) {
        zzhtrVar.getClass();
        this.zzc = zzhtrVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzj(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }
}
