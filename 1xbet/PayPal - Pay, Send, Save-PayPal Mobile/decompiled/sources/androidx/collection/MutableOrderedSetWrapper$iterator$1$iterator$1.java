package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0}, l = {1489}, m = "invokeSuspend", n = {"$this$iterator", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$3", "I$0"})
/* loaded from: classes6.dex */
final class MutableOrderedSetWrapper$iterator$1$iterator$1<E> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.collection.MutableOrderedSetWrapper<E> getInputFormats;
    private /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ androidx.collection.MutableOrderedSetWrapper$iterator$1 getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        androidx.collection.MutableOrderedScatterSet mutableOrderedScatterSet;
        androidx.collection.MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$1;
        androidx.collection.MutableOrderedSetWrapper<E> mutableOrderedSetWrapper;
        long[] jArr;
        int i;
        androidx.collection.MutableOrderedScatterSet mutableOrderedScatterSet2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputFormats;
            mutableOrderedScatterSet = ((androidx.collection.MutableOrderedSetWrapper) this.getInputFormats).Camera2StreamConfigurationMap;
            androidx.collection.MutableOrderedScatterSet mutableOrderedScatterSet3 = mutableOrderedScatterSet;
            mutableOrderedSetWrapper$iterator$1 = this.getOutputMinFrameDuration;
            mutableOrderedSetWrapper = this.getInputFormats;
            jArr = mutableOrderedScatterSet3.nodes;
            i = mutableOrderedScatterSet3.tail;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getHighResolutionOutputSizeshNQ4ISI;
            jArr = (long[]) this.getHighSpeedVideoFpsRangesFor;
            mutableOrderedSetWrapper = (androidx.collection.MutableOrderedSetWrapper) this.getHighSpeedVideoSizes;
            mutableOrderedSetWrapper$iterator$1 = (androidx.collection.MutableOrderedSetWrapper$iterator$1) this.getHighSpeedVideoFpsRanges;
            sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            mutableOrderedSetWrapper$iterator$1.setCurrent(i);
            mutableOrderedScatterSet2 = ((androidx.collection.MutableOrderedSetWrapper) mutableOrderedSetWrapper).Camera2StreamConfigurationMap;
            java.lang.Object obj2 = mutableOrderedScatterSet2.elements[i];
            this.getOutputFormats = sequenceScope;
            this.getHighSpeedVideoFpsRanges = mutableOrderedSetWrapper$iterator$1;
            this.getHighSpeedVideoSizes = mutableOrderedSetWrapper;
            this.getHighSpeedVideoFpsRangesFor = jArr;
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
            this.Camera2StreamConfigurationMap = 1;
            if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = i3;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1(this.getInputFormats, this.getOutputMinFrameDuration, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.getOutputFormats = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableOrderedSetWrapper$iterator$1$iterator$1(androidx.collection.MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, androidx.collection.MutableOrderedSetWrapper$iterator$1 mutableOrderedSetWrapper$iterator$1, kotlin.coroutines.Continuation<? super androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1> continuation) {
        super(2, continuation);
        this.getInputFormats = mutableOrderedSetWrapper;
        this.getOutputMinFrameDuration = mutableOrderedSetWrapper$iterator$1;
    }
}
