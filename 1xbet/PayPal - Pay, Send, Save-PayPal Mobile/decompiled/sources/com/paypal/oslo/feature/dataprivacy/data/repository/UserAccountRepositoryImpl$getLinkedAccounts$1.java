package com.paypal.oslo.feature.dataprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl", f = "UserAccountRepositoryImpl.kt", i = {0}, l = {40}, m = "getLinkedAccounts", n = {"partyId"}, nl = {53}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class UserAccountRepositoryImpl$getLinkedAccounts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getLinkedAccounts(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAccountRepositoryImpl$getLinkedAccounts$1(com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl userAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.repository.UserAccountRepositoryImpl$getLinkedAccounts$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = userAccountRepositoryImpl;
    }
}
