package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0, 0}, l = {1454}, m = "invokeSuspend", n = {"$this$iterator", "elements$iv", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes6.dex */
final class OrderedSetWrapper$iterator$1<E> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.collection.OrderedSetWrapper<E> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        androidx.collection.OrderedScatterSet orderedScatterSet;
        java.lang.Object[] objArr;
        long[] jArr;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
            orderedScatterSet = ((androidx.collection.OrderedSetWrapper) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            objArr = orderedScatterSet.elements;
            jArr = orderedScatterSet.nodes;
            i = orderedScatterSet.tail;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.Camera2StreamConfigurationMap;
            jArr = (long[]) this.getHighSpeedVideoSizes;
            objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRanges;
            sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            java.lang.Object obj2 = objArr[i];
            this.getInputSizeshNQ4ISI = sequenceScope;
            this.getHighSpeedVideoFpsRanges = objArr;
            this.getHighSpeedVideoSizes = jArr;
            this.Camera2StreamConfigurationMap = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = i3;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.collection.OrderedSetWrapper$iterator$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.collection.OrderedSetWrapper$iterator$1 orderedSetWrapper$iterator$1 = new androidx.collection.OrderedSetWrapper$iterator$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        orderedSetWrapper$iterator$1.getInputSizeshNQ4ISI = obj;
        return orderedSetWrapper$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderedSetWrapper$iterator$1(androidx.collection.OrderedSetWrapper<E> orderedSetWrapper, kotlin.coroutines.Continuation<? super androidx.collection.OrderedSetWrapper$iterator$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = orderedSetWrapper;
    }
}
