package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class id {

    /* renamed from: a, reason: collision with root package name */
    public final oi f4810a;
    public final vi b;
    public t8 c;
    public float d;
    public da e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4811a;

        static {
            int[] iArr = new int[jd.values().length];
            try {
                iArr[jd.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jd.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jd.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jd.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jd.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[jd.j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[jd.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[jd.l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[jd.m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[jd.n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[jd.o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[jd.p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[jd.q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[jd.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[jd.s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[jd.t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[jd.u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[jd.v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[jd.w.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[jd.x.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[jd.y.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[jd.z.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[jd.A.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[jd.B.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[jd.C.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[jd.D.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[jd.E.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[jd.F.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[jd.G.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[jd.H.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[jd.I.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[jd.J.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[jd.K.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[jd.L.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[jd.M.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[jd.R.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[jd.N.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[jd.O.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[jd.P.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[jd.Q.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            f4811a = iArr;
        }
    }

    public id(oi uiPost, vi urlParser) {
        Intrinsics.checkNotNullParameter(uiPost, "uiPost");
        Intrinsics.checkNotNullParameter(urlParser, "urlParser");
        this.f4810a = uiPost;
        this.b = urlParser;
    }

    public static final Unit b() {
        mb.b("Video replay command is run", (Throwable) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit c(id idVar, JSONObject jSONObject) {
        idVar.k(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit d(id idVar, JSONObject jSONObject) {
        idVar.b(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit e(id idVar, JSONObject jSONObject) {
        idVar.j(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit f(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.a(uj.k);
        }
        return Unit.INSTANCE;
    }

    public static final Unit g(id idVar, JSONObject jSONObject) {
        idVar.h(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit h(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.f();
        } else {
            mb.a("Impression interface is missing in template mute video", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit i(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.c();
        } else {
            mb.a("Impression interface is missing in template unmute video", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit j(id idVar, JSONObject jSONObject) {
        idVar.a(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit k(id idVar, JSONObject jSONObject) {
        idVar.i(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit l(id idVar) {
        idVar.e();
        return Unit.INSTANCE;
    }

    public static final Unit m(id idVar) {
        idVar.h();
        return Unit.INSTANCE;
    }

    public static final Unit n(id idVar) {
        idVar.g();
        return Unit.INSTANCE;
    }

    public static final Unit o(id idVar) {
        idVar.f();
        return Unit.INSTANCE;
    }

    public static final Unit p(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.z();
        } else {
            mb.a("Impression interface is missing in template show", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void a(t8 t8Var) {
        this.c = t8Var;
    }

    public static final Unit b(id idVar, JSONObject jSONObject) {
        idVar.c(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit c(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.m();
        } else {
            mb.a("Impression interface is missing in template rewarded video completed", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit d(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.A();
        } else {
            mb.a("Impression interface is missing in template play video", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit e(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.v();
        } else {
            mb.a("Impression interface is missing in template pause video", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit g(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.C();
        } else {
            mb.a("Impression interface is missing in template close video", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit j(id idVar) {
        idVar.d();
        return Unit.INSTANCE;
    }

    public static final Unit k(id idVar) {
        idVar.c();
        return Unit.INSTANCE;
    }

    public final void a(da impressionInterface) {
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        this.e = impressionInterface;
    }

    public static final Unit b(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.D();
        }
        return Unit.INSTANCE;
    }

    public final void a() {
        this.e = null;
    }

    public final void j(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(NotificationCompat.CATEGORY_EVENT);
                if (string != null) {
                    da daVar = this.e;
                    if (daVar != null) {
                        daVar.d(string);
                        return;
                    } else {
                        mb.a("JS->Native Track VAST event message: " + string, (Throwable) null, 2, (Object) null);
                        return;
                    }
                }
            } catch (Exception e) {
                mb.b("Exception while parsing webview VAST tracking", e);
                return;
            }
        }
        mb.b("Tracking command received but event is missing!", (Throwable) null, 2, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0011, code lost:
    
        if (r5 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(JSONObject jSONObject) {
        String string;
        mb.a("Javascript warning occurred", (Throwable) null, 2, (Object) null);
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("message");
            } catch (Exception unused) {
                da daVar = this.e;
                if (daVar != null) {
                    daVar.e("Warning message is empty");
                    return;
                }
                return;
            }
        }
        string = "Missing message argument";
        mb.a("JS->Native Warning message: " + string, (Throwable) null, 2, (Object) null);
        da daVar2 = this.e;
        if (daVar2 != null) {
            daVar2.e(string);
        }
    }

    public static final Unit h(id idVar, JSONObject jSONObject) {
        idVar.f(jSONObject);
        return Unit.INSTANCE;
    }

    public static final Unit i(id idVar, JSONObject jSONObject) {
        idVar.g(jSONObject);
        return Unit.INSTANCE;
    }

    public final String a(JSONObject jSONObject, String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        jd a2 = jd.c.a(functionName);
        if (a2 == null) {
            mb.e("Native event unknown: " + functionName, null, 2, null);
            return "Function name not recognized.";
        }
        mb.a("TEMPLATE EVENT: " + a2.c(), (Throwable) null, 2, (Object) null);
        return a(jSONObject, a2);
    }

    public final void b(JSONObject jSONObject) {
        try {
            mb.a("Debug message: " + b(jSONObject, "JS->Native Debug message: "), (Throwable) null, 2, (Object) null);
        } catch (Exception e) {
            mb.b("Exception occurred while parsing the message for webview debug track event", e);
        }
    }

    public final void c(JSONObject jSONObject) {
        mb.a("Javascript Error occurred " + jSONObject, (Throwable) null, 2, (Object) null);
        d(jSONObject);
        try {
            da daVar = this.e;
            if (daVar != null) {
                daVar.t();
                if (daVar.c(b(jSONObject, "JS->Native Error message: ")) != null) {
                    return;
                }
            }
            mb.a("Impression interface is missing in error", (Throwable) null, 2, (Object) null);
            Unit unit = Unit.INSTANCE;
        } catch (Exception unused) {
            mb.b("Error message is empty", (Throwable) null, 2, (Object) null);
            da daVar2 = this.e;
            if (daVar2 != null) {
                daVar2.c("");
            }
        }
    }

    public final void d(JSONObject jSONObject) {
        String optString;
        if (jg.f4829a.d() && jSONObject != null && (optString = jSONObject.optString("msg")) != null && Intrinsics.areEqual(optString, "crash sdk")) {
            throw new RuntimeException("test crash");
        }
    }

    public final void e(JSONObject jSONObject) {
        try {
            da daVar = this.e;
            if (daVar != null) {
                daVar.d(this.b.b(jSONObject));
            } else {
                mb.a("Impression interface is missing in openUrl", (Throwable) null, 2, (Object) null);
            }
        } catch (ActivityNotFoundException e) {
            mb.b("ActivityNotFoundException occured when opening a url in a browser", e);
        } catch (Exception e2) {
            mb.b("Exception while opening a browser view with MRAID url", e2);
        }
    }

    public final void g() {
        da daVar = this.e;
        if (daVar != null) {
            daVar.a(uj.c);
            daVar.a(re.e);
        } else {
            mb.a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    public final void h() {
        t8 t8Var = this.c;
        if (t8Var != null) {
            t8Var.onHideCustomView();
        }
        da daVar = this.e;
        if (daVar != null) {
            daVar.a(re.d);
            daVar.i();
        } else {
            mb.a("Impression interface is missing in videoCompleted", (Throwable) null, 2, (Object) null);
        }
    }

    public final void i(JSONObject jSONObject) {
        float optDouble;
        if (jSONObject != null) {
            try {
                optDouble = (float) jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, 0.0d);
            } catch (Exception e) {
                k(new JSONObject().put("message", "Parsing exception unknown field for total player duration: " + e));
                return;
            }
        } else {
            optDouble = 0.0f;
        }
        float f = optDouble * 1000;
        mb.a("######### JS->Native Video total player duration" + f, (Throwable) null, 2, (Object) null);
        this.d = f;
        da daVar = this.e;
        if (daVar != null) {
            daVar.b(f);
        } else {
            mb.a("Impression interface is missing in totalVideoDuration", (Throwable) null, 2, (Object) null);
        }
    }

    public static final Unit f(id idVar, JSONObject jSONObject) {
        idVar.e(jSONObject);
        return Unit.INSTANCE;
    }

    public final String b(JSONObject jSONObject, String str) {
        String str2;
        if (jSONObject == null || (str2 = jSONObject.getString("message")) == null) {
            str2 = "";
        }
        mb.a(str + str2, (Throwable) null, 2, (Object) null);
        return str2;
    }

    public final void f() {
        da daVar = this.e;
        if (daVar != null) {
            daVar.a(re.f);
            daVar.a(uj.d);
        } else {
            mb.a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    public final void d() {
        try {
            da daVar = this.e;
            if (daVar != null) {
                daVar.a(uj.e);
            } else {
                mb.a("Impression interface is missing in runBufferStart", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            mb.b("Invalid bufer start command", e);
        }
    }

    public final void g(JSONObject jSONObject) {
        double d = 0.0d;
        if (jSONObject != null) {
            try {
                d = jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, 0.0d);
            } catch (Exception e) {
                mb.b("Invalid start command", e);
                return;
            }
        }
        this.d = (float) d;
        da daVar = this.e;
        if (daVar != null) {
            daVar.a(uj.b);
        } else {
            mb.a("Impression interface is missing in runStart", (Throwable) null, 2, (Object) null);
        }
    }

    public final void h(JSONObject jSONObject) {
        String optString;
        boolean z = true;
        if (jSONObject != null) {
            try {
                z = jSONObject.optBoolean("allowOrientationChange", true);
            } catch (Exception unused) {
                mb.b("Invalid set orientation command", (Throwable) null, 2, (Object) null);
                return;
            }
        }
        String str = "none";
        if (jSONObject != null && (optString = jSONObject.optString("forceOrientation", "none")) != null) {
            str = optString;
        }
        da daVar = this.e;
        if (daVar != null) {
            daVar.a(z, str);
        } else {
            mb.a("Impression interface is missing in setOrientation", (Throwable) null, 2, (Object) null);
        }
    }

    public final String a(final JSONObject jSONObject, jd jdVar) {
        String u;
        String h;
        String q;
        String x;
        String o;
        String r;
        switch (a.f4811a[jdVar.ordinal()]) {
            case 1:
                mb.a("JavaScript to native " + jdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                da daVar = this.e;
                return (daVar == null || (u = daVar.u()) == null) ? "" : u;
            case 2:
                mb.a("JavaScript to native " + jdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                da daVar2 = this.e;
                return (daVar2 == null || (h = daVar2.h()) == null) ? "" : h;
            case 3:
                mb.a("JavaScript to native " + jdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                da daVar3 = this.e;
                return (daVar3 == null || (q = daVar3.q()) == null) ? "" : q;
            case 4:
                mb.a("JavaScript to native " + jdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                da daVar4 = this.e;
                return (daVar4 == null || (x = daVar4.x()) == null) ? "" : x;
            case 5:
                mb.a("JavaScript to native " + jdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                da daVar5 = this.e;
                return (daVar5 == null || (o = daVar5.o()) == null) ? "" : o;
            case 6:
                mb.a("JavaScript to native " + jdVar.c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                da daVar6 = this.e;
                return (daVar6 == null || (r = daVar6.r()) == null) ? "" : r;
            case 7:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.a(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 8:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.a(id.this);
                    }
                });
                return "Native function successfully called.";
            case 9:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.f(id.this);
                    }
                });
                return "Native function successfully called.";
            case 10:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.m(id.this);
                    }
                });
                return "Native function successfully called.";
            case 11:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.n(id.this);
                    }
                });
                return "Native function successfully called.";
            case 12:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.o(id.this);
                    }
                });
                return "Native function successfully called.";
            case 13:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.b();
                    }
                });
                return "Native function successfully called.";
            case 14:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.j(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 15:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.k(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 16:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.p(id.this);
                    }
                });
                return "Native function successfully called.";
            case 17:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.b(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 18:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.c(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 19:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.d(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 20:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.e(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 21:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.f(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 22:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.g(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 23:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.b(id.this);
                    }
                });
                return "Native function successfully called.";
            case 24:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.c(id.this);
                    }
                });
                return "Native function successfully called.";
            case 25:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.d(id.this);
                    }
                });
                return "Native function successfully called.";
            case 26:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.e(id.this);
                    }
                });
                return "Native function successfully called.";
            case 27:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.g(id.this);
                    }
                });
                return "Native function successfully called.";
            case 28:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.h(id.this);
                    }
                });
                return "Native function successfully called.";
            case 29:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.i(id.this);
                    }
                });
                return "Native function successfully called.";
            case 30:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.h(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 31:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.i(id.this, jSONObject);
                    }
                });
                return "Native function successfully called.";
            case 32:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.j(id.this);
                    }
                });
                return "Native function successfully called.";
            case 33:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.k(id.this);
                    }
                });
                return "Native function successfully called.";
            case 34:
                this.f4810a.a(new Function0() { // from class: com.chartboost.sdk.impl.id$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return id.l(id.this);
                    }
                });
                return "Native function successfully called.";
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                return "Native function successfully called.";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void f(JSONObject jSONObject) {
        List list;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("resources");
                if (string != null) {
                    if (string.length() == 0) {
                        list = CollectionsKt.emptyList();
                    } else {
                        List<JSONObject> asList = g8.asList(new JSONArray(string));
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
                        for (JSONObject jSONObject2 : asList) {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(jSONObject2.getString("vendorKey"), new URL(jSONObject2.getString("url")), jSONObject2.getString("params")));
                        }
                        list = CollectionsKt.toList(arrayList);
                    }
                    int optInt = jSONObject.optInt("skipOffset");
                    da daVar = this.e;
                    if (daVar != null) {
                        daVar.a(list, Integer.valueOf(optInt));
                        return;
                    } else {
                        mb.a("Impression interface is missing in runOmResources", (Throwable) null, 2, (Object) null);
                        return;
                    }
                }
            } catch (Exception e) {
                mb.b("Invalid om resources command", e);
                return;
            }
        }
        mb.b("Invalid om resources command: missing json", (Throwable) null, 2, (Object) null);
    }

    public final void e() {
        try {
            da daVar = this.e;
            if (daVar != null) {
                daVar.a(uj.j);
            } else {
                mb.a("Impression interface is missing in runVideoFinished", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            mb.b("Invalid buffer end command", e);
        }
    }

    public final void c() {
        try {
            da daVar = this.e;
            if (daVar != null) {
                daVar.a(uj.f);
            } else {
                mb.a("Impression interface is missing in runBufferEnd", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e) {
            mb.b("Invalid buffer end command", e);
        }
    }

    public static final Unit a(id idVar, JSONObject jSONObject) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.b(idVar.b.b(jSONObject));
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(id idVar) {
        da daVar = idVar.e;
        if (daVar != null) {
            daVar.y();
        } else {
            mb.a("Impression interface is missing in template close", (Throwable) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void a(JSONObject jSONObject) {
        float f;
        if (jSONObject != null) {
            try {
                f = (float) jSONObject.getDouble(IronSourceConstants.EVENTS_DURATION);
            } catch (Exception e) {
                k(new JSONObject().put("message", "Parsing exception unknown field for current player duration: " + e));
                return;
            }
        } else {
            f = 0.0f;
        }
        if (f > 0.0f) {
            float f2 = f * 1000;
            mb.a("######### JS->Native Video current player duration: " + f2, (Throwable) null, 2, (Object) null);
            da daVar = this.e;
            if (daVar != null) {
                daVar.a(f2);
                daVar.a(this.d, f2);
            } else {
                mb.a("Impression interface is missing in currentVideoDuration", (Throwable) null, 2, (Object) null);
            }
        }
    }
}
