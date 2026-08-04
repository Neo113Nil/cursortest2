package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhbs extends zzgxg implements zzgys {
    private static final zzhbs zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzhbr zzd;
    private zzgvy zzf;
    private zzgvy zzg;
    private int zzh;
    private byte zzi = 2;
    private zzgxs zze = zzgxg.zzbK();

    static {
        zzhbs zzhbsVar = new zzhbs();
        zza = zzhbsVar;
        zzgxg.zzbZ(zzhbs.class, zzhbsVar);
    }

    private zzhbs() {
        zzgvy zzgvyVar = zzgvy.zzb;
        this.zzf = zzgvyVar;
        this.zzg = zzgvyVar;
    }

    public static zzhbp zzc() {
        return (zzhbp) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhbs zzhbsVar, zzhbo zzhboVar) {
        zzhboVar.getClass();
        zzgxs zzgxsVar = zzhbsVar.zze;
        if (!zzgxsVar.zzc()) {
            zzhbsVar.zze = zzgxg.zzbL(zzgxsVar);
        }
        zzhbsVar.zze.add(zzhboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        zzhdm zzhdmVar = null;
        switch (zzgxfVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxg.zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhbo.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhbs();
            case NEW_BUILDER:
                return new zzhbp(zzhdmVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgyz zzgxbVar = zzb;
                if (zzgxbVar == null) {
                    synchronized (zzhbs.class) {
                        try {
                            zzgxbVar = zzb;
                            if (zzgxbVar == null) {
                                zzgxbVar = new zzgxb(zza);
                                zzb = zzgxbVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return zzgxbVar;
            default:
                throw null;
        }
    }
}
