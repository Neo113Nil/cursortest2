package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class zzm extends com.google.android.gms.internal.ads.zzbza implements com.google.android.gms.ads.internal.overlay.zzah {
    static final int zza = android.graphics.Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzo = 0;
    protected final android.app.Activity zzb;
    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zzc;
    com.google.android.gms.internal.ads.zzcku zzd;
    com.google.android.gms.ads.internal.overlay.zzj zze;
    com.google.android.gms.ads.internal.overlay.zzu zzf;
    android.widget.FrameLayout zzh;
    android.webkit.WebChromeClient.CustomViewCallback zzi;
    com.google.android.gms.ads.internal.overlay.zzi zzl;
    private java.lang.Runnable zzr;
    private boolean zzs;
    private boolean zzt;
    private android.widget.Toolbar zzx;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final java.lang.Object zzp = new java.lang.Object();
    private final android.view.View.OnClickListener zzq = new com.google.android.gms.ads.internal.overlay.zzd(this);
    private boolean zzu = false;
    private boolean zzv = false;
    private boolean zzw = true;

    public zzm(android.app.Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbr)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbq)).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzJ(android.content.res.Configuration configuration) {
        boolean z;
        com.google.android.gms.ads.internal.zzl zzlVar;
        boolean z2;
        boolean z3;
        int i;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z4 = (adOverlayInfoParcel == null || (zzlVar2 = adOverlayInfoParcel.zzo) == null || !zzlVar2.zzb) ? false : true;
        android.app.Activity activity = this.zzb;
        boolean zzd = com.google.android.gms.ads.internal.zzt.zzf().zzd(activity, configuration);
        if (this.zzk && !z4) {
        }
        if (zzd) {
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 != null && (zzlVar = adOverlayInfoParcel2.zzo) != null && zzlVar.zzg) {
            z = true;
            z2 = true;
            android.view.Window window = activity.getWindow();
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbQ)).booleanValue()) {
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoT)).booleanValue()) {
                return;
            } else {
                return;
            }
        }
        z = true;
        z2 = false;
        android.view.Window window2 = activity.getWindow();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbQ)).booleanValue()) {
            android.view.View decorView = window2.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
                z3 = true;
            } else {
                i = 256;
                z3 = false;
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window2.addFlags(1024);
            window2.clearFlags(2048);
            if (z2) {
                window2.getDecorView().setSystemUiVisibility(4098);
            }
            z3 = true;
        } else {
            window2.addFlags(2048);
            window2.clearFlags(1024);
            z3 = false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoT)).booleanValue() || android.os.Build.VERSION.SDK_INT > 34 || android.os.Build.VERSION.SDK_INT < 28 || !z3) {
            return;
        }
        window2.getAttributes().layoutInDisplayCutoutMode = 1;
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window2, false);
    }

    private final void zzK(android.view.View view) {
        com.google.android.gms.internal.ads.zzeln zzU;
        com.google.android.gms.internal.ads.zzell zzV;
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
        if (zzckuVar == null) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && (zzV = zzckuVar.zzV()) != null) {
            zzV.zzf(view);
        } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgm)).booleanValue() && (zzU = zzckuVar.zzU()) != null && zzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzU.zza(), view);
        }
    }

    private static final void zzL(com.google.android.gms.internal.ads.zzeln zzelnVar, android.view.View view) {
        if (zzelnVar == null || view == null) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgm)).booleanValue() && zzelnVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzelnVar.zza(), view);
    }

    protected final void zzA() {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzu) {
            return;
        }
        this.zzu = true;
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
        if (zzckuVar != null) {
            zzckuVar.zzH(this.zzn - 1);
            synchronized (this.zzp) {
                if (!this.zzs && this.zzd.zzaa()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfY)).booleanValue() && !this.zzv && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzdT();
                    }
                    this.zzr = new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.overlay.zzm.this.zzB();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzr, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbJ)).longValue());
                    return;
                }
            }
        }
        zzB();
    }

    final void zzB() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (this.zzv) {
            return;
        }
        this.zzv = true;
        com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zzd;
        if (zzckuVar2 != null) {
            this.zzl.removeView(zzckuVar2.zzE());
            com.google.android.gms.ads.internal.overlay.zzj zzjVar = this.zze;
            if (zzjVar != null) {
                this.zzd.zzai(zzjVar.zzd);
                this.zzd.zzag(false);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzog)).booleanValue() && this.zzd.getParent() != null) {
                    ((android.view.ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                android.view.ViewGroup viewGroup = this.zze.zzc;
                android.view.View zzE = this.zzd.zzE();
                com.google.android.gms.ads.internal.overlay.zzj zzjVar2 = this.zze;
                viewGroup.addView(zzE, zzjVar2.zza, zzjVar2.zzb);
                this.zze = null;
            } else {
                android.app.Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdU(this.zzn);
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzckuVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzckuVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    protected final void zzD() {
        this.zzd.zzI();
    }

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzF() {
        synchronized (this.zzp) {
            this.zzs = true;
            if (this.zzr != null) {
                com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzgamVar.removeCallbacks(this.zzr);
                zzgamVar.post(this.zzr);
            }
        }
    }

    public final void zzG(com.google.android.gms.internal.ads.zzekt zzektVar) throws com.google.android.gms.ads.internal.overlay.zzh, android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbyu zzbyuVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbyuVar = adOverlayInfoParcel.zzv) == null) {
            throw new com.google.android.gms.ads.internal.overlay.zzh("noioou");
        }
        zzbyuVar.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(zzektVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzH(int i, java.lang.String[] strArr, int[] iArr) {
        if (i == 12345) {
            android.app.Activity activity = this.zzb;
            com.google.android.gms.internal.ads.zzeks zze = com.google.android.gms.internal.ads.zzekt.zze();
            zze.zza(activity);
            zze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, com.google.android.gms.dynamic.ObjectWrapper.wrap(zze.zze()));
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        android.app.Activity activity = this.zzb;
        activity.finish();
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
        if (zzckuVar != null) {
            zzckuVar.zzae(null);
        }
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzt = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzf() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzZ = this.zzd.zzZ();
        if (!zzZ) {
            this.zzd.zze("onbackblocked", java.util.Collections.emptyMap());
        }
        return zzZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[Catch: zzh -> 0x0115, TryCatch #0 {zzh -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba A[Catch: zzh -> 0x0115, TryCatch #0 {zzh -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109 A[Catch: zzh -> 0x0115, TryCatch #0 {zzh -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzh(android.os.Bundle bundle) {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            android.app.Activity activity = this.zzb;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza2 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = zza2;
            if (zza2 == null) {
                throw new com.google.android.gms.ads.internal.overlay.zzh("Could not get info for ad overlay.");
            }
            if (zza2.zzw) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzw = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel2.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel2.zzk != 5 && zzlVar.zzf != -1) {
                        new com.google.android.gms.ads.internal.overlay.zzl(this, null).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.zzw) {
                        com.google.android.gms.internal.ads.zzdde zzddeVar = this.zzc.zzt;
                        if (zzddeVar != null) {
                            zzddeVar.zza();
                        }
                        com.google.android.gms.ads.internal.overlay.zzr zzrVar2 = this.zzc.zzc;
                        if (zzrVar2 != null) {
                            zzrVar2.zzh();
                        }
                    }
                    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    if (adOverlayInfoParcel3.zzk != 1) {
                        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel3.zzb;
                        if (zzaVar != null) {
                            zzaVar.onAdClicked();
                        }
                        com.google.android.gms.internal.ads.zzdky zzdkyVar = this.zzc.zzu;
                        if (zzdkyVar != null) {
                            zzdkyVar.zzdu();
                        }
                    }
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                    zzrVar.zzdo();
                }
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                com.google.android.gms.ads.internal.overlay.zzi zziVar = new com.google.android.gms.ads.internal.overlay.zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
                this.zzl = zziVar;
                zziVar.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
                i = adOverlayInfoParcel5.zzk;
                if (i == 1) {
                    zzy(false);
                    return;
                }
                if (i == 2) {
                    this.zze = new com.google.android.gms.ads.internal.overlay.zzj(adOverlayInfoParcel5.zzd);
                    zzy(false);
                    return;
                } else if (i == 3) {
                    zzy(true);
                    return;
                } else {
                    if (i != 5) {
                        throw new com.google.android.gms.ads.internal.overlay.zzh("Could not determine ad overlay type.");
                    }
                    zzy(false);
                    return;
                }
            }
            if (adOverlayInfoParcel2.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel2.zzk != 5) {
                    new com.google.android.gms.ads.internal.overlay.zzl(this, null).zzb();
                }
                if (bundle == null) {
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null) {
                    zzrVar.zzdo();
                }
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel42 = this.zzc;
                com.google.android.gms.ads.internal.overlay.zzi zziVar2 = new com.google.android.gms.ads.internal.overlay.zzi(activity, adOverlayInfoParcel42.zzn, adOverlayInfoParcel42.zzm.afmaVersion, adOverlayInfoParcel42.zzs);
                this.zzl = zziVar2;
                zziVar2.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel52 = this.zzc;
                i = adOverlayInfoParcel52.zzk;
                if (i == 1) {
                }
            } else {
                this.zzk = false;
                if (bundle == null) {
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null) {
                }
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel422 = this.zzc;
                com.google.android.gms.ads.internal.overlay.zzi zziVar22 = new com.google.android.gms.ads.internal.overlay.zzi(activity, adOverlayInfoParcel422.zzn, adOverlayInfoParcel422.zzm.afmaVersion, adOverlayInfoParcel422.zzs);
                this.zzl = zziVar22;
                zziVar22.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel522 = this.zzc;
                i = adOverlayInfoParcel522.zzk;
                if (i == 1) {
                }
            }
        } catch (com.google.android.gms.ads.internal.overlay.zzh e) {
            java.lang.String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzi() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzj() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzga)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
            if (zzckuVar == null || zzckuVar.zzX()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzk() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzga)).booleanValue()) {
            return;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
        if (zzckuVar != null && !zzckuVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        zzc();
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzga)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzm(int i, int i2, android.content.Intent intent) {
        com.google.android.gms.internal.ads.zzdzl zzI;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzoE;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
                if (zzckuVar == null || zzckuVar.zzP() == null || (zzI = zzckuVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                    return;
                }
                com.google.android.gms.internal.ads.zzdzk zza2 = zzI.zza();
                zza2.zzc("action", "hilca");
                zza2.zzc("gqi", com.google.android.gms.internal.ads.zzgua.zza(adOverlayInfoParcel.zzq));
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length());
                sb2.append(i2);
                zza2.zzc("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("callerPackage");
                    java.lang.String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zza2.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zza2.zzc("hills", stringExtra2);
                    }
                }
                zza2.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        zzJ((android.content.res.Configuration) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzo(android.os.Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzp() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzga)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzq() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzd;
        if (zzckuVar != null) {
            try {
                this.zzl.removeView(zzckuVar.zzE());
            } catch (java.lang.NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgd)).intValue();
        boolean z2 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbM)).booleanValue() || z;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = new com.google.android.gms.ads.internal.overlay.zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : intValue;
        zztVar.zzb = true != z2 ? intValue : 0;
        zztVar.zzc = intValue;
        this.zzf = new com.google.android.gms.ads.internal.overlay.zzu(this.zzb, zztVar, this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzs() {
        this.zzt = true;
    }

    public final void zzt(boolean z, boolean z2) {
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbK)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbL)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new com.google.android.gms.internal.ads.zzbyg(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zza(z3);
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        android.app.Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgV)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgW)).intValue()) {
                if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgX)).intValue()) {
                    if (android.os.Build.VERSION.SDK_INT <= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgY)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        android.app.Activity activity = this.zzb;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzt = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzy(boolean z) throws com.google.android.gms.ads.internal.overlay.zzh {
        boolean z2;
        boolean z3;
        android.content.res.Resources.Theme theme;
        int i;
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        android.app.Activity activity = this.zzb;
        android.view.Window window = activity.getWindow();
        if (window == null) {
            throw new com.google.android.gms.ads.internal.overlay.zzh("Invalid activity, no window available.");
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zzc.zzd;
        com.google.android.gms.internal.ads.zzcms zzP = zzckuVar2 != null ? zzckuVar2.zzP() : null;
        boolean z4 = zzP != null && zzP.zzk();
        this.zzm = false;
        if (z4) {
            int i2 = this.zzc.zzj;
            if (i2 == 6) {
                z2 = activity.getResources().getConfiguration().orientation == 1;
                this.zzm = z2;
            } else if (i2 == 7) {
                z2 = activity.getResources().getConfiguration().orientation == 2;
                this.zzm = z2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(z2).length() + 41);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z2);
            java.lang.String sb2 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
            zzw(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
            if (this.zzk) {
                this.zzl.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            activity.setContentView(this.zzl);
            this.zzt = true;
            if (z) {
                z3 = z4;
                theme = null;
                com.google.android.gms.internal.ads.zzcku zzckuVar3 = this.zzc.zzd;
                this.zzd = zzckuVar3;
                zzckuVar3.zzai(this.zzb);
            } else {
                try {
                    com.google.android.gms.ads.internal.zzt.zzd();
                    com.google.android.gms.internal.ads.zzcku zzckuVar4 = this.zzc.zzd;
                    com.google.android.gms.internal.ads.zzcne zzN = zzckuVar4 != null ? zzckuVar4.zzN() : null;
                    com.google.android.gms.internal.ads.zzcku zzckuVar5 = this.zzc.zzd;
                    java.lang.String zzO = zzckuVar5 != null ? zzckuVar5.zzO() : null;
                    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                    com.google.android.gms.internal.ads.zzcku zzckuVar6 = adOverlayInfoParcel.zzd;
                    z3 = z4;
                    com.google.android.gms.ads.internal.zza zzk = zzckuVar6 != null ? zzckuVar6.zzk() : null;
                    theme = null;
                    com.google.android.gms.internal.ads.zzcku zza2 = com.google.android.gms.internal.ads.zzclk.zza(activity, zzN, zzO, true, z4, null, null, versionInfoParcel, null, null, zzk, com.google.android.gms.internal.ads.zzbhp.zza(), null, null, null, null, null);
                    this.zzd = zza2;
                    com.google.android.gms.internal.ads.zzcms zzP2 = zza2.zzP();
                    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    com.google.android.gms.internal.ads.zzbog zzbogVar = adOverlayInfoParcel2.zzp;
                    com.google.android.gms.internal.ads.zzboi zzboiVar = adOverlayInfoParcel2.zze;
                    com.google.android.gms.ads.internal.overlay.zzad zzadVar = adOverlayInfoParcel2.zzi;
                    com.google.android.gms.internal.ads.zzcku zzckuVar7 = adOverlayInfoParcel2.zzd;
                    zzP2.zzab(null, zzbogVar, null, zzboiVar, zzadVar, true, null, zzckuVar7 != null ? zzckuVar7.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    this.zzd.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                        @Override // com.google.android.gms.internal.ads.zzcmq
                        public final /* synthetic */ void zza(boolean z5, int i4, java.lang.String str, java.lang.String str2) {
                            com.google.android.gms.internal.ads.zzcku zzckuVar8 = com.google.android.gms.ads.internal.overlay.zzm.this.zzd;
                            if (zzckuVar8 != null) {
                                zzckuVar8.zzI();
                            }
                        }
                    });
                    com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    java.lang.String str = adOverlayInfoParcel3.zzl;
                    if (str != null) {
                        this.zzd.loadUrl(str);
                    } else {
                        java.lang.String str2 = adOverlayInfoParcel3.zzh;
                        if (str2 == null) {
                            throw new com.google.android.gms.ads.internal.overlay.zzh("No URL or HTML to display in ad overlay.");
                        }
                        this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                    }
                    com.google.android.gms.internal.ads.zzcku zzckuVar8 = this.zzc.zzd;
                    if (zzckuVar8 != null) {
                        zzckuVar8.zzan(this);
                    }
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e);
                    throw new com.google.android.gms.ads.internal.overlay.zzh("Could not obtain webview for the overlay.", e);
                }
            }
            if (this.zzc.zzw) {
                i = 0;
            } else {
                i = 0;
                android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzD(), false);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbB)).booleanValue() && android.os.Build.VERSION.SDK_INT >= 27) {
                    this.zzd.zzD().setTextClassifier(android.view.textclassifier.TextClassifier.NO_OP);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbC)).booleanValue()) {
                    this.zzd.zzD().setDownloadListener(com.google.android.gms.ads.internal.overlay.zze.zza);
                }
            }
            this.zzd.zzae(this);
            zzckuVar = this.zzc.zzd;
            if (zzckuVar != null) {
                zzL(zzckuVar.zzU(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                android.view.ViewParent parent = this.zzd.getParent();
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(this.zzd.zzE());
                }
                if (this.zzk) {
                    this.zzd.zzat();
                }
                if (!this.zzc.zzw || android.os.Build.VERSION.SDK_INT < 24) {
                    this.zzl.addView(this.zzd.zzE(), -1, -1);
                } else {
                    android.widget.Toolbar toolbar = new android.widget.Toolbar(this.zzb);
                    this.zzx = toolbar;
                    toolbar.setId(android.view.View.generateViewId());
                    this.zzd.zzE().setId(android.view.View.generateViewId());
                    this.zzx.setBackgroundColor(-12303292);
                    this.zzx.setVisibility(i);
                    try {
                        this.zzx.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().zzf().getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_cross, theme));
                    } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException e2) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e2);
                    }
                    this.zzx.setNavigationOnClickListener(this.zzq);
                    this.zzx.setTitleMarginStart(i);
                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10);
                    this.zzl.addView(this.zzx, layoutParams);
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(3, this.zzx.getId());
                    layoutParams2.addRule(12);
                    this.zzl.addView(this.zzd.zzE(), layoutParams2);
                    zzK(this.zzx);
                }
            }
            if (!z && !this.zzm) {
                zzD();
            }
            if (this.zzc.zzk == 5) {
                zzr(z3);
                if (this.zzd.zzR()) {
                    zzt(z3, true);
                    return;
                }
                return;
            }
            android.app.Activity activity2 = this.zzb;
            com.google.android.gms.internal.ads.zzeks zze = com.google.android.gms.internal.ads.zzekt.zze();
            zze.zza(activity2);
            zze.zzb(this);
            zze.zzc(this.zzc.zzq);
            zze.zzd(this.zzc.zzr);
            try {
                zzG(zze.zze());
                return;
            } catch (android.os.RemoteException | com.google.android.gms.ads.internal.overlay.zzh e3) {
                throw new com.google.android.gms.ads.internal.overlay.zzh(e3.getMessage(), e3);
            }
        }
        z2 = false;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(z2).length() + 41);
        sb3.append("Delay onShow to next orientation change: ");
        sb3.append(z2);
        java.lang.String sb22 = sb3.toString();
        int i32 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb22);
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
        }
        activity.setContentView(this.zzl);
        this.zzt = true;
        if (z) {
        }
        if (this.zzc.zzw) {
        }
        this.zzd.zzae(this);
        zzckuVar = this.zzc.zzd;
        if (zzckuVar != null) {
        }
        if (this.zzc.zzk != 5) {
        }
        if (!z) {
            zzD();
        }
        if (this.zzc.zzk == 5) {
        }
    }

    public final void zzz(java.lang.String str) {
        android.widget.Toolbar toolbar = this.zzx;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }
}
