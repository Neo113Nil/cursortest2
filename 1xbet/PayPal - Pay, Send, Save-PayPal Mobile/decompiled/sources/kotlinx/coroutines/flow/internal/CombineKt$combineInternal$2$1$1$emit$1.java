package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
/* loaded from: classes5.dex */
final class CombineKt$combineInternal$2$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C02171<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$combineInternal$2$1$1$emit$1(kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C02171<? super T> c02171, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = c02171;
    }
}
