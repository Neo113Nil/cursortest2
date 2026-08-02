package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0, 0, 0}, l = {383}, m = "invokeSuspend", n = {"$this$sequence", "element", "result", "index"}, nl = {385}, s = {"L$0", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes3.dex */
final class SequencesKt__SequencesKt$flatMapIndexed$1<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<C, java.util.Iterator<R>> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.sequences.Sequence<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, T, C> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        int i;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            it = this.getHighSpeedVideoFpsRanges.iterator();
            i = 0;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getHighResolutionOutputSizeshNQ4ISI;
            it = (java.util.Iterator) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.functions.Function2<java.lang.Integer, T, C> function2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.lang.Object invoke = function2.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i), next);
            this.getInputSizeshNQ4ISI = sequenceScope;
            this.getHighSpeedVideoSizes = it;
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoke);
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
            this.getHighSpeedVideoSizesFor = 1;
            if (sequenceScope.yieldAll(this.Camera2StreamConfigurationMap.invoke(invoke), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = i3;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.getInputSizeshNQ4ISI = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$flatMapIndexed$1(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> function2, kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> function1, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = sequence;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.Camera2StreamConfigurationMap = function1;
    }
}
