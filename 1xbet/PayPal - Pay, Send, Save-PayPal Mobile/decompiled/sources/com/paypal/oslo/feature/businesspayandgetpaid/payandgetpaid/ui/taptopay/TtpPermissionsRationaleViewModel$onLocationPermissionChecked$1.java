package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel$onLocationPermissionChecked$1", f = "TtpPermissionsRationaleViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, nl = {77}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TtpPermissionsRationaleViewModel$onLocationPermissionChecked$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.permission.domain.model.PermissionStatus getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRangesFor instanceof com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted) {
                mutableSharedFlow = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (mutableSharedFlow.emit(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.RequestLocationEnabledCheck.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                mutableStateFlow.setValue(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_fine_location_permission_declined_rationale_header_android, com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_fine_location_permission_declined_rationale_body_android, null, null, 12, null));
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
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel$onLocationPermissionChecked$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel$onLocationPermissionChecked$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TtpPermissionsRationaleViewModel$onLocationPermissionChecked$1(com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel ttpPermissionsRationaleViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel$onLocationPermissionChecked$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = permissionStatus;
        this.getHighSpeedVideoFpsRanges = ttpPermissionsRationaleViewModel;
    }
}
