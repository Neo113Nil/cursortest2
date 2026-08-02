package io.ktor.client.engine;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class UtilsKt$attachToUserJob$cleanupHandler$1 implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    final /* synthetic */ kotlinx.coroutines.Job getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        invoke2(th);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.Throwable th) {
        if (th == null) {
            return;
        }
        this.getHighSpeedVideoSizes.cancel(new java.util.concurrent.CancellationException(th.getMessage()));
    }

    public UtilsKt$attachToUserJob$cleanupHandler$1(kotlinx.coroutines.Job job) {
        this.getHighSpeedVideoSizes = job;
    }
}
