package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/DelayWithTimeoutDiagnostics;", "Lkotlinx/coroutines/Delay;", "Lkotlin/time/Duration;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "", "timeoutMessage-LRDsOJo", "(J)Ljava/lang/String;", "timeoutMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DelayWithTimeoutDiagnostics extends kotlinx.coroutines.Delay {
    /* renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    java.lang.String m24059timeoutMessageLRDsOJo(long timeout);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        public static java.lang.Object delay(kotlinx.coroutines.DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object delay = kotlinx.coroutines.Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j, continuation);
            return delay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : kotlin.Unit.INSTANCE;
        }

        public static kotlinx.coroutines.DisposableHandle invokeOnTimeout(kotlinx.coroutines.DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, java.lang.Runnable runnable, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j, runnable, coroutineContext);
        }
    }
}
