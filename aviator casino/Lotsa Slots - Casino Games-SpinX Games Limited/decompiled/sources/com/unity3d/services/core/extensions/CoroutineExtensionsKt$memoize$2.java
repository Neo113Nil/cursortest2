package com.unity3d.services.core.extensions;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoroutineExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", i = {0, 0}, l = {53, 45}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class CoroutineExtensionsKt$memoize$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> $action;
    final /* synthetic */ java.lang.Object $key;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2(java.lang.Object obj, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2> continuation) {
        super(2, continuation);
        this.$key = obj;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2(this.$key, this.$action, continuation);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
        return ((com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> function1;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                mutex = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getMutex();
                java.lang.Object obj3 = this.$key;
                function1 = this.$action;
                this.L$0 = coroutineScope;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = function1;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj3;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (kotlin.jvm.functions.Function1) this.L$3;
                obj2 = this.L$2;
                mutex = (kotlinx.coroutines.sync.Mutex) this.L$1;
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> deferreds = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getDeferreds();
            kotlinx.coroutines.Deferred<?> deferred = deferreds.get(obj2);
            if (deferred == null) {
                deferred = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                deferreds.put(obj2, deferred);
            }
            kotlinx.coroutines.Deferred<?> deferred2 = deferred;
            mutex.unlock(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            obj = deferred2.await(this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
        kotlinx.coroutines.sync.Mutex mutex = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getMutex();
        java.lang.Object obj2 = this.$key;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> function1 = this.$action;
        com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2<T> coroutineExtensionsKt$memoize$2 = this;
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(null, coroutineExtensionsKt$memoize$2);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> deferreds = com.unity3d.services.core.extensions.CoroutineExtensionsKt.getDeferreds();
            kotlinx.coroutines.Deferred<?> deferred = deferreds.get(obj2);
            if (deferred == null) {
                deferred = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3, null);
                deferreds.put(obj2, deferred);
            }
            kotlinx.coroutines.Deferred<?> deferred2 = deferred;
            mutex.unlock(null);
            kotlin.jvm.internal.InlineMarker.mark(0);
            java.lang.Object await = deferred2.await(coroutineExtensionsKt$memoize$2);
            kotlin.jvm.internal.InlineMarker.mark(1);
            return await;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
