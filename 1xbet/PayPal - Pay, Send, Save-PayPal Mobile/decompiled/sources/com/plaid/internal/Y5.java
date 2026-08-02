package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Y5 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonObjectBuilder, kotlin.Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> f5981a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y5(java.util.Map<java.lang.String, java.lang.String> map) {
        super(1);
        this.f5981a = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final kotlin.Unit invoke(kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder) {
        kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder2 = jsonObjectBuilder;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder2, "");
        java.util.Map<java.lang.String, java.lang.String> map = this.f5981a;
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder2, entry.getKey(), entry.getValue());
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
