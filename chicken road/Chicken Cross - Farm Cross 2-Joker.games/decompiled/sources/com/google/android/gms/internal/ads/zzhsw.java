package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhsw extends zzifm implements zzigx {
    private static final zzhsw zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsy zzb;
    private int zzc;

    static {
        zzhsw zzhswVar = new zzhsw();
        zzd = zzhswVar;
        zzifm.zzbu(zzhsw.class, zzhswVar);
    }

    private zzhsw() {
    }

    public static zzhsw zzb(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhsw) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhsv zzc() {
        return (zzhsv) zzd.zzbn();
    }

    public final zzhsy zza() {
        zzhsy zzhsyVar = this.zzb;
        return zzhsyVar == null ? zzhsy.zzc() : zzhsyVar;
    }

    final /* synthetic */ void zzd(zzhsy zzhsyVar) {
        zzhsyVar.getClass();
        this.zzb = zzhsyVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsv(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhsw.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
