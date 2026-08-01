package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3638d {
    public static void a(final Function0 execute) {
        Intrinsics.checkNotNullParameter(execute, "execute");
        Lazy lazy = G0.f6569a;
        Function0 execute2 = new Function0() { // from class: com.inmobi.media.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3638d.b(Function0.this);
            }
        };
        Intrinsics.checkNotNullParameter(execute2, "execute");
        CoroutineScope coroutineScope = G0.f;
        if (coroutineScope == null) {
            Intrinsics.checkNotNullParameter("AdQualityComponent-aqBeacon", "name");
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("AdQualityComponent-aqBeacon", false));
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
            coroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            G0.f = coroutineScope;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new E0(execute2, null), 3, null);
    }

    public static final Unit b(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
