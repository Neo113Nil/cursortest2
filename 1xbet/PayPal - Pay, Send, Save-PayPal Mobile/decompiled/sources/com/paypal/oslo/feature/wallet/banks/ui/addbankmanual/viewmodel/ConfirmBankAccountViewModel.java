package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002-.B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\fJ/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\fR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0$8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010("}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/ConfirmBankAccountUseCase;", "confirmBankAccountUseCase", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/ConfirmBankAccountUseCase;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "bankAccountDetails", "", "onConfirmSuccess", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)V", "onFailure", "()V", "onBackClick", "onCloseClick", "onIbcFlowClick", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult;", "result", "ibcFlowResultHandler", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/ConfirmBankFlowNavResult;)V", "resetNavigation", "", "bankAccountId", "depositAmount1", "depositAmount2", "currencyCode", "confirmBankAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "resetState", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/ConfirmBankAccountUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo;", "getHighSpeedVideoSizes", "navigateTo", "getNavigateTo", "UiState", "NavigateTo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmBankAccountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> navigateTo;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState> uiState;

    @javax.inject.Inject
    public ConfirmBankAccountViewModel(com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankAccountUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = confirmBankAccountUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Idle.INSTANCE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizes = MutableStateFlow2;
        this.navigateTo = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState;", "", "<init>", "()V", "Idle", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Idle;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UiState {
        public static final int $stable = 0;

        private UiState() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Idle;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Idle extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Idle INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Idle();

            public final int hashCode() {
                return 1720394868;
            }

            private Idle() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Idle";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Idle)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Loading();

            public final int hashCode() {
                return -888850276;
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
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult confirmBankAccountResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankAccountResult, "");
                this.result = confirmBankAccountResult;
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult getResult() {
                return this.result;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult confirmBankAccountResult = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(result=");
                sb.append(confirmBankAccountResult);
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
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success) other).result);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success copy(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Success success, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult confirmBankAccountResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    confirmBankAccountResult = success.result;
                }
                return success.copy(confirmBankAccountResult);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "error", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$UiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError confirmBankAccountError) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankAccountError, "");
                this.error = confirmBankAccountError;
            }

            public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError confirmBankAccountError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
                sb.append(confirmBankAccountError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error) other).error);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error copy(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Error error, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountError confirmBankAccountError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    confirmBankAccountError = error.error;
                }
                return error.copy(confirmBankAccountError);
            }
        }

        public /* synthetic */ UiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo;", "", "IbcFlow", "GoBackWithResult", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo$GoBackWithResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo$IbcFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface NavigateTo {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo$IbcFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class IbcFlow implements com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.IbcFlow INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.IbcFlow();

            public final int hashCode() {
                return 559921861;
            }

            private IbcFlow() {
            }

            public final java.lang.String toString() {
                return "IbcFlow";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.IbcFlow)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo$GoBackWithResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/viewmodel/ConfirmBankAccountViewModel$NavigateTo$GoBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GoBackWithResult implements com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo {
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
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult) other).result);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult copy(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult copy$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult goBackWithResult, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    bankFlowNavResult = goBackWithResult.result;
                }
                return goBackWithResult.copy(bankFlowNavResult);
            }
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> getNavigateTo() {
        return this.navigateTo;
    }

    public final void onConfirmSuccess(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetails, "");
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount(bankAccountDetails.getId(), bankAccountDetails.getType().toString(), bankAccountDetails.getLastNChars(), bankAccountDetails.getIssuer().getName())), "Bank successfully Confirmed.", (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
        }
    }

    public final void onFailure() {
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error("User exhausted all attempts.", (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
        }
    }

    public final void onBackClick() {
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
        }
    }

    public final void onCloseClick() {
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
        }
    }

    public final void onIbcFlowClick() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.IbcFlow.INSTANCE)) {
        }
    }

    public final void ibcFlowResultHandler(com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome bankFlowNavResult = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.toBankFlowNavResult(result.getOutcome());
        if (bankFlowNavResult instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> mutableStateFlow = this.getHighSpeedVideoSizes;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo.GoBackWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(bankFlowNavResult)))) {
            }
        }
    }

    public final void resetNavigation() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.NavigateTo> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
        }
    }

    public static /* synthetic */ void confirmBankAccount$default(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel confirmBankAccountViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "USD";
        }
        confirmBankAccountViewModel.confirmBankAccount(str, str2, str3, str4);
    }

    public final void confirmBankAccount(java.lang.String bankAccountId, java.lang.String depositAmount1, java.lang.String depositAmount2, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel$confirmBankAccount$1(this, bankAccountId, depositAmount1, depositAmount2, currencyCode, null), 3, null);
    }

    public final void resetState() {
        this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ConfirmBankAccountViewModel.UiState.Idle.INSTANCE);
    }
}
