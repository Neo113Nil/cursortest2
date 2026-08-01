package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.ironsource.U3;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.AdConfig;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.InvalidCTAUrl;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.TpatError;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.model.d1;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.model.q1;
import com.vungle.ads.internal.model.w2;
import com.vungle.ads.internal.model.y1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes7.dex */
public final class r implements com.vungle.ads.internal.ui.view.n, com.vungle.ads.internal.ui.view.o {

    /* renamed from: a, reason: collision with root package name */
    public final com.vungle.ads.internal.ui.view.j f12100a;
    public final i0 b;
    public final j3 c;
    public final com.vungle.ads.internal.ui.z d;
    public Executor e;
    public final com.vungle.ads.internal.omsdk.e f;
    public final com.vungle.ads.internal.platform.f g;
    public long h;
    public a i;
    public boolean j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public Long m;
    public String n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public z s;
    public y t;
    public final Lazy u;
    public final Lazy v;
    public boolean w;
    public final Lazy x;
    public long y;
    public static final Set z = SetsKt.setOf((Object[]) new String[]{"open", "openNonMraid", "openAppStore", "openPrivacy"});
    public static final Map A = MapsKt.mapOf(TuplesKt.to("checkpoint.0", Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), TuplesKt.to("clickUrl", Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    public r(com.vungle.ads.internal.ui.view.j adWidget, i0 advertisement, j3 placement, com.vungle.ads.internal.ui.z vungleWebClient, com.vungle.ads.internal.executor.j executor, com.vungle.ads.internal.omsdk.e omTracker, com.vungle.ads.internal.platform.f platform) {
        Intrinsics.checkNotNullParameter(adWidget, "adWidget");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(omTracker, "omTracker");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.f12100a = adWidget;
        this.b = advertisement;
        this.c = placement;
        this.d = vungleWebClient;
        this.e = executor;
        this.f = omTracker;
        this.g = platform;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        Context context = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        this.o = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new n(context));
        Context context2 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
        this.p = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new o(context2));
        Context context3 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "adWidget.context");
        this.q = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new p(context3));
        Context context4 = adWidget.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        this.r = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new q(context4));
        this.u = LazyKt.lazy(m.f12095a);
        this.v = LazyKt.lazy(new j(this));
        this.x = LazyKt.lazy(new d(this));
    }

    public final com.vungle.ads.internal.network.r c() {
        return (com.vungle.ads.internal.network.r) this.r.getValue();
    }

    public final void d() {
        if (this.w) {
            this.f12100a.a("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final void e() {
        Boolean bool;
        a aVar = this.i;
        if (aVar != null) {
            aVar.a("successfulView", null, this.c.f11983a);
        }
        if (this.c.j()) {
            ConfigManager.INSTANCE.getClass();
            w2 w2Var = ConfigManager.f11882a;
            if (!((w2Var == null || (bool = w2Var.i) == null) ? false : bool.booleanValue()) || this.l.getAndSet(true)) {
                return;
            }
            this.e.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.r$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    r.d(r.this);
                }
            });
        }
    }

    public final void f() {
        a((VungleError) new WebViewRenderProcessUnresponsive("fatal=true"), true, (String) null);
    }

    public final void g() {
        this.d.a();
    }

    public final void h() {
        String str;
        String str2;
        String str3;
        String str4;
        IndexHtmlError indexHtmlError;
        int b;
        boolean z2 = false;
        this.k.set(false);
        AdConfig j = this.b.j();
        if (j != null && (b = j.getB()) > 0) {
            this.w = (b & 2) == 2;
        }
        AdConfig j2 = this.b.j();
        Integer valueOf = j2 != null ? Integer.valueOf(j2.getAdOrientation()) : null;
        this.f12100a.setOrientation((valueOf != null && valueOf.intValue() == 0) ? 7 : (valueOf != null && valueOf.intValue() == 1) ? 6 : 4);
        this.f.a();
        this.d.a((com.vungle.ads.internal.ui.view.n) this);
        this.d.a((com.vungle.ads.internal.ui.view.o) this);
        this.d.b(false);
        if (!this.b.H()) {
            String str5 = this.b.i;
            File file = str5 != null ? new File(str5) : null;
            if (file == null || !file.exists()) {
                indexHtmlError = new IndexHtmlError(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD, com.iab.omid.library.vungle.internal.l.a("Fail to load html ").append(file != null ? file.getPath() : null).toString());
            } else {
                this.f12100a.a(this.d, this.b.v());
                this.f12100a.a(com.iab.omid.library.vungle.internal.l.a("file://").append(file.getPath()).toString());
                indexHtmlError = null;
            }
            if (indexHtmlError != null) {
                indexHtmlError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(indexHtmlError, this.c.f11983a);
                }
                a();
                return;
            }
        }
        this.m = Long.valueOf(System.currentTimeMillis());
        z zVar = this.s;
        this.n = zVar != null ? ((r1) zVar).r() : null;
        z zVar2 = this.s;
        if (zVar2 == null || (str = ((r1) zVar2).q()) == null) {
            str = "";
        }
        z zVar3 = this.s;
        if (zVar3 == null || (str2 = ((r1) zVar3).n()) == null) {
            str2 = "";
        }
        z zVar4 = this.s;
        if (zVar4 == null || (str3 = ((r1) zVar4).p()) == null) {
            str3 = "";
        }
        z zVar5 = this.s;
        if (zVar5 == null || (str4 = ((r1) zVar5).o()) == null) {
            str4 = "";
        }
        this.b.a(str, str2, str3, str4);
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.m()) {
            PrivacyManager.INSTANCE.getClass();
            if (Intrinsics.areEqual("unknown", PrivacyManager.b())) {
                z2 = true;
            }
        }
        this.d.a(z2, ConfigManager.l(), ConfigManager.k(), ConfigManager.i(), ConfigManager.j());
        if (z2) {
            PrivacyManager.INSTANCE.getClass();
            PrivacyManager.a("opted_out_by_timeout", "vungle_modal", "");
        }
        int a2 = this.b.a(Boolean.valueOf(this.c.j()));
        if (a2 > 0) {
            ((com.vungle.ads.internal.util.o) this.u.getValue()).a(new Runnable() { // from class: com.vungle.ads.internal.presenter.r$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    r.e(r.this);
                }
            }, a2);
        } else {
            this.w = true;
        }
        a aVar2 = this.i;
        if (aVar2 != null) {
            aVar2.a("start", null, this.c.b());
        }
    }

    public final void i() {
        Long l = this.m;
        if (l != null) {
            List b = this.b.b("ad.close", String.valueOf(System.currentTimeMillis() - l.longValue()), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.p pVar = new com.vungle.ads.internal.network.p((String) it.next());
                    pVar.i = "ad.close";
                    pVar.j = b();
                    c().a(pVar.a(), false);
                }
            }
        }
    }

    public final boolean j() {
        y1 y1Var;
        Long l;
        y1 y1Var2;
        Boolean bool;
        ConfigManager configManager = ConfigManager.INSTANCE;
        configManager.getClass();
        w2 w2Var = ConfigManager.f11882a;
        if ((w2Var == null || (y1Var2 = w2Var.q) == null || (bool = y1Var2.f12030a) == null) ? false : bool.booleanValue()) {
            return false;
        }
        if (this.h == 0) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        configManager.getClass();
        w2 w2Var2 = ConfigManager.f11882a;
        return currentTimeMillis > ((w2Var2 == null || (y1Var = w2Var2.q) == null || (l = y1Var.b) == null) ? Long.MAX_VALUE : l.longValue());
    }

    public static final void c(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i();
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    public final com.vungle.ads.internal.util.s b() {
        return (com.vungle.ads.internal.util.s) this.v.getValue();
    }

    public final void a(z zVar) {
        this.s = zVar;
    }

    public static final void d(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String b = this$0.c.b();
        com.vungle.ads.internal.network.m a2 = ((VungleApiClient) this$0.o.getValue()).a(new q1((List) null, this$0.m, this$0.b.e(), b, this$0.n, (d1) null, 67));
        if (a2 == null) {
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("MRAIDPresenter", "Invalid ri call.");
            new NetworkUnreachable(com.iab.omid.library.vungle.internal.l.a("Error RI API for placement: ").append(this$0.c.b()).toString()).setLogEntry$vungle_ads_release(this$0.b()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        a2.a(new h(this$0));
    }

    public final void a(com.vungle.ads.internal.ui.k kVar) {
        this.t = kVar;
    }

    public final void a(int i) {
        long j;
        AdSession adSession;
        a aVar;
        boolean z2 = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", "detach()");
        boolean z3 = (i & 1) != 0;
        boolean z4 = (i & 2) != 0;
        com.vungle.ads.internal.ui.z zVar = this.d;
        zVar.q = null;
        zVar.o = null;
        if (!z3 && z4 && !this.k.getAndSet(true) && (aVar = this.i) != null) {
            aVar.a("end", null, this.c.f11983a);
        }
        com.vungle.ads.internal.omsdk.e eVar = this.f;
        if (!eVar.b || (adSession = eVar.c) == null) {
            j = 0;
        } else {
            adSession.finish();
            j = com.vungle.ads.internal.omsdk.e.d;
        }
        eVar.b = false;
        eVar.c = null;
        this.f12100a.a(j);
    }

    public static final void e(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w = true;
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "user interaction");
            this.h = System.currentTimeMillis();
            ((p0) this.x.getValue()).a(motionEvent);
        }
    }

    public final void a() {
        if (com.vungle.ads.internal.util.y.a()) {
            this.e.execute(new Runnable() { // from class: com.vungle.ads.internal.presenter.r$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    r.c(r.this);
                }
            });
        } else {
            i();
        }
        com.vungle.ads.internal.util.y.a(new e(this));
    }

    public final void a(String str) {
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new k(this));
        k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
        k2Var.c = 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.a(k2Var, b(), str);
        analyticsClient.c(Sdk.SDKError.Reason.INLINE_INSTALL_ERROR, String.valueOf(str), b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024d, code lost:
    
        if (r17.equals("openNonMraid") == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0239, code lost:
    
        if (r17.equals("open") == false) goto L251;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String command, JsonObject arguments) {
        int i;
        Integer intOrNull;
        Object m8079constructorimpl;
        String str;
        long j;
        boolean a2;
        a aVar;
        List a3;
        Sdk.SDKError.Reason reason;
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        boolean z2 = true;
        Map map = null;
        switch (command.hashCode()) {
            case -1988620632:
                if (command.equals("detectBlackScreen")) {
                    String a4 = com.vungle.ads.internal.util.r.a("samplingFactor", arguments);
                    if (a4 != null && (intOrNull = StringsKt.toIntOrNull(a4)) != null) {
                        Integer num = intOrNull.intValue() > 0 ? intOrNull : null;
                        if (num != null) {
                            i = num.intValue();
                            this.d.a(i);
                            return;
                        }
                    }
                    i = 100;
                    this.d.a(i);
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -1912374177:
                if (command.equals("successfulView")) {
                    e();
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -1422950858:
                if (command.equals("action")) {
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -735200587:
                if (command.equals("actionWithValue")) {
                    String a5 = com.vungle.ads.internal.util.r.a(NotificationCompat.CATEGORY_EVENT, arguments);
                    String a6 = com.vungle.ads.internal.util.r.a("value", arguments);
                    if (StringsKt.equals(HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, a5, true)) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(a6 != null ? Long.valueOf(Long.parseLong(a6)) : null);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        }
                        Long l = (Long) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
                        this.y = l != null ? l.longValue() : 0L;
                        return;
                    }
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -660787472:
                if (command.equals("consentAction")) {
                    String a7 = com.vungle.ads.internal.util.r.a(NotificationCompat.CATEGORY_EVENT, arguments);
                    PrivacyConsent privacyConsent = PrivacyConsent.OPT_OUT;
                    String value = Intrinsics.areEqual(a7, privacyConsent.getValue()) ? privacyConsent.getValue() : PrivacyConsent.OPT_IN.getValue();
                    PrivacyManager.INSTANCE.getClass();
                    PrivacyManager.a(value, "vungle_modal", null);
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -649897046:
                if (command.equals("openAppStore")) {
                    com.vungle.ads.internal.model.i c = this.b.c();
                    String a8 = c != null ? c.a() : null;
                    String a9 = com.vungle.ads.internal.util.r.a("url", arguments);
                    if (!com.vungle.ads.internal.util.n.a(a9)) {
                        new InvalidCTAUrl("Invalid InlineInstall Url (" + a9 + ')').setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                    }
                    Context context = this.f12100a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
                    boolean a10 = com.vungle.ads.internal.util.l.a(a8, null, context, b(), new f(a8, this));
                    if (a10) {
                        z2 = a10;
                    } else {
                        if ((a9 == null || a9.length() == 0) != false) {
                            a("url: " + a9 + ", message: url is null/empty");
                        } else {
                            Uri parse = Uri.parse(a9);
                            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                            Intent intent = new Intent("android.intent.action.VIEW", parse);
                            intent.setPackage("com.android.vending");
                            if (!(this.f12100a.getContext() instanceof Activity)) {
                                intent.addFlags(268435456);
                            }
                            if (intent.resolveActivity(this.f12100a.getContext().getPackageManager()) == null) {
                                a("url: " + a9 + ", message: play store not installed");
                            } else {
                                y yVar = this.t;
                                Pair a11 = yVar != null ? ((com.vungle.ads.internal.ui.k) yVar).a(intent) : new Pair(Boolean.FALSE, null);
                                boolean booleanValue = ((Boolean) a11.component1()).booleanValue();
                                String str2 = (String) a11.component2();
                                if (!booleanValue) {
                                    a("url: " + a9 + ", message: " + str2);
                                } else {
                                    String a12 = com.iab.omid.library.vungle.d.a("url: ", a9);
                                    k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                                    k2Var.c = 1L;
                                    AnalyticsClient.INSTANCE.a(k2Var, b(), a12);
                                }
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        this.h = 0L;
                        a aVar2 = this.i;
                        if (aVar2 != null) {
                            aVar2.a("open", "adClick", this.c.b());
                        }
                        a aVar3 = this.i;
                        if (aVar3 != null) {
                            aVar3.a("open", "adLeftApplication", this.c.b());
                            return;
                        }
                        return;
                    }
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -568000867:
                if (command.equals("pingUrl")) {
                    String a13 = com.vungle.ads.internal.util.r.a("requestType", arguments);
                    if (a13 != null) {
                        str = a13.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    } else {
                        str = null;
                    }
                    if (!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"GET", "POST"}), str)) {
                        new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, "Invalid request type: " + str + ". Only 'GET' and 'POST' are supported").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    String a14 = com.vungle.ads.internal.util.r.a("url", arguments);
                    String a15 = com.vungle.ads.internal.util.r.a("requestData", arguments);
                    boolean parseBoolean = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a("retry", arguments));
                    String a16 = com.vungle.ads.internal.util.r.a("headers", arguments);
                    if (a16 != null) {
                        try {
                            Json.Companion companion3 = Json.INSTANCE;
                            KSerializer<Object> serializer = SerializersKt.serializer(companion3.getSerializersModule(), Reflection.typeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class))));
                            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                            map = (Map) companion3.decodeFromString(serializer, a16);
                        } catch (Exception unused) {
                            new TpatError(Sdk.SDKError.Reason.TPAT_ERROR, com.iab.omid.library.vungle.d.a("Failed to decode header: ", a16)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            return;
                        }
                    }
                    if (!com.vungle.ads.internal.util.z.a(a14)) {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "URL is missing in params from a template for generic tpat").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    if (a14 != null) {
                        com.vungle.ads.internal.network.p a17 = new com.vungle.ads.internal.network.p(a14).a(map).a(a15).a(parseBoolean).b("pingUrl").a(b());
                        if (Intrinsics.areEqual(str, "GET")) {
                            a17.b();
                        } else {
                            a17.c();
                        }
                        c().a(a17.a(), false);
                        return;
                    }
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -511324706:
                if (command.equals("openPrivacy")) {
                    String a18 = com.vungle.ads.internal.util.r.a("url", arguments);
                    if (j()) {
                        this.h = 0L;
                        a("openPrivacy", a18, true);
                        return;
                    }
                    if (a18 == null || a18.length() == 0) {
                        j = 0;
                    } else {
                        if (com.vungle.ads.internal.util.n.a(a18)) {
                            this.h = 0L;
                            AnalyticsClient.a(AnalyticsClient.INSTANCE, new k2(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), b(), 4);
                            Context context2 = this.f12100a.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "adWidget.context");
                            a2 = com.vungle.ads.internal.util.l.a(null, a18, context2, b(), null);
                            if (a2) {
                                a aVar4 = this.i;
                                if (aVar4 != null) {
                                    aVar4.a("open", "adLeftApplication", this.c.b());
                                    return;
                                }
                                return;
                            }
                            new PrivacyUrlError(com.iab.omid.library.vungle.d.a("Failed to launch privacy url: ", a18)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                            return;
                        }
                        j = 0;
                    }
                    this.h = j;
                    StringBuilder a19 = com.iab.omid.library.vungle.internal.l.a("Invalid privacy url: ");
                    if (a18 == null) {
                        a18 = "nonePrivacyUrl";
                    }
                    new PrivacyUrlError(a19.append(a18).toString()).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case -418575596:
                break;
            case -348095344:
                if (command.equals("useCustomPrivacy")) {
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case 3417674:
                break;
            case 3566511:
                if (command.equals("tpat")) {
                    String a20 = com.vungle.ads.internal.util.r.a(NotificationCompat.CATEGORY_EVENT, arguments);
                    if (a20 == null || a20.length() == 0) {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    Sdk.SDKMetric.SDKMetricType sDKMetricType = (Sdk.SDKMetric.SDKMetricType) A.get(a20);
                    if (sDKMetricType != null) {
                        AnalyticsClient.a(AnalyticsClient.INSTANCE, new k2(sDKMetricType), b(), 4);
                    }
                    if (Intrinsics.areEqual(a20, "checkpoint.0")) {
                        a3 = this.b.b(a20, ((com.vungle.ads.internal.platform.c) this.g).e(), String.valueOf(((com.vungle.ads.internal.platform.c) this.g).k()));
                    } else if (Intrinsics.areEqual(a20, "video.length")) {
                        a3 = i0.a(this.b, a20, String.valueOf(this.y), 4);
                    } else {
                        a3 = i0.a(this.b, a20, (String) null, 6);
                    }
                    if (a3 != null) {
                        Iterator it = a3.iterator();
                        while (it.hasNext()) {
                            c().a(new com.vungle.ads.internal.network.p((String) it.next()).b(a20).a(b()).a(), false);
                        }
                    }
                    if (!Intrinsics.areEqual(a20, "checkpoint.0") || this.j) {
                        return;
                    }
                    this.j = true;
                    a aVar5 = this.i;
                    if (aVar5 != null) {
                        aVar5.a("adViewed", null, this.c.b());
                    }
                    Handler handler = com.vungle.ads.internal.util.y.f12193a;
                    com.vungle.ads.internal.util.y.a(new i(this));
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case 94756344:
                if (command.equals("close")) {
                    a();
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case 96784904:
                if (command.equals("error")) {
                    String a21 = com.vungle.ads.internal.util.r.a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, arguments);
                    boolean parseBoolean2 = Boolean.parseBoolean(com.vungle.ads.internal.util.r.a("fatal", arguments));
                    String a22 = com.vungle.ads.internal.util.r.a("errorMessage", arguments);
                    if (parseBoolean2) {
                        reason = Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR;
                    } else {
                        reason = Sdk.SDKError.Reason.MRAID_ERROR;
                    }
                    String str3 = a21 + " : " + a22;
                    MraidTemplateError mraidTemplateError = new MraidTemplateError(reason, str3);
                    Handler handler2 = com.vungle.ads.internal.util.y.f12193a;
                    com.vungle.ads.internal.util.y.a(new g(this, mraidTemplateError, parseBoolean2, str3));
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case 133423073:
                if (command.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h)) {
                    String a23 = com.vungle.ads.internal.util.r.a("forceOrientation", arguments);
                    if (a23 == null || a23.length() == 0) {
                        return;
                    }
                    Locale ENGLISH = Locale.ENGLISH;
                    Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                    String lowerCase = a23.toLowerCase(ENGLISH);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (Intrinsics.areEqual(lowerCase, U3.i.C)) {
                        this.f12100a.setOrientation(6);
                        return;
                    } else {
                        if (Intrinsics.areEqual(lowerCase, U3.i.D)) {
                            this.f12100a.setOrientation(7);
                            return;
                        }
                        return;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case 592314818:
                if (command.equals("updateSignals")) {
                    String a24 = com.vungle.ads.internal.util.r.a("signals", arguments);
                    if (a24 == null || a24.length() == 0) {
                        return;
                    }
                    ((com.vungle.ads.internal.signals.j) this.q.getValue()).b(a24);
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case 1496446614:
                if (command.equals("getAvailableDiskSpace")) {
                    try {
                        Context context3 = this.f12100a.getContext();
                        File noBackupFilesDir = context3.getNoBackupFilesDir();
                        PathProvider pathProvider = (PathProvider) this.p.getValue();
                        String path = noBackupFilesDir.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "dir.path");
                        pathProvider.getClass();
                        long a25 = PathProvider.a(path);
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        this.d.a(a25, com.vungle.ads.internal.util.z.a(context3));
                        return;
                    } catch (Exception e) {
                        boolean z4 = com.vungle.ads.internal.util.u.f12190a;
                        com.vungle.ads.internal.util.t.b("MRAIDPresenter", com.iab.omid.library.vungle.internal.l.a("Failed to get available disk space: ").append(e.getMessage()).toString());
                        return;
                    }
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z322222222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            case 1614272768:
                if (command.equals("useCustomClose")) {
                    return;
                }
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z3222222222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
            default:
                new MraidTemplateError(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY, com.iab.omid.library.vungle.d.a("Unknown MRAID Command: ", command)).setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
                boolean z32222222222222222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("MRAIDPresenter", "processCommand# Unknown MRAID Command: " + command);
                return;
        }
        com.vungle.ads.internal.model.i c2 = this.b.c();
        String a26 = c2 != null ? c2.a() : null;
        String a27 = com.vungle.ads.internal.util.r.a("url", arguments);
        if (!com.vungle.ads.internal.util.n.a(a27)) {
            new InvalidCTAUrl("Invalid CTA Url (" + a27 + ')').setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
        }
        if (j()) {
            this.h = 0L;
            a("open", a27, true);
            return;
        }
        this.h = 0L;
        Context context4 = this.f12100a.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "adWidget.context");
        boolean a28 = com.vungle.ads.internal.util.l.a(a26, a27, context4, b(), new f(a26, this));
        a aVar6 = this.i;
        if (aVar6 != null) {
            aVar6.a("open", "adClick", this.c.b());
        }
        if (!a28 || (aVar = this.i) == null) {
            return;
        }
        aVar.a("open", "adLeftApplication", this.c.b());
    }

    public final void a(String command, String url) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(url, "url");
        boolean z2 = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("MRAIDPresenter", new l(command, url));
        if (z.contains(command)) {
            a(command, url, false);
        }
    }

    public final void a(String str, String str2, boolean z2) {
        k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT);
        StringBuilder sb = new StringBuilder("command: ");
        sb.append(str);
        sb.append(", mainFrame: ").append(z2);
        if (str2 != null) {
            sb.append(", url: ").append(str2);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        k2Var.a(sb2);
        AnalyticsClient.a(AnalyticsClient.INSTANCE, k2Var, b(), 4);
    }

    public final void a(boolean z2, String errorDesc) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (z2) {
            WebViewError webViewError = new WebViewError(errorDesc);
            webViewError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(webViewError, this.c.f11983a);
            }
            a();
        }
    }

    public final void a(VungleError vungleError, boolean z2, String str) {
        boolean z3 = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.b("MRAIDPresenter", com.iab.omid.library.vungle.internal.l.a("handleWebViewException: ").append(vungleError.getLocalizedMessage()).append(", fatal: ").append(z2).append(", errorMsg: ").append(str).toString());
        vungleError.setLogEntry$vungle_ads_release(b()).logErrorNoReturnValue$vungle_ads_release();
        if (z2) {
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(vungleError, this.c.f11983a);
            }
            a();
        }
    }
}
