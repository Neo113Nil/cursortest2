package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public abstract class Qm extends AbstractC3781i1 {

    /* renamed from: a, reason: collision with root package name */
    public byte f6810a;
    public Boolean b;
    public PublisherCallbacks c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public AdMetaInfo e;
    public Z9 f;
    public WatermarkData g;

    public static final void a(AbstractC3923n1 abstractC3923n1, Qm qm, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC3923n1 != null) {
            abstractC3923n1.b((byte) 1);
        }
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        Z9 z92 = qm.f;
        if (z92 != null) {
            z92.a();
        }
    }

    public final void b(final AbstractC3923n1 abstractC3923n1, final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onLoadFailure " + this);
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z92.d("Qm", "AdManager state - LOAD_FAILED");
        }
        this.f6810a = (byte) 3;
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(AbstractC3923n1.this, this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void c() {
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdWillShow " + this);
        }
        byte b = this.f6810a;
        if (b == 4 || b == 5) {
            return;
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Qm.b(Qm.this);
            }
        });
        Z9 z92 = this.f;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z92.d("Qm", "AdManager state - WILL_DISPLAY");
        }
        this.f6810a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void e() {
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onUserLeftApplication " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Qm.c(Qm.this);
            }
        });
    }

    public abstract AbstractC3923n1 f();

    public void g() {
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "submitAdLoadCalled " + this);
        }
        AbstractC3923n1 f = f();
        if (f != null) {
            f.Q();
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void a(final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdFetchFailed " + this);
        }
        this.f6810a = (byte) 3;
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(Qm.this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public void b(AdMetaInfo info) {
        AbstractC3923n1 f;
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdFetchSuccess " + this);
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z92.d("Qm", "AdManager state - FETCHED");
        }
        this.f6810a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (f = f()) == null) {
            return;
        }
        f.b((byte) 2);
    }

    public static final void a(Qm qm, InMobiAdRequestStatus inMobiAdRequestStatus) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        Z9 z92 = qm.f;
        if (z92 != null) {
            z92.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public void c(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdLoadSucceeded " + this);
        }
        this.e = info;
        AbstractC3923n1 f = f();
        if (f != null) {
            f.b((byte) 1);
        }
    }

    public static final void b(Qm qm) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public void a(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdDisplayed " + this);
        }
        if (this.f6810a != 5) {
            this.e = info;
            this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Qm.a(Qm.this, info);
                }
            });
            Z9 z92 = this.f;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
                z92.d("Qm", "AdManager state - DISPLAYED");
            }
            this.f6810a = (byte) 5;
        }
    }

    public static final void c(Qm qm) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    public static final void a(Qm qm, AdMetaInfo adMetaInfo) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public void a(AbstractC3923n1 abstractC3923n1, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdLoadFailed " + this);
        }
        b(abstractC3923n1, status);
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void a(final HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdInteraction " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(Qm.this, params);
            }
        });
    }

    public static final void a(Qm qm, Map map) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "getSignals " + this);
        }
        if (f() != null) {
            this.c = callbacks;
            callbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        C3791ib c3791ib;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "load " + this);
        }
        if (Intrinsics.areEqual(this.b, Boolean.TRUE)) {
            Kc.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            Z9 z92 = this.f;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
                z92.a("Qm", "Cannot call load(byte[]) API after load() API is called");
            }
            C3846kb c3846kb = (C3846kb) this;
            b(c3846kb.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3791ib c3791ib2 = c3846kb.h;
            if (c3791ib2 != null) {
                c3791ib2.b((short) 2140);
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.f6810a = (byte) 1;
        Z9 logger = this.f;
        if (logger != null && (c3791ib = ((C3846kb) this).h) != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3791ib.i = logger;
            C3611c0 c3611c0 = c3791ib.u;
            c3611c0.getClass();
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3611c0.f = logger;
        }
        C3846kb c3846kb2 = (C3846kb) this;
        C3791ib c3791ib3 = c3846kb2.h;
        if (c3791ib3 == null || c3791ib3 == null || !c3791ib3.d((byte) 1)) {
            return;
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z93.a("Qm", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.c = callbacks;
        C3791ib c3791ib4 = c3846kb2.h;
        if (c3791ib4 != null) {
            c3791ib4.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void a(final HashMap rewards, final Oj oj) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdRewardActionCompleted " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(Qm.this, oj, rewards);
            }
        });
    }

    public static final void a(Qm qm, Oj oj, Map map) {
        C4092t1 c4092t1;
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks == null) {
            if (oj != null) {
                oj.a((short) 2426);
                return;
            }
            return;
        }
        publisherCallbacks.onRewardsUnlocked(map);
        AbstractC3923n1 f = qm.f();
        long j = (f == null || (c4092t1 = f.z) == null) ? 0L : c4092t1.j;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (oj != null) {
            Map a2 = oj.a();
            a2.put("latency", Long.valueOf(elapsedRealtime));
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("RewardDelivered", a2, EnumC3944nm.f7271a);
        }
    }

    public void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.g = watermarkData;
    }

    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            Kc.a((byte) 1, "Qm", "preload() and load() cannot be called on the same instance, please use a different instance.");
            Z9 z92 = this.f;
            if (z92 != null) {
                z92.b(tag, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC3923n1 f = f();
            if (f != null) {
                f.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b = this.f6810a;
        if (b == 8) {
            Kc.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            Z9 z93 = this.f;
            if (z93 != null) {
                z93.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3923n1 f2 = f();
            if (f2 != null) {
                f2.b((short) 2002);
            }
            return false;
        }
        if (b == 1) {
            Kc.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            Z9 z94 = this.f;
            if (z94 != null) {
                z94.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3923n1 f3 = f();
            if (f3 != null) {
                f3.b((short) 2001);
            }
            return false;
        }
        if (b != 5) {
            return true;
        }
        Kc.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        Z9 z95 = this.f;
        if (z95 != null) {
            z95.b(tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC3923n1 f4 = f();
        if (f4 != null) {
            f4.c((short) 2003);
        }
        return false;
    }

    public final boolean a(String tag, String placementString) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "canRender " + this);
        }
        byte b = this.f6810a;
        if (b == 1) {
            Kc.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            Z9 z92 = this.f;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
                z92.b("Qm", "adload in progress");
            }
            AbstractC3923n1 f = f();
            if (f != null) {
                f.c((short) 2129);
            }
            return false;
        }
        if (b == 8) {
            Kc.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            Z9 z93 = this.f;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
                z93.b("Qm", "ad loading into view is in progress");
            }
            AbstractC3923n1 f2 = f();
            if (f2 != null) {
                f2.c((short) 2164);
            }
            return false;
        }
        if (b == 5) {
            Kc.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
            Z9 z94 = this.f;
            if (z94 != null) {
                Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
                z94.b("Qm", "ad active before renderAd");
            }
            AbstractC3923n1 f3 = f();
            if (f3 != null) {
                f3.c((short) 2130);
            }
            AbstractC3923n1 f4 = f();
            if (f4 != null) {
                f4.L();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            return false;
        }
        if (b == 7) {
            return true;
        }
        Z9 z95 = this.f;
        if (z95 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z95.b("Qm", "ad in illegal state");
        }
        AbstractC3923n1 f5 = f();
        if (f5 != null) {
            f5.c((short) 2165);
        }
        AbstractC3923n1 f6 = f();
        if (f6 != null) {
            f6.L();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public void a() {
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdDismissed " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(Qm.this);
            }
        });
        Z9 z92 = this.f;
        if (z92 != null) {
            z92.a();
        }
    }

    public static final void a(Qm qm) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        Z9 z92 = qm.f;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z92.b("Qm", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void a(final C4113tm c4113tm) {
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "onAdImpression " + this);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(Qm.this, c4113tm);
            }
        });
    }

    public static final void a(Qm qm, C4113tm c4113tm) {
        if (qm.c == null) {
            Z9 z9 = qm.f;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
                z9.b("Qm", "callback is null");
            }
            if (c4113tm != null) {
                c4113tm.b();
                return;
            }
            return;
        }
        Z9 z92 = qm.f;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z92.a("Qm", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c4113tm);
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void a(final EnumC3952o2 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(Qm.this, audioStatusInternal);
            }
        });
    }

    public static final void a(Qm qm, EnumC3952o2 enumC3952o2) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onAudioStatusChanged - " + enumC3952o2.f7277a);
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(enumC3952o2);
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void a(final String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.d.post(new Runnable() { // from class: com.inmobi.media.Qm$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Qm.a(Qm.this, log);
            }
        });
    }

    public static final void a(Qm qm, String str) {
        Z9 z9 = qm.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.a("Qm", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = qm.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s) {
        Z9 z9 = this.f;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("Qm", "TAG");
            z9.c("Qm", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC3923n1 f = f();
        if (f != null) {
            f.b(s);
        }
    }
}
