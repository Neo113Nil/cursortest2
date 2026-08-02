package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzgqf();
        }
        zzgqe zzgqeVar = null;
        if (ordinal == 4) {
            return new zzgqd(zzgqeVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgqf.class) {
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

    public final zzgql zzf() {
        zzgql zzgqlVar = this.zze;
        return zzgqlVar == null ? zzgql.zzd() : zzgqlVar;
    }

    public final zzgvy zzg() {
        return this.zzf;
    }
}
