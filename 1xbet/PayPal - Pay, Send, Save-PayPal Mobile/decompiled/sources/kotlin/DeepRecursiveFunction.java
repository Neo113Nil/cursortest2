package kotlin;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BB\u00129\u0010\b\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nRM\u0010\b\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0002\b\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/DeepRecursiveFunction;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Lkotlin/Function3;", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getBlock$kotlin_stdlib", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeepRecursiveFunction<T, R> {
    private final kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<T, R>, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public DeepRecursiveFunction(kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        this.block = function3;
    }

    public final kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<T, R>, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getBlock$kotlin_stdlib() {
        return this.block;
    }
}
