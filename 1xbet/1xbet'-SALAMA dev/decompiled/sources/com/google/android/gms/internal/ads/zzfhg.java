package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfhg extends zzgxg implements zzgys {
    private static final zzfhg zza;
    private static volatile zzgyz zzb;
    private zzgxs zzc = zzgxg.zzbK();

    static {
        zzfhg zzfhgVar = new zzfhg();
        zza = zzfhgVar;
        zzgxg.zzbZ(zzfhg.class, zzfhgVar);
    }

    private zzfhg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfhd.class});
        }
        if (iOrdinal == 3) {
            return new zzfhg();
        }
        zzfhf zzfhfVar = null;
        if (iOrdinal == 4) {
            return new zzfhe(zzfhfVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfhg.class) {
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
