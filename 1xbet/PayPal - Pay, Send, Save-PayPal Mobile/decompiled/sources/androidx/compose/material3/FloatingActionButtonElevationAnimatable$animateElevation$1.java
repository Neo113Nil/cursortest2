package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {753}, m = "animateElevation", n = {androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO}, s = {"L$0"})
/* loaded from: classes6.dex */
final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.material3.FloatingActionButtonElevationAnimatable Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevationAnimatable$animateElevation$1(androidx.compose.material3.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, kotlin.coroutines.Continuation<? super androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = floatingActionButtonElevationAnimatable;
    }
}
