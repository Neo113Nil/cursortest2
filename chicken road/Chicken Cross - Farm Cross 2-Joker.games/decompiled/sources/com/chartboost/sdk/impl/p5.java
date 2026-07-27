package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p5 {
    public static final a e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final o1 f4954a;
    public final String b;
    public final boolean c;
    public final List d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p5 a(JSONObject jSONObject) {
            String str = null;
            if (jSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("click");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString != null) {
                        if (StringsKt.isBlank(optString)) {
                            optString = null;
                        }
                        if (optString != null) {
                            arrayList.add(optString);
                        }
                    }
                }
            }
            o1 a2 = o1.d.a(jSONObject.optJSONObject("app_install_button"));
            String optString2 = jSONObject.optString("button_html");
            Intrinsics.checkNotNull(optString2);
            if (!StringsKt.isBlank(optString2) && !Intrinsics.areEqual(optString2, "null")) {
                str = optString2;
            }
            return new p5(a2, str, jSONObject.optBoolean("show_on_endcard", false), arrayList);
        }

        public a() {
        }
    }

    public p5(o1 o1Var, String str, boolean z, List clickTrackers) {
        Intrinsics.checkNotNullParameter(clickTrackers, "clickTrackers");
        this.f4954a = o1Var;
        this.b = str;
        this.c = z;
        this.d = clickTrackers;
    }

    public final o1 a() {
        return this.f4954a;
    }

    public final String b() {
        return this.b;
    }

    public final List c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return Intrinsics.areEqual(this.f4954a, p5Var.f4954a) && Intrinsics.areEqual(this.b, p5Var.b) && this.c == p5Var.c && Intrinsics.areEqual(this.d, p5Var.d);
    }

    public int hashCode() {
        o1 o1Var = this.f4954a;
        int hashCode = (o1Var == null ? 0 : o1Var.hashCode()) * 31;
        String str = this.b;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CtaConfig(appInstallButton=" + this.f4954a + ", buttonHtml=" + this.b + ", showOnEndcard=" + this.c + ", clickTrackers=" + this.d + ")";
    }
}
