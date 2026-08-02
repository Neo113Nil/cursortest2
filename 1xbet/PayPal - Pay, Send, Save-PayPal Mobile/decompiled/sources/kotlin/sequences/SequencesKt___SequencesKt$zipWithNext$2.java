package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0, 0}, l = {3000}, m = "invokeSuspend", n = {"$this$result", "iterator", "current", io.ktor.http.LinkHeader.Rel.Next}, nl = {3001}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$zipWithNext$2<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.sequences.Sequence<T> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, T, R> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        java.lang.Object next;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.Camera2StreamConfigurationMap.iterator();
            if (!it.hasNext()) {
                return kotlin.Unit.INSTANCE;
            }
            next = it.next();
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.getHighSpeedVideoSizes;
            it = (java.util.Iterator) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            java.lang.Object next2 = it.next();
            this.getInputSizeshNQ4ISI = sequenceScope;
            this.getHighResolutionOutputSizeshNQ4ISI = it;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
            this.getHighSpeedVideoSizes = next2;
            this.getHighSpeedVideoSizesFor = 1;
            if (sequenceScope.yield(this.getHighSpeedVideoFpsRangesFor.invoke(next, next2), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            next = next2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        sequencesKt___SequencesKt$zipWithNext$2.getInputSizeshNQ4ISI = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$zipWithNext$2(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends R> function2, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sequence;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
