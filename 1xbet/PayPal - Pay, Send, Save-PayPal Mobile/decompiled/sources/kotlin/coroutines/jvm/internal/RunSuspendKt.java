package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "runSuspend", "(Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RunSuspendKt {
    public static final void runSuspend(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.coroutines.jvm.internal.RunSuspend runSuspend = new kotlin.coroutines.jvm.internal.RunSuspend();
        kotlin.coroutines.ContinuationKt.startCoroutine(function1, runSuspend);
        synchronized (runSuspend) {
            while (true) {
                kotlin.Result<kotlin.Unit> result = runSuspend.getHighSpeedVideoFpsRanges;
                if (result == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(runSuspend, "");
                    runSuspend.wait();
                } else {
                    kotlin.ResultKt.throwOnFailure(result.getCamera2StreamConfigurationMap());
                }
            }
        }
    }
}
