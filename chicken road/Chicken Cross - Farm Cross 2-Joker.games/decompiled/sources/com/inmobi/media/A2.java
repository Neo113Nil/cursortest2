package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class A2 extends Qm {
    public final String h = "InMobi";
    public final String i = "A2";
    public final String j = "x";
    public C4093t2 k;
    public C4093t2 l;
    public C4093t2 m;
    public C4093t2 n;

    public final void a(InMobiBanner banner) {
        C4201x0 c4201x0;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "applyInlineAdaptiveSizeIfNeeded " + this);
        }
        C4093t2 c4093t2 = this.n;
        if (c4093t2 == null || (c4201x0 = c4093t2.l) == null || !c4201x0.j || c4201x0.i.length() == 0) {
            return;
        }
        List split$default = StringsKt.split$default((CharSequence) c4201x0.i, new String[]{this.j}, false, 0, 6, (Object) null);
        if (split$default.size() != 2) {
            Z9 z92 = this.f;
            if (z92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.b(TAG2, "Invalid adaptive ad size: " + c4201x0.i);
                return;
            }
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
        Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
        Integer num = null;
        if (((intOrNull == null || intOrNull.intValue() <= 0) ? null : intOrNull) != null) {
            if (intOrNull2 != null && intOrNull2.intValue() > 0) {
                num = intOrNull2;
            }
            if (num != null) {
                banner.updateLayoutParamsForResolvedSize$media_release(intOrNull.intValue(), intOrNull2.intValue());
                return;
            }
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            String TAG3 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            z93.b(TAG3, "Invalid adaptive ad size: " + c4201x0.i);
        }
    }

    public final void b(InMobiBanner banner) {
        C4201x0 c4201x0;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "displayAd " + this);
        }
        C4093t2 c4093t2 = this.m;
        Ej j = c4093t2 != null ? c4093t2.j() : null;
        if (!(j instanceof Ej)) {
            j = null;
        }
        if (j == null) {
            return;
        }
        Tp viewableAd = j.getViewableAd();
        C4093t2 c4093t22 = this.m;
        if (c4093t22 != null && (c4201x0 = c4093t22.l) != null && c4201x0.l) {
            j.m();
        }
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View c = viewableAd.c();
        viewableAd.a(new HashMap());
        C4093t2 c4093t23 = this.n;
        if (c4093t23 != null) {
            c4093t23.Y();
        }
        C4093t2 c4093t24 = this.m;
        if (c4093t24 != null && c4093t24.b == 8) {
            View view = new View(banner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            if (viewGroup == null) {
                banner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            banner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        C4093t2 c4093t25 = this.n;
        if (c4093t25 != null) {
            c4093t25.d();
        }
    }

    public final void c(InMobiBanner inMobiBanner) {
        C4201x0 c4201x0;
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "displayInternal " + this);
        }
        C4093t2 c4093t2 = this.m;
        if (c4093t2 == null) {
            return;
        }
        Ej j = c4093t2.j();
        if (!(j instanceof Ej)) {
            j = null;
        }
        if (j == null) {
            return;
        }
        Tp viewableAd = j.getViewableAd();
        C4093t2 c4093t22 = this.m;
        if (c4093t22 != null && (c4201x0 = c4093t22.l) != null && c4201x0.l) {
            j.m();
        }
        View c = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
    }

    @Override // com.inmobi.media.Qm
    public final AbstractC3923n1 f() {
        return q() ? this.m : this.n;
    }

    public final void h() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C4093t2 c4093t2;
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "canScheduleRefresh " + this);
        }
        C4093t2 c4093t22 = this.n;
        if (c4093t22 == null) {
            return false;
        }
        Byte valueOf = Byte.valueOf(c4093t22.b);
        if (valueOf.byteValue() != 4 && valueOf.byteValue() != 1 && valueOf.byteValue() != 2 && ((c4093t2 = this.m) == null || c4093t2.b != 7)) {
            return true;
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.a(TAG2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "clear " + this);
        }
        t();
        C4093t2 c4093t2 = this.k;
        if (c4093t2 != null) {
            c4093t2.d();
        }
        this.k = null;
        C4093t2 c4093t22 = this.l;
        if (c4093t22 != null) {
            c4093t22.d();
        }
        this.l = null;
        this.f = null;
        this.m = null;
        this.n = null;
        this.b = null;
    }

    public final int k() {
        AdConfig adConfig;
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "defaultRefreshInterval " + this);
        }
        AbstractC3923n1 f = f();
        if (f == null || (adConfig = f.c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        Boolean bool;
        Boolean bool2;
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "mForegroundBannerAdUnit == mBannerAdUnit1 " + Intrinsics.areEqual(this.m, this.k);
        String TAG2 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        String str2 = "mBackgroundBannerAdUnit == mBannerAdUnit1 " + Intrinsics.areEqual(this.n, this.k);
        String TAG3 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        String str3 = "mForegroundBannerAdUnit == mBannerAdUnit2 " + Intrinsics.areEqual(this.m, this.l);
        String TAG4 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        String str4 = "mBackgroundBannerAdUnit == mBannerAdUnit2 " + Intrinsics.areEqual(this.n, this.l);
        String TAG5 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        C4093t2 c4093t2 = this.k;
        if (c4093t2 != null) {
            bool = Boolean.valueOf(c4093t2.b == 7);
        } else {
            bool = null;
        }
        C4093t2 c4093t22 = this.k;
        String str5 = "mBannerAdUnit1 isActive " + bool + ServerSentEventKt.SPACE + (c4093t22 != null ? Byte.valueOf(c4093t22.b) : null) + ServerSentEventKt.SPACE + this.k;
        String TAG6 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        C4093t2 c4093t23 = this.l;
        if (c4093t23 != null) {
            bool2 = Boolean.valueOf(c4093t23.b == 7);
        } else {
            bool2 = null;
        }
        C4093t2 c4093t24 = this.l;
        String str6 = "mBannerAdUnit2 isActive " + bool2 + ServerSentEventKt.SPACE + (c4093t24 != null ? Byte.valueOf(c4093t24.b) : null) + ServerSentEventKt.SPACE + this.l;
        C4093t2 c4093t25 = this.m;
        return c4093t25 != null && c4093t25.b == 7;
    }

    public final void m() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "pause " + this);
        }
        C4093t2 c4093t2 = this.m;
        if (c4093t2 != null) {
            c4093t2.Y();
        }
    }

    public final void n() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        C4093t2 c4093t2 = this.k;
        if (c4093t2 != null) {
            c4093t2.a0();
        }
        C4093t2 c4093t22 = this.l;
        if (c4093t22 != null) {
            c4093t22.a0();
        }
    }

    public final void o() {
        C4093t2 c4093t2;
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "render " + this);
        }
        C4093t2 c4093t22 = this.n;
        if (c4093t22 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.h, String.valueOf(c4093t22.l.f7470a))) {
            PublisherCallbacks publisherCallbacks = this.c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c4093t2 = this.n) != null) {
                c4093t2.d((byte) 1);
            }
            this.f6810a = (byte) 8;
            c4093t22.b0();
        }
    }

    public final void p() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "resume " + this);
        }
        C4093t2 c4093t2 = this.m;
        if (c4093t2 != null) {
            c4093t2.Z();
        }
    }

    public final boolean q() {
        C4093t2 c4093t2 = this.m;
        Byte valueOf = c4093t2 != null ? Byte.valueOf(c4093t2.b) : null;
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "shouldUseForegroundUnit " + this + " state - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "submitAdShowFail " + this);
        }
        AbstractC3923n1 f = f();
        if (f != null) {
            f.d((short) 2239);
        }
    }

    public final void s() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "swapAdUnits " + this);
        }
        C4093t2 c4093t2 = this.m;
        if (c4093t2 == null) {
            this.m = this.k;
            this.n = this.l;
        } else if (Intrinsics.areEqual(c4093t2, this.k)) {
            this.m = this.l;
            this.n = this.k;
        } else if (Intrinsics.areEqual(c4093t2, this.l)) {
            this.m = this.k;
            this.n = this.l;
        }
    }

    public final void t() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        C4093t2 c4093t2 = this.k;
        if (c4093t2 != null) {
            c4093t2.d0();
        }
        C4093t2 c4093t22 = this.l;
        if (c4093t22 != null) {
            c4093t22.d0();
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f6810a = (byte) 0;
        Z9 z92 = this.f;
        if (z92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.a(TAG2, "Ad load successful, providing callback");
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.A2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                A2.b(A2.this, info);
            }
        });
    }

    public final boolean a(long j) {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "checkForRefreshRate " + this);
        }
        C4093t2 c4093t2 = this.n;
        if (c4093t2 == null) {
            return false;
        }
        AdConfig adConfig = c4093t2.c;
        Intrinsics.checkNotNull(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        Z9 z92 = this.f;
        if (z92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.b(TAG2, "Early refresh request");
        }
        b(this.n, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG3 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        C4093t2 c4093t22 = this.n;
        Kc.a((byte) 1, TAG3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c4093t22 != null ? c4093t22.l : null) + ")");
        Z9 z93 = this.f;
        if (z93 != null) {
            String TAG4 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            C4093t2 c4093t23 = this.n;
            z93.b(TAG4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c4093t23 != null ? c4093t23.l : null) + ")");
        }
        return false;
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onAdFetchSuccess " + this);
        }
        this.e = info;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C4093t2 c4093t2 = this.n;
        if ((c4093t2 != null ? c4093t2.b(0) : null) == null) {
            Z9 z92 = this.f;
            if (z92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.b(TAG2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC3923n1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            String TAG3 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            z93.a(TAG3, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: com.inmobi.media.A2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                A2.a(A2.this, info);
            }
        });
    }

    public static final void b(A2 a2, AdMetaInfo adMetaInfo) {
        Z9 z9 = a2.f;
        if (z9 != null) {
            String TAG = a2.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            a2.b((short) 2184);
        }
    }

    public final int a(int i, int i2) {
        AdConfig adConfig;
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "getRefreshInterval " + this);
        }
        C4093t2 c4093t2 = this.n;
        return (c4093t2 == null || (adConfig = c4093t2.c) == null) ? i2 : i < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i;
    }

    public final void b(short s) {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "submitAdLoadFailed " + this);
        }
        AbstractC3923n1 f = f();
        if (f != null) {
            f.c(s);
        }
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean z) {
        C4093t2 c4093t2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "load 1 " + this);
        }
        if (Intrinsics.areEqual(this.b, Boolean.FALSE)) {
            b(this.n, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C4093t2 c4093t22 = this.n;
            if (c4093t22 != null) {
                c4093t22.b((short) 2006);
            }
            Kc.a((byte) 1, this.h, "Cannot call load() API after calling load(byte[])");
            Z9 z92 = this.f;
            if (z92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.b(TAG2, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.b = Boolean.TRUE;
        if (this.c == null) {
            this.c = callbacks;
        }
        C4093t2 c4093t23 = this.n;
        if (c4093t23 == null || !a(this.h, String.valueOf(c4093t23.l), callbacks) || (c4093t2 = this.n) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (c4093t2.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            Z9 z93 = this.f;
            if (z93 != null) {
                String TAG3 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                z93.d(TAG3, "AdManager state - LOADING");
            }
            this.f6810a = (byte) 1;
            this.e = null;
            C4093t2 c4093t24 = this.n;
            Intrinsics.checkNotNull(c4093t24);
            c4093t24.d(adSize);
            C4093t2 c4093t25 = this.n;
            Intrinsics.checkNotNull(c4093t25);
            c4093t25.b(z);
        }
    }

    @Override // com.inmobi.media.Qm
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        C4093t2 c4093t2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "load 2 " + this);
        }
        if (Intrinsics.areEqual(this.b, Boolean.TRUE)) {
            Kc.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            Z9 z92 = this.f;
            if (z92 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z92.b(TAG2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.f6810a = (byte) 1;
        this.c = callbacks;
        if (this.n != null) {
            C4093t2 c4093t22 = this.m;
            if ((c4093t22 == null || !c4093t22.C()) && (c4093t2 = this.n) != null && c4093t2.d((byte) 1)) {
                Z9 z93 = this.f;
                if (z93 != null) {
                    String TAG3 = this.i;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    z93.a(TAG3, "timer started - load banner");
                }
                C4093t2 c4093t23 = this.n;
                if (c4093t23 != null) {
                    c4093t23.E();
                }
                C4093t2 c4093t24 = this.n;
                if (c4093t24 != null) {
                    c4093t24.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void a() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onAdDismissed " + this);
        }
        this.f6810a = (byte) 0;
        Z9 z92 = this.f;
        if (z92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.d(TAG2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(A2 a2, AdMetaInfo adMetaInfo) {
        Z9 z9 = a2.f;
        if (z9 != null) {
            String TAG = a2.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = a2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        Z9 z92 = a2.f;
        if (z92 != null) {
            String TAG2 = a2.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.b(TAG2, "callback null");
        }
    }

    public final void a(EnumC4149v2 mode, long j) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.a(TAG, "onDetachAbandon " + mode + ServerSentEventKt.SPACE + this);
        }
        C4093t2 c4093t2 = this.m;
        if (c4093t2 != null) {
            c4093t2.a(mode, j);
        }
        C4093t2 c4093t22 = this.n;
        if (c4093t22 != null) {
            c4093t22.a(mode, j);
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void a(int i, final int i2, Ej ej) {
        ViewParent parent;
        Z9 z9 = this.f;
        if (z9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z9.c(TAG, "onShowNextPodAd " + this);
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            z92.a(TAG2, "on Show next pod ad index: " + i);
        }
        if (ej != null) {
            try {
                parent = ej.getParent();
            } catch (Exception unused) {
                C4093t2 c4093t2 = this.m;
                if (c4093t2 != null) {
                    c4093t2.e(i2);
                }
                C4093t2 c4093t22 = this.m;
                if (c4093t22 != null) {
                    c4093t22.b(i2, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C4093t2 c4093t23 = this.m;
            if (c4093t23 != null) {
                c4093t23.b(i2, true);
            }
            c(inMobiBanner);
            this.d.post(new Runnable() { // from class: com.inmobi.media.A2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    A2.a(A2.this, i2);
                }
            });
            return;
        }
        C4093t2 c4093t24 = this.m;
        if (c4093t24 != null) {
            c4093t24.e(i2);
        }
        C4093t2 c4093t25 = this.m;
        if (c4093t25 != null) {
            c4093t25.b(i2, false);
        }
    }

    public final void a(Context context, C3600bi pubSettings, String adSize) {
        String m10Context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter("banner", "logType");
        Intrinsics.checkNotNullExpressionValue(this.i, "TAG");
        String str = "initialize " + this;
        C4147v0 c4147v0 = new C4147v0("banner");
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            m10Context = "activity";
        } else {
            m10Context = "others";
        }
        Intrinsics.checkNotNullParameter(m10Context, "m10Context");
        c4147v0.j = m10Context;
        c4147v0.b = pubSettings.f7031a;
        c4147v0.d = pubSettings.c;
        c4147v0.c = pubSettings.d;
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        c4147v0.g = adSize;
        String str2 = pubSettings.b;
        if (str2 == null) {
            str2 = "";
        }
        c4147v0.h = str2;
        c4147v0.i = pubSettings.e;
        c4147v0.e = pubSettings.h;
        c4147v0.k = pubSettings.f;
        C4201x0 a2 = c4147v0.a();
        String str3 = pubSettings.h;
        if (str3 != null) {
            Z9 z9 = this.f;
            if (z9 != null) {
                z9.a();
            }
            this.f = AbstractC3771hj.a("banner", str3);
        }
        C4093t2 c4093t2 = this.k;
        if (c4093t2 != null && this.l != null) {
            c4093t2.a(context, a2, this);
            C4093t2 c4093t22 = this.l;
            if (c4093t22 != null) {
                c4093t22.a(context, a2, this);
            }
        } else {
            this.k = new C4093t2(context, a2, this);
            C4093t2 c4093t23 = new C4093t2(context, a2, this);
            this.l = c4093t23;
            this.n = this.k;
            this.m = c4093t23;
        }
        Z9 logger = this.f;
        if (logger != null) {
            C4093t2 c4093t24 = this.k;
            if (c4093t24 != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c4093t24.i = logger;
                C3611c0 c3611c0 = c4093t24.u;
                c3611c0.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3611c0.f = logger;
            }
            C4093t2 c4093t25 = this.l;
            if (c4093t25 != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c4093t25.i = logger;
                C3611c0 c3611c02 = c4093t25.u;
                c3611c02.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3611c02.f = logger;
            }
            Z9 z92 = this.f;
            if (z92 != null) {
                String TAG = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z92.a(TAG, "adding mBannerAdUnit1 to reference tracker");
            }
            Ac ac = AbstractC3771hj.f7147a;
            C4093t2 c4093t26 = this.k;
            Intrinsics.checkNotNull(c4093t26);
            AbstractC3771hj.a(c4093t26, this.f);
            Z9 z93 = this.f;
            if (z93 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                z93.a(TAG2, "adding mBannerAdUnit2 to reference tracker");
            }
            C4093t2 c4093t27 = this.l;
            Intrinsics.checkNotNull(c4093t27);
            AbstractC3771hj.a(c4093t27, this.f);
        }
        WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            C4093t2 c4093t28 = this.k;
            if (c4093t28 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c4093t28.A = watermarkData;
                Ej r = c4093t28.r();
                if (r != null) {
                    r.setWatermark(watermarkData);
                }
            }
            C4093t2 c4093t29 = this.l;
            if (c4093t29 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c4093t29.A = watermarkData;
                Ej r2 = c4093t29.r();
                if (r2 != null) {
                    r2.setWatermark(watermarkData);
                }
            }
        }
    }

    public static final void a(A2 a2, int i) {
        C4093t2 c4093t2 = a2.m;
        if (c4093t2 != null) {
            c4093t2.a(i, false);
        }
    }

    @Override // com.inmobi.media.Qm
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C4093t2 c4093t2 = this.k;
        if (c4093t2 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c4093t2.A = watermarkData;
            Ej r = c4093t2.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
        C4093t2 c4093t22 = this.l;
        if (c4093t22 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c4093t22.A = watermarkData;
            Ej r2 = c4093t22.r();
            if (r2 != null) {
                r2.setWatermark(watermarkData);
            }
        }
    }
}
