package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgtn extends zzgxg implements zzgys {
    private static final zzgtn zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgtq zze;

    static {
        zzgtn zzgtnVar = new zzgtn();
        zza = zzgtnVar;
        zzgxg.zzbZ(zzgtn.class, zzgtnVar);
    }

    private zzgtn() {
    }

    public static zzgtl zzb() {
        return (zzgtl) zza.zzaZ();
    }

    public static zzgtn zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgtn) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzg(zzgtn zzgtnVar, zzgtq zzgtqVar) {
        zzgtqVar.getClass();
        zzgtnVar.zze = zzgtqVar;
        zzgtnVar.zzc |= 1;
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
            return zzgxg.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgtn();
        }
        zzgtm zzgtmVar = null;
        if (iOrdinal == 4) {
            return new zzgtl(zzgtmVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgtn.class) {
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

    public final zzgtq zzf() {
        zzgtq zzgtqVar = this.zze;
        return zzgtqVar == null ? zzgtq.zzd() : zzgtqVar;
    }
}
