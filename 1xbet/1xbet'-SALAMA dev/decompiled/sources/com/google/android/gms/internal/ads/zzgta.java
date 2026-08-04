package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgta();
        }
        zzgsz zzgszVar = null;
        if (iOrdinal == 4) {
            return new zzgsy(zzgszVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgta.class) {
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

    public final zzgtd zzf() {
        zzgtd zzgtdVar = this.zze;
        return zzgtdVar == null ? zzgtd.zzd() : zzgtdVar;
    }
}
