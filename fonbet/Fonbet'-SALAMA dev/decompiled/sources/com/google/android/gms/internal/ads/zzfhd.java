package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfhd extends zzgxg implements zzgys {
    private static final zzfhd zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zze;
    private String zzd = "";
    private String zzf = "";

    static {
        zzfhd zzfhdVar = new zzfhd();
        zza = zzfhdVar;
        zzgxg.zzbZ(zzfhd.class, zzfhdVar);
    }

    private zzfhd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzfhd();
        }
        zzfhc zzfhcVar = null;
        if (ordinal == 4) {
            return new zzfhb(zzfhcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzfhd.class) {
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
