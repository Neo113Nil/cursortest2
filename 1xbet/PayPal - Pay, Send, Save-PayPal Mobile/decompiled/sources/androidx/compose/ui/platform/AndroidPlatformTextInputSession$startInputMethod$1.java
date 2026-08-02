package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", i = {}, l = {71}, m = "startInputMethod", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AndroidPlatformTextInputSession$startInputMethod$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.platform.AndroidPlatformTextInputSession getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.startInputMethod(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPlatformTextInputSession$startInputMethod$1(androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = androidPlatformTextInputSession;
    }
}
