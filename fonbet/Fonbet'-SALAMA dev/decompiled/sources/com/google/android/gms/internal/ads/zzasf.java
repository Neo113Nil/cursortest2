package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzasf extends zzgxg implements zzgys {
    private static final zzasf zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        zzasf zzasfVar = new zzasf();
        zza = zzasfVar;
        zzgxg.zzbZ(zzasf.class, zzasfVar);
    }

    private zzasf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", zzarv.zza, "zze"});
        }
        if (ordinal == 3) {
            return new zzasf();
        }
        zzatc zzatcVar = null;
        if (ordinal == 4) {
            return new zzase(zzatcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzasf.class) {
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
