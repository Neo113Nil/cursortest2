package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", zzass.zza});
        }
        if (ordinal == 3) {
            return new zzash();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzasg(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzash.class) {
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
