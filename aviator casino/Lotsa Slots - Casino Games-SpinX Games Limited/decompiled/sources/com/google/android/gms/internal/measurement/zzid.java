package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzid extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzid zzat;
    private int zzA;
    private boolean zzD;
    private int zzG;
    private int zzH;
    private int zzI;
    private long zzK;
    private long zzL;
    private int zzO;
    private com.google.android.gms.internal.measurement.zzig zzQ;
    private long zzS;
    private long zzT;
    private int zzW;
    private boolean zzX;
    private boolean zzZ;
    private com.google.android.gms.internal.measurement.zzhy zzaa;
    private long zzae;
    private boolean zzaf;
    private boolean zzah;
    private int zzaj;
    private com.google.android.gms.internal.measurement.zzhe zzal;
    private int zzam;
    private com.google.android.gms.internal.measurement.zzha zzan;
    private com.google.android.gms.internal.measurement.zzis zzap;
    private long zzaq;
    private com.google.android.gms.internal.measurement.zzho zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private int zzq;
    private long zzu;
    private long zzv;
    private boolean zzx;
    private long zzz;
    private com.google.android.gms.internal.measurement.zzmn zzf = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzg = zzcv();
    private java.lang.String zzm = "";
    private java.lang.String zzn = "";
    private java.lang.String zzo = "";
    private java.lang.String zzp = "";
    private java.lang.String zzr = "";
    private java.lang.String zzs = "";
    private java.lang.String zzt = "";
    private java.lang.String zzw = "";
    private java.lang.String zzy = "";
    private java.lang.String zzB = "";
    private java.lang.String zzC = "";
    private com.google.android.gms.internal.measurement.zzmn zzE = zzcv();
    private java.lang.String zzF = "";
    private java.lang.String zzJ = "";
    private java.lang.String zzM = "";
    private java.lang.String zzN = "";
    private java.lang.String zzP = "";
    private com.google.android.gms.internal.measurement.zzml zzR = zzcs();
    private java.lang.String zzU = "";
    private java.lang.String zzV = "";
    private java.lang.String zzY = "";
    private java.lang.String zzab = "";
    private com.google.android.gms.internal.measurement.zzmn zzac = com.google.android.gms.internal.measurement.zzme.zzcv();
    private java.lang.String zzad = "";
    private java.lang.String zzag = "";
    private java.lang.String zzai = "";
    private java.lang.String zzak = "";
    private java.lang.String zzao = "";
    private java.lang.String zzar = "";

    static {
        com.google.android.gms.internal.measurement.zzid zzidVar = new com.google.android.gms.internal.measurement.zzid();
        zzat = zzidVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzid.class, zzidVar);
    }

    private zzid() {
    }

    public static com.google.android.gms.internal.measurement.zzic zzaE() {
        return (com.google.android.gms.internal.measurement.zzic) zzat.zzck();
    }

    public static com.google.android.gms.internal.measurement.zzic zzaF(com.google.android.gms.internal.measurement.zzid zzidVar) {
        com.google.android.gms.internal.measurement.zzma zzck = zzat.zzck();
        zzck.zzbd(zzidVar);
        return (com.google.android.gms.internal.measurement.zzic) zzck;
    }

    private final void zzcy() {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzf;
        if (zzmnVar.zza()) {
            return;
        }
        this.zzf = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
    }

    private final void zzcz() {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzg;
        if (zzmnVar.zza()) {
            return;
        }
        this.zzg = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
    }

    public final java.lang.String zzA() {
        return this.zzs;
    }

    public final java.lang.String zzB() {
        return this.zzt;
    }

    public final boolean zzC() {
        return (this.zzb & 16384) != 0;
    }

    public final long zzD() {
        return this.zzu;
    }

    public final boolean zzE() {
        return (this.zzb & 32768) != 0;
    }

    public final long zzF() {
        return this.zzv;
    }

    public final java.lang.String zzG() {
        return this.zzw;
    }

    public final boolean zzH() {
        return (this.zzb & 131072) != 0;
    }

    public final boolean zzI() {
        return this.zzx;
    }

    public final java.lang.String zzJ() {
        return this.zzy;
    }

    public final boolean zzK() {
        return (this.zzb & 524288) != 0;
    }

    public final long zzL() {
        return this.zzz;
    }

    public final boolean zzM() {
        return (this.zzb & 1048576) != 0;
    }

    public final int zzN() {
        return this.zzA;
    }

    public final java.lang.String zzO() {
        return this.zzB;
    }

    public final java.lang.String zzP() {
        return this.zzC;
    }

    public final boolean zzQ() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean zzR() {
        return this.zzD;
    }

    public final java.util.List zzS() {
        return this.zzE;
    }

    public final java.lang.String zzT() {
        return this.zzF;
    }

    public final boolean zzU() {
        return (this.zzb & 33554432) != 0;
    }

    public final int zzV() {
        return this.zzG;
    }

    public final boolean zzW() {
        return (this.zzb & 536870912) != 0;
    }

    public final long zzX() {
        return this.zzK;
    }

    public final boolean zzY() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final java.lang.String zzZ() {
        return this.zzM;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzaA() {
        return (this.zzd & 134217728) != 0;
    }

    public final long zzaB() {
        return this.zzaq;
    }

    public final boolean zzaC() {
        return (this.zzd & 536870912) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzho zzaD() {
        com.google.android.gms.internal.measurement.zzho zzhoVar = this.zzas;
        return zzhoVar == null ? com.google.android.gms.internal.measurement.zzho.zzc() : zzhoVar;
    }

    final /* synthetic */ void zzaG(int i) {
        this.zzb |= 1;
        this.zze = 1;
    }

    final /* synthetic */ void zzaH(int i, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzhsVar.getClass();
        zzcy();
        this.zzf.set(i, zzhsVar);
    }

    final /* synthetic */ void zzaI(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzhsVar.getClass();
        zzcy();
        this.zzf.add(zzhsVar);
    }

    final /* synthetic */ void zzaJ(java.lang.Iterable iterable) {
        zzcy();
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzf);
    }

    final /* synthetic */ void zzaK() {
        this.zzf = zzcv();
    }

    final /* synthetic */ void zzaL(int i) {
        zzcy();
        this.zzf.remove(i);
    }

    final /* synthetic */ void zzaM(int i, com.google.android.gms.internal.measurement.zziu zziuVar) {
        zziuVar.getClass();
        zzcz();
        this.zzg.set(i, zziuVar);
    }

    final /* synthetic */ void zzaN(com.google.android.gms.internal.measurement.zziu zziuVar) {
        zziuVar.getClass();
        zzcz();
        this.zzg.add(zziuVar);
    }

    final /* synthetic */ void zzaO(java.lang.Iterable iterable) {
        zzcz();
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzg);
    }

    final /* synthetic */ void zzaP(int i) {
        zzcz();
        this.zzg.remove(i);
    }

    final /* synthetic */ void zzaQ(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    final /* synthetic */ void zzaR() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    final /* synthetic */ void zzaS(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    final /* synthetic */ void zzaT(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    final /* synthetic */ void zzaU(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    final /* synthetic */ void zzaV() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    final /* synthetic */ void zzaW(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    final /* synthetic */ void zzaX() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    final /* synthetic */ void zzaY(java.lang.String str) {
        this.zzb |= 64;
        this.zzm = "android";
    }

    final /* synthetic */ void zzaZ(java.lang.String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final boolean zzaa() {
        return (this.zzd & 2) != 0;
    }

    public final int zzab() {
        return this.zzO;
    }

    public final boolean zzac() {
        return (this.zzd & 16) != 0;
    }

    public final long zzad() {
        return this.zzS;
    }

    public final boolean zzae() {
        return (this.zzd & 128) != 0;
    }

    public final java.lang.String zzaf() {
        return this.zzV;
    }

    public final boolean zzag() {
        return (this.zzd & 8192) != 0;
    }

    public final java.lang.String zzah() {
        return this.zzab;
    }

    public final boolean zzai() {
        return (this.zzd & 32768) != 0;
    }

    public final long zzaj() {
        return this.zzae;
    }

    public final boolean zzak() {
        return this.zzaf;
    }

    public final boolean zzal() {
        return (this.zzd & 131072) != 0;
    }

    public final java.lang.String zzam() {
        return this.zzag;
    }

    public final boolean zzan() {
        return (this.zzd & 262144) != 0;
    }

    public final boolean zzao() {
        return this.zzah;
    }

    public final boolean zzap() {
        return (this.zzd & 524288) != 0;
    }

    public final java.lang.String zzaq() {
        return this.zzai;
    }

    public final int zzar() {
        return this.zzaj;
    }

    public final boolean zzas() {
        return (this.zzd & 4194304) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzhe zzat() {
        com.google.android.gms.internal.measurement.zzhe zzheVar = this.zzal;
        return zzheVar == null ? com.google.android.gms.internal.measurement.zzhe.zzi() : zzheVar;
    }

    public final boolean zzau() {
        return (this.zzd & 8388608) != 0;
    }

    public final int zzav() {
        return this.zzam;
    }

    public final boolean zzaw() {
        return (this.zzd & 16777216) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzha zzax() {
        com.google.android.gms.internal.measurement.zzha zzhaVar = this.zzan;
        return zzhaVar == null ? com.google.android.gms.internal.measurement.zzha.zzs() : zzhaVar;
    }

    public final boolean zzay() {
        return (this.zzd & androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzis zzaz() {
        com.google.android.gms.internal.measurement.zzis zzisVar = this.zzap;
        return zzisVar == null ? com.google.android.gms.internal.measurement.zzis.zzc() : zzisVar;
    }

    public final int zzb() {
        return this.zze;
    }

    final /* synthetic */ void zzbA(long j) {
        this.zzb |= 536870912;
        this.zzK = j;
    }

    final /* synthetic */ void zzbB(java.lang.String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    final /* synthetic */ void zzbC() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    final /* synthetic */ void zzbD(int i) {
        this.zzd |= 2;
        this.zzO = i;
    }

    final /* synthetic */ void zzbE(com.google.android.gms.internal.measurement.zzig zzigVar) {
        zzigVar.getClass();
        this.zzQ = zzigVar;
        this.zzd |= 8;
    }

    final /* synthetic */ void zzbF(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzml zzmlVar = this.zzR;
        if (!zzmlVar.zza()) {
            int size = zzmlVar.size();
            this.zzR = zzmlVar.zzg(size + size);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzR);
    }

    final /* synthetic */ void zzbG(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    final /* synthetic */ void zzbH(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    final /* synthetic */ void zzbI(java.lang.String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    final /* synthetic */ void zzbJ(java.lang.String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    final /* synthetic */ void zzbK() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    final /* synthetic */ void zzbL(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzac;
        if (!zzmnVar.zza()) {
            this.zzac = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzac);
    }

    final /* synthetic */ void zzbM(java.lang.String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    final /* synthetic */ void zzbN(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    final /* synthetic */ void zzbO(boolean z) {
        this.zzd |= 65536;
        this.zzaf = z;
    }

    final /* synthetic */ void zzbP(java.lang.String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    final /* synthetic */ void zzbQ(boolean z) {
        this.zzd |= 262144;
        this.zzah = z;
    }

    final /* synthetic */ void zzbR(java.lang.String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    final /* synthetic */ void zzbS(int i) {
        this.zzd |= 1048576;
        this.zzaj = i;
    }

    final /* synthetic */ void zzbT(com.google.android.gms.internal.measurement.zzhe zzheVar) {
        zzheVar.getClass();
        this.zzal = zzheVar;
        this.zzd |= 4194304;
    }

    final /* synthetic */ void zzbU(int i) {
        this.zzd |= 8388608;
        this.zzam = i;
    }

    final /* synthetic */ void zzbV(com.google.android.gms.internal.measurement.zzha zzhaVar) {
        zzhaVar.getClass();
        this.zzan = zzhaVar;
        this.zzd |= 16777216;
    }

    final /* synthetic */ void zzbW(com.google.android.gms.internal.measurement.zzis zzisVar) {
        this.zzap = zzisVar;
        this.zzd |= androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    }

    final /* synthetic */ void zzbX(long j) {
        this.zzd |= 134217728;
        this.zzaq = j;
    }

    final /* synthetic */ void zzbY(java.lang.String str) {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    final /* synthetic */ void zzbZ(com.google.android.gms.internal.measurement.zzho zzhoVar) {
        zzhoVar.getClass();
        this.zzas = zzhoVar;
        this.zzd |= 536870912;
    }

    final /* synthetic */ void zzba(java.lang.String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    final /* synthetic */ void zzbb() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    final /* synthetic */ void zzbc(java.lang.String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    final /* synthetic */ void zzbd(int i) {
        this.zzb |= 1024;
        this.zzq = i;
    }

    final /* synthetic */ void zzbe(java.lang.String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    final /* synthetic */ void zzbf(java.lang.String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    final /* synthetic */ void zzbg(java.lang.String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    final /* synthetic */ void zzbh(long j) {
        this.zzb |= 16384;
        this.zzu = j;
    }

    final /* synthetic */ void zzbi(long j) {
        this.zzb |= 32768;
        this.zzv = 130000L;
    }

    final /* synthetic */ void zzbj(java.lang.String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    final /* synthetic */ void zzbk() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    final /* synthetic */ void zzbl(boolean z) {
        this.zzb |= 131072;
        this.zzx = z;
    }

    final /* synthetic */ void zzbm() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    final /* synthetic */ void zzbn(java.lang.String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzy = str;
    }

    final /* synthetic */ void zzbo() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    final /* synthetic */ void zzbp(long j) {
        this.zzb |= 524288;
        this.zzz = j;
    }

    final /* synthetic */ void zzbq(int i) {
        this.zzb |= 1048576;
        this.zzA = i;
    }

    final /* synthetic */ void zzbr(java.lang.String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    final /* synthetic */ void zzbs() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    final /* synthetic */ void zzbt(java.lang.String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    final /* synthetic */ void zzbu(boolean z) {
        this.zzb |= 8388608;
        this.zzD = z;
    }

    final /* synthetic */ void zzbv(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzE;
        if (!zzmnVar.zza()) {
            this.zzE = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzE);
    }

    final /* synthetic */ void zzbw() {
        this.zzE = zzcv();
    }

    final /* synthetic */ void zzbx(java.lang.String str) {
        str.getClass();
        this.zzb |= 16777216;
        this.zzF = str;
    }

    final /* synthetic */ void zzby(int i) {
        this.zzb |= 33554432;
        this.zzG = i;
    }

    final /* synthetic */ void zzbz() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final java.util.List zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzf.size();
    }

    public final com.google.android.gms.internal.measurement.zzhs zze(int i) {
        return (com.google.android.gms.internal.measurement.zzhs) this.zzf.get(i);
    }

    public final java.util.List zzf() {
        return this.zzg;
    }

    public final int zzg() {
        return this.zzg.size();
    }

    public final com.google.android.gms.internal.measurement.zziu zzh(int i) {
        return (com.google.android.gms.internal.measurement.zziu) this.zzg.get(i);
    }

    public final boolean zzi() {
        return (this.zzb & 2) != 0;
    }

    public final long zzj() {
        return this.zzh;
    }

    public final boolean zzk() {
        return (this.zzb & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", com.google.android.gms.internal.measurement.zzhs.class, "zzg", com.google.android.gms.internal.measurement.zziu.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", com.google.android.gms.internal.measurement.zzhg.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", com.google.android.gms.internal.measurement.zzgw.zza, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzid();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzic(bArr);
        }
        if (i2 == 5) {
            return zzat;
        }
        throw null;
    }

    public final long zzm() {
        return this.zzi;
    }

    public final boolean zzn() {
        return (this.zzb & 8) != 0;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final boolean zzp() {
        return (this.zzb & 16) != 0;
    }

    public final long zzq() {
        return this.zzk;
    }

    public final boolean zzr() {
        return (this.zzb & 32) != 0;
    }

    public final long zzs() {
        return this.zzl;
    }

    public final java.lang.String zzt() {
        return this.zzm;
    }

    public final java.lang.String zzu() {
        return this.zzn;
    }

    public final java.lang.String zzv() {
        return this.zzo;
    }

    public final java.lang.String zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return (this.zzb & 1024) != 0;
    }

    public final int zzy() {
        return this.zzq;
    }

    public final java.lang.String zzz() {
        return this.zzr;
    }
}
