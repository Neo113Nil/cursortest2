package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ java.lang.Object[] Camera2StreamConfigurationMap;

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(java.lang.Object[] objArr) {
        this.Camera2StreamConfigurationMap = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.AnonymousClass1 anonymousClass1;
        int i;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        int i2;
        int i3;
        java.lang.Object[] objArr;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = anonymousClass1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Object[] objArr2 = this.Camera2StreamConfigurationMap;
                    int length = objArr2.length;
                    flowCollector2 = flowCollector;
                    i2 = length;
                    i3 = 0;
                    objArr = objArr2;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    i3 = anonymousClass1.Camera2StreamConfigurationMap;
                    objArr = (java.lang.Object[]) anonymousClass1.getHighSpeedVideoFpsRanges;
                    kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.FlowCollector flowCollector4 = flowCollector3;
                    i3++;
                    flowCollector2 = flowCollector4;
                    if (i3 < i2) {
                        java.lang.Object obj2 = objArr[i3];
                        anonymousClass1.getHighSpeedVideoSizes = flowCollector2;
                        anonymousClass1.getHighSpeedVideoFpsRanges = objArr;
                        anonymousClass1.Camera2StreamConfigurationMap = i3;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = i2;
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                        java.lang.Object emit = flowCollector2.emit(obj2, anonymousClass1);
                        flowCollector4 = flowCollector2;
                        if (emit == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i3++;
                        flowCollector2 = flowCollector4;
                        if (i3 < i2) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.AnonymousClass1(continuation);
        java.lang.Object obj3 = anonymousClass1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getOutputMinFrameDuration = obj;
            this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
