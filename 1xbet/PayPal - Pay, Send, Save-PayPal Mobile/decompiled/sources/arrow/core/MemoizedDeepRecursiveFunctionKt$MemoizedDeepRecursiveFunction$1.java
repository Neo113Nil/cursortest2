package arrow.core;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlin/DeepRecursiveScope;", "x"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.MemoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1", f = "MemoizedDeepRecursiveFunction.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class MemoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1<R, T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<T, R>, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ arrow.core.MemoizationCache<T, R> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<T, R>, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        arrow.core.MemoizationCache memoizationCache;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.DeepRecursiveScope deepRecursiveScope = (kotlin.DeepRecursiveScope) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj3 = this.Camera2StreamConfigurationMap;
            java.lang.Object obj4 = this.getHighSpeedVideoFpsRanges.get(obj3);
            if (obj4 != null) {
                return obj4;
            }
            arrow.core.MemoizationCache<T, R> memoizationCache2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<T, R>, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = memoizationCache2;
            this.Camera2StreamConfigurationMap = obj3;
            this.getHighSpeedVideoSizes = 1;
            obj = function3.invoke(deepRecursiveScope, obj3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj3;
            memoizationCache = memoizationCache2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.Camera2StreamConfigurationMap;
            memoizationCache = (arrow.core.MemoizationCache) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return memoizationCache.set(obj2, obj);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        arrow.core.MemoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1 memoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1 = new arrow.core.MemoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, (kotlin.coroutines.Continuation) obj3);
        memoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1.getHighResolutionOutputSizeshNQ4ISI = (kotlin.DeepRecursiveScope) obj;
        memoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1.Camera2StreamConfigurationMap = obj2;
        return memoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MemoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1(arrow.core.MemoizationCache<T, R> memoizationCache, kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super arrow.core.MemoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = memoizationCache;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
