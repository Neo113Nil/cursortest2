package com.apollographql.apollo.cache.normalized.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1", f = "WatcherInterceptor.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WatcherInterceptorKt$flattenConcatPolyfill$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighSpeedVideoFpsRangesFor.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object emitAll = kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, (kotlinx.coroutines.flow.Flow) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                    return emitAll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAll : kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1 watcherInterceptorKt$flattenConcatPolyfill$1 = new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        watcherInterceptorKt$flattenConcatPolyfill$1.Camera2StreamConfigurationMap = obj;
        return watcherInterceptorKt$flattenConcatPolyfill$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WatcherInterceptorKt$flattenConcatPolyfill$1(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.WatcherInterceptorKt$flattenConcatPolyfill$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = flow;
    }
}
