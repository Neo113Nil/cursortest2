package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgqc();
        }
        zzgqb zzgqbVar = null;
        if (ordinal == 4) {
            return new zzgqa(zzgqbVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgqc.class) {
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

    public final zzgrt zzf() {
        zzgrt zzgrtVar = this.zze;
        return zzgrtVar == null ? zzgrt.zzf() : zzgrtVar;
    }
}
