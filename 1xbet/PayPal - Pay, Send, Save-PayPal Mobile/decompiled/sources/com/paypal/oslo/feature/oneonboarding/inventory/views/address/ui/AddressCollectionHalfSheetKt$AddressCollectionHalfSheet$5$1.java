package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$5$1", f = "AddressCollectionHalfSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoFpsRanges.getVisible()) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap.populateInitialFields(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressFieldUtilsKt.toFieldMap(this.getHighSpeedVideoSizes.getInitialAddress()));
            }
        } else {
            this.Camera2StreamConfigurationMap.resetForm();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$5$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$5$1(com.paypal.pds.components.BottomSheetController bottomSheetController, boolean z, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig addressCollectionConfig, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionHalfSheetKt$AddressCollectionHalfSheet$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = addressCollectionViewModel;
        this.getHighSpeedVideoSizes = addressCollectionConfig;
    }
}
