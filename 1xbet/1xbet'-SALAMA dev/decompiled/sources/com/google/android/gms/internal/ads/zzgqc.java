package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgqc extends zzgxg implements zzgys {
    private static final zzgqc zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgqi zzd;
    private zzgrt zze;

    static {
        zzgqc zzgqcVar = new zzgqc();
        zza = zzgqcVar;
        zzgxg.zzbZ(zzgqc.class, zzgqcVar);
    }

    private zzgqc() {
    }

    public static zzgqa zza() {
        return (zzgqa) zza.zzaZ();
    }

    public static zzgqc zzc(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgqc) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzg(zzgqc zzgqcVar, zzgqi zzgqiVar) {
        zzgqiVar.getClass();
        zzgqcVar.zzd = zzgqiVar;
        zzgqcVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgqc zzgqcVar, zzgrt zzgrtVar) {
        zzgrtVar.getClass();
        zzgqcVar.zze = zzgrtVar;
        zzgqcVar.zzc |= 2;
    }

    public final zzgqi zzd() {
        zzgqi zzgqiVar = this.zzd;
        return zzgqiVar == null ? zzgqi.zzd() : zzgqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgqc();
        }
        zzgqb zzgqbVar = null;
        if (iOrdinal == 4) {
            return new zzgqa(zzgqbVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgqc.class) {
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

    public final zzgrt zzf() {
        zzgrt zzgrtVar = this.zze;
        return zzgrtVar == null ? zzgrt.zzf() : zzgrtVar;
    }
}
