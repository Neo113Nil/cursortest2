package arrow.core;

/* JADX INFO: Add missing generic type declarations: [A] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "A", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.SequenceKt$interleave$1", f = "Sequence.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {387, 388, 390, 391}, m = "invokeSuspend", n = {"$this$sequence", "lsIterator", "rsIterator", "$this$sequence", "lsIterator", "rsIterator", "$this$sequence", "rsIterator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class SequenceKt$interleave$1<A> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super A>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.sequences.Sequence<A> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.sequences.Sequence<A> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c2, code lost:
    
        if (r3.yieldAll(r1, r11) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r8.yield(r1.next(), r11) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009a -> B:18:0x009d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        java.util.Iterator<A> it;
        java.util.Iterator<A> it2;
        kotlin.sequences.SequenceScope sequenceScope2;
        java.util.Iterator<A> it3;
        java.util.Iterator<A> it4;
        kotlin.sequences.SequenceScope sequenceScope3;
        java.util.Iterator<A> it5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
            it = this.Camera2StreamConfigurationMap.iterator();
            it2 = this.getHighSpeedVideoFpsRanges.iterator();
            if (!it.hasNext()) {
            }
            this.getInputSizeshNQ4ISI = sequenceScope;
            this.getHighSpeedVideoFpsRangesFor = it2;
            this.getHighSpeedVideoSizes = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
            if (sequenceScope.yieldAll(it, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            it4 = (java.util.Iterator) this.getHighSpeedVideoSizes;
            it3 = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
            sequenceScope2 = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = sequenceScope2;
            this.getHighSpeedVideoFpsRangesFor = it3;
            this.getHighSpeedVideoSizes = it4;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        } else {
            if (i == 2) {
                it4 = (java.util.Iterator) this.getHighSpeedVideoSizes;
                it3 = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
                sequenceScope2 = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                sequenceScope = sequenceScope2;
                java.util.Iterator<A> it6 = it3;
                it2 = it4;
                it = it6;
                if (!it.hasNext() && it2.hasNext()) {
                    this.getInputSizeshNQ4ISI = sequenceScope;
                    this.getHighSpeedVideoFpsRangesFor = it;
                    this.getHighSpeedVideoSizes = it2;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (sequenceScope.yield(it.next(), this) != coroutine_suspended) {
                        sequenceScope2 = sequenceScope;
                        java.util.Iterator<A> it7 = it2;
                        it3 = it;
                        it4 = it7;
                        this.getInputSizeshNQ4ISI = sequenceScope2;
                        this.getHighSpeedVideoFpsRangesFor = it3;
                        this.getHighSpeedVideoSizes = it4;
                        this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    }
                } else {
                    this.getInputSizeshNQ4ISI = sequenceScope;
                    this.getHighSpeedVideoFpsRangesFor = it2;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 3;
                    if (sequenceScope.yieldAll(it, this) != coroutine_suspended) {
                        sequenceScope3 = sequenceScope;
                        it5 = it2;
                        this.getInputSizeshNQ4ISI = null;
                        this.getHighSpeedVideoFpsRangesFor = null;
                        this.getHighResolutionOutputSizeshNQ4ISI = 4;
                    }
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            it5 = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
            sequenceScope3 = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((arrow.core.SequenceKt$interleave$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.SequenceKt$interleave$1 sequenceKt$interleave$1 = new arrow.core.SequenceKt$interleave$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        sequenceKt$interleave$1.getInputSizeshNQ4ISI = obj;
        return sequenceKt$interleave$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequenceKt$interleave$1(kotlin.sequences.Sequence<? extends A> sequence, kotlin.sequences.Sequence<? extends A> sequence2, kotlin.coroutines.Continuation<? super arrow.core.SequenceKt$interleave$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sequence;
        this.getHighSpeedVideoFpsRanges = sequence2;
    }
}
