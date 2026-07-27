package com.startapp.sdk.adsbase;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0253g;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.mj;
import com.startapp.sdk.internal.u;
import com.startapp.sdk.internal.v;
import com.startapp.sdk.internal.v6;
import com.startapp.sdk.internal.w;
import com.startapp.sdk.internal.y;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3235a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final String f3236b = AbstractC0253g.a();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f3239e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f3240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Point f3241h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f3242i;

    public l(StartAppAd startAppAd, AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i3, MetaData metaData, Point point) {
        StartAppAd.AdMode adMode;
        this.f3242i = startAppAd;
        this.f3238d = adEventListener;
        this.f3239e = adUnitConfig;
        this.f = i3;
        this.f3240g = metaData;
        this.f3241h = point;
        adMode = startAppAd.f3124g;
        this.f3237c = adMode == StartAppAd.AdMode.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        AdPreferences adPreferences;
        this.f3238d.onReceiveAd(this.f3242i);
        StartAppAd startAppAd = this.f3242i;
        String str = this.f3235a;
        String str2 = this.f3236b;
        adPreferences = startAppAd.f3125h;
        StartAppAd.a(startAppAd, true, str, str2, adPreferences, this.f3239e, this.f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
        this.f3242i.f = null;
        StartAppAd startAppAd = this.f3242i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f3127j;
        v6.a("adHidden", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new u(context, adDisplayListener, startAppAd) : null);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        AdPreferences adPreferences;
        StartAppAd startAppAd = this.f3242i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f3127j;
        v6.a("onClicked", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new w(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f3242i.context;
        String c3 = this.f3240g.c();
        String str = this.f3235a;
        adPreferences = this.f3242i.f3125h;
        String adTag = adPreferences.getAdTag();
        String sioPrice = this.f3239e.getSioPrice();
        String bp = this.f3239e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f3236b;
        Boolean valueOf = Boolean.valueOf(this.f3237c);
        boolean z3 = this.f3237c;
        g0.a(context2, c3, new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, valueOf, z3 ? "FORCED" : "ENABLED", this.f3241h, z3 ? "VIDEO" : "INTERSTITIAL"));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        AdPreferences adPreferences;
        this.f3242i.f = null;
        StartAppAd startAppAd = this.f3242i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f3127j;
        v6.a("onShow", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f3242i.context;
        List singletonList = Collections.singletonList(this.f3240g.B());
        String str = this.f3235a;
        adPreferences = this.f3242i.f3125h;
        String adTag = adPreferences.getAdTag();
        String sioPrice = this.f3239e.getSioPrice();
        String bp = this.f3239e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f3236b;
        Boolean valueOf = Boolean.valueOf(this.f3237c);
        boolean z3 = this.f3237c;
        b9.a(context2, singletonList, (TrackingParams) new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, valueOf, z3 ? "FORCED" : "ENABLED", this.f3241h, z3 ? "VIDEO" : "INTERSTITIAL"));
    }

    public final void e() {
        StartAppAd startAppAd = this.f3242i;
        y.a(startAppAd.context, startAppAd.f3127j, startAppAd);
    }

    public final void f() {
        StartAppAd startAppAd = this.f3242i;
        Context context = startAppAd.context;
        com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = startAppAd.f3126i;
        v6.a("onVideoCompleted", videoListener != null, null, null);
        g0.a(videoListener != null ? new mj(videoListener, context) : null);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        AdPreferences adPreferences;
        this.f3242i.f = null;
        this.f3238d.onFailedToReceiveAd(this.f3242i);
        StartAppAd startAppAd = this.f3242i;
        String str2 = this.f3235a;
        String str3 = this.f3236b;
        adPreferences = startAppAd.f3125h;
        StartAppAd.a(startAppAd, false, str2, str3, adPreferences, this.f3239e, this.f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
        this.f3242i.f = null;
    }
}
