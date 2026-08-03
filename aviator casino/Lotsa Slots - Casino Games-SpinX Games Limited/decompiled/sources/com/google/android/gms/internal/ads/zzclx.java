package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
final class zzclx extends android.webkit.WebView implements android.webkit.DownloadListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, com.google.android.gms.internal.ads.zzcku {
    public static final /* synthetic */ int zza = 0;
    private final java.lang.String zzA;
    private com.google.android.gms.internal.ads.zzcma zzB;
    private boolean zzC;
    private boolean zzD;
    private com.google.android.gms.internal.ads.zzblr zzE;
    private com.google.android.gms.internal.ads.zzblo zzF;
    private com.google.android.gms.internal.ads.zzbgd zzG;
    private int zzH;
    private int zzI;
    private com.google.android.gms.internal.ads.zzbjc zzJ;
    private final com.google.android.gms.internal.ads.zzbjc zzK;
    private com.google.android.gms.internal.ads.zzbjc zzL;
    private final com.google.android.gms.internal.ads.zzbjd zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private java.util.Map zzW;
    private final android.view.WindowManager zzX;
    private final com.google.android.gms.internal.ads.zzbhp zzY;
    private boolean zzZ;
    private final com.google.android.gms.internal.ads.zzcmw zzb;
    private final com.google.android.gms.internal.ads.zzbap zzc;
    private final com.google.android.gms.internal.ads.zzflc zzd;
    private final com.google.android.gms.internal.ads.zzbjx zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final android.util.DisplayMetrics zzi;
    private final float zzj;
    private com.google.android.gms.internal.ads.zzfkf zzk;
    private com.google.android.gms.internal.ads.zzfki zzl;
    private boolean zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzclf zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private com.google.android.gms.internal.ads.zzeln zzq;
    private com.google.android.gms.internal.ads.zzell zzr;
    private com.google.android.gms.internal.ads.zzcne zzs;
    private final java.lang.String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private java.lang.Boolean zzy;
    private boolean zzz;

    protected zzclx(com.google.android.gms.internal.ads.zzcmw zzcmwVar, com.google.android.gms.internal.ads.zzcne zzcneVar, java.lang.String str, boolean z, boolean z2, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzbjx zzbjxVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbjf zzbjfVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzflc zzflcVar) {
        super(zzcmwVar);
        com.google.android.gms.internal.ads.zzfki zzfkiVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcmwVar;
        this.zzs = zzcneVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzbapVar;
        this.zzd = zzflcVar;
        this.zze = zzbjxVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        android.util.DisplayMetrics zzv = com.google.android.gms.ads.internal.util.zzs.zzv(windowManager);
        this.zzi = zzv;
        this.zzj = zzv.density;
        this.zzY = zzbhpVar;
        this.zzk = zzfkfVar;
        this.zzl = zzfkiVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcmwVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        android.webkit.WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (java.lang.NullPointerException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzna)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoH)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzcmwVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzp(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new com.google.android.gms.internal.ads.zzcmf(this, new com.google.android.gms.internal.ads.zzcme() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(android.net.Uri uri) {
                com.google.android.gms.internal.ads.zzclf zzaS = ((com.google.android.gms.internal.ads.zzclx) com.google.android.gms.internal.ads.zzcku.this).zzaS();
                if (zzaS != null) {
                    zzaS.zzQ(uri);
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        com.google.android.gms.internal.ads.zzbjd zzbjdVar = new com.google.android.gms.internal.ads.zzbjd(new com.google.android.gms.internal.ads.zzbjf(true, "make_wv", this.zzt));
        this.zzM = zzbjdVar;
        zzbjdVar.zzc().zza(null);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue() && (zzfkiVar2 = this.zzl) != null && zzfkiVar2.zzb != null) {
            zzbjdVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbjdVar.zzc();
        com.google.android.gms.internal.ads.zzbjc zzf = com.google.android.gms.internal.ads.zzbjf.zzf();
        this.zzK = zzf;
        zzbjdVar.zza("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcmwVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(java.lang.String str) {
        final java.lang.String str2 = com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE;
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzclu
                private final /* synthetic */ java.lang.String zzb = com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE;

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzclx.this.zzaW(this.zzb);
                }
            });
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        java.lang.Boolean zzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = zzc;
        if (zzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(true);
            } catch (java.lang.IllegalStateException unused) {
                zzaQ(false);
            }
        }
    }

    private final void zzbb() {
        com.google.android.gms.internal.ads.zzbix.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzk;
        if (zzfkfVar != null && zzfkfVar.zzam) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        java.util.Map map = this.zzW;
        if (map != null) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzcja) it.next()).release();
            }
        }
        this.zzW = null;
    }

    private final void zzbh() {
        com.google.android.gms.internal.ads.zzbjd zzbjdVar = this.zzM;
        if (zzbjdVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzbjf zzc = zzbjdVar.zzc();
        com.google.android.gms.internal.ads.zzbiv zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zza2 != null) {
            zza2.zzb(zzc);
        }
    }

    private final void zzbi(boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.C3023e8.k, true != z ? "0" : "1");
        zze("onAdVisibilityChanged", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void destroy() {
        zzbh();
        this.zzQ.zzc();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.zzp.zzq();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzF();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzv) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
        zzbg();
        this.zzv = true;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmi)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
            return;
        }
        android.app.Activity zzb = this.zzb.zzb();
        if (zzb != null && zzb.isDestroyed()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaZ(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final java.lang.String str, final android.webkit.ValueCallback valueCallback) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmj)).booleanValue() || android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            com.google.android.gms.internal.ads.zzcfr.zzf.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzclx.this.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzF();
                    com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                    zzbg();
                    zzbf();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (!zzX()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void loadUrl(final java.lang.String str) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzclt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzclx.this.zzaV(str);
                }
            });
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrl");
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.internal.ads.zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzX()) {
            this.zzQ.zzd();
        }
        if (this.zzZ) {
            onResume();
            this.zzZ = false;
        }
        boolean z = this.zzC;
        com.google.android.gms.internal.ads.zzclf zzclfVar = this.zzo;
        if (zzclfVar != null && zzclfVar.zzl()) {
            if (!this.zzD) {
                this.zzo.zzo();
                this.zzo.zzp();
                this.zzD = true;
            }
            zzaM();
            z = true;
        }
        zzbi(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        com.google.android.gms.internal.ads.zzclf zzclfVar;
        synchronized (this) {
            if (!zzX()) {
                this.zzQ.zze();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzclfVar = this.zzo) != null && zzclfVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zzo();
                this.zzo.zzp();
                this.zzD = false;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(android.net.Uri.parse(str), str4);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmx)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(getContext(), intent);
        } catch (android.content.ActivityNotFoundException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51 + java.lang.String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            java.lang.String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
            com.google.android.gms.internal.ads.zzcfd zzh = com.google.android.gms.ads.internal.zzt.zzh();
            java.lang.String.valueOf(str);
            zzh.zzg(e, "AdWebViewImpl.onDownloadStart: ".concat(java.lang.String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !zzaM) {
            return;
        }
        zzL.zzC();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e8 A[Catch: all -> 0x020e, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:40:0x008c, B:44:0x007d, B:47:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:61:0x00dd, B:64:0x00d9, B:65:0x00e2, B:67:0x00ea, B:70:0x00f5, B:77:0x011b, B:79:0x0122, B:83:0x012a, B:85:0x013c, B:87:0x014a, B:90:0x0157, B:94:0x015c, B:96:0x01d1, B:97:0x01d4, B:99:0x01db, B:104:0x01e8, B:106:0x01ee, B:107:0x01f1, B:109:0x01f5, B:110:0x01fe, B:116:0x0209), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c A[Catch: all -> 0x020e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:40:0x008c, B:44:0x007d, B:47:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:61:0x00dd, B:64:0x00d9, B:65:0x00e2, B:67:0x00ea, B:70:0x00f5, B:77:0x011b, B:79:0x0122, B:83:0x012a, B:85:0x013c, B:87:0x014a, B:90:0x0157, B:94:0x015c, B:96:0x01d1, B:97:0x01d4, B:99:0x01db, B:104:0x01e8, B:106:0x01ee, B:107:0x01f1, B:109:0x01f5, B:110:0x01fe, B:116:0x0209), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015c A[Catch: all -> 0x020e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:40:0x008c, B:44:0x007d, B:47:0x0082, B:51:0x0099, B:53:0x00a1, B:55:0x00b3, B:58:0x00b8, B:60:0x00d4, B:61:0x00dd, B:64:0x00d9, B:65:0x00e2, B:67:0x00ea, B:70:0x00f5, B:77:0x011b, B:79:0x0122, B:83:0x012a, B:85:0x013c, B:87:0x014a, B:90:0x0157, B:94:0x015c, B:96:0x01d1, B:97:0x01d4, B:99:0x01db, B:104:0x01e8, B:106:0x01ee, B:107:0x01f1, B:109:0x01f5, B:110:0x01fe, B:116:0x0209), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        com.google.android.gms.internal.ads.zzcne zzcneVar;
        boolean z;
        int i4;
        int i5;
        int i6 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzs.zzi()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeK)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                com.google.android.gms.internal.ads.zzcma zzh = zzh();
                float zzm = zzh != null ? zzh.zzm() : 0.0f;
                if (zzm == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = android.view.View.MeasureSpec.getSize(i);
                int size2 = android.view.View.MeasureSpec.getSize(i2);
                float f = size2 * zzm;
                int i7 = (int) (size / zzm);
                if (size2 == 0) {
                    if (i7 != 0) {
                        i5 = (int) (i7 * zzm);
                        i6 = size;
                        i4 = i7;
                        setMeasuredDimension(java.lang.Math.min(i5, i6), java.lang.Math.min(i7, i4));
                        return;
                    }
                    size2 = 0;
                }
                int i8 = (int) f;
                if (size != 0) {
                    i6 = size;
                } else if (i8 != 0) {
                    i7 = (int) (i8 / zzm);
                    i4 = size2;
                    i5 = i8;
                    i6 = i5;
                    setMeasuredDimension(java.lang.Math.min(i5, i6), java.lang.Math.min(i7, i4));
                    return;
                }
                i4 = size2;
                i5 = i8;
                setMeasuredDimension(java.lang.Math.min(i5, i6), java.lang.Math.min(i7, i4));
                return;
            }
            if (this.zzs.zzf()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeS)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzab("/contentHeight", new com.google.android.gms.internal.ads.zzclr(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzi.density;
                int size3 = android.view.View.MeasureSpec.getSize(i);
                int i9 = this.zzI;
                setMeasuredDimension(size3, i9 != -1 ? (int) (i9 * f2) : android.view.View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzs.zzg()) {
                android.util.DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = android.view.View.MeasureSpec.getMode(i);
            int size4 = android.view.View.MeasureSpec.getSize(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            int size5 = android.view.View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i3 = Integer.MAX_VALUE;
                int i10 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                zzcneVar = this.zzs;
                if (zzcneVar.zzb <= i3 && zzcneVar.zza <= i10) {
                    z = false;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgx)).booleanValue()) {
                        com.google.android.gms.internal.ads.zzcne zzcneVar2 = this.zzs;
                        float f3 = zzcneVar2.zzb;
                        float f4 = this.zzj;
                        z &= f3 / f4 <= ((float) i3) / f4 && ((float) zzcneVar2.zza) / f4 <= ((float) i10) / f4;
                    }
                    if (z) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzn) {
                            this.zzY.zzc(10002);
                            this.zzn = true;
                        }
                        com.google.android.gms.internal.ads.zzcne zzcneVar3 = this.zzs;
                        setMeasuredDimension(zzcneVar3.zzb, zzcneVar3.zza);
                        return;
                    }
                    float f5 = this.zzs.zzb;
                    float f6 = this.zzj;
                    int i11 = (int) (f5 / f6);
                    int i12 = (int) (r2.zza / f6);
                    int i13 = (int) (size4 / f6);
                    int i14 = (int) (size5 / f6);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i11).length() + 36 + java.lang.String.valueOf(i12).length() + 18 + java.lang.String.valueOf(i13).length() + 1 + java.lang.String.valueOf(i14).length() + 4);
                    sb.append("Not enough space to show ad. Needs ");
                    sb.append(i11);
                    sb.append("x");
                    sb.append(i12);
                    sb.append(" dp, but only has ");
                    sb.append(i13);
                    sb.append("x");
                    sb.append(i14);
                    sb.append(" dp.");
                    java.lang.String sb2 = sb.toString();
                    int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.zzm) {
                        return;
                    }
                    this.zzY.zzc(10001);
                    this.zzm = true;
                    return;
                }
                z = true;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgx)).booleanValue()) {
                }
                if (z) {
                }
            }
            i3 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzcneVar = this.zzs;
            if (zzcneVar.zzb <= i3) {
                z = false;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgx)).booleanValue()) {
                }
                if (z) {
                }
            }
            z = true;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgx)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzob)).booleanValue() && androidx.webkit.WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                androidx.webkit.WebViewCompat.setAudioMuted(this, true);
            }
        } catch (java.lang.Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzob)).booleanValue() && androidx.webkit.WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                androidx.webkit.WebViewCompat.setAudioMuted(this, false);
            }
        } catch (java.lang.Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzes)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z) {
            com.google.android.gms.internal.ads.zzbap zzbapVar = this.zzc;
            if (zzbapVar != null) {
                zzbapVar.zzc(motionEvent);
            }
            com.google.android.gms.internal.ads.zzbjx zzbjxVar = this.zze;
            if (zzbjxVar != null) {
                zzbjxVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                com.google.android.gms.internal.ads.zzblr zzblrVar = this.zzE;
                if (zzblrVar != null) {
                    zzblrVar.zzb(motionEvent);
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final void setWebViewClient(android.webkit.WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof com.google.android.gms.internal.ads.zzclf) {
            this.zzo = (com.google.android.gms.internal.ads.zzclf) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (java.lang.Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzA(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzckl
    public final com.google.android.gms.internal.ads.zzfkf zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final android.webkit.WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmp
    public final android.view.View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final java.util.List zzF() {
        return new java.util.ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzG() {
        zzbb();
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzH(int i) {
        if (i == 0) {
            com.google.android.gms.internal.ads.zzbjd zzbjdVar = this.zzM;
            com.google.android.gms.internal.ads.zzbix.zza(zzbjdVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        com.google.android.gms.internal.ads.zzbjd zzbjdVar2 = this.zzM;
        zzbjdVar2.zzc();
        zzbjdVar2.zzc().zzd("close_type", java.lang.String.valueOf(i));
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("closetype", java.lang.String.valueOf(i));
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzI() {
        if (this.zzJ == null) {
            com.google.android.gms.internal.ads.zzbjd zzbjdVar = this.zzM;
            com.google.android.gms.internal.ads.zzbix.zza(zzbjdVar.zzc(), this.zzK, "aes2");
            zzbjdVar.zzc();
            com.google.android.gms.internal.ads.zzbjc zzf = com.google.android.gms.internal.ads.zzbjf.zzf();
            this.zzJ = zzf;
            zzbjdVar.zza("native:view_show", zzf);
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzJ() {
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("app_muted", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        hashMap.put("app_volume", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        hashMap.put("device_volume", java.lang.String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final android.content.Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmm
    public final synchronized com.google.android.gms.internal.ads.zzcne zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized java.lang.String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcms zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final android.webkit.WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmn
    public final com.google.android.gms.internal.ads.zzbap zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.internal.ads.zzflc zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.internal.ads.zzeln zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.internal.ads.zzell zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcls(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zza(java.lang.String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        com.google.android.gms.internal.ads.zzbho zzbhoVar = new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzclv
            @Override // com.google.android.gms.internal.ads.zzbho
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar) {
                int i2 = com.google.android.gms.internal.ads.zzclx.zza;
                com.google.android.gms.internal.ads.zzbhv.zzbl.zza zzq = com.google.android.gms.internal.ads.zzbhv.zzbl.zzq();
                boolean zzb = zzq.zzb();
                boolean z2 = z;
                if (zzb != z2) {
                    zzq.zzc(z2);
                }
                zzq.zzg(i);
                zzaVar.zzal(zzq.zzbu());
            }
        };
        com.google.android.gms.internal.ads.zzbhp zzbhpVar = this.zzY;
        zzbhpVar.zzb(zzbhoVar);
        zzbhpVar.zzc(com.google.android.gms.games.GamesActivityResultCodes.RESULT_LICENSE_FAILED);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmb
    public final com.google.android.gms.internal.ads.zzfki zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaD(com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar) {
        this.zzk = zzfkfVar;
        this.zzl = zzfkiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaE(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzu(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.common.util.concurrent.ListenableFuture zzaF() {
        com.google.android.gms.internal.ads.zzbjx zzbjxVar = this.zze;
        return zzbjxVar == null ? com.google.android.gms.internal.ads.zzhbw.zza(null) : zzbjxVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaG(boolean z) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, java.lang.String str) {
        this.zzo.zzv(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaI(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaJ(boolean z, int i, java.lang.String str, boolean z2, boolean z3) {
        this.zzo.zzy(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaK(boolean z, int i, java.lang.String str, java.lang.String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaL(java.lang.String str, java.lang.String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r10.zzV != r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r10.zzV != r9) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaM() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzo.zzk() || this.zzo.zzl()) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            android.util.DisplayMetrics displayMetrics = this.zzi;
            int zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zza();
            int zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.heightPixels);
            android.app.Activity zzb = this.zzb.zzb();
            if (zzb == null || zzb.getWindow() == null) {
                i = zzC;
                i2 = zzC2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzV = com.google.android.gms.ads.internal.util.zzs.zzV(zzb);
                com.google.android.gms.ads.internal.client.zzay.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, zzV[0]);
                com.google.android.gms.ads.internal.client.zzay.zza();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, zzV[1]);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == zzC && this.zzR == zzC2 && this.zzT == i && this.zzU == i2) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaF)).booleanValue()) {
                }
            }
            if (this.zzS == zzC && this.zzR == zzC2) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaF)).booleanValue()) {
                }
                this.zzS = zzC;
                this.zzR = zzC2;
                this.zzT = i;
                this.zzU = i2;
                this.zzV = rotation;
                new com.google.android.gms.internal.ads.zzbyg(this, "").zzl(zzC, zzC2, i, i2, displayMetrics.density, rotation);
                return z;
            }
            z = true;
            this.zzS = zzC;
            this.zzR = zzC2;
            this.zzT = i;
            this.zzU = i2;
            this.zzV = rotation;
            new com.google.android.gms.internal.ads.zzbyg(this, "").zzl(zzC, zzC2, i, i2, displayMetrics.density, rotation);
            return z;
        }
        return false;
    }

    protected final synchronized void zzaN(java.lang.String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaO(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaP(java.lang.String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    final void zzaQ(java.lang.Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    final synchronized java.lang.Boolean zzaR() {
        return this.zzy;
    }

    public final com.google.android.gms.internal.ads.zzclf zzaS() {
        return this.zzo;
    }

    final /* synthetic */ void zzaU(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaV(java.lang.String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void zzaW(java.lang.String str) {
        super.loadUrl(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
    }

    final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    final /* synthetic */ void zzaY(int i) {
        this.zzI = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzab(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        com.google.android.gms.internal.ads.zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzB(str, zzbpqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzac(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        com.google.android.gms.internal.ads.zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzC(str, zzbpqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzad(java.lang.String str, com.google.android.gms.common.util.Predicate predicate) {
        com.google.android.gms.internal.ads.zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaf(com.google.android.gms.internal.ads.zzcne zzcneVar) {
        this.zzs = zzcneVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzag(boolean z) {
        boolean z2 = this.zzw;
        this.zzw = z;
        zzbc();
        if (z != z2) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaD)).booleanValue() || !this.zzs.zzg()) {
                new com.google.android.gms.internal.ads.zzbyg(this, "").zzk(true != z ? com.unity3d.ads.BuildConfig.FLAVOR : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzai(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcmw zzcmwVar = this.zzb;
        zzcmwVar.setBaseContext(context);
        this.zzQ.zza(zzcmwVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaj(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(this.zzo.zzk(), z);
        } else {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzak(com.google.android.gms.internal.ads.zzeln zzelnVar) {
        this.zzq = zzelnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzal(com.google.android.gms.internal.ads.zzell zzellVar) {
        this.zzr = zzellVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzam(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzao(boolean z) {
        this.zzz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzap() {
        if (this.zzL == null) {
            com.google.android.gms.internal.ads.zzbjd zzbjdVar = this.zzM;
            zzbjdVar.zzc();
            com.google.android.gms.internal.ads.zzbjc zzf = com.google.android.gms.internal.ads.zzbjf.zzf();
            this.zzL = zzf;
            zzbjdVar.zza("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaq(com.google.android.gms.internal.ads.zzblr zzblrVar) {
        this.zzE = zzblrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.internal.ads.zzblr zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzau(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.String str5 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaC);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (org.json.JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, com.google.android.gms.internal.ads.zzcml.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaw(boolean z) {
        this.zzo.zzO(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzax(com.google.android.gms.internal.ads.zzblo zzbloVar) {
        this.zzF = zzbloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzay(com.google.android.gms.internal.ads.zzbgd zzbgdVar) {
        this.zzG = zzbgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.internal.ads.zzbgd zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzc(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + java.lang.String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzd(java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        java.lang.String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(sb2));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
        com.google.android.gms.internal.ads.zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        synchronized (this) {
            this.zzC = zzbepVar.zzj;
        }
        zzbi(zzbepVar.zzj);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzchc zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzdn(boolean z) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        com.google.android.gms.internal.ads.zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zze(java.lang.String str, java.util.Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
        } catch (org.json.JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final synchronized com.google.android.gms.internal.ads.zzcma zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzbjc zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmg, com.google.android.gms.internal.ads.zzchn
    public final android.app.Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized java.lang.String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized java.lang.String zzn() {
        com.google.android.gms.internal.ads.zzfki zzfkiVar = this.zzl;
        if (zzfkiVar == null) {
            return null;
        }
        return zzfkiVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzo(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzbjd zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized com.google.android.gms.internal.ads.zzcja zzr(java.lang.String str) {
        java.util.Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (com.google.android.gms.internal.ads.zzcja) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmo, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzt(java.lang.String str, com.google.android.gms.internal.ads.zzcja zzcjaVar) {
        if (this.zzW == null) {
            this.zzW = new java.util.HashMap();
        }
        this.zzW.put(str, zzcjaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzu(boolean z, long j) {
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.toString(j));
        zze("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzv(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzw(com.google.android.gms.internal.ads.zzcma zzcmaVar) {
        if (this.zzB == null) {
            this.zzB = zzcmaVar;
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzz() {
        com.google.android.gms.internal.ads.zzblo zzbloVar = this.zzF;
        if (zzbloVar != null) {
            zzbloVar.zza();
        }
    }
}
