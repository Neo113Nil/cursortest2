package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzasz extends zzgxg implements zzgys {
    private static final zzasz zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzasz zzaszVar = new zzasz();
        zza = zzaszVar;
        zzgxg.zzbZ(zzasz.class, zzaszVar);
    }

    private zzasz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzasz();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzasy(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzasz.class) {
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
