package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaso extends zzgxg implements zzgys {
    private static final zzaso zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzgxo zzg = zzgxg.zzbG();
    private long zzh;

    static {
        zzaso zzasoVar = new zzaso();
        zza = zzasoVar;
        zzgxg.zzbZ(zzaso.class, zzasoVar);
    }

    private zzaso() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzaso();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzasn(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzaso.class) {
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
}
