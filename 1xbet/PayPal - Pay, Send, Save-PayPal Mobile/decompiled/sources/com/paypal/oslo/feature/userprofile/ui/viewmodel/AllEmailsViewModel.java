package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R)\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllEmailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetEmailsUseCase;", "getEmailsUseCase", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetEmailsUseCase;)V", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllEmailsAction;", "action", "", "handleAction", "(Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllEmailsAction;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetEmailsUseCase;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllEmailsEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllEmailsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsEvent> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>> uiState;

    @javax.inject.Inject
    public AllEmailsViewModel(com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase getEmailsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEmailsUseCase, "");
        this.getHighSpeedVideoSizes = getEmailsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow$default;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileEmail>>> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsEvent> getEvents() {
        return this.events;
    }

    public final void handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction.RetryLoading) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$loadEmails$1(this, null), 3, null);
            return;
        }
        if (action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction.SelectEmail) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$selectEmail$1(this, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction.SelectEmail) action).getEmailId(), null), 3, null);
        } else {
            if (action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsAction.AddEmail) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllEmailsViewModel$addEmail$1(this, null), 3, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
