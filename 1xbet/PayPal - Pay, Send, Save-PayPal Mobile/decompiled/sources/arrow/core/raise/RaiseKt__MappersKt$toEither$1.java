package arrow.core.raise;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__MappersKt", f = "Mappers.kt", i = {0}, l = {13}, m = "toEither", n = {"raise$iv$iv$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__MappersKt$toEither$1<Error, A> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return arrow.core.raise.RaiseKt.toEither(null, this);
    }

    RaiseKt__MappersKt$toEither$1(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__MappersKt$toEither$1> continuation) {
        super(continuation);
    }
}
