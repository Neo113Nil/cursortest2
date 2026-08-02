package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhda extends zzgxg implements zzgys {
    private static final zzhda zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        zzhda zzhdaVar = new zzhda();
        zza = zzhdaVar;
        zzgxg.zzbZ(zzhda.class, zzhdaVar);
    }

    private zzhda() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", zzhcz.zza, "zze"});
        }
        if (ordinal == 3) {
            return new zzhda();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhcy(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhda.class) {
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
