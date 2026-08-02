package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetHasSeenLandingUseCase;", "getHasSeenLandingUseCase", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;", "checkLocationPermissionUseCase", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;", "checkLocationEnabledUseCase", "Lcom/paypal/oslo/feature/cashin/manager/CashInFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/cashin/domain/usecase/GetHasSeenLandingUseCase;Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;Lcom/paypal/oslo/feature/cashin/manager/CashInFeatureManager;)V", "", "source", "Landroid/content/Context;", "context", "", "navigateToAppropriateScreen", "(Ljava/lang/String;Landroid/content/Context;)V", "", "isCashInFeatureEnabled", "()Z", "navigateToFeatureDisabledScreen", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cashin/domain/usecase/GetHasSeenLandingUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationEnabledUseCase;", "Lcom/paypal/oslo/feature/cashin/manager/CashInFeatureManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInEntryViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.manager.CashInFeatureManager getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CashInEntryViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase getHasSeenLandingUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase checkLocationPermissionUseCase, com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase checkLocationEnabledUseCase, com.paypal.oslo.feature.cashin.manager.CashInFeatureManager cashInFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getHasSeenLandingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkLocationPermissionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkLocationEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInFeatureManager, "");
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRanges = getHasSeenLandingUseCase;
        this.getHighSpeedVideoFpsRangesFor = checkLocationPermissionUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = checkLocationEnabledUseCase;
        this.getHighSpeedVideoSizes = cashInFeatureManager;
    }

    public final void navigateToAppropriateScreen(java.lang.String source, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToAppropriateScreen$1(this, source, context, null), 3, null);
    }

    public final boolean isCashInFeatureEnabled() {
        return this.getHighSpeedVideoSizes.isCashInFeatureEnabled();
    }

    public final void navigateToFeatureDisabledScreen() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToFeatureDisabledScreen$1(this, null), 3, null);
    }
}
