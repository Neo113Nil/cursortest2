package kotlinx.coroutines.future;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FutureKt$setupCancellation$1 implements kotlin.jvm.functions.Function2 {
    final /* synthetic */ kotlinx.coroutines.Job getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Throwable th = (java.lang.Throwable) obj2;
        kotlinx.coroutines.Job job = this.getHighSpeedVideoFpsRangesFor;
        if (th != null) {
            r0 = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            if (r0 == null) {
                r0 = kotlinx.coroutines.ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th);
            }
        }
        job.cancel(r0);
        return kotlin.Unit.INSTANCE;
    }

    FutureKt$setupCancellation$1(kotlinx.coroutines.Job job) {
        this.getHighSpeedVideoFpsRangesFor = job;
    }
}
