package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzgth extends zzgxg implements zzgys {
    public static final /* synthetic */ int zza = 0;
    private static final zzgth zzb;
    private static volatile zzgyz zzc;
    private String zzd = "";
    private zzgxs zze = zzgxg.zzbK();

    static {
        zzgth zzgthVar = new zzgth();
        zzb = zzgthVar;
        zzgxg.zzbZ(zzgth.class, zzgthVar);
    }

    private zzgth() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgsh.class});
        }
        if (ordinal == 3) {
            return new zzgth();
        }
        zzgtg zzgtgVar = null;
        if (ordinal == 4) {
            return new zzgtf(zzgtgVar);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzc;
        if (zzgyzVar == null) {
            synchronized (zzgth.class) {
                try {
                    zzgyzVar = zzc;
                    if (zzgyzVar == null) {
                        zzgyzVar = new zzgxb(zzb);
                        zzc = zzgyzVar;
                    }
                } finally {
                }
            }
        }
        return zzgyzVar;
    }
}
