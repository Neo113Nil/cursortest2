package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4093t2 extends AbstractC3923n1 implements Application.ActivityLifecycleCallbacks {
    public final String G;
    public final String H;
    public boolean I;
    public int J;
    public final C4121u2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4093t2(Context context, C4201x0 placement, Qm qm) {
        super(context, placement, qm);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.G = "t2";
        this.H = "InMobi";
        this.K = new C4121u2();
        Intrinsics.checkNotNullExpressionValue("t2", "TAG");
        String str = "Creating new adUnit for adPlacement-ID : " + placement.f7470a;
        a(context, placement, qm);
    }

    public static final void a(C4093t2 c4093t2, Ej ej, int i) {
        int indexOf = c4093t2.h.indexOf(ej);
        try {
            AbstractC3781i1 n = c4093t2.n();
            Z9 z9 = c4093t2.i;
            if (z9 != null) {
                String TAG = c4093t2.G;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z9.c(TAG, "callback onShowNextPodAd");
            }
            if (n != null) {
                n.a(i, indexOf, ej);
            }
        } catch (Exception unused) {
            c4093t2.b(indexOf, false);
            c4093t2.e(indexOf);
        }
    }

    public static final void b(C4093t2 c4093t2) {
        try {
            if (c4093t2.b == 7) {
                int i = c4093t2.J - 1;
                c4093t2.J = i;
                if (i == 0) {
                    c4093t2.c((byte) 6);
                    AbstractC3781i1 n = c4093t2.n();
                    if (n != null) {
                        n.a();
                    }
                }
            }
        } catch (Exception e) {
            Z9 z9 = c4093t2.i;
            if (z9 != null) {
                String TAG = c4093t2.G;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z9.b(TAG, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final void c(C4093t2 c4093t2) {
        try {
            if (c4093t2.b != 6) {
                if (c4093t2.b == 7) {
                    c4093t2.J++;
                    return;
                }
                return;
            }
            c4093t2.J++;
            c4093t2.c((byte) 7);
            Z9 z9 = c4093t2.i;
            if (z9 != null) {
                String TAG = c4093t2.G;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z9.d(TAG, "AdUnit " + c4093t2 + " state - ACTIVE");
            }
            Z9 z92 = c4093t2.i;
            if (z92 != null) {
                z92.c(c4093t2.H, "Successfully displayed banner ad for placement Id : " + c4093t2.l);
            }
            AbstractC3781i1 n = c4093t2.n();
            if (n != null) {
                c4093t2.a(n);
            }
        } catch (Exception e) {
            Z9 z93 = c4093t2.i;
            if (z93 != null) {
                String TAG2 = c4093t2.G;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z93.b(TAG2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e.getMessage());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void D() {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "load " + this);
        }
        if (X()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final boolean F() {
        Z9 z9 = this.i;
        if (z9 == null) {
            return false;
        }
        String TAG = this.G;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        z9.c(TAG, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void G() {
        AbstractC3781i1 n;
        super.G();
        Z9 z9 = this.i;
        if (z9 != null) {
            z9.c(this.H, "Banner ad fetch successful for placement id: " + this.l);
        }
        if (!Intrinsics.areEqual(t(), "html") && !Intrinsics.areEqual(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.b != 2 || (n = n()) == null) {
            return;
        }
        c(n);
    }

    public boolean X() {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "canProceedToLoad " + this);
        }
        F();
        if (1 == this.b || 2 == this.b) {
            Kc.a((byte) 1, this.H, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            Z9 z92 = this.i;
            if (z92 != null) {
                String TAG2 = this.G;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != this.b) {
            Z9 z93 = this.i;
            if (z93 != null) {
                z93.c(this.H, "Fetching a Banner ad for placement id: " + this.l);
            }
            E();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        Z9 z94 = this.i;
        if (z94 != null) {
            String TAG3 = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            z94.b(TAG3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.f7470a);
        }
        return false;
    }

    public final void Y() {
        Tp viewableAd;
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "onPause " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            Ej j = j();
            Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 1);
        }
    }

    public final void Z() {
        Tp viewableAd;
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "onResume " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            Ej j = j();
            Context o = o();
            if (j == null || o == null || (viewableAd = j.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(o, (byte) 0);
        }
    }

    public final void a0() {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        Context o = o();
        if (o != null) {
            AbstractC3914mk.a(o, this);
        }
    }

    public final void b0() {
        AdConfig adConfig;
        if (Intrinsics.areEqual(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            Z9 z9 = this.i;
            if (z9 != null) {
                String TAG = this.G;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z9.a(TAG, "renderAd without internet check");
            }
            c0();
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            String TAG2 = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.a(TAG2, "renderAd");
        }
        a(new Function0() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4093t2.e(C4093t2.this);
            }
        }, new Function1() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4093t2.a(C4093t2.this, (B6) obj);
            }
        });
    }

    public final void c0() {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (O()) {
                return;
            }
            C4092t1 c4092t1 = this.z;
            c4092t1.getClass();
            c4092t1.g = SystemClock.elapsedRealtime();
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4093t2.f(C4093t2.this);
                    }
                });
            }
        } catch (IllegalStateException e) {
            Z9 z92 = this.i;
            if (z92 != null) {
                String TAG2 = this.G;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.a(TAG2, "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void d() {
        this.K.f7407a = false;
        super.d();
    }

    public final void d0() {
        Application application;
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        Context o = o();
        Activity activity = o instanceof Activity ? (Activity) o : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.Gj
    public final synchronized void e(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "onAdScreenDismissed " + this);
        }
        super.e(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    C4093t2.b(C4093t2.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.Gj
    public final synchronized void f(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "onAdScreenDisplayed " + this);
        }
        super.f(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4093t2.c(C4093t2.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        if (this.s) {
            Integer num = (Integer) CollectionsKt.firstOrNull(this.r);
            if (num != null) {
                Ej ej = (Ej) CollectionsKt.getOrNull(this.h, num.intValue());
                if (Intrinsics.areEqual(ej != null ? ej.getMarkupType() : null, "htmlUrl")) {
                    b(ej, AbstractC3923n1.p(ej));
                    ej.h();
                    return;
                }
                return;
            }
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(Integer.valueOf(i))) {
                Ej ej2 = (Ej) this.h.get(i);
                if (Intrinsics.areEqual(ej2 != null ? ej2.getMarkupType() : null, "htmlUrl")) {
                    b(ej2, AbstractC3923n1.p(ej2));
                    ej2.h();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final HashMap l() {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "adSpecificRequestParams getter " + this);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("u-rt", this.I ? "1" : "0");
        hashMap.put("mk-ad-slot", this.l.h);
        return hashMap;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public String m() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void o(Ej renderView) {
        int indexOf;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s && (indexOf = this.h.indexOf(renderView)) > this.p && renderView.K != Vp.c) {
            this.r.remove(Integer.valueOf(indexOf));
        } else {
            W();
            super.o(renderView);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onActivityDestroyed " + this);
        }
        Context o = o();
        if (Intrinsics.areEqual(o, activity)) {
            Intrinsics.checkNotNull(o, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) o).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onActivityStarted " + this);
        }
        if (Intrinsics.areEqual(o(), activity)) {
            Z();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onActivityStopped " + this);
        }
        if (Intrinsics.areEqual(o(), activity)) {
            Y();
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final Ej r() {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "htmlAdContainer getter " + this);
        }
        Ej ej = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (Ej) this.h.get(this.p);
        if (this.l.l && ej != null) {
            ej.m();
        }
        return ej;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final byte u() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void m(Ej ej) {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "handleRenderViewSignaledAdReady " + this);
        }
        super.m(ej);
        if (this.s && this.h.indexOf(ej) > 0 && this.b == 6) {
            b((byte) 1);
            Ej ej2 = (Ej) this.h.get(this.p);
            if (ej2 != null) {
                ej2.a(true);
                return;
            }
            return;
        }
        if (this.b != 2) {
            Z9 z92 = this.i;
            if (z92 != null) {
                String TAG2 = this.G;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.a(TAG2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        Z9 z93 = this.i;
        if (z93 != null) {
            String TAG3 = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            z93.d(TAG3, "AdUnit " + this + " state - READY");
        }
        C4092t1 c4092t1 = this.z;
        c4092t1.getClass();
        c4092t1.i = SystemClock.elapsedRealtime();
        R();
        U();
        Z9 z94 = this.i;
        if (z94 != null) {
            z94.c(this.H, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.l);
        }
        AbstractC3781i1 n = n();
        if (n != null) {
            d(n);
        } else {
            Z9 z95 = this.i;
            if (z95 != null) {
                String TAG4 = this.G;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                z95.b(TAG4, "AdUnit listener is null");
            }
        }
        h();
    }

    public static final void d(C4093t2 c4093t2) {
        try {
            if (c4093t2.b == 4) {
                c4093t2.c((byte) 6);
                Z9 z9 = c4093t2.i;
                if (z9 != null) {
                    String TAG = c4093t2.G;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    z9.d(TAG, "AdUnit " + c4093t2 + " state - RENDERED");
                }
            }
        } catch (Exception e) {
            Z9 z92 = c4093t2.i;
            if (z92 != null) {
                String TAG2 = c4093t2.G;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.b(TAG2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final Unit e(C4093t2 c4093t2) {
        Z9 z9 = c4093t2.i;
        if (z9 != null) {
            String TAG = c4093t2.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "loadWithRetry success");
        }
        c4093t2.c0();
        return Unit.INSTANCE;
    }

    public static final void f(C4093t2 c4093t2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c4093t2.s) {
            c4093t2.q = System.currentTimeMillis();
            AdSet s = c4093t2.s();
            if (s != null && (ads = s.getAds()) != null) {
                int i = 0;
                for (Object obj : ads) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    c4093t2.r.add(Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        c4093t2.P();
    }

    @Override // com.inmobi.media.InterfaceC4228y0
    public final void b() {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "closeAll " + this);
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void a(Ej ej, short s, String failureErrorCode) {
        Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(ej, s, failureErrorCode);
        if (this.s) {
            int indexOf = this.h.indexOf(ej);
            a(indexOf, true);
            if (indexOf > 0 && this.b == 6) {
                b((byte) 1);
                Ej ej2 = (Ej) this.h.get(this.p);
                if (ej2 != null) {
                    ej2.a(false);
                }
            }
        }
        if (this.b == 2) {
            Z9 z92 = this.i;
            if (z92 != null) {
                z92.c(this.H, "Failed to load the Banner markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public final boolean b(int i, Ej ej) {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "isInValidShowPodIndex " + i + ServerSentEventKt.SPACE + this.r + ServerSentEventKt.SPACE + this.h.indexOf(ej) + ServerSentEventKt.SPACE + this + ServerSentEventKt.SPACE);
        }
        if (!this.r.contains(Integer.valueOf(i)) || i <= this.h.indexOf(ej) || this.h.get(i) == null) {
            return true;
        }
        Ej ej2 = (Ej) this.h.get(i);
        return (ej2 == null || ej2.D0) ? false : true;
    }

    public final void d(String str) {
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "setAdSize " + this);
        }
        C4201x0 c4201x0 = this.l;
        Intrinsics.checkNotNull(str);
        c4201x0.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c4201x0.h = str;
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.Gj
    public void i(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onRenderViewVisible " + this);
        }
        super.i(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    C4093t2.d(C4093t2.this);
                }
            });
        }
    }

    public final void b(boolean z) {
        Z9 z9;
        Z9 z92 = this.i;
        if (z92 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z92.a(TAG, "load " + this);
        }
        if (z && (z9 = this.i) != null) {
            z9.c(this.H, "Initiating Banner refresh for placement id: " + this.l);
        }
        this.I = z;
        D();
    }

    @Override // com.inmobi.media.InterfaceC4228y0
    public final void a(int i, Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "loadPodAd " + this);
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(renderView)) {
            this.o = i;
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4093t2.a(C4093t2.this);
                    }
                });
                return;
            }
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            String TAG2 = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.a(TAG2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        Ej ej = (Ej) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
        if (ej != null) {
            ej.a(false);
        }
    }

    public static final void a(C4093t2 c4093t2) {
        Z9 z9 = c4093t2.i;
        if (z9 != null) {
            String TAG = c4093t2.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "start loading html ad");
        }
        c4093t2.P();
    }

    public static final Unit a(C4093t2 c4093t2, B6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
        Z9 z9 = c4093t2.i;
        if (z9 != null) {
            String TAG = c4093t2.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.b(TAG, "loadWithRetry error - " + errorCode);
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2123;
                        break;
                    case 13:
                        s = 2124;
                        break;
                    case 14:
                        s = 2125;
                        break;
                    case 15:
                        s = 2126;
                        break;
                    case 16:
                        s = 2127;
                        break;
                }
            } else {
                s = 2229;
            }
            c4093t2.a(inMobiAdRequestStatus, true, s);
            return Unit.INSTANCE;
        }
        s = 2122;
        c4093t2.a(inMobiAdRequestStatus, true, s);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.InterfaceC4228y0
    public final void a(final int i, final Ej renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            String TAG = this.G;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "showPodAdAtIndex " + this + " index - " + i);
        }
        if (!this.s) {
            Z9 z92 = this.i;
            if (z92 != null) {
                String TAG2 = this.G;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.h;
            Ej ej = (Ej) copyOnWriteArrayList.get(copyOnWriteArrayList.indexOf(renderView));
            if (ej != null) {
                ej.b(false);
                return;
            }
            return;
        }
        if (b(i, renderView)) {
            Z9 z93 = this.i;
            if (z93 != null) {
                String TAG3 = this.G;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                z93.b(TAG3, "Cannot show an pod ad with invalid index passed");
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.h;
            Ej ej2 = (Ej) copyOnWriteArrayList2.get(copyOnWriteArrayList2.indexOf(renderView));
            if (ej2 != null) {
                ej2.b(false);
                return;
            }
            return;
        }
        super.a(i, renderView, context);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.t2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4093t2.a(C4093t2.this, renderView, i);
                }
            });
        }
    }

    @Override // com.inmobi.media.Gj
    public void a(EnumC3952o2 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC3781i1 n = n();
        if (n != null) {
            n.a(audioStatusInternal);
        }
        C4121u2 c4121u2 = this.K;
        c4121u2.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!c4121u2.f7407a && audioStatusInternal == EnumC3952o2.e) {
            c4121u2.f7407a = true;
            H9 h9 = H9.c;
            h9.f6466a = System.currentTimeMillis();
            h9.b++;
        }
    }

    @Override // com.inmobi.media.Gj
    public void a(boolean z) {
        H9 h9 = H9.c;
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "banner_audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", "key");
        int i = a2.f6510a.getInt("user_mute_count", 0);
        a2.a("user_mute_count", z ? Math.max(0, i - 1) : i + 1, false);
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.Gj
    public final void a(Ej renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        if (b != 4 && b != 6) {
            if (b == 7) {
                renderView.a(z, this.b == 7 ? z ? (short) 2224 : (short) 2223 : (short) 2227);
                return;
            }
            return;
        }
        byte b2 = this.b;
        if (b2 == 4) {
            r1 = z ? (short) 2220 : (short) 2219;
        } else if (b2 == 6) {
            r1 = z ? (short) 2222 : (short) 2221;
        }
        L();
        renderView.a(z, r1);
    }
}
