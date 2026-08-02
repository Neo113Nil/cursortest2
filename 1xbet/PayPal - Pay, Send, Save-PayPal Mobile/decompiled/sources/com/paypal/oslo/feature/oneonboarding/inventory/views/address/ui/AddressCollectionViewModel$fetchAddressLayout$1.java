package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$fetchAddressLayout$1", f = "AddressCollectionViewModel.kt", i = {0}, l = {199}, m = "invokeSuspend", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY}, nl = {201}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionViewModel$fetchAddressLayout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Locale getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, 115, null);
            getAddressLayoutUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
            this.getHighSpeedVideoSizes = 1;
            obj = com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.invoke$default(getAddressLayoutUseCase, null, addressConfiguration, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = addressCollectionViewModel.getHighSpeedVideoSizesFor;
            mutableStateFlow2.setValue(addressLayout);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.i18n.domain.model.AddressFormattingError addressFormattingError = (com.paypal.oslo.core.i18n.domain.model.AddressFormattingError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("countryCode", str);
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(addressFormattingError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
            com.paypal.android.logger.Logger.e$default(logger, "Failed to fetch address layout, using default US layout", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            mutableStateFlow = addressCollectionViewModel.getHighSpeedVideoSizesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModelKt.defaultUsAddressLayout());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$fetchAddressLayout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$fetchAddressLayout$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionViewModel$fetchAddressLayout$1(java.lang.String str, java.util.Locale locale, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$fetchAddressLayout$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = locale;
        this.Camera2StreamConfigurationMap = addressCollectionViewModel;
    }
}
