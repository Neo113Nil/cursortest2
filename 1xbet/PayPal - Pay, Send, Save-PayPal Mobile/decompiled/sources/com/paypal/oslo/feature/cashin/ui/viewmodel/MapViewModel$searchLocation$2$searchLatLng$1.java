package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/google/android/gms/maps/model/LatLng;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2$searchLatLng$1", f = "MapViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class MapViewModel$searchLocation$2$searchLatLng$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.model.LatLng>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder cashInPlacesGeocoder;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        cashInPlacesGeocoder = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object searchLocation = cashInPlacesGeocoder.searchLocation(this.getHighResolutionOutputSizeshNQ4ISI, this);
        return searchLocation == coroutine_suspended ? coroutine_suspended : searchLocation;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.model.LatLng> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2$searchLatLng$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2$searchLatLng$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapViewModel$searchLocation$2$searchLatLng$1(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel$searchLocation$2$searchLatLng$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mapViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
