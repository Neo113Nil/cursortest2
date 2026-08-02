package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/selects/SelectImplementation;", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "getResult", "()Ljava/lang/Object;", "", "e", "", "handleBuilderException", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectBuilderImpl<R> extends kotlinx.coroutines.selects.SelectImplementation<R> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CancellableContinuationImpl<R> getHighSpeedVideoFpsRanges;

    public SelectBuilderImpl(kotlin.coroutines.Continuation<? super R> continuation) {
        super(continuation.getGetInputFormats());
        this.getHighSpeedVideoFpsRanges = new kotlinx.coroutines.CancellableContinuationImpl<>(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
    }

    public final java.lang.Object getResult() {
        if (this.getHighSpeedVideoFpsRanges.isCompleted()) {
            return this.getHighSpeedVideoFpsRanges.getResult();
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(getGetHighResolutionOutputSizeshNQ4ISI()), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1(this, null), 1, null);
        return this.getHighSpeedVideoFpsRanges.getResult();
    }

    public final void handleBuilderException(java.lang.Throwable e) {
        kotlinx.coroutines.CancellableContinuationImpl<R> cancellableContinuationImpl = this.getHighSpeedVideoFpsRanges;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuationImpl.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(e)));
    }
}
