package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgqr();
        }
        zzgqq zzgqqVar = null;
        if (iOrdinal == 4) {
            return new zzgqp(zzgqqVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgqr.class) {
                try {
                    zzgxbVar = zzb;
                    if (zzgxbVar == null) {
                        zzgxbVar = new zzgxb(zza);
                        zzb = zzgxbVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxbVar;
    }

    public final zzgqu zzf() {
        zzgqu zzgquVar = this.zzd;
        return zzgquVar == null ? zzgqu.zzd() : zzgquVar;
    }
}
