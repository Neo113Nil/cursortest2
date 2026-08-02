package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001$B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;", "updateCustomer", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;)V", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent;", "event", "Lkotlinx/coroutines/Job;", "handleEvent$business_customers_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent;)Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/UpdateCustomerUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEffects", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddEmailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "presentationMode", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailViewModel;", "create", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;)Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel create(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode presentationMode);
    }

    @dagger.assisted.AssistedInject
    public AddEmailViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, @dagger.assisted.Assisted com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCustomerUseCase, "");
        this.Camera2StreamConfigurationMap = updateCustomerUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState(customer, customersPresentationMode, false, false, 12, null));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.uiEffects = MutableSharedFlow$default;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    public final kotlinx.coroutines.Job handleEvent$business_customers_prodRelease(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent event) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel$handleEvent$1(event, this, null), 3, null);
        return launch$default;
    }
}
