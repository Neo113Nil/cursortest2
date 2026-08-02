package androidx.camera.camera2.adapter;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.adapter.CoroutineAdaptersKt", f = "CoroutineAdapters.kt", i = {}, l = {199}, m = "awaitUntil", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CoroutineAdaptersKt$awaitUntil$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.camera.camera2.adapter.CoroutineAdaptersKt.awaitUntil(null, 0L, this);
    }

    CoroutineAdaptersKt$awaitUntil$1(kotlin.coroutines.Continuation<? super androidx.camera.camera2.adapter.CoroutineAdaptersKt$awaitUntil$1> continuation) {
        super(continuation);
    }
}
