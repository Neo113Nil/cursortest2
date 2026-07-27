package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhsy extends zzifm implements zzigx {
    private static final zzhsy zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhsy zzhsyVar = new zzhsy();
        zzd = zzhsyVar;
        zzifm.zzbu(zzhsy.class, zzhsyVar);
    }

    private zzhsy() {
    }

    public static zzhsx zzb() {
        return (zzhsx) zzd.zzbn();
    }

    public static zzhsy zzc() {
        return zzd;
    }

    public final zzhtl zza() {
        zzhtl zzb = zzhtl.zzb(this.zza);
        return zzb == null ? zzhtl.UNRECOGNIZED : zzb;
    }

    final /* synthetic */ void zzd(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsx(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhsy.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb = zzhtk.zza(i);
    }

    final /* synthetic */ void zzj(int i) {
        this.zzc = zzhtd.zza(i);
    }
}
