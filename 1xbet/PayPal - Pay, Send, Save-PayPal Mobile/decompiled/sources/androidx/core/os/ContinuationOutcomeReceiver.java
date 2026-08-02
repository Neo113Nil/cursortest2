package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/Continuation;", "p0", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "onResult", "(Ljava/lang/Object;)V", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/Continuation;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ContinuationOutcomeReceiver<R, E extends java.lang.Throwable> extends java.util.concurrent.atomic.AtomicBoolean implements android.os.OutcomeReceiver<R, E> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<R> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(kotlin.coroutines.Continuation<? super R> continuation) {
        super(false);
        this.getHighSpeedVideoFpsRangesFor = continuation;
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(R p0) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.Continuation<R> continuation = this.getHighSpeedVideoFpsRangesFor;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(p0));
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(E p0) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.Continuation<R> continuation = this.getHighSpeedVideoFpsRangesFor;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(p0)));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContinuationOutcomeReceiver(outcomeReceived = ");
        sb.append(get());
        sb.append(')');
        return sb.toString();
    }
}
