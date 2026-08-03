package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public interface zzcku extends com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdky, com.google.android.gms.internal.ads.zzckl, com.google.android.gms.internal.ads.zzbsm, com.google.android.gms.internal.ads.zzcmb, com.google.android.gms.internal.ads.zzcmg, com.google.android.gms.internal.ads.zzbsy, com.google.android.gms.internal.ads.zzbeq, com.google.android.gms.internal.ads.zzcmk, com.google.android.gms.ads.internal.zzn, com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzcmo, com.google.android.gms.internal.ads.zzchn, com.google.android.gms.internal.ads.zzcmp {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcmg, com.google.android.gms.internal.ads.zzchn
    android.content.Context getContext();

    int getHeight();

    android.view.ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    android.view.ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    void loadUrl(java.lang.String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzchn
    void setBackgroundColor(int i);

    void setOnClickListener(android.view.View.OnClickListener onClickListener);

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void setWebChromeClient(android.webkit.WebChromeClient webChromeClient);

    void setWebViewClient(android.webkit.WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzckl
    com.google.android.gms.internal.ads.zzfkf zzC();

    android.webkit.WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcmp
    android.view.View zzE();

    java.util.List zzF();

    void zzG();

    void zzH(int i);

    void zzI();

    void zzJ();

    android.content.Context zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    @Override // com.google.android.gms.internal.ads.zzcmm
    com.google.android.gms.internal.ads.zzcne zzN();

    java.lang.String zzO();

    com.google.android.gms.internal.ads.zzcms zzP();

    android.webkit.WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcmn
    com.google.android.gms.internal.ads.zzbap zzS();

    com.google.android.gms.internal.ads.zzflc zzT();

    com.google.android.gms.internal.ads.zzeln zzU();

    com.google.android.gms.internal.ads.zzell zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcmb
    com.google.android.gms.internal.ads.zzfki zzaC();

    void zzaD(com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar);

    void zzaE(boolean z);

    com.google.common.util.concurrent.ListenableFuture zzaF();

    void zzaG(boolean z);

    boolean zzaa();

    void zzab(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar);

    void zzac(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar);

    void zzad(java.lang.String str, com.google.android.gms.common.util.Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaf(com.google.android.gms.internal.ads.zzcne zzcneVar);

    void zzag(boolean z);

    void zzah();

    void zzai(android.content.Context context);

    void zzaj(boolean z);

    void zzak(com.google.android.gms.internal.ads.zzeln zzelnVar);

    void zzal(com.google.android.gms.internal.ads.zzell zzellVar);

    void zzam(int i);

    void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzao(boolean z);

    void zzap();

    void zzaq(com.google.android.gms.internal.ads.zzblr zzblrVar);

    com.google.android.gms.internal.ads.zzblr zzar();

    void zzas(boolean z);

    void zzat();

    void zzau(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void zzav();

    void zzaw(boolean z);

    void zzax(com.google.android.gms.internal.ads.zzblo zzbloVar);

    void zzay(com.google.android.gms.internal.ads.zzbgd zzbgdVar);

    com.google.android.gms.internal.ads.zzbgd zzaz();

    @Override // com.google.android.gms.internal.ads.zzchn
    com.google.android.gms.internal.ads.zzcma zzh();

    @Override // com.google.android.gms.internal.ads.zzcmg, com.google.android.gms.internal.ads.zzchn
    android.app.Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzchn
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzchn
    com.google.android.gms.internal.ads.zzbjd zzq();

    @Override // com.google.android.gms.internal.ads.zzcmo, com.google.android.gms.internal.ads.zzchn
    com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzchn
    void zzt(java.lang.String str, com.google.android.gms.internal.ads.zzcja zzcjaVar);

    @Override // com.google.android.gms.internal.ads.zzchn
    void zzw(com.google.android.gms.internal.ads.zzcma zzcmaVar);
}
