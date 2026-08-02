package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl", f = "AccountSetupRepositoryImpl.kt", i = {}, l = {47}, m = "getAccountSetupStatus", n = {}, nl = {52}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AccountSetupRepositoryImpl$getAccountSetupStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getAccountSetupStatus(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSetupRepositoryImpl$getAccountSetupStatus$1(com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl accountSetupRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl$getAccountSetupStatus$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = accountSetupRepositoryImpl;
    }
}
