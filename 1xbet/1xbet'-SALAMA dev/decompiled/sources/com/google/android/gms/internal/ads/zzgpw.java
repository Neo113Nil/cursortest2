package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgpw extends zzgxg implements zzgys {
    private static final zzgpw zza;
    private static volatile zzgyz zzb;
    private int zzc;

    static {
        zzgpw zzgpwVar = new zzgpw();
        zza = zzgpwVar;
        zzgxg.zzbZ(zzgpw.class, zzgpwVar);
    }

    private zzgpw() {
    }

    public static zzgpu zzb() {
        return (zzgpu) zza.zzaZ();
    }

    public static zzgpw zzd() {
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
            return new zzgpw();
        }
        zzgpv zzgpvVar = null;
        if (iOrdinal == 4) {
            return new zzgpu(zzgpvVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgpw.class) {
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
