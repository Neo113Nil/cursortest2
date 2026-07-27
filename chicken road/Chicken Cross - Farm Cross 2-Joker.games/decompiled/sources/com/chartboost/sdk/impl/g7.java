package com.chartboost.sdk.impl;

import com.ironsource.C4665u;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g7 {
    public static final a f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4777a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g7 a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String string = jsonObject.getString("type");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jsonObject.getString("http_method");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jsonObject.getString("url");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new g7(string, string2, string3, a(jsonObject, "body"), a(jsonObject, "content_type"));
        }

        public a() {
        }

        public final String a(JSONObject jSONObject, String str) {
            if (jSONObject.isNull(str)) {
                return null;
            }
            String optString = jSONObject.optString(str);
            Intrinsics.checkNotNull(optString);
            if (optString.length() > 0) {
                return optString;
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b c = new b("CLICK", 0, "click");
        public static final b d = new b("CLICK_ERROR", 1, "click_error");
        public static final b e = new b("CLICK_RESULT", 2, "click_result");
        public static final b f = new b("TRACKING_ERROR", 3, "tracking_error");
        public static final b g = new b("ENGAGEMENT", 4, "engagement");
        public static final b h = new b("RENDER", 5, "render");
        public static final b i = new b("RENDER_ERROR", 6, "render_error");
        public static final b j = new b("CLOSE", 7, "close");
        public static final b k = new b("EXPIRATION", 8, "expiration");
        public static final b l = new b("IMPRESSION", 9, "impression");
        public static final b m = new b("LOAD", 10, "load");
        public static final b n = new b("REWARD", 11, C4665u.j);
        public static final b o = new b("SHOW", 12, "show");
        public static final b p = new b("SKIP", 13, "skip");
        public static final b q = new b("INITIALIZATION", 14, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        public static final /* synthetic */ b[] r;
        public static final /* synthetic */ EnumEntries s;
        public final String b;

        static {
            b[] a2 = a();
            r = a2;
            s = EnumEntriesKt.enumEntries(a2);
        }

        public b(String str, int i2, String str2) {
            this.b = str2;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{c, d, e, f, g, h, i, j, k, l, m, n, o, p, q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) r.clone();
        }

        public final String b() {
            return this.b;
        }
    }

    public g7(String type, String httpMethod, String url, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f4777a = type;
        this.b = httpMethod;
        this.c = url;
        this.d = str;
        this.e = str2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.f4777a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return Intrinsics.areEqual(this.f4777a, g7Var.f4777a) && Intrinsics.areEqual(this.b, g7Var.b) && Intrinsics.areEqual(this.c, g7Var.c) && Intrinsics.areEqual(this.d, g7Var.d) && Intrinsics.areEqual(this.e, g7Var.e);
    }

    public int hashCode() {
        int hashCode = ((((this.f4777a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EventTracker(type=" + this.f4777a + ", httpMethod=" + this.b + ", url=" + this.c + ", body=" + this.d + ", contentType=" + this.e + ")";
    }
}
