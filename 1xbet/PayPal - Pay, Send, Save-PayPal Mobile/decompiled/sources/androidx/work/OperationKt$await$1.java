package androidx.work;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", i = {}, l = {36}, m = "await", n = {}, s = {})
/* loaded from: classes3.dex */
final class OperationKt$await$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return androidx.work.OperationKt.await(null, this);
    }

    OperationKt$await$1(kotlin.coroutines.Continuation<? super androidx.work.OperationKt$await$1> continuation) {
        super(continuation);
    }
}
