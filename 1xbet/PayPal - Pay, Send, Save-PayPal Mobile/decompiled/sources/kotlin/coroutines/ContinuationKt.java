package kotlin.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aZ\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0006\u0010\f\u001a;\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aT\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "createCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContinuationKt {
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static final <T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutine(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        return new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function1, continuation)), kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final <R, T> kotlin.coroutines.Continuation<kotlin.Unit> createCoroutine(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, R r, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        return new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function2, r, continuation)), kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final <T> void startCoroutine(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function1, continuation));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        intercepted.resumeWith(kotlin.Result.m23436constructorimpl(unit));
    }

    public static final <R, T> void startCoroutine(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, R r, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function2, r, continuation));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        intercepted.resumeWith(kotlin.Result.m23436constructorimpl(unit));
    }
}
