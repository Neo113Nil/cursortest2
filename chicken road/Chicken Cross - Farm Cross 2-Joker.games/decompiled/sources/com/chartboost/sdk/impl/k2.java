package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k2 {
    public static final a h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4835a;
    public final f2 b;
    public final u2 c;
    public final AtomicReference d;
    public final ae e;
    public final ve f;
    public final sg g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public k2(Context context, f2 base64Wrapper, u2 identity, AtomicReference sdkConfiguration, ae openMeasurementManager, ve privacyApi, sg session) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f4835a = context;
        this.b = base64Wrapper;
        this.c = identity;
        this.d = sdkConfiguration;
        this.e = openMeasurementManager;
        this.f = privacyApi;
        this.g = session;
    }

    public final String a() {
        List listOf = CollectionsKt.listOf((Object[]) new vh[]{new j9(this.c), new ud(this.d, this.e), new l6(this.f4835a, this.c, h6.d.a()), new j5(), new xe(this.f), new ug(this.g)});
        Map mapOf = MapsKt.mapOf(TuplesKt.to("package", this.f4835a.getPackageName()), TuplesKt.to("token_version", "1.2"), TuplesKt.to("android_api_level", Integer.valueOf(Build.VERSION.SDK_INT)));
        ArrayList arrayList = new ArrayList();
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            final JSONObject a2 = ((vh) it.next()).a();
            Iterator<String> keys = a2.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            CollectionsKt.addAll(arrayList, SequencesKt.map(SequencesKt.asSequence(keys), new Function1() { // from class: com.chartboost.sdk.impl.k2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k2.a(a2, (String) obj);
                }
            }));
        }
        SortedMap sortedMap = MapsKt.toSortedMap(MapsKt.plus(mapOf, arrayList));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : sortedMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        f2 f2Var = this.b;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return f2Var.c(jSONObject2);
    }

    public static final Pair a(JSONObject jSONObject, String str) {
        return TuplesKt.to(str, jSONObject.get(str));
    }
}
