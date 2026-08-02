package com.paypal.oslo.feature.pushnotification.preferences.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase", f = "UpdatePreferencesUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {29, 33}, m = "invoke", n = {"pushNotificationPreferences", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UpdatePreferencesUseCase$invoke$2", "pushNotificationPreferences", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "deviceId", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UpdatePreferencesUseCase$invoke$2"}, nl = {30, 34}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class UpdatePreferencesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase getOutputSizes;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatePreferencesUseCase$invoke$1(com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase updatePreferencesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizes = updatePreferencesUseCase;
    }
}
