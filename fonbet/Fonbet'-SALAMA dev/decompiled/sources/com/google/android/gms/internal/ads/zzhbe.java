package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhbe();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhbd(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhbe.class) {
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
