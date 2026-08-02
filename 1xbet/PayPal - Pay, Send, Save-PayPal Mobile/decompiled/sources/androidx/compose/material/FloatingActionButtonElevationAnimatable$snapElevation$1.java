package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {}, l = {com.knotapi.knot.utilities.Constants.ID_KROGER}, m = "snapElevation", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.FloatingActionButtonElevationAnimatable getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevationAnimatable$snapElevation$1(androidx.compose.material.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, kotlin.coroutines.Continuation<? super androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = floatingActionButtonElevationAnimatable;
    }
}
