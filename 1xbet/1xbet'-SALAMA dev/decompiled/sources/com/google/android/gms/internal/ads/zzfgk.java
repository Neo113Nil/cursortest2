package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfgk extends zzgxg implements zzgys {
    private static final zzfgk zza;
    private static volatile zzgyz zzb;
    private zzgxs zzc = zzgxg.zzbK();

    static {
        zzfgk zzfgkVar = new zzfgk();
        zza = zzfgkVar;
        zzgxg.zzbZ(zzfgk.class, zzfgkVar);
    }

    private zzfgk() {
    }

    public static zzfgg zzb() {
        return (zzfgg) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzfgk zzfgkVar, zzfgi zzfgiVar) {
        zzfgiVar.getClass();
        zzgxs zzgxsVar = zzfgkVar.zzc;
        if (!zzgxsVar.zzc()) {
            zzfgkVar.zzc = zzgxg.zzbL(zzgxsVar);
        }
        zzfgkVar.zzc.add(zzfgiVar);
    }

    public final int zza() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfgi.class});
        }
        if (iOrdinal == 3) {
            return new zzfgk();
        }
        zzfgj zzfgjVar = null;
        if (iOrdinal == 4) {
            return new zzfgg(zzfgjVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzfgk.class) {
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
