package com.ironsource;

/* renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2944a1 {
    public static final com.ironsource.C2944a1.a b = new com.ironsource.C2944a1.a(null);
    public static final java.lang.String c = "adUnits";

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f6129a;

    /* renamed from: com.ironsource.a1$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2944a1(org.json.JSONObject configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f6129a = configurations.optJSONObject(c);
    }

    public final <T> java.util.Map<java.lang.String, T> a(kotlin.jvm.functions.Function1<? super org.json.JSONObject, ? extends T> valueExtractor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        org.json.JSONObject jSONObject = this.f6129a;
        if (jSONObject == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "adUnits.keys()");
        kotlin.sequences.Sequence asSequence = kotlin.sequences.SequencesKt.asSequence(keys);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (T t : asSequence) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject((java.lang.String) t);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
