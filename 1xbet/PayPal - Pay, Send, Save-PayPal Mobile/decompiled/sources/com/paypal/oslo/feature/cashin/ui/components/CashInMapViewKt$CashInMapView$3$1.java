package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$3$1", f = "CashInMapView.kt", i = {0, 0}, l = {148}, m = "invokeSuspend", n = {"userLatLngAnimated", "shouldAnimateToUserLocation"}, nl = {156}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class CashInMapViewKt$CashInMapView$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.google.android.gms.maps.model.LatLng Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.google.maps.android.compose.CameraPositionState getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStore getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils getHighSpeedVideoSizes;
    int getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInStore getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getOutputMinFrameDuration != null) {
                booleanValue = ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
                if (!booleanValue && this.getHighSpeedVideoFpsRangesFor == null && this.Camera2StreamConfigurationMap == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(true));
                    com.google.android.gms.maps.model.LatLng locationToLatLng = this.getHighSpeedVideoSizes.locationToLatLng(this.getOutputMinFrameDuration);
                    com.google.maps.android.compose.CameraPositionState cameraPositionState = this.getHighSpeedVideoFpsRanges;
                    com.google.android.gms.maps.CameraUpdate newLatLngZoom = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(locationToLatLng, 11.0f);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newLatLngZoom, "");
                    this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locationToLatLng);
                    this.getInputFormats = 1;
                    this.getInputSizeshNQ4ISI = 1;
                    if (cameraPositionState.animate(newLatLngZoom, 500, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
        return ((com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$3$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInMapViewKt$CashInMapView$3$1(com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore2, com.google.android.gms.maps.model.LatLng latLng, com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, com.google.maps.android.compose.CameraPositionState cameraPositionState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$3$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = cashInStore;
        this.getHighSpeedVideoFpsRangesFor = cashInStore2;
        this.Camera2StreamConfigurationMap = latLng;
        this.getHighSpeedVideoSizes = markerUtils;
        this.getHighSpeedVideoFpsRanges = cameraPositionState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
