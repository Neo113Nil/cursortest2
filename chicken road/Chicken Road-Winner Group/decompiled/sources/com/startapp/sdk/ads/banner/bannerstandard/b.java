package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0253g;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.h1;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.v6;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2928a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final String f2929b = AbstractC0253g.a();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Point f2930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g7 f2931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f2932e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f2933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f2934h;

    public b(BannerStandard bannerStandard, Point point, g7 g7Var, AdUnitConfig adUnitConfig, int i3, MetaData metaData) {
        this.f2934h = bannerStandard;
        this.f2930c = point;
        this.f2931d = g7Var;
        this.f2932e = adUnitConfig;
        this.f = i3;
        this.f2933g = metaData;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        String adTag;
        Context context = this.f2934h.getContext();
        BannerStandard bannerStandard = this.f2934h;
        j1.a(context, bannerStandard.listener, (View) bannerStandard, (String) null);
        Context context2 = this.f2934h.getContext();
        String c3 = this.f2933g.c();
        String str = this.f2928a;
        adTag = this.f2934h.getAdTag();
        g0.a(context2, c3, new ExternalAdTracking(str, adTag, this.f2932e.getSioPrice(), this.f2932e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f2929b, null, "DISABLED", this.f2930c, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        String adTag;
        Context context = this.f2934h.getContext();
        BannerStandard bannerStandard = this.f2934h;
        BannerListener bannerListener = bannerStandard.listener;
        v6.a("onImpression", bannerListener != null, null, null);
        g0.a(bannerListener != null ? new h1(context, bannerListener, bannerStandard) : null);
        Context context2 = this.f2934h.getContext();
        List singletonList = Collections.singletonList(this.f2933g.B());
        String str = this.f2928a;
        adTag = this.f2934h.getAdTag();
        b9.a(context2, singletonList, (TrackingParams) new ExternalAdTracking(str, adTag, this.f2932e.getSioPrice(), this.f2932e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f2929b, null, "DISABLED", this.f2930c, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        if (view == null) {
            this.f2934h.sendLoadError("No view returned");
            return;
        }
        this.f2934h.updateBannerView();
        BannerStandard bannerStandard = this.f2934h;
        Point point = this.f2930c;
        bannerStandard.attachAdViewToContainer(view, point.x, point.y);
        Context context = this.f2934h.getContext();
        BannerStandard bannerStandard2 = this.f2934h;
        j1.b(context, bannerStandard2.listener, bannerStandard2, null);
        this.f2931d.a(Boolean.TRUE);
        BannerStandard bannerStandard3 = this.f2934h;
        bannerStandard3.sendInfoAdRequest(true, this.f2928a, this.f2929b, bannerStandard3.getAdPreferences(), this.f2930c, this.f2932e, this.f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        this.f2934h.sendLoadError(str);
        this.f2931d.a(Boolean.FALSE);
        BannerStandard bannerStandard = this.f2934h;
        bannerStandard.sendInfoAdRequest(false, this.f2928a, this.f2929b, bannerStandard.getAdPreferences(), this.f2930c, this.f2932e, this.f);
    }
}
