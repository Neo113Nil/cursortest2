package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GetUserAccountsUseCase;", "getAccounts", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GetUserAccountsUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "", "loadAccounts", "()V", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "userAccount", "switchAccount", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/GetUserAccountsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserAccountSwitchViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState> uiState;

    @javax.inject.Inject
    public UserAccountSwitchViewModel(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase getUserAccountsUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserAccountsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getUserAccountsUseCase;
        this.getHighSpeedVideoSizes = stringProvider;
        this.Camera2StreamConfigurationMap = appNavigator;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        loadAccounts();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState> getUiState() {
        return this.uiState;
    }

    public final void loadAccounts() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel$loadAccounts$1(this, null), 3, null);
    }

    public final void switchAccount(final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccount, "");
        if (userAccount.isActive()) {
            return;
        }
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel.$r8$lambda$WrNkoVtSeRe5hcUqMKa9tDxHCTg(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WrNkoVtSeRe5hcUqMKa9tDxHCTg(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount userAccount, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.identity.api.navigation.AccountSwitchLoadingScreenDestination(userAccount.getPartyId(), userAccount.isBusinessProfile() ? com.paypal.oslo.feature.identity.R.string.feature_identity_account_switch_type_business : com.paypal.oslo.feature.identity.R.string.feature_identity_account_switch_type_personal, userAccount.getFullName()));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleLoadError(com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel userAccountSwitchViewModel, com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError dataResultError) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to load accounts", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(dataResultError.getClass()).getSimpleName())), null, 4, null);
        userAccountSwitchViewModel.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Error(userAccountSwitchViewModel.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_account_switch_error_generic)));
    }

    public static final /* synthetic */ void access$handlePartialData(com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel userAccountSwitchViewModel, com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError dataResultError, com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse userAccountSwitchResponse) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Partial account data received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(dataResultError.getClass()).getSimpleName())), null, 4, null);
        userAccountSwitchViewModel.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success(userAccountSwitchResponse.getAccounts(), userAccountSwitchResponse.getProfileOptions(), userAccountSwitchResponse.getLinkProfileOptions()));
    }
}
