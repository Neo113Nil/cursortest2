package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "", "bankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/RemoveBankAccountUseCase;", "removeBankAccountUseCase", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/RemoveBankAccountUseCase;)V", "", "removeBankAccount", "()V", "resetUI", "Ljava/lang/String;", "getBankAccountId", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/RemoveBankAccountUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RemoveBankAccountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final java.lang.String bankAccountId;
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$Factory;", "", "", "bankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel create(java.lang.String bankAccountId);
    }

    @dagger.assisted.AssistedInject
    public RemoveBankAccountViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase removeBankAccountUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeBankAccountUseCase, "");
        this.bankAccountId = str;
        this.getHighResolutionOutputSizeshNQ4ISI = removeBankAccountUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.InitState.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final java.lang.String getBankAccountId() {
        return this.bankAccountId;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State;", "", "<init>", "()V", "BankRemoved", "RemovingBank", "BankRemoveFailed", "InitState", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$BankRemoveFailed;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$BankRemoved;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$InitState;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$RemovingBank;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$BankRemoved;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BankRemoved extends com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoved INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoved();

            public final int hashCode() {
                return 1010961851;
            }

            private BankRemoved() {
                super(null);
            }

            public final java.lang.String toString() {
                return "BankRemoved";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoved)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$RemovingBank;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RemovingBank extends com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.RemovingBank INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.RemovingBank();

            public final int hashCode() {
                return -404439610;
            }

            private RemovingBank() {
                super(null);
            }

            public final java.lang.String toString() {
                return "RemovingBank";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.RemovingBank)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$BankRemoveFailed;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BankRemoveFailed extends com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoveFailed INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoveFailed();

            public final int hashCode() {
                return 1567568230;
            }

            private BankRemoveFailed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "BankRemoveFailed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoveFailed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State$InitState;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/RemoveBankAccountViewModel$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InitState extends com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.InitState INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.InitState();

            public final int hashCode() {
                return 1795627608;
            }

            private InitState() {
                super(null);
            }

            public final java.lang.String toString() {
                return "InitState";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.InitState)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State> getUiState() {
        return this.uiState;
    }

    public final void removeBankAccount() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel$removeBankAccount$1(this, null), 3, null);
    }

    public final void resetUI() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.InitState.INSTANCE)) {
        }
    }
}
