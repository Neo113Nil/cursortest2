package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzhcr extends zzgxg implements zzgys {
    private static final zzhcr zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzhbs zzf;
    private zzhbw zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzgxo zzi = zzgxg.zzbG();
    private String zzj = "";
    private zzgxs zzl = zzgxg.zzbK();

    static {
        zzhcr zzhcrVar = new zzhcr();
        zza = zzhcrVar;
        zzgxg.zzbZ(zzhcr.class, zzhcrVar);
    }

    private zzhcr() {
    }

    public static zzhcq zzd() {
        return (zzhcq) zza.zzaZ();
    }

    public static /* synthetic */ void zzh(zzhcr zzhcrVar, String str) {
        str.getClass();
        zzgxs zzgxsVar = zzhcrVar.zzl;
        if (!zzgxsVar.zzc()) {
            zzhcrVar.zzl = zzgxg.zzbL(zzgxsVar);
        }
        zzhcrVar.zzl.add(str);
    }

    public static /* synthetic */ void zzi(zzhcr zzhcrVar, int i7) {
        zzhcrVar.zzc |= 1;
        zzhcrVar.zzd = i7;
    }

    public static /* synthetic */ void zzj(zzhcr zzhcrVar, zzhbs zzhbsVar) {
        zzhbsVar.getClass();
        zzhcrVar.zzf = zzhbsVar;
        zzhcrVar.zzc |= 4;
    }

    public static /* synthetic */ void zzk(zzhcr zzhcrVar, String str) {
        str.getClass();
        zzhcrVar.zzc |= 2;
        zzhcrVar.zze = str;
    }

    public static /* synthetic */ void zzl(zzhcr zzhcrVar, int i7) {
        zzhcrVar.zzk = i7 - 1;
        zzhcrVar.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        zzhdm zzhdmVar = null;
        switch (zzgxfVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxg.zzbQ(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhco.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhcr();
            case NEW_BUILDER:
                return new zzhcq(zzhdmVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgyz zzgxbVar = zzb;
                if (zzgxbVar == null) {
                    synchronized (zzhcr.class) {
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

    public final String zzg() {
        return this.zze;
    }
}
