package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$publishEvent$1", f = "TaxListScreenViewModel.kt", i = {}, l = {127, 129, 134, 148}, m = "invokeSuspend", n = {}, nl = {129, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 135, 150}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TaxListScreenViewModel$publishEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r9.emit(new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax(((com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect.TaxSelected) r8.getHighResolutionOutputSizeshNQ4ISI).getTax()), r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r9.emit(new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax(((com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect.TaxSelected) r8.getHighResolutionOutputSizeshNQ4ISI).getTax()), r8) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r9.emit(com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.CreateTax.INSTANCE, r8) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (r9.emit(new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax(null), r8) == r0) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow4;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics itemLibraryAnalytics;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect taxEffect = this.getHighResolutionOutputSizeshNQ4ISI;
            if (taxEffect instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect.TaxSelected) {
                taxesPresentationMode2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                if (taxesPresentationMode2 instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select) {
                    mutableSharedFlow4 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = 1;
                } else {
                    mutableSharedFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = 2;
                }
            } else {
                if (kotlin.jvm.internal.Intrinsics.areEqual(taxEffect, com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect.AddTaxClicked.INSTANCE)) {
                    mutableSharedFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = 3;
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(taxEffect, com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect.ErrorBannerClosed.INSTANCE)) {
                        mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
                        mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(taxEffect, com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect.RetrySyncClicked.INSTANCE)) {
                        this.Camera2StreamConfigurationMap.refresh();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(taxEffect, com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect.EmptyTaxSelected.INSTANCE)) {
                        taxesPresentationMode = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                        if (taxesPresentationMode instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select) {
                            mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                            this.getHighSpeedVideoSizes = 4;
                        } else {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.businessinventory.LoggerKt.log, "TaxEffect.EmptyTaxSelected outside of TaxesPresentationMode.Select is unsupported", null, null, null, 14, null);
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    itemLibraryAnalytics = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                    itemLibraryAnalytics.logAddNewTax(com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin.TAX_LIST);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$publishEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$publishEvent$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxListScreenViewModel$publishEvent$1(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxEffect taxEffect, com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$publishEvent$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = taxEffect;
        this.Camera2StreamConfigurationMap = taxListScreenViewModel;
    }
}
