package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.Scrollable2DKt", f = "Scrollable2D.kt", i = {0}, l = {509}, m = "semanticsScrollBy-d-4ec7I", n = {"previousValue"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class Scrollable2DKt$semanticsScrollBy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.Scrollable2DKt.Camera2StreamConfigurationMap(null, 0L, this);
        return Camera2StreamConfigurationMap;
    }

    Scrollable2DKt$semanticsScrollBy$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$1> continuation) {
        super(continuation);
    }
}
