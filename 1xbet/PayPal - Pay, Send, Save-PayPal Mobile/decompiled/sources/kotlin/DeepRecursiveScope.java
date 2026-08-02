package kotlin;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u0007\u001a\u00028\u0003\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b2\u0006\u0010\u0006\u001a\u00028\u0002H¦@¢\u0006\u0004\b\u0007\u0010\fJ&\u0010\u000e\u001a\u00020\r*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0010"}, d2 = {"Lkotlin/DeepRecursiveScope;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "callRecursive", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "S", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invoke", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlin/DeepRecursiveScopeImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DeepRecursiveScope<T, R> {
    public abstract java.lang.Object callRecursive(T t, kotlin.coroutines.Continuation<? super R> continuation);

    public abstract <U, S> java.lang.Object callRecursive(kotlin.DeepRecursiveFunction<U, S> deepRecursiveFunction, U u, kotlin.coroutines.Continuation<? super S> continuation);

    private DeepRecursiveScope() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @kotlin.ReplaceWith(expression = "this.callRecursive(value)", imports = {}))
    public final java.lang.Void invoke(kotlin.DeepRecursiveFunction<?, ?> deepRecursiveFunction, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepRecursiveFunction, "");
        throw new java.lang.UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    public /* synthetic */ DeepRecursiveScope(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
