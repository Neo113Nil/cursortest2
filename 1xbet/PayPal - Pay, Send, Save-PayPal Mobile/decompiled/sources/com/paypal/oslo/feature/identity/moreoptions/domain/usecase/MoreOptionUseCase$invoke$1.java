package com.paypal.oslo.feature.identity.moreoptions.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase", f = "MoreOptionUseCase.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {82, 89}, m = "invoke", n = {"currentOptionType", "cachedOptions", "withPassword", "isPasswordContext", "currentOptionType", "cachedOptions", "withPassword", "effectiveOptions", "isPasswordContext", "isBiometricEligible"}, nl = {83, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class MoreOptionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoreOptionUseCase$invoke$1(com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase moreOptionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = moreOptionUseCase;
    }
}
