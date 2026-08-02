package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgsr extends zzgxg implements zzgys {
    private static final zzgsr zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgxs zzd = zzgxg.zzbK();

    static {
        zzgsr zzgsrVar = new zzgsr();
        zza = zzgsrVar;
        zzgxg.zzbZ(zzgsr.class, zzgsrVar);
    }

    private zzgsr() {
    }

    public static zzgsn zza() {
        return (zzgsn) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzgsr zzgsrVar, zzgsp zzgspVar) {
        zzgspVar.getClass();
        zzgxs zzgxsVar = zzgsrVar.zzd;
        if (!zzgxsVar.zzc()) {
            zzgsrVar.zzd = zzgxg.zzbL(zzgxsVar);
        }
        zzgsrVar.zzd.add(zzgspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgsp.class});
        }
        if (ordinal == 3) {
            return new zzgsr();
        }
        zzgsq zzgsqVar = null;
        if (ordinal == 4) {
            return new zzgsn(zzgsqVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgsr.class) {
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
