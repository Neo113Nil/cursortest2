package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ java.lang.Object[] getHighSpeedVideoSizes;

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(java.lang.Object[] objArr) {
        this.getHighSpeedVideoSizes = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0061 -> B:10:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        int i;
        int i2;
        kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1<T> flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        int length;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = anonymousClass1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = this;
                    flowCollector2 = flowCollector;
                    length = this.getHighSpeedVideoSizes.length;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = anonymousClass1.getHighSpeedVideoFpsRanges;
                    i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.Camera2StreamConfigurationMap;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.FlowCollector flowCollector4 = flowCollector3;
                    i2++;
                    flowCollector2 = flowCollector4;
                    if (i2 < length) {
                        java.lang.Object obj2 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.getHighSpeedVideoSizes[i2];
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
                        anonymousClass1.Camera2StreamConfigurationMap = flowCollector2;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = i2;
                        anonymousClass1.getHighSpeedVideoFpsRanges = length;
                        anonymousClass1.getHighSpeedVideoSizes = 1;
                        java.lang.Object emit = flowCollector2.emit(obj2, anonymousClass1);
                        flowCollector4 = flowCollector2;
                        if (emit == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        flowCollector2 = flowCollector4;
                        if (i2 < length) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj3 = anonymousClass1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {110}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getOutputMinFrameDuration = obj;
            this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.this.collect(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
