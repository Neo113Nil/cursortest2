package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {868}, m = "onPostFling-RZ2iAVY", n = {"$v$c$androidx-compose-ui-unit-Velocity$-available$0"}, s = {"J$0"}, v = 1)
/* loaded from: classes6.dex */
final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1 Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.mo1528onPostFlingRZ2iAVY(0L, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }
}
