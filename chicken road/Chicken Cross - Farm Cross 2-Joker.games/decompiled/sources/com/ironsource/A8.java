package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.U3;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class A8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7547a;
    private final String b;
    private final String c;
    private final String d;
    private final Drawable e;
    private final WebView f;
    private final View g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final a f7549a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final String f7550a;
            private final String b;
            private final String c;
            private final String d;
            private final Result<Drawable> e;
            private final Result<WebView> f;
            private final View g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.f7550a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = result;
                this.f = result2;
                this.g = privacyIcon;
            }

            public final String a() {
                return this.f7550a;
            }

            public final String b() {
                return this.b;
            }

            public final String c() {
                return this.c;
            }

            public final String d() {
                return this.d;
            }

            public final Result<Drawable> e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f7550a, aVar.f7550a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
            }

            public final Result<WebView> f() {
                return this.f;
            }

            public final View g() {
                return this.g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final A8 h() {
                Drawable drawable;
                String str = this.f7550a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                Result<Drawable> result = this.e;
                if (result != null) {
                    Object value = result.getValue();
                    if (Result.m8085isFailureimpl(value)) {
                        value = null;
                    }
                    drawable = (Drawable) value;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f;
                if (result2 != null) {
                    Object value2 = result2.getValue();
                    r5 = Result.m8085isFailureimpl(value2) ? null : value2;
                }
                return new A8(str, str2, str3, str4, drawable, r5, this.g);
            }

            public int hashCode() {
                String str = this.f7550a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result<Drawable> result = this.e;
                int m8084hashCodeimpl = (hashCode4 + (result == null ? 0 : Result.m8084hashCodeimpl(result.getValue()))) * 31;
                Result<WebView> result2 = this.f;
                return ((m8084hashCodeimpl + (result2 != null ? Result.m8084hashCodeimpl(result2.getValue()) : 0)) * 31) + this.g.hashCode();
            }

            public final String i() {
                return this.b;
            }

            public final String j() {
                return this.c;
            }

            public final String k() {
                return this.d;
            }

            public final Result<Drawable> l() {
                return this.e;
            }

            public final Result<WebView> m() {
                return this.f;
            }

            public final View n() {
                return this.g;
            }

            public final String o() {
                return this.f7550a;
            }

            public String toString() {
                return "Data(title=" + this.f7550a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", media=" + this.f + ", privacyIcon=" + this.g + ")";
            }

            public final a a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f7550a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.b;
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = aVar.c;
                }
                String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = aVar.d;
                }
                String str7 = str4;
                if ((i & 16) != 0) {
                    result = aVar.e;
                }
                Result result3 = result;
                if ((i & 32) != 0) {
                    result2 = aVar.f;
                }
                Result result4 = result2;
                if ((i & 64) != 0) {
                    view = aVar.g;
                }
                return aVar.a(str, str5, str6, str7, result3, result4, view);
            }
        }

        public b(a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f7549a = data;
        }

        public final a a() {
            return this.f7549a;
        }

        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            if (this.f7549a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.f7549a.i() != null) {
                a(jSONObject, U3.i.F0);
            }
            if (this.f7549a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.f7549a.k() != null) {
                a(jSONObject, "cta");
            }
            Result<Drawable> l = this.f7549a.l();
            if (l != null) {
                a(jSONObject, "icon", l.getValue());
            }
            Result<WebView> m = this.f7549a.m();
            if (m != null) {
                a(jSONObject, "media", m.getValue());
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", Result.m8086isSuccessimpl(obj));
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj);
            if (m8082exceptionOrNullimpl != null) {
                String message = m8082exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put(str, jSONObject2);
        }
    }

    public A8(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.f7547a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = privacyIcon;
    }

    public final String a() {
        return this.f7547a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Drawable e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A8)) {
            return false;
        }
        A8 a8 = (A8) obj;
        return Intrinsics.areEqual(this.f7547a, a8.f7547a) && Intrinsics.areEqual(this.b, a8.b) && Intrinsics.areEqual(this.c, a8.c) && Intrinsics.areEqual(this.d, a8.d) && Intrinsics.areEqual(this.e, a8.e) && Intrinsics.areEqual(this.f, a8.f) && Intrinsics.areEqual(this.g, a8.g);
    }

    public final WebView f() {
        return this.f;
    }

    public final View g() {
        return this.g;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.f7547a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f;
        return ((hashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.d;
    }

    public final Drawable k() {
        return this.e;
    }

    public final WebView l() {
        return this.f;
    }

    public final View m() {
        return this.g;
    }

    public final String n() {
        return this.f7547a;
    }

    public String toString() {
        return "ISNNativeAdData(title=" + this.f7547a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", mediaView=" + this.f + ", privacyIcon=" + this.g + ")";
    }

    public final A8 a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new A8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ A8 a(A8 a8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = a8.f7547a;
        }
        if ((i & 2) != 0) {
            str2 = a8.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = a8.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = a8.d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            drawable = a8.e;
        }
        Drawable drawable2 = drawable;
        if ((i & 32) != 0) {
            webView = a8.f;
        }
        WebView webView2 = webView;
        if ((i & 64) != 0) {
            view = a8.g;
        }
        return a8.a(str, str5, str6, str7, drawable2, webView2, view);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final T8 f7548a;
        private final InterfaceC4327b1 b;

        public a(T8 imageLoader, InterfaceC4327b1 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.f7548a = imageLoader;
            this.b = adViewManagement;
        }

        private final Result<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m8078boximpl(this.f7548a.a(str));
        }

        public final b a(Context activityContext, JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            String b;
            String b2;
            String b3;
            String b4;
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("title");
            if (optJSONObject != null) {
                b4 = B8.b(optJSONObject, "text");
                str = b4;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = json.optJSONObject(U3.i.F0);
            if (optJSONObject2 != null) {
                b3 = B8.b(optJSONObject2, "text");
                str2 = b3;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject("body");
            if (optJSONObject3 != null) {
                b2 = B8.b(optJSONObject3, "text");
                str3 = b2;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("cta");
            if (optJSONObject4 != null) {
                b = B8.b(optJSONObject4, "text");
                str4 = b;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = json.optJSONObject("icon");
            String b5 = optJSONObject5 != null ? B8.b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = json.optJSONObject("media");
            String b6 = optJSONObject6 != null ? B8.b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = json.optJSONObject(U3.i.J0);
            return new b(new b.a(str, str2, str3, str4, b(b5), a(b6), C4751yd.f8781a.a(activityContext, optJSONObject7 != null ? B8.b(optJSONObject7, "url") : null, this.f7548a)));
        }

        private final Result<WebView> a(String str) {
            if (str == null) {
                return null;
            }
            E8 a2 = this.b.a(str);
            WebView presentingView = a2 != null ? a2.getPresentingView() : null;
            if (presentingView == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(new Exception("missing adview for id: '" + str + "'"))));
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8078boximpl(Result.m8079constructorimpl(presentingView));
        }
    }
}
