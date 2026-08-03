package com.inmobi.media;

/* renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2714r6 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f5420a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.r6$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2714r6.a();
        }
    });

    public static final kotlinx.coroutines.CoroutineScope a() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("r6", "TAG");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("r6", "name");
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("r6", false));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(newSingleThreadExecutor));
    }

    public static void a(com.inmobi.media.C2478i6 eventPayload, java.lang.String url, int i, int i2, long j, com.inmobi.media.Rk rk, com.inmobi.media.C2662p6 c2662p6, boolean z) {
        long j2;
        long j3;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("r6", "TAG");
        if (com.inmobi.media.Ze.a() != null || !com.inmobi.media.Xi.d.get()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("r6", "TAG");
            c2662p6.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
            java.lang.String TAG = c2662p6.e;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2556l6(eventPayload, false, c2662p6, null), 1, null);
            c2662p6.a(java.lang.System.currentTimeMillis());
            if (c2662p6.d != null) {
                java.util.ArrayList eventIds = eventPayload.f5254a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventIds, "eventIds");
                java.lang.Integer num = com.inmobi.media.AbstractC2757sk.c;
                if (num != null && eventIds.contains(java.lang.Integer.valueOf(num.intValue()))) {
                    com.inmobi.media.AbstractC2757sk.c = null;
                }
            }
            c2662p6.f.set(false);
            return;
        }
        if (url != null) {
            java.lang.String payload = eventPayload.b;
            int i3 = i - i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            java.util.HashMap hashMapOf = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("payload", payload));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMapOf, "<this>");
            org.json.JSONObject b = com.inmobi.media.AbstractC2268a7.b();
            if (b != null) {
                java.lang.String jSONObject = b.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                hashMapOf.put("consentObject", jSONObject);
            }
            com.inmobi.media.Te te = new com.inmobi.media.Te(url, i3 > 0 ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-im-retry-count", java.lang.String.valueOf(i3))) : null, null, new com.inmobi.media.C2321c7(hashMapOf, 0), null, 52);
            if (z) {
                if (i2 != i) {
                    j3 = ((long) java.lang.Math.pow(2.0d, i3)) * j;
                    j2 = j3;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) f5420a.getValue(), null, null, new com.inmobi.media.C2689q6(j2, te, i2, eventPayload, url, i, j, rk, c2662p6, z, null), 3, null);
                }
            } else if (i2 != i) {
                j2 = j;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) f5420a.getValue(), null, null, new com.inmobi.media.C2689q6(j2, te, i2, eventPayload, url, i, j, rk, c2662p6, z, null), 3, null);
            }
            j3 = 0;
            j2 = j3;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) f5420a.getValue(), null, null, new com.inmobi.media.C2689q6(j2, te, i2, eventPayload, url, i, j, rk, c2662p6, z, null), 3, null);
        }
    }
}
