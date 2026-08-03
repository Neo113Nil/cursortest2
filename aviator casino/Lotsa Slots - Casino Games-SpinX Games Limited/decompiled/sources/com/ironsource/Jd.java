package com.ironsource;

/* loaded from: classes5.dex */
public final class Jd {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.ironsource.C3367xc> f5793a;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Pair<? extends java.lang.String, ? extends com.ironsource.C3367xc>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f5794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(org.json.JSONObject jSONObject) {
            super(1);
            this.f5794a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.Pair<java.lang.String, com.ironsource.C3367xc> invoke(java.lang.String networkName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            org.json.JSONObject jSONObject = this.f5794a.getJSONObject(networkName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return kotlin.TuplesKt.to(networkName, new com.ironsource.C3367xc(networkName, jSONObject));
        }
    }

    public Jd(org.json.JSONObject providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        java.util.Iterator<java.lang.String> keys = providerSettings.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "providerSettings\n          .keys()");
        java.util.Map<java.lang.String, com.ironsource.C3367xc> map = kotlin.collections.MapsKt.toMap(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.asSequence(keys), new com.ironsource.Jd.a(providerSettings)));
        this.f5793a = map;
        for (java.util.Map.Entry<java.lang.String, com.ironsource.C3367xc> entry : map.entrySet()) {
            entry.getKey();
            com.ironsource.C3367xc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(com.ironsource.C3367xc c3367xc) {
        return c3367xc.o() && c3367xc.l().length() > 0;
    }

    public final java.util.Map<java.lang.String, com.ironsource.C3367xc> a() {
        return this.f5793a;
    }

    private final com.ironsource.C3367xc a(com.ironsource.C3367xc c3367xc) {
        return this.f5793a.get(c3367xc.h());
    }
}
