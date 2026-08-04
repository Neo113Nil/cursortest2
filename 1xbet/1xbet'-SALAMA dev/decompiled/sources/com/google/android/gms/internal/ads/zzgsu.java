package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgsu extends zzgxg implements zzgys {
    private static final zzgsu zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgsx zze;

    static {
        zzgsu zzgsuVar = new zzgsu();
        zza = zzgsuVar;
        zzgxg.zzbZ(zzgsu.class, zzgsuVar);
    }

    private zzgsu() {
    }

    public static zzgss zzb() {
        return (zzgss) zza.zzaZ();
    }

    public static zzgsu zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgsu) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzg() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzh(zzgsu zzgsuVar, zzgsx zzgsxVar) {
        zzgsxVar.getClass();
        zzgsuVar.zze = zzgsxVar;
        zzgsuVar.zzc |= 1;
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
            return new zzgsu();
        }
        zzgst zzgstVar = null;
        if (iOrdinal == 4) {
            return new zzgss(zzgstVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgsu.class) {
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

    public final zzgsx zzf() {
        zzgsx zzgsxVar = this.zze;
        return zzgsxVar == null ? zzgsx.zzc() : zzgsxVar;
    }
}
