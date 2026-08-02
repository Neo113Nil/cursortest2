package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", i = {0}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.MIGRATION_SYSTEM_ERROR}, m = "onPreFling-QWom1Mo", n = {"$v$c$androidx-compose-ui-unit-Velocity$-available$0"}, s = {"J$0"}, v = 1)
/* loaded from: classes6.dex */
final class BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.mo1753onPreFlingQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1(androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, kotlin.coroutines.Continuation<? super androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1;
    }
}
