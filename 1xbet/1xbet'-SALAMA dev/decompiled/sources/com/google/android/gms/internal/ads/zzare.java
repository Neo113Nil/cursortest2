package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzare extends zzgxg implements zzgys {
    private static final zzare zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzarg zzd;
    private zzarj zze;

    static {
        zzare zzareVar = new zzare();
        zza = zzareVar;
        zzgxg.zzbZ(zzare.class, zzareVar);
    }

    private zzare() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzare();
        }
        zzark zzarkVar = null;
        if (iOrdinal == 4) {
            return new zzard(zzarkVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzare.class) {
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
