package app.cash.sqldelight;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "app.cash.sqldelight.SuspendingTransacterImpl", f = "Transacter.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {397, 407, 412, 412, 412}, m = "transactionWithWrapper", n = {"this", "wrapperBody", "noEnclosing", "this", "transaction", "enclosing", "this", "transaction", "enclosing", "returnValue", "this", "transaction", "enclosing", "thrownException", "returnValue", "this", "transaction", "enclosing", "returnValue"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes7.dex */
final class SuspendingTransacterImpl$transactionWithWrapper$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ app.cash.sqldelight.SuspendingTransacterImpl getInputFormats;
    int getOutputFormats;
    boolean getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputFormats.Camera2StreamConfigurationMap(false, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingTransacterImpl$transactionWithWrapper$1(app.cash.sqldelight.SuspendingTransacterImpl suspendingTransacterImpl, kotlin.coroutines.Continuation<? super app.cash.sqldelight.SuspendingTransacterImpl$transactionWithWrapper$1> continuation) {
        super(continuation);
        this.getInputFormats = suspendingTransacterImpl;
    }
}
