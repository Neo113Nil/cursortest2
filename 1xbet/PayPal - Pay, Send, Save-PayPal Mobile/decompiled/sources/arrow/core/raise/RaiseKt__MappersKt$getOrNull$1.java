package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__MappersKt", f = "Mappers.kt", i = {0}, l = {45}, m = "getOrNull", n = {"raise$iv$iv$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__MappersKt$getOrNull$1<Error, A> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return arrow.core.raise.RaiseKt.getOrNull(null, this);
    }

    RaiseKt__MappersKt$getOrNull$1(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__MappersKt$getOrNull$1> continuation) {
        super(continuation);
    }
}
