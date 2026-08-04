package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzash extends zzgxg implements zzgys {
    private static final zzash zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = zzbbd.zzq.zzf;

    static {
        zzash zzashVar = new zzash();
        zza = zzashVar;
        zzgxg.zzbZ(zzash.class, zzashVar);
    }

    private zzash() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", zzass.zza});
        }
        if (iOrdinal == 3) {
            return new zzash();
        }
        zzatc zzatcVar = null;
        if (iOrdinal == 4) {
            return new zzasg(zzatcVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzash.class) {
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
