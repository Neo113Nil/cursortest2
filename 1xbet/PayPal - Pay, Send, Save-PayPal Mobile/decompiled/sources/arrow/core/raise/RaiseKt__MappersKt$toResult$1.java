package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__MappersKt", f = "Mappers.kt", i = {}, l = {35}, m = "toResult", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__MappersKt$toResult$1<Error, A> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        java.lang.Object result = arrow.core.raise.RaiseKt.toResult(null, null, this);
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Result.m23435boximpl(result);
    }

    RaiseKt__MappersKt$toResult$1(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__MappersKt$toResult$1> continuation) {
        super(continuation);
    }
}
