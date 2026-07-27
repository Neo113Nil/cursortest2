package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.ironsource.U3;
import com.ironsource.Y1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class xe implements vh {
    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ve f5081a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public xe(ve privacyApi) {
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        this.f5081a = privacyApi;
    }

    @Override // com.chartboost.sdk.impl.vh
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        we g = this.f5081a.g();
        Integer d = g.d();
        if (d != null) {
            jSONObject.put(COPPA.COPPA_STANDARD, d.intValue());
        }
        Integer e = g.e();
        if (e != null) {
            jSONObject.put("gdpr", e.intValue());
        }
        Integer c = g.c();
        if (c != null) {
            jSONObject.put(U3.j.b0, c.intValue());
        }
        String h = g.h();
        if (h != null) {
            if (StringsKt.isBlank(h)) {
                h = null;
            }
            if (h != null) {
                jSONObject.put("tcf", h);
            }
        }
        String f = g.f();
        if (f != null) {
            if (StringsKt.isBlank(f) || Intrinsics.areEqual(f, Y1.f)) {
                f = null;
            }
            if (f != null) {
                jSONObject.put(CCPA.CCPA_STANDARD, f);
            }
        }
        String b2 = g.b();
        if (b2 != null) {
            if (StringsKt.isBlank(b2)) {
                b2 = null;
            }
            if (b2 != null) {
                jSONObject.put("gpp", b2);
            }
        }
        String a2 = g.a();
        if (a2 != null) {
            String str = StringsKt.isBlank(a2) ? null : a2;
            if (str != null) {
                jSONObject.put("gpp_sid", str);
            }
        }
        return jSONObject;
    }
}
