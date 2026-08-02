package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {337, 339, 385}, m = "detectZoom", n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", androidx.constraintlayout.motion.widget.Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", androidx.constraintlayout.motion.widget.Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "event", "panZoomLock", androidx.constraintlayout.motion.widget.Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED}, s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"}, v = 1)
/* loaded from: classes6.dex */
final class TransformableKt$detectZoom$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    long getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    boolean getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.TransformableKt.getHighResolutionOutputSizeshNQ4ISI(null, false, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    TransformableKt$detectZoom$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableKt$detectZoom$1> continuation) {
        super(continuation);
    }
}
