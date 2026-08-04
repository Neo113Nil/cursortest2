package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzasq extends zzgxg implements zzgys {
    private static final zzasq zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgvy zzd;
    private zzgvy zze;
    private zzgvy zzf;
    private zzgvy zzg;

    static {
        zzasq zzasqVar = new zzasq();
        zza = zzasqVar;
        zzgxg.zzbZ(zzasq.class, zzasqVar);
    }

    private zzasq() {
        zzgvy zzgvyVar = zzgvy.zzb;
        this.zzd = zzgvyVar;
        this.zze = zzgvyVar;
        this.zzf = zzgvyVar;
        this.zzg = zzgvyVar;
    }

    public static zzasp zza() {
        return (zzasp) zza.zzaZ();
    }

    public static zzasq zzc(byte[] bArr, zzgwq zzgwqVar) {
        return (zzasq) zzgxg.zzbx(zza, bArr, zzgwqVar);
    }

    public static /* synthetic */ void zzi(zzasq zzasqVar, zzgvy zzgvyVar) {
        zzasqVar.zzc |= 1;
        zzasqVar.zzd = zzgvyVar;
    }

    public static /* synthetic */ void zzj(zzasq zzasqVar, zzgvy zzgvyVar) {
        zzasqVar.zzc |= 2;
        zzasqVar.zze = zzgvyVar;
    }

    public static /* synthetic */ void zzk(zzasq zzasqVar, zzgvy zzgvyVar) {
        zzasqVar.zzc |= 8;
        zzasqVar.zzg = zzgvyVar;
    }

    public static /* synthetic */ void zzl(zzasq zzasqVar, zzgvy zzgvyVar) {
        zzasqVar.zzc |= 4;
        zzasqVar.zzf = zzgvyVar;
    }

    public final zzgvy zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzasq();
        }
        zzatc zzatcVar = null;
        if (iOrdinal == 4) {
            return new zzasp(zzatcVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzasq.class) {
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

    public final zzgvy zzf() {
        return this.zze;
    }

    public final zzgvy zzg() {
        return this.zzg;
    }

    public final zzgvy zzh() {
        return this.zzf;
    }
}
