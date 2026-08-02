package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 1}, l = {2196, 2231}, m = "boundsUpdatesEventLoop$ui", n = {"subtreeChangedSemanticsNodesIds", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.boundsUpdatesEventLoop$ui(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = androidComposeViewAccessibilityDelegateCompat;
    }
}
