package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Ga {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f4723a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ga$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.Ga.a();
        }
    });

    public static final com.inmobi.media.Fa a() {
        return new com.inmobi.media.Fa(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) com.inmobi.media.K.f4790a).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))));
    }
}
