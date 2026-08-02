package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$loadUserLocationAndStores$1", f = "MapViewModel.kt", i = {1, 2}, l = {63, 74, 91}, m = "invokeSuspend", n = {"userLocation", "e"}, nl = {64, 78, 96}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MapViewModel$loadUserLocationAndStores$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r0 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0139, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0 != r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r0 != r2) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        java.lang.Object highSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase getUserLocationUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy2;
        java.lang.Object highSpeedVideoFpsRangesFor2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
        } catch (java.lang.UnsupportedOperationException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Exception calling getUserLocationUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", e.getMessage())), null, 4, null);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r35 & 1) != 0 ? r5.locations : null, (r35 & 2) != 0 ? r5.userLocation : null, (r35 & 4) != 0 ? r5.selectedLocation : null, (r35 & 8) != 0 ? r5.initialCameraPosition : new com.google.android.gms.maps.model.LatLng(30.3515d, -97.7553d), (r35 & 16) != 0 ? r5.isLoading : false, (r35 & 32) != 0 ? r5.error : "Could not get your location. Using default location.", (r35 & 64) != 0 ? r5.isSheetVisible : false, (r35 & 128) != 0 ? r5.isSheetExpanded : false, (r35 & 256) != 0 ? r5.selectedStore : null, (r35 & 512) != 0 ? r5.searchResult : null, (r35 & 1024) != 0 ? r5.searchError : null, (r35 & 2048) != 0 ? r5.isSearching : false, (r35 & 4096) != 0 ? r5.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r5.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r5.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value).errorEventId : 0L);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
            this.Camera2StreamConfigurationMap = 3;
            highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(30.3515d, -97.7553d, this);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getUserLocationUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            invoke = getUserLocationUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = (com.paypal.oslo.feature.cashin.domain.model.CashInStore) invoke;
        mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        while (true) {
            java.lang.Object value2 = mutableStateFlow2.getValue();
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3 = mutableStateFlow2;
            copy2 = r5.copy((r35 & 1) != 0 ? r5.locations : null, (r35 & 2) != 0 ? r5.userLocation : cashInStore, (r35 & 4) != 0 ? r5.selectedLocation : null, (r35 & 8) != 0 ? r5.initialCameraPosition : new com.google.android.gms.maps.model.LatLng(cashInStore.getGeoLocation().getLatitude(), cashInStore.getGeoLocation().getLongitude()), (r35 & 16) != 0 ? r5.isLoading : false, (r35 & 32) != 0 ? r5.error : null, (r35 & 64) != 0 ? r5.isSheetVisible : false, (r35 & 128) != 0 ? r5.isSheetExpanded : false, (r35 & 256) != 0 ? r5.selectedStore : null, (r35 & 512) != 0 ? r5.searchResult : null, (r35 & 1024) != 0 ? r5.searchError : null, (r35 & 2048) != 0 ? r5.isSearching : false, (r35 & 4096) != 0 ? r5.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r5.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r5.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value2).errorEventId : 0L);
            if (mutableStateFlow3.compareAndSet(value2, copy2)) {
                break;
            }
            mutableStateFlow2 = mutableStateFlow3;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cashInStore);
        this.Camera2StreamConfigurationMap = 2;
        highSpeedVideoFpsRangesFor2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(cashInStore.getGeoLocation().getLatitude(), cashInStore.getGeoLocation().getLongitude(), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$loadUserLocationAndStores$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$loadUserLocationAndStores$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapViewModel$loadUserLocationAndStores$1(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$loadUserLocationAndStores$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mapViewModel;
    }
}
