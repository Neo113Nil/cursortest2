package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl", f = "ManageAccountRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {97}, m = "updateStatementDeliveryPreference", n = {"creditProductIdentifier", "creditAccountId", "mutation", "enrollInPaper"}, nl = {102}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.updateStatementDeliveryPreference(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl manageAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = manageAccountRepositoryImpl;
    }
}
