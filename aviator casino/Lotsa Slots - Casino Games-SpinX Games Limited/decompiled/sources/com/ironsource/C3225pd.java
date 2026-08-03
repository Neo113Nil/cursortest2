package com.ironsource;

/* renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3225pd {
    public static final com.ironsource.C3225pd.a b = new com.ironsource.C3225pd.a(null);
    public static final java.lang.String c = "placements";
    public static final java.lang.String d = "placementName";

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONArray f6556a;

    /* renamed from: com.ironsource.pd$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3225pd(org.json.JSONObject configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f6556a = configuration.optJSONArray(c);
    }

    public final <T> java.util.Map<java.lang.String, T> a(kotlin.jvm.functions.Function1<? super org.json.JSONObject, ? extends T> valueExtractor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        org.json.JSONArray jSONArray = this.f6556a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jsonObject = jSONArray.getJSONObject(i);
                java.lang.String key = jsonObject.optString("placementName");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                T invoke = valueExtractor.invoke(jsonObject);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, invoke);
            }
        }
        return linkedHashMap;
    }
}
