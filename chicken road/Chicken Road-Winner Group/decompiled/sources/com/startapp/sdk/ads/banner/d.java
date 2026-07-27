package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0253g;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.m1;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public BannerListener f2955a;

    /* renamed from: b, reason: collision with root package name */
    public View f2956b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2957c = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    public final String f2958d = AbstractC0253g.a();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f2959e;
    public final /* synthetic */ AdPreferences f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Point f2960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f2961h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2962i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MetaData f2963j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f2964k;

    public d(BannerRequest bannerRequest, BannerRequest.Callback callback, AdPreferences adPreferences, Point point, AdUnitConfig adUnitConfig, int i3, MetaData metaData) {
        this.f2964k = bannerRequest;
        this.f2959e = callback;
        this.f = adPreferences;
        this.f2960g = point;
        this.f2961h = adUnitConfig;
        this.f2962i = i3;
        this.f2963j = metaData;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        Context context;
        AdPreferences adPreferences;
        BannerListener bannerListener = this.f2955a;
        if (bannerListener != null) {
            bannerListener.onClick(this.f2956b);
        }
        context = this.f2964k.context;
        String c3 = this.f2963j.c();
        String str = this.f2957c;
        adPreferences = this.f2964k.adPreferences;
        g0.a(context, c3, new ExternalAdTracking(str, adPreferences.getAdTag(), this.f2961h.getSioPrice(), this.f2961h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f2958d, null, "DISABLED", this.f2960g, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        Context context;
        AdPreferences adPreferences;
        BannerListener bannerListener = this.f2955a;
        if (bannerListener != null) {
            bannerListener.onImpression(this.f2956b);
        }
        context = this.f2964k.context;
        List singletonList = Collections.singletonList(this.f2963j.B());
        String str = this.f2957c;
        adPreferences = this.f2964k.adPreferences;
        b9.a(context, singletonList, (TrackingParams) new ExternalAdTracking(str, adPreferences.getAdTag(), this.f2961h.getSioPrice(), this.f2961h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f2958d, null, "DISABLED", this.f2960g, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        if (view == null) {
            this.f2959e.onFinished(null, "No view returned");
        } else {
            this.f2959e.onFinished(new m1(this, view), null);
            this.f2964k.sendInfoAdRequest(true, this.f2957c, this.f2958d, this.f, this.f2960g, this.f2961h, this.f2962i);
        }
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        this.f2959e.onFinished(null, str);
        this.f2964k.sendInfoAdRequest(false, this.f2957c, this.f2958d, this.f, this.f2960g, this.f2961h, this.f2962i);
    }
}
