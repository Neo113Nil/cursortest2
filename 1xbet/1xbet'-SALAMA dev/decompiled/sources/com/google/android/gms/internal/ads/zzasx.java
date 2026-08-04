package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzasx extends zzgxg implements zzgys {
    private static final zzasx zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgvy zzf = zzgvy.zzb;

    static {
        zzasx zzasxVar = new zzasx();
        zza = zzasxVar;
        zzgxg.zzbZ(zzasx.class, zzasxVar);
    }

    private zzasx() {
    }

    public static zzasx zzc() {
        return zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzgvy zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzasx();
        }
        zzatc zzatcVar = null;
        if (iOrdinal == 4) {
            return new zzasw(zzatcVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzasx.class) {
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
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzc & 1) != 0;
    }
}
