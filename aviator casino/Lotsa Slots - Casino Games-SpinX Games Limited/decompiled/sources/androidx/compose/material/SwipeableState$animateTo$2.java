package androidx.compose.material;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Swipeable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "anchors", "", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableState$animateTo$2<T> implements kotlinx.coroutines.flow.FlowCollector<java.util.Map<java.lang.Float, ? extends T>> {
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> $anim;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ androidx.compose.material.SwipeableState<T> this$0;

    SwipeableState$animateTo$2(T t, androidx.compose.material.SwipeableState<T> swipeableState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.$targetValue = t;
        this.this$0 = swipeableState;
        this.$anim = animationSpec;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return emit((java.util.Map) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        int i;
        androidx.compose.material.SwipeableState$animateTo$2<T> swipeableState$animateTo$2;
        java.lang.Float offset;
        java.lang.Object animateInternalToOffset;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.Object firstOrNull;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.Object firstOrNull2;
        if (continuation instanceof androidx.compose.material.SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (androidx.compose.material.SwipeableState$animateTo$2$emit$1) continuation;
            if ((swipeableState$animateTo$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = swipeableState$animateTo$2$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = swipeableState$animateTo$2$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        offset = androidx.compose.material.SwipeableKt.getOffset(map, this.$targetValue);
                        if (offset == null) {
                            throw new java.lang.IllegalArgumentException("The target value must have an associated anchor.".toString());
                        }
                        androidx.compose.material.SwipeableState<T> swipeableState = this.this$0;
                        float floatValue = offset.floatValue();
                        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.$anim;
                        swipeableState$animateTo$2$emit$1.L$0 = this;
                        swipeableState$animateTo$2$emit$1.L$1 = map;
                        swipeableState$animateTo$2$emit$1.label = 1;
                        animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, animationSpec, swipeableState$animateTo$2$emit$1);
                        if (animateInternalToOffset == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        swipeableState$animateTo$2 = this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        swipeableState$animateTo$2 = this;
                        mutableState = ((androidx.compose.material.SwipeableState) swipeableState$animateTo$2.this$0).absoluteOffset;
                        float floatValue2 = ((java.lang.Number) mutableState.getValue()).floatValue();
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        for (java.util.Map.Entry<java.lang.Float, ? extends T> entry : map.entrySet()) {
                            if (java.lang.Math.abs(entry.getKey().floatValue() - floatValue2) < 0.5f) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        firstOrNull = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap.values());
                        if (firstOrNull == null) {
                            firstOrNull = swipeableState$animateTo$2.this$0.getCurrentValue();
                        }
                        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull);
                        throw th;
                    }
                } else if (i == 1) {
                    map = (java.util.Map) swipeableState$animateTo$2$emit$1.L$1;
                    swipeableState$animateTo$2 = (androidx.compose.material.SwipeableState$animateTo$2) swipeableState$animateTo$2$emit$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutableState = ((androidx.compose.material.SwipeableState) swipeableState$animateTo$2.this$0).absoluteOffset;
                        float floatValue22 = ((java.lang.Number) mutableState.getValue()).floatValue();
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        while (r7.hasNext()) {
                        }
                        firstOrNull = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap2.values());
                        if (firstOrNull == null) {
                        }
                        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull);
                        throw th;
                    }
                } else {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState2 = ((androidx.compose.material.SwipeableState) swipeableState$animateTo$2.this$0).absoluteOffset;
                float floatValue3 = ((java.lang.Number) mutableState2.getValue()).floatValue();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.Float, ? extends T> entry2 : map.entrySet()) {
                    if (java.lang.Math.abs(entry2.getKey().floatValue() - floatValue3) < 0.5f) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                firstOrNull2 = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap3.values());
                if (firstOrNull2 == null) {
                    firstOrNull2 = swipeableState$animateTo$2.this$0.getCurrentValue();
                }
                swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull2);
                return kotlin.Unit.INSTANCE;
            }
        }
        swipeableState$animateTo$2$emit$1 = new androidx.compose.material.SwipeableState$animateTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = swipeableState$animateTo$2$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$animateTo$2$emit$1.label;
        if (i != 0) {
        }
        mutableState2 = ((androidx.compose.material.SwipeableState) swipeableState$animateTo$2.this$0).absoluteOffset;
        float floatValue32 = ((java.lang.Number) mutableState2.getValue()).floatValue();
        java.util.LinkedHashMap linkedHashMap32 = new java.util.LinkedHashMap();
        while (r7.hasNext()) {
        }
        firstOrNull2 = kotlin.collections.CollectionsKt.firstOrNull(linkedHashMap32.values());
        if (firstOrNull2 == null) {
        }
        swipeableState$animateTo$2.this$0.setCurrentValue(firstOrNull2);
        return kotlin.Unit.INSTANCE;
    }
}
