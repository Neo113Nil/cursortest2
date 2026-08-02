package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new zzgtq();
        }
        zzgtp zzgtpVar = null;
        if (ordinal == 4) {
            return new zzgto(zzgtpVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgtq.class) {
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
}
