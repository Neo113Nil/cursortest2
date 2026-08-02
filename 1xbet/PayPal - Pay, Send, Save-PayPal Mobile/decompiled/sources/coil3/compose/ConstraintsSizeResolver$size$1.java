package coil3.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.compose.ConstraintsSizeResolver", f = "ConstraintsSizeResolver.kt", i = {0}, l = {77}, m = io.ktor.http.ContentDisposition.Parameters.Size, n = {"continuation"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class ConstraintsSizeResolver$size$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ coil3.compose.ConstraintsSizeResolver Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.size(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintsSizeResolver$size$1(coil3.compose.ConstraintsSizeResolver constraintsSizeResolver, kotlin.coroutines.Continuation<? super coil3.compose.ConstraintsSizeResolver$size$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = constraintsSizeResolver;
    }
}
