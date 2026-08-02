package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl", f = "UseTorchAsFlash.kt", i = {}, l = {113}, m = "shouldUseTorchAsFlash", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseTorchAsFlashImpl$shouldUseTorchAsFlash$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.shouldUseTorchAsFlash(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseTorchAsFlashImpl$shouldUseTorchAsFlash$1(androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl useTorchAsFlashImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = useTorchAsFlashImpl;
    }
}
