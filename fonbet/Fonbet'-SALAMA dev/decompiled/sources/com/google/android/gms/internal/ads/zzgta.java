package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgta extends zzgxg implements zzgys {
    private static final zzgta zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgtd zze;

    static {
        zzgta zzgtaVar = new zzgta();
        zza = zzgtaVar;
        zzgxg.zzbZ(zzgta.class, zzgtaVar);
    }

    private zzgta() {
    }

    public static zzgsy zzb() {
        return (zzgsy) zza.zzaZ();
    }

    public static zzgta zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgta) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgta zzgtaVar, zzgtd zzgtdVar) {
        zzgtdVar.getClass();
        zzgtaVar.zze = zzgtdVar;
        zzgtaVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgta();
        }
        zzgsz zzgszVar = null;
        if (ordinal == 4) {
            return new zzgsy(zzgszVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgta.class) {
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

    public final zzgtd zzf() {
        zzgtd zzgtdVar = this.zze;
        return zzgtdVar == null ? zzgtd.zzd() : zzgtdVar;
    }
}
