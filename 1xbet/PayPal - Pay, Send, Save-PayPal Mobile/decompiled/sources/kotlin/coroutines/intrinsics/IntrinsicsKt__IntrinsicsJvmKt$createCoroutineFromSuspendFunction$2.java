package kotlin.coroutines.intrinsics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2(kotlin.coroutines.Continuation<? super T> continuation, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
        super(continuation, coroutineContext);
        this.getHighSpeedVideoFpsRanges = function1;
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object result) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            this.getHighSpeedVideoFpsRangesFor = 1;
            kotlin.ResultKt.throwOnFailure(result);
            return this.getHighSpeedVideoFpsRanges.invoke(this);
        }
        if (i == 1) {
            this.getHighSpeedVideoFpsRangesFor = 2;
            kotlin.ResultKt.throwOnFailure(result);
            return result;
        }
        throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
    }
}
