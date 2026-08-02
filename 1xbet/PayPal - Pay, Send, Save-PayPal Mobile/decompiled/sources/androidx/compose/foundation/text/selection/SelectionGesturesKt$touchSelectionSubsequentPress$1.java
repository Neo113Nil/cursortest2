package androidx.compose.foundation.text.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 0, 1, 1}, l = {193, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "touchSelectionSubsequentPress", n = {"$this$touchSelectionSubsequentPress", "observer", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.selection.SelectionGesturesKt.getHighSpeedVideoFpsRangesFor(null, null, null, 0, this);
        return highSpeedVideoFpsRangesFor;
    }

    SelectionGesturesKt$touchSelectionSubsequentPress$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1> continuation) {
        super(continuation);
    }
}
