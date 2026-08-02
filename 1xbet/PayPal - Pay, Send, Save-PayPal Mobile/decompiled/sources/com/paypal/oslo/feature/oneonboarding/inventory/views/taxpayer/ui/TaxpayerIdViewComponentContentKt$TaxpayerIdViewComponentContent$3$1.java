package com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentContentKt$TaxpayerIdViewComponentContent$3$1", f = "TaxpayerIdViewComponentContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class TaxpayerIdViewComponentContentKt$TaxpayerIdViewComponentContent$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.String, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption taxpayerIdOption = this.getHighSpeedVideoFpsRanges;
        if (taxpayerIdOption != null) {
            kotlin.jvm.functions.Function2<java.lang.String, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType, kotlin.Unit> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String taxId = taxpayerIdOption.getTaxId();
            if (taxId == null) {
                taxId = "";
            }
            function2.invoke(taxId, this.getHighSpeedVideoFpsRanges.getType());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentContentKt$TaxpayerIdViewComponentContent$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentContentKt$TaxpayerIdViewComponentContent$3$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaxpayerIdViewComponentContentKt$TaxpayerIdViewComponentContent$3$1(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption taxpayerIdOption, kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentContentKt$TaxpayerIdViewComponentContent$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = taxpayerIdOption;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
