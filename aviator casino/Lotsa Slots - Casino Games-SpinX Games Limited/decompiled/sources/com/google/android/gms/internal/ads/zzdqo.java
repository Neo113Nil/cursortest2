package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdqo extends com.google.android.gms.internal.ads.zzbmh implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzdrq {
    public static final com.google.android.gms.internal.ads.zzgwm zza = com.google.android.gms.internal.ads.zzgwm.zzl("2011", "1009", "3010");
    private final java.lang.String zzb;
    private android.widget.FrameLayout zzd;
    private android.widget.FrameLayout zze;
    private final com.google.android.gms.internal.ads.zzhcg zzf;
    private android.view.View zzg;
    private com.google.android.gms.internal.ads.zzdpo zzi;
    private com.google.android.gms.internal.ads.zzbes zzj;
    private com.google.android.gms.internal.ads.zzbmb zzl;
    private boolean zzm;
    private android.view.GestureDetector zzo;
    private java.util.Map zzc = new java.util.HashMap();
    private com.google.android.gms.dynamic.IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION;

    public zzdqo(android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, int i) {
        java.lang.String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        java.lang.String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zzb(frameLayout, this);
        this.zzf = com.google.android.gms.internal.ads.zzcfr.zzf;
        this.zzj = new com.google.android.gms.internal.ads.zzbes(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzs() {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmY)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new android.view.GestureDetector(this.zzd.getContext(), new com.google.android.gms.internal.ads.zzdqw(this.zzi, this));
    }

    private final synchronized void zzt() {
        this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdqo.this.zzr();
            }
        });
    }

    private final synchronized void zzu(java.lang.String str) {
        android.util.DisplayMetrics displayMetrics;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.content.Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!android.text.TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            android.content.res.Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = android.util.Base64.decode(str, 0);
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    bitmapDrawable.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (java.lang.IllegalArgumentException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View view) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar == null || !zzdpoVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzi(), zzj(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar != null) {
            android.widget.FrameLayout frameLayout = this.zzd;
            zzdpoVar.zzu(frameLayout, zzi(), zzj(), com.google.android.gms.internal.ads.zzdpo.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar != null) {
            android.widget.FrameLayout frameLayout = this.zzd;
            zzdpoVar.zzu(frameLayout, zzi(), zzj(), com.google.android.gms.internal.ads.zzdpo.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar != null) {
            zzdpoVar.zzk(view, motionEvent, this.zzd);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmY)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzb(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        zzh(str, (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzc(java.lang.String str) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zzl(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof com.google.android.gms.internal.ads.zzdpo)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar != null) {
            zzdpoVar.zzh(this);
        }
        zzt();
        com.google.android.gms.internal.ads.zzdpo zzdpoVar2 = (com.google.android.gms.internal.ads.zzdpo) unwrap;
        this.zzi = zzdpoVar2;
        zzdpoVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeN)).booleanValue() && !android.text.TextUtils.isEmpty(this.zzi.zzK())) {
            zzu(this.zzi.zzK());
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final android.widget.FrameLayout zzdA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzdB(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzi.zzx((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzdC(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzdD(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (android.view.MotionEvent) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzdE(com.google.android.gms.internal.ads.zzbmb zzbmbVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbmbVar;
            com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
            if (zzdpoVar != null) {
                zzdpoVar.zzP().zzb(zzbmbVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final /* synthetic */ android.view.View zzdF() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zze() {
        if (this.zzn) {
            return;
        }
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar != null) {
            zzdpoVar.zzh(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final com.google.android.gms.internal.ads.zzbes zzg() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized void zzh(java.lang.String str, android.view.View view, boolean z) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new java.lang.ref.WeakReference(view));
            if (!com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.util.Map zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.util.Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.util.Map zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized android.view.View zzl(java.lang.String str) {
        java.lang.ref.WeakReference weakReference;
        if (!this.zzn && (weakReference = (java.lang.ref.WeakReference) this.zzc.get(str)) != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized java.lang.String zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final com.google.android.gms.dynamic.IObjectWrapper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized org.json.JSONObject zzo() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar == null) {
            return null;
        }
        return zzdpoVar.zzv(this.zzd, zzi(), zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final synchronized org.json.JSONObject zzp() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzi;
        if (zzdpoVar == null) {
            return null;
        }
        return zzdpoVar.zzw(this.zzd, zzi(), zzj());
    }

    public final android.widget.FrameLayout zzq() {
        return this.zzd;
    }

    final /* synthetic */ void zzr() {
        if (this.zzg == null) {
            android.view.View view = new android.view.View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
