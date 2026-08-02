package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzasb extends zzgxg implements zzgys {
    private static final zzasb zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzd = -1;

    static {
        zzasb zzasbVar = new zzasb();
        zza = zzasbVar;
        zzgxg.zzbZ(zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzasb();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzasa(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzasb.class) {
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
