package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1", f = "GetAccountSettingsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {72}, m = "invokeSuspend$lambda$1$buildSection", n = {"$data", "strings", "this$0", "formattedName", "isAccountDiscoverable", "raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u241_u24buildSection_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetAccountSettingsUseCase$invoke$1$2$buildSection$2"}, nl = {79}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes14.dex */
final class GetAccountSettingsUseCase$invoke$1$2$buildSection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1.Camera2StreamConfigurationMap(null, null, null, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    GetAccountSettingsUseCase$invoke$1$2$buildSection$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1$2$buildSection$1> continuation) {
        super(continuation);
    }
}
