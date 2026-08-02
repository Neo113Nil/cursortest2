package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {}, l = {739}, m = "snapElevation", n = {}, s = {})
/* loaded from: classes6.dex */
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.FloatingActionButtonElevationAnimatable getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevationAnimatable$snapElevation$1(androidx.compose.material3.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, kotlin.coroutines.Continuation<? super androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = floatingActionButtonElevationAnimatable;
    }
}
