package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 2, 2}, l = {154, 179, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "processNewAnchors$material", n = {"newAnchors", "targetOffset", "newAnchors", "targetOffset"}, s = {"L$0", "F$0", "L$0", "F$0"}, v = 1)
/* loaded from: classes.dex */
final class SwipeableState$processNewAnchors$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.processNewAnchors$material(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$processNewAnchors$1(androidx.compose.material.SwipeableState<T> swipeableState, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableState$processNewAnchors$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = swipeableState;
    }
}
