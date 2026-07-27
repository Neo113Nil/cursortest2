package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public abstract class u7 {

    /* renamed from: a, reason: collision with root package name */
    public OverlayActivity f4423a;

    /* renamed from: d, reason: collision with root package name */
    public String[] f4426d;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f4427e;

    /* renamed from: g, reason: collision with root package name */
    public String f4428g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f4429h;

    /* renamed from: i, reason: collision with root package name */
    public String[] f4430i;

    /* renamed from: j, reason: collision with root package name */
    public String[] f4431j;

    /* renamed from: k, reason: collision with root package name */
    public Ad f4432k;

    /* renamed from: l, reason: collision with root package name */
    public AdPreferences.Placement f4433l;

    /* renamed from: m, reason: collision with root package name */
    public AdInformationOverrides f4434m;

    /* renamed from: n, reason: collision with root package name */
    public String f4435n;

    /* renamed from: o, reason: collision with root package name */
    public Long f4436o;

    /* renamed from: s, reason: collision with root package name */
    public Long f4440s;

    /* renamed from: b, reason: collision with root package name */
    public com.startapp.sdk.adsbase.adinformation.a f4424b = null;

    /* renamed from: c, reason: collision with root package name */
    public r7 f4425c = new r7(this);
    public boolean[] f = {true};

    /* renamed from: p, reason: collision with root package name */
    public Boolean[] f4437p = null;

    /* renamed from: q, reason: collision with root package name */
    public int f4438q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4439r = false;

    public abstract void a(Bundle bundle);

    public boolean a(int i3, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f4423a.runOnUiThread(new s7(this));
    }

    public abstract void b(Bundle bundle);

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public void e() {
        if (this.f4425c != null) {
            wb.a(this.f4423a).a(this.f4425c);
        }
        this.f4425c = null;
    }

    public abstract void f();

    public abstract void g();

    public void h() {
        wb.a(this.f4423a).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public final String a() {
        try {
            String[] strArr = this.f4429h;
            return (strArr == null || strArr.length <= 0) ? "" : g0.a(strArr[0], (String) null);
        } catch (Throwable th) {
            d9.a(th);
            return "";
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        OverlayActivity overlayActivity = this.f4423a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        AdPreferences.Placement placement = this.f4433l;
        AdInformationOverrides adInformationOverrides = this.f4434m;
        Ad ad = this.f4432k;
        ConsentData consentData = ad != null ? ad.getConsentData() : null;
        Ad ad2 = this.f4432k;
        String requestUrl = ad2 != null ? ad2.getRequestUrl() : null;
        Ad ad3 = this.f4432k;
        String dParam = ad3 != null ? ad3.getDParam() : null;
        Ad ad4 = this.f4432k;
        String erid = ad4 != null ? ad4.getErid() : null;
        Ad ad5 = this.f4432k;
        com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(overlayActivity, imageResourceType, placement, adInformationOverrides, consentData, requestUrl, dParam, erid, ad5 != null ? ad5.getEridUrl() : null);
        this.f4424b = aVar;
        aVar.a(relativeLayout);
    }
}
