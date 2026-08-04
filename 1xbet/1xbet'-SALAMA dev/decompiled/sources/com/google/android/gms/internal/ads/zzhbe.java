package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhbe extends zzgxg implements zzgys {
    private static final zzhbe zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhbe zzhbeVar = new zzhbe();
        zza = zzhbeVar;
        zzgxg.zzbZ(zzhbe.class, zzhbeVar);
    }

    private zzhbe() {
    }

    public static zzhbd zzc() {
        return (zzhbd) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhbe zzhbeVar, String str) {
        zzhbeVar.zzc |= 1;
        zzhbeVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhbe();
        }
        zzhdm zzhdmVar = null;
        if (iOrdinal == 4) {
            return new zzhbd(zzhdmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhbe.class) {
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
