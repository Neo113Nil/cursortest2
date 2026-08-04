package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgse extends zzgxg implements zzgys {
    private static final zzgse zza;
    private static volatile zzgyz zzb;
    private String zzc = "";
    private zzgvy zzd = zzgvy.zzb;
    private int zze;

    static {
        zzgse zzgseVar = new zzgse();
        zza = zzgseVar;
        zzgxg.zzbZ(zzgse.class, zzgseVar);
    }

    private zzgse() {
    }

    public static zzgsc zza() {
        return (zzgsc) zza.zzaZ();
    }

    public static zzgsc zzb(zzgse zzgseVar) {
        return (zzgsc) zza.zzba(zzgseVar);
    }

    public static zzgse zzd() {
        return zza;
    }

    public static zzgse zzf(byte[] bArr, zzgwq zzgwqVar) {
        return (zzgse) zzgxg.zzbx(zza, bArr, zzgwqVar);
    }

    public static /* synthetic */ void zzk(zzgse zzgseVar, String str) {
        str.getClass();
        zzgseVar.zzc = str;
    }

    public static /* synthetic */ void zzl(zzgse zzgseVar, zzgvy zzgvyVar) {
        zzgvyVar.getClass();
        zzgseVar.zzd = zzgvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgse();
        }
        zzgsd zzgsdVar = null;
        if (iOrdinal == 4) {
            return new zzgsc(zzgsdVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgse.class) {
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

    public final zzgte zzg() {
        zzgte zzgteVarZzb = zzgte.zzb(this.zze);
        return zzgteVarZzb == null ? zzgte.UNRECOGNIZED : zzgteVarZzb;
    }

    public final zzgvy zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
