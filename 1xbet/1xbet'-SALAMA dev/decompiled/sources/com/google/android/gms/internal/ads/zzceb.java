package com.google.android.gms.internal.ads;

import E2.i;
import F2.InterfaceC0217a;
import H2.j;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import p090m3.e;

/* JADX INFO: loaded from: classes.dex */
public interface zzceb extends InterfaceC0217a, zzdcp, zzcds, zzblu, zzcfe, zzcfi, zzbmg, zzaxx, zzcfl, i, zzcfo, zzcfp, zzcaw, zzcfq {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcaw
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i7, int i8);

    @Override // F2.InterfaceC0217a
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcaw
    void setBackgroundColor(int i7);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcaw
    void zzC(zzcfd zzcfdVar);

    @Override // com.google.android.gms.internal.ads.zzcds
    zzfaf zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcfq
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcfo
    zzauo zzI();

    zzazk zzJ();

    zzbex zzK();

    j zzL();

    j zzM();

    zzcft zzN();

    @Override // com.google.android.gms.internal.ads.zzcfn
    zzcfv zzO();

    zzebk zzP();

    zzebm zzQ();

    @Override // com.google.android.gms.internal.ads.zzcfe
    zzfai zzR();

    zzfbe zzS();

    I3.b zzT();

    String zzU();

    List zzV();

    void zzW(zzfaf zzfafVar, zzfai zzfaiVar);

    void zzX();

    void zzY();

    void zzZ(int i7);

    void zzaA(String str, e eVar);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z4, int i7);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z4);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbiz zzbizVar);

    void zzah();

    void zzai(j jVar);

    void zzaj(zzcfv zzcfvVar);

    void zzak(zzazk zzazkVar);

    void zzal(boolean z4);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z4);

    void zzap(zzbev zzbevVar);

    void zzaq(boolean z4);

    void zzar(zzbex zzbexVar);

    void zzas(zzebk zzebkVar);

    void zzat(zzebm zzebmVar);

    void zzau(int i7);

    void zzav(boolean z4);

    void zzaw(j jVar);

    void zzax(boolean z4);

    void zzay(boolean z4);

    void zzaz(String str, zzbiz zzbizVar);

    @Override // E2.i
    /* synthetic */ void zzde();

    @Override // E2.i
    /* synthetic */ void zzdf();

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcaw
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcaw
    E2.a zzj();

    @Override // com.google.android.gms.internal.ads.zzcaw
    zzbcl zzl();

    @Override // com.google.android.gms.internal.ads.zzcfp, com.google.android.gms.internal.ads.zzcaw
    VersionInfoParcel zzm();

    @Override // com.google.android.gms.internal.ads.zzcaw
    zzcfd zzq();

    @Override // com.google.android.gms.internal.ads.zzcaw
    void zzt(String str, zzcci zzcciVar);
}
