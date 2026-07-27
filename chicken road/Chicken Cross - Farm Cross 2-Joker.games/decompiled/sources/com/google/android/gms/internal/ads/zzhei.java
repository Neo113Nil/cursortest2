package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhei extends zzifm implements zzigx {
    private static final zzhei zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzhef zzb;
    private zzihy zzc;
    private zzify zzd = zzbM();
    private zzifx zze = zzbE();

    static {
        zzhei zzheiVar = new zzhei();
        zzf = zzheiVar;
        zzifm.zzbu(zzhei.class, zzheiVar);
    }

    private zzhei() {
    }

    public static zzheh zza() {
        return (zzheh) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzhef zzhefVar) {
        zzhefVar.getClass();
        this.zzb = zzhefVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzc(Iterable iterable) {
        zzifx zzifxVar = this.zze;
        if (!zzifxVar.zza()) {
            this.zze = zzifm.zzbF(zzifxVar);
        }
        zzidr.zzaW(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", zzihy.class, "zze"});
        }
        if (ordinal == 3) {
            return new zzhei();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzheh(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzhei.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
