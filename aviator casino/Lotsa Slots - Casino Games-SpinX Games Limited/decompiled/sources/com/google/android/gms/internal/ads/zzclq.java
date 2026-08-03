package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzclq extends android.widget.FrameLayout implements com.google.android.gms.internal.ads.zzcku {
    private final com.google.android.gms.internal.ads.zzcku zza;
    private final com.google.android.gms.internal.ads.zzchc zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzclq(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        super(zzckuVar.getContext());
        this.zzc = new java.util.concurrent.atomic.AtomicBoolean();
        this.zza = zzckuVar;
        this.zzb = new com.google.android.gms.internal.ads.zzchc(zzckuVar.zzK(), this, this, zzdzlVar);
        addView((android.view.View) zzckuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void destroy() {
        final com.google.android.gms.internal.ads.zzell zzV;
        final com.google.android.gms.internal.ads.zzeln zzU = zzU();
        if (zzU != null) {
            com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgamVar.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzclp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.zzt.zzu().zzf(com.google.android.gms.internal.ads.zzeln.this.zza());
                }
            });
            final com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
            java.util.Objects.requireNonNull(zzckuVar);
            zzgamVar.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzclm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcku.this.destroy();
                }
            }, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgl)).intValue());
            return;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() || (zzV = zzV()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcln
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final com.google.android.gms.internal.ads.zzclq zzclqVar = com.google.android.gms.internal.ads.zzclq.this;
                    zzV.zze(new com.google.android.gms.internal.ads.zzfuv() { // from class: com.google.android.gms.internal.ads.zzclo
                        @Override // com.google.android.gms.internal.ads.zzfuv
                        public final /* synthetic */ void zza(boolean z) {
                            com.google.android.gms.internal.ads.zzclq.this.zzaM(true);
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void loadUrl(java.lang.String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcku
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcku
    public final void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void setWebChromeClient(android.webkit.WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void setWebViewClient(android.webkit.WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzA(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzckl
    public final com.google.android.gms.internal.ads.zzfkf zzC() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final android.webkit.WebView zzD() {
        return (android.webkit.WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmp
    public final android.view.View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final java.util.List zzF() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzG() {
        this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzH(int i) {
        this.zza.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzJ() {
        this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final android.content.Context zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmm
    public final com.google.android.gms.internal.ads.zzcne zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final java.lang.String zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.internal.ads.zzcms zzP() {
        return ((com.google.android.gms.internal.ads.zzclx) this.zza).zzaS();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final android.webkit.WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmn
    public final com.google.android.gms.internal.ads.zzbap zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.internal.ads.zzflc zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.internal.ads.zzeln zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.internal.ads.zzell zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zza(java.lang.String str) {
        ((com.google.android.gms.internal.ads.zzclx) this.zza).zzaP(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzaA(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbx)).booleanValue()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) zzckuVar.getParent()).removeView((android.view.View) zzckuVar);
        }
        zzckuVar.zzaA(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmb
    public final com.google.android.gms.internal.ads.zzfki zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaD(com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar) {
        this.zza.zzaD(zzfkfVar, zzfkiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaE(boolean z) {
        this.zza.zzaE(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.common.util.concurrent.ListenableFuture zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaG(boolean z) {
        this.zza.zzaG(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, java.lang.String str) {
        this.zza.zzaH(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaI(boolean z, int i, boolean z2) {
        this.zza.zzaI(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaJ(boolean z, int i, java.lang.String str, boolean z2, boolean z3) {
        this.zza.zzaJ(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaK(boolean z, int i, java.lang.String str, java.lang.String str2, boolean z2) {
        this.zza.zzaK(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaL(java.lang.String str, java.lang.String str2, int i) {
        this.zza.zzaL(str, str2, 14);
    }

    final /* synthetic */ void zzaM(boolean z) {
        final com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
        java.util.Objects.requireNonNull(zzckuVar);
        zzgamVar.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcll
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcku.this.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzab(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        this.zza.zzab(str, zzbpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzac(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        this.zza.zzac(str, zzbpqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzad(java.lang.String str, com.google.android.gms.common.util.Predicate predicate) {
        this.zza.zzad(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzae(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaf(com.google.android.gms.internal.ads.zzcne zzcneVar) {
        this.zza.zzaf(zzcneVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzag(boolean z) {
        this.zza.zzag(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzai(android.content.Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaj(boolean z) {
        this.zza.zzaj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzak(com.google.android.gms.internal.ads.zzeln zzelnVar) {
        this.zza.zzak(zzelnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzal(com.google.android.gms.internal.ads.zzell zzellVar) {
        this.zza.zzal(zzellVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzam(int i) {
        this.zza.zzam(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzan(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzap() {
        this.zza.zzap();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaq(com.google.android.gms.internal.ads.zzblr zzblrVar) {
        this.zza.zzaq(zzblrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.internal.ads.zzblr zzar() {
        return this.zza.zzar();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzau(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza.zzau(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzav() {
        com.google.android.gms.internal.ads.zzeln zzU;
        com.google.android.gms.internal.ads.zzell zzV;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzc();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzB());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new android.widget.FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && (zzV = zzV()) != null) {
            zzV.zzf(textView);
        } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgm)).booleanValue() && (zzU = zzU()) != null && zzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzU.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaw(boolean z) {
        this.zza.zzaw(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzax(com.google.android.gms.internal.ads.zzblo zzbloVar) {
        this.zza.zzax(zzbloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzay(com.google.android.gms.internal.ads.zzbgd zzbgdVar) {
        this.zza.zzay(zzbgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final com.google.android.gms.internal.ads.zzbgd zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzb(java.lang.String str, org.json.JSONObject jSONObject) {
        ((com.google.android.gms.internal.ads.zzclx) this.zza).zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzc(java.lang.String str, java.lang.String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzd(java.lang.String str, org.json.JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        this.zza.zzdj(zzbepVar);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzchc zzdm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzdn(boolean z) {
        this.zza.zzdn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zze(java.lang.String str, java.util.Map map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzcma zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzbjc zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmg, com.google.android.gms.internal.ads.zzchn
    public final android.app.Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final java.lang.String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final java.lang.String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzo(int i) {
        this.zza.zzo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzbjd zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.internal.ads.zzcja zzr(java.lang.String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmo, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final void zzt(java.lang.String str, com.google.android.gms.internal.ads.zzcja zzcjaVar) {
        this.zza.zzt(str, zzcjaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzu(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzv(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final void zzw(com.google.android.gms.internal.ads.zzcma zzcmaVar) {
        this.zza.zzw(zzcmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final int zzx() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeL)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final int zzy() {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeL)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzz() {
        this.zza.zzz();
    }
}
