package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u00017B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0013J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0013J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\u0013J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u001d\u00103\u001a\b\u0012\u0004\u0012\u000200028\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetUserLocationUseCase;", "getUserLocationUseCase", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetCashInStoresUseCase;", "getCashInStoresUseCase", "Lcom/paypal/oslo/feature/cashin/domain/geocoding/CashInPlacesGeocoder;", "cashInPlacesGeocoder", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/paypal/oslo/feature/cashin/domain/usecase/GetUserLocationUseCase;Lcom/paypal/oslo/feature/cashin/domain/usecase/GetCashInStoresUseCase;Lcom/paypal/oslo/feature/cashin/domain/geocoding/CashInPlacesGeocoder;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "p0", "p1", "", "getHighSpeedVideoFpsRangesFor", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "()V", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "location", "onLocationSelected", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;)V", "clearSelectedLocation", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "retryFetchStores", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "onStoreSelected", "", "query", "searchLocation", "(Ljava/lang/String;)V", "clearSearchResult", "dismissNothingNearbyDialog", "dismissErrorHalfSheet", "Ljava/util/MissingFormatArgumentException;", "e", "getPlacesErrorMessage", "(Ljava/util/MissingFormatArgumentException;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetUserLocationUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetCashInStoresUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cashin/domain/geocoding/CashInPlacesGeocoder;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MapViewModel(com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase getUserLocationUseCase, com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase getCashInStoresUseCase, com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder cashInPlacesGeocoder, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserLocationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCashInStoresUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInPlacesGeocoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getUserLocationUseCase;
        this.Camera2StreamConfigurationMap = getCashInStoresUseCase;
        this.getHighSpeedVideoFpsRangesFor = cashInPlacesGeocoder;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState(null, null, null, null, false, null, false, false, null, null, null, false, false, false, 0, 0L, 65535, null));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$loadUserLocationAndStores$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> getUiState() {
        return this.uiState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(double d, double d2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$fetchNearbyStores$1 mapViewModel$fetchNearbyStores$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        try {
            if (continuation instanceof com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$fetchNearbyStores$1) {
                mapViewModel$fetchNearbyStores$1 = (com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$fetchNearbyStores$1) continuation;
                if ((mapViewModel$fetchNearbyStores$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    mapViewModel$fetchNearbyStores$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$fetchNearbyStores$1 mapViewModel$fetchNearbyStores$12 = mapViewModel$fetchNearbyStores$1;
                    java.lang.Object obj = mapViewModel$fetchNearbyStores$12.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mapViewModel$fetchNearbyStores$12.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Fetching nearby stores", null, null, 6, null);
                        com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase getCashInStoresUseCase = this.Camera2StreamConfigurationMap;
                        mapViewModel$fetchNearbyStores$12.Camera2StreamConfigurationMap = d;
                        mapViewModel$fetchNearbyStores$12.getHighSpeedVideoFpsRangesFor = d2;
                        mapViewModel$fetchNearbyStores$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.feature.cashin.domain.usecase.GetCashInStoresUseCase.invoke$default(getCashInStoresUseCase, d, d2, 0, mapViewModel$fetchNearbyStores$12, 4, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        double d3 = mapViewModel$fetchNearbyStores$12.getHighSpeedVideoFpsRangesFor;
                        double d4 = mapViewModel$fetchNearbyStores$12.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = (arrow.core.Either) obj;
                    if (either instanceof arrow.core.Either.Right) {
                        if (either instanceof arrow.core.Either.Left) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Failed to fetch nearby stores", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.cashin.domain.error.CashInError) ((arrow.core.Either.Left) either).getValue()).toString()), kotlin.TuplesKt.to("retryCountBefore", kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighSpeedVideoFpsRanges.getValue().getErrorRetryCount()))), null, null, 12, null);
                            getHighResolutionOutputSizeshNQ4ISI();
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else {
                        java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Fetched nearby stores successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Integer.valueOf(list.size()))), null, 4, null);
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
                        do {
                            value = mutableStateFlow.getValue();
                            copy = r2.copy((r35 & 1) != 0 ? r2.locations : list, (r35 & 2) != 0 ? r2.userLocation : null, (r35 & 4) != 0 ? r2.selectedLocation : null, (r35 & 8) != 0 ? r2.initialCameraPosition : null, (r35 & 16) != 0 ? r2.isLoading : false, (r35 & 32) != 0 ? r2.error : null, (r35 & 64) != 0 ? r2.isSheetVisible : false, (r35 & 128) != 0 ? r2.isSheetExpanded : false, (r35 & 256) != 0 ? r2.selectedStore : null, (r35 & 512) != 0 ? r2.searchResult : null, (r35 & 1024) != 0 ? r2.searchError : null, (r35 & 2048) != 0 ? r2.isSearching : false, (r35 & 4096) != 0 ? r2.showNothingNearbyDialog : list.isEmpty(), (r35 & 8192) != 0 ? r2.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r2.errorRetryCount : 0, (r35 & 32768) != 0 ? value.errorEventId : 0L);
                        } while (!mutableStateFlow.compareAndSet(value, copy));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            either = (arrow.core.Either) obj;
            if (either instanceof arrow.core.Either.Right) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.UnsupportedOperationException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Exception calling getCashInStoresUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", e.getMessage())), null, null, 12, null);
            getHighResolutionOutputSizeshNQ4ISI();
            return kotlin.Unit.INSTANCE;
        }
        mapViewModel$fetchNearbyStores$1 = new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$fetchNearbyStores$1(this, continuation);
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$fetchNearbyStores$1 mapViewModel$fetchNearbyStores$122 = mapViewModel$fetchNearbyStores$1;
        java.lang.Object obj2 = mapViewModel$fetchNearbyStores$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mapViewModel$fetchNearbyStores$122.getHighResolutionOutputSizeshNQ4ISI;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState mapUiState = value;
            copy = mapUiState.copy((r35 & 1) != 0 ? mapUiState.locations : null, (r35 & 2) != 0 ? mapUiState.userLocation : null, (r35 & 4) != 0 ? mapUiState.selectedLocation : null, (r35 & 8) != 0 ? mapUiState.initialCameraPosition : null, (r35 & 16) != 0 ? mapUiState.isLoading : false, (r35 & 32) != 0 ? mapUiState.error : "Failed to load nearby stores. Please try again.", (r35 & 64) != 0 ? mapUiState.isSheetVisible : false, (r35 & 128) != 0 ? mapUiState.isSheetExpanded : false, (r35 & 256) != 0 ? mapUiState.selectedStore : null, (r35 & 512) != 0 ? mapUiState.searchResult : null, (r35 & 1024) != 0 ? mapUiState.searchError : null, (r35 & 2048) != 0 ? mapUiState.isSearching : false, (r35 & 4096) != 0 ? mapUiState.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? mapUiState.showErrorHalfSheet : true, (r35 & 16384) != 0 ? mapUiState.errorRetryCount : mapUiState.getErrorRetryCount() + 1, (r35 & 32768) != 0 ? mapUiState.errorEventId : java.lang.System.currentTimeMillis());
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onLocationSelected(com.paypal.oslo.feature.cashin.domain.model.CashInStore location) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        while (true) {
            com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value = mutableStateFlow.getValue();
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow2 = mutableStateFlow;
            copy = r1.copy((r35 & 1) != 0 ? r1.locations : null, (r35 & 2) != 0 ? r1.userLocation : null, (r35 & 4) != 0 ? r1.selectedLocation : location, (r35 & 8) != 0 ? r1.initialCameraPosition : null, (r35 & 16) != 0 ? r1.isLoading : false, (r35 & 32) != 0 ? r1.error : null, (r35 & 64) != 0 ? r1.isSheetVisible : false, (r35 & 128) != 0 ? r1.isSheetExpanded : false, (r35 & 256) != 0 ? r1.selectedStore : null, (r35 & 512) != 0 ? r1.searchResult : null, (r35 & 1024) != 0 ? r1.searchError : null, (r35 & 2048) != 0 ? r1.isSearching : false, (r35 & 4096) != 0 ? r1.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r1.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r1.errorRetryCount : 0, (r35 & 32768) != 0 ? value.errorEventId : 0L);
            if (mutableStateFlow2.compareAndSet(value, copy)) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void clearSelectedLocation() {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r35 & 1) != 0 ? r3.locations : null, (r35 & 2) != 0 ? r3.userLocation : null, (r35 & 4) != 0 ? r3.selectedLocation : null, (r35 & 8) != 0 ? r3.initialCameraPosition : null, (r35 & 16) != 0 ? r3.isLoading : false, (r35 & 32) != 0 ? r3.error : null, (r35 & 64) != 0 ? r3.isSheetVisible : false, (r35 & 128) != 0 ? r3.isSheetExpanded : false, (r35 & 256) != 0 ? r3.selectedStore : null, (r35 & 512) != 0 ? r3.searchResult : null, (r35 & 1024) != 0 ? r3.searchError : null, (r35 & 2048) != 0 ? r3.isSearching : false, (r35 & 4096) != 0 ? r3.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r3.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r3.errorRetryCount : 0, (r35 & 32768) != 0 ? value.errorEventId : 0L);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void refresh() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1(this, this.getHighSpeedVideoFpsRanges.getValue().getUserLocation(), null), 3, null);
    }

    public final void retryFetchStores() {
        refresh();
    }

    public final void onStoreSelected(com.paypal.oslo.feature.cashin.domain.model.CashInStore store) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(store, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        copy = r0.copy((r35 & 1) != 0 ? r0.locations : null, (r35 & 2) != 0 ? r0.userLocation : null, (r35 & 4) != 0 ? r0.selectedLocation : null, (r35 & 8) != 0 ? r0.initialCameraPosition : null, (r35 & 16) != 0 ? r0.isLoading : false, (r35 & 32) != 0 ? r0.error : null, (r35 & 64) != 0 ? r0.isSheetVisible : false, (r35 & 128) != 0 ? r0.isSheetExpanded : false, (r35 & 256) != 0 ? r0.selectedStore : store, (r35 & 512) != 0 ? r0.searchResult : null, (r35 & 1024) != 0 ? r0.searchError : null, (r35 & 2048) != 0 ? r0.isSearching : false, (r35 & 4096) != 0 ? r0.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r0.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r0.errorRetryCount : 0, (r35 & 32768) != 0 ? mutableStateFlow.getValue().errorEventId : 0L);
        mutableStateFlow.setValue(copy);
    }

    public final void searchLocation(java.lang.String query) {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        if (!kotlin.text.StringsKt.isBlank(query)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2(this, query, null), 3, null);
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r35 & 1) != 0 ? r3.locations : null, (r35 & 2) != 0 ? r3.userLocation : null, (r35 & 4) != 0 ? r3.selectedLocation : null, (r35 & 8) != 0 ? r3.initialCameraPosition : null, (r35 & 16) != 0 ? r3.isLoading : false, (r35 & 32) != 0 ? r3.error : null, (r35 & 64) != 0 ? r3.isSheetVisible : false, (r35 & 128) != 0 ? r3.isSheetExpanded : false, (r35 & 256) != 0 ? r3.selectedStore : null, (r35 & 512) != 0 ? r3.searchResult : null, (r35 & 1024) != 0 ? r3.searchError : null, (r35 & 2048) != 0 ? r3.isSearching : false, (r35 & 4096) != 0 ? r3.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r3.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r3.errorRetryCount : 0, (r35 & 32768) != 0 ? value.errorEventId : 0L);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void clearSearchResult() {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r35 & 1) != 0 ? r3.locations : null, (r35 & 2) != 0 ? r3.userLocation : null, (r35 & 4) != 0 ? r3.selectedLocation : null, (r35 & 8) != 0 ? r3.initialCameraPosition : null, (r35 & 16) != 0 ? r3.isLoading : false, (r35 & 32) != 0 ? r3.error : null, (r35 & 64) != 0 ? r3.isSheetVisible : false, (r35 & 128) != 0 ? r3.isSheetExpanded : false, (r35 & 256) != 0 ? r3.selectedStore : null, (r35 & 512) != 0 ? r3.searchResult : null, (r35 & 1024) != 0 ? r3.searchError : null, (r35 & 2048) != 0 ? r3.isSearching : false, (r35 & 4096) != 0 ? r3.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r3.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r3.errorRetryCount : 0, (r35 & 32768) != 0 ? value.errorEventId : 0L);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void dismissNothingNearbyDialog() {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r35 & 1) != 0 ? r3.locations : null, (r35 & 2) != 0 ? r3.userLocation : null, (r35 & 4) != 0 ? r3.selectedLocation : null, (r35 & 8) != 0 ? r3.initialCameraPosition : null, (r35 & 16) != 0 ? r3.isLoading : false, (r35 & 32) != 0 ? r3.error : null, (r35 & 64) != 0 ? r3.isSheetVisible : false, (r35 & 128) != 0 ? r3.isSheetExpanded : false, (r35 & 256) != 0 ? r3.selectedStore : null, (r35 & 512) != 0 ? r3.searchResult : null, (r35 & 1024) != 0 ? r3.searchError : null, (r35 & 2048) != 0 ? r3.isSearching : false, (r35 & 4096) != 0 ? r3.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r3.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r3.errorRetryCount : 0, (r35 & 32768) != 0 ? value.errorEventId : 0L);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void dismissErrorHalfSheet() {
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r35 & 1) != 0 ? r3.locations : null, (r35 & 2) != 0 ? r3.userLocation : null, (r35 & 4) != 0 ? r3.selectedLocation : null, (r35 & 8) != 0 ? r3.initialCameraPosition : null, (r35 & 16) != 0 ? r3.isLoading : false, (r35 & 32) != 0 ? r3.error : null, (r35 & 64) != 0 ? r3.isSheetVisible : false, (r35 & 128) != 0 ? r3.isSheetExpanded : false, (r35 & 256) != 0 ? r3.selectedStore : null, (r35 & 512) != 0 ? r3.searchResult : null, (r35 & 1024) != 0 ? r3.searchError : null, (r35 & 2048) != 0 ? r3.isSearching : false, (r35 & 4096) != 0 ? r3.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r3.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r3.errorRetryCount : 0, (r35 & 32768) != 0 ? value.errorEventId : 0L);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final java.lang.String getPlacesErrorMessage(java.util.MissingFormatArgumentException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        java.lang.String message = e.getMessage();
        if (message != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "API_NOT_ENABLED", false, 2, (java.lang.Object) null)) {
            return "Location service not available. Please try again later.";
        }
        java.lang.String message2 = e.getMessage();
        if (message2 != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) "INVALID_REQUEST", false, 2, (java.lang.Object) null)) {
            return "Invalid search query. Please try a different location.";
        }
        java.lang.String message3 = e.getMessage();
        if (message3 == null) {
            message3 = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
        }
        return "Error searching: ".concat(java.lang.String.valueOf(message3));
    }
}
