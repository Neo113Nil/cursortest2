package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ug implements vh {
    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final sg f5033a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public ug(sg session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f5033a = session;
    }

    @Override // com.chartboost.sdk.impl.vh
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        tg i = this.f5033a.i();
        jSONObject.put("session_duration", (int) RangesKt.coerceAtMost(i.b() / 1000, 2147483647L));
        jSONObject.put("impression_depth_interstitial", i.d());
        jSONObject.put("impression_depth_rewarded", i.e());
        jSONObject.put("impression_depth_banner", i.a());
        return jSONObject;
    }
}
