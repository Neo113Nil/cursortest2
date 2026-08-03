package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfpy implements com.google.android.gms.internal.ads.zzfpw {
    private final android.content.Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private com.google.android.gms.internal.ads.zzfql zzj = com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private java.lang.String zzk = "";
    private java.lang.String zzl = "";
    private java.lang.String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    zzfpy(android.content.Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    final /* synthetic */ long zzA() {
        return this.zzb;
    }

    final /* synthetic */ long zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ int zzD() {
        return this.zze;
    }

    final /* synthetic */ java.lang.String zzE() {
        return this.zzf;
    }

    final /* synthetic */ java.lang.String zzF() {
        return this.zzg;
    }

    final /* synthetic */ java.lang.String zzG() {
        return this.zzh;
    }

    final /* synthetic */ java.lang.String zzH() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfql zzI() {
        return this.zzj;
    }

    final /* synthetic */ java.lang.String zzJ() {
        return this.zzk;
    }

    final /* synthetic */ java.lang.String zzK() {
        return this.zzl;
    }

    final /* synthetic */ java.lang.String zzL() {
        return this.zzm;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzM(int i) {
        this.zzq = i;
        return this;
    }

    final /* synthetic */ int zzN() {
        return this.zzp;
    }

    final /* synthetic */ int zzO() {
        return this.zzq;
    }

    final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzd(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zze(java.lang.String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzf(com.google.android.gms.internal.ads.zzfql zzfqlVar) {
        zzu(zzfqlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzg(com.google.android.gms.internal.ads.zzfkp zzfkpVar) {
        zzv(zzfkpVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzi(java.lang.String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzj(java.lang.Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzk(java.lang.String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final boolean zzl() {
        return !android.text.TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final synchronized com.google.android.gms.internal.ads.zzfpz zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzq();
        }
        if (this.zzc < 0) {
            zzr();
        }
        return new com.google.android.gms.internal.ads.zzfpz(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzp(int i) {
        zzM(i);
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzq() {
        android.content.res.Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzf = com.google.android.gms.ads.internal.zzt.zzf();
        android.content.Context context = this.zza;
        this.zze = zzf.zzm(context);
        android.content.res.Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzt(java.lang.String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzu(com.google.android.gms.internal.ads.zzfql zzfqlVar) {
        this.zzj = zzfqlVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized com.google.android.gms.internal.ads.zzfpy zzv(com.google.android.gms.internal.ads.zzfkp zzfkpVar) {
        java.lang.String str = zzfkpVar.zzb.zzb;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.zzf = str;
        }
        java.util.Iterator it = zzfkpVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str2 = ((com.google.android.gms.internal.ads.zzfkf) it.next()).zzab;
            if (!android.text.TextUtils.isEmpty(str2)) {
                break;
            }
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        android.os.IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            com.google.android.gms.internal.ads.zzdck zzdckVar = (com.google.android.gms.internal.ads.zzdck) iBinder;
            java.lang.String zzk = zzdckVar.zzk();
            if (!android.text.TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            java.lang.String zzf = zzdckVar.zzf();
            if (!android.text.TextUtils.isEmpty(zzf)) {
                this.zzg = zzf;
            }
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzx(java.lang.String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzy(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkd)).booleanValue()) {
            this.zzl = com.google.android.gms.internal.ads.zzbzy.zzf(th);
            this.zzk = (java.lang.String) com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc('\n')).zzd(com.google.android.gms.internal.ads.zzbzy.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized com.google.android.gms.internal.ads.zzfpy zzz(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkd)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
