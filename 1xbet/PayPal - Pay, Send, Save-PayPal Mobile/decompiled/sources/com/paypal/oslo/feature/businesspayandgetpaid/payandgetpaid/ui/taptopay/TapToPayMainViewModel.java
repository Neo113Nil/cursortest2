package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayMainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/GetTaxSettingsUseCase;", "getTaxSettingsUseCase", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/GetTaxSettingsUseCase;)V", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "selectedItems", "customAmount", "", "onRequestClick", "(Ljava/util/List;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)V", "onCancelClick", "()V", "dismissError", "onAddItemClick", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/GetTaxSettingsUseCase;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayMainUiEffect;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "showError", "Lkotlinx/coroutines/flow/StateFlow;", "getShowError", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TapToPayMainViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainUiEffect> effects;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainUiEffect> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showError;

    @javax.inject.Inject
    public TapToPayMainViewModel(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase getTaxSettingsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTaxSettingsUseCase, "");
        this.getHighSpeedVideoFpsRanges = userStore;
        this.getHighSpeedVideoFpsRangesFor = getTaxSettingsUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.showError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainUiEffect> getEffects() {
        return this.effects;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowError() {
        return this.showError;
    }

    public static /* synthetic */ void onRequestClick$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel tapToPayMainViewModel, java.util.List list, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lineItem = null;
        }
        tapToPayMainViewModel.onRequestClick(list, lineItem);
    }

    public final void onRequestClick(java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> selectedItems, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem customAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedItems, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel$onRequestClick$1(this, customAmount, selectedItems, null), 3, null);
    }

    public final void onCancelClick() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel$onCancelClick$1(this, null), 3, null);
    }

    public final void dismissError() {
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.FALSE);
    }

    public final void onAddItemClick() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel$onAddItemClick$1(this, null), 3, null);
    }
}
