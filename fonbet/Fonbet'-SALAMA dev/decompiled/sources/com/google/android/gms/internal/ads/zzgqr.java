package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgqr extends zzgxg implements zzgys {
    private static final zzgqr zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgqu zzd;
    private int zze;

    static {
        zzgqr zzgqrVar = new zzgqr();
        zza = zzgqrVar;
        zzgxg.zzbZ(zzgqr.class, zzgqrVar);
    }

    private zzgqr() {
    }

    public static zzgqp zzb() {
        return (zzgqp) zza.zzaZ();
    }

    public static zzgqr zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgqr) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzh(zzgqr zzgqrVar, zzgqu zzgquVar) {
        zzgquVar.getClass();
        zzgqrVar.zzd = zzgquVar;
        zzgqrVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgqr();
        }
        zzgqq zzgqqVar = null;
        if (ordinal == 4) {
            return new zzgqp(zzgqqVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgqr.class) {
                try {
                    zzgyzVar = zzb;
                    if (zzgyzVar == null) {
                        zzgyzVar = new zzgxb(zza);
                        zzb = zzgyzVar;
                    }
                } finally {
                }
            }
        }
        return zzgyzVar;
    }

    public final zzgqu zzf() {
        zzgqu zzgquVar = this.zzd;
        return zzgquVar == null ? zzgqu.zzd() : zzgquVar;
    }
}
