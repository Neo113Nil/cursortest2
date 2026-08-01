package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import com.chartboost.sdk.view.CBImpressionActivity;
import com.ironsource.U3;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class m3 implements i7 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public re I;
    public qk J;
    public float K;
    public float L;
    public float M;
    public final t5 N;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4868a;
    public final String b;
    public final bc c;
    public final String d;
    public final oi e;
    public final k8 f;
    public final e3 g;
    public final j3 h;
    public final Mediation i;
    public final String j;
    public final zd k;
    public final r0 l;
    public final ml m;
    public final i7 n;
    public final Function2 o;
    public String p;
    public long q;
    public long r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
        public static final a b = new a();

        public a() {
            super(2, ha.class, "<init>", "<init>(Ljava/lang/String;Lcom/chartboost/sdk/tracking/EventTrackerExtensions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ha invoke(String p0, i7 p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return new ha(p0, p1);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4869a;

        static {
            int[] iArr = new int[uj.values().length];
            try {
                iArr[uj.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uj.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uj.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uj.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uj.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uj.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[uj.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[uj.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[uj.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[uj.k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[uj.l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f4869a = iArr;
        }
    }

    public static final class c implements t5 {
        public c() {
        }

        @Override // com.chartboost.sdk.impl.t5
        public void a() {
            m3.this.q = System.currentTimeMillis();
        }

        @Override // com.chartboost.sdk.impl.t5
        public void b() {
            qk u = m3.this.u();
            n3 webView = u != null ? u.getWebView() : null;
            if (m3.this.c == bc.e || webView == null) {
                return;
            }
            zd n = m3.this.n();
            bc bcVar = m3.this.c;
            List list = Collections.EMPTY_LIST;
            Intrinsics.checkNotNullExpressionValue(list, "emptyList(...)");
            n.a(bcVar, webView, null, list);
        }

        @Override // com.chartboost.sdk.impl.t5
        public void c() {
            m3.this.x();
        }

        @Override // com.chartboost.sdk.impl.t5
        public void d() {
            m3.this.B();
        }

        @Override // com.chartboost.sdk.impl.t5
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            m3.this.c(message);
        }

        @Override // com.chartboost.sdk.impl.t5
        public void a(View obstructionView) {
            Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
            m3.this.n().a(obstructionView);
        }
    }

    public m3(Context context, String location, bc adUnitMType, String adTypeTraitsName, oi uiPoster, k8 fileCache, e3 e3Var, j3 j3Var, Mediation mediation, String str, zd openMeasurementImpressionCallback, r0 adUnitRendererCallback, ml webViewTimeoutInterface, i7 eventTracker, Function2 impressionTrackerRequestFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnitMType, "adUnitMType");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(impressionTrackerRequestFactory, "impressionTrackerRequestFactory");
        this.f4868a = context;
        this.b = location;
        this.c = adUnitMType;
        this.d = adTypeTraitsName;
        this.e = uiPoster;
        this.f = fileCache;
        this.g = e3Var;
        this.h = j3Var;
        this.i = mediation;
        this.j = str;
        this.k = openMeasurementImpressionCallback;
        this.l = adUnitRendererCallback;
        this.m = webViewTimeoutInterface;
        this.n = eventTracker;
        this.o = impressionTrackerRequestFactory;
        this.G = true;
        this.H = -1;
        this.I = re.e;
        this.N = new c();
    }

    public final CBError.Impression A() {
        File file = this.f.a().f4858a;
        if (file == null) {
            mb.b("External Storage path is unavailable or media not mounted", (Throwable) null, 2, (Object) null);
            return CBError.Impression.ERROR_LOADING_WEB_VIEW;
        }
        this.p = "file://" + file.getAbsolutePath() + "/";
        String str = this.j;
        if (str == null || str.length() != 0) {
            return null;
        }
        mb.b("Empty template being passed in the response", (Throwable) null, 2, (Object) null);
        return CBError.Impression.ERROR_DISPLAYING_VIEW;
    }

    public final void B() {
        this.e.a(15000L, new Function0() { // from class: com.chartboost.sdk.impl.m3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m3.b(m3.this);
            }
        });
    }

    public final void C() {
        this.l.a();
        this.G = true;
        this.H = -1;
    }

    public final void D() {
        this.M = 1.0f;
    }

    public abstract qk b(Context context);

    public final void b(float f) {
        this.L = f;
    }

    public final CBError.Impression c(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(g.i.j, error);
        mb.b(error, (Throwable) null, 2, (Object) null);
        this.s = true;
        return CBError.Impression.WEB_VIEW_CLIENT_RECEIVED_ERROR;
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.n.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.n.clearFromStorage(fVar);
    }

    public final void d(String str) {
        e3 e3Var;
        if (str == null || str.length() == 0 || (e3Var = this.g) == null) {
            mb.a("###### Sending VAST Tracking Event Failed: " + str, (Throwable) null, 2, (Object) null);
        } else {
            e3Var.a((a3) this.o.invoke(str, this.n));
            mb.a("###### Sending VAST Tracking Event: " + str, (Throwable) null, 2, (Object) null);
        }
    }

    public final void e() {
        qk qkVar = this.J;
        if (qkVar == null || !this.s) {
            this.C = this.y;
            this.D = this.z;
            this.E = this.A;
            this.F = this.B;
            return;
        }
        int[] iArr = new int[2];
        qkVar.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1] - this.x;
        int width = qkVar.getWidth();
        int height = qkVar.getHeight();
        this.y = i;
        this.z = i2;
        int i3 = width + i;
        this.A = i3;
        int i4 = height + i2;
        this.B = i4;
        this.C = i;
        this.D = i2;
        this.E = i3;
        this.F = i4;
        mb.a("CalculatePosition: defaultXPos: " + i + " , currentXPos: " + i, (Throwable) null, 2, (Object) null);
    }

    public void f() {
        this.k.f();
        final qk qkVar = this.J;
        if (qkVar != null) {
            this.e.a(1000L, new Function0() { // from class: com.chartboost.sdk.impl.m3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m3.a(qk.this);
                }
            });
        }
        this.J = null;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.p;
    }

    public final String i() {
        e();
        return a(this.C, this.D, this.E, this.F);
    }

    public final t5 j() {
        return this.N;
    }

    public final String k() {
        e();
        return a(this.y, this.z, this.A, this.B);
    }

    public final String l() {
        return this.b;
    }

    public final String m() {
        String jSONObject = x2.a(x2.a("width", Integer.valueOf(this.v)), x2.a("height", Integer.valueOf(this.w))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final zd n() {
        return this.k;
    }

    public final String o() {
        String jSONObject = x2.a(x2.a("allowOrientationChange", Boolean.valueOf(this.G)), x2.a("forceOrientation", a(this.H))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final String p() {
        String jSONObject = x2.a(x2.a("width", Integer.valueOf(this.t)), x2.a("height", Integer.valueOf(this.u))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.n.persist(fVar);
    }

    public final j3 q() {
        return this.h;
    }

    public final oi r() {
        return this.e;
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.n.refresh(fiVar);
    }

    public final float s() {
        return this.K;
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.n.store(trackAd);
    }

    public final float t() {
        return this.L;
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.n.track(fVar);
    }

    public final qk u() {
        return this.J;
    }

    public final void v() {
        this.M = 0.0f;
    }

    public abstract void w();

    public void x() {
        n3 webView;
        Context context;
        this.s = true;
        long currentTimeMillis = System.currentTimeMillis();
        this.r = currentTimeMillis;
        mb.a("Total web view load response time " + ((currentTimeMillis - this.q) / 1000), (Throwable) null, 2, (Object) null);
        qk qkVar = this.J;
        if (qkVar != null && (context = qkVar.getContext()) != null) {
            a(context);
        }
        qk qkVar2 = this.J;
        if (qkVar2 == null || (webView = qkVar2.getWebView()) == null) {
            return;
        }
        a((WebView) webView);
        e();
    }

    public void y() {
        n3 webView;
        j3 j3Var;
        qk qkVar = this.J;
        if (qkVar == null || (webView = qkVar.getWebView()) == null || (j3Var = this.h) == null) {
            return;
        }
        j3Var.a(webView, this.b, this.d);
        webView.onPause();
    }

    public void z() {
        n3 webView;
        j3 j3Var;
        qk qkVar = this.J;
        if (qkVar == null || (webView = qkVar.getWebView()) == null || (j3Var = this.h) == null) {
            return;
        }
        j3Var.b(webView, this.b, this.d);
        webView.onResume();
    }

    public static final Unit b(m3 m3Var) {
        if (!m3Var.s) {
            mb.a("Webview seems to be taking more time loading the html content, so closing the view.", (Throwable) null, 2, (Object) null);
            m3Var.a(g.i.g, "");
            m3Var.m.a();
        }
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.n.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.n.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.n.mo4759track(event);
    }

    public final void a(float f) {
        this.K = f;
    }

    public static final Unit a(qk qkVar) {
        qkVar.a();
        qkVar.removeAllViews();
        return Unit.INSTANCE;
    }

    public final CBError.Impression a(ViewGroup viewGroup) {
        if (this.J == null) {
            if ((viewGroup != null ? viewGroup.getContext() : null) != null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.J = b(context);
            } else {
                return CBError.Impression.ERROR_CREATING_VIEW;
            }
        }
        return null;
    }

    public final int b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual(name, U3.i.D)) {
            return 1;
        }
        return Intrinsics.areEqual(name, U3.i.C) ? 0 : -1;
    }

    public final CBError.Impression a(CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.J == null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.J = b(applicationContext);
        }
        this.l.a(this.f4868a);
        return null;
    }

    public final void a(com.chartboost.sdk.tracking.g gVar, String str) {
        if (str == null) {
            str = "no message";
        }
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.a(gVar, str, this.d, this.b, this.i, null, 32, null));
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.t = displayMetrics.widthPixels;
        this.u = displayMetrics.heightPixels;
    }

    public final void a(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.v = webView.getWidth();
        this.w = webView.getHeight();
    }

    public final String a(int i) {
        return i != -1 ? i != 0 ? i != 1 ? "error" : U3.i.D : U3.i.C : "none";
    }

    public final void a(boolean z, String forceOrientationString) {
        Intrinsics.checkNotNullParameter(forceOrientationString, "forceOrientationString");
        this.G = z;
        int b2 = b(forceOrientationString);
        this.H = b2;
        this.l.a(b2, z);
    }

    public final String a(int i, int i2, int i3, int i4) {
        String jSONObject = x2.a(x2.a("x", Integer.valueOf(i)), x2.a("y", Integer.valueOf(i2)), x2.a("width", Integer.valueOf(i3)), x2.a("height", Integer.valueOf(i4))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final void a(float f, float f2) {
        float f3 = 4;
        float f4 = f / f3;
        float f5 = f / 2;
        float f6 = (f * 3) / f3;
        if (f2 >= f4 && f2 < f5) {
            a(uj.g);
            return;
        }
        if (f2 >= f5 && f2 < f6) {
            a(uj.h);
        } else if (f2 >= f6) {
            a(uj.i);
        }
    }

    public final void a(uj event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mb.a("sendWebViewVastOmEvent: " + event.name(), (Throwable) null, 2, (Object) null);
        if (this.c != bc.e) {
            return;
        }
        zd zdVar = this.k;
        switch (b.f4869a[event.ordinal()]) {
            case 1:
                zdVar.a(this.K, this.M);
                return;
            case 2:
                if (this.I == re.f) {
                    zdVar.e();
                    return;
                }
                return;
            case 3:
                zdVar.a();
                return;
            case 4:
                zdVar.a(true);
                return;
            case 5:
                zdVar.a(false);
                return;
            case 6:
                zdVar.a(hf.b);
                return;
            case 7:
                zdVar.a(hf.c);
                return;
            case 8:
                zdVar.a(hf.d);
                return;
            case 9:
                zdVar.b();
                return;
            case 10:
                zdVar.d();
                return;
            case 11:
                zdVar.a(this.M);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void a(re newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.I = newState;
    }

    public final void a(List verificationScriptResourceList, Integer num) {
        n3 webView;
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        qk qkVar = this.J;
        if (qkVar == null || (webView = qkVar.getWebView()) == null) {
            return;
        }
        this.k.a(this.c, webView, num, verificationScriptResourceList);
    }

    public /* synthetic */ m3(Context context, String str, bc bcVar, String str2, oi oiVar, k8 k8Var, e3 e3Var, j3 j3Var, Mediation mediation, String str3, zd zdVar, r0 r0Var, ml mlVar, i7 i7Var, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bcVar, str2, oiVar, k8Var, e3Var, j3Var, mediation, str3, zdVar, r0Var, mlVar, i7Var, (i & 16384) != 0 ? a.b : function2);
    }
}
