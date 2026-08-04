package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhbw extends zzgxg implements zzgys {
    private static final zzhbw zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzhbv zzd;
    private zzgvy zzf;
    private zzgvy zzg;
    private int zzh;
    private zzgvy zzi;
    private byte zzj = 2;
    private zzgxs zze = zzgxg.zzbK();

    static {
        zzhbw zzhbwVar = new zzhbw();
        zza = zzhbwVar;
        zzgxg.zzbZ(zzhbw.class, zzhbwVar);
    }

    private zzhbw() {
        zzgvy zzgvyVar = zzgvy.zzb;
        this.zzf = zzgvyVar;
        this.zzg = zzgvyVar;
        this.zzi = zzgvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        zzhdm zzhdmVar = null;
        switch (zzgxfVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxg.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhbo.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhbw();
            case NEW_BUILDER:
                return new zzhbt(zzhdmVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgyz zzgxbVar = zzb;
                if (zzgxbVar == null) {
                    synchronized (zzhbw.class) {
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
