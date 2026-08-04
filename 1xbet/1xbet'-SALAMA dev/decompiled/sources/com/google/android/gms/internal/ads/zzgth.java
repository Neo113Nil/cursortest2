package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgsh.class});
        }
        if (iOrdinal == 3) {
            return new zzgth();
        }
        zzgtg zzgtgVar = null;
        if (iOrdinal == 4) {
            return new zzgtf(zzgtgVar);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzc;
        if (zzgxbVar == null) {
            synchronized (zzgth.class) {
                try {
                    zzgxbVar = zzc;
                    if (zzgxbVar == null) {
                        zzgxbVar = new zzgxb(zzb);
                        zzc = zzgxbVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxbVar;
    }
}
