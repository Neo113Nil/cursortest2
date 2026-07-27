package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.d;
import com.chartboost.sdk.tracking.g;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ya extends d {
    public final oi n;

    public /* synthetic */ ya(g0 g0Var, o0 o0Var, oi oiVar, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, e eVar, sg sgVar, f2 f2Var, i7 i7Var, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, o0Var, oiVar, atomicReference, scheduledExecutorService, eVar, sgVar, f2Var, i7Var, (i & 512) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.ya$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int e;
                e = ya.e();
                return Integer.valueOf(e);
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e() {
        return Build.VERSION.SDK_INT;
    }

    public final void a(Interstitial ad, InterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a(ad, callback, (String) null);
    }

    public final void b(final Interstitial ad, final InterstitialCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final d.a g = g(ad.getLocation());
        if (g != null) {
            this.n.a(new Function0() { // from class: com.chartboost.sdk.impl.ya$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ya.b(InterstitialCallback.this, ad, g);
                }
            });
            a(g.i.e, "Invalid configuration. Check logs for more details.", c0.b.g, ad.getLocation());
        } else if (c()) {
            a((Ad) ad, (AdCallback) callback);
        } else {
            this.n.a(new Function0() { // from class: com.chartboost.sdk.impl.ya$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ya.a(InterstitialCallback.this, ad);
                }
            });
        }
    }

    public final void a(final Interstitial ad, final InterstitialCallback callback, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final d.a g = g(ad.getLocation());
        if (g == null) {
            a(ad.getLocation(), ad, callback, str);
        } else {
            this.n.a(new Function0() { // from class: com.chartboost.sdk.impl.ya$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ya.a(InterstitialCallback.this, ad, g);
                }
            });
            a(g.a.f, "Invalid configuration. Check logs for more details.", c0.b.g, ad.getLocation());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(g0 adUnitLoader, o0 adUnitRenderer, oi uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, e adApiCallbackSender, sg session, f2 base64Wrapper, i7 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutorService, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.n = uiPoster;
    }

    public static final Unit a(InterstitialCallback interstitialCallback, Interstitial interstitial, d.a aVar) {
        interstitialCallback.onAdLoaded(new CacheEvent(null, interstitial), new CacheError(aVar.b(), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit a(InterstitialCallback interstitialCallback, Interstitial interstitial) {
        interstitialCallback.onAdShown(new ShowEvent(null, interstitial), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit b(InterstitialCallback interstitialCallback, Interstitial interstitial, d.a aVar) {
        interstitialCallback.onAdShown(new ShowEvent(null, interstitial), new ShowError(aVar.c(), null, 2, null));
        return Unit.INSTANCE;
    }
}
