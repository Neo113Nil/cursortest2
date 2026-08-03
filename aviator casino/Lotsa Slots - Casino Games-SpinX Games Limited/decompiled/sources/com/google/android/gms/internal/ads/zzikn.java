package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzikn extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzikn zzR;
    private static volatile com.google.android.gms.internal.ads.zzifx zzS;
    private com.google.android.gms.internal.ads.zzikj zzA;
    private com.google.android.gms.internal.ads.zziip zzC;
    private com.google.android.gms.internal.ads.zziih zzE;
    private com.google.android.gms.internal.ads.zziji zzG;
    private int zzH;
    private long zzK;
    private com.google.android.gms.internal.ads.zzikm zzL;
    private com.google.android.gms.internal.ads.zzijn zzM;
    private com.google.android.gms.internal.ads.zzikg zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private com.google.android.gms.internal.ads.zziil zzg;
    private com.google.android.gms.internal.ads.zzijt zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private com.google.android.gms.internal.ads.zzika zzv;
    private boolean zzw;
    private byte zzQ = 2;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.ads.zzieq zzh = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzi = zzbM();
    private java.lang.String zzj = "";
    private com.google.android.gms.internal.ads.zzieq zzm = zzbM();
    private java.lang.String zzn = "";
    private com.google.android.gms.internal.ads.zzida zzu = com.google.android.gms.internal.ads.zzida.zza;
    private java.lang.String zzx = "";
    private com.google.android.gms.internal.ads.zzieq zzy = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzz = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzB = zzbM();
    private java.lang.String zzD = "";
    private com.google.android.gms.internal.ads.zzieq zzF = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzI = zzbM();
    private com.google.android.gms.internal.ads.zzieq zzJ = zzbM();
    private java.lang.String zzN = "";
    private com.google.android.gms.internal.ads.zzieq zzP = zzbM();

    static {
        com.google.android.gms.internal.ads.zzikn zziknVar = new com.google.android.gms.internal.ads.zzikn();
        zzR = zziknVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzikn.class, zziknVar);
    }

    private zzikn() {
    }

    public static com.google.android.gms.internal.ads.zziij zzg() {
        return (com.google.android.gms.internal.ads.zziij) zzR.zzbn();
    }

    public final java.lang.String zzc() {
        return this.zzd;
    }

    public final java.util.List zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = null;
        switch (zziedVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return java.lang.Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new java.lang.Object[]{"zza", "zzd", "zze", "zzf", "zzh", com.google.android.gms.internal.ads.zzijy.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", com.google.android.gms.internal.ads.zziju.zza, "zzc", com.google.android.gms.internal.ads.zziii.zza, "zzg", "zzj", "zzk", "zzu", "zzi", com.google.android.gms.internal.ads.zzikr.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", com.google.android.gms.internal.ads.zzikx.class, "zzC", "zzD", "zzE", "zzF", com.google.android.gms.internal.ads.zziit.class, "zzG", "zzH", com.google.android.gms.internal.ads.zzikh.zza, "zzI", com.google.android.gms.internal.ads.zzijl.class, "zzJ", com.google.android.gms.internal.ads.zzijq.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", com.google.android.gms.internal.ads.zzikd.class});
            case NEW_MUTABLE_INSTANCE:
                return new com.google.android.gms.internal.ads.zzikn();
            case NEW_BUILDER:
                return new com.google.android.gms.internal.ads.zziij(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzR;
            case GET_PARSER:
                com.google.android.gms.internal.ads.zzifx zzifxVar = zzS;
                if (zzifxVar == null) {
                    synchronized (com.google.android.gms.internal.ads.zzikn.class) {
                        zzifxVar = zzS;
                        if (zzifxVar == null) {
                            zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzR);
                            zzS = zzifxVar;
                        }
                    }
                }
                return zzifxVar;
            default:
                throw null;
        }
    }

    public final java.lang.String zze() {
        return this.zzj;
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzi(java.lang.String str) {
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zziil zziilVar) {
        zziilVar.getClass();
        this.zzg = zziilVar;
        this.zza |= 32;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzijy zzijyVar) {
        zzijyVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzh;
        if (!zzieqVar.zza()) {
            this.zzh = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzh.add(zzijyVar);
    }

    final /* synthetic */ void zzl(java.lang.String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void zzm() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzijt zzijtVar) {
        zzijtVar.getClass();
        this.zzk = zzijtVar;
        this.zza |= 128;
    }

    final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzika zzikaVar) {
        zzikaVar.getClass();
        this.zzv = zzikaVar;
        this.zza |= 8192;
    }

    final /* synthetic */ void zzp(java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzy;
        if (!zzieqVar.zza()) {
            this.zzy = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        com.google.android.gms.internal.ads.zzicj.zzaW(iterable, this.zzy);
    }

    final /* synthetic */ void zzq(java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzz;
        if (!zzieqVar.zza()) {
            this.zzz = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        com.google.android.gms.internal.ads.zzicj.zzaW(iterable, this.zzz);
    }

    final /* synthetic */ void zzs(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }
}
