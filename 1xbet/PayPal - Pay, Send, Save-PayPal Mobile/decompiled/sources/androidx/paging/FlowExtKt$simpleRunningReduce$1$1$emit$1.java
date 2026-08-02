package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", i = {}, l = {68, 70}, m = "emit", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class FlowExtKt$simpleRunningReduce$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.FlowExtKt$simpleRunningReduce$1.AnonymousClass1<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$simpleRunningReduce$1$1$emit$1(androidx.paging.FlowExtKt$simpleRunningReduce$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = anonymousClass1;
    }
}
