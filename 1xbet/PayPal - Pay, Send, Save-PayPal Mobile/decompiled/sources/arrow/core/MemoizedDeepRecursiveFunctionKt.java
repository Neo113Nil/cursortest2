package arrow.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001av\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000229\u0010\t\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Larrow/core/MemoizationCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "Lkotlin/Function3;", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/DeepRecursiveFunction;", "MemoizedDeepRecursiveFunction", "(Larrow/core/MemoizationCache;Lkotlin/jvm/functions/Function3;)Lkotlin/DeepRecursiveFunction;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoizedDeepRecursiveFunctionKt {
    public static /* synthetic */ kotlin.DeepRecursiveFunction MemoizedDeepRecursiveFunction$default(arrow.core.MemoizationCache memoizationCache, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            memoizationCache = arrow.core.AtomicMemoizationCache.m9528boximpl(arrow.core.AtomicMemoizationCache.m9530constructorimpl$default(null, 1, null));
        }
        return MemoizedDeepRecursiveFunction(memoizationCache, function3);
    }

    public static final <T, R> kotlin.DeepRecursiveFunction<T, R> MemoizedDeepRecursiveFunction(arrow.core.MemoizationCache<T, R> memoizationCache, kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memoizationCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return new kotlin.DeepRecursiveFunction<>(new arrow.core.MemoizedDeepRecursiveFunctionKt$MemoizedDeepRecursiveFunction$1(memoizationCache, function3, null));
    }

    public static final <T, R> kotlin.DeepRecursiveFunction<T, R> MemoizedDeepRecursiveFunction(kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        return MemoizedDeepRecursiveFunction$default(null, function3, 1, null);
    }
}
