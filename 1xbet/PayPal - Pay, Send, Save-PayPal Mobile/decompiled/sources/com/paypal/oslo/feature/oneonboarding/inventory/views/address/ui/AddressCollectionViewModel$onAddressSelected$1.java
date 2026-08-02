package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$onAddressSelected$1", f = "AddressCollectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionViewModel$onAddressSelected$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState copy;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.i18n.domain.model.Address address = this.Camera2StreamConfigurationMap.getAddress();
        java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> fieldMap = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressFieldUtilsKt.toFieldMap(address);
        java.util.List<java.lang.String> formattedAddress = this.Camera2StreamConfigurationMap.getFormattedAddress();
        java.lang.String str = formattedAddress != null ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) formattedAddress) : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        copy = r2.copy((r28 & 1) != 0 ? r2.searchQuery : str2, (r28 & 2) != 0 ? r2.isSearching : false, (r28 & 4) != 0 ? r2.suggestions : kotlin.collections.CollectionsKt.emptyList(), (r28 & 8) != 0 ? r2.searchError : null, (r28 & 16) != 0 ? r2.selectedAddress : address, (r28 & 32) != 0 ? r2.fieldValues : fieldMap, (r28 & 64) != 0 ? r2.fieldErrors : null, (r28 & 128) != 0 ? r2.hasValidationError : false, (r28 & 256) != 0 ? r2.hasPOBoxError : false, (r28 & 512) != 0 ? r2.hasPMBError : false, (r28 & 1024) != 0 ? r2.hasUSTerritoryError : false, (r28 & 2048) != 0 ? r2.isManualEntry : false, (r28 & 4096) != 0 ? ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.model.AddressFormUiState) mutableStateFlow2.getValue()).verificationState : null);
        mutableStateFlow.setValue(copy);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$onAddressSelected$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$onAddressSelected$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionViewModel$onAddressSelected$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion addressSuggestion, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$onAddressSelected$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = addressSuggestion;
        this.getHighSpeedVideoSizes = addressCollectionViewModel;
    }
}
