package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.ib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3791ib extends AbstractC3923n1 {
    public int G;
    public boolean H;
    public final C3633cm I;
    public Function0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3791ib(Context context, C4201x0 adPlacement, C3846kb c3846kb) {
        super(context, adPlacement, c3846kb);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        this.I = new C3633cm();
        Intrinsics.checkNotNullExpressionValue("ib", "TAG");
        String str = "Creating new adUnit for adPlacement-ID : " + adPlacement.f7470a;
        a(context, adPlacement, c3846kb);
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.M();
    }

    public static final void c(C3791ib c3791ib) {
        c3791ib.g(c3791ib.n());
    }

    public static final Unit d(C3791ib c3791ib) {
        c3791ib.a0();
        return Unit.INSTANCE;
    }

    public static final void e(C3791ib c3791ib) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        c3791ib.P();
        if (c3791ib.s) {
            AdSet s = c3791ib.s();
            int size = (s == null || (ads = s.getAds()) == null) ? 0 : ads.size();
            for (int i = 1; i < size; i++) {
                c3791ib.o++;
                c3791ib.P();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void D() {
        if (X()) {
            super.D();
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void G() {
        super.G();
        if (!Intrinsics.areEqual(t(), "html") && !Intrinsics.areEqual(t(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
            return;
        }
        if (this.b == 2) {
            Z9 z9 = this.i;
            if (z9 != null) {
                z9.a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + this.l);
            }
            AbstractC3781i1 n = n();
            if (n != null) {
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                    z92.a("ib", "callback - onFetchSuccess");
                }
                c(n);
                return;
            }
            c((short) 2188);
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z93.b("ib", "listener is null");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void K() {
        super.K();
        this.G = 0;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void M() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        super.M();
    }

    public final boolean X() {
        if (F()) {
            Z9 z9 = this.i;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z9.a("ib", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC3781i1 n = n();
        if (n == null || h(n)) {
            return false;
        }
        if (4 == this.b) {
            if (!A()) {
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                    z92.a("ib", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3781i1 n2 = n();
                if (n2 == null) {
                    Z9 z93 = this.i;
                    if (z93 != null) {
                        z93.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                } else {
                    c(n2);
                    d(n2);
                }
                return false;
            }
            super.d();
            this.J = null;
        }
        E();
        return true;
    }

    public final int Y() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet s = s();
        if (s != null) {
            Integer valueOf = Integer.valueOf(s.getPodSuccessCount());
            if (valueOf.intValue() < 1) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        AdSet s2 = s();
        if (s2 != null && (ads = s2.getAds()) != null) {
            Integer valueOf2 = Integer.valueOf(ads.size());
            Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
            if (num != null) {
                return num.intValue();
            }
        }
        return 1;
    }

    public final void Z() {
        AdConfig adConfig;
        if (Intrinsics.areEqual(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            Z9 z9 = this.i;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z9.a("ib", "renderAd without internet check");
            }
            a0();
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z92.a("ib", "renderAd");
        }
        a(new Function0() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3791ib.d(C3791ib.this);
            }
        }, new Function1() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3791ib.a(C3791ib.this, (B6) obj);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC4228y0
    public final void a(int i, Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    public final void a0() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z9.a("ib", "renderAdPostInternetCheck");
        }
        super.K();
        this.G = 0;
        try {
            if (O()) {
                return;
            }
            C4092t1 c4092t1 = this.z;
            c4092t1.getClass();
            c4092t1.g = SystemClock.elapsedRealtime();
            String t = t();
            if (!Intrinsics.areEqual(t, "html") && !Intrinsics.areEqual(t, "htmlUrl")) {
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                    z92.a("ib", "Cannot handle markupType: " + t());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2121);
                return;
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3791ib.e(C3791ib.this);
                    }
                });
            }
        } catch (IllegalStateException e) {
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z93.a("ib", "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final short b(Context context) {
        try {
            Z9 z9 = this.i;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z9.a("ib", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            Ej container = j();
            if (container == null) {
                return (short) 2155;
            }
            if (Intrinsics.areEqual("unknown", container.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            Intrinsics.checkNotNullParameter(container, "container");
            int hashCode = container.hashCode();
            InMobiAdActivity.t.put(hashCode, container);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            Z9 obj = this.i;
            if (obj != null) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                HashMap hashMap = AbstractC4237y9.f7497a;
                String key = uuid.toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(obj, "obj");
                AbstractC4237y9.f7497a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", uuid.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", hashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String t = t();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", Intrinsics.areEqual(t, "html") ? 200 : Intrinsics.areEqual(t, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (this.s) {
                if (this.q == -1) {
                    this.q = System.currentTimeMillis();
                }
                if (this.o > 0) {
                    intent.setFlags(603979776);
                }
            }
            Context context2 = AbstractC3914mk.f7252a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
            return (short) 0;
        } catch (Exception e) {
            Z9 z92 = this.i;
            if (z92 != null) {
                z92.b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
            return (short) 2154;
        }
    }

    public final void b0() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z9.d("ib", "AdUnit " + this + " state - READY");
        }
        c((byte) 4);
        C4092t1 c4092t1 = this.z;
        c4092t1.getClass();
        c4092t1.i = SystemClock.elapsedRealtime();
        R();
        U();
        this.I.f7054a = true;
        AbstractC3781i1 n = n();
        if (n != null) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z92.a("ib", "signaling Success");
            }
            d(n);
        }
    }

    public final void c0() {
        MetaInfo metaInfo;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
            z9.c("n1", "submitAdNotReady " + this);
        }
        C3633cm c3633cm = this.I;
        C4092t1 c4092t1 = this.z;
        com.inmobi.media.ads.network.common.model.Ad q = q();
        String creativeType = (q == null || (metaInfo = q.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        AdSet s = s();
        Boolean valueOf = s != null ? Boolean.valueOf(s.getIsRewarded()) : null;
        String t = t();
        byte b = this.b;
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        String impressionId = q2 != null ? q2.getImpressionId() : null;
        C4119u0 adNotReadyMetadata = new C4119u0(c4092t1, creativeType, valueOf, t, b, impressionId);
        c3633cm.getClass();
        Intrinsics.checkNotNullParameter(adNotReadyMetadata, "adNotReadyMetadata");
        HashMap hashMap = new HashMap();
        long j = c4092t1.c;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(b == 0 ? (short) 2204 : b == 1 ? (short) 2282 : b == 2 ? (short) 2283 : b == 3 ? (short) 2284 : b == 6 ? (short) 2285 : b == 7 ? (short) 2209 : b == 8 ? (short) 2242 : (short) 2210));
        hashMap.put("markupType", t);
        if (creativeType != null) {
            hashMap.put("creativeType", creativeType);
        }
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        if (valueOf != null) {
            hashMap.put("isRewarded", valueOf);
        }
        String a2 = c4092t1.a();
        if (a2.length() > 0) {
            hashMap.put("metadataBlob", a2);
        }
        hashMap.put("adType", c4092t1.f7385a.m());
        hashMap.put("networkType", Y5.o());
        hashMap.put("plId", Long.valueOf(c4092t1.f7385a.l.f7470a));
        hashMap.put("isAdLoaded", Boolean.valueOf(c3633cm.f7054a));
        String str = c4092t1.f7385a.l.f;
        if (str != null) {
            hashMap.put("plType", str);
        }
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdNotReady", hashMap, EnumC3944nm.f7271a);
    }

    public final void d0() {
        Z9 z9 = this.i;
        if (z9 != null) {
            z9.a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + this.l);
        }
        h();
        b0();
    }

    public final void f(short s) {
        if (this.b == 2) {
            Z9 z9 = this.i;
            if (z9 != null) {
                z9.a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    public final void g(AbstractC3781i1 abstractC3781i1) {
        if (this.b != 6) {
            if (this.b == 7) {
                this.G++;
                return;
            }
            return;
        }
        int i = this.G + 1;
        this.G = i;
        if (i != 1) {
            c((byte) 7);
            return;
        }
        Z9 z9 = this.i;
        if (z9 != null) {
            z9.a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + this.l);
        }
        if (abstractC3781i1 != null) {
            b((byte) 4);
            a(abstractC3781i1);
        }
    }

    public final boolean h(AbstractC3781i1 abstractC3781i1) {
        byte b = this.b;
        if (b == 1) {
            Z9 z9 = this.i;
            if (z9 != null) {
                z9.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
            return true;
        }
        if (b == 7 || b == 6) {
            Z9 z92 = this.i;
            if (z92 != null) {
                z92.b("InMobiInterstitial", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            return true;
        }
        if (b != 2) {
            return false;
        }
        if (Intrinsics.areEqual("html", t()) || Intrinsics.areEqual("htmlUrl", t())) {
            Z9 z93 = this.i;
            if (z93 != null) {
                z93.b("InMobiInterstitial", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + this.l);
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
        } else {
            c(abstractC3781i1);
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void i() {
        if (this.h.isEmpty()) {
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            if (!this.r.contains(Integer.valueOf(i))) {
                Ej ej = (Ej) this.h.get(i);
                if (Intrinsics.areEqual(ej != null ? ej.getMarkupType() : null, "htmlUrl")) {
                    b(ej, AbstractC3923n1.p(ej));
                    ej.h();
                }
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final String m() {
        return "int";
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void n(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s) {
            W();
        } else if (!a(renderView)) {
            W();
        }
        super.n(renderView);
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final Ej r() {
        Ej ej = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (Ej) this.h.get(this.p);
        if (this.H && ej != null) {
            ej.m();
        }
        return ej;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final byte u() {
        return (byte) 1;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void a(byte[] bArr) {
        if (X()) {
            super.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void m(Ej ej) {
        super.m(ej);
        if (!this.s) {
            if (this.b == 2) {
                b((byte) 1);
                d0();
                return;
            }
            return;
        }
        int indexOf = this.h.indexOf(ej);
        if (indexOf < this.p) {
            Z9 z9 = this.i;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z9.a("ib", "Ignoring loaded ad with index " + indexOf + " as current rendering index is " + this.p);
                return;
            }
            return;
        }
        this.r.add(Integer.valueOf(indexOf));
        if (this.b == 2) {
            int Y = Y();
            for (int i = 0; i < Y && i < this.h.size(); i++) {
                if (this.h.get(i) == null || !this.r.contains(Integer.valueOf(i))) {
                    return;
                }
            }
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z92.a("ib", "Providing success based on index " + indexOf);
            }
            b((byte) 1);
            this.p = 0;
            d0();
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void d() {
        super.d();
        this.J = null;
    }

    public final void a(final C3846kb c3846kb, final Activity activity) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a((AbstractC3781i1) c3846kb, (Context) activity);
        } else {
            ((Wc) P6.e.getValue()).f6931a.post(new Runnable() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C3791ib.a(C3791ib.this, c3846kb, activity);
                }
            });
        }
    }

    @Override // com.inmobi.media.Gj
    public final synchronized void e(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.e(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    C3791ib.b(C3791ib.this);
                }
            });
        }
    }

    public static final void a(C3791ib c3791ib, AbstractC3781i1 abstractC3781i1, Context context) {
        c3791ib.a(abstractC3781i1, context);
    }

    public static final void a(final C3791ib c3791ib, final Ej ej, Context context) {
        final int indexOf = c3791ib.h.indexOf(ej);
        CopyOnWriteArrayList list = c3791ib.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (indexOf < 0 || indexOf >= list.size()) {
            return;
        }
        short b = c3791ib.b(context);
        if (b != 0) {
            c3791ib.e(indexOf);
        }
        c3791ib.b(indexOf, b == 0);
        Handler handler = c3791ib.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C3791ib.a(Ej.this, c3791ib, indexOf);
                }
            });
        }
    }

    public final void f(AbstractC3781i1 abstractC3781i1) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z9.c("ib", "handleAdScreenDismissed " + ((int) this.b));
        }
        if (this.b == 7) {
            int i = this.G - 1;
            this.G = i;
            if (i == 1) {
                c((byte) 6);
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                    z92.d("ib", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (this.b == 6 || this.b == 8) {
            this.G--;
            Z9 z93 = this.i;
            if (z93 != null) {
                z93.a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this.l);
            }
            if (abstractC3781i1 != null) {
                abstractC3781i1.a();
                return;
            }
            Z9 z94 = this.i;
            if (z94 != null) {
                z94.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.InterfaceC4228y0
    public final void a(Ej renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "<get-TAG>(...)");
            z9.c("n1", "closeCurrentPodAd " + this);
        }
        if (this.s) {
            Integer num = (Integer) this.r.higher(Integer.valueOf(this.h.indexOf(renderView)));
            if (num != null) {
                a(num.intValue(), renderView, activity);
            } else {
                b();
            }
        }
    }

    public final void a(AbstractC3781i1 abstractC3781i1, Context context) {
        if (abstractC3781i1 == null) {
            Z9 z9 = this.i;
            if (z9 != null) {
                z9.b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a((short) 2151);
            return;
        }
        Function0 function0 = this.J;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if (this.b == 8) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z92.b("ib", "unload has been called on this ad. Dont show. ");
            }
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            Kc.a((byte) 2, "ib", "Failed to show Ad as creative has called unload() on the Ad");
            a((short) 2239);
            return;
        }
        if (this.b == 4) {
            e(abstractC3781i1);
            c((byte) 6);
            if (A()) {
                a((short) 2153);
                c((byte) 0);
                Ej j = j();
                if (j != null) {
                    j.b();
                    return;
                }
                return;
            }
            if (context == null) {
                context = o();
            }
            short b = b(context);
            if (b != 0) {
                a(b);
                return;
            } else {
                abstractC3781i1.c();
                return;
            }
        }
        Kc.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        Z9 z93 = this.i;
        if (z93 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z93.b("ib", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        }
        Intrinsics.checkNotNullExpressionValue("ib", "TAG");
        Kc.a((byte) 1, "ib", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        a((short) 2152);
    }

    @Override // com.inmobi.media.Gj
    public final synchronized void f(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.f(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    C3791ib.c(C3791ib.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.InterfaceC4228y0
    public final boolean a(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s) {
            if (((Integer) this.r.higher(Integer.valueOf(this.h.indexOf(renderView)))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.InterfaceC4278zm
    public final void a(byte b) {
        if (b == 1) {
            if (this.s) {
                if (this.b == 2) {
                    Z9 z9 = this.i;
                    if (z9 != null) {
                        Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                        z9.b("ib", "RenderView time out");
                    }
                    int Y = Y();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= Y) {
                            break;
                        }
                        if (!this.r.contains(Integer.valueOf(i2))) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    a((Ej) null, Integer.valueOf(i), 2);
                    i();
                    f();
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                    return;
                }
                f();
                return;
            }
            super.a(b);
            return;
        }
        super.a(b);
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.InterfaceC4228y0
    public final void a(int i, final Ej renderView, final Context context) {
        Ej ej;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (!this.s) {
            Z9 z9 = this.i;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z9.a("ib", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(renderView) && i < this.h.size() && this.h.get(i) != null && ((ej = (Ej) this.h.get(i)) == null || ej.D0)) {
            if (context == null) {
                context = o();
            }
            super.a(i, renderView, context);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3791ib.a(C3791ib.this, renderView, context);
                    }
                });
                return;
            }
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z92.a("ib", "Cannot show an pod ad with invalid index passed");
        }
        b(this.h.indexOf(renderView), false);
    }

    public static final Unit a(C3791ib c3791ib, B6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
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
            c3791ib.a(inMobiAdRequestStatus, true, s);
            return Unit.INSTANCE;
        }
        s = 2122;
        c3791ib.a(inMobiAdRequestStatus, true, s);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC3923n1
    public final void a(Ej ej, short s, String failureErrorCode) {
        Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        super.a(ej, s, failureErrorCode);
        if (this.s) {
            int indexOf = this.h.indexOf(ej);
            if (indexOf < Y()) {
                a(ej, (Integer) null, s == 2137 ? 1 : 3);
                f(s);
            }
            a(indexOf, true);
            return;
        }
        f(s);
    }

    public static final void a(Ej ej, C3791ib c3791ib, int i) {
        ej.n();
        c3791ib.a(i, false);
    }

    public static final void a(C3791ib c3791ib) {
        c3791ib.e();
        Z9 z9 = c3791ib.i;
        if (z9 != null) {
            z9.c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + c3791ib.l);
        }
        if (c3791ib.n() != null) {
            AbstractC3781i1 n = c3791ib.n();
            if (n != null) {
                n.a();
                return;
            }
            return;
        }
        Z9 z92 = c3791ib.i;
        if (z92 != null) {
            z92.c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.AbstractC3923n1, com.inmobi.media.Gj
    public final void a(Ej renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        if (b == 4) {
            final short s = z ? (short) 2220 : (short) 2219;
            this.J = new Function0() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3791ib.a(C3791ib.this, s);
                }
            };
            return;
        }
        if (b != 6) {
            if (b == 7) {
                short s2 = z ? (short) 2224 : (short) 2223;
                Kc.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                Z9 z9 = this.i;
                if (z9 != null) {
                    Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                    z9.b("ib", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z, s2);
                renderView.z();
                f(n());
                return;
            }
            return;
        }
        short s3 = z ? (short) 2222 : (short) 2221;
        Kc.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z92.b("ib", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        renderView.z();
        if (this.G == 0) {
            a(s3);
        } else {
            renderView.a(z, s3);
            f(n());
        }
    }

    public static final Unit a(C3791ib c3791ib, short s) {
        Kc.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        Z9 z9 = c3791ib.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("ib", "TAG");
            z9.b("ib", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        c3791ib.a(s);
        c3791ib.J = null;
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.InterfaceC4228y0
    public final void b() {
        if (this.s) {
            Z9 z9 = this.i;
            if (z9 != null) {
                Intrinsics.checkNotNullExpressionValue("ib", "TAG");
                z9.a("ib", "Closing the ad as closeAll is called");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.ib$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3791ib.a(C3791ib.this);
                    }
                });
            }
        }
    }

    public static final void b(C3791ib c3791ib) {
        c3791ib.f(c3791ib.n());
    }
}
