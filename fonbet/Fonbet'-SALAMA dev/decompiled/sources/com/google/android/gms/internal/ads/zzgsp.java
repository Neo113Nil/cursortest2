package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgsp extends zzgxg implements zzgys {
    private static final zzgsp zza;
    private static volatile zzgyz zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgsp zzgspVar = new zzgsp();
        zza = zzgspVar;
        zzgxg.zzbZ(zzgsp.class, zzgspVar);
    }

    private zzgsp() {
    }

    public static zzgso zza() {
        return (zzgso) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzgsp zzgspVar, String str) {
        str.getClass();
        zzgspVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzgsp();
        }
        zzgsq zzgsqVar = null;
        if (ordinal == 4) {
            return new zzgso(zzgsqVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgsp.class) {
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
