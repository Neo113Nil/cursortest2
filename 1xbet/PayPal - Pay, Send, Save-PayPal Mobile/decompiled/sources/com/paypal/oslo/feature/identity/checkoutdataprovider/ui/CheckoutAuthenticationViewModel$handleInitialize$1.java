package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleInitialize$1", f = "CheckoutAuthenticationViewModel.kt", i = {}, l = {64, 71}, m = "invokeSuspend", n = {}, nl = {66, 74}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CheckoutAuthenticationViewModel$handleInitialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r5.send(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.NavigateToAuthenticate.INSTANCE, r4) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage;
        com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            identityTokenStorage = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = identityTokenStorage.getUserAccessToken(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (obj == null) {
            checkoutInputDataStore = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            checkoutInputDataStore.setCheckoutInputData(this.Camera2StreamConfigurationMap.getCheckoutAuthenticationContext().getCheckoutInputData());
            channel = this.getHighSpeedVideoSizes.getInputFormats;
            this.getHighSpeedVideoFpsRanges = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleInitialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleInitialize$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutAuthenticationViewModel$handleInitialize$1(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel checkoutAuthenticationViewModel, com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize initialize, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleInitialize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = checkoutAuthenticationViewModel;
        this.Camera2StreamConfigurationMap = initialize;
    }
}
