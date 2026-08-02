package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtw extends zzgxg implements zzgys {
    private static final zzgtw zza;
    private static volatile zzgyz zzb;
    private int zzc;

    static {
        zzgtw zzgtwVar = new zzgtw();
        zza = zzgtwVar;
        zzgxg.zzbZ(zzgtw.class, zzgtwVar);
    }

    private zzgtw() {
    }

    public static zzgtw zzc() {
        return zza;
    }

    public static zzgtw zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgtw) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
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
            return new zzgtw();
        }
        zzgtv zzgtvVar = null;
        if (ordinal == 4) {
            return new zzgtu(zzgtvVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgtw.class) {
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
