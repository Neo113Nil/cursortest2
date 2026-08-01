package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsClient;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3923n1 extends Gj implements InterfaceC3585b3, InterfaceC4278zm, InterfaceC4228y0, Fq {
    public static final /* synthetic */ int F = 0;
    public WatermarkData A;
    public final Lazy B;
    public boolean C;
    public boolean D;
    public final Lazy E;

    /* renamed from: a, reason: collision with root package name */
    public final String f7257a;
    public volatile byte b;
    public final AdConfig c;
    public WeakReference d;
    public TimeoutConfigurations e;
    public WeakReference f;
    public final C4212xb g;
    public CopyOnWriteArrayList h;
    public Z9 i;
    public Handler j;
    public boolean k;
    public C4201x0 l;
    public AdResponse m;
    public Bm n;
    public int o;
    public int p;
    public long q;
    public final TreeSet r;
    public boolean s;
    public String t;
    public C3611c0 u;
    public C3677eb v;
    public C3935nd w;
    public final Handler x;
    public final LinkedHashMap y;
    public final C4092t1 z;

    public AbstractC3923n1(Context context, C4201x0 adPlacement, Qm qm) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f7257a = uuid;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        this.c = (AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class);
        this.g = (C4212xb) AbstractC4239yb.f7499a.getValue();
        this.h = new CopyOnWriteArrayList();
        this.l = adPlacement;
        this.q = -1L;
        this.r = new TreeSet();
        this.x = new Handler(Looper.getMainLooper());
        this.y = new LinkedHashMap();
        this.z = new C4092t1(this);
        this.B = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3923n1.d(AbstractC3923n1.this);
            }
        });
        this.d = new WeakReference(context);
        this.f = new WeakReference(qm);
        Ac ac = AbstractC3771hj.f7147a;
        AbstractC3771hj.a(qm, this.i);
        WeakReference weakReference = this.f;
        String m = m();
        AdSet s = s();
        this.u = new C3611c0(weakReference, m, s != null ? s.getIsRewarded() : false);
        N();
        this.E = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3923n1.e(AbstractC3923n1.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(AbstractC3923n1 abstractC3923n1) {
        AdConfig.OmidConfig omidConfig;
        Gg gg = Fg.f6559a;
        Context o = abstractC3923n1.o();
        AdConfig adConfig = abstractC3923n1.c;
        gg.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(o);
                return;
            }
            if (adConfig != null) {
                try {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    if (viewability != null) {
                        omidConfig = viewability.getOmidConfig();
                    }
                } catch (Exception e) {
                    Lazy lazy = Ba.f6473a;
                    Ba.a(new C3810j3(e));
                    return;
                }
            }
            omidConfig = new AdConfig.OmidConfig();
            gg.b = Partner.createPartner(omidConfig.getPartnerKey(), gg.a());
        } catch (Exception e2) {
            Lazy lazy2 = Ba.f6473a;
            U9.a(e2);
        }
    }

    public static final yq d(AbstractC3923n1 abstractC3923n1) {
        return new yq(abstractC3923n1.i);
    }

    public final boolean A() {
        AdConfig.CacheConfig cacheConfig;
        Z9 z9;
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b == null) {
            return false;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(m())) != null) {
            r0 = ((b.getExpiryTimestampInMillis() > (-1L) ? 1 : (b.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + b.getInsertionTimestampInMillis() : b.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (r0 && (z9 = this.i) != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z9.b("n1", "Top ad has expired, failing show of ad.");
            }
        }
        return r0;
    }

    public final void B() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "initTelemetry " + this);
        }
        this.y.put("AdImpressionSuccessful", this.z);
    }

    public final boolean C() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.b));
        }
        if (!AbstractC4263z7.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (F()) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.b("n1", "Some of the dependency libraries for " + m() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b = this.b;
        if (b == 1) {
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z93.b("n1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b != 7) {
            return false;
        }
        Z9 z94 = this.i;
        if (z94 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z94.b("n1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void D() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "load  " + this);
        }
        C4092t1 c4092t1 = this.z;
        c4092t1.getClass();
        c4092t1.c = SystemClock.elapsedRealtime();
        a(new Function0() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3923n1.a(AbstractC3923n1.this);
            }
        }, new Function1() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC3923n1.a(AbstractC3923n1.this, (B6) obj);
            }
        });
    }

    public final void E() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "makeUnitActive " + this);
        }
        this.k = false;
    }

    public boolean F() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "missingPrerequisitesForAd " + this);
        }
        try {
            Reflection.getOrCreateKotlinClass(CustomTabsClient.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public void G() {
        MetaInfo metaInfo;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onDidParseAfterFetch " + this);
        }
        if (this.l.j) {
            int i = 0;
            com.inmobi.media.ads.network.common.model.Ad b = b(0);
            if (b != null && (metaInfo = b.getMetaInfo()) != null) {
                i = metaInfo.getCrH();
            }
            Pair b2 = b(this.l.i);
            Pair b3 = b(this.l.h);
            if (i > 0 && b2 != null) {
                C4201x0 c4201x0 = this.l;
                String str = b2.getFirst() + "x" + Math.min(((Number) b2.getSecond()).intValue(), i);
                c4201x0.getClass();
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                c4201x0.i = str;
            } else if (b3 != null) {
                C4201x0 c4201x02 = this.l;
                String str2 = b3.getFirst() + "x" + b3.getSecond();
                c4201x02.getClass();
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                c4201x02.i = str2;
            }
        }
        c((byte) 2);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3923n1.c(AbstractC3923n1.this);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (com.inmobi.media.AbstractC3914mk.g != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Mf H() {
        boolean z;
        Integer num;
        Integer num2;
        Integer num3;
        AdConfig.RenderingConfig rendering;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "prepareAdRequest " + this);
        }
        Context o = o();
        C3768hg c3768hg = o != null ? new C3768hg(o, this.i) : null;
        String str = this.l.g;
        Intrinsics.checkNotNull(str);
        this.l.getClass();
        C4201x0 c4201x0 = this.l;
        Map map = c4201x0.c;
        long j = c4201x0.f7470a;
        String str2 = c4201x0.k;
        String m = m();
        HashMap l = l();
        String str3 = this.l.d;
        AdConfig adConfig = this.c;
        if (adConfig != null && (rendering = adConfig.getRendering()) != null) {
            z = true;
            if (rendering.getEnablePubMuteControl()) {
            }
        }
        z = false;
        C3950o0 c3950o0 = new C3950o0(str, map, j, str2, m, l, str3, z);
        C3935nd c3935nd = this.w;
        int i = 15000;
        long intValue = (c3935nd == null || (num3 = c3935nd.d) == null) ? 15000 : num3.intValue();
        C3935nd c3935nd2 = this.w;
        long intValue2 = (c3935nd2 == null || (num2 = c3935nd2.d) == null) ? 15000 : num2.intValue();
        C3935nd c3935nd3 = this.w;
        if (c3935nd3 != null && (num = c3935nd3.d) != null) {
            i = num.intValue();
        }
        Cm cm = new Cm(intValue, intValue2, i);
        AdConfig adConfig2 = this.c;
        String url = adConfig2 != null ? adConfig2.getUrl() : null;
        AdConfig adConfig3 = this.c;
        Intrinsics.checkNotNull(adConfig3);
        Nm nm = new Nm(adConfig3.getIncludeIds());
        C3711fg a2 = c3768hg != null ? c3768hg.a() : null;
        Z9 z92 = this.i;
        AdConfig adConfig4 = this.c;
        return new C4007q0(url, nm, c3950o0, cm, a2, z92, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void I() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "printPublisherTestId " + this);
        }
        Mm.b();
    }

    public final void J() {
        Tp viewableAd;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "releaseTrackingOnAbandon " + this);
        }
        Iterator it = this.h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Ej ej = (Ej) it.next();
            if (ej != null && (viewableAd = ej.getViewableAd()) != null) {
                viewableAd.e();
            }
        }
    }

    public void K() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "resetContainersForNextAd " + this);
        }
        int size = this.h.size();
        int i = this.p;
        if (size <= i || this.h.get(i) == null) {
            return;
        }
        a(this.p, false);
    }

    public final void L() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.d("n1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void M() {
        Intrinsics.checkNotNullParameter("activity", "monetizationContext");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "setMonetizationContext " + this);
        }
        C4201x0 c4201x0 = this.l;
        c4201x0.getClass();
        Intrinsics.checkNotNullParameter("activity", "<set-?>");
        c4201x0.k = "activity";
    }

    public final void N() {
        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
        String str = "setup " + this;
        this.e = z();
        c((byte) 0);
        this.j = new Handler(Looper.getMainLooper());
        this.n = new Bm(this);
    }

    public final boolean O() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null && 4 == this.b && !A()) {
            AbstractC3781i1 n = n();
            if (n != null) {
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z92.a("n1", "ad is ready - load success");
                }
                d(n);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (b == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z93.b("n1", "ad no longer available");
            }
            return true;
        }
        if (2 != this.b) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
            Z9 z94 = this.i;
            if (z94 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z94.b("n1", "ad no longer available. state - " + ((int) this.b));
            }
            return true;
        }
        if (!A()) {
            return false;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
        Z9 z95 = this.i;
        if (z95 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z95.b("n1", "ad is expired");
        }
        return true;
    }

    public final void P() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        int i;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "startLoadingHTMLAd " + this);
        }
        Ej ej = null;
        try {
            AdSet s = s();
            com.inmobi.media.ads.network.common.model.Ad ad2 = (s == null || (i = this.o) < 0 || i >= s.getAds().size()) ? null : s.getAds().get(this.o);
            d(this.o);
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                AdSet s2 = s();
                z92.a("n1", "Loading ad with impressionId : " + ((s2 == null || (ads = s2.getAds()) == null || (ad = ads.get(this.o)) == null) ? null : ad.getImpressionId()));
            }
            Ej ej2 = (Ej) this.h.get(this.o);
            if (ad2 != null) {
                Yh pubContent = ad2.getPubContent();
                if (pubContent instanceof C4236y8) {
                    Z9 z93 = this.i;
                    if (z93 != null) {
                        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                        z93.a("n1", "Loading HTML content into WebView");
                    }
                    if (ej2 != null) {
                        ej2.i(((C4236y8) pubContent).f7496a);
                    }
                } else if (pubContent instanceof C4264z8) {
                    String obj = StringsKt.trim((CharSequence) ((C4264z8) pubContent).f7520a).toString();
                    Z9 z94 = this.i;
                    if (z94 != null) {
                        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                        z94.a("n1", "Loading HTML URL into WebView");
                    }
                    if (ej2 != null) {
                        ej2.a(obj, this.c.getRendering().getEnableHtmlUrlPrefetch());
                    }
                }
            }
            if (ej2 == null || !Intrinsics.areEqual(t(), "htmlUrl")) {
                return;
            }
            k(ej2);
        } catch (Exception e) {
            Z9 z95 = this.i;
            if (z95 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z95.a("n1", "Loading ad markup into container encountered an unexpected error: " + e.getMessage());
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
            int i2 = this.o;
            if (i2 >= 0 && i2 < this.h.size()) {
                ej = (Ej) this.h.get(this.o);
            }
            a(ej, (short) 2135, e((short) 2135));
        }
    }

    public final void Q() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitAdLoadCalled " + this);
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        c("AdLoadCalled", hashMap);
    }

    public final void R() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + t() + ServerSentEventKt.SPACE + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.c;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C3677eb c3677eb = this.v;
        if (c3677eb != null) {
            hashMap.put("retryCount", Integer.valueOf(c3677eb.b));
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        b(hashMap);
        c("AdLoadSuccessful", hashMap);
    }

    public final void S() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitAdShowCalled " + this);
        }
        C4092t1 c4092t1 = this.z;
        c4092t1.getClass();
        c4092t1.f = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.i;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        b(hashMap);
        c("AdShowCalled", hashMap);
    }

    public final void T() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitAdShowSuccess " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.f;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        b(hashMap);
        c("AdShowSuccessful", hashMap);
    }

    public final void U() {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitRenderSuccessEvent ADunit markuptype : " + t() + ServerSentEventKt.SPACE + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.g;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C3677eb c3677eb = this.v;
        if (c3677eb != null) {
            hashMap.put("retryCount", Integer.valueOf(c3677eb.b));
        }
        hashMap.put("plType", Byte.valueOf(u()));
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        b(hashMap);
        a(q(), hashMap);
        c("RenderSuccess", hashMap);
    }

    public final long V() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "timeSincePodShow " + this);
        }
        if (this.s) {
            return System.currentTimeMillis() - this.q;
        }
        return -1L;
    }

    public final void W() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.b("n1", "ad unloaded with current state - " + ((int) this.b));
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.d("n1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    @Override // com.inmobi.media.Gj
    public void a(Ej renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onRenderProcessGone didCrash=" + z + " state=" + ((int) this.b));
        }
        byte b = this.b;
        if (b == 0) {
            short s = z ? (short) 2214 : (short) 2213;
            L();
            renderView.a(z, s);
            return;
        }
        if (b == 1) {
            short s2 = z ? (short) 2216 : (short) 2215;
            L();
            c(s2);
            AbstractC3781i1 n = n();
            if (n != null) {
                n.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 3) {
            renderView.a(z, z ? (short) 2226 : (short) 2225);
            return;
        }
        if (b == 2) {
            L();
            c(z ? (short) 2218 : (short) 2217);
            AbstractC3781i1 n2 = n();
            if (n2 != null) {
                n2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b == 4 || b == 6 || b == 7 || b != 8) {
            return;
        }
        renderView.a(z, z ? (short) 2240 : (short) 2241);
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i) {
        Iterable emptyList;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
        String str = "getAdObject " + i + ServerSentEventKt.SPACE + this;
        AdSet s = s();
        if (s == null || (ads3 = s.getAds()) == null || (emptyList = CollectionsKt.getIndices(ads3)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        if (CollectionsKt.contains(emptyList, Integer.valueOf(i))) {
            AdSet s2 = s();
            if (s2 == null || (ads2 = s2.getAds()) == null) {
                return null;
            }
            return ads2.get(i);
        }
        AdSet s3 = s();
        if (s3 == null || (ads = s3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void e(AbstractC3781i1 abstractC3781i1) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "adUnitEventListener setter " + this);
        }
        WeakReference weakReference = new WeakReference(abstractC3781i1);
        this.f = weakReference;
        AdSet s = s();
        C3611c0 c3611c0 = new C3611c0(weakReference, "int", s != null ? s.getIsRewarded() : false);
        this.u = c3611c0;
        Z9 logger = this.i;
        if (logger != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c3611c0.f = logger;
        }
    }

    public final void f() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "destroyAllContainer " + this);
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            a(i, true);
        }
    }

    public final void g() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.d("n1", "AdUnit " + this + " state - LOADING");
            }
            I();
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            if (((RootConfig) AbstractC4260z4.f7518a.a(RootConfig.class)).getMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                Z9 z93 = this.i;
                if (z93 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z93.b("n1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.g.a(this.f7257a, new C3808j1(this, null));
                Z9 z94 = this.i;
                if (z94 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z94.a("n1", "Fresh ad requested");
                }
            }
        } catch (Exception e) {
            Z9 z95 = this.i;
            if (z95 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z95.b("n1", "Load failed with unexpected error: " + e.getMessage());
            }
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    public final void h() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "fireAdServedBeacon " + this);
        }
        Ej j = j();
        if (j == null) {
            return;
        }
        j.u();
    }

    public abstract void i();

    @Override // com.inmobi.media.Gj
    public void i(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "RenderView visible, for index " + this.h.indexOf(renderView) + ServerSentEventKt.SPACE + this);
        }
    }

    public final Ej j() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "adMarkupContainer getter " + this);
        }
        byte b = this.b;
        String t = t();
        if (Intrinsics.areEqual(t, "html")) {
            if (b == 0 || 1 == b || 3 == b || 8 == b) {
                return null;
            }
            return r();
        }
        if (!Intrinsics.areEqual(t, "htmlUrl") || b == 0 || 1 == b || 3 == b || 8 == b) {
            return null;
        }
        return r();
    }

    public final AdMetaInfo k() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        if (b != null) {
            return new AdMetaInfo(b.getCreativeId(), b.getTransaction());
        }
        return null;
    }

    public HashMap l() {
        return new HashMap();
    }

    public abstract String m();

    public void m(Ej ej) {
        C3685ej c3685ej;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "Render view signaled ad ready, for index " + this.h.indexOf(ej) + ServerSentEventKt.SPACE + this);
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.a("n1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        Z9 z93 = this.i;
        if (z93 == null || (c3685ej = z93.f6988a) == null) {
            return;
        }
        c3685ej.a();
    }

    public final AbstractC3781i1 n() {
        Z9 z9;
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.c("n1", "adUnitEventListener getter " + this);
        }
        AbstractC3781i1 abstractC3781i1 = (AbstractC3781i1) this.f.get();
        if (abstractC3781i1 == null && (z9 = this.i) != null) {
            z9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC3781i1;
    }

    public final Context o() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.s ? b(this.o) : b(0);
    }

    public final com.inmobi.media.ads.network.common.model.Ad q() {
        return this.s ? b(this.p) : b(0);
    }

    public abstract Ej r();

    public final AdSet s() {
        List<AdSet> adSets;
        AdResponse adResponse = this.m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) CollectionsKt.firstOrNull((List) adSets);
    }

    public final String t() {
        String markupType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(0);
        return (b == null || (markupType = b.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte u();

    public final String v() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "getPodAdContext " + this);
        }
        if (this.s) {
            return this.t;
        }
        return null;
    }

    public final JSONArray w() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "getRenderableAdIndexes " + this);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.r.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long x() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "getShowTimeStamp " + this);
        }
        if (this.s) {
            return this.q;
        }
        return -1L;
    }

    public final String y() {
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet s = s();
        com.inmobi.media.ads.network.common.model.Ad ad = (s == null || (ads = s.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull((List) ads);
        return (ad == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final TimeoutConfigurations z() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "timeOutConfiguration getter " + this);
        }
        AdConfig adConfig = this.c;
        Intrinsics.checkNotNull(adConfig);
        return adConfig.getTimeouts();
    }

    public final int l(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.s) {
            return -1;
        }
        int indexOf = this.h.indexOf(renderView);
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.c("n1", "getCurrentRenderingPodAdIndex " + indexOf);
        }
        return indexOf;
    }

    public void o(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onAdUnloadedAfterShowSuccess");
        }
        renderView.o();
        b((byte) 4);
    }

    public final void d(int i) {
        Ej ej;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "initializeHtmlAdContainer " + this);
        }
        Context o = o();
        if (o == null) {
            return;
        }
        try {
            if (this.h.get(i) == null || ((ej = (Ej) this.h.get(i)) != null && ej.O.get())) {
                com.inmobi.media.ads.network.common.model.Ad b = b(i);
                C3979p0 a2 = a(i);
                Ej a3 = ((yq) this.B.getValue()).a(new C3715fk("adUnit-" + i, BuildConfig.FLAVOR), o, (short) 0, a2, this.c);
                a(a3, a2.p);
                this.h.set(i, a3);
                a3.a(this);
                a3.a(b);
            }
        } catch (Exception e) {
            a((Ej) this.h.get(this.o), (short) 2136, e((short) 2136));
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.a("n1", "Exception while initializing WebView", e);
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    public static String p(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Job job = renderView.A;
        return e((job == null || !job.isActive()) ? (short) 3103 : (short) 3102);
    }

    @Override // com.inmobi.media.Gj
    public final void h(final Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "onRenderViewSignaledAdReady " + this);
        }
        if (!this.k && o() != null) {
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3923n1.a(AbstractC3923n1.this, renderView);
                    }
                });
                return;
            } else {
                c((short) 2187);
                return;
            }
        }
        c((short) 2186);
    }

    public final void k(Ej ej) {
        int indexOf = this.h.indexOf(ej);
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "fireLoadAdTokenUrlSuccessful : " + indexOf + ServerSentEventKt.SPACE + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            for (String url : AbstractC3574ak.a(b, "load_ad_token_url")) {
                X3 x3 = X3.f6941a;
                Z9 z92 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                X3.a(url, true, z92);
            }
        }
    }

    public void n(Ej renderView) {
        int l;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onAdUnloadedAfterLoadSuccess");
        }
        if (this.s && (l = l(renderView)) > this.p) {
            this.r.remove(Integer.valueOf(l));
        } else {
            W();
        }
    }

    public final void b(AbstractC3781i1 abstractC3781i1) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC3781i1.b();
    }

    public static Pair b(String str) {
        List split$default;
        if (str != null && (split$default = StringsKt.split$default((CharSequence) str, new String[]{"x"}, false, 2, 2, (Object) null)) != null) {
            String str2 = (String) CollectionsKt.getOrNull(split$default, 0);
            Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
            String str3 = (String) CollectionsKt.getOrNull(split$default, 1);
            Integer intOrNull2 = str3 != null ? StringsKt.toIntOrNull(str3) : null;
            if (intOrNull != null && intOrNull2 != null) {
                return TuplesKt.to(intOrNull, intOrNull2);
            }
        }
        return null;
    }

    public final void b(InMobiAdRequestStatus requestStatus, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "onAdFetchFailed " + this);
        }
        if (!this.k && o() != null && this.b != 3) {
            a(requestStatus, s);
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.b("n1", "callback ignored - isDestroyed - " + this.k + " context - " + o() + " state- " + ((int) this.b));
        }
    }

    public final void c(byte b) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.d("n1", "STATE UPDATE: from " + ((int) this.b) + " to " + ((int) b));
        }
        this.b = b;
    }

    public final boolean c(int i) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "getAllowAutoRedirectionForIndex " + this + " index - " + i);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(i);
        return b != null && b.getAllowAutoRedirection();
    }

    public final void c(AbstractC3781i1 listener) {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Intrinsics.checkNotNullParameter(listener, "listener");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onFetchSuccess " + this);
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        long j = this.z.h;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("metadataBlob", y());
        C3677eb c3677eb = this.v;
        if (c3677eb != null) {
            hashMap.put("retryCount", Integer.valueOf(c3677eb.b));
        }
        AdSet s = s();
        if (s != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s.getIsRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        c("ParseSuccess", hashMap);
        AdMetaInfo k = k();
        if (k == null) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.b("n1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        Z9 z93 = this.i;
        if (z93 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z93.a("n1", "callback - onAdFetchSuccess");
        }
        listener.b(k);
    }

    @Override // com.inmobi.media.Gj
    public final void j(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        byte b = this.b;
        if (b == 2) {
            W();
            b((byte) 1);
            AbstractC3781i1 n = n();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (n != null) {
                n.a(this, inMobiAdRequestStatus);
            } else {
                Z9 z9 = this.i;
                if (z9 != null) {
                    z9.a();
                }
            }
            c((short) 2238);
            renderView.b();
            return;
        }
        if (b == 4) {
            n(renderView);
            renderView.b();
            b((byte) 4);
        } else {
            if (b != 6 && b != 7) {
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z92.b("n1", "onUnloadCalled - invalid state - " + ((int) this.b));
                    return;
                }
                return;
            }
            o(renderView);
        }
    }

    public final void b(InMobiAdRequestStatus requestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.b("n1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 1 && z) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.b("n1", "load failed - " + ((int) s));
            }
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z93.d("n1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3781i1 n = n();
        if (n != null) {
            n.a(this, requestStatus);
        } else {
            Z9 z94 = this.i;
            if (z94 != null) {
                z94.a();
            }
        }
        if (s != 0) {
            c(s);
        }
    }

    public final void e() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "clearAdPods " + this);
        }
        if (this.s) {
            f();
            this.h.clear();
            this.o = 0;
            this.p = 0;
            this.r.clear();
        }
    }

    public static final void b(AbstractC3923n1 abstractC3923n1) {
        if (6 == abstractC3923n1.b) {
            abstractC3923n1.a((short) 2158);
        }
    }

    public final void b(HashMap hashMap) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "constructTelemetryPayload " + this);
        }
        hashMap.put("adType", m());
        hashMap.put("networkType", Y5.g());
        hashMap.put("plId", Long.valueOf(this.l.f7470a));
        String str = this.l.f;
        if (str != null) {
            hashMap.put("plType", str);
        }
    }

    public final void e(int i) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "resetCurrentRenderingIndex " + this);
        }
        this.p = i;
    }

    public static String e(short s) {
        return "SDK_" + ((int) s);
    }

    public static final Dq e(AbstractC3923n1 abstractC3923n1) {
        com.inmobi.media.ads.network.common.model.Ad b = abstractC3923n1.b(0);
        if (b == null || abstractC3923n1.A()) {
            b = null;
        }
        Z9 z9 = abstractC3923n1.i;
        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
        return new Dq(b, z9);
    }

    public final void b(short s) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitAdLoadDroppedAtSDK " + this);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        b(hashMap);
        c("AdLoadDroppedAtSDK", hashMap);
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.z.d));
        map.put("networkType", Y5.g());
        map.put("plId", Long.valueOf(this.l.f7470a));
        AdSet s = s();
        map.put("isRewarded", Boolean.valueOf(s != null ? s.getIsRewarded() : false));
        String str = this.l.e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.l.f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C3677eb c3677eb = this.v;
        if (c3677eb != null) {
            map.put("retryCount", Integer.valueOf(c3677eb.b));
        }
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(p(), map);
        b("ServerError", map);
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad p;
        MetaInfo metaInfo;
        String creativeType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onTelemetryEvent " + this + " adState=" + ((int) this.b));
        }
        if (this.b != 3) {
            a(str, map);
            if ((Intrinsics.areEqual(str, "ServerFill") || Intrinsics.areEqual(str, "ServerError")) && (p = p()) != null && (metaInfo = p.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "updateAd " + this);
        }
        AdSet s = s();
        if (s == null || (ads = s.getAds()) == null) {
            return;
        }
        ads.set(0, ad);
    }

    public final void b(byte b) {
        Bm bm;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "cancelTimer " + this);
        }
        if (b == 1 && (bm = this.n) != null) {
            bm.a((byte) 2);
        }
        Bm bm2 = this.n;
        if (bm2 != null) {
            bm2.a(b);
        }
    }

    public final void b(int i, boolean z) {
        Ej ej;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "fireAdPodShowResult " + this);
        }
        CopyOnWriteArrayList list = this.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size() || (ej = (Ej) this.h.get(i)) == null) {
            return;
        }
        ej.b(z);
    }

    public static final void a(AbstractC3923n1 abstractC3923n1, X x) {
        abstractC3923n1.getClass();
        if (x instanceof C3735gc) {
            C4092t1 c4092t1 = abstractC3923n1.z;
            c4092t1.getClass();
            c4092t1.d = SystemClock.elapsedRealtime();
            return;
        }
        if (x instanceof Mg) {
            C4092t1 c4092t12 = abstractC3923n1.z;
            c4092t12.getClass();
            c4092t12.h = SystemClock.elapsedRealtime();
        } else {
            if (x instanceof C4221xk) {
                Map map = ((C4221xk) x).f7482a;
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3923n1.z.d)), TuplesKt.to("networkType", Y5.g()), TuplesKt.to("plId", Long.valueOf(abstractC3923n1.l.f7470a)));
                mutableMapOf.putAll(map);
                String str = abstractC3923n1.l.f;
                if (str != null) {
                    mutableMapOf.put("plType", str);
                }
                String str2 = abstractC3923n1.l.e;
                if (str2 != null) {
                    mutableMapOf.put("adType", str2);
                }
                abstractC3923n1.b("ServerFill", mutableMapOf);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.inmobi.media.Gj
    public final void b(Ej renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "fireClickTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (Intrinsics.areEqual((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (String url : AbstractC3574ak.a(b, "click")) {
            X3 x3 = X3.f6941a;
            Z9 z92 = this.i;
            Intrinsics.checkNotNullParameter(url, "url");
            X3.a(url, true, z92);
        }
    }

    public final void a(Context context, C4201x0 adPlacement, Qm qm) {
        C4201x0 c4201x0;
        String str;
        String str2;
        Z9 z9;
        Z9 z92;
        Z9 z93;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPlacement, "adPlacement");
        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
        String str3 = "initAdUnit " + this;
        a(context);
        this.f = new WeakReference(qm);
        Ac ac = AbstractC3771hj.f7147a;
        AbstractC3771hj.a(qm, this.i);
        WeakReference weakReference = this.f;
        String m = m();
        AdSet s = s();
        this.u = new C3611c0(weakReference, m, s != null ? s.getIsRewarded() : false);
        this.l = adPlacement;
        B();
        Z9 z94 = this.i;
        if (z94 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z94.c("n1", "initInternetAvailabilityAdRetry");
        }
        if (this.c == null && (z93 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z93.c("n1", "adConfig is null");
            Unit unit = Unit.INSTANCE;
        }
        if (this.l.f == null && (z92 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.c("n1", "placement.placementType is null");
            Unit unit2 = Unit.INSTANCE;
        }
        if (this.l.e == null && (z9 = this.i) != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "placement.adType is null");
            Unit unit3 = Unit.INSTANCE;
        }
        AdConfig adConfig = this.c;
        if (adConfig != null && (str = (c4201x0 = this.l).f) != null && (str2 = c4201x0.e) != null) {
            C3935nd a2 = AbstractC3907md.a(adConfig.getTimeouts().a0(), str, str2, AbstractC3942nk.b);
            this.v = new C3677eb(a2);
            this.w = a2;
        }
        if (AbstractC3841k6.h != null) {
            Intrinsics.checkNotNullExpressionValue("k6", "TAG");
        } else {
            AbstractC3841k6.h = Float.valueOf(new TextView(context).getTextSize());
            Intrinsics.checkNotNullExpressionValue("k6", "TAG");
        }
        N();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "setContext " + this);
        }
        this.d = new WeakReference(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x012a, code lost:
    
        if (r10.equals("video") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0131, code lost:
    
        if (r10.equals("audio") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
    
        if (r10.equals("nonvideo") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02bb, code lost:
    
        if (r2 != null) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025a A[EDGE_INSN: B:134:0x025a->B:77:0x025a BREAK  A[LOOP:1: B:56:0x01ba->B:133:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f4  */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v2, types: [int] */
    /* JADX WARN: Type inference failed for: r37v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3979p0 a(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        Iterator<Viewability> it;
        MetaInfo metaInfo;
        MetaInfo metaInfo2;
        boolean z2;
        InlineParams inlineParams;
        String creativeId;
        MetaInfo metaInfo3;
        String creativeType;
        List<LandingPageParam> landingPageParams;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam;
        AdConfig.ViewabilityConfig viewability;
        AdConfig.OmidConfig omidConfig;
        MetaInfo metaInfo4;
        com.inmobi.media.ads.network.common.model.Ad ad = b(i);
        String str9 = "audio";
        if (Intrinsics.areEqual(this.l.e, "banner") || Intrinsics.areEqual(this.l.e, "audio")) {
            C4201x0 c4201x0 = this.l;
            if (c4201x0.j && c4201x0.i.length() > 0) {
                str = this.l.i;
            } else {
                str = this.l.h;
            }
            str2 = str;
        } else {
            str2 = null;
        }
        if (ad == null || (str3 = ad.getMarkupType()) == null) {
            str3 = "html";
        }
        String str10 = str3;
        String str11 = this.l.e;
        boolean a2 = a(ad);
        long j = this.l.f7470a;
        boolean c = c(i);
        String str12 = this.l.m;
        String creativeType2 = (ad == null || (metaInfo4 = ad.getMetaInfo()) == null) ? null : metaInfo4.getCreativeType();
        AdMetaInfo k = k();
        String creativeID = k != null ? k.getCreativeID() : null;
        boolean z3 = this.l.l;
        LinkedHashMap linkedHashMap = this.y;
        WatermarkData watermarkData = this.A;
        AdQualityControl adQualityControl = ad != null ? ad.getAdQualityControl() : null;
        byte u = u();
        Intrinsics.checkNotNull(ad);
        AdConfig adConfig = this.c;
        Intrinsics.checkNotNullParameter(ad, "ad");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MetaInfo metaInfo5 = ad.getMetaInfo();
        if (adConfig == null || (viewability = adConfig.getViewability()) == null || (omidConfig = viewability.getOmidConfig()) == null) {
            str4 = str12;
            bool = null;
        } else {
            bool = Boolean.valueOf(omidConfig.isOmidEnabled());
            str4 = str12;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            if ((metaInfo5 != null ? metaInfo5.getOmsdkInfo() : null) != null) {
                OmSdkInfo omsdkInfo = metaInfo5.getOmsdkInfo();
                if (omsdkInfo.getOmidEnabled()) {
                    str6 = str2;
                    Jm jm = new Jm((byte) 3);
                    boolean isolateVerificationScripts = omsdkInfo.getIsolateVerificationScripts();
                    String customReferenceData = omsdkInfo.getCustomReferenceData();
                    str5 = str10;
                    HashMap<String, String> obj = omsdkInfo.getMacros();
                    str7 = creativeType2;
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    JSONObject a3 = AbstractC3875lb.a(obj, obj.getClass());
                    byte impressionType = omsdkInfo.getImpressionType();
                    String creativeType3 = metaInfo5.getCreativeType();
                    str8 = creativeID;
                    int hashCode = creativeType3.hashCode();
                    z = c;
                    if (hashCode != 93166550) {
                        if (hashCode == 112202875) {
                            str9 = "video";
                        } else {
                            if (hashCode == 1425678798) {
                                str9 = "nonvideo";
                            }
                            str9 = "unknown";
                            HashMap hashMap = new HashMap();
                            if (a3 != null) {
                                for (Iterator<String> keys = a3.keys(); keys.hasNext(); keys = keys) {
                                    String next = keys.next();
                                    hashMap.put(next, a3.optString(next));
                                }
                            }
                            HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("creativeType", str9), TuplesKt.to("customReferenceData", customReferenceData), TuplesKt.to("impressionType", Byte.valueOf(impressionType)), TuplesKt.to("macros", hashMap), TuplesKt.to("isolateVerificationScripts", Boolean.valueOf(isolateVerificationScripts)));
                            if (!(hashMapOf instanceof HashMap)) {
                                hashMapOf = null;
                            }
                            if (hashMapOf == null) {
                                hashMapOf = new HashMap();
                            }
                            jm.b = hashMapOf;
                            linkedHashSet.add(jm);
                        }
                    }
                    it = ad.getViewability().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Viewability next2 = it.next();
                        if (next2.getInmobi() != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            int a4 = Km.a(next2.getInmobi().getTime());
                            if (a4 != -1) {
                                linkedHashMap2.put("time", Integer.valueOf(a4));
                            }
                            int a5 = Km.a(next2.getInmobi().getView());
                            if (a5 != -1) {
                                linkedHashMap2.put("view", Integer.valueOf(a5));
                            }
                            int a6 = Km.a(next2.getInmobi().getPixel());
                            if (a6 != -1) {
                                linkedHashMap2.put("pixel", Integer.valueOf(a6));
                            }
                            byte type = next2.getInmobi().getType();
                            linkedHashMap2.put("type", Integer.valueOf(type));
                            if (type == 2) {
                                if (next2.getInmobi().getFrame().length == 4) {
                                    linkedHashMap2.put("frame", next2.getInmobi().getFrame());
                                } else {
                                    linkedHashMap2.put("frame", new JSONArray("[0,0,0,0]"));
                                }
                            }
                            Jm jm2 = new Jm((byte) 2);
                            jm2.b = linkedHashMap2;
                            linkedHashSet.add(jm2);
                        }
                    }
                    com.inmobi.media.ads.network.common.model.Ad b = b(i);
                    String impressionId = b == null ? b.getImpressionId() : null;
                    metaInfo = ad.getMetaInfo();
                    if (metaInfo != null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams2, 0)) == null || (r2 = landingPageParam.getOpenMode()) == null) {
                        String str13 = "DEFAULT";
                    }
                    String str14 = str13;
                    J4 j4 = AbstractC4260z4.f7518a;
                    Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
                    Nj nj = new Nj(((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getMaxTemplateEvents());
                    metaInfo2 = ad.getMetaInfo();
                    if (metaInfo2 != null || (landingPageParams = metaInfo2.getLandingPageParams()) == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                        LandingPageParam landingPageParam2 = (LandingPageParam) CollectionsKt.getOrNull(landingPageParams, 0);
                        if (landingPageParam2 != null) {
                            inlineParams = landingPageParam2.getAParams();
                        }
                    }
                    inlineParams = new InlineParams(null, null, 0, 7, null);
                    inlineParams.setTargetBundleId(ad.getBidBundle());
                    inlineParams.setPingMode(this.c.getInlineInstaller().getEffectivePingMode());
                    C4201x0 c4201x02 = this.l;
                    String t = t();
                    String impressionId2 = ad.getImpressionId();
                    String str15 = impressionId2 != null ? "" : impressionId2;
                    String telemetryMetadataBlob = ad.getTelemetryMetadataBlob();
                    String str16 = telemetryMetadataBlob != null ? "" : telemetryMetadataBlob;
                    C3677eb c3677eb = this.v;
                    ?? r37 = c3677eb == null ? c3677eb.b : z2;
                    com.inmobi.media.ads.network.common.model.Ad p = p();
                    String str17 = (p != null || (metaInfo3 = p.getMetaInfo()) == null || (creativeType = metaInfo3.getCreativeType()) == null) ? "" : creativeType;
                    com.inmobi.media.ads.network.common.model.Ad p2 = p();
                    String str18 = (p2 != null || (creativeId = p2.getCreativeId()) == null) ? "" : creativeId;
                    AdSet s = s();
                    return new C3979p0(str11, a2, j, z, str8, str7, str5, str6, this, str4, linkedHashMap, Boolean.valueOf(z3), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str14, new Ij(c4201x02, t, str15, str16, r37, str17, str18, s == null ? s.getIsRewarded() : z2, i, this.z.k, nj, BuildConfig.FLAVOR, inlineParams), this.i);
                }
            }
        }
        z = c;
        str5 = str10;
        str6 = str2;
        str7 = creativeType2;
        str8 = creativeID;
        it = ad.getViewability().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        com.inmobi.media.ads.network.common.model.Ad b2 = b(i);
        if (b2 == null) {
        }
        metaInfo = ad.getMetaInfo();
        if (metaInfo != null) {
        }
        String str132 = "DEFAULT";
        String str142 = str132;
        J4 j42 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        Nj nj2 = new Nj(((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getMaxTemplateEvents());
        metaInfo2 = ad.getMetaInfo();
        if (metaInfo2 != null) {
        }
        z2 = false;
        inlineParams = new InlineParams(null, null, 0, 7, null);
        inlineParams.setTargetBundleId(ad.getBidBundle());
        inlineParams.setPingMode(this.c.getInlineInstaller().getEffectivePingMode());
        C4201x0 c4201x022 = this.l;
        String t2 = t();
        String impressionId22 = ad.getImpressionId();
        if (impressionId22 != null) {
        }
        String telemetryMetadataBlob2 = ad.getTelemetryMetadataBlob();
        if (telemetryMetadataBlob2 != null) {
        }
        C3677eb c3677eb2 = this.v;
        if (c3677eb2 == null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p3 = p();
        if (p3 != null) {
        }
        com.inmobi.media.ads.network.common.model.Ad p22 = p();
        if (p22 != null) {
        }
        AdSet s2 = s();
        return new C3979p0(str11, a2, j, z, str8, str7, str5, str6, this, str4, linkedHashMap, Boolean.valueOf(z3), watermarkData, adQualityControl, u, linkedHashSet, impressionId, str142, new Ij(c4201x022, t2, str15, str16, r37, str17, str18, s2 == null ? s2.getIsRewarded() : z2, i, this.z.k, nj2, BuildConfig.FLAVOR, inlineParams), this.i);
    }

    public final void b(Ej renderView, String errorCode) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int indexOf = this.h.indexOf(renderView);
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.b("n1", "fireLoadAdTokenUrlFailed : " + indexOf + ServerSentEventKt.SPACE + this + " errorCode: " + errorCode);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(indexOf);
        if (b != null) {
            List<String> a2 = AbstractC3574ak.a(b, "load_ad_token_url_failure");
            boolean contains = this.c.getDisableAppendingKeysForBeacons().contains("load_ad_token_url_failure");
            for (String url : a2) {
                if (!contains) {
                    Uri parse = Uri.parse(url);
                    Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
                    url = parse.buildUpon().appendQueryParameter("error", errorCode).build().toString();
                    Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                }
                X3 x3 = X3.f6941a;
                Z9 z92 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                X3.a(url, true, z92);
            }
        }
    }

    public final void d(AbstractC3781i1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "onLoadSuccess " + this);
        }
        AdMetaInfo k = k();
        if (k == null) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.b("n1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        Z9 z93 = this.i;
        if (z93 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z93.a("n1", "callback - onAdLoadSucceeded");
        }
        listener.c(k);
    }

    public void d() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "clear " + this);
        }
        if (this.k) {
            return;
        }
        this.k = true;
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C3677eb c3677eb = this.v;
        if (c3677eb != null) {
            c3677eb.b = 0;
        }
        K();
        c((byte) 0);
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.d("n1", "AdUnit " + this + " state - CREATED");
        }
        C4212xb c4212xb = this.g;
        String id = this.f7257a;
        c4212xb.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        try {
            List list = (List) c4212xb.c.get(id);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
                }
            }
            List list2 = (List) c4212xb.c.remove(id);
            if (list2 != null) {
                list2.clear();
            }
        } catch (Exception unused) {
        }
        this.m = null;
        this.s = false;
    }

    @Override // com.inmobi.media.Gj
    public final void d(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        Oj oj = renderView.f0;
        if (oj != null) {
            Map a2 = oj.a();
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("AttachedToWindow", a2, EnumC3944nm.f7271a);
        }
    }

    public final void d(short s) {
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitAdShowFailed " + this);
        }
        HashMap hashMap = new HashMap();
        long j = this.z.f;
        CoroutineScope coroutineScope = AbstractC4143un.f7420a;
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad q2 = q();
        if (q2 != null && (metaInfo = q2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        b(hashMap);
        a(q(), hashMap);
        c("AdShowFailed", hashMap);
    }

    public final void c(String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "setPodAdContext " + this);
        }
        if (this.s) {
            this.t = podAdContext;
        }
    }

    @Override // com.inmobi.media.Gj
    public final void c() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onAdScreenDisplayFailed " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.b("n1", "Ad failed to display");
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3923n1.b(AbstractC3923n1.this);
                }
            });
        }
    }

    public final void c(short s) {
        long j;
        long elapsedRealtime;
        String str;
        MetaInfo metaInfo;
        String creativeType;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitAdLoadFailedEvent " + this);
        }
        HashMap hashMap = new HashMap();
        if (s == 2138 || s == 2109) {
            j = this.z.e;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s == 2139) {
            j = this.z.g;
            CoroutineScope coroutineScope2 = AbstractC4143un.f7420a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = this.z.c;
            CoroutineScope coroutineScope3 = AbstractC4143un.f7420a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        hashMap.put("latency", Long.valueOf(elapsedRealtime - j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad p = p();
        if (p == null || (str = p.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        com.inmobi.media.ads.network.common.model.Ad p2 = p();
        if (p2 != null && (metaInfo = p2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            hashMap.put("creativeType", creativeType);
        }
        C3677eb c3677eb = this.v;
        if (c3677eb != null) {
            hashMap.put("retryCount", Integer.valueOf(c3677eb.b));
        }
        AdSet s2 = s();
        if (s2 != null) {
            hashMap.put("isRewarded", Boolean.valueOf(s2.getIsRewarded()));
        }
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        b(hashMap);
        a(p(), hashMap);
        c("AdLoadFailed", hashMap);
    }

    @Override // com.inmobi.media.Gj
    public final void g(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "RenderView completed loading ad content, for index " + this.h.indexOf(renderView) + ServerSentEventKt.SPACE + this);
        }
    }

    public final boolean d(byte b) {
        int b0;
        Integer num;
        long j;
        Integer num2;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "startTimer " + this);
        }
        if (b == 0) {
            C3935nd c3935nd = this.w;
            if (c3935nd != null && (num2 = c3935nd.d) != null) {
                b0 = num2.intValue();
                j = b0;
            }
            j = 15000;
        } else if (b == 1) {
            C3935nd c3935nd2 = this.w;
            if (c3935nd2 != null) {
                b0 = c3935nd2.c;
                j = b0;
            }
            j = 15000;
        } else {
            if (b == 2) {
                C3935nd c3935nd3 = this.w;
                if (c3935nd3 != null && (num = c3935nd3.e) != null) {
                    b0 = num.intValue();
                }
                j = 15000;
            } else if (b == 4) {
                TimeoutConfigurations timeoutConfigurations = this.e;
                Intrinsics.checkNotNull(timeoutConfigurations);
                b0 = timeoutConfigurations.b0();
            } else {
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z92.b("n1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                }
                return false;
            }
            j = b0;
        }
        Bm bm = this.n;
        return bm != null && bm.a(b, j);
    }

    public final void c(String eventType, Map kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitTelemetryEvent " + this);
        }
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b(eventType, kv, EnumC3944nm.f7271a);
    }

    @Override // com.inmobi.media.Gj
    public final void c(Ej renderView) {
        MetaInfo metaInfo;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "fireImpressionTracker " + this);
        }
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (Intrinsics.areEqual((b == null || (metaInfo = b.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || b == null) {
            return;
        }
        for (String url : AbstractC3574ak.a(b, "impression")) {
            C4113tm telemetryOnAdImpression = renderView.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            Intrinsics.checkNotNullParameter("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f = "adResponseTracker";
            X3 x3 = X3.f6941a;
            C3582b0 c3582b0 = new C3582b0(this.u, telemetryOnAdImpression);
            Z9 z92 = this.i;
            Intrinsics.checkNotNullParameter(url, "url");
            Vh.a(Sh.f6852a, new P3(url, z92, c3582b0, null));
        }
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Short sh;
        Pair pair;
        Q0 features;
        boolean enableImmersive = this.c.getRendering().getEnableImmersive();
        boolean z = AbstractC3841k6.i;
        boolean a2 = (ad == null || (features = ad.getFeatures()) == null) ? false : features.a(false);
        boolean z2 = enableImmersive && z && a2;
        if (!z2) {
            StringBuilder sb = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!a2) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb.append(CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
            Intrinsics.checkNotNullParameter(bitSet, "bitSet");
            if (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2202;
            } else if (bitSet.get(0) && bitSet.get(1)) {
                sh = (short) 2200;
            } else if (bitSet.get(0) && bitSet.get(2)) {
                sh = (short) 2199;
            } else if (bitSet.get(1) && bitSet.get(2)) {
                sh = (short) 2201;
            } else if (bitSet.get(0)) {
                sh = (short) 2196;
            } else if (bitSet.get(1)) {
                sh = (short) 2197;
            } else {
                sh = bitSet.get(2) ? (short) 2198 : null;
            }
            short shortValue = sh != null ? sh.shortValue() : (short) -1;
            if (shortValue == -1) {
                pair = new Pair("Invalid Reason", (short) -1);
            } else {
                pair = new Pair(sb.toString(), Short.valueOf(shortValue));
            }
            String str = (String) pair.component1();
            short shortValue2 = ((Number) pair.component2()).shortValue();
            HashMap hashMap = new HashMap();
            hashMap.put("reason", str);
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(shortValue2));
            c("ImmersiveNotSupported", hashMap);
        }
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "Immersive support - config, device, adResponse - (" + enableImmersive + ServerSentEventKt.SPACE + z + ServerSentEventKt.SPACE + a2 + ")");
        }
        return z2;
    }

    public final void a(AbstractC3781i1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onAdDisplayed " + this);
        }
        AdMetaInfo k = k();
        if (k == null) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.b("n1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(listener);
            return;
        }
        Z9 z93 = this.i;
        if (z93 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z93.a("n1", "callback - onAdDisplayed");
        }
        listener.a(k);
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "handleAdFetchSuccessful " + this);
        }
        if (!this.k && o() != null) {
            if (this.b == 1) {
                this.m = adResponse;
                AdSet s = s();
                this.s = s != null ? s.getIsPod() : false;
                this.h = new CopyOnWriteArrayList();
                AdSet s2 = s();
                if (s2 != null && (ads = s2.getAds()) != null) {
                    for (com.inmobi.media.ads.network.common.model.Ad ad : ads) {
                        this.h.add(null);
                    }
                }
                G();
                return;
            }
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.b("n1", "incorrect state - " + ((int) this.b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        c((short) 2185);
        Z9 z93 = this.i;
        if (z93 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z93.b("n1", "adUnit is destroyed");
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.b == 1) {
                Z9 z92 = this.i;
                if (z92 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z92.b("n1", "Failed to fetch ad for placement id: " + this.l + ", reason - " + inMobiAdRequestStatus.getMessage());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                Z9 z93 = this.i;
                if (z93 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z93.b("n1", str);
                }
                Z9 z94 = this.i;
                if (z94 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z94.d("n1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s != 0) {
                    b(s);
                }
                AbstractC3781i1 n = n();
                if (n != null) {
                    n.a(inMobiAdRequestStatus);
                    return;
                }
                Z9 z95 = this.i;
                if (z95 != null) {
                    z95.a();
                }
            }
        } catch (Exception e) {
            Z9 z96 = this.i;
            if (z96 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z96.a("n1", "onAdFetchFailed with error: ", e);
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    public final void a(short s) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.b("n1", "handleAdShowFailure " + this + " errorCode - " + ((int) s));
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.d("n1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC3781i1 n = n();
        if (n != null) {
            n.b();
        }
        if (s != 0) {
            d(s);
        }
    }

    public final void a(InMobiAdRequestStatus requestStatus, boolean z, short s) {
        Intrinsics.checkNotNullParameter(requestStatus, "requestStatus");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.b("n1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s));
        }
        if (this.b == 3 && z) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.d("n1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3781i1 n = n();
        if (n != null) {
            n.a(this, requestStatus);
        }
        if (s != 0) {
            b(s);
        }
    }

    public final void a(Map map) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.l.c = map;
    }

    public static final Unit a(AbstractC3923n1 abstractC3923n1) {
        C4092t1 c4092t1 = abstractC3923n1.z;
        c4092t1.getClass();
        c4092t1.e = SystemClock.elapsedRealtime();
        abstractC3923n1.g();
        return Unit.INSTANCE;
    }

    public static final Unit a(AbstractC3923n1 abstractC3923n1, B6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                switch (ordinal) {
                    case 12:
                        s = 2101;
                        break;
                    case 13:
                        s = 2102;
                        break;
                    case 14:
                        s = 2103;
                        break;
                    case 15:
                        s = 2104;
                        break;
                    case 16:
                        s = 2105;
                        break;
                }
            } else {
                s = 2228;
            }
            abstractC3923n1.a(inMobiAdRequestStatus, true, s);
            return Unit.INSTANCE;
        }
        s = 2100;
        abstractC3923n1.a(inMobiAdRequestStatus, true, s);
        return Unit.INSTANCE;
    }

    public final void a(final Function0 onSuccess, final Function1 onMaxRetryReached) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onMaxRetryReached, "onMaxRetryReached");
        Z9 z9 = this.i;
        Object obj = null;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            C3677eb c3677eb = this.v;
            z9.c("n1", "loadWithRetry " + (c3677eb != null ? Integer.valueOf(c3677eb.b) : null));
        }
        C3677eb c3677eb2 = this.v;
        if (c3677eb2 != null) {
            B6 a2 = Sf.a();
            if (a2 == null) {
                obj = Lg.f6696a;
            } else {
                int i = c3677eb2.b + 1;
                c3677eb2.b = i;
                if (i >= c3677eb2.f7083a.b) {
                    obj = new Uc(a2);
                } else {
                    obj = Ii.f6629a;
                }
            }
        }
        if (obj instanceof Uc) {
            onMaxRetryReached.invoke(((Uc) obj).f6889a);
            return;
        }
        if (obj instanceof Lg) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.c("n1", "load with retry success");
            }
            onSuccess.invoke();
            return;
        }
        if (!(obj instanceof Ii)) {
            if (obj == null) {
                Z9 z93 = this.i;
                if (z93 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z93.c("n1", "shouldProceedToLoad result null. starting as if we have internet.");
                }
                onSuccess.invoke();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        Z9 z94 = this.i;
        if (z94 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z94.c("n1", "load failed, retrying");
        }
        this.x.postDelayed(new Runnable() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3923n1.a(AbstractC3923n1.this, onSuccess, onMaxRetryReached);
            }
        }, this.w != null ? r8.f7265a : 1000L);
    }

    public static final void a(AbstractC3923n1 abstractC3923n1, Function0 function0, Function1 function1) {
        Z9 z9 = abstractC3923n1.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            C3677eb c3677eb = abstractC3923n1.v;
            z9.c("n1", "Loading from retry Handler " + (c3677eb != null ? Integer.valueOf(c3677eb.b) : null));
        }
        abstractC3923n1.a(function0, function1);
    }

    public void a(byte[] bArr) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "load response " + this);
        }
        C4092t1 c4092t1 = this.z;
        c4092t1.getClass();
        c4092t1.c = SystemClock.elapsedRealtime();
        if (C()) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.a("n1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr != null && bArr.length != 0) {
            c((byte) 1);
            Z9 z93 = this.i;
            if (z93 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z93.d("n1", "AdUnit " + this + " state - LOADING");
            }
            this.g.a(this.f7257a, new C3865l1(bArr, this, null));
            return;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
        Z9 z94 = this.i;
        if (z94 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z94.a("n1", "null response. failing");
        }
    }

    public static final void a(AbstractC3923n1 abstractC3923n1, Z z) {
        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
        String str = "handleAdLoadFailureExceptionInWaterfall: " + z;
        W w = z.b;
        if (w instanceof C4248yk) {
            abstractC3923n1.getClass();
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3923n1.z.d)), TuplesKt.to("networkType", Y5.g()), TuplesKt.to("plId", Long.valueOf(abstractC3923n1.l.f7470a)));
            String str2 = abstractC3923n1.l.f;
            if (str2 != null) {
                mutableMapOf.put("plType", str2);
            }
            String str3 = abstractC3923n1.l.e;
            if (str3 != null) {
                mutableMapOf.put("adType", str3);
            }
            abstractC3923n1.b("ServerNoFill", mutableMapOf);
            abstractC3923n1.b(z.f6983a, (short) 0);
            return;
        }
        if (w instanceof C3842k7) {
            abstractC3923n1.b(z.f6983a, ((C3842k7) w).f7197a);
            return;
        }
        if (w instanceof C3871l7) {
            abstractC3923n1.b(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(((C3871l7) w).f7218a))));
            abstractC3923n1.b(z.f6983a, (short) 2205);
        } else {
            if (w instanceof C4194wk) {
                abstractC3923n1.b(((C4194wk) w).f7463a);
                abstractC3923n1.b(z.f6983a, (short) 0);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void a(AbstractC3923n1 abstractC3923n1, Ej ej) {
        abstractC3923n1.m(ej);
    }

    @Override // com.inmobi.media.Gj
    public final void a(final Ej renderView, final String errorCode) {
        Handler handler;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.k || o() == null || (handler = this.j) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3923n1.a(AbstractC3923n1.this, renderView, errorCode);
            }
        });
    }

    public static final void a(AbstractC3923n1 abstractC3923n1, Ej ej, String str) {
        abstractC3923n1.a(ej, (short) 2137, str);
    }

    public void a(Ej ej, short s, String failureErrorCode) {
        Intrinsics.checkNotNullParameter(failureErrorCode, "failureErrorCode");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.b("n1", "Render view signaled ad failed, for index " + this.h.indexOf(ej) + ServerSentEventKt.SPACE + this);
        }
        if (ej == null || !Intrinsics.areEqual(ej.getMarkupType(), "htmlUrl")) {
            return;
        }
        b(ej, failureErrorCode);
    }

    @Override // com.inmobi.media.Gj
    public final void a(HashMap rewards, Oj oj) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onAdRewardActionCompleted " + this);
        }
        C4092t1 c4092t1 = this.z;
        c4092t1.getClass();
        c4092t1.j = SystemClock.elapsedRealtime();
        if (this.k) {
            if (oj != null) {
                oj.a((short) 2425);
            }
        } else {
            if (o() == null) {
                if (oj != null) {
                    oj.a((short) 2428);
                    return;
                }
                return;
            }
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.a("n1", "Ad reward action completed. Params:" + rewards);
            }
            AbstractC3781i1 n = n();
            if (n != null) {
                n.a(rewards, oj);
            }
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onAdInteraction " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.a("n1", "Ad interaction. Params: " + params);
        }
        AbstractC3781i1 n = n();
        if (n != null) {
            n.a(params);
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(final C4113tm telemetryOnAdImpression) {
        C4142um c4142um;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onImpressionFiredFromTemplate " + this);
        }
        telemetryOnAdImpression.getClass();
        Intrinsics.checkNotNullParameter("imraid_impressionFired", "<set-?>");
        telemetryOnAdImpression.f = "imraid_impressionFired";
        if (!this.k && o() != null) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.a("n1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.inmobi.media.n1$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3923n1.a(AbstractC3923n1.this, telemetryOnAdImpression);
                    }
                });
                return;
            }
            return;
        }
        C4092t1 c4092t1 = telemetryOnAdImpression.f7400a;
        if (c4092t1 == null || (c4142um = c4092t1.b) == null || (atomicBoolean = c4142um.f7419a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a2 = telemetryOnAdImpression.a();
            a2.put("networkType", Y5.g());
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2180);
            String str = telemetryOnAdImpression.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("AdImpressionSuccessful", a2, EnumC3944nm.f7271a);
        }
    }

    public static final void a(AbstractC3923n1 abstractC3923n1, C4113tm c4113tm) {
        abstractC3923n1.u.a(c4113tm);
    }

    @Override // com.inmobi.media.Gj, com.inmobi.media.InterfaceC3917mn
    public final void a() {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onUserLeaveApplication " + this);
        }
        if (this.k || o() == null) {
            return;
        }
        Z9 z92 = this.i;
        if (z92 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z92.a("n1", "User left application");
        }
        AbstractC3781i1 n = n();
        if (n != null) {
            n.e();
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, Map map) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad != null) {
            map.put("creativeId", ad.getCreativeId());
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(String eventType, HashMap kv) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "onRenderViewRequestedAction " + this);
        }
        c(eventType, kv);
    }

    public final void a(String str, Map map) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C3677eb c3677eb = this.v;
        if (c3677eb != null) {
            map.put("retryCount", Integer.valueOf(c3677eb.b));
        }
    }

    public final void a(Ej ej, LinkedHashSet linkedHashSet) {
        AdConfig.ViewabilityConfig viewability;
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "omidSessionForHtmlMarkup " + this);
        }
        AdConfig adConfig = this.c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Fg.f6559a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    Jm jm = (Jm) it.next();
                    if (3 == jm.f6656a) {
                        try {
                            Intrinsics.checkNotNullParameter("creativeType", "key");
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj = jm.b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            Intrinsics.checkNotNullParameter("customReferenceData", "key");
                            Intrinsics.checkNotNullParameter(String.class, "classType");
                            Object obj2 = jm.b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            Intrinsics.checkNotNullParameter("isolateVerificationScripts", "key");
                            Intrinsics.checkNotNullParameter(Boolean.class, "classType");
                            Object obj3 = jm.b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            Intrinsics.checkNotNullParameter("impressionType", "key");
                            Intrinsics.checkNotNullParameter(Byte.class, "classType");
                            Object obj4 = jm.b.get("impressionType");
                            Byte b = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            C3880lg a2 = (str == null || bool == null || b == null) ? null : AbstractC4190wg.a(str, ej, bool.booleanValue(), this.l.m, b.byteValue(), str2);
                            if (a2 != null) {
                                jm.b.put("omidAdSession", a2);
                                jm.b.put("deferred", Boolean.TRUE);
                                Z9 z92 = this.i;
                                if (z92 != null) {
                                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                                    z92.a("n1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                Z9 z93 = this.i;
                                if (z93 != null) {
                                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                                    z93.a("n1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e) {
                            Z9 z94 = this.i;
                            if (z94 != null) {
                                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                                z94.b("n1", "Setting up impression tracking for IAB encountered an unexpected error: " + e.getMessage());
                            }
                            Lazy lazy = Ba.f6473a;
                            U9.a(e);
                        }
                    }
                }
            }
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad, String str) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "updateAdForBlob " + this);
        }
        ad.setWebVast(str);
        b(ad);
    }

    public final void a(String blob, String str) {
        Intrinsics.checkNotNullParameter(blob, "blob");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "saveBlob " + this);
        }
        this.g.a(this.f7257a, new C3895m1(this, str, blob, null));
    }

    public final void a(String jsCallbackNamespace, String callback, InterfaceC3614c3 receiver, String str) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "getBlob " + this);
        }
        this.g.a(this.f7257a, new C3836k1(this, str, receiver, jsCallbackNamespace, callback, null));
    }

    public void a(int i, Ej renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "Show pod ad with index : " + i + " from creative: " + this.h.indexOf(renderView) + ServerSentEventKt.SPACE + this);
        }
        if (i >= 0) {
            this.p = i;
        } else {
            this.p++;
        }
    }

    public void a(Ej renderView, Activity activity) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "closeCurrentPodAd " + this);
        }
    }

    public boolean a(Ej renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Z9 z9 = this.i;
        if (z9 == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue("n1", "TAG");
        z9.c("n1", "hasNextAdInAdPod " + this);
        return false;
    }

    public void a(byte b) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "onTimeOut " + this);
        }
        if (b == 0) {
            Z9 z92 = this.i;
            if (z92 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z92.a("n1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.b));
            }
            if (this.b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b != 2 && b != 1) {
            if (b == 4) {
                Z9 z93 = this.i;
                if (z93 != null) {
                    Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                    z93.a("n1", "Show RequestTimeOut by show timer");
                }
                AbstractC3781i1 n = n();
                if (n != null) {
                    n.d();
                    return;
                }
                return;
            }
            Z9 z94 = this.i;
            if (z94 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z94.a("n1", "Unknown TimeOut ignored");
                return;
            }
            return;
        }
        Z9 z95 = this.i;
        if (z95 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z95.a("n1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.b));
        }
        if (this.b != 3) {
            this.x.removeCallbacksAndMessages(null);
            Z9 z96 = this.i;
            if (z96 != null) {
                Intrinsics.checkNotNullExpressionValue("n1", "TAG");
                z96.a("n1", "adUnitEventListener=" + n() + ", Adstate=" + ((int) this.b));
            }
            if (2 == this.b) {
                L();
                i();
                c(Sf.a() == null ? (short) 2139 : (short) 2203);
                AbstractC3781i1 n2 = n();
                if (n2 != null) {
                    n2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == this.b) {
                L();
                c((short) 2138);
                AbstractC3781i1 n3 = n();
                if (n3 != null) {
                    n3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public final void a(EnumC4149v2 mode, long j) {
        Tp viewableAd;
        String str;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "onDetachAbandon " + mode + ServerSentEventKt.SPACE + this);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Ej ej = (Ej) it.next();
            if (ej != null && (viewableAd = ej.getViewableAd()) != null && viewableAd.d()) {
                EnumC4149v2 enumC4149v2 = EnumC4149v2.c;
                if (mode == enumC4149v2) {
                    J();
                }
                if (this.D) {
                    return;
                }
                this.D = true;
                if (mode == enumC4149v2) {
                    str = "BannerDetachReleased";
                } else {
                    str = "BannerDetachObserved";
                }
                a(str, j);
                return;
            }
        }
    }

    public final void a(String eventType, long j) {
        String str;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.c("n1", "submitBannerDetachEvent " + eventType + ServerSentEventKt.SPACE + this);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(j));
        hashMap.put("markupType", t());
        com.inmobi.media.ads.network.common.model.Ad q = q();
        if (q == null || (str = q.getImpressionId()) == null) {
            str = "";
        }
        hashMap.put("impressionId", str);
        if (y().length() > 0) {
            hashMap.put("metadataBlob", y());
        }
        b(hashMap);
        a(q(), hashMap);
        c(eventType, hashMap);
    }

    public final void a(int i, boolean z) {
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "Destroying container for index " + i + ServerSentEventKt.SPACE + this);
        }
        CopyOnWriteArrayList list = this.h;
        Intrinsics.checkNotNullParameter(list, "list");
        if (i < 0 || i >= list.size()) {
            return;
        }
        Ej ej = (Ej) this.h.get(i);
        if (ej != null) {
            ej.K0.set(z);
            ej.stopLoading();
            ej.b();
        }
        this.h.set(i, null);
    }

    public final void a(Ej ej, Integer num, int i) {
        int intValue;
        if (ej != null) {
            intValue = this.h.indexOf(ej);
        } else if (num == null) {
            return;
        } else {
            intValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(intValue);
        if (b != null) {
            Iterator it = AbstractC3574ak.a(b, "pod_abort").iterator();
            while (it.hasNext()) {
                String url = StringsKt.replace$default(StringsKt.replace$default((String) it.next(), "$PODINDEX", String.valueOf(intValue), false, 4, (Object) null), "$REASON", String.valueOf(i), false, 4, (Object) null);
                X3 x3 = X3.f6941a;
                Z9 z9 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                X3.a(url, true, z9);
            }
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(Ej renderView, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Z9 z9 = this.i;
        if (z9 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z9.a("n1", "fireLandingPageTracker " + trackerName + ServerSentEventKt.SPACE + this);
        }
        com.inmobi.media.ads.network.common.model.Ad b = b(this.h.indexOf(renderView));
        if (b != null) {
            for (String str : AbstractC3574ak.a(b, trackerName)) {
                String url = str;
                for (Map.Entry entry : macros.entrySet()) {
                    url = StringsKt.replace$default(url, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                }
                X3 x3 = X3.f6941a;
                Z9 z92 = this.i;
                Intrinsics.checkNotNullParameter(url, "url");
                X3.a(url, true, z92);
            }
            return;
        }
        Z9 z93 = this.i;
        if (z93 != null) {
            Intrinsics.checkNotNullExpressionValue("n1", "TAG");
            z93.a("n1", "fireLandingPageTracker failed");
        }
    }

    @Override // com.inmobi.media.Gj
    public final void a(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        AbstractC3781i1 n = n();
        if (n != null) {
            n.a(log);
        }
    }

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        return ((Fq) this.E.getValue()).a(i, d);
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        return ((Fq) this.E.getValue()).a(d);
    }
}
