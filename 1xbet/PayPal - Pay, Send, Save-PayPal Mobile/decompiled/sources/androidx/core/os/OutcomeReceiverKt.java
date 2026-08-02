package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "E", "Lkotlin/coroutines/Continuation;", "Landroid/os/OutcomeReceiver;", "asOutcomeReceiver", "(Lkotlin/coroutines/Continuation;)Landroid/os/OutcomeReceiver;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OutcomeReceiverKt {
    public static final <R, E extends java.lang.Throwable> android.os.OutcomeReceiver<R, E> asOutcomeReceiver(kotlin.coroutines.Continuation<? super R> continuation) {
        return new androidx.core.os.ContinuationOutcomeReceiver(continuation);
    }
}
