package androidx.compose.ui.contentcapture;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", i = {}, l = {187, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "boundsUpdatesEventLoop$ui", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.ui.contentcapture.AndroidContentCaptureManager Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.boundsUpdatesEventLoop$ui(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidContentCaptureManager$boundsUpdatesEventLoop$1(androidx.compose.ui.contentcapture.AndroidContentCaptureManager androidContentCaptureManager, kotlin.coroutines.Continuation<? super androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = androidContentCaptureManager;
    }
}
