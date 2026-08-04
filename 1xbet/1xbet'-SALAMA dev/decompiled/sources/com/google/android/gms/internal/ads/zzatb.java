package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzatb extends zzgxg implements zzgys {
    private static final zzatb zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgxs zzd = zzgxg.zzbK();
    private zzgvy zze = zzgvy.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzatb zzatbVar = new zzatb();
        zza = zzatbVar;
        zzgxg.zzbZ(zzatb.class, zzatbVar);
    }

    private zzatb() {
    }

    public static zzata zza() {
        return (zzata) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzatb zzatbVar, zzgvy zzgvyVar) {
        zzgxs zzgxsVar = zzatbVar.zzd;
        if (!zzgxsVar.zzc()) {
            zzatbVar.zzd = zzgxg.zzbL(zzgxsVar);
        }
        zzatbVar.zzd.add(zzgvyVar);
    }

    public static /* synthetic */ void zzd(zzatb zzatbVar, zzgvy zzgvyVar) {
        zzatbVar.zzc |= 1;
        zzatbVar.zze = zzgvyVar;
    }

    public static /* synthetic */ void zzf(zzatb zzatbVar, int i7) {
        zzatbVar.zzg = i7 - 1;
        zzatbVar.zzc |= 4;
    }

    public static /* synthetic */ void zzg(zzatb zzatbVar, int i7) {
        zzatbVar.zzf = 4;
        zzatbVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzasv.zza, "zzg", zzasr.zza});
        }
        if (iOrdinal == 3) {
            return new zzatb();
        }
        zzatc zzatcVar = null;
        if (iOrdinal == 4) {
            return new zzata(zzatcVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzatb.class) {
                try {
                    zzgxbVar = zzb;
                    if (zzgxbVar == null) {
                        zzgxbVar = new zzgxb(zza);
                        zzb = zzgxbVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxbVar;
    }
}
