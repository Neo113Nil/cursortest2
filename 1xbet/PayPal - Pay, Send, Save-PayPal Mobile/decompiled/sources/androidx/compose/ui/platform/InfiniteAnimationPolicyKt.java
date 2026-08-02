package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "onFrame", "withInfiniteAnimationFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfiniteAnimationPolicyKt {
    public static final <R> java.lang.Object withInfiniteAnimationFrameNanos(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.compose.ui.platform.InfiniteAnimationPolicy infiniteAnimationPolicy = (androidx.compose.ui.platform.InfiniteAnimationPolicy) continuation.getContext().get(androidx.compose.ui.platform.InfiniteAnimationPolicy.INSTANCE);
        if (infiniteAnimationPolicy == null) {
            return androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(function1, continuation);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, null), continuation);
    }
}
