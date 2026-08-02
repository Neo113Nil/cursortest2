package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {40}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class ScrollExtensionsKt$animateScrollBy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
    }

    ScrollExtensionsKt$animateScrollBy$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1> continuation) {
        super(continuation);
    }
}
