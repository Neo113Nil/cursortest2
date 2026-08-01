package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhtj extends zzifm implements zzigx {
    private static final zzhtj zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.zza;

    static {
        zzhtj zzhtjVar = new zzhtj();
        zzc = zzhtjVar;
        zzifm.zzbu(zzhtj.class, zzhtjVar);
    }

    private zzhtj() {
    }

    public static zzhtj zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhtj) zzifm.zzbT(zzc, zzieiVar, zziewVar);
    }

    public static zzhti zzd() {
        return (zzhti) zzc.zzbn();
    }

    public static zzhtj zze() {
        return zzc;
    }

    public static zzihe zzg() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zziei zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhtj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhti(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzhtj.class) {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }
}
