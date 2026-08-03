package com.inmobi.media;

/* renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2340d {
    public static void a(final kotlin.jvm.functions.Function0 execute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(execute, "execute");
        kotlin.Lazy lazy = com.inmobi.media.E0.f4672a;
        kotlin.jvm.functions.Function0 execute2 = new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.AbstractC2340d.b(kotlin.jvm.functions.Function0.this);
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(execute2, "execute");
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.E0.f;
        if (coroutineScope == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("AdQualityComponent-aqBeacon", "name");
            java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("AdQualityComponent-aqBeacon", false));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(newSingleThreadExecutor).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
            com.inmobi.media.E0.f = coroutineScope;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.C0(execute2, null), 3, null);
    }

    public static final kotlin.Unit b(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
