package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiState;", "taxes", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "showError", "", "isLoading"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$state$1", f = "TaxListScreenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TaxListScreenViewModel$state$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<java.util.List<? extends com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>, java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel Camera2StreamConfigurationMap;
    /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode;
        java.util.List list = (java.util.List) this.getHighSpeedVideoSizes;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z2 = this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            taxesPresentationMode = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            return new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState(taxesPresentationMode, list, z, z2);
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(java.util.List<? extends com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> list, java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState> continuation) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$state$1 taxListScreenViewModel$state$1 = new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$state$1(this.Camera2StreamConfigurationMap, continuation);
        taxListScreenViewModel$state$1.getHighSpeedVideoSizes = list;
        taxListScreenViewModel$state$1.getHighResolutionOutputSizeshNQ4ISI = booleanValue;
        taxListScreenViewModel$state$1.getHighSpeedVideoFpsRanges = booleanValue2;
        return taxListScreenViewModel$state$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxListScreenViewModel$state$1(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$state$1> continuation) {
        super(4, continuation);
        this.Camera2StreamConfigurationMap = taxListScreenViewModel;
    }
}
