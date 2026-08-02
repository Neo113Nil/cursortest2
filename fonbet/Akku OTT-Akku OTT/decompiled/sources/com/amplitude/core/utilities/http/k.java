package com.amplitude.core.utilities.http;

import com.amplitude.core.utilities.x;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k extends a {
    public final Set<String> b;
    public final Set<String> c;
    public final Set<String> d;
    public final Set<String> e;
    public final String f;
    public final Set<Integer> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(JSONObject response) {
        super(f.f);
        Intrinsics.checkNotNullParameter(response, "response");
        this.b = SetsKt.emptySet();
        this.c = SetsKt.emptySet();
        this.d = SetsKt.emptySet();
        this.e = SetsKt.emptySet();
        this.f = x.c(response);
        this.g = SetsKt.emptySet();
        if (response.has("exceeded_daily_quota_users")) {
            Set<String> keySet = response.getJSONObject("exceeded_daily_quota_users").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
            this.b = keySet;
        }
        if (response.has("exceeded_daily_quota_devices")) {
            Set<String> keySet2 = response.getJSONObject("exceeded_daily_quota_devices").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet2, "keySet(...)");
            this.c = keySet2;
        }
        if (response.has("throttled_events")) {
            JSONArray jSONArray = response.getJSONArray("throttled_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            this.g = ArraysKt.toSet(x.h(jSONArray));
        }
        if (response.has("throttled_users")) {
            Set<String> keySet3 = response.getJSONObject("throttled_users").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet3, "keySet(...)");
            this.e = keySet3;
        }
        if (response.has("throttled_devices")) {
            Set<String> keySet4 = response.getJSONObject("throttled_devices").keySet();
            Intrinsics.checkNotNullExpressionValue(keySet4, "keySet(...)");
            this.d = keySet4;
        }
    }
}
