package kotlinx.coroutines.flow;

/* compiled from: Transform.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FlowKt__TransformKt$chunked$2$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.ArrayList<T>> $result;
    final /* synthetic */ int $size;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$chunked$2$1(kotlin.jvm.internal.Ref.ObjectRef<java.util.ArrayList<T>> objectRef, int i, kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends T>> flowCollector) {
        this.$result = objectRef;
        this.$size = i;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 flowKt__TransformKt$chunked$2$1$emit$1;
        int i;
        kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1<T> flowKt__TransformKt$chunked$2$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) {
            flowKt__TransformKt$chunked$2$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) continuation;
            if ((flowKt__TransformKt$chunked$2$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$chunked$2$1$emit$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = flowKt__TransformKt$chunked$2$1$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$chunked$2$1$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.ArrayList arrayList = (T) ((java.util.ArrayList) ((java.util.ArrayList<T>) this.$result.element));
                    java.util.ArrayList arrayList2 = arrayList;
                    if (arrayList == null) {
                        T t2 = (T) new java.util.ArrayList(this.$size);
                        this.$result.element = t2;
                        arrayList2 = t2;
                    }
                    arrayList2.add(t);
                    if (arrayList2.size() == this.$size) {
                        kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>> flowCollector = this.$this_flow;
                        flowKt__TransformKt$chunked$2$1$emit$1.L$0 = this;
                        flowKt__TransformKt$chunked$2$1$emit$1.label = 1;
                        if (flowCollector.emit(arrayList2, flowKt__TransformKt$chunked$2$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowKt__TransformKt$chunked$2$1 = this;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowKt__TransformKt$chunked$2$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1) flowKt__TransformKt$chunked$2$1$emit$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                flowKt__TransformKt$chunked$2$1.$result.element = null;
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__TransformKt$chunked$2$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__TransformKt$chunked$2$1$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$chunked$2$1$emit$1.label;
        if (i != 0) {
        }
        flowKt__TransformKt$chunked$2$1.$result.element = null;
        return kotlin.Unit.INSTANCE;
    }
}
