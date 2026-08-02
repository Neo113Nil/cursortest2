package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {83}, m = "scrollBy", n = {"consumed"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class ScrollExtensionsKt$scrollBy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(null, 0.0f, this);
    }

    ScrollExtensionsKt$scrollBy$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1> continuation) {
        super(continuation);
    }
}
