package io.ktor.utils.io.jvm.nio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0, 0, 0}, l = {59}, m = "writeWhile", n = {"$this$writeWhile", "block", com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.TestTagDone}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class WriteSuspendSessionKt$writeWhile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.writeWhile(null, null, this);
    }

    WriteSuspendSessionKt$writeWhile$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1> continuation) {
        super(continuation);
    }
}
