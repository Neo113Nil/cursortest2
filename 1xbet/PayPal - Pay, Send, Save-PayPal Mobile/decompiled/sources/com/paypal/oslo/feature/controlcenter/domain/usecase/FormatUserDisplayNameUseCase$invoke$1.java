package com.paypal.oslo.feature.controlcenter.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase", f = "FormatUserDisplayNameUseCase.kt", i = {0, 0, 0}, l = {66}, m = "invoke", n = {"userProfile", "nameInput", "hasNoStructuredNameComponents"}, nl = {69}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class FormatUserDisplayNameUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormatUserDisplayNameUseCase$invoke$1(com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase formatUserDisplayNameUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = formatUserDisplayNameUseCase;
    }
}
