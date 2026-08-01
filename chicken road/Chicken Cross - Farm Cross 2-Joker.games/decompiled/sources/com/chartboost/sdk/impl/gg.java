package com.chartboost.sdk.impl;

import android.content.Context;
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
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gg extends i2 {
    public final RewardedCallback q;
    public final l r;

    public static final class a implements RewardedCallback, AdCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdCallback f4781a;

        public a() {
            this.f4781a = gg.this.j();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4781a.onAdClicked(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((RewardedCallback) gg.this.l()).onAdDismiss(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4781a.onAdExpired(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4781a.onAdLoaded(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4781a.onAdRequestedToShow(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4781a.onAdShown(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4781a.onImpressionRecorded(event);
        }

        @Override // com.chartboost.sdk.callbacks.RewardedCallback
        public void onRewardEarned(RewardEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            mb.a("Forwarding onRewardEarned: location=" + ((Rewarded) gg.this.e()).getLocation() + ", auctionId=" + event.getAdID(), (Throwable) null, 2, (Object) null);
            ((RewardedCallback) gg.this.l()).onRewardEarned(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(fg api, RewardedCallback callback, Rewarded rewarded, d6 dependencyContainer) {
        super(rewarded, api, callback, dependencyContainer, new j(u.d, null, 2, null), null, 32, null);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.q = new a();
        this.r = a((DismissibleAdCallback) l(), new Function0() { // from class: com.chartboost.sdk.impl.gg$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gg.a(gg.this);
            }
        });
    }

    public static final Unit a(gg ggVar) {
        RewardedCallback rewardedCallback = (RewardedCallback) ggVar.l();
        jb e = ggVar.g().e();
        rewardedCallback.onRewardEarned(new RewardEvent(e != null ? e.b() : null, ggVar.e(), 0));
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.i2
    public Object b(Context context, Continuation continuation) {
        ((fg) h()).b((Rewarded) e(), i());
        Result.Companion companion = Result.INSTANCE;
        return Result.m8079constructorimpl(null);
    }

    @Override // com.chartboost.sdk.impl.i2
    public l f() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public RewardedCallback i() {
        return this.q;
    }

    @Override // com.chartboost.sdk.impl.i2
    public void a(String str) {
        ((fg) h()).a((Rewarded) e(), i(), str);
    }
}
