package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzarg extends zzgxg implements zzgys {
    private static final zzarg zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd = 2;

    static {
        zzarg zzargVar = new zzarg();
        zza = zzargVar;
        zzgxg.zzbZ(zzarg.class, zzargVar);
    }

    private zzarg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", zzarh.zza});
        }
        if (ordinal == 3) {
            return new zzarg();
        }
        zzark zzarkVar = null;
        if (ordinal == 4) {
            return new zzarf(zzarkVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzarg.class) {
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
