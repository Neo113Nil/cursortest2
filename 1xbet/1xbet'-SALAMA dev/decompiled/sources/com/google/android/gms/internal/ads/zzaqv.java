package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzaqv extends zzgxg implements zzgys {
    private static final zzaqv zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private zzarn zzi;
    private zzarq zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        zzaqv zzaqvVar = new zzaqv();
        zza = zzaqvVar;
        zzgxg.zzbZ(zzaqv.class, zzaqvVar);
    }

    private zzaqv() {
    }

    public static zzaqt zza() {
        return (zzaqt) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzaqv zzaqvVar, boolean z4) {
        zzaqvVar.zzc |= 8;
        zzaqvVar.zzg = z4;
    }

    public static /* synthetic */ void zzh(zzaqv zzaqvVar, String str) {
        str.getClass();
        zzaqvVar.zzc |= 4;
        zzaqvVar.zzf = str;
    }

    public final zzarn zzc() {
        zzarn zzarnVar = this.zzi;
        return zzarnVar == null ? zzarn.zzc() : zzarnVar;
    }

    public final zzarq zzd() {
        zzarq zzarqVar = this.zzj;
        return zzarqVar == null ? zzarq.zzb() : zzarqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzaqw.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzaqv();
        }
        zzaqu zzaquVar = null;
        if (iOrdinal == 4) {
            return new zzaqt(zzaquVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzaqv.class) {
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

    public final String zzf() {
        return this.zzf;
    }

    @Deprecated
    public final boolean zzi() {
        return this.zzg;
    }
}
