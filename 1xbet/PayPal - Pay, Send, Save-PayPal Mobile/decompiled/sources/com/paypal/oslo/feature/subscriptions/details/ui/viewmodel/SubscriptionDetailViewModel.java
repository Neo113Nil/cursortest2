package com.paypal.oslo.feature.subscriptions.details.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/SubscriptionDetailsUiEvent;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/usecase/GetConsumerAgreementUseCase;", "getConsumerAgreementUseCase", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "formatHelper", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/details/domain/usecase/GetConsumerAgreementUseCase;Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "", "agreementId", "", "loadSubscriptionDetails", "(Ljava/lang/String;)V", "retry", "onUpdateFiSuccess", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/subscriptions/details/domain/usecase/GetConsumerAgreementUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "updateFiRequestId", "Ljava/lang/String;", "getUpdateFiRequestId-QDVFmTU", "()Ljava/lang/String;", "", "p0", "fiUpdated", "Z", "getFiUpdated", "()Z", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionDetailViewModel extends androidx.view.ViewModel implements com.paypal.oslo.feature.subscriptions.details.domain.SubscriptionDetailsUiEvent {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType Camera2StreamConfigurationMap;
    private boolean fiUpdated;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState> uiState;
    private final java.lang.String updateFiRequestId;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailViewModel$Factory;", "", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailViewModel;", "create", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel create(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType);
    }

    @dagger.assisted.AssistedInject
    public SubscriptionDetailViewModel(com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase getConsumerAgreementUseCase, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, @dagger.assisted.Assisted com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getConsumerAgreementUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getConsumerAgreementUseCase;
        this.getHighSpeedVideoFpsRanges = formatHelper;
        this.Camera2StreamConfigurationMap = agreementType;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Initial.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.updateFiRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState> getUiState() {
        return this.uiState;
    }

    /* renamed from: getUpdateFiRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getUpdateFiRequestId() {
        return this.updateFiRequestId;
    }

    public final boolean getFiUpdated() {
        return this.fiUpdated;
    }

    @Override // com.paypal.oslo.feature.subscriptions.details.domain.SubscriptionDetailsUiEvent
    public final void loadSubscriptionDetails(java.lang.String agreementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Loading subscription details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementId", agreementId)), null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel$loadSubscriptionDetails$1(this, agreementId, null), 3, null);
    }

    public final void retry(java.lang.String agreementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "User triggered retry for subscription details", null, null, 6, null);
        loadSubscriptionDetails(agreementId);
    }

    public final void onUpdateFiSuccess(java.lang.String agreementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
        this.fiUpdated = true;
        loadSubscriptionDetails(agreementId);
    }
}
