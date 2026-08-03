package com.unity3d.services.core.extensions;

/* compiled from: TaskExtensions.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {17, 30}, m = "withRetry", n = {"fallbackException", "block", "nextDelay", "retryDelay", "retries", "scalingFactor", "attempt", "fallbackException", "block", "nextDelay", "retryDelay", "retries", "scalingFactor"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "D$0", "I$2", "L$0", "L$1", "L$2", "J$0", "I$0", "D$0"})
/* loaded from: classes6.dex */
final class TaskExtensionsKt$withRetry$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    TaskExtensionsKt$withRetry$1(kotlin.coroutines.Continuation<? super com.unity3d.services.core.extensions.TaskExtensionsKt$withRetry$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(0L, 0, 0.0d, null, null, this);
    }
}
