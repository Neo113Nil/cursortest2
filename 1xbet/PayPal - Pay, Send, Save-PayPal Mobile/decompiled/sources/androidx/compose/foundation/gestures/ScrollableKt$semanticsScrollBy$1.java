package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0, 0}, l = {1118}, m = "semanticsScrollBy-d-4ec7I", n = {"$this$semanticsScrollBy_u2dd_u2d4ec7I", "previousValue"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class ScrollableKt$semanticsScrollBy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollableKt.getHighSpeedVideoSizes(null, 0L, this);
        return highSpeedVideoSizes;
    }

    ScrollableKt$semanticsScrollBy$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1> continuation) {
        super(continuation);
    }
}
