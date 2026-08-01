package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import com.facebook.internal.AnalyticsEvents;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d implements q0, h0, i7 {
    public static final b l = new b(null);
    public static final AtomicBoolean m = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f4718a;
    public final g0 b;
    public final o0 c;
    public final AtomicReference d;
    public final ScheduledExecutorService e;
    public final e f;
    public final sg g;
    public final f2 h;
    public final Function0 i;
    public Ad j;
    public AdCallback k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b = new a("OS_VERSION_TOO_LOW", 0);
        public static final a c = new a("PUBLISHER_DISABLED", 1);
        public static final a d = new a("INVALID_LOCATION", 2);
        public static final /* synthetic */ a[] e;
        public static final /* synthetic */ EnumEntries f;

        /* renamed from: com.chartboost.sdk.impl.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0210a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4719a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4719a = iArr;
            }
        }

        static {
            a[] a2 = a();
            e = a2;
            f = EnumEntriesKt.enumEntries(a2);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, c, d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        public final CacheError.Code b() {
            int i = C0210a.f4719a[ordinal()];
            if (i == 1) {
                return CacheError.Code.DISABLED;
            }
            if (i == 2 || i == 3) {
                return CacheError.Code.SESSION_NOT_STARTED;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final ShowError.Code c() {
            int i = C0210a.f4719a[ordinal()];
            if (i == 1) {
                return ShowError.Code.DISABLED;
            }
            if (i == 2 || i == 3) {
                return ShowError.Code.SESSION_NOT_STARTED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AtomicBoolean a() {
            return d.m;
        }

        public final void b() {
            if (a().compareAndSet(false, true)) {
                mb.b("Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .", (Throwable) null, 2, (Object) null);
            }
        }

        public b() {
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4720a;

        static {
            int[] iArr = new int[CBError.Impression.values().length];
            try {
                iArr[CBError.Impression.ASSET_MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CBError.Impression.ASSETS_DOWNLOAD_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CBError.Impression.ASSET_PREFETCH_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CBError.Impression.WEB_VIEW_PAGE_LOAD_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CBError.Impression.ERROR_LOADING_WEB_VIEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f4720a = iArr;
        }
    }

    /* renamed from: com.chartboost.sdk.impl.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C0211d extends FunctionReferenceImpl implements Function2 {
        public C0211d(Object obj) {
            super(2, obj, d.class, "onAdFailToLoad", "onAdFailToLoad(Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/CBError$Type;)V", 0);
        }

        public final void a(String str, CBError.Type p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((d) this.receiver).a(str, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (CBError.Type) obj2);
            return Unit.INSTANCE;
        }
    }

    public d(g0 adUnitLoader, o0 adUnitRenderer, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, e adApiCallbackSender, sg session, f2 base64Wrapper, i7 eventTracker, Function0 androidVersion) {
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f4718a = eventTracker;
        this.b = adUnitLoader;
        this.c = adUnitRenderer;
        this.d = sdkConfig;
        this.e = backgroundExecutorService;
        this.f = adApiCallbackSender;
        this.g = session;
        this.h = base64Wrapper;
        this.i = androidVersion;
    }

    public final void b() {
        if (c()) {
            this.b.b();
        }
    }

    public final boolean c() {
        p1 a2 = this.b.a();
        return (a2 != null ? a2.a() : null) != null;
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4718a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4718a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void d(String str) {
        this.f.c(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void e(String str) {
        a(g.i.d, "", str);
        d();
        this.f.a(str, (ShowError) null, this.j, this.k);
    }

    public final TrackAd f(String str) {
        if (str == null) {
            str = "";
        }
        return new TrackAd(null, null, str, null, null, null, null, null, 251, null);
    }

    public final a g(String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (((Number) this.i.invoke()).intValue() < 21) {
            return a.b;
        }
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.d.get();
        if (aVar != null && aVar.g()) {
            l.b();
            return a.c;
        }
        if (location.length() == 0) {
            return a.d;
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4718a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f4718a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f4718a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4718a.track(fVar);
    }

    public final void a(final String location, final Ad ad, AdCallback callback, String str) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.j = ad;
        this.k = callback;
        Object a2 = h.f4785a.a(str, this.h, new C0211d(this));
        if (Result.m8082exceptionOrNullimpl(a2) == null) {
            final String str2 = (String) a2;
            this.e.execute(new Runnable() { // from class: com.chartboost.sdk.impl.d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    d.a(Ad.this, this, location, str2);
                }
            });
        }
    }

    @Override // com.chartboost.sdk.impl.q0
    public void c(String str) {
        a(g.f.g, "", str);
        this.f.b(str, this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4718a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4718a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4718a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f4718a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4718a.mo4759track(event);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void b(String str) {
        this.f.a(str, (ClickError) null, this.j, this.k);
    }

    public final void d() {
        c0 a2;
        Ad ad = this.j;
        if (ad == null || (a2 = t.a(ad)) == null) {
            return;
        }
        this.g.a(a2);
        mb.c("Current session impression count: " + this.g.b(a2) + " in session: " + this.g.b(), null, 2, null);
    }

    @Override // com.chartboost.sdk.impl.h0
    public void b(String str, com.chartboost.sdk.tracking.g trackingEventName) {
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        a(trackingEventName, "", str);
        this.f.a(str, (CacheError) null, this.j, this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Ad ad, d dVar, String str, String str2) {
        if (ad instanceof Banner) {
            ViewGroup viewGroup = (ViewGroup) ad;
            Banner banner = (Banner) ad;
            dVar.b.a(str, dVar, str2, new e0(viewGroup, banner.getBannerWidth(), banner.getBannerHeight()));
            return;
        }
        g0.a(dVar.b, str, dVar, str2, null, 8, null);
    }

    public final void a(Ad ad, AdCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.j = ad;
        this.k = callback;
        this.e.execute(new Runnable() { // from class: com.chartboost.sdk.impl.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                d.a(d.this);
            }
        });
    }

    public static final void a(d dVar) {
        p1 a2 = dVar.b.a();
        if (a2 != null) {
            dVar.c.a(a2, dVar);
        } else {
            mb.b("Missing app request on render", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str, String str2, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String str3 = "Click error: " + error.name() + " url: " + str2;
        a(g.b.e, str3, str);
        this.f.a(str, q.a(error, str3), this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str, CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(error, str);
        this.f.a(str, q.a(error), this.j, this.k);
    }

    public final void a(CBError.Impression impression, String str) {
        g.i iVar;
        switch (c.f4720a[impression.ordinal()]) {
            case 1:
            case 2:
            case 3:
                iVar = g.i.f;
                break;
            case 4:
            case 5:
            case 6:
                iVar = g.i.j;
                break;
            default:
                iVar = g.i.e;
                break;
        }
        a(iVar, impression.name(), str);
    }

    @Override // com.chartboost.sdk.impl.h0
    public void a(String str, CBError.Type error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(g.a.f, error.getName(), str);
        this.f.a(str, q.a(error), this.j, this.k);
    }

    @Override // com.chartboost.sdk.impl.h0
    public void a(String bidResponse, com.chartboost.sdk.tracking.g trackingEventName) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        a(trackingEventName, "", (String) null);
        Ad ad = this.j;
        if (ad != null) {
            ad.cache(bidResponse);
        }
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str, int i) {
        this.f.a(str, this.j, this.k, i);
    }

    @Override // com.chartboost.sdk.impl.q0
    public void a(String str) {
        this.f.a(str, this.j, this.k);
    }

    public final void a(com.chartboost.sdk.tracking.g eventName, String message, c0 adType, String location) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.e(eventName, message, adType.b(), location, this.c.F(), null, 32, null));
    }

    public final void a(com.chartboost.sdk.tracking.g gVar, String str, String str2) {
        String str3;
        String str4;
        com.chartboost.sdk.tracking.f eVar;
        c0 a2;
        Ad ad = this.j;
        if (ad == null || (a2 = t.a(ad)) == null || (str3 = a2.b()) == null) {
            str3 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        String str5 = str3;
        Ad ad2 = this.j;
        if (ad2 == null || (str4 = ad2.getLocation()) == null) {
            str4 = "";
        }
        String str6 = str4;
        if (gVar == g.b.e) {
            eVar = new com.chartboost.sdk.tracking.a(gVar, str, str5, str6, this.c.F(), f(str2));
        } else {
            eVar = new com.chartboost.sdk.tracking.e(gVar, str, str5, str6, this.c.F(), f(str2));
        }
        track(eVar);
    }
}
