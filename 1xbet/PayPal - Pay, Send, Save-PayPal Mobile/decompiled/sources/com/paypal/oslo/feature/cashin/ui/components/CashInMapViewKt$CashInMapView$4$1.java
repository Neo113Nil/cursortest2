package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$4$1", f = "CashInMapView.kt", i = {0, 0, 0}, l = {192}, m = "invokeSuspend", n = {"location", "targetLatLng", "$i$a$-let-CashInMapViewKt$CashInMapView$4$1$1"}, nl = {199}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class CashInMapViewKt$CashInMapView$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStore Camera2StreamConfigurationMap;
    final /* synthetic */ com.google.maps.android.compose.CameraPositionState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore = this.Camera2StreamConfigurationMap;
            if (cashInStore != null) {
                com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils = this.getHighSpeedVideoFpsRanges;
                com.google.maps.android.compose.CameraPositionState cameraPositionState = this.getHighResolutionOutputSizeshNQ4ISI;
                com.google.android.gms.maps.model.LatLng locationToLatLng = markerUtils.locationToLatLng(cashInStore);
                com.google.android.gms.maps.CameraUpdate newLatLngZoom = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(locationToLatLng, 17.0f);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newLatLngZoom, "");
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cashInStore);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locationToLatLng);
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoSizesFor = 1;
                if (cameraPositionState.animate(newLatLngZoom, 500, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$4$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInMapViewKt$CashInMapView$4$1(com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, com.google.maps.android.compose.CameraPositionState cameraPositionState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$4$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cashInStore;
        this.getHighSpeedVideoFpsRanges = markerUtils;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraPositionState;
    }
}
