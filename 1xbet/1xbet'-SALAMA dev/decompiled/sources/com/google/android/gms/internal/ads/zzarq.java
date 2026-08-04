package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzarq();
        }
        zzarp zzarpVar = null;
        if (iOrdinal == 4) {
            return new zzaro(zzarpVar);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzc;
        if (zzgxbVar == null) {
            synchronized (zzarq.class) {
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
