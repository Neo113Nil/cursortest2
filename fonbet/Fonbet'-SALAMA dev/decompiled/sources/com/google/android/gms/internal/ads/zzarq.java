package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzarq extends zzgxg implements zzgys {
    public static final /* synthetic */ int zza = 0;
    private static final zzarq zzb;
    private static volatile zzgyz zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzarq zzarqVar = new zzarq();
        zzb = zzarqVar;
        zzgxg.zzbZ(zzarq.class, zzarqVar);
    }

    private zzarq() {
    }

    public static zzarq zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzarq();
        }
        zzarp zzarpVar = null;
        if (ordinal == 4) {
            return new zzaro(zzarpVar);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzc;
        if (zzgyzVar == null) {
            synchronized (zzarq.class) {
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
