package com.google.android.gms.internal.ads;

import io.sentry.logger.LoggerBatchProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class zzarn extends zzgxg implements zzgys {
    private static final zzarn zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private boolean zzd;
    private int zze = LoggerBatchProcessor.FLUSH_AFTER_MS;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzarn zzarnVar = new zzarn();
        zza = zzarnVar;
        zzgxg.zzbZ(zzarn.class, zzarnVar);
    }

    private zzarn() {
    }

    public static zzarn zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzarn();
        }
        zzarm zzarmVar = null;
        if (iOrdinal == 4) {
            return new zzarl(zzarmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzarn.class) {
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

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzf;
    }

    public final boolean zzh() {
        return this.zzh;
    }
}
