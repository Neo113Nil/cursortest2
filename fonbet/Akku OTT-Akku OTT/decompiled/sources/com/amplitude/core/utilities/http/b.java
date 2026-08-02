package com.amplitude.core.utilities.http;

import com.amplitude.core.utilities.x;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b extends a {
    public final String b;
    public final Set<Integer> c;
    public final Set<Integer> d;
    public final Set<Integer> e;
    public final Set<String> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JSONObject response) {
        super(f.c);
        Intrinsics.checkNotNullParameter(response, "response");
        this.b = x.c(response);
        this.c = SetsKt.emptySet();
        this.d = SetsKt.emptySet();
        this.e = SetsKt.emptySet();
        this.f = SetsKt.emptySet();
        if (response.has("events_with_invalid_fields")) {
            JSONObject jSONObject = response.getJSONObject("events_with_invalid_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            this.c = x.b(jSONObject);
        }
        if (response.has("events_with_missing_fields")) {
            JSONObject jSONObject2 = response.getJSONObject("events_with_missing_fields");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            this.d = x.b(jSONObject2);
        }
        if (response.has("silenced_devices")) {
            Object jSONArray = response.getJSONArray("silenced_devices");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            Set<String> set = CollectionsKt.toSet((Iterable) jSONArray);
            Intrinsics.checkNotNull(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            this.f = set;
        }
        if (response.has("silenced_events")) {
            JSONArray jSONArray2 = response.getJSONArray("silenced_events");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
            this.e = ArraysKt.toSet(x.h(jSONArray2));
        }
    }
}
