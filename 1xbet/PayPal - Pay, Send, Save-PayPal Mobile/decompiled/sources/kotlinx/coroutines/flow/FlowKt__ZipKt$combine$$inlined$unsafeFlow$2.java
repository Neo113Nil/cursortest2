package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements kotlinx.coroutines.flow.Flow<R> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow[] Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighResolutionOutputSizeshNQ4ISI;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(kotlinx.coroutines.flow.Flow[] flowArr, kotlin.jvm.functions.Function2 function2) {
        this.Camera2StreamConfigurationMap = flowArr;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.Flow[] flowArr = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1(this.Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$5$1, new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2(this.getHighResolutionOutputSizeshNQ4ISI, null), continuation);
        return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1
            int Camera2StreamConfigurationMap;
            /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighResolutionOutputSizeshNQ4ISI = obj;
                this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.collect(null, this);
            }
        };
        kotlinx.coroutines.flow.Flow[] flowArr = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1 flowKt__ZipKt$combine$5$1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$1(this.Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$5$1, new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2(this.getHighResolutionOutputSizeshNQ4ISI, null), continuation);
        return kotlin.Unit.INSTANCE;
    }
}
