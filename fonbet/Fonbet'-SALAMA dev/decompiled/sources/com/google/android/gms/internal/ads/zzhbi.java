package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhbi extends zzgxg implements zzgys {
    private static final zzhbi zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzhbh zze;
    private long zzf;
    private String zzd = "";
    private String zzg = "";

    static {
        zzhbi zzhbiVar = new zzhbi();
        zza = zzhbiVar;
        zzgxg.zzbZ(zzhbi.class, zzhbiVar);
    }

    private zzhbi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzhbi();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhbf(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhbi.class) {
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
