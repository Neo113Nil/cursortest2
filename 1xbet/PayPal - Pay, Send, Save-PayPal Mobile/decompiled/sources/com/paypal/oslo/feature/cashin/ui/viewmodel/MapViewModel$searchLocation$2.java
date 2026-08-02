package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2", f = "MapViewModel.kt", i = {1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {"searchLatLng"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MapViewModel$searchLocation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0156, code lost:
    
        if (r2 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r2 != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.util.MissingFormatArgumentException missingFormatArgumentException;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value2;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy3;
        java.lang.Object withTimeout;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value3;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy4;
        java.lang.Object highSpeedVideoFpsRangesFor;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object value4;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (java.util.MissingFormatArgumentException e) {
            e = e;
            java.lang.String placesErrorMessage = this.getHighResolutionOutputSizeshNQ4ISI.getPlacesErrorMessage(e);
            mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            while (true) {
                java.lang.Object value5 = mutableStateFlow2.getValue();
                missingFormatArgumentException = e;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6 = mutableStateFlow2;
                copy2 = r4.copy((r35 & 1) != 0 ? r4.locations : null, (r35 & 2) != 0 ? r4.userLocation : null, (r35 & 4) != 0 ? r4.selectedLocation : null, (r35 & 8) != 0 ? r4.initialCameraPosition : null, (r35 & 16) != 0 ? r4.isLoading : false, (r35 & 32) != 0 ? r4.error : null, (r35 & 64) != 0 ? r4.isSheetVisible : false, (r35 & 128) != 0 ? r4.isSheetExpanded : false, (r35 & 256) != 0 ? r4.selectedStore : null, (r35 & 512) != 0 ? r4.searchResult : null, (r35 & 1024) != 0 ? r4.searchError : placesErrorMessage, (r35 & 2048) != 0 ? r4.isSearching : false, (r35 & 4096) != 0 ? r4.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r4.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r4.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value5).errorEventId : 0L);
                if (mutableStateFlow6.compareAndSet(value5, copy2)) {
                    break;
                }
                mutableStateFlow2 = mutableStateFlow6;
                e = missingFormatArgumentException;
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Unexpected search error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("query", this.Camera2StreamConfigurationMap)), null, missingFormatArgumentException, 4, null);
        } catch (kotlinx.coroutines.TimeoutCancellationException e2) {
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            do {
                value = mutableStateFlow.getValue();
                copy = r8.copy((r35 & 1) != 0 ? r8.locations : null, (r35 & 2) != 0 ? r8.userLocation : null, (r35 & 4) != 0 ? r8.selectedLocation : null, (r35 & 8) != 0 ? r8.initialCameraPosition : null, (r35 & 16) != 0 ? r8.isLoading : false, (r35 & 32) != 0 ? r8.error : null, (r35 & 64) != 0 ? r8.isSheetVisible : false, (r35 & 128) != 0 ? r8.isSheetExpanded : false, (r35 & 256) != 0 ? r8.selectedStore : null, (r35 & 512) != 0 ? r8.searchResult : null, (r35 & 1024) != 0 ? r8.searchError : "Search timed out. Please check your internet connection and try again.", (r35 & 2048) != 0 ? r8.isSearching : false, (r35 & 4096) != 0 ? r8.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r8.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r8.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value).errorEventId : 0L);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Places API timeout", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("query", this.Camera2StreamConfigurationMap)), null, e2, 4, null);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            do {
                value2 = mutableStateFlow3.getValue();
                copy3 = r7.copy((r35 & 1) != 0 ? r7.locations : null, (r35 & 2) != 0 ? r7.userLocation : null, (r35 & 4) != 0 ? r7.selectedLocation : null, (r35 & 8) != 0 ? r7.initialCameraPosition : null, (r35 & 16) != 0 ? r7.isLoading : false, (r35 & 32) != 0 ? r7.error : null, (r35 & 64) != 0 ? r7.isSheetVisible : false, (r35 & 128) != 0 ? r7.isSheetExpanded : false, (r35 & 256) != 0 ? r7.selectedStore : null, (r35 & 512) != 0 ? r7.searchResult : null, (r35 & 1024) != 0 ? r7.searchError : null, (r35 & 2048) != 0 ? r7.isSearching : true, (r35 & 4096) != 0 ? r7.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r7.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r7.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value2).errorEventId : 0L);
            } while (!mutableStateFlow3.compareAndSet(value2, copy3));
            this.getHighSpeedVideoFpsRanges = 1;
            withTimeout = kotlinx.coroutines.TimeoutKt.withTimeout(10000L, new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2$searchLatLng$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            withTimeout = obj;
        }
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) withTimeout;
        if (latLng == null) {
            mutableStateFlow5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.lang.String str = this.Camera2StreamConfigurationMap;
            do {
                value4 = mutableStateFlow5.getValue();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("No results found for '");
                sb.append(str);
                sb.append("'");
                copy5 = r5.copy((r35 & 1) != 0 ? r5.locations : null, (r35 & 2) != 0 ? r5.userLocation : null, (r35 & 4) != 0 ? r5.selectedLocation : null, (r35 & 8) != 0 ? r5.initialCameraPosition : null, (r35 & 16) != 0 ? r5.isLoading : false, (r35 & 32) != 0 ? r5.error : null, (r35 & 64) != 0 ? r5.isSheetVisible : false, (r35 & 128) != 0 ? r5.isSheetExpanded : false, (r35 & 256) != 0 ? r5.selectedStore : null, (r35 & 512) != 0 ? r5.searchResult : null, (r35 & 1024) != 0 ? r5.searchError : sb.toString(), (r35 & 2048) != 0 ? r5.isSearching : false, (r35 & 4096) != 0 ? r5.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r5.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r5.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value4).errorEventId : 0L);
            } while (!mutableStateFlow5.compareAndSet(value4, copy5));
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Location search completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("query", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("latitude", kotlin.coroutines.jvm.internal.Boxing.boxDouble(latLng.latitude)), kotlin.TuplesKt.to("longitude", kotlin.coroutines.jvm.internal.Boxing.boxDouble(latLng.longitude))), null, 4, null);
            mutableStateFlow4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            do {
                value3 = mutableStateFlow4.getValue();
                copy4 = r16.copy((r35 & 1) != 0 ? r16.locations : null, (r35 & 2) != 0 ? r16.userLocation : null, (r35 & 4) != 0 ? r16.selectedLocation : null, (r35 & 8) != 0 ? r16.initialCameraPosition : null, (r35 & 16) != 0 ? r16.isLoading : true, (r35 & 32) != 0 ? r16.error : null, (r35 & 64) != 0 ? r16.isSheetVisible : false, (r35 & 128) != 0 ? r16.isSheetExpanded : false, (r35 & 256) != 0 ? r16.selectedStore : null, (r35 & 512) != 0 ? r16.searchResult : latLng, (r35 & 1024) != 0 ? r16.searchError : null, (r35 & 2048) != 0 ? r16.isSearching : false, (r35 & 4096) != 0 ? r16.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r16.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r16.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value3).errorEventId : 0L);
            } while (!mutableStateFlow4.compareAndSet(value3, copy4));
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(latLng);
            this.getHighSpeedVideoFpsRanges = 2;
            highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(latLng.latitude, latLng.longitude, this);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapViewModel$searchLocation$2(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mapViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
