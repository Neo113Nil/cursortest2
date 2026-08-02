package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$5$1", f = "CashInMapView.kt", i = {0, 0}, l = {205}, m = "invokeSuspend", n = {"latLng", "$i$a$-let-CashInMapViewKt$CashInMapView$5$1$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class CashInMapViewKt$CashInMapView$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.google.android.gms.maps.model.LatLng getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.google.maps.android.compose.CameraPositionState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.google.android.gms.maps.model.LatLng latLng = this.getHighSpeedVideoFpsRanges;
            if (latLng != null) {
                com.google.maps.android.compose.CameraPositionState cameraPositionState = this.getHighSpeedVideoSizes;
                com.google.android.gms.maps.CameraUpdate newLatLngZoom = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, 11.0f);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newLatLngZoom, "");
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(latLng);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.Camera2StreamConfigurationMap = 1;
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
        return ((com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$5$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInMapViewKt$CashInMapView$5$1(com.google.android.gms.maps.model.LatLng latLng, com.google.maps.android.compose.CameraPositionState cameraPositionState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.components.CashInMapViewKt$CashInMapView$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = latLng;
        this.getHighSpeedVideoSizes = cameraPositionState;
    }
}
