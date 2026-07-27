package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import o1.AbstractC1150b;

/* loaded from: classes.dex */
public class wa extends u7 implements View.OnClickListener {

    /* renamed from: C, reason: collision with root package name */
    public long f4587C;

    /* renamed from: D, reason: collision with root package name */
    public sd f4588D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4590F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4591G;

    /* renamed from: t, reason: collision with root package name */
    public WebView f4595t;

    /* renamed from: u, reason: collision with root package name */
    public RelativeLayout f4596u;

    /* renamed from: v, reason: collision with root package name */
    public ImageButton f4597v;

    /* renamed from: x, reason: collision with root package name */
    public xf f4599x;

    /* renamed from: w, reason: collision with root package name */
    public long f4598w = 0;
    public boolean y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4600z = false;

    /* renamed from: A, reason: collision with root package name */
    public int f4585A = 0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4586B = false;

    /* renamed from: E, reason: collision with root package name */
    public x0 f4589E = new va(this);

    /* renamed from: H, reason: collision with root package name */
    public final la f4592H = new la(this);

    /* renamed from: I, reason: collision with root package name */
    public final ma f4593I = new ma(this);

    /* renamed from: J, reason: collision with root package name */
    public final na f4594J = new na(this);

    @Override // com.startapp.sdk.internal.u7
    public void a(Bundle bundle) {
        wb.a(this.f4423a).a(this.f4425c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            this.f4600z = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.f4585A = bundle.getInt("replayNum");
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public final void b(Bundle bundle) {
        bundle.putBoolean("videoCompletedBroadcastSent", this.f4600z);
        bundle.putInt("replayNum", this.f4585A);
    }

    @Override // com.startapp.sdk.internal.u7
    public boolean c() {
        if (this.f4589E.c()) {
            return true;
        }
        if (this.f4440s != null && SystemClock.uptimeMillis() - this.f4587C < this.f4440s.longValue()) {
            return true;
        }
        i();
        fh.f3695a.getClass();
        xf xfVar = this.f4599x;
        if (xfVar == null) {
            return false;
        }
        xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
        return false;
    }

    @Override // com.startapp.sdk.internal.u7
    public final void d() {
        this.f4589E.e();
    }

    @Override // com.startapp.sdk.internal.u7
    public final void e() {
        super.e();
        sd sdVar = this.f4588D;
        if (sdVar != null) {
            AbstractC1150b abstractC1150b = sdVar.f4332a;
            if (abstractC1150b != null) {
                abstractC1150b.c();
            }
            this.f4588D = null;
        }
        WebView webView = this.f4595t;
        long N2 = MetaData.E().N();
        WeakHashMap weakHashMap = si.f4343a;
        new Handler(Looper.getMainLooper()).postDelayed(new oi(webView), N2);
    }

    @Override // com.startapp.sdk.internal.u7
    public void f() {
        this.f4590F = false;
        this.f4591G = true;
        this.f4589E.f();
        xf xfVar = this.f4599x;
        if (xfVar != null) {
            xfVar.a();
        }
        WebView webView = this.f4595t;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public void g() {
        String str;
        String str2;
        this.f4590F = true;
        this.f4591G = false;
        Ad ad = this.f4432k;
        if (ad instanceof ka ? ((ka) ad).hasAdCacheTtlPassed() : false) {
            b();
        } else {
            fh.f3695a.getClass();
            WebView webView = this.f4595t;
            if (webView == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f4423a);
                this.f4596u = relativeLayout;
                relativeLayout.setFitsSystemWindows(true);
                this.f4596u.setContentDescription("StartApp Ad");
                this.f4596u.setId(h0.f3816h);
                this.f4423a.setContentView(this.f4596u);
                try {
                    this.f4595t = ((rk) com.startapp.sdk.components.a.a(this.f4423a).f3355b.a()).c();
                    this.f4598w = SystemClock.uptimeMillis();
                    this.f4595t.setBackgroundColor(-16777216);
                    this.f4423a.getWindow().getDecorView().findViewById(R.id.content).setBackgroundColor(7829367);
                    this.f4595t.setVerticalScrollBarEnabled(false);
                    this.f4595t.setHorizontalScrollBarEnabled(false);
                    this.f4595t.getSettings().setJavaScriptEnabled(true);
                    p0.a(this.f4595t);
                    this.f4595t.setOnLongClickListener(new oa());
                    this.f4595t.setLongClickable(false);
                    this.f4595t.addJavascriptInterface(l(), "startappwall");
                    a(this.f4595t);
                    this.f4595t.setWebViewClient(new ua(this));
                    this.f4595t.setWebChromeClient(new pa());
                    Ad ad2 = this.f4432k;
                    if (ad2 instanceof m8) {
                        str = ((m8) ad2).f4031b;
                        if (str != null && (str2 = this.f4435n) != null && !str2.isEmpty()) {
                            str = str.replaceAll("startapp_adtag_placeholder", this.f4435n);
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "<html><body></body></html>";
                    }
                    si.a(this.f4595t, str);
                    Log.println(2, "StartAppSDK", "Interstitial start rendering the ad content");
                    this.f4586B = "true".equals(si.a(str, "@jsTag@", "@jsTag@"));
                    this.f4596u.addView(this.f4595t, new RelativeLayout.LayoutParams(-1, -1));
                    a(this.f4596u);
                } catch (Throwable th) {
                    d9.a(th);
                    b();
                }
            } else {
                webView.onResume();
                xf xfVar = this.f4599x;
                if (xfVar != null) {
                    xfVar.c();
                }
            }
        }
        this.f4589E.g();
    }

    public void i() {
        String str;
        String[] strArr = this.f4426d;
        if (strArr == null || strArr.length <= 0 || (str = strArr[0]) == null) {
            return;
        }
        g0.a(this.f4423a, str, new CloseTrackingParams(this.f4435n, k()));
    }

    public final void j() {
        if (this.f4597v != null) {
            return;
        }
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f4423a);
            ImageButton imageButton = new ImageButton(this.f4423a);
            this.f4597v = imageButton;
            imageButton.setBackgroundColor(0);
            this.f4597v.setOnClickListener(this);
            int a3 = ii.a(this.f4423a, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f4597v, layoutParams);
            this.f4589E.a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f4596u.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.f4598w) / 1000;
    }

    public cb l() {
        OverlayActivity overlayActivity = this.f4423a;
        la laVar = this.f4592H;
        ma maVar = this.f4593I;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f4435n, k());
        boolean[] zArr = this.f;
        boolean z3 = (zArr == null || zArr.length <= 0) ? true : zArr[0];
        cb cbVar = new cb(overlayActivity, laVar, closeTrackingParams);
        cbVar.f3541b = z3;
        cbVar.f3543d = laVar;
        cbVar.f3544e = maVar;
        return cbVar;
    }

    public long m() {
        Long l3 = this.f4436o;
        return l3 != null ? TimeUnit.SECONDS.toMillis(l3.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    public TrackingParams n() {
        TrackingParams trackingParams = new TrackingParams(this.f4435n);
        x0 x0Var = this.f4589E;
        x0Var.getClass();
        trackingParams.a(x0Var instanceof uc);
        return trackingParams;
    }

    public boolean o() {
        return this.f4589E.b();
    }

    public void onClick(View view) {
        this.f4589E.d();
    }

    public void p() {
        xf xfVar = this.f4599x;
        if (xfVar != null) {
            xfVar.c();
        }
    }

    public void q() {
        a(this.f4597v);
        this.f4587C = SystemClock.uptimeMillis();
    }

    public void r() {
    }

    public final void s() {
        if (o() && !this.f4600z && this.f4585A == 0) {
            this.f4600z = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            wb.a(this.f4423a).a(intent);
            r();
        }
    }

    public final void t() {
        try {
            if (this.f4597v != null) {
                this.f4597v.setImageDrawable(k2.a(this.f4423a.getResources()));
                this.f4597v.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f4597v.setVisibility(0);
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v2 */
    public final void b(String str, int i3, boolean z3) {
        String str2;
        Boolean bool;
        boolean p3 = MetaData.E().p();
        OverlayActivity overlayActivity = this.f4423a;
        String[] strArr = this.f4430i;
        boolean z4 = true;
        String[] strArr2 = i3 < strArr.length ? new String[]{strArr[i3]} : null;
        String[] strArr3 = this.f4431j;
        if (i3 < strArr3.length) {
            str2 = strArr3[i3];
            bool = null;
        } else {
            str2 = null;
            bool = null;
        }
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f4435n, k());
        long y = AdsCommonMetaData.k().y();
        long x3 = AdsCommonMetaData.k().x();
        boolean[] zArr = this.f;
        if (zArr != null && i3 >= 0 && i3 < zArr.length) {
            z4 = zArr[i3];
        }
        Boolean[] boolArr = this.f4437p;
        g0.a(overlayActivity, str, strArr2, str2, closeTrackingParams, y, x3, z4, (boolArr == null || i3 < 0 || i3 >= boolArr.length) ? bool : boolArr[i3], z3, p3 ? new sa(this) : bool);
    }

    public void a(WebView webView) {
        this.y = false;
        webView.setOnTouchListener(new qa(this));
        webView.setBackgroundColor(0);
    }

    public void a(ImageButton imageButton) {
        AdInformationView adInformationView;
        if (MetaData.E().j0()) {
            try {
                sd sdVar = new sd(this.f4595t);
                this.f4588D = sdVar;
                AbstractC1150b abstractC1150b = sdVar.f4332a;
                if (abstractC1150b != null) {
                    abstractC1150b.e();
                    com.startapp.sdk.adsbase.adinformation.a aVar = this.f4424b;
                    if (aVar != null && (adInformationView = aVar.f3148b) != null) {
                        sd sdVar2 = this.f4588D;
                        o1.e eVar = o1.e.f10156c;
                        AbstractC1150b abstractC1150b2 = sdVar2.f4332a;
                        if (abstractC1150b2 != null) {
                            abstractC1150b2.a(adInformationView, eVar);
                        }
                    }
                    if (imageButton != null) {
                        sd sdVar3 = this.f4588D;
                        o1.e eVar2 = o1.e.f10155b;
                        AbstractC1150b abstractC1150b3 = sdVar3.f4332a;
                        if (abstractC1150b3 != null) {
                            abstractC1150b3.a(imageButton, eVar2);
                        }
                    }
                    sd sdVar4 = this.f4588D;
                    WebView webView = this.f4595t;
                    AbstractC1150b abstractC1150b4 = sdVar4.f4332a;
                    if (abstractC1150b4 != null) {
                        abstractC1150b4.d(webView);
                    }
                    sd sdVar5 = this.f4588D;
                    if (sdVar5.f4333b != null && sdVar5.f4336e.compareAndSet(false, true)) {
                        sdVar5.f4333b.b();
                    }
                    this.f4588D.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public void b() {
        super.b();
        fh.f3695a.getClass();
        xf xfVar = this.f4599x;
        if (xfVar != null) {
            xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        this.f4423a.runOnUiThread(new ta(this));
    }

    public void a(String str) {
        if ("closeAd".equals(str)) {
            la laVar = this.f4592H;
            laVar.f3985a.i();
            laVar.f3985a.b();
        }
    }

    public boolean a(String str, boolean z3) {
        this.f4589E.a();
        xf xfVar = this.f4599x;
        if (xfVar != null) {
            xfVar.a(null, null);
        }
        Context a3 = w0.a(this.f4423a);
        if (a3 == null) {
            a3 = this.f4423a;
        }
        boolean a4 = g0.a(a3);
        if (this.f4589E.a(str)) {
            try {
                String[] split = str.split("&");
                int parseInt = Integer.parseInt(split[split.length - 1].split("=")[1]);
                if (this.f4427e[parseInt] && !a4) {
                    b(str, parseInt, z3);
                } else {
                    a(str, parseInt, z3);
                }
            } catch (Throwable th) {
                d9.a(th);
                return false;
            }
        } else if (this.f4427e[0] && !a4) {
            b(str, 0, z3);
        } else {
            a(str, 0, z3);
        }
        return true;
    }

    public final void a(String str, int i3, boolean z3) {
        boolean z4;
        String str2;
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        wb.a(this.f4423a).a(intent);
        Context a3 = w0.a(this.f4423a);
        if (a3 == null) {
            a3 = this.f4423a;
        }
        boolean a4 = g0.a(a3);
        OverlayActivity overlayActivity = this.f4423a;
        String[] strArr = this.f4430i;
        boolean z5 = true;
        String[] strArr2 = i3 < strArr.length ? new String[]{strArr[i3]} : null;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f4435n, k());
        boolean[] zArr = this.f;
        if (!((zArr == null || i3 < 0 || i3 >= zArr.length) ? true : zArr[i3]) || a4) {
            z5 = false;
            z4 = z3;
            str2 = str;
        } else {
            str2 = str;
            z4 = z3;
        }
        g0.a(overlayActivity, str2, strArr2, closeTrackingParams, z5, z4);
        if (MetaData.E().p()) {
            b();
        }
    }
}
