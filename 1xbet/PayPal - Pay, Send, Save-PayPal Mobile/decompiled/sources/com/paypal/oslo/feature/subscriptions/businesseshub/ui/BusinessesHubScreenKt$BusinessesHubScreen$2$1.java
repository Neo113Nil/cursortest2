package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$2$1", f = "BusinessesHubScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BusinessesHubScreenKt$BusinessesHubScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult agreementUpdatedNavResult = (com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (agreementUpdatedNavResult.getRefreshNeeded()) {
            this.getHighSpeedVideoFpsRanges.loadBusinessAgreements();
        }
        if (agreementUpdatedNavResult.getClearCacheNeeded()) {
            this.getHighSpeedVideoFpsRanges.clearBulkFINavigationCache();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult agreementUpdatedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$2$1) create(agreementUpdatedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$2$1 businessesHubScreenKt$BusinessesHubScreen$2$1 = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$2$1(this.getHighSpeedVideoFpsRanges, continuation);
        businessesHubScreenKt$BusinessesHubScreen$2$1.getHighSpeedVideoSizes = obj;
        return businessesHubScreenKt$BusinessesHubScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessesHubScreenKt$BusinessesHubScreen$2$1(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = businessesHubViewModel;
    }
}
