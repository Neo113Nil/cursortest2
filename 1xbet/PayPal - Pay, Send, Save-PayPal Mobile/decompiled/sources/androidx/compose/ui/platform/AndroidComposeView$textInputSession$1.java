package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {776}, m = "textInputSession", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AndroidComposeView$textInputSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.textInputSession(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$textInputSession$1(androidx.compose.ui.platform.AndroidComposeView androidComposeView, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.AndroidComposeView$textInputSession$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = androidComposeView;
    }
}
