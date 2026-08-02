package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import H2.j;
import I2.K;
import I2.P;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcet extends FrameLayout implements zzceb {
    private final zzceb zza;
    private final zzcal zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcet(zzceb zzcebVar, zzdqq zzdqqVar) {
        super(zzcebVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcebVar;
        this.zzb = new zzcal(zzcebVar.zzE(), this, this, zzdqqVar);
        addView((View) zzcebVar);
    }

    public static /* synthetic */ void zzaI(zzcet zzcetVar, boolean z4) {
        zzceb zzcebVar = zzcetVar.zza;
        K k7 = P.f3579l;
        Objects.requireNonNull(zzcebVar);
        k7.post(new zzcep(zzcebVar));
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void destroy() {
        final zzebk zzP;
        final zzebm zzQ = zzQ();
        if (zzQ != null) {
            K k7 = P.f3579l;
            k7.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
                @Override // java.lang.Runnable
                public final void run() {
                    o.f1952C.f1977x.zzi(zzebm.this.zza());
                }
            });
            zzceb zzcebVar = this.zza;
            Objects.requireNonNull(zzcebVar);
            k7.postDelayed(new zzcep(zzcebVar), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzfl)).intValue());
            return;
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfn)).booleanValue() || (zzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final void run() {
                    zzP.zzf(new zzces(zzcet.this));
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzceb, F2.InterfaceC0217a
    public final void onAdClicked() {
        zzceb zzcebVar = this.zza;
        if (zzcebVar != null) {
            zzcebVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzceb
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzceb
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzA(int i7) {
        this.zza.zzA(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzB(int i7) {
        this.zzb.zzg(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final void zzC(zzcfd zzcfdVar) {
        this.zza.zzC(zzcfdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcds
    public final zzfaf zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfq
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfo
    public final zzauo zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final zzazk zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final zzbex zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final j zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final j zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final zzcft zzN() {
        return ((zzcfa) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfn
    public final zzcfv zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final zzebk zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final zzebm zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfe
    public final zzfai zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final zzfbe zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final I3.b zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzW(zzfaf zzfafVar, zzfai zzfaiVar) {
        this.zza.zzW(zzfafVar, zzfaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzZ(int i7) {
        this.zza.zzZ(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zza(String str) {
        ((zzcfa) this.zza).zzaW(str);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaA(String str, e eVar) {
        this.zza.zzaA(str, eVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaD(boolean z4, int i7) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaZ)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaD(z4, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z4, boolean z7, String str) {
        this.zza.zzaJ(zzcVar, z4, z7, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaK(String str, String str2, int i7) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaL(boolean z4, int i7, boolean z7) {
        this.zza.zzaL(z4, i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaM(boolean z4, int i7, String str, String str2, boolean z7) {
        this.zza.zzaM(z4, i7, str, str2, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaN(boolean z4, int i7, String str, boolean z7, boolean z8) {
        this.zza.zzaN(z4, i7, str, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzac(boolean z4) {
        this.zza.zzac(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzae(String str, String str2, String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzag(String str, zzbiz zzbizVar) {
        this.zza.zzag(str, zzbizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzah() {
        zzebm zzQ;
        zzebk zzP;
        TextView textView = new TextView(getContext());
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        Resources zze = oVar.f1961g.zze();
        textView.setText(zze != null ? zze.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        zzbbp zzbbpVar = zzbby.zzfn;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && (zzP = zzP()) != null) {
            zzP.zza(textView);
        } else if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfm)).booleanValue() && (zzQ = zzQ()) != null && zzQ.zzb()) {
            oVar.f1977x.zzg(zzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzai(j jVar) {
        this.zza.zzai(jVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaj(zzcfv zzcfvVar) {
        this.zza.zzaj(zzcfvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzak(zzazk zzazkVar) {
        this.zza.zzak(zzazkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzal(boolean z4) {
        this.zza.zzal(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzao(boolean z4) {
        this.zza.zzao(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzap(zzbev zzbevVar) {
        this.zza.zzap(zzbevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaq(boolean z4) {
        this.zza.zzaq(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzar(zzbex zzbexVar) {
        this.zza.zzar(zzbexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzas(zzebk zzebkVar) {
        this.zza.zzas(zzebkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzat(zzebm zzebmVar) {
        this.zza.zzat(zzebmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzau(int i7) {
        this.zza.zzau(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzav(boolean z4) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaw(j jVar) {
        this.zza.zzaw(jVar);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzax(boolean z4) {
        this.zza.zzax(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzay(boolean z4) {
        this.zza.zzay(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaz(String str, zzbiz zzbizVar) {
        this.zza.zzaz(str, zzbizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        zzceb zzcebVar = this.zza;
        if (zzcebVar != null) {
            zzcebVar.zzdd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb, E2.i
    public final void zzde() {
        this.zza.zzde();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, E2.i
    public final void zzdf() {
        this.zza.zzdf();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        this.zza.zzdn(zzaxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzg() {
        return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeb)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzh() {
        return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeb)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcaw
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final E2.a zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final zzbck zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final zzbcl zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfp, com.google.android.gms.internal.ads.zzcaw
    public final VersionInfoParcel zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final zzcal zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final zzcci zzo(String str) {
        return this.zza.zzo(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzp(String str, JSONObject jSONObject) {
        ((zzcfa) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final zzcfd zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final String zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final void zzt(String str, zzcci zzcciVar) {
        this.zza.zzt(str, zzcciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
        zzceb zzcebVar = this.zza;
        if (zzcebVar != null) {
            zzcebVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzv(boolean z4, long j) {
        this.zza.zzv(z4, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzx(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzy(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzz(boolean z4) {
        this.zza.zzz(false);
    }
}
