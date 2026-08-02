package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase", f = "SetAsDefaultIfNeededUseCase.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5}, l = {72, 78, 81, 85, 89, 74}, m = "setAsDefaultIfNeeded", n = {"$this$setAsDefaultIfNeeded", "state", "setAsDefault", "cardActivated", "$this$setAsDefaultIfNeeded", "state", "setAsDefault", "cardActivated", "this_$iv", "$i$f$fold", "shouldSet", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$3", "$this$setAsDefaultIfNeeded", "state", "setAsDefault", "cardActivated", "this_$iv", "this_$iv", "error", "$i$f$fold", "shouldSet", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$3", "$i$f$fold", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$3$1", "$this$setAsDefaultIfNeeded", "state", "setAsDefault", "cardActivated", "this_$iv", "this_$iv", "error", "$i$f$fold", "shouldSet", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$3", "$i$f$fold", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$3$1", "$this$setAsDefaultIfNeeded", "state", "setAsDefault", "cardActivated", "this_$iv", "this_$iv", "error", "$i$f$fold", "shouldSet", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$3", "$i$f$fold", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$3$1", "$this$setAsDefaultIfNeeded", "state", "setAsDefault", "cardActivated", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$2"}, nl = {140, 142, 85, 89, 80, 75}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "Z$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "Z$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "Z$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase.access$setAsDefaultIfNeeded(this.getOutputStallDuration, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$setAsDefaultIfNeeded$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = setAsDefaultIfNeededUseCase;
    }
}
