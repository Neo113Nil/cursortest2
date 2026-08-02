package kotlin.coroutines;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/coroutines/ContinuationKt$Continuation$1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context"}, k = 1, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ContinuationKt$Continuation$1<T> implements kotlin.coroutines.Continuation<T> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.Result<? extends T>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationKt$Continuation$1(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends T>, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = coroutineContext;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object result) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(kotlin.Result.m23435boximpl(result));
    }
}
