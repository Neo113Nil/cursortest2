package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhbo extends zzgxg implements zzgys {
    private static final zzhbo zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgvy zzd;
    private zzgvy zze;
    private byte zzf = 2;

    static {
        zzhbo zzhboVar = new zzhbo();
        zza = zzhboVar;
        zzgxg.zzbZ(zzhbo.class, zzhboVar);
    }

    private zzhbo() {
        zzgvy zzgvyVar = zzgvy.zzb;
        this.zzd = zzgvyVar;
        this.zze = zzgvyVar;
    }

    public static zzhbn zzc() {
        return (zzhbn) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhbo zzhboVar, zzgvy zzgvyVar) {
        zzhboVar.zzc |= 1;
        zzhboVar.zzd = zzgvyVar;
    }

    public static /* synthetic */ void zzg(zzhbo zzhboVar, zzgvy zzgvyVar) {
        zzhboVar.zzc |= 2;
        zzhboVar.zze = zzgvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        zzhdm zzhdmVar = null;
        switch (zzgxfVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxg.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhbo();
            case NEW_BUILDER:
                return new zzhbn(zzhdmVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgyz zzgxbVar = zzb;
                if (zzgxbVar == null) {
                    synchronized (zzhbo.class) {
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
