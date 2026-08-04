package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgqx extends zzgxg implements zzgys {
    private static final zzgqx zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgvy zzd = zzgvy.zzb;

    static {
        zzgqx zzgqxVar = new zzgqx();
        zza = zzgqxVar;
        zzgxg.zzbZ(zzgqx.class, zzgqxVar);
    }

    private zzgqx() {
    }

    public static zzgqv zzb() {
        return (zzgqv) zza.zzaZ();
    }

    public static zzgqx zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgqx) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzg() {
        return zza.zzbN();
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
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzgqx();
        }
        zzgqw zzgqwVar = null;
        if (iOrdinal == 4) {
            return new zzgqv(zzgqwVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgqx.class) {
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

    public final zzgvy zzf() {
        return this.zzd;
    }
}
