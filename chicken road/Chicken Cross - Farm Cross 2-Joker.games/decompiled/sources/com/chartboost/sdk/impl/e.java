package com.chartboost.sdk.impl;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.internal.caching.ExpirationReason;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final oi f4738a;

    public e(oi uiPoster) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.f4738a = uiPoster;
    }

    public final void a(final String str, final ShowError showError, final Ad ad, final AdCallback adCallback) {
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(Ad.this, adCallback, str, showError, this);
            }
        });
    }

    public final void b(final String str, final Ad ad, final AdCallback adCallback) {
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(Ad.this, adCallback, str, this);
            }
        });
    }

    public final void c(final String str, final Ad ad, final AdCallback adCallback) {
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.b(Ad.this, adCallback, str, this);
            }
        });
    }

    public static final Unit a(Ad ad, AdCallback adCallback, String str, ShowError showError, e eVar) {
        if (ad == null) {
            mb.b("Ad is missing on onAdShown", (Throwable) null, 2, (Object) null);
        } else if (adCallback != null) {
            adCallback.onAdShown(new ShowEvent(str, ad), showError);
        } else {
            mb.c("Callback missing for " + eVar.a(ad) + " on onAdShown", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(Ad ad, AdCallback adCallback, String str, e eVar) {
        if (ad == null) {
            mb.b("Ad is missing on onAdRequestedToShow", (Throwable) null, 2, (Object) null);
        } else if (adCallback != null) {
            adCallback.onAdRequestedToShow(new ShowEvent(str, ad));
        } else {
            mb.c("Callback missing for " + eVar.a(ad) + " on onAdRequestedToShow", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void a(final String str, final Ad ad, final AdCallback adCallback, final int i) {
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(AdCallback.this, ad, str, i);
            }
        });
    }

    public static final Unit a(AdCallback adCallback, Ad ad, String str, int i) {
        if (adCallback != null) {
            if (!(adCallback instanceof RewardedCallback)) {
                mb.b("Invalid ad type to send a reward", (Throwable) null, 2, (Object) null);
            } else if (ad != null) {
                ((RewardedCallback) adCallback).onRewardEarned(new RewardEvent(str, ad, i));
            } else {
                mb.b("Ad is missing on didEarnReward", (Throwable) null, 2, (Object) null);
            }
        } else {
            mb.b("Missing callback on sendRewardCallbackOnMainThread", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void a(final String str, final Ad ad, final AdCallback adCallback) {
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(AdCallback.this, ad, str);
            }
        });
    }

    public static final Unit a(AdCallback adCallback, Ad ad, String str) {
        if (adCallback != null) {
            if (!(adCallback instanceof DismissibleAdCallback)) {
                mb.b("Invalid ad type to send onAdDismiss", (Throwable) null, 2, (Object) null);
            } else if (ad != null) {
                ((DismissibleAdCallback) adCallback).onAdDismiss(new DismissEvent(str, ad));
            } else {
                mb.b("Ad is missing on onAdDismiss", (Throwable) null, 2, (Object) null);
            }
        } else {
            mb.b("Missing callback on sendDismissCallbackOnMainThread", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Ad ad, AdCallback adCallback, String str, e eVar) {
        if (ad == null) {
            mb.b("Ad is missing on onImpressionRecorded", (Throwable) null, 2, (Object) null);
        } else if (adCallback != null) {
            adCallback.onImpressionRecorded(new ImpressionEvent(str, ad));
        } else {
            mb.c("Callback missing for " + eVar.a(ad) + " on onImpressionRecorded", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void a(final String str, final CacheError cacheError, final Ad ad, final AdCallback adCallback) {
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(Ad.this, adCallback, str, cacheError, this);
            }
        });
    }

    public static final Unit a(Ad ad, AdCallback adCallback, String str, CacheError cacheError, e eVar) {
        if (ad == null) {
            mb.b("Ad is missing on onAdLoaded", (Throwable) null, 2, (Object) null);
        } else if (adCallback != null) {
            adCallback.onAdLoaded(new CacheEvent(str, ad), cacheError);
        } else {
            mb.c("Callback missing for " + eVar.a(ad) + " on onAdLoaded", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void a(final String str, final ClickError clickError, final Ad ad, final AdCallback adCallback) {
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(Ad.this, adCallback, str, clickError, this);
            }
        });
    }

    public static final Unit a(Ad ad, AdCallback adCallback, String str, ClickError clickError, e eVar) {
        if (ad == null) {
            mb.b("Ad is missing on onAdClicked", (Throwable) null, 2, (Object) null);
        } else if (adCallback != null) {
            adCallback.onAdClicked(new ClickEvent(str, ad), clickError);
        } else {
            mb.c("Callback missing for " + eVar.a(ad) + " on onAdClicked", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final String a(Ad ad) {
        if (ad instanceof Interstitial) {
            return c0.b.g.b();
        }
        if (ad instanceof Rewarded) {
            return c0.c.g.b();
        }
        if (ad instanceof Banner) {
            return c0.a.g.b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(final String str, final Ad ad, final AdCallback adCallback, final ExpirationReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f4738a.a(new Function0() { // from class: com.chartboost.sdk.impl.e$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(Ad.this, adCallback, str, reason, this);
            }
        });
    }

    public static final Unit a(Ad ad, AdCallback adCallback, String str, ExpirationReason expirationReason, e eVar) {
        try {
            if (ad == null) {
                mb.b("Ad is missing on onAdExpired", (Throwable) null, 2, (Object) null);
            } else if (adCallback != null) {
                adCallback.onAdExpired(new ExpirationEvent(str, ad, expirationReason));
            } else {
                mb.c("Callback missing for " + eVar.a(ad) + " on onAdExpired", null, 2, null);
            }
        } catch (Exception e) {
            mb.b("Error delivering onAdExpired callback", e);
        }
        return Unit.INSTANCE;
    }
}
