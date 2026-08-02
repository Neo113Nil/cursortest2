package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1, 1}, l = {2472, 2477}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element", "index"}, nl = {2473, 2479}, s = {"L$0", "L$0", "L$1", "L$3", "I$0"}, v = 2)
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$runningFoldIndexed$1<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.sequences.Sequence<T> Camera2StreamConfigurationMap;
    final /* synthetic */ R getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, R, T, R> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        if (r0.yield(r8.getHighResolutionOutputSizeshNQ4ISI, r8) != r1) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.Iterator it;
        int i;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputFormats;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = sequenceScope;
            this.getOutputFormats = 1;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.getHighSpeedVideoSizes;
                it = (java.util.Iterator) this.getHighSpeedVideoSizesFor;
                obj2 = this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.functions.Function3<java.lang.Integer, R, T, R> function3 = this.getHighSpeedVideoFpsRanges;
                    int i3 = i + 1;
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    obj2 = function3.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i), obj2, next);
                    this.getInputFormats = sequenceScope;
                    this.getHighSpeedVideoFpsRangesFor = obj2;
                    this.getHighSpeedVideoSizesFor = it;
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                    this.getHighSpeedVideoSizes = i3;
                    this.getOutputFormats = 2;
                    if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = i3;
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
        it = this.Camera2StreamConfigurationMap.iterator();
        i = 0;
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        sequencesKt___SequencesKt$runningFoldIndexed$1.getInputFormats = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$runningFoldIndexed$1(R r, kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super T, ? extends R> function3, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = r;
        this.Camera2StreamConfigurationMap = sequence;
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
