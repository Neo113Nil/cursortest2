package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhar extends zzgxg implements zzgys {
    private static final zzhar zza;
    private static volatile zzgyz zzb;
    private zzgxs zzc = zzgxg.zzbK();

    static {
        zzhar zzharVar = new zzhar();
        zza = zzharVar;
        zzgxg.zzbZ(zzhar.class, zzharVar);
    }

    private zzhar() {
    }

    public static zzhaq zzc() {
        return (zzhaq) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhar zzharVar, zzhap zzhapVar) {
        zzhapVar.getClass();
        zzgxs zzgxsVar = zzharVar.zzc;
        if (!zzgxsVar.zzc()) {
            zzharVar.zzc = zzgxg.zzbL(zzgxsVar);
        }
        zzharVar.zzc.add(zzhapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhap.class});
        }
        if (iOrdinal == 3) {
            return new zzhar();
        }
        zzhas zzhasVar = null;
        if (iOrdinal == 4) {
            return new zzhaq(zzhasVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzhar.class) {
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
}
