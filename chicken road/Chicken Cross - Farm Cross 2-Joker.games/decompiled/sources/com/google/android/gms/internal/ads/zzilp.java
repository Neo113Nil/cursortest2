package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzilp extends zzifm implements zzigx {
    private static final zzilp zzQ;
    private static volatile zzihe zzR;
    private zzill zzA;
    private zzijw zzC;
    private zzijo zzE;
    private int zzG;
    private long zzJ;
    private zzilo zzK;
    private zzikp zzL;
    private zzili zzN;
    private int zza;
    private int zzb;
    private int zzc;
    private zzijs zzg;
    private zzikv zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private zzilc zzv;
    private boolean zzw;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private zzify zzh = zzbM();
    private zzify zzi = zzbM();
    private String zzj = "";
    private zzify zzm = zzbM();
    private String zzn = "";
    private zziei zzu = zziei.zza;
    private String zzx = "";
    private zzify zzy = zzbM();
    private zzify zzz = zzbM();
    private zzify zzB = zzbM();
    private String zzD = "";
    private zzify zzF = zzbM();
    private zzify zzH = zzbM();
    private zzify zzI = zzbM();
    private String zzM = "";
    private zzify zzO = zzbM();

    static {
        zzilp zzilpVar = new zzilp();
        zzQ = zzilpVar;
        zzifm.zzbu(zzilp.class, zzilpVar);
    }

    private zzilp() {
    }

    public static zzijq zzg() {
        return (zzijq) zzQ.zzbn();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        byte[] bArr = null;
        switch (zziflVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzP);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzP = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzila.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", zzikw.zza, "zzc", zzijp.zza, "zzg", "zzj", "zzk", "zzu", "zzi", zzilt.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzilz.class, "zzC", "zzD", "zzE", "zzF", zzika.class, "zzG", zzilj.zza, "zzH", zzikn.class, "zzI", zziks.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", zzilf.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzilp();
            case NEW_BUILDER:
                return new zzijq(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzQ;
            case GET_PARSER:
                zzihe zziheVar = zzR;
                if (zziheVar == null) {
                    synchronized (zzilp.class) {
                        zziheVar = zzR;
                        if (zziheVar == null) {
                            zziheVar = new zzifh(zzQ);
                            zzR = zziheVar;
                        }
                    }
                }
                return zziheVar;
            default:
                throw null;
        }
    }

    public final String zze() {
        return this.zzj;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzi(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzj(zzijs zzijsVar) {
        zzijsVar.getClass();
        this.zzg = zzijsVar;
        this.zza |= 32;
    }

    final /* synthetic */ void zzk(zzila zzilaVar) {
        zzilaVar.getClass();
        zzify zzifyVar = this.zzh;
        if (!zzifyVar.zza()) {
            this.zzh = zzifm.zzbN(zzifyVar);
        }
        this.zzh.add(zzilaVar);
    }

    final /* synthetic */ void zzl(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void zzm() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    final /* synthetic */ void zzn(zzikv zzikvVar) {
        zzikvVar.getClass();
        this.zzk = zzikvVar;
        this.zza |= 128;
    }

    final /* synthetic */ void zzo(zzilc zzilcVar) {
        zzilcVar.getClass();
        this.zzv = zzilcVar;
        this.zza |= 8192;
    }

    final /* synthetic */ void zzp(Iterable iterable) {
        zzify zzifyVar = this.zzy;
        if (!zzifyVar.zza()) {
            this.zzy = zzifm.zzbN(zzifyVar);
        }
        zzidr.zzaW(iterable, this.zzy);
    }

    final /* synthetic */ void zzq(Iterable iterable) {
        zzify zzifyVar = this.zzz;
        if (!zzifyVar.zza()) {
            this.zzz = zzifm.zzbN(zzifyVar);
        }
        zzidr.zzaW(iterable, this.zzz);
    }

    final /* synthetic */ void zzs(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }
}
