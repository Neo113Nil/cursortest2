package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgqf extends zzgxg implements zzgys {
    private static final zzgqf zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgql zze;
    private zzgvy zzf = zzgvy.zzb;

    static {
        zzgqf zzgqfVar = new zzgqf();
        zza = zzgqfVar;
        zzgxg.zzbZ(zzgqf.class, zzgqfVar);
    }

    private zzgqf() {
    }

    public static zzgqd zzb() {
        return (zzgqd) zza.zzaZ();
    }

    public static zzgqf zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgqf zzgqfVar, zzgql zzgqlVar) {
        zzgqlVar.getClass();
        zzgqfVar.zze = zzgqlVar;
        zzgqfVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgqf();
        }
        zzgqe zzgqeVar = null;
        if (iOrdinal == 4) {
            return new zzgqd(zzgqeVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgqf.class) {
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

    public final zzgql zzf() {
        zzgql zzgqlVar = this.zze;
        return zzgqlVar == null ? zzgql.zzd() : zzgqlVar;
    }

    public final zzgvy zzg() {
        return this.zzf;
    }
}
