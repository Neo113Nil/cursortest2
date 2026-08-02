package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzhdb extends zzgxg implements zzgys {
    private static final zzhdb zza;
    private static volatile zzgyz zzb;
    private zzhcx zzC;
    private zzhbi zzE;
    private zzhba zzG;
    private zzhcb zzI;
    private int zzJ;
    private long zzM;
    private zzhda zzN;
    private zzhcg zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhbe zzi;
    private zzhcm zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhct zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzgxs zzj = zzgxg.zzbK();
    private zzgxs zzk = zzgxg.zzbK();
    private String zzl = "";
    private zzgxs zzo = zzgxg.zzbK();
    private String zzp = "";
    private zzgvy zzw = zzgvy.zzb;
    private String zzz = "";
    private zzgxs zzA = zzgxg.zzbK();
    private zzgxs zzB = zzgxg.zzbK();
    private zzgxs zzD = zzgxg.zzbK();
    private String zzF = "";
    private zzgxs zzH = zzgxg.zzbK();
    private zzgxs zzK = zzgxg.zzbK();
    private zzgxs zzL = zzgxg.zzbK();
    private String zzP = "";

    static {
        zzhdb zzhdbVar = new zzhdb();
        zza = zzhdbVar;
        zzgxg.zzbZ(zzhdb.class, zzhdbVar);
    }

    private zzhdb() {
    }

    public static zzhbc zzc() {
        return (zzhbc) zza.zzaZ();
    }

    public static /* synthetic */ void zzi(zzhdb zzhdbVar, Iterable iterable) {
        zzgxs zzgxsVar = zzhdbVar.zzA;
        if (!zzgxsVar.zzc()) {
            zzhdbVar.zzA = zzgxg.zzbL(zzgxsVar);
        }
        zzgvh.zzaQ(iterable, zzhdbVar.zzA);
    }

    public static /* synthetic */ void zzj(zzhdb zzhdbVar, Iterable iterable) {
        zzgxs zzgxsVar = zzhdbVar.zzB;
        if (!zzgxsVar.zzc()) {
            zzhdbVar.zzB = zzgxg.zzbL(zzgxsVar);
        }
        zzgvh.zzaQ(iterable, zzhdbVar.zzB);
    }

    public static /* synthetic */ void zzk(zzhdb zzhdbVar, zzhcr zzhcrVar) {
        zzhcrVar.getClass();
        zzgxs zzgxsVar = zzhdbVar.zzj;
        if (!zzgxsVar.zzc()) {
            zzhdbVar.zzj = zzgxg.zzbL(zzgxsVar);
        }
        zzhdbVar.zzj.add(zzhcrVar);
    }

    public static /* synthetic */ void zzl(zzhdb zzhdbVar) {
        zzhdbVar.zzc &= -65;
        zzhdbVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzm(zzhdb zzhdbVar, String str) {
        zzhdbVar.zzc |= 64;
        zzhdbVar.zzl = str;
    }

    public static /* synthetic */ void zzn(zzhdb zzhdbVar, zzhct zzhctVar) {
        zzhctVar.getClass();
        zzhdbVar.zzx = zzhctVar;
        zzhdbVar.zzc |= 8192;
    }

    public static /* synthetic */ void zzo(zzhdb zzhdbVar, zzhbe zzhbeVar) {
        zzhbeVar.getClass();
        zzhdbVar.zzi = zzhbeVar;
        zzhdbVar.zzc |= 32;
    }

    public static /* synthetic */ void zzp(zzhdb zzhdbVar, String str) {
        str.getClass();
        zzhdbVar.zzc |= 8;
        zzhdbVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzhdb zzhdbVar, zzhcm zzhcmVar) {
        zzhcmVar.getClass();
        zzhdbVar.zzm = zzhcmVar;
        zzhdbVar.zzc |= 128;
    }

    public static /* synthetic */ void zzr(zzhdb zzhdbVar, String str) {
        str.getClass();
        zzhdbVar.zzc |= 4;
        zzhdbVar.zzf = str;
    }

    public static /* synthetic */ void zzs(zzhdb zzhdbVar, int i7) {
        zzhdbVar.zzd = i7 - 1;
        zzhdbVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        zzhdm zzhdmVar = null;
        switch (zzgxfVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxg.zzbQ(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhcr.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhcn.zza, "zze", zzhbb.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhdf.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhdl.class, "zzE", "zzF", "zzG", "zzH", zzhbm.class, "zzI", "zzJ", zzhcv.zza, "zzK", zzhce.class, "zzL", zzhcj.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdb();
            case NEW_BUILDER:
                return new zzhbc(zzhdmVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgyz zzgyzVar = zzb;
                if (zzgyzVar == null) {
                    synchronized (zzhdb.class) {
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
            default:
                throw null;
        }
    }

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
