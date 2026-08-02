package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgsx extends zzgxg implements zzgys {
    private static final zzgsx zza;
    private static volatile zzgyz zzb;
    private String zzc = "";

    static {
        zzgsx zzgsxVar = new zzgsx();
        zza = zzgsxVar;
        zzgxg.zzbZ(zzgsx.class, zzgsxVar);
    }

    private zzgsx() {
    }

    public static zzgsv zza() {
        return (zzgsv) zza.zzaZ();
    }

    public static zzgsx zzc() {
        return zza;
    }

    public static zzgsx zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgsx) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzg(zzgsx zzgsxVar, String str) {
        str.getClass();
        zzgsxVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new zzgsx();
        }
        zzgsw zzgswVar = null;
        if (ordinal == 4) {
            return new zzgsv(zzgswVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgsx.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
