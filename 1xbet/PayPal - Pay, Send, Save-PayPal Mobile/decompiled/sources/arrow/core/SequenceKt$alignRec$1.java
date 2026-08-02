package arrow.core;

/* JADX INFO: Add missing generic type declarations: [Z] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Z", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.SequenceKt$alignRec$1", f = "Sequence.kt", i = {0, 1, 2}, l = {327, com.visa.cbp.getCertUsage.setODAData, com.visa.cbp.getCertUsage.setAppPrgrmID}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "$this$sequence"}, s = {"L$0", "L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class SequenceKt$alignRec$1<Z> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super Z>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<X, Y, Z> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<Y, Z> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Iterator<X> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<X, Z> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.Iterator<Y> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    while (this.getHighSpeedVideoSizes.hasNext()) {
                        this.getInputSizeshNQ4ISI = sequenceScope;
                        this.getOutputFormats = 3;
                        if (sequenceScope.yield(this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.getHighSpeedVideoSizes.next()), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                while (true) {
                    if (this.getHighSpeedVideoFpsRanges.hasNext()) {
                        this.getInputSizeshNQ4ISI = sequenceScope;
                        this.getOutputFormats = 2;
                        if (sequenceScope.yield(this.getHighSpeedVideoFpsRangesFor.invoke(this.getHighSpeedVideoFpsRanges.next()), this) == coroutine_suspended) {
                            break;
                        }
                    }
                    while (this.getHighSpeedVideoSizes.hasNext()) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            sequenceScope = (kotlin.sequences.SequenceScope) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (true) {
            if (this.getHighSpeedVideoFpsRanges.hasNext() && this.getHighSpeedVideoSizes.hasNext()) {
                this.getInputSizeshNQ4ISI = sequenceScope;
                this.getOutputFormats = 1;
                if (sequenceScope.yield(this.Camera2StreamConfigurationMap.invoke(this.getHighSpeedVideoFpsRanges.next(), this.getHighSpeedVideoSizes.next()), this) == coroutine_suspended) {
                    break;
                }
            }
            while (true) {
                if (this.getHighSpeedVideoFpsRanges.hasNext()) {
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((arrow.core.SequenceKt$alignRec$1) create((kotlin.sequences.SequenceScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.SequenceKt$alignRec$1 sequenceKt$alignRec$1 = new arrow.core.SequenceKt$alignRec$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        sequenceKt$alignRec$1.getInputSizeshNQ4ISI = obj;
        return sequenceKt$alignRec$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SequenceKt$alignRec$1(java.util.Iterator<? extends X> it, java.util.Iterator<? extends Y> it2, kotlin.jvm.functions.Function2<? super X, ? super Y, ? extends Z> function2, kotlin.jvm.functions.Function1<? super X, ? extends Z> function1, kotlin.jvm.functions.Function1<? super Y, ? extends Z> function12, kotlin.coroutines.Continuation<? super arrow.core.SequenceKt$alignRec$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = it;
        this.getHighSpeedVideoSizes = it2;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
    }
}
