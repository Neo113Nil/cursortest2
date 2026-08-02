package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {125}, m = "emit", n = {}, s = {})
/* loaded from: classes17.dex */
final class CombineKt$zipImpl$1$1$2$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$zipImpl$1$1$2$1$emit$1(kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = anonymousClass1;
    }
}
