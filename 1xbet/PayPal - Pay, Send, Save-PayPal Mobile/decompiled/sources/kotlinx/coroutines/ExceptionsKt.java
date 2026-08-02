package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007*\n\u0010\b\"\u00020\u00042\u00020\u0004"}, d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", com.ingo.sdk.kotlin.common.analytics.IEventNames.CancellationException, "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExceptionsKt {
    public static final java.util.concurrent.CancellationException CancellationException(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
