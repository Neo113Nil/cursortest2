package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {0, 0, 1, 1}, l = {102, 104}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "$this$sequence", "iterator"}, nl = {104, 106}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes3.dex */
final class SequencesKt__SequencesKt$ifEmpty$1<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.sequences.Sequence<T>> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.sequences.Sequence<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.yieldAll(r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r0.yieldAll(r6.Camera2StreamConfigurationMap.invoke(), r6) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Iterator<? extends T> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            if (it.hasNext()) {
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(it);
                this.getHighSpeedVideoFpsRangesFor = 1;
            } else {
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sequenceScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(it);
                this.getHighSpeedVideoFpsRangesFor = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        sequencesKt__SequencesKt$ifEmpty$1.getHighSpeedVideoSizes = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$ifEmpty$1(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function0<? extends kotlin.sequences.Sequence<? extends T>> function0, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = sequence;
        this.Camera2StreamConfigurationMap = function0;
    }
}
