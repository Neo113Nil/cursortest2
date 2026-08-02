package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001*B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\r\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/subscriptions/cancel/domain/usecase/DisableAgreementUseCase;", "disableAgreementUseCase", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/ManageAgreementBottomSheetDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/cancel/domain/usecase/DisableAgreementUseCase;Lcom/paypal/oslo/feature/subscriptions/shared/navigation/ManageAgreementBottomSheetDestination;)V", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/subscriptions/cancel/domain/usecase/DisableAgreementUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/ManageAgreementBottomSheetDestination;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/MerchantManagementType;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiEffect;", "Lkotlinx/coroutines/channels/Channel;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManageAgreementViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementViewModel$Factory;", "", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/ManageAgreementBottomSheetDestination;", "destination", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementViewModel;", "create", "(Lcom/paypal/oslo/feature/subscriptions/shared/navigation/ManageAgreementBottomSheetDestination;)Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel create(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination destination);
    }

    @dagger.assisted.AssistedInject
    public ManageAgreementViewModel(com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase disableAgreementUseCase, @dagger.assisted.Assisted com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableAgreementUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAgreementBottomSheetDestination, "");
        this.getHighSpeedVideoFpsRangesFor = disableAgreementUseCase;
        this.getHighSpeedVideoSizes = manageAgreementBottomSheetDestination;
        this.getHighSpeedVideoFpsRanges = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(manageAgreementBottomSheetDestination.getAgreementType());
        this.Camera2StreamConfigurationMap = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.merchantManagementTypeFromString(manageAgreementBottomSheetDestination.getManagementType());
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage.INSTANCE.fromManageAgreementBottomSheetDestination(manageAgreementBottomSheetDestination));
        this.getInputFormats = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$performDisableAgreement(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$performDisableAgreement$1 manageAgreementViewModel$performDisableAgreement$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState value;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState value2;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable2;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$performDisableAgreement$1) {
            manageAgreementViewModel$performDisableAgreement$1 = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$performDisableAgreement$1) continuation;
            if ((manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase disableAgreementUseCase = manageAgreementViewModel.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = manageAgreementViewModel.getHighSpeedVideoFpsRanges;
                    manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoFpsRanges = 1;
                    obj = disableAgreementUseCase.invoke(str, agreementType, manageAgreementViewModel$performDisableAgreement$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    boolean booleanValue = ((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "disable consumer agreement status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("success", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue))), null, 4, null);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> mutableStateFlow = manageAgreementViewModel.getInputFormats;
                    do {
                        value2 = mutableStateFlow.getValue();
                        disable2 = value2;
                        if (disable2 instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) {
                            disable2 = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable.copy$default((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) disable2, null, null, false, false, null, 27, null);
                        } else {
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                            kotlin.Pair[] pairArr = new kotlin.Pair[2];
                            pairArr[0] = kotlin.TuplesKt.to("expectedState", "Disable");
                            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(disable2.getClass()).getSimpleName();
                            if (simpleName == null) {
                                simpleName = "";
                            }
                            pairArr[1] = kotlin.TuplesKt.to("actualState", simpleName);
                            com.paypal.android.logger.Logger.d$default(logger, "State changed during disable operation", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        }
                    } while (!mutableStateFlow.compareAndSet(value2, disable2));
                    if (booleanValue) {
                        manageAgreementViewModel.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.NavigateToDisablementSuccess(manageAgreementViewModel.getHighSpeedVideoSizes.getMerchantName(), manageAgreementViewModel.Camera2StreamConfigurationMap, com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(manageAgreementViewModel.getHighSpeedVideoSizes.getAgreementType())));
                    }
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Either.Left) either).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> mutableStateFlow2 = manageAgreementViewModel.getInputFormats;
                    do {
                        value = mutableStateFlow2.getValue();
                        disable = value;
                        if (disable instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) {
                            disable = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable.copy$default((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) disable, null, null, false, true, subscriptionsError.toErrorContext(), 3, null);
                        } else {
                            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                            pairArr2[0] = kotlin.TuplesKt.to("expectedState", "Disable");
                            java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(disable.getClass()).getSimpleName();
                            if (simpleName2 == null) {
                                simpleName2 = "";
                            }
                            pairArr2[1] = kotlin.TuplesKt.to("actualState", simpleName2);
                            com.paypal.android.logger.Logger.d$default(logger2, "State changed during disable operation", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                        }
                    } while (!mutableStateFlow2.compareAndSet(value, disable));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        manageAgreementViewModel$performDisableAgreement$1 = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$performDisableAgreement$1(manageAgreementViewModel, continuation);
        java.lang.Object obj2 = manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageAgreementViewModel$performDisableAgreement$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> getUiState() {
        return this.uiState;
    }

    public final void onEvent(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent event) {
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState value;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState value2;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage manage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage) {
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage manage2 = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage) event;
            if (kotlin.jvm.internal.Intrinsics.areEqual(manage2, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnUnlinkClicked.INSTANCE)) {
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> mutableStateFlow = this.getInputFormats;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getMerchantName(), false, false, null, 28, null))) {
                }
                return;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(manage2, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnCloseClicked.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.DismissModal.INSTANCE));
                return;
            }
        }
        if (!(event instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable disable2 = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable) event;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(disable2, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnBackButtonPressed.INSTANCE)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(disable2, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementConfirmed.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(disable2, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnTryAgainClicked.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(disable2, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementCanceled.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(disable2, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnCloseClicked.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiEffect.DismissModal.INSTANCE));
                    return;
                }
                com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState value3 = this.getInputFormats.getValue();
                if (!(value3 instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) || ((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) value3).isDisabling()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Retry already in progress or state changed, ignoring retry request", null, null, 6, null);
                    return;
                }
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> mutableStateFlow2 = this.getInputFormats;
                do {
                    value = mutableStateFlow2.getValue();
                    disable = value;
                    if (disable instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) {
                        disable = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable.copy$default((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) disable, null, null, true, false, null, 3, null);
                    }
                } while (!mutableStateFlow2.compareAndSet(value, disable));
                java.lang.String agreementId = this.getHighSpeedVideoSizes.getAgreementId();
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Retrying disable consumer agreement", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementId", agreementId)), 2, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$retryDisableAgreement$1(this, agreementId, null), 3, null);
                return;
            }
            java.lang.String agreementId2 = this.getHighSpeedVideoSizes.getAgreementId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Disabling consumer agreement", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementId", agreementId2)), 2, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$disableAgreement$1(this, agreementId2, null), 3, null);
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState> mutableStateFlow3 = this.getInputFormats;
        do {
            value2 = mutableStateFlow3.getValue();
            manage = value2;
            if (manage instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) {
                com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable3 = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) manage;
                if (disable3.isError()) {
                    manage = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable.copy$default(disable3, null, null, false, false, null, 7, null);
                } else {
                    manage = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage.INSTANCE.fromManageAgreementBottomSheetDestination(this.getHighSpeedVideoSizes);
                }
            }
        } while (!mutableStateFlow3.compareAndSet(value2, manage));
    }
}
