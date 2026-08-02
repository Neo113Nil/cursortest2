package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtd extends zzgxg implements zzgys {
    private static final zzgtd zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private String zzd = "";
    private zzgse zze;

    static {
        zzgtd zzgtdVar = new zzgtd();
        zza = zzgtdVar;
        zzgxg.zzbZ(zzgtd.class, zzgtdVar);
    }

    private zzgtd() {
    }

    public static zzgtb zzb() {
        return (zzgtb) zza.zzaZ();
    }

    public static zzgtd zzd() {
        return zza;
    }

    public static zzgtd zzf(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgtd) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzh(zzgtd zzgtdVar, zzgse zzgseVar) {
        zzgseVar.getClass();
        zzgtdVar.zze = zzgseVar;
        zzgtdVar.zzc |= 1;
    }

    public static /* synthetic */ void zzi(zzgtd zzgtdVar, String str) {
        str.getClass();
        zzgtdVar.zzd = str;
    }

    public final zzgse zza() {
        zzgse zzgseVar = this.zze;
        return zzgseVar == null ? zzgse.zzd() : zzgseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgtd();
        }
        zzgtc zzgtcVar = null;
        if (ordinal == 4) {
            return new zzgtb(zzgtcVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgtd.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
