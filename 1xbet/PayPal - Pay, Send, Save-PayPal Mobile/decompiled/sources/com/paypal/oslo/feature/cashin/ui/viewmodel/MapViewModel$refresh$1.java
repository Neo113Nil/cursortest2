package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1", f = "MapViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "invokeSuspend", n = {}, nl = {193, 203}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class MapViewModel$refresh$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStore Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState copy;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            do {
                value = mutableStateFlow.getValue();
                copy = r6.copy((r35 & 1) != 0 ? r6.locations : null, (r35 & 2) != 0 ? r6.userLocation : null, (r35 & 4) != 0 ? r6.selectedLocation : null, (r35 & 8) != 0 ? r6.initialCameraPosition : null, (r35 & 16) != 0 ? r6.isLoading : true, (r35 & 32) != 0 ? r6.error : null, (r35 & 64) != 0 ? r6.isSheetVisible : false, (r35 & 128) != 0 ? r6.isSheetExpanded : false, (r35 & 256) != 0 ? r6.selectedStore : null, (r35 & 512) != 0 ? r6.searchResult : null, (r35 & 1024) != 0 ? r6.searchError : null, (r35 & 2048) != 0 ? r6.isSearching : false, (r35 & 4096) != 0 ? r6.showNothingNearbyDialog : false, (r35 & 8192) != 0 ? r6.showErrorHalfSheet : false, (r35 & 16384) != 0 ? r6.errorRetryCount : 0, (r35 & 32768) != 0 ? ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) value).errorEventId : 0L);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.Camera2StreamConfigurationMap != null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Fetching stores with existing location", null, null, 6, null);
            coroutineDispatcher = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 2;
            if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "No user location, loading user location and stores", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$loadUserLocationAndStores$1(this.getHighResolutionOutputSizeshNQ4ISI, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1$2", f = "MapViewModel.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, nl = {201}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStore getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object highSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.getGeoLocation().getLatitude(), this.getHighSpeedVideoSizes.getGeoLocation().getLongitude(), this);
                if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = mapViewModel;
            this.getHighSpeedVideoSizes = cashInStore;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapViewModel$refresh$1(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$refresh$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mapViewModel;
        this.Camera2StreamConfigurationMap = cashInStore;
    }
}
