package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.p2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3981p2 extends Qm {
    public C3725g2 h;
    public C3725g2 i;
    public C3725g2 j;
    public C3725g2 k;

    public C3981p2(InMobiAudio.a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.c = callbacks;
    }

    public static final void a(C3981p2 c3981p2, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = c3981p2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(C3981p2 c3981p2, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = c3981p2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f6810a = (byte) 0;
        Z9 z92 = this.f;
        if (z92 != null) {
            String str2 = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            z92.d(str2, "AdManager state - CREATED");
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            String str3 = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            z93.a(str3, "Ad load successful, providing callback");
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.p2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C3981p2.b(C3981p2.this, info);
            }
        });
    }

    @Override // com.inmobi.media.Qm
    public final AbstractC3923n1 f() {
        return m() ? this.j : this.k;
    }

    @Override // com.inmobi.media.Qm
    public final void g() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "submitAdLoadCalled " + this);
        }
        C3725g2 c3725g2 = this.k;
        if (c3725g2 != null) {
            c3725g2.Q();
        }
    }

    public final void h() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "clear " + this);
        }
        p();
        C3725g2 c3725g2 = this.h;
        if (c3725g2 != null) {
            c3725g2.d();
        }
        this.h = null;
        C3725g2 c3725g22 = this.i;
        if (c3725g22 != null) {
            c3725g22.d();
        }
        this.i = null;
        this.j = null;
        this.k = null;
        this.b = null;
    }

    public final void i() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "pause " + this);
        }
        C3725g2 c3725g2 = this.j;
        if (c3725g2 != null) {
            c3725g2.Y();
        }
    }

    public final void j() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.c(str, "registerLifeCycleCallbacks " + this);
        }
        C3725g2 c3725g2 = this.h;
        if (c3725g2 != null) {
            c3725g2.a0();
        }
        C3725g2 c3725g22 = this.i;
        if (c3725g22 != null) {
            c3725g22.a0();
        }
    }

    public final void k() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "loadIntoView " + this);
        }
        C3725g2 c3725g2 = this.k;
        if (c3725g2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a("InMobi", String.valueOf(c3725g2.l.f7470a))) {
            this.f6810a = (byte) 8;
            Z9 z92 = this.f;
            if (z92 != null) {
                String str2 = AbstractC4009q2.f7317a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                z92.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            c3725g2.b0();
        }
    }

    public final void l() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "resume " + this);
        }
        C3725g2 c3725g2 = this.j;
        if (c3725g2 != null) {
            c3725g2.Z();
        }
    }

    public final boolean m() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.c(str, "shouldUseForegroundUnit " + this);
        }
        C3725g2 c3725g2 = this.j;
        Byte valueOf = c3725g2 != null ? Byte.valueOf(c3725g2.b) : null;
        Z9 z92 = this.f;
        if (z92 != null) {
            String str2 = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            z92.d(str2, "State - " + valueOf);
        }
        if (valueOf != null && valueOf.byteValue() == 4) {
            return true;
        }
        if (valueOf == null || valueOf.byteValue() != 7) {
            return valueOf != null && valueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "submitAdShowCalled " + this);
        }
        C3725g2 c3725g2 = this.k;
        if (c3725g2 != null) {
            c3725g2.S();
        }
    }

    public final void o() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "swapAdUnits " + this);
        }
        C3725g2 c3725g2 = this.j;
        if (Intrinsics.areEqual(c3725g2, this.h)) {
            this.j = this.i;
            this.k = this.h;
        } else if (Intrinsics.areEqual(c3725g2, this.i) || c3725g2 == null) {
            this.j = this.h;
            this.k = this.i;
        }
    }

    public final void p() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        C3725g2 c3725g2 = this.h;
        if (c3725g2 != null) {
            c3725g2.d0();
        }
        C3725g2 c3725g22 = this.i;
        if (c3725g22 != null) {
            c3725g22.d0();
        }
    }

    public final boolean a(long j) {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.c(str, "checkForRefreshRate " + this);
        }
        if (this.k == null) {
            return false;
        }
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        int minRefreshInterval = ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = AbstractC4009q2.f7317a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        C3725g2 c3725g2 = this.k;
        Kc.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (c3725g2 != null ? c3725g2.l : null) + ")");
        Z9 z92 = this.f;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            C3725g2 c3725g22 = this.k;
            z92.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (c3725g22 != null ? c3725g22.l : null) + ")");
        }
        return false;
    }

    public final void b(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "load 1 " + this);
        }
        C3725g2 c3725g2 = this.k;
        if (c3725g2 != null && a("InMobi", String.valueOf(c3725g2.l.f7470a), this.c) && c3725g2.d((byte) 1)) {
            this.f6810a = (byte) 1;
            Z9 z92 = this.f;
            if (z92 != null) {
                String str2 = AbstractC4009q2.f7317a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                z92.d(str2, "AdManager state - LOADING");
            }
            this.e = null;
            c3725g2.d(adSize);
            c3725g2.b(false);
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.c(str, "onAdFetchSuccess " + this);
        }
        C3725g2 c3725g2 = this.k;
        if ((c3725g2 != null ? c3725g2.b(0) : null) == null) {
            Z9 z92 = this.f;
            if (z92 != null) {
                String str2 = AbstractC4009q2.f7317a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                z92.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC3923n1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            String str3 = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            z93.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: com.inmobi.media.p2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C3981p2.a(C3981p2.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void b() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "onAdShowFailed " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.p2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C3981p2.a(C3981p2.this);
            }
        });
    }

    public final void b(RelativeLayout relativeLayout) {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "showAudioAd");
        }
        C3725g2 c3725g2 = this.j;
        if (c3725g2 != null && c3725g2.b == 7) {
            String str2 = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            Kc.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            Z9 z92 = this.f;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                z92.b(str2, "ad is active");
            }
            C3725g2 c3725g22 = this.k;
            if (c3725g22 != null) {
                c3725g22.f((short) 15);
                return;
            }
            return;
        }
        C3725g2 c3725g23 = this.k;
        if (c3725g23 != null) {
            Z9 z93 = c3725g23.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                z93.c("n1", "canProceedToShow");
            }
            if (c3725g23.A()) {
                Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                Kc.a((byte) 1, "n1", "Ad Show has failed because current ad is expired. Please call load() again.");
                Z9 z94 = c3725g23.i;
                if (z94 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z94.b("n1", "ad is expired");
                }
                c3725g23.e0();
                return;
            }
            byte b = c3725g23.b;
            if (b == 1 || b == 2) {
                Kc.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                Z9 z95 = c3725g23.i;
                if (z95 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z95.b("n1", "ad is not ready");
                }
                Z9 z96 = c3725g23.i;
                if (z96 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z96.a("n1", "callback - onShowFailure");
                }
                c3725g23.f((short) 2152);
                return;
            }
            if (b == 3) {
                Kc.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                c3725g23.f((short) 0);
                Z9 z97 = c3725g23.i;
                if (z97 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z97.a("n1", "callback - onShowFailure");
                }
                Z9 z98 = c3725g23.i;
                if (z98 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z98.b("n1", "ad is failed");
                    return;
                }
                return;
            }
            if (b == 8) {
                Kc.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                c3725g23.f((short) 0);
                Z9 z99 = c3725g23.i;
                if (z99 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z99.a("n1", "callback - onShowFailure");
                }
                Z9 z910 = c3725g23.i;
                if (z910 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z910.b("n1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b == 0) {
                Kc.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                c3725g23.f((short) 0);
                Z9 z911 = c3725g23.i;
                if (z911 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z911.a("n1", "callback - onShowFailure");
                }
                Z9 z912 = c3725g23.i;
                if (z912 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
                    z912.b("n1", "show called before load");
                    return;
                }
                return;
            }
            o();
            a(relativeLayout);
        }
    }

    public final void b(short s) {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.b(str, "submitAdLoadFailed " + this);
        }
        C3725g2 c3725g2 = this.k;
        if (c3725g2 != null) {
            c3725g2.c((short) 15);
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        Ej j;
        C4201x0 c4201x0;
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "displayAd " + this);
        }
        C3725g2 c3725g2 = this.j;
        if (c3725g2 == null || (j = c3725g2.j()) == null) {
            return;
        }
        Tp viewableAd = j.getViewableAd();
        C3725g2 c3725g22 = this.j;
        if (c3725g22 != null && (c4201x0 = c3725g22.l) != null && c4201x0.l) {
            j.m();
        }
        ViewParent parent = j.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View c = viewableAd.c();
        viewableAd.a((Map) null);
        C3725g2 c3725g23 = this.k;
        if (c3725g23 != null) {
            c3725g23.Y();
        }
        if (viewGroup == null) {
            relativeLayout.addView(c, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c, layoutParams);
        }
        C3725g2 c3725g24 = this.k;
        if (c3725g24 != null) {
            c3725g24.d();
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void a() {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "onAdDismissed " + this);
        }
        this.f6810a = (byte) 0;
        Z9 z92 = this.f;
        if (z92 != null) {
            String str2 = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            z92.d(str2, "AdManager state - CREATED");
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            z93.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "onAdDisplayed");
        }
        super.a(info);
        AbstractC3923n1 f = f();
        if (f != null) {
            f.T();
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void a(AbstractC3923n1 abstractC3923n1, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.b(str, com.ironsource.Wf.b);
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            z92.a();
        }
    }

    public static final void a(C3981p2 c3981p2) {
        Z9 z9 = c3981p2.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3981p2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        Z9 z92 = c3981p2.f;
        if (z92 != null) {
            z92.a();
        }
    }

    public final void a(final InMobiAudio audio) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(audio);
            } else {
                this.d.post(new Runnable() { // from class: com.inmobi.media.p2$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3981p2.a(C3981p2.this, audio);
                    }
                });
            }
        } catch (Exception e) {
            C3725g2 c3725g2 = this.k;
            if (c3725g2 != null) {
                c3725g2.f((short) 26);
            }
            String str2 = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            Kc.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            Z9 z92 = this.f;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                z92.b(str2, "Show failed with unexpected error: " + e.getMessage());
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    @Override // com.inmobi.media.Qm
    public final void a(short s) {
        Z9 z9 = this.f;
        if (z9 != null) {
            String str = AbstractC4009q2.f7317a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            z9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        C3725g2 c3725g2 = this.k;
        if (c3725g2 != null) {
            c3725g2.b(s);
        }
    }

    public final void a(Context context, C3600bi pubSettings, String adSize) {
        String m10Context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        String str = AbstractC4009q2.f7317a;
        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
        String str2 = "initialize " + this;
        C4147v0 c4147v0 = new C4147v0("audio");
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
        c4147v0.i = pubSettings.e;
        c4147v0.e = pubSettings.h;
        c4147v0.k = pubSettings.f;
        C4201x0 a2 = c4147v0.a();
        C3725g2 c3725g2 = this.h;
        if (c3725g2 != null && this.i != null) {
            c3725g2.a(context, a2, this);
            C3725g2 c3725g22 = this.i;
            if (c3725g22 != null) {
                c3725g22.a(context, a2, this);
            }
        } else {
            this.h = new C3725g2(context, a2, this);
            this.i = new C3725g2(context, a2, this);
            this.k = this.h;
        }
        String str3 = pubSettings.h;
        if (str3 != null) {
            Z9 z9 = this.f;
            if (z9 != null) {
                z9.a();
            }
            Z9 a3 = AbstractC3771hj.a("audio", str3);
            this.f = a3;
            if (a3 != null) {
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                a3.a(str, "adding audioAdUnit1 to reference tracker");
            }
            C3725g2 c3725g23 = this.h;
            Intrinsics.checkNotNull(c3725g23);
            AbstractC3771hj.a(c3725g23, this.f);
            Z9 z92 = this.f;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                z92.a(str, "adding audioAdUnit2 to reference tracker");
            }
            C3725g2 c3725g24 = this.i;
            Intrinsics.checkNotNull(c3725g24);
            AbstractC3771hj.a(c3725g24, this.f);
        }
    }

    public static final void a(C3981p2 c3981p2, RelativeLayout relativeLayout) {
        c3981p2.b(relativeLayout);
    }
}
