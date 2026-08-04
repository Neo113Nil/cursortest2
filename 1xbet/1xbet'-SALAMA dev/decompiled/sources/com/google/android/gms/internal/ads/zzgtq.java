package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgtq extends zzgxg implements zzgys {
    private static final zzgtq zza;
    private static volatile zzgyz zzb;
    private int zzc;

    static {
        zzgtq zzgtqVar = new zzgtq();
        zza = zzgtqVar;
        zzgxg.zzbZ(zzgtq.class, zzgtqVar);
    }

    private zzgtq() {
    }

    public static zzgto zzb() {
        return (zzgto) zza.zzaZ();
    }

    public static zzgtq zzd() {
        return zza;
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
            return new zzgtq();
        }
        zzgtp zzgtpVar = null;
        if (iOrdinal == 4) {
            return new zzgto(zzgtpVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgtq.class) {
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
