package arrow.core;

/* JADX INFO: Add missing generic type declarations: [A] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "A", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.SequenceKt$filterOption$1", f = "Sequence.kt", i = {0}, l = {757}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class SequenceKt$filterOption$1<A> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super A>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.sequences.Sequence<arrow.core.Option<A>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        java.util.Iterator<arrow.core.Option<A>> it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRanges;
            it = this.getHighSpeedVideoSizes.iterator();
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.getHighSpeedVideoFpsRangesFor;
            sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            arrow.core.Option<A> next = it.next();
            if (!(next instanceof arrow.core.None)) {
                if (next instanceof arrow.core.Some) {
                    java.lang.Object value = ((arrow.core.Some) next).getValue();
                    this.getHighSpeedVideoFpsRanges = sequenceScope;
                    this.getHighSpeedVideoFpsRangesFor = it;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (sequenceScope.yield(value, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((arrow.core.SequenceKt$filterOption$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.SequenceKt$filterOption$1 sequenceKt$filterOption$1 = new arrow.core.SequenceKt$filterOption$1(this.getHighSpeedVideoSizes, continuation);
        sequenceKt$filterOption$1.getHighSpeedVideoFpsRanges = obj;
        return sequenceKt$filterOption$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequenceKt$filterOption$1(kotlin.sequences.Sequence<? extends arrow.core.Option<? extends A>> sequence, kotlin.coroutines.Continuation<? super arrow.core.SequenceKt$filterOption$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = sequence;
    }
}
