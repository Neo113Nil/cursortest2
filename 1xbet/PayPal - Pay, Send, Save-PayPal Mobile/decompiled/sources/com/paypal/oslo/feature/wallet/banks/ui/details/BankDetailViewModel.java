package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u00017B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0011J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\"\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020.0)8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0)8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002040&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010(R \u00105\u001a\b\u0012\u0004\u0012\u0002040)8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/BankDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankAccountDetailsUseCase;", "getBankAccountDetailsUseCase", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/GetBankBannersUiUtil;", "getBankBannersUiUtil", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/UpdateBankAccountNicknameUseCase;", "updateBankAccountNicknameUseCase", "", "bankAccountId", "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankAccountDetailsUseCase;Lcom/paypal/oslo/feature/wallet/banks/ui/details/GetBankBannersUiUtil;Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/UpdateBankAccountNicknameUseCase;Ljava/lang/String;Landroid/content/Context;)V", "bankInstrumentId", "", "loadBankDetails", "(Ljava/lang/String;)V", "resetNavigationState", "()V", "nickname", "onSaveNickname", "clearNicknameUpdateError", "getInputFormats", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankAccountDetailsUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/GetBankBannersUiUtil;", "getHighSpeedVideoFpsRangesFor", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/UpdateBankAccountNicknameUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getBankAccountId", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailsNavigateState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "navigationState", "Lkotlinx/coroutines/flow/StateFlow;", "getNavigationState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailUiState;", "getOutputFormats", "uiState", "getUiState$wallet_prodRelease", "nicknameUpdateError", "getNicknameUpdateError$wallet_prodRelease", "", "isNicknameUpdateLoading", "isNicknameUpdateLoading$wallet_prodRelease", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDetailViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getHighSpeedVideoSizesFor;
    private final java.lang.String bankAccountId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNicknameUpdateLoading;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState> navigationState;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> nicknameUpdateError;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/BankDetailViewModel$Factory;", "", "", "bankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/BankDetailViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/details/BankDetailViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel create(java.lang.String bankAccountId);
    }

    @dagger.assisted.AssistedInject
    public BankDetailViewModel(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase getBankAccountDetailsUseCase, com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil getBankBannersUiUtil, com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase updateBankAccountNicknameUseCase, @dagger.assisted.Assisted java.lang.String str, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBankAccountDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBankBannersUiUtil, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateBankAccountNicknameUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = getBankAccountDetailsUseCase;
        this.getHighSpeedVideoFpsRangesFor = getBankBannersUiUtil;
        this.getHighResolutionOutputSizeshNQ4ISI = updateBankAccountNicknameUseCase;
        this.bankAccountId = str;
        this.getHighSpeedVideoSizes = context;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.navigationState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Loading.INSTANCE);
        this.getOutputFormats = MutableStateFlow2;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizesFor = MutableStateFlow3;
        this.nicknameUpdateError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getOutputMinFrameDuration = MutableStateFlow4;
        this.isNicknameUpdateLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
    }

    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState> getNavigationState() {
        return this.navigationState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState> getUiState$wallet_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getNicknameUpdateError$wallet_prodRelease() {
        return this.nicknameUpdateError;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isNicknameUpdateLoading$wallet_prodRelease() {
        return this.isNicknameUpdateLoading;
    }

    public final void loadBankDetails(java.lang.String bankInstrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankInstrumentId, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$loadBankDetails$1(this, bankInstrumentId, null), 3, null);
    }

    public final void resetNavigationState() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
        }
    }

    public final void onSaveNickname(java.lang.String nickname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nickname, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$onSaveNickname$1(this, nickname, null), 3, null);
    }

    public final void clearNicknameUpdateError() {
        this.getHighSpeedVideoSizesFor.setValue(null);
    }
}
