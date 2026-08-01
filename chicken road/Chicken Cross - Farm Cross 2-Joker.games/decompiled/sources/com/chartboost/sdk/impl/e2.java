package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.dl;
import com.chartboost.sdk.impl.i2;
import java.net.URL;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e2 extends i2 {
    public dl q;
    public final BannerCallback r;
    public final l s;

    public static final class a implements BannerCallback, AdCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdCallback f4741a;

        public a(e2 e2Var) {
            this.f4741a = e2Var.j();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4741a.onAdClicked(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4741a.onAdExpired(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4741a.onAdLoaded(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4741a.onAdRequestedToShow(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4741a.onAdShown(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f4741a.onImpressionRecorded(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(d2 api, BannerCallback callback, Banner banner, d6 dependencyContainer) {
        super(banner, api, callback, dependencyContainer, new j(u.b, null, 2, null), null, 32, null);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.r = new a(this);
        this.s = new i2.b();
    }

    @Override // com.chartboost.sdk.impl.i2
    public void a(String str) {
        ((d2) h()).a((Banner) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.i2
    public Object b(Context context, Continuation continuation) {
        ((d2) h()).b((Banner) e(), i());
        Result.Companion companion = Result.INSTANCE;
        return Result.m8079constructorimpl(e());
    }

    @Override // com.chartboost.sdk.impl.i2, com.chartboost.sdk.impl.z8
    public void destroy() {
        dl dlVar = this.q;
        if (dlVar != null) {
            dlVar.b();
        }
        this.q = null;
        ((d2) h()).f();
        super.destroy();
    }

    @Override // com.chartboost.sdk.impl.i2
    public l f() {
        return this.s;
    }

    @Override // com.chartboost.sdk.impl.i2
    public URL m() {
        return null;
    }

    @Override // com.chartboost.sdk.impl.i2
    public void r() {
        BannerCallback i = i();
        jb e = g().e();
        i.onAdLoaded(new CacheEvent(e != null ? e.b() : null, e()), null);
    }

    @Override // com.chartboost.sdk.impl.i2
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public BannerCallback i() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.i2
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ((d2) h()).a((Banner) e());
    }

    @Override // com.chartboost.sdk.impl.i2
    public void a(View view, final ShowEvent showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        if (view != null) {
            final jb e = g().e();
            if (e == null) {
                mb.e("LoadedAd is null at visibility callback setup time for location " + ((Banner) e()).getLocation() + " — impression tracking may fail", null, 2, null);
            }
            ((BannerCallback) l()).onAdShown(showEvent, null);
            dl dlVar = this.q;
            if (dlVar != null) {
                dlVar.b();
            }
            Context context = ((Banner) e()).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View a2 = dl.r.a(((Banner) e()).getContext(), view);
            if (a2 == null) {
                a2 = view.getRootView();
            }
            View view2 = a2;
            Intrinsics.checkNotNull(view2);
            dl dlVar2 = new dl(context, view, view2, 1, 0, 100L, 25, false, 128, null);
            this.q = dlVar2;
            dlVar2.a(new dl.b() { // from class: com.chartboost.sdk.impl.e2$$ExternalSyntheticLambda0
                @Override // com.chartboost.sdk.impl.dl.b
                public final void a() {
                    e2.a(e2.this, showEvent, e);
                }
            });
            mb.a("Banner visibility tracker started: location=" + ((Banner) e()).getLocation() + ", auctionId=" + showEvent.getAdID(), (Throwable) null, 2, (Object) null);
            dl dlVar3 = this.q;
            if (dlVar3 != null) {
                dlVar3.i();
            }
            ((Banner) e()).removeAllViews();
            ((Banner) e()).addView(view);
            return;
        }
        a(ChartboostError.Show.NoAd.INSTANCE, showEvent);
    }

    public static final void a(e2 e2Var, ShowEvent showEvent, jb jbVar) {
        mb.a("Banner visibility triggered - recording impression: location=" + ((Banner) e2Var.e()).getLocation() + ", auctionId=" + showEvent.getAdID(), (Throwable) null, 2, (Object) null);
        e2Var.v();
        ((BannerCallback) e2Var.l()).onImpressionRecorded(new ImpressionEvent(showEvent.getAdID(), e2Var.e()));
        if (jbVar != null) {
            e2Var.g().c(jbVar);
        } else {
            mb.e("Cannot track impression: loadedAd was null at capture time for location " + ((Banner) e2Var.e()).getLocation(), null, 2, null);
        }
    }
}
