package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzgxm zzgxmVar = zzass.zza;
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzgxmVar, "zzf", zzgxmVar});
        }
        if (ordinal == 3) {
            return new zzarz();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzary(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzarz.class) {
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
