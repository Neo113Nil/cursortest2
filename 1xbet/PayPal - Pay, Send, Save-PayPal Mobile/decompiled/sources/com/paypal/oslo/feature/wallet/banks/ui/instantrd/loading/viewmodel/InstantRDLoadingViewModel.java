package com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002./B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankAccountDetailsUseCase;", "getBankAccountDetailsUseCase", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankAccountDetailsUseCase;)V", "", "resetNavigation", "()V", "cancelFlow", "", "bankAccountId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "initialDetails", "startPolling", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;)V", "stopPolling", "onCleared", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetBankAccountDetailsUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "rtpDepositState", "Lkotlinx/coroutines/flow/StateFlow;", "getRtpDepositState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo;", "Camera2StreamConfigurationMap", "navigateTo", "getNavigateTo", "", "getHighSpeedVideoSizesFor", "Z", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/Job;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "", com.visa.cbp.getEncExpo.warmup, "getOutputMinFrameDuration", "Ljava/lang/String;", "getOutputFormats", "RtpDepositState", "NavigateTo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InstantRDLoadingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> navigateTo;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState> rtpDepositState;

    @javax.inject.Inject
    public InstantRDLoadingViewModel(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase getBankAccountDetailsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBankAccountDetailsUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getBankAccountDetailsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.rtpDepositState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow2;
        this.navigateTo = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState> getRtpDepositState() {
        return this.rtpDepositState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> getNavigateTo() {
        return this.navigateTo;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "", "<init>", "()V", "Polling", "Success", "Timeout", "Failed", "Error", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Failed;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Polling;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Timeout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class RtpDepositState {
        public static final int $stable = 0;

        private RtpDepositState() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Polling;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Polling extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling();

            public final int hashCode() {
                return 10219437;
            }

            private Polling() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Polling";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Success INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Success();

            public final int hashCode() {
                return -1459045395;
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
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Success)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Timeout;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Timeout extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Timeout INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Timeout();

            public final int hashCode() {
                return -905787061;
            }

            private Timeout() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Timeout";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Timeout)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Failed;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Failed extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Failed INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Failed();

            public final int hashCode() {
                return 1917776659;
            }

            private Failed() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Failed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Failed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$RtpDepositState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState {
            public static final int $stable = 0;
            private final java.lang.String message;

            public Error(java.lang.String str) {
                super(null);
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error) other).message);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error copy(java.lang.String message) {
                return new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error copy$default(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }
        }

        public /* synthetic */ RtpDepositState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo;", "", "<init>", "()V", "NextScreen", "GoBackWithResult", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo$GoBackWithResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo$NextScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class NavigateTo {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo$NextScreen;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "copy", "(Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;)Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo$NextScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NextScreen extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.wallet.wallet.ui.Destination destination;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NextScreen(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                this.destination = destination;
            }

            public final com.paypal.oslo.feature.wallet.wallet.ui.Destination getDestination() {
                return this.destination;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.wallet.ui.Destination destination = this.destination;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NextScreen(destination=");
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
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen) other).destination);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen copy(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen(destination);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.wallet.ui.Destination getDestination() {
                return this.destination;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen copy$default(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen nextScreen, com.paypal.oslo.feature.wallet.wallet.ui.Destination destination, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    destination = nextScreen.destination;
                }
                return nextScreen.copy(destination);
            }
        }

        private NavigateTo() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo$GoBackWithResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)Lcom/paypal/oslo/feature/wallet/banks/ui/instantrd/loading/viewmodel/InstantRDLoadingViewModel$NavigateTo$GoBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GoBackWithResult extends com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoBackWithResult(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult) {
                super(null);
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
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult) other).result);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult copy(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult copy$default(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult goBackWithResult, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    bankFlowNavResult = goBackWithResult.result;
                }
                return goBackWithResult.copy(bankFlowNavResult);
            }
        }

        public /* synthetic */ NavigateTo(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void resetNavigation() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
        }
    }

    public final void cancelFlow() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE))))) {
        }
    }

    public static /* synthetic */ void startPolling$default(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bankAccountDetails = null;
        }
        instantRDLoadingViewModel.startPolling(str, bankAccountDetails);
    }

    public final void startPolling(java.lang.String bankAccountId, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails initialDetails) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> availableActions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountId, "");
        com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState value = this.getHighSpeedVideoSizes.getValue();
        this.getHighSpeedVideoFpsRanges = (initialDetails == null || (availableActions = initialDetails.getAvailableActions()) == null) ? false : availableActions.contains(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_INSTANT_CONFIRMATION);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, bankAccountId) && !(value instanceof com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Already in terminal state, not restarting polling", null, null, 6, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, bankAccountId) && (job = this.getHighResolutionOutputSizeshNQ4ISI) != null && job.isActive()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Polling already in progress", null, null, 6, null);
            return;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        kotlinx.coroutines.Job job2 = this.getHighResolutionOutputSizeshNQ4ISI;
        pairArr[0] = kotlin.TuplesKt.to("pollingJobActive", java.lang.Boolean.valueOf(job2 != null ? job2.isActive() : false));
        pairArr[1] = kotlin.TuplesKt.to("hasInitialDetails", java.lang.Boolean.valueOf(initialDetails != null));
        logger.i("Starting RTP deposit polling", kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", bankAccountId)));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling.INSTANCE)) {
        }
        kotlinx.coroutines.Job job3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (job3 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getOutputMinFrameDuration = 0;
        this.getOutputFormats = bankAccountId;
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Polling.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel$startPolling$2(initialDetails, this, bankAccountId, null), 3, null);
        this.getHighResolutionOutputSizeshNQ4ISI = launch$default;
    }

    public final void stopPolling() {
        kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Stopped Instant RD polling", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attempts", java.lang.Integer.valueOf(this.getOutputMinFrameDuration))), null, 4, null);
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "ViewModel onCleared() called", null, null, 6, null);
        super.onCleared();
        stopPolling();
    }

    public static final /* synthetic */ boolean access$evaluateAndEmitIfTerminal(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails) {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation confirmation = bankAccountDetails.getConfirmation();
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction> availableActions = bankAccountDetails.getAvailableActions();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus = confirmation != null ? confirmation.getRealTimePaymentsDepositStatus() : null;
        int i = 2;
        boolean z = false;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Evaluating RTP status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rtpStatus", realTimePaymentsDepositStatus), kotlin.TuplesKt.to("availableActions", kotlin.collections.CollectionsKt.joinToString$default(availableActions, null, null, null, 0, null, null, 63, null))), null, 4, null);
        boolean contains = availableActions.contains(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION);
        if (realTimePaymentsDepositStatus == com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.SUCCESS && contains) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "RTP SUCCESS + COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION available", null, null, 6, null);
            if (bankAccountDetails.getConfirmation().getStatus() == com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.CONFIRMED) {
                com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult bankFlowNavResult = new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount(bankAccountDetails.getId(), bankAccountDetails.getType().toString(), bankAccountDetails.getLastNChars(), bankAccountDetails.getIssuer().getName())), "Bank is successfully Confirmed.", (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> mutableStateFlow = instantRDLoadingViewModel.Camera2StreamConfigurationMap;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.GoBackWithResult(bankFlowNavResult))) {
                }
            } else {
                com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation randomDepositsBankConfirmation = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation(bankAccountDetails, z, i, defaultConstructorMarker);
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo> mutableStateFlow2 = instantRDLoadingViewModel.Camera2StreamConfigurationMap;
                while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen(randomDepositsBankConfirmation))) {
                }
            }
            instantRDLoadingViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Success.INSTANCE);
            return true;
        }
        if (realTimePaymentsDepositStatus == com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.ERROR) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "RTP deposit ERROR - go to error screen", null, null, 6, null);
            instantRDLoadingViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Failed.INSTANCE);
            return true;
        }
        if (realTimePaymentsDepositStatus != com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.DECLINE) {
            return false;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "RTP deposit DECLINE - go to error screen", null, null, 6, null);
        instantRDLoadingViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Failed.INSTANCE);
        return true;
    }
}
