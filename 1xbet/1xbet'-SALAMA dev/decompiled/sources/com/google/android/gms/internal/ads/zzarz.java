package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzarz extends zzgxg implements zzgys {
    private static final zzarz zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = zzbbd.zzq.zzf;
    private int zzf = zzbbd.zzq.zzf;

    static {
        zzarz zzarzVar = new zzarz();
        zza = zzarzVar;
        zzgxg.zzbZ(zzarz.class, zzarzVar);
    }

    private zzarz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzgxm zzgxmVar = zzass.zza;
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzgxmVar, "zzf", zzgxmVar});
        }
        if (iOrdinal == 3) {
            return new zzarz();
        }
        zzatc zzatcVar = null;
        if (iOrdinal == 4) {
            return new zzary(zzatcVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzarz.class) {
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
}
