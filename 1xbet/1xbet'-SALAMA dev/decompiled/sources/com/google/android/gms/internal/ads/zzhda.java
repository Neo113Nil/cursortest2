package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", zzhcz.zza, "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhda();
        }
        zzhdm zzhdmVar = null;
        if (iOrdinal == 4) {
            return new zzhcy(zzhdmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhda.class) {
                try {
                    zzgxbVar = zzb;
                    if (zzgxbVar == null) {
                        zzgxbVar = new zzgxb(zza);
                        zzb = zzgxbVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxbVar;
    }
}
