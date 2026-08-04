package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgsx();
        }
        zzgsw zzgswVar = null;
        if (iOrdinal == 4) {
            return new zzgsv(zzgswVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgsx.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
