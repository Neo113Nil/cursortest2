package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgrm extends zzgxg implements zzgys {
    private static final zzgrm zza;
    private static volatile zzgyz zzb;

    static {
        zzgrm zzgrmVar = new zzgrm();
        zza = zzgrmVar;
        zzgxg.zzbZ(zzgrm.class, zzgrmVar);
    }

    private zzgrm() {
    }

    public static zzgrm zzb() {
        return zza;
    }

    public static zzgrm zzc(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgrm) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        zzgrl zzgrlVar = null;
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new zzgrm();
        }
        if (ordinal == 4) {
            return new zzgrk(zzgrlVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgrm.class) {
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
