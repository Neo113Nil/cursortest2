package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgtw extends zzgxg implements zzgys {
    private static final zzgtw zza;
    private static volatile zzgyz zzb;
    private int zzc;

    static {
        zzgtw zzgtwVar = new zzgtw();
        zza = zzgtwVar;
        zzgxg.zzbZ(zzgtw.class, zzgtwVar);
    }

    private zzgtw() {
    }

    public static zzgtw zzc() {
        return zza;
    }

    public static zzgtw zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgtw) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgtw();
        }
        zzgtv zzgtvVar = null;
        if (iOrdinal == 4) {
            return new zzgtu(zzgtvVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgtw.class) {
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
