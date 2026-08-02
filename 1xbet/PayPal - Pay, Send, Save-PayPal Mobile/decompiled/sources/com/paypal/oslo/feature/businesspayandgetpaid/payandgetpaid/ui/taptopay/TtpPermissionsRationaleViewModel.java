package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001&B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpPermissionsRationaleViewModel;", "Landroidx/lifecycle/ViewModel;", "", "showLocationNotEnabledRationale", "showNfcNotEnabledRationale", "<init>", "(ZZ)V", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "permissionStatus", "", "onLocationPermissionChecked$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;)V", "isEnabled", "onLocationEnabledChecked$business_pay_and_get_paid_prodRelease", "(Z)V", "onNfcEnabledChecked$business_pay_and_get_paid_prodRelease", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "action", "Lkotlinx/coroutines/flow/SharedFlow;", "getAction", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TtpPermissionsRationaleViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction> action;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpPermissionsRationaleViewModel$Factory;", "", "", "showLocationNotEnabledRationale", "showNfcNotEnabledRationale", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpPermissionsRationaleViewModel;", "create", "(ZZ)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpPermissionsRationaleViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel create(@dagger.assisted.Assisted("showLocationNotEnabledRationale") boolean showLocationNotEnabledRationale, @dagger.assisted.Assisted("showNfcNotEnabledRationale") boolean showNfcNotEnabledRationale);
    }

    @dagger.assisted.AssistedInject
    public TtpPermissionsRationaleViewModel(@dagger.assisted.Assisted("showLocationNotEnabledRationale") boolean z, @dagger.assisted.Assisted("showNfcNotEnabledRationale") boolean z2) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale fineLocationPermissionNotEnabledRationale;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = z2;
        if (z) {
            fineLocationPermissionNotEnabledRationale = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_location_declined_rationale_header_android, com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_location_declined_rationale_body_android, null, null, 12, null);
        } else if (z2) {
            fineLocationPermissionNotEnabledRationale = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_nfc_declined_rationale_header_android, com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_nfc_declined_rationale_body_android, null, null, 12, null);
        } else {
            fineLocationPermissionNotEnabledRationale = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_fine_location_permission_declined_rationale_header_android, com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_ttp_fine_location_permission_declined_rationale_body_android, null, null, 12, null);
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(fineLocationPermissionNotEnabledRationale);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.action = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction> getAction() {
        return this.action;
    }

    public final void onLocationPermissionChecked$business_pay_and_get_paid_prodRelease(com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionStatus, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel$onLocationPermissionChecked$1(permissionStatus, this, null), 3, null);
    }

    public final void onLocationEnabledChecked$business_pay_and_get_paid_prodRelease(boolean isEnabled) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel$onLocationEnabledChecked$1(isEnabled, this, null), 3, null);
    }

    public final void onNfcEnabledChecked$business_pay_and_get_paid_prodRelease(boolean isEnabled) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel$onNfcEnabledChecked$1(isEnabled, this, null), 3, null);
    }
}
