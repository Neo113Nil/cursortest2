package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2444, 2448}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element"}, nl = {2445, 2450}, s = {"L$0", "L$0", "L$1", "L$3"}, v = 2)
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$runningFold$1<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ R Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<R, T, R> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.sequences.Sequence<T> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r0.yield(r6.Camera2StreamConfigurationMap, r6) != r1) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.Iterator it;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = sequenceScope;
            this.getOutputFormats = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) this.getHighSpeedVideoSizes;
                obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    obj2 = this.getHighSpeedVideoFpsRanges.invoke(obj2, next);
                    this.getInputFormats = sequenceScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = obj2;
                    this.getHighSpeedVideoSizes = it;
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                    this.getOutputFormats = 2;
                    if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        obj2 = this.Camera2StreamConfigurationMap;
        it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.sequences.SequencesKt___SequencesKt$runningFold$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.sequences.SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new kotlin.sequences.SequencesKt___SequencesKt$runningFold$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        sequencesKt___SequencesKt$runningFold$1.getInputFormats = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningFold$1(R r, kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> function2, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt___SequencesKt$runningFold$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = r;
        this.getHighSpeedVideoFpsRangesFor = sequence;
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
