package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/core/userstore/model/UserState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.adobe.AdobeInitializer$create$1", f = "AdobeInitializer.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"it"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class AdobeInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.userstore.model.UserState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userState);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.onUpdateIdentities(userState, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.telemetry.vendors.adobe.AdobeInitializer$create$1) create(userState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.telemetry.vendors.adobe.AdobeInitializer$create$1 adobeInitializer$create$1 = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeInitializer$create$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        adobeInitializer$create$1.getHighSpeedVideoFpsRanges = obj;
        return adobeInitializer$create$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdobeInitializer$create$1(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager adobeIdentitiesManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.adobe.AdobeInitializer$create$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = adobeIdentitiesManager;
    }
}
