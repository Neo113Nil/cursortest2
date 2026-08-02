package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002IJB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b \u0010\u0019J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ(\u0010&\u001a\u00020\f2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00104R\u001d\u00107\u001a\b\u0012\u0004\u0012\u000203068\u0007¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u00104R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u0018\u0010/\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00104R\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bD\u0010:R\u0018\u0010@\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010FR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020G028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00104R \u0010H\u001a\b\u0012\u0004\u0012\u00020G068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bH\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/GetBankDefinitionsUseCase;", "getBankDefinitionsUseCase", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/AddBankManualUseCase;", "addBankManualUseCase", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankDetailsUseCase;", "getBankDetailsUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/GetBankDefinitionsUseCase;Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/AddBankManualUseCase;Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankDetailsUseCase;Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "resetNavigation", "()V", "onBackClick", "onErrorExit", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "bankConfirmationFlowHandler", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "retry", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;", "params", "submitBankAccount", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;)V", "clearSubmissionError", "clearBankDetails", "", "routingNumber", "fetchBankDetails", "(Ljava/lang/String;)V", "addBankAccount", "clearAddBankResult", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Content;", "Lkotlin/ExtensionFunctionType;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function1;)V", "getOutputFormats", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/GetBankDefinitionsUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/AddBankManualUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankDetailsUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo;", "getOutputMinFrameDuration", "navigateTo", "getNavigateTo", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/Job;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "addBankResult", "getAddBankResult", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "", "isAddingBank", "State", "NavigateTo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManualAddBankViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome> addBankResult;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isAddingBank;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> navigateTo;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State> uiState;

    @javax.inject.Inject
    public ManualAddBankViewModel(com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase getBankDefinitionsUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase addBankManualUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase getBankDetailsUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBankDefinitionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankManualUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBankDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.Camera2StreamConfigurationMap = getBankDefinitionsUseCase;
        this.getHighSpeedVideoFpsRangesFor = addBankManualUseCase;
        this.getHighSpeedVideoFpsRanges = getBankDetailsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputMinFrameDuration = MutableStateFlow2;
        this.navigateTo = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputFormats = MutableStateFlow3;
        this.addBankResult = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getInputFormats = MutableStateFlow4;
        this.isAddingBank = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(manualAddBankViewModel), null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDefinitions$1(this, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(manualAddBankViewModel), null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$observeUserProfile$1(this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State;", "", "<init>", "()V", "Loading", "Error", "Content", "Success", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Content;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Loading INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Loading();

            public final int hashCode() {
                return -994687406;
            }

            private Loading() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Loading";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State;", "", "errorTitle", "errorMessage", "actionButtonLabel", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getErrorTitle", "getErrorMessage", "getActionButtonLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State {
            public static final int $stable = 0;
            private final int actionButtonLabel;
            private final int errorMessage;
            private final int errorTitle;

            public Error(int i, int i2, int i3) {
                super(null);
                this.errorTitle = i;
                this.errorMessage = i2;
                this.actionButtonLabel = i3;
            }

            public /* synthetic */ Error(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i4 & 1) != 0 ? com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong : i, (i4 & 2) != 0 ? com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_error : i2, (i4 & 4) != 0 ? com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_try_again : i3);
            }

            public final int getErrorTitle() {
                return this.errorTitle;
            }

            public final int getErrorMessage() {
                return this.errorMessage;
            }

            public final int getActionButtonLabel() {
                return this.actionButtonLabel;
            }

            public final java.lang.String toString() {
                int i = this.errorTitle;
                int i2 = this.errorMessage;
                int i3 = this.actionButtonLabel;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorTitle=");
                sb.append(i);
                sb.append(", errorMessage=");
                sb.append(i2);
                sb.append(", actionButtonLabel=");
                sb.append(i3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((java.lang.Integer.hashCode(this.errorTitle) * 31) + java.lang.Integer.hashCode(this.errorMessage)) * 31) + java.lang.Integer.hashCode(this.actionButtonLabel);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error error = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error) other;
                return this.errorTitle == error.errorTitle && this.errorMessage == error.errorMessage && this.actionButtonLabel == error.actionButtonLabel;
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error copy(int errorTitle, int errorMessage, int actionButtonLabel) {
                return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error(errorTitle, errorMessage, actionButtonLabel);
            }

            /* renamed from: component3, reason: from getter */
            public final int getActionButtonLabel() {
                return this.actionButtonLabel;
            }

            /* renamed from: component2, reason: from getter */
            public final int getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final int getErrorTitle() {
                return this.errorTitle;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error error, int i, int i2, int i3, int i4, java.lang.Object obj) {
                if ((i4 & 1) != 0) {
                    i = error.errorTitle;
                }
                if ((i4 & 2) != 0) {
                    i2 = error.errorMessage;
                }
                if ((i4 & 4) != 0) {
                    i3 = error.actionButtonLabel;
                }
                return error.copy(i, i2, i3);
            }

            public Error() {
                this(0, 0, 0, 7, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017Jx\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b\u0006\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b/\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b0\u0010\u0017R\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b\r\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b1\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b2\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Content;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;", "definitions", "", "isSubmitting", "", "submissionErrorMessage", "", "submissionErrorResId", "bankName", "bankLogoUrl", "isLoadingBankDetails", "userGivenName", "userSurname", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Content;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/util/List;", "getDefinitions", "Z", "Ljava/lang/String;", "getSubmissionErrorMessage", "Ljava/lang/Integer;", "getSubmissionErrorResId", "getBankName", "getBankLogoUrl", "getUserGivenName", "getUserSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Content extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State {
            public static final int $stable = 8;
            private final java.lang.String bankLogoUrl;
            private final java.lang.String bankName;
            private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> definitions;
            private final boolean isLoadingBankDetails;
            private final boolean isSubmitting;
            private final java.lang.String submissionErrorMessage;
            private final java.lang.Integer submissionErrorResId;
            private final java.lang.String userGivenName;
            private final java.lang.String userSurname;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> list, boolean z, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, boolean z2, java.lang.String str4, java.lang.String str5) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
                this.definitions = list;
                this.isSubmitting = z;
                this.submissionErrorMessage = str;
                this.submissionErrorResId = num;
                this.bankName = str2;
                this.bankLogoUrl = str3;
                this.isLoadingBankDetails = z2;
                this.userGivenName = str4;
                this.userSurname = str5;
            }

            public /* synthetic */ Content(java.util.List list, boolean z, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, boolean z2, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? str3 : null, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? "" : str4, (i & 256) == 0 ? str5 : "");
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> getDefinitions() {
                return this.definitions;
            }

            public final boolean isSubmitting() {
                return this.isSubmitting;
            }

            public final java.lang.String getSubmissionErrorMessage() {
                return this.submissionErrorMessage;
            }

            public final java.lang.Integer getSubmissionErrorResId() {
                return this.submissionErrorResId;
            }

            public final java.lang.String getBankName() {
                return this.bankName;
            }

            public final java.lang.String getBankLogoUrl() {
                return this.bankLogoUrl;
            }

            public final boolean isLoadingBankDetails() {
                return this.isLoadingBankDetails;
            }

            public final java.lang.String getUserGivenName() {
                return this.userGivenName;
            }

            public final java.lang.String getUserSurname() {
                return this.userSurname;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> list = this.definitions;
                boolean z = this.isSubmitting;
                java.lang.String str = this.submissionErrorMessage;
                java.lang.Integer num = this.submissionErrorResId;
                java.lang.String str2 = this.bankName;
                java.lang.String str3 = this.bankLogoUrl;
                boolean z2 = this.isLoadingBankDetails;
                java.lang.String str4 = this.userGivenName;
                java.lang.String str5 = this.userSurname;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(definitions=");
                sb.append(list);
                sb.append(", isSubmitting=");
                sb.append(z);
                sb.append(", submissionErrorMessage=");
                sb.append(str);
                sb.append(", submissionErrorResId=");
                sb.append(num);
                sb.append(", bankName=");
                sb.append(str2);
                sb.append(", bankLogoUrl=");
                sb.append(str3);
                sb.append(", isLoadingBankDetails=");
                sb.append(z2);
                sb.append(", userGivenName=");
                sb.append(str4);
                sb.append(", userSurname=");
                sb.append(str5);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.definitions.hashCode();
                int hashCode2 = java.lang.Boolean.hashCode(this.isSubmitting);
                java.lang.String str = this.submissionErrorMessage;
                int hashCode3 = str == null ? 0 : str.hashCode();
                java.lang.Integer num = this.submissionErrorResId;
                int hashCode4 = num == null ? 0 : num.hashCode();
                java.lang.String str2 = this.bankName;
                int hashCode5 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.bankLogoUrl;
                return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isLoadingBankDetails)) * 31) + this.userGivenName.hashCode()) * 31) + this.userSurname.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content content = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.definitions, content.definitions) && this.isSubmitting == content.isSubmitting && kotlin.jvm.internal.Intrinsics.areEqual(this.submissionErrorMessage, content.submissionErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.submissionErrorResId, content.submissionErrorResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, content.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoUrl, content.bankLogoUrl) && this.isLoadingBankDetails == content.isLoadingBankDetails && kotlin.jvm.internal.Intrinsics.areEqual(this.userGivenName, content.userGivenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.userSurname, content.userSurname);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> definitions, boolean isSubmitting, java.lang.String submissionErrorMessage, java.lang.Integer submissionErrorResId, java.lang.String bankName, java.lang.String bankLogoUrl, boolean isLoadingBankDetails, java.lang.String userGivenName, java.lang.String userSurname) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitions, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userGivenName, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userSurname, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content(definitions, isSubmitting, submissionErrorMessage, submissionErrorResId, bankName, bankLogoUrl, isLoadingBankDetails, userGivenName, userSurname);
            }

            /* renamed from: component9, reason: from getter */
            public final java.lang.String getUserSurname() {
                return this.userSurname;
            }

            /* renamed from: component8, reason: from getter */
            public final java.lang.String getUserGivenName() {
                return this.userGivenName;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsLoadingBankDetails() {
                return this.isLoadingBankDetails;
            }

            /* renamed from: component6, reason: from getter */
            public final java.lang.String getBankLogoUrl() {
                return this.bankLogoUrl;
            }

            /* renamed from: component5, reason: from getter */
            public final java.lang.String getBankName() {
                return this.bankName;
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.Integer getSubmissionErrorResId() {
                return this.submissionErrorResId;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getSubmissionErrorMessage() {
                return this.submissionErrorMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsSubmitting() {
                return this.isSubmitting;
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> component1() {
                return this.definitions;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content content, java.util.List list, boolean z, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, boolean z2, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
                return content.copy((i & 1) != 0 ? content.definitions : list, (i & 2) != 0 ? content.isSubmitting : z, (i & 4) != 0 ? content.submissionErrorMessage : str, (i & 8) != 0 ? content.submissionErrorResId : num, (i & 16) != 0 ? content.bankName : str2, (i & 32) != 0 ? content.bankLogoUrl : str3, (i & 64) != 0 ? content.isLoadingBankDetails : z2, (i & 128) != 0 ? content.userGivenName : str4, (i & 256) != 0 ? content.userSurname : str5);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Success INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Success();

            public final int hashCode() {
                return 1096459545;
            }

            private Success() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Success";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Success)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo;", "", "GoBackWithResult", "NavigateForResult", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo$GoBackWithResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo$NavigateForResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface NavigateTo {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo$GoBackWithResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo$GoBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GoBackWithResult implements com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result;

            public GoBackWithResult(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankFlowNavResult, "");
                this.result = bankFlowNavResult;
            }

            public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult getResult() {
                return this.result;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GoBackWithResult(result=");
                sb.append(bankFlowNavResult);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult) other).result);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult copy(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult goBackWithResult, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    bankFlowNavResult = goBackWithResult.result;
                }
                return goBackWithResult.copy(bankFlowNavResult);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo$NavigateForResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "copy", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ManualAddBankViewModel$NavigateTo$NavigateForResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateForResult implements com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.wallet.ui.Destination destination;

            public NavigateForResult(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                this.destination = destination;
            }

            public final com.paypal.oslo.feature.wallet.wallet.ui.Destination getDestination() {
                return this.destination;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.wallet.ui.Destination destination = this.destination;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateForResult(destination=");
                sb.append(destination);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.destination.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult) other).destination);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult copy(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult(destination);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.wallet.ui.Destination getDestination() {
                return this.destination;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult navigateForResult, com.paypal.oslo.feature.wallet.wallet.ui.Destination destination, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    destination = navigateForResult.destination;
                }
                return navigateForResult.copy(destination);
            }
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> getNavigateTo() {
        return this.navigateTo;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome> getAddBankResult() {
        return this.addBankResult;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isAddingBank() {
        return this.isAddingBank;
    }

    public final void resetNavigation() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow = this.getOutputMinFrameDuration;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
        }
    }

    public final void onBackClick() {
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow = this.getOutputMinFrameDuration;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
        }
    }

    public final void onErrorExit() {
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error("Something went wrong", (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow = this.getOutputMinFrameDuration;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
        }
    }

    public final void bankConfirmationFlowHandler(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result) {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer issuer;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (!(result.getOutcome() instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success)) {
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.getHighSpeedVideoSizesFor;
            java.lang.String str = null;
            java.lang.String id = bankAccountDetails != null ? bankAccountDetails.getId() : null;
            if (id == null) {
                id = "";
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails2 = this.getHighSpeedVideoSizesFor;
            java.lang.String obj = (bankAccountDetails2 == null || (type = bankAccountDetails2.getType()) == null) ? null : type.toString();
            if (obj == null) {
                obj = "";
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails3 = this.getHighSpeedVideoSizesFor;
            java.lang.String lastNChars = bankAccountDetails3 != null ? bankAccountDetails3.getLastNChars() : null;
            if (lastNChars == null) {
                lastNChars = "";
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails4 = this.getHighSpeedVideoSizesFor;
            if (bankAccountDetails4 != null && (issuer = bankAccountDetails4.getIssuer()) != null) {
                str = issuer.getName();
            }
            com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount(id, obj, lastNChars, str != null ? str : "")), "Bank linked but was not confirmed.", (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow = this.getOutputMinFrameDuration;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
            }
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow2 = this.getOutputMinFrameDuration;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success.copy$default((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success) result.getOutcome(), null, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_your_bank_is_confirmed), 3, null))))) {
        }
    }

    public final void retry() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Retrying bank definitions fetch", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDefinitions$1(this, null), 3, null);
    }

    public final void submitBankAccount(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$submitBankAccount$1(this, params, null), 3, null);
    }

    public final void clearSubmissionError() {
        getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.$r8$lambda$kVOV7mvixFu5N_C205SY5YQX3gs((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj);
            }
        });
    }

    public final void clearBankDetails() {
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.$r8$lambda$q1QZYrX_xGubgHRtelJTb58qo4k((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj);
            }
        });
    }

    public final void fetchBankDetails(java.lang.String routingNumber) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
        if (kotlin.text.StringsKt.isBlank(routingNumber)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Routing number is blank, skipping bank details fetch", null, null, 6, null);
            return;
        }
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1(this, routingNumber, null), 3, null);
        this.getInputSizeshNQ4ISI = launch$default;
    }

    public final void addBankAccount(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$addBankAccount$1(this, params, null), 3, null);
    }

    public final void clearAddBankResult() {
        this.getOutputFormats.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content> p0) {
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State value;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content content;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content invoke;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            content = value;
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content content2 = content instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content ? (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) content : null;
            if (content2 != null && (invoke = p0.invoke(content2)) != null) {
                content = invoke;
            }
        } while (!mutableStateFlow.compareAndSet(value, content));
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content $r8$lambda$kVOV7mvixFu5N_C205SY5YQX3gs(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default(content, null, false, null, null, null, null, false, null, null, 499, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content $r8$lambda$q1QZYrX_xGubgHRtelJTb58qo4k(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default(content, null, false, null, null, null, null, false, null, null, 399, null);
    }

    public static final /* synthetic */ void access$checkAndLaunchInstantRD(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, java.lang.String str) {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = manualAddBankViewModel.getHighSpeedVideoSizesFor;
        if (bankAccountDetails == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Mutation returned no bankAccountDetails, completing flow", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str)), 2, null);
            com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error("Mutation returned with no result", (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State> mutableStateFlow = manualAddBankViewModel.getHighSpeedVideoSizes;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Success.INSTANCE)) {
            }
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow2 = manualAddBankViewModel.getOutputMinFrameDuration;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bankAccountDetails, "");
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation confirmation = bankAccountDetails.getConfirmation();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus status = confirmation != null ? confirmation.getStatus() : null;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> availableActions = bankAccountDetails.getAvailableActions();
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus = confirmation != null ? confirmation.getRealTimePaymentsDepositStatus() : null;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State> mutableStateFlow3 = manualAddBankViewModel.getHighSpeedVideoSizes;
        while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Success.INSTANCE)) {
        }
        if (status == com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.CONFIRMED) {
            com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult2 = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount(str, bankAccountDetails.getType().toString(), bankAccountDetails.getLastNChars(), bankAccountDetails.getIssuer().getName())), "Bank was already confirmed.", java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_already_confirmed)));
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow4 = manualAddBankViewModel.getOutputMinFrameDuration;
            while (!mutableStateFlow4.compareAndSet(mutableStateFlow4.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult2))) {
            }
            return;
        }
        boolean contains = availableActions.contains(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION);
        if (realTimePaymentsDepositStatus == com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.SUCCESS && contains) {
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation randomDepositsBankConfirmation = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation(bankAccountDetails, false, 2, defaultConstructorMarker);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow5 = manualAddBankViewModel.getOutputMinFrameDuration;
            while (!mutableStateFlow5.compareAndSet(mutableStateFlow5.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult(randomDepositsBankConfirmation))) {
            }
        } else if (realTimePaymentsDepositStatus == com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.UNKNOWN) {
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions randomDepositInstructions = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions(str, availableActions.contains(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_INSTANT_CONFIRMATION), bankAccountDetails);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow6 = manualAddBankViewModel.getOutputMinFrameDuration;
            while (!mutableStateFlow6.compareAndSet(mutableStateFlow6.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult(randomDepositInstructions))) {
            }
        } else {
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation addBankManualConfirmation = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation(str, bankAccountDetails);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo> mutableStateFlow7 = manualAddBankViewModel.getOutputMinFrameDuration;
            while (!mutableStateFlow7.compareAndSet(mutableStateFlow7.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.NavigateTo.NavigateForResult(addBankManualConfirmation))) {
            }
        }
    }
}
