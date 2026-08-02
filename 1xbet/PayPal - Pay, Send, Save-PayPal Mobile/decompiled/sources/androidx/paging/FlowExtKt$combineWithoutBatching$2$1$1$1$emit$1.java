package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", f = "FlowExt.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 136}, m = "emit", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1.AnonymousClass1<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = anonymousClass1;
    }
}
