package androidx.compose.material;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Swipeable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "anchors", "", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableState$snapTo$2<T> implements kotlinx.coroutines.flow.FlowCollector<java.util.Map<java.lang.Float, ? extends T>> {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ androidx.compose.material.SwipeableState<T> this$0;

    SwipeableState$snapTo$2(T t, androidx.compose.material.SwipeableState<T> swipeableState) {
        this.$targetValue = t;
        this.this$0 = swipeableState;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return emit((java.util.Map) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        int i;
        java.lang.Float offset;
        java.lang.Object snapInternalToOffset;
        androidx.compose.material.SwipeableState$snapTo$2<T> swipeableState$snapTo$2;
        if (continuation instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) continuation;
            if ((swipeableState$snapTo$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = swipeableState$snapTo$2$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableState$snapTo$2$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    offset = androidx.compose.material.SwipeableKt.getOffset(map, this.$targetValue);
                    if (offset == null) {
                        throw new java.lang.IllegalArgumentException("The target value must have an associated anchor.".toString());
                    }
                    androidx.compose.material.SwipeableState<T> swipeableState = this.this$0;
                    float floatValue = offset.floatValue();
                    swipeableState$snapTo$2$emit$1.L$0 = this;
                    swipeableState$snapTo$2$emit$1.label = 1;
                    snapInternalToOffset = swipeableState.snapInternalToOffset(floatValue, swipeableState$snapTo$2$emit$1);
                    if (snapInternalToOffset == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    swipeableState$snapTo$2 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    swipeableState$snapTo$2 = (androidx.compose.material.SwipeableState$snapTo$2) swipeableState$snapTo$2$emit$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                swipeableState$snapTo$2.this$0.setCurrentValue(swipeableState$snapTo$2.$targetValue);
                return kotlin.Unit.INSTANCE;
            }
        }
        swipeableState$snapTo$2$emit$1 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = swipeableState$snapTo$2$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$snapTo$2$emit$1.label;
        if (i != 0) {
        }
        swipeableState$snapTo$2.this$0.setCurrentValue(swipeableState$snapTo$2.$targetValue);
        return kotlin.Unit.INSTANCE;
    }
}
