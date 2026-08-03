package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f7187a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.q$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.q.a();
        }
    });

    public static final kotlinx.serialization.json.Json a() {
        return kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.internal.q$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.internal.q.a((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final kotlinx.serialization.json.Json b() {
        return c();
    }

    public static final kotlinx.serialization.json.Json c() {
        return (kotlinx.serialization.json.Json) f7187a.getValue();
    }

    public static final kotlin.Unit a(kotlinx.serialization.json.JsonBuilder Json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setLenient(true);
        Json.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}
