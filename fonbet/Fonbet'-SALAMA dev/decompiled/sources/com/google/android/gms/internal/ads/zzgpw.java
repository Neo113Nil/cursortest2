package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (ordinal == 3) {
            return new zzgpw();
        }
        zzgpv zzgpvVar = null;
        if (ordinal == 4) {
            return new zzgpu(zzgpvVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgpw.class) {
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
