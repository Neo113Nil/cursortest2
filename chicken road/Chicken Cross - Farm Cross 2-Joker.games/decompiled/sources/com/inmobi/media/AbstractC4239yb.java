package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.yb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4239yb {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f7499a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.yb$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC4239yb.a();
        }
    });

    public static final C4212xb a() {
        return new C4212xb(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) L.f6683a).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))));
    }
}
