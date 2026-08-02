package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/runtime/FallbackFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "p0", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FallbackFrameClock implements androidx.compose.runtime.MonotonicFrameClock {
    public static final androidx.compose.runtime.FallbackFrameClock INSTANCE = new androidx.compose.runtime.FallbackFrameClock();

    private FallbackFrameClock() {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final <R> java.lang.Object withFrameNanos(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2(function1, null), continuation);
    }
}
