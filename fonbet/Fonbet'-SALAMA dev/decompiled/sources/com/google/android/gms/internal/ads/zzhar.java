package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhap.class});
        }
        if (ordinal == 3) {
            return new zzhar();
        }
        zzhas zzhasVar = null;
        if (ordinal == 4) {
            return new zzhaq(zzhasVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhar.class) {
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
}
