package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzix implements com.google.android.gms.internal.ads.zzna, com.google.android.gms.internal.ads.zznc {
    private final int zzb;
    private com.google.android.gms.internal.ads.zznd zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzqf zzf;
    private com.google.android.gms.internal.ads.zzdo zzg;
    private int zzh;
    private com.google.android.gms.internal.ads.zzzc zzi;
    private com.google.android.gms.internal.ads.zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private com.google.android.gms.internal.ads.zzxk zzq;
    private com.google.android.gms.internal.ads.zznb zzr;
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzlw zzc = new com.google.android.gms.internal.ads.zzlw();
    private long zzm = Long.MIN_VALUE;
    private com.google.android.gms.internal.ads.zzbf zzp = com.google.android.gms.internal.ads.zzbf.zza;

    public zzix(int i) {
        this.zzb = i;
    }

    private final void zzae(long j, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        if (!z2) {
            z2 = zzR(j) != 0;
        }
        zzA(j, z, z2);
    }

    protected void zzA(long j, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        throw null;
    }

    protected void zzB() throws com.google.android.gms.internal.ads.zzjk {
    }

    protected void zzC() {
    }

    protected void zzD() {
        throw null;
    }

    protected void zzE() {
    }

    protected void zzF() {
    }

    protected void zzG(com.google.android.gms.internal.ads.zzbf zzbfVar) {
    }

    protected final long zzH() {
        return this.zzl;
    }

    protected final com.google.android.gms.internal.ads.zzlw zzI() {
        com.google.android.gms.internal.ads.zzlw zzlwVar = this.zzc;
        zzlwVar.zza = null;
        zzlwVar.zzb = null;
        return zzlwVar;
    }

    protected final com.google.android.gms.internal.ads.zzbf zzN() {
        return this.zzp;
    }

    protected final com.google.android.gms.internal.ads.zzxk zzO() {
        return this.zzq;
    }

    protected final com.google.android.gms.internal.ads.zzjk zzP(java.lang.Throwable th, com.google.android.gms.internal.ads.zzv zzvVar, boolean z, int i) {
        int i2;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                int zzad = zzad(zzvVar) & 7;
                this.zzo = false;
                i2 = zzad;
            } catch (com.google.android.gms.internal.ads.zzjk unused) {
                this.zzo = false;
            } catch (java.lang.Throwable th2) {
                this.zzo = false;
                throw th2;
            }
            return com.google.android.gms.internal.ads.zzjk.zzb(th, zzU(), this.zze, zzvVar, i2, this.zzq, z, i);
        }
        i2 = 4;
        return com.google.android.gms.internal.ads.zzjk.zzb(th, zzU(), this.zze, zzvVar, i2, this.zzq, z, i);
    }

    protected final int zzQ(com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zziv zzivVar, int i) {
        com.google.android.gms.internal.ads.zzzc zzzcVar = this.zzi;
        zzzcVar.getClass();
        int zzd = zzzcVar.zzd(zzlwVar, zzivVar, i);
        if (zzd == -4) {
            if (zzivVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzivVar.zze + this.zzk;
            zzivVar.zze = j;
            this.zzm = java.lang.Math.max(this.zzm, j);
        } else if (zzd == -5) {
            com.google.android.gms.internal.ads.zzv zzvVar = zzlwVar.zzb;
            zzvVar.getClass();
            long j2 = zzvVar.zzu;
            if (j2 != Long.MAX_VALUE) {
                com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
                zza.zzt(j2 + this.zzk);
                zzlwVar.zzb = zza.zzO();
                return -5;
            }
        }
        return zzd;
    }

    protected final void zzT() {
        com.google.android.gms.internal.ads.zznb zznbVar;
        synchronized (this.zza) {
            zznbVar = this.zzr;
        }
        if (zznbVar != null) {
            zznbVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ long zzV(long j, long j2) {
        return com.google.android.gms.internal.ads.zzna.CC.$default$zzV(this, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ boolean zzW(long j) {
        return com.google.android.gms.internal.ads.zzna.CC.$default$zzW(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzX(float f, float f2) {
        com.google.android.gms.internal.ads.zzna.CC.$default$zzX(this, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public /* synthetic */ void zzY() {
        com.google.android.gms.internal.ads.zzna.CC.$default$zzY(this);
    }

    @Override // com.google.android.gms.internal.ads.zzna, com.google.android.gms.internal.ads.zznc
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final com.google.android.gms.internal.ads.zznc zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzc(int i, com.google.android.gms.internal.ads.zzqf zzqfVar, com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zze = i;
        this.zzf = zzqfVar;
        this.zzg = zzdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzcT() throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzcU(com.google.android.gms.internal.ads.zzv[] zzvVarArr, com.google.android.gms.internal.ads.zzzc zzzcVar, long j, long j2, com.google.android.gms.internal.ads.zzxk zzxkVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzn);
        this.zzi = zzzcVar;
        this.zzq = zzxkVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzvVarArr;
        this.zzk = j2;
        zzz(zzvVarArr, j, j2, zzxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final com.google.android.gms.internal.ads.zzzc zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public com.google.android.gms.internal.ads.zzmb zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzf(com.google.android.gms.internal.ads.zznd zzndVar, com.google.android.gms.internal.ads.zzv[] zzvVarArr, com.google.android.gms.internal.ads.zzzc zzzcVar, long j, boolean z, boolean z2, long j2, long j3, com.google.android.gms.internal.ads.zzxk zzxkVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzh == 0);
        this.zzd = zzndVar;
        this.zzq = zzxkVar;
        this.zzh = 1;
        zzy(z, z2);
        zzcU(zzvVarArr, zzzcVar, j2, j3, zzxkVar);
        zzae(j2, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzo(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        if (java.util.Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
        zzG(zzbfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(long j, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        zzae(j, false, z);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzq() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzr() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzh == 1);
        com.google.android.gms.internal.ads.zzlw zzlwVar = this.zzc;
        zzlwVar.zza = null;
        zzlwVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzs() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzh == 0);
        com.google.android.gms.internal.ads.zzlw zzlwVar = this.zzc;
        zzlwVar.zza = null;
        zzlwVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzt() {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public int zzu() throws com.google.android.gms.internal.ads.zzjk {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzv(com.google.android.gms.internal.ads.zznb zznbVar) {
        synchronized (this.zza) {
            this.zzr = zznbVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmv
    public void zzx(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzjk {
    }

    protected void zzy(boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
    }

    protected void zzz(com.google.android.gms.internal.ads.zzv[] zzvVarArr, long j, long j2, com.google.android.gms.internal.ads.zzxk zzxkVar) throws com.google.android.gms.internal.ads.zzjk {
    }

    protected final com.google.android.gms.internal.ads.zzv[] zzJ() {
        com.google.android.gms.internal.ads.zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    protected final com.google.android.gms.internal.ads.zznd zzK() {
        com.google.android.gms.internal.ads.zznd zzndVar = this.zzd;
        zzndVar.getClass();
        return zzndVar;
    }

    protected final com.google.android.gms.internal.ads.zzqf zzL() {
        com.google.android.gms.internal.ads.zzqf zzqfVar = this.zzf;
        zzqfVar.getClass();
        return zzqfVar;
    }

    protected final com.google.android.gms.internal.ads.zzdo zzM() {
        com.google.android.gms.internal.ads.zzdo zzdoVar = this.zzg;
        zzdoVar.getClass();
        return zzdoVar;
    }

    protected final int zzR(long j) {
        com.google.android.gms.internal.ads.zzzc zzzcVar = this.zzi;
        zzzcVar.getClass();
        return zzzcVar.zze(j - this.zzk);
    }

    protected final boolean zzS() {
        if (zzcW()) {
            return this.zzn;
        }
        com.google.android.gms.internal.ads.zzzc zzzcVar = this.zzi;
        zzzcVar.getClass();
        return zzzcVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzn() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzzc zzzcVar = this.zzi;
        zzzcVar.getClass();
        zzzcVar.zzc();
    }
}
