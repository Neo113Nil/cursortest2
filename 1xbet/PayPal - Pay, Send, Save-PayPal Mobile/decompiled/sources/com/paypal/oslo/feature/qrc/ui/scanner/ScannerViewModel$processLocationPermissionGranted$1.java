package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$processLocationPermissionGranted$1", f = "ScannerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ScannerViewModel$processLocationPermissionGranted$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        boolean z;
        com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher locationMatcher;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.getInputFormats = this.getHighResolutionOutputSizeshNQ4ISI.getLatitude();
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI.getLongitude();
            userStore = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
            java.lang.String country = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getCountry() : null;
            if (country != null && this.getHighResolutionOutputSizeshNQ4ISI.getLatitude() != null && this.getHighResolutionOutputSizeshNQ4ISI.getLongitude() != null) {
                locationMatcher = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (locationMatcher.matchCountryWithLocation(country, this.getHighResolutionOutputSizeshNQ4ISI.getLatitude().doubleValue(), this.getHighResolutionOutputSizeshNQ4ISI.getLongitude().doubleValue())) {
                    z = true;
                    if (z) {
                        this.Camera2StreamConfigurationMap.getOutputSizes = country;
                    }
                    this.Camera2StreamConfigurationMap.handleIntent(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed(z));
                    return kotlin.Unit.INSTANCE;
                }
            }
            z = false;
            if (z) {
            }
            this.Camera2StreamConfigurationMap.handleIntent(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed(z));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$processLocationPermissionGranted$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$processLocationPermissionGranted$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerViewModel$processLocationPermissionGranted$1(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted locationPermissionGranted, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$processLocationPermissionGranted$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = scannerViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = locationPermissionGranted;
    }
}
