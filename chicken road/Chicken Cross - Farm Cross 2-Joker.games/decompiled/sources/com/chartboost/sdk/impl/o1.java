package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o1 {
    public static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final URL f4922a;
    public final String b;
    public final String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o1 a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("icon");
            Intrinsics.checkNotNull(optString);
            if (StringsKt.isBlank(optString) || Intrinsics.areEqual(optString, "null")) {
                optString = null;
            }
            URL url = optString != null ? new URL(optString) : null;
            String optString2 = jSONObject.optString("title");
            if (Intrinsics.areEqual(optString2, "null")) {
                optString2 = null;
            }
            if (optString2 == null) {
                optString2 = "";
            }
            String optString3 = jSONObject.optString("button_text", "Get");
            String str = Intrinsics.areEqual(optString3, "null") ? null : optString3;
            return new o1(url, optString2, str != null ? str : "Get");
        }

        public a() {
        }
    }

    public o1(URL url, String title, String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f4922a = url;
        this.b = title;
        this.c = buttonText;
    }

    public final String a() {
        return this.c;
    }

    public final URL b() {
        return this.f4922a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Intrinsics.areEqual(this.f4922a, o1Var.f4922a) && Intrinsics.areEqual(this.b, o1Var.b) && Intrinsics.areEqual(this.c, o1Var.c);
    }

    public int hashCode() {
        URL url = this.f4922a;
        return ((((url == null ? 0 : url.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AppInstallButton(iconUrl=" + this.f4922a + ", title=" + this.b + ", buttonText=" + this.c + ")";
    }
}
