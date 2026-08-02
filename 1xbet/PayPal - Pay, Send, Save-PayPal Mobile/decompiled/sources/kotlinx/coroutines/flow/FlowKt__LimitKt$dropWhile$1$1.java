package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FlowKt__LimitKt$dropWhile$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r8.emit(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        int i;
        kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            if ((flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = flowKt__LimitKt$dropWhile$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoSizes.element) {
                        kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighSpeedVideoFpsRanges;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                    } else {
                        kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoSizes = this;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.Camera2StreamConfigurationMap = t;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoFpsRanges = 2;
                        obj = function2.invoke(t, flowKt__LimitKt$dropWhile$1$1$emit$1);
                        if (obj != coroutine_suspended) {
                            flowKt__LimitKt$dropWhile$1$1 = this;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                t = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.Camera2StreamConfigurationMap;
                flowKt__LimitKt$dropWhile$1$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                flowKt__LimitKt$dropWhile$1$1.getHighSpeedVideoSizes.element = true;
                kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = flowKt__LimitKt$dropWhile$1$1.getHighSpeedVideoFpsRanges;
                flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoSizes = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.Camera2StreamConfigurationMap = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoFpsRanges = 3;
            }
        }
        flowKt__LimitKt$dropWhile$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__LimitKt$dropWhile$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$dropWhile$1$1$emit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$dropWhile$1$1(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoSizes = booleanRef;
        this.getHighSpeedVideoFpsRanges = flowCollector;
        this.Camera2StreamConfigurationMap = function2;
    }
}
