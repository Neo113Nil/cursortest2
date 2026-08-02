package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it"}, k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", f = "FlowExt.kt", i = {}, l = {86, 86}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class FlowExtKt$simpleFlatMapLatest$1<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, (kotlinx.coroutines.flow.Flow) r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r6 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = flowCollector;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = function2.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes, (kotlinx.coroutines.flow.Flow) this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.Camera2StreamConfigurationMap, this), this);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.FlowExtKt$simpleFlatMapLatest$1 flowExtKt$simpleFlatMapLatest$1 = new androidx.paging.FlowExtKt$simpleFlatMapLatest$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        flowExtKt$simpleFlatMapLatest$1.getHighSpeedVideoSizes = flowCollector;
        flowExtKt$simpleFlatMapLatest$1.Camera2StreamConfigurationMap = t;
        return flowExtKt$simpleFlatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return invoke((kotlinx.coroutines.flow.FlowCollector) obj, (kotlinx.coroutines.flow.FlowCollector<? super R>) obj2, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleFlatMapLatest$1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$simpleFlatMapLatest$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
