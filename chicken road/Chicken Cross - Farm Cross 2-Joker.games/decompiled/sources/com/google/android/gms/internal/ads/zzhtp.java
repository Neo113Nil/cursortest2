package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhtp extends zzifm implements zzigx {
    private static final zzhtp zze;
    private static volatile zzihe zzf;
    private int zza;
    private zzhtr zzb;
    private int zzc;
    private int zzd;

    static {
        zzhtp zzhtpVar = new zzhtp();
        zze = zzhtpVar;
        zzifm.zzbu(zzhtp.class, zzhtpVar);
    }

    private zzhtp() {
    }

    public static zzhtp zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhtp) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhto zze() {
        return (zzhto) zze.zzbn();
    }

    public static zzhtp zzg() {
        return zze;
    }

    public final zzhtr zza() {
        zzhtr zzhtrVar = this.zzb;
        return zzhtrVar == null ? zzhtr.zzd() : zzhtrVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhtp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhto(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhtp.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(zzhtr zzhtrVar) {
        zzhtrVar.getClass();
        this.zzb = zzhtrVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
