package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    private java.lang.Object getHighSpeedVideoFpsRanges(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollableNode.getHighSpeedVideoSizes((androidx.compose.foundation.gestures.ScrollableNode) this.receiver, j);
        return highSpeedVideoSizes;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.unit.Velocity velocity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return getHighSpeedVideoFpsRanges(velocity.getGetHighSpeedVideoSizes(), continuation);
    }

    ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(java.lang.Object obj) {
        super(2, obj, androidx.compose.foundation.gestures.ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }
}
