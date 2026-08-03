package kotlinx.coroutines.flow;

/* compiled from: Limit.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FlowKt__LimitKt$take$2$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ java.lang.Object $ownershipMarker;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$take$2$1(kotlin.jvm.internal.Ref.IntRef intRef, int i, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, java.lang.Object obj) {
        this.$consumed = intRef;
        this.$count = i;
        this.$this_flow = flowCollector;
        this.$ownershipMarker = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        int i;
        java.lang.Object emitAbort$FlowKt__LimitKt;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) continuation;
            if ((flowKt__LimitKt$take$2$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = flowKt__LimitKt$take$2$1$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$take$2$1$emit$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.$consumed.element++;
                if (this.$consumed.element >= this.$count) {
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.$this_flow;
                    java.lang.Object obj2 = this.$ownershipMarker;
                    flowKt__LimitKt$take$2$1$emit$1.label = 2;
                    emitAbort$FlowKt__LimitKt = kotlinx.coroutines.flow.FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(flowCollector, t, obj2, flowKt__LimitKt$take$2$1$emit$1);
                    if (emitAbort$FlowKt__LimitKt == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = this.$this_flow;
                flowKt__LimitKt$take$2$1$emit$1.label = 1;
                if (flowCollector2.emit(t, flowKt__LimitKt$take$2$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__LimitKt$take$2$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        java.lang.Object obj3 = flowKt__LimitKt$take$2$1$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$take$2$1$emit$1.label;
        if (i == 0) {
        }
    }
}
