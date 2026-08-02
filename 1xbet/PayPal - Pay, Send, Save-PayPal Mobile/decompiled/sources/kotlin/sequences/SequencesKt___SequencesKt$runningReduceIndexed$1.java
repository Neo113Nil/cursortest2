package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [S] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "S", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2530, 2534}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, nl = {2531, 2537}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$runningReduceIndexed$1<S> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super S>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, S, T, S> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.sequences.Sequence<T> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r0.yield(r2, r8) != r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        java.lang.Object next;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        int i2 = 1;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.getHighSpeedVideoSizes.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.getOutputFormats = sequenceScope;
                this.getHighSpeedVideoFpsRangesFor = it;
                this.getHighResolutionOutputSizeshNQ4ISI = next;
                this.getInputSizeshNQ4ISI = 1;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.Camera2StreamConfigurationMap;
        }
        next = this.getHighResolutionOutputSizeshNQ4ISI;
        it = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        while (it.hasNext()) {
            kotlin.jvm.functions.Function3<java.lang.Integer, S, T, S> function3 = this.getHighSpeedVideoFpsRanges;
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            next = function3.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i2), next, it.next());
            this.getOutputFormats = sequenceScope;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getHighResolutionOutputSizeshNQ4ISI = next;
            this.Camera2StreamConfigurationMap = i3;
            this.getInputSizeshNQ4ISI = 2;
            if (sequenceScope.yield(next, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i3;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        sequencesKt___SequencesKt$runningReduceIndexed$1.getOutputFormats = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningReduceIndexed$1(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super T, ? extends S> function3, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = sequence;
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
