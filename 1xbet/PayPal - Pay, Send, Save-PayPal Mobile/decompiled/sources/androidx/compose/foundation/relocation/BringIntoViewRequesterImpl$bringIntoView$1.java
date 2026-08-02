package androidx.compose.foundation.relocation;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {102}, m = "bringIntoView", n = {"rect", "content$iv", "i$iv", "size$iv"}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 1)
/* loaded from: classes6.dex */
final class BringIntoViewRequesterImpl$bringIntoView$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewRequesterImpl getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.bringIntoView(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterImpl$bringIntoView$1(androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1> continuation) {
        super(continuation);
        this.getInputFormats = bringIntoViewRequesterImpl;
    }
}
