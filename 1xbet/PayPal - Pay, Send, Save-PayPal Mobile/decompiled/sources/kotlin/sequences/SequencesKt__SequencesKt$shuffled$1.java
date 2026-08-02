package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"$this$sequence", "buffer", "last", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "j"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes3.dex */
final class SequencesKt__SequencesKt$shuffled$1<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.random.Random Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.sequences.Sequence<T> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List mutableList;
        kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableList = kotlin.sequences.SequencesKt.toMutableList(this.getHighSpeedVideoSizes);
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableList = (java.util.List) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (!mutableList.isEmpty()) {
            int nextInt = this.Camera2StreamConfigurationMap.nextInt(mutableList.size());
            java.lang.Object removeLast = kotlin.collections.CollectionsKt.removeLast(mutableList);
            java.lang.Object obj2 = nextInt < mutableList.size() ? mutableList.set(nextInt, removeLast) : removeLast;
            this.getInputFormats = sequenceScope;
            this.getHighSpeedVideoFpsRangesFor = mutableList;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(removeLast);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.getHighSpeedVideoFpsRanges = nextInt;
            this.getHighSpeedVideoSizesFor = 1;
            if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.sequences.SequencesKt__SequencesKt$shuffled$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.sequences.SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new kotlin.sequences.SequencesKt__SequencesKt$shuffled$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        sequencesKt__SequencesKt$shuffled$1.getInputFormats = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt__SequencesKt$shuffled$1(kotlin.sequences.Sequence<? extends T> sequence, kotlin.random.Random random, kotlin.coroutines.Continuation<? super kotlin.sequences.SequencesKt__SequencesKt$shuffled$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = sequence;
        this.Camera2StreamConfigurationMap = random;
    }
}
