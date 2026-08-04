package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgqo extends zzgxg implements zzgys {
    private static final zzgqo zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgqu zze;
    private zzgvy zzf = zzgvy.zzb;

    static {
        zzgqo zzgqoVar = new zzgqo();
        zza = zzgqoVar;
        zzgxg.zzbZ(zzgqo.class, zzgqoVar);
    }

    private zzgqo() {
    }

    public static zzgqm zzb() {
        return (zzgqm) zza.zzaZ();
    }

    public static zzgqo zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgqo) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgqo zzgqoVar, zzgqu zzgquVar) {
        zzgquVar.getClass();
        zzgqoVar.zze = zzgquVar;
        zzgqoVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgqo();
        }
        zzgqn zzgqnVar = null;
        if (iOrdinal == 4) {
            return new zzgqm(zzgqnVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgqo.class) {
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
        zzgqu zzgquVar = this.zze;
        return zzgquVar == null ? zzgqu.zzd() : zzgquVar;
    }

    public final zzgvy zzg() {
        return this.zzf;
    }
}
