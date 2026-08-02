package androidx.compose.foundation.text.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {369, 380}, m = "classifyText-M8tDOmk", n = {"text", "textClassifier", "$this$withLock_u24default$iv", "$v$c$androidx-compose-ui-text-TextRange$-selection$0", "text", "textClassification", "$this$withLock_u24default$iv", "$v$c$androidx-compose-ui-text-TextRange$-selection$0"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class PlatformSelectionBehaviorsImpl$classifyText$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, 0L, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$classifyText$1(androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = platformSelectionBehaviorsImpl;
    }
}
