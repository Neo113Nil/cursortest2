package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class za extends i2 {
    public final InterstitialCallback q;
    public final l r;

    public static final class a implements InterstitialCallback, AdCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdCallback f5101a;

        public a() {
            this.f5101a = za.this.j();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f5101a.onAdClicked(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((InterstitialCallback) za.this.l()).onAdDismiss(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f5101a.onAdExpired(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f5101a.onAdLoaded(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f5101a.onAdRequestedToShow(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f5101a.onAdShown(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f5101a.onImpressionRecorded(event);
        }
    }

    public /* synthetic */ za(ya yaVar, InterstitialCallback interstitialCallback, Interstitial interstitial, d6 d6Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yaVar, interstitialCallback, interstitial, d6Var, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.chartboost.sdk.impl.i2
    public void a(String str) {
        ((ya) h()).a((Interstitial) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.i2
    public Object b(Context context, Continuation continuation) {
        ((ya) h()).b((Interstitial) e(), i());
        Result.Companion companion = Result.INSTANCE;
        return Result.m8079constructorimpl(null);
    }

    @Override // com.chartboost.sdk.impl.i2
    public l f() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterstitialCallback i() {
        return this.q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(ya api, InterstitialCallback callback, Interstitial interstitial, d6 dependencyContainer, CoroutineDispatcher ioDispatcher) {
        super(interstitial, api, callback, dependencyContainer, new j(u.c, null, 2, null), ioDispatcher);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.q = new a();
        this.r = i2.a(this, (DismissibleAdCallback) l(), (Function0) null, 2, (Object) null);
    }
}
