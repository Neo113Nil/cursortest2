package com.chartboost.sdk.impl;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.d;
import com.chartboost.sdk.internal.Model.a;
import com.chartboost.sdk.tracking.g;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d2 extends d {
    public final g0 n;
    public final o0 o;
    public final oi p;
    public final AtomicReference q;

    public /* synthetic */ d2(g0 g0Var, o0 o0Var, oi oiVar, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, e eVar, sg sgVar, f2 f2Var, i7 i7Var, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, o0Var, oiVar, atomicReference, scheduledExecutorService, eVar, sgVar, f2Var, i7Var, (i & 512) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.d2$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int e;
                e = d2.e();
                return Integer.valueOf(e);
            }
        } : function0);
    }

    public static final Unit c(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdShown(new ShowEvent(null, banner), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e() {
        return Build.VERSION.SDK_INT;
    }

    public final void a(Banner ad, BannerCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a(ad, callback, (String) null);
    }

    @Override // com.chartboost.sdk.impl.d, com.chartboost.sdk.impl.q0
    public void a(String str) {
    }

    public final void b(final Banner ad, final BannerCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final d.a g = g(ad.getLocation());
        if (g != null) {
            this.p.a(new Function0() { // from class: com.chartboost.sdk.impl.d2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.b(BannerCallback.this, ad, g);
                }
            });
            a(g.i.e, "Invalid configuration. Check logs for more details.", c0.a.g, ad.getLocation());
        } else if (!g()) {
            this.p.a(new Function0() { // from class: com.chartboost.sdk.impl.d2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.b(BannerCallback.this, ad);
                }
            });
        } else if (c()) {
            a((Ad) ad, (AdCallback) callback);
        } else {
            this.p.a(new Function0() { // from class: com.chartboost.sdk.impl.d2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.c(BannerCallback.this, ad);
                }
            });
        }
    }

    public final void f() {
        this.o.E();
        this.n.b();
    }

    public final boolean g() {
        a.C0226a a2;
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.q.get();
        if (aVar == null || (a2 = aVar.a()) == null) {
            return true;
        }
        return a2.a();
    }

    public final void a(final Banner ad, final BannerCallback callback, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final d.a g = g(ad.getLocation());
        if (g != null) {
            this.p.a(new Function0() { // from class: com.chartboost.sdk.impl.d2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.a(BannerCallback.this, ad, g);
                }
            });
            a(g.a.f, "Invalid configuration. Check logs for more details.", c0.a.g, ad.getLocation());
        } else if (g()) {
            a(ad.getLocation(), ad, callback, str);
        } else {
            this.p.a(new Function0() { // from class: com.chartboost.sdk.impl.d2$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return d2.a(BannerCallback.this, ad);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(g0 adUnitLoader, o0 adUnitRenderer, oi uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutor, e adApiCallbackSender, sg session, f2 base64Wrapper, i7 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutor, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.n = adUnitLoader;
        this.o = adUnitRenderer;
        this.p = uiPoster;
        this.q = sdkConfig;
    }

    public static final Unit a(BannerCallback bannerCallback, Banner banner, d.a aVar) {
        bannerCallback.onAdLoaded(new CacheEvent(null, banner), new CacheError(aVar.b(), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit a(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdLoaded(new CacheEvent(null, banner), new CacheError(CacheError.Code.BANNER_DISABLED, null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit b(BannerCallback bannerCallback, Banner banner, d.a aVar) {
        bannerCallback.onAdShown(new ShowEvent(null, banner), new ShowError(aVar.c(), null, 2, null));
        return Unit.INSTANCE;
    }

    public final void a(Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (banner.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            banner.setLayoutParams(layoutParams);
        }
        DisplayMetrics displayMetrics = banner.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams2 = banner.getLayoutParams();
        int bannerWidth = banner.getBannerWidth();
        Intrinsics.checkNotNull(displayMetrics);
        layoutParams2.width = (int) a(bannerWidth, displayMetrics);
        banner.getLayoutParams().height = (int) a(banner.getBannerHeight(), displayMetrics);
    }

    public static final Unit b(BannerCallback bannerCallback, Banner banner) {
        bannerCallback.onAdShown(new ShowEvent(null, banner), new ShowError(ShowError.Code.BANNER_DISABLED, null, 2, null));
        return Unit.INSTANCE;
    }

    public final float a(int i, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, i, displayMetrics);
    }
}
