package kotlinx.coroutines.intrinsics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u000b\u001a%\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\r\u001a#\u0010\u0011\u001a\u00020\u00052\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "startCoroutineCancellable", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "fatalCompletion", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V", "p0", "", "p1", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancellableKt {
    public static final <T> void startCoroutineCancellable(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        try {
            kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function1, continuation));
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(intercepted, kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoSizes(continuation, th);
        }
    }

    public static final <R, T> void startCoroutineCancellable(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, R r, kotlin.coroutines.Continuation<? super T> continuation) {
        try {
            kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function2, r, continuation));
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(intercepted, kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoSizes(continuation, th);
        }
    }

    public static final void startCoroutineCancellable(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation, kotlin.coroutines.Continuation<?> continuation2) {
        try {
            kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(intercepted, kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoSizes(continuation2, th);
        }
    }

    private static final void getHighSpeedVideoSizes(kotlin.coroutines.Continuation<?> continuation, java.lang.Throwable th) {
        if (th instanceof kotlinx.coroutines.DispatchException) {
            th = ((kotlinx.coroutines.DispatchException) th).getCause();
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
        throw th;
    }
}
