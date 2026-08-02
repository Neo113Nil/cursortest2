package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/coroutines/TimeoutCoroutine;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "", "p0", "Lkotlin/coroutines/Continuation;", "p1", "<init>", "(JLkotlin/coroutines/Continuation;)V", "", "run", "()V", "", "nameString$kotlinx_coroutines_core", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TimeoutCoroutine<U, T extends U> extends kotlinx.coroutines.internal.ScopeCoroutine<T> implements java.lang.Runnable {
    public final long getHighResolutionOutputSizeshNQ4ISI;

    public TimeoutCoroutine(long j, kotlin.coroutines.Continuation<? super U> continuation) {
        super(continuation.getGetHighSpeedVideoSizes(), continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cancelCoroutine(kotlinx.coroutines.TimeoutKt.TimeoutCancellationException(this.getHighResolutionOutputSizeshNQ4ISI, kotlinx.coroutines.DelayKt.getDelay(getGetHighSpeedVideoSizes()), this));
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    public final java.lang.String nameString$kotlinx_coroutines_core() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.nameString$kotlinx_coroutines_core());
        sb.append("(timeMillis=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }
}
