package io.ktor.client.engine;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class UtilsKt$attachToUserJob$2 implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    final /* synthetic */ kotlinx.coroutines.DisposableHandle getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        invoke2(th);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor.dispose();
    }

    public UtilsKt$attachToUserJob$2(kotlinx.coroutines.DisposableHandle disposableHandle) {
        this.getHighSpeedVideoFpsRangesFor = disposableHandle;
    }
}
