package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R \u00102\u001a\b\u0012\u0004\u0012\u00020/018\u0001X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/AccountVisibilityViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityUseCase;", "getAccountVisibilityUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/SimplifiedPolicyUseCases;", "simplifiedUseCases", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularSendMoneyUseCases;", "sendMoneyUseCases", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularRequestMoneyUseCases;", "requestMoneyUseCases", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityUseCase;Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/SimplifiedPolicyUseCases;Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularSendMoneyUseCases;Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularRequestMoneyUseCases;)V", "", "retry", "()V", "", "enabled", "updateAllowFindByIdentifiers", "(Z)V", "allowPaymentRequests", "updateAllowPaymentRequests", "", "selectedIndex", "updatePaymentRequestsFrom", "(I)V", "", "profileId", "updateAllowFindViaPayPalMe", "(ZLjava/lang/String;)V", "updateGranularPersonalProfile", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/SimpleVisibilityToggle;", "toggle", "updateSimpleToggle$consumer_privacy_prodRelease", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/SimpleVisibilityToggle;Z)V", "clearBanner", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Content;", "getHighSpeedVideoSizes", "()Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState$Content;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityUseCase;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/SimplifiedPolicyUseCases;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularSendMoneyUseCases;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/GranularRequestMoneyUseCases;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/AccountVisibilityUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$consumer_privacy_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountVisibilityViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState> uiState;

    @javax.inject.Inject
    public AccountVisibilityViewModel(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase getAccountVisibilityUseCase, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases simplifiedPolicyUseCases, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases granularSendMoneyUseCases, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases granularRequestMoneyUseCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountVisibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simplifiedPolicyUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(granularSendMoneyUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(granularRequestMoneyUseCases, "");
        this.getHighSpeedVideoSizes = getAccountVisibilityUseCase;
        this.getHighSpeedVideoFpsRanges = simplifiedPolicyUseCases;
        this.getHighSpeedVideoFpsRangesFor = granularSendMoneyUseCases;
        this.getHighResolutionOutputSizeshNQ4ISI = granularRequestMoneyUseCases;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Loading.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        retry();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$refreshDataAfterMutation(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$refreshDataAfterMutation$1 accountVisibilityViewModel$refreshDataAfterMutation$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$refreshDataAfterMutation$1) {
            accountVisibilityViewModel$refreshDataAfterMutation$1 = (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$refreshDataAfterMutation$1) continuation;
            if ((accountVisibilityViewModel$refreshDataAfterMutation$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                accountVisibilityViewModel$refreshDataAfterMutation$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = accountVisibilityViewModel$refreshDataAfterMutation$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityViewModel$refreshDataAfterMutation$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityUseCase getAccountVisibilityUseCase = accountVisibilityViewModel.getHighSpeedVideoSizes;
                    accountVisibilityViewModel$refreshDataAfterMutation$1.getHighResolutionOutputSizeshNQ4ISI = content;
                    accountVisibilityViewModel$refreshDataAfterMutation$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getAccountVisibilityUseCase.invoke(accountVisibilityViewModel$refreshDataAfterMutation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    content = (com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content) accountVisibilityViewModel$refreshDataAfterMutation$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    accountVisibilityViewModel.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Error(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$getErrorMessage((com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError) ((arrow.core.Ior.Left) ior).getValue())));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    accountVisibilityViewModel.Camera2StreamConfigurationMap.setValue(content.copy((com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData) ((arrow.core.Ior.Right) ior).getValue(), false, null));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    accountVisibilityViewModel.Camera2StreamConfigurationMap.setValue(content.copy((com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData) both.getRightValue(), false, null));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        accountVisibilityViewModel$refreshDataAfterMutation$1 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$refreshDataAfterMutation$1(accountVisibilityViewModel, continuation);
        java.lang.Object obj2 = accountVisibilityViewModel$refreshDataAfterMutation$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityViewModel$refreshDataAfterMutation$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState> getUiState$consumer_privacy_prodRelease() {
        return this.uiState;
    }

    public final void retry() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$retry$1(this, null), 3, null);
    }

    public final void updateAllowFindByIdentifiers(boolean enabled) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateAllowFindByIdentifiers$1(this, highSpeedVideoSizes, enabled, null), 3, null);
    }

    public final void updateAllowPaymentRequests(boolean allowPaymentRequests) {
        java.lang.Boolean allowFindByIdentifiers;
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null || (allowFindByIdentifiers = highSpeedVideoSizes.getData().getAllowFindByIdentifiers()) == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateAllowPaymentRequests$1(this, highSpeedVideoSizes, allowFindByIdentifiers.booleanValue(), allowPaymentRequests, null), 3, null);
    }

    public final void updatePaymentRequestsFrom(int selectedIndex) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            java.lang.Boolean allowFindByIdentifiers = highSpeedVideoSizes.getData().getAllowFindByIdentifiers();
            java.lang.Boolean allowPaymentRequests = highSpeedVideoSizes.getData().getAllowPaymentRequests();
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType access$mapIndexToPaymentRequestsFrom = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$mapIndexToPaymentRequestsFrom(selectedIndex);
            if (allowFindByIdentifiers == null || allowPaymentRequests == null || access$mapIndexToPaymentRequestsFrom == null) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updatePaymentRequestsFrom$1(this, highSpeedVideoSizes, allowFindByIdentifiers, allowPaymentRequests, access$mapIndexToPaymentRequestsFrom, null), 3, null);
        }
    }

    public final void updateAllowFindViaPayPalMe(boolean enabled, java.lang.String profileId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileId, "");
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateAllowFindViaPayPalMe$1(this, highSpeedVideoSizes, enabled, profileId, null), 3, null);
    }

    public final void updateGranularPersonalProfile(boolean enabled, java.lang.String profileId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileId, "");
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateGranularPersonalProfile$1(this, highSpeedVideoSizes, enabled, profileId, null), 3, null);
    }

    public final void updateSimpleToggle$consumer_privacy_prodRelease(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle toggle, boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toggle, "");
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateSimpleToggle$1(this, highSpeedVideoSizes, toggle, enabled, null), 3, null);
    }

    public final void clearBanner() {
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState value = this.Camera2StreamConfigurationMap.getValue();
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content) {
            this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content) value, null, false, null, 3, null));
        }
    }

    private final com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content getHighSpeedVideoSizes() {
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState value = this.Camera2StreamConfigurationMap.getValue();
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content) {
            return (com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content) value;
        }
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError) {
            return new com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content(((com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.PartialError) value).getData(), false, null, 6, null);
        }
        return null;
    }
}
