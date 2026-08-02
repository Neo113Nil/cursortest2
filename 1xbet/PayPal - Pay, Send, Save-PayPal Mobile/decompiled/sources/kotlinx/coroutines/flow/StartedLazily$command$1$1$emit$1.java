package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {154}, m = "emit", n = {}, s = {})
/* loaded from: classes5.dex */
final class StartedLazily$command$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.StartedLazily$command$1.AnonymousClass1<T> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StartedLazily$command$1$1$emit$1(kotlinx.coroutines.flow.StartedLazily$command$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = anonymousClass1;
    }
}
