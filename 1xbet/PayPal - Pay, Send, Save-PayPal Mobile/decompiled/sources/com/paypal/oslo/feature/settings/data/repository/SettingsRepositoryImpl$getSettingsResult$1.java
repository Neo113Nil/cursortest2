package com.paypal.oslo.feature.settings.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl", f = "SettingsRepositoryImpl.kt", i = {}, l = {63}, m = "getSettingsResult", n = {}, nl = {64}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsRepositoryImpl$getSettingsResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getSettingsResult(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsRepositoryImpl$getSettingsResult$1(com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl settingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getSettingsResult$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = settingsRepositoryImpl;
    }
}
