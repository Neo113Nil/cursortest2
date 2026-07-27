package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhth extends zzifm implements zzigx {
    private static final zzhth zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zziei zzc = zziei.zza;
    private zzhtj zzd;

    static {
        zzhth zzhthVar = new zzhth();
        zze = zzhthVar;
        zzifm.zzbu(zzhth.class, zzhthVar);
    }

    private zzhth() {
    }

    public static zzhth zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhth) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhtg zze() {
        return (zzhtg) zze.zzbn();
    }

    public static zzihe zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zziei zzb() {
        return this.zzc;
    }

    public final zzhtj zzc() {
        zzhtj zzhtjVar = this.zzd;
        return zzhtjVar == null ? zzhtj.zze() : zzhtjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhth();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtg(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhth.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzc = zzieiVar;
    }

    final /* synthetic */ void zzi(zzhtj zzhtjVar) {
        zzhtjVar.getClass();
        this.zzd = zzhtjVar;
        this.zza |= 1;
    }
}
