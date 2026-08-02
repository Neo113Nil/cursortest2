package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInBalanceLandingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCase;", "setHasSeenLandingUseCase", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;", "checkLocationPermissionUseCase", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;", "checkLocationEnabledUseCase", "Lcom/paypal/oslo/feature/cashin/manager/CashInDynamicConfiguration;", "dynamicConfig", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCase;Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;Lcom/paypal/oslo/feature/cashin/manager/CashInDynamicConfiguration;)V", "Landroid/content/Context;", "context", "", "source", "", "onContinueClicked", "(Landroid/content/Context;Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cashin/domain/usecase/SetHasSeenLandingUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInBalanceLandingUiState;", "uiState", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInBalanceLandingUiState;", "getUiState", "()Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInBalanceLandingUiState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInBalanceLandingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingUiState uiState;

    @javax.inject.Inject
    public CashInBalanceLandingViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase setHasSeenLandingUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase checkLocationPermissionUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase checkLocationEnabledUseCase, com.paypal.oslo.feature.cashin.manager.CashInDynamicConfiguration cashInDynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setHasSeenLandingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkLocationPermissionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkLocationEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInDynamicConfiguration, "");
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = setHasSeenLandingUseCase;
        this.getHighSpeedVideoFpsRanges = checkLocationPermissionUseCase;
        this.getHighSpeedVideoFpsRangesFor = checkLocationEnabledUseCase;
        this.uiState = new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingUiState(cashInDynamicConfiguration.getTransactionTimeDelay(), cashInDynamicConfiguration.getTransactionMaxLimitPerMonth(), cashInDynamicConfiguration.getTransactionMinLimitPerDay(), cashInDynamicConfiguration.getMinLimitPerTransaction(), cashInDynamicConfiguration.getMaxLimitPerTransaction());
    }

    public final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingUiState getUiState() {
        return this.uiState;
    }

    public final void onContinueClicked(android.content.Context context, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel$onContinueClicked$1(this, context, source, null), 3, null);
    }
}
