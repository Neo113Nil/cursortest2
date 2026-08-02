package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00012B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020*0-8\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/GetOnlinePaymentDataUseCase;", "getOnlinePaymentData", "Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/UpdatePaymentPreferenceUseCase;", "updatePaymentPreference", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/GetOnlinePaymentDataUseCase;Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/UpdatePaymentPreferenceUseCase;)V", "", "retry", "()V", "retryFromSaveError", "onNavigateBack", "onClose", "onSkip", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_METHOD_ID, "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "fundingType", "onPaymentMethodSelect", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "onAddFiClick-DpEMydE", "(Ljava/lang/String;)V", "onAddFiClick", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fi/AddFIFlowNavResult;", "result", "handleAddFiResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fi/AddFIFlowNavResult;)V", "displayName", "onSaveClick", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/GetOnlinePaymentDataUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/preferred/domain/usecase/online/UpdatePaymentPreferenceUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "UiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OnlinePaymentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState> uiState;

    @javax.inject.Inject
    public OnlinePaymentViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase getOnlinePaymentDataUseCase, com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.UpdatePaymentPreferenceUseCase updatePaymentPreferenceUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOnlinePaymentDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentPreferenceUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = getOnlinePaymentDataUseCase;
        this.getHighSpeedVideoSizes = updatePaymentPreferenceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$loadData$1(this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState;", "", "<init>", "()V", "Loading", "Error", "Content", "SaveError", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Content;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Error;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Loading;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$SaveError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class UiState {
        public static final int $stable = 0;

        private UiState() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Loading;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Loading();

            public final int hashCode() {
                return -628036064;
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
                if (!(other instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Loading)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Error;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "message", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState {
            public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            private final com.paypal.oslo.core.commonui.utils.RefText message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(com.paypal.oslo.core.commonui.utils.RefText refText) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
                this.message = refText;
            }

            public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.core.commonui.utils.RefText refText = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
                sb.append(refText);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error) other).message);
            }

            public final com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error copy(com.paypal.oslo.core.commonui.utils.RefText message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error(message);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error copy$default(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error error, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    refText = error.message;
                }
                return error.copy(refText);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Content;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/model/OnlinePaymentScreenState;", "screenState", "<init>", "(Lcom/paypal/oslo/feature/wallet/preferred/ui/online/model/OnlinePaymentScreenState;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/preferred/ui/online/model/OnlinePaymentScreenState;", "copy", "(Lcom/paypal/oslo/feature/wallet/preferred/ui/online/model/OnlinePaymentScreenState;)Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/model/OnlinePaymentScreenState;", "getScreenState"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Content extends com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState screenState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState onlinePaymentScreenState) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlinePaymentScreenState, "");
                this.screenState = onlinePaymentScreenState;
            }

            public final com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState getScreenState() {
                return this.screenState;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState onlinePaymentScreenState = this.screenState;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(screenState=");
                sb.append(onlinePaymentScreenState);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.screenState.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.screenState, ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content) other).screenState);
            }

            public final com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content copy(com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState screenState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenState, "");
                return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content(screenState);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState getScreenState() {
                return this.screenState;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content copy$default(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content content, com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState onlinePaymentScreenState, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    onlinePaymentScreenState = content.screenState;
                }
                return content.copy(onlinePaymentScreenState);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$SaveError;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState;", "", "fundingInstrumentId", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "fundingInstrumentType", "displayName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/preferred/ui/online/OnlinePaymentViewModel$UiState$SaveError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingInstrumentId", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "getFundingInstrumentType", "getDisplayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SaveError extends com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState {
            public static final int $stable = 0;
            private final java.lang.String displayName;
            private final java.lang.String fundingInstrumentId;
            private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SaveError(java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.fundingInstrumentId = str;
                this.fundingInstrumentType = fundingInstrumentType;
                this.displayName = str2;
            }

            public final java.lang.String getFundingInstrumentId() {
                return this.fundingInstrumentId;
            }

            public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingInstrumentType() {
                return this.fundingInstrumentType;
            }

            public final java.lang.String getDisplayName() {
                return this.displayName;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.fundingInstrumentId;
                com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = this.fundingInstrumentType;
                java.lang.String str2 = this.displayName;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveError(fundingInstrumentId=");
                sb.append(str);
                sb.append(", fundingInstrumentType=");
                sb.append(fundingInstrumentType);
                sb.append(", displayName=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.fundingInstrumentId.hashCode() * 31) + this.fundingInstrumentType.hashCode()) * 31) + this.displayName.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError saveError = (com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentId, saveError.fundingInstrumentId) && this.fundingInstrumentType == saveError.fundingInstrumentType && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, saveError.displayName);
            }

            public final com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError copy(java.lang.String fundingInstrumentId, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String displayName) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
                return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError(fundingInstrumentId, fundingInstrumentType, displayName);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getDisplayName() {
                return this.displayName;
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingInstrumentType() {
                return this.fundingInstrumentType;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getFundingInstrumentId() {
                return this.fundingInstrumentId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError copy$default(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError saveError, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = saveError.fundingInstrumentId;
                }
                if ((i & 2) != 0) {
                    fundingInstrumentType = saveError.fundingInstrumentType;
                }
                if ((i & 4) != 0) {
                    str2 = saveError.displayName;
                }
                return saveError.copy(str, fundingInstrumentType, str2);
            }
        }

        public /* synthetic */ UiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState> getUiState() {
        return this.uiState;
    }

    public final void retryFromSaveError() {
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState value = this.getHighSpeedVideoFpsRanges.getValue();
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError saveError = value instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError ? (com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.SaveError) value : null;
        if (saveError == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$retryFromSaveError$1(this, saveError, null), 3, null);
    }

    public final void onNavigateBack() {
        com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.navigateWithCancellation(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack.INSTANCE);
    }

    public final void onClose() {
        com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.navigateWithCancellation(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed.INSTANCE);
    }

    public final void onSkip() {
        com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.navigateWithCancellation(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped.INSTANCE);
    }

    /* renamed from: onAddFiClick-DpEMydE, reason: not valid java name */
    public final void m21484onAddFiClickDpEMydE(java.lang.String requestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentPreferenceNavigationHelperKt.m21455navigateToAddFihN0UB1M(this.getHighSpeedVideoFpsRangesFor, requestId);
    }

    public final void handleAddFiResult(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result.getOutcome() instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Success) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$loadData$1(this, null), 3, null);
        }
    }

    public final void onSaveClick(java.lang.String displayName) {
        com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState screenState;
        com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState value = this.getHighSpeedVideoFpsRanges.getValue();
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content content = value instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content ? (com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content) value : null;
        if (content == null || (screenState = content.getScreenState()) == null) {
            return;
        }
        java.lang.String selectedPaymentMethodId = screenState.getSelectedPaymentMethodId();
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType selectedFundingType = screenState.getSelectedFundingType();
        if (selectedPaymentMethodId != null && selectedFundingType != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$onSaveClick$2(this, selectedPaymentMethodId, selectedFundingType, displayName, null), 3, null);
            return;
        }
        java.lang.Object value2 = this.getHighSpeedVideoFpsRanges.getValue();
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content content2 = value2 instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content ? (com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content) value2 : null;
        if (content2 != null) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.getHighSpeedVideoFpsRanges;
            copy = r3.copy((r18 & 1) != 0 ? r3.paypalBalance : null, (r18 & 2) != 0 ? r3.preferredPaymentMethods : null, (r18 & 4) != 0 ? r3.selectedPaymentMethodId : null, (r18 & 8) != 0 ? r3.selectedFundingType : null, (r18 & 16) != 0 ? r3.selectedDisplayName : null, (r18 & 32) != 0 ? r3.showBalance : false, (r18 & 64) != 0 ? r3.bannerState : new com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible(com.paypal.pds.components.BannerStyle.Negative.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_instore_payment_selection_error, new java.lang.Object[0]), null, null, null, null, 60, null), (r18 & 128) != 0 ? content2.getScreenState().isSaving : false);
            mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content(copy));
        }
    }

    public final void onPaymentMethodSelect(java.lang.String paymentMethodId, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingType) {
        java.lang.Object obj;
        com.paypal.oslo.core.commonui.utils.RefText displayName;
        com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingType, "");
        java.lang.Object value = this.getHighSpeedVideoFpsRanges.getValue();
        com.paypal.oslo.core.commonui.utils.RefText refText = null;
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content content = value instanceof com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content ? (com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content) value : null;
        if (content == null) {
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState screenState = content.getScreenState();
        if (com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.WhenMappings.$EnumSwitchMapping$0[fundingType.ordinal()] == 1) {
            refText = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_paypal_balance, new java.lang.Object[0]);
        } else {
            java.util.Iterator<T> it = screenState.getPreferredPaymentMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) obj).getId(), paymentMethodId)) {
                        break;
                    }
                }
            }
            com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel = (com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) obj;
            if (paymentMethodUiModel != null) {
                displayName = paymentMethodUiModel.getDisplayName();
                copy = screenState.copy((r18 & 1) != 0 ? screenState.paypalBalance : null, (r18 & 2) != 0 ? screenState.preferredPaymentMethods : null, (r18 & 4) != 0 ? screenState.selectedPaymentMethodId : paymentMethodId, (r18 & 8) != 0 ? screenState.selectedFundingType : fundingType, (r18 & 16) != 0 ? screenState.selectedDisplayName : displayName, (r18 & 32) != 0 ? screenState.showBalance : false, (r18 & 64) != 0 ? screenState.bannerState : com.paypal.oslo.feature.wallet.common.WalletBannerState.Hidden.INSTANCE, (r18 & 128) != 0 ? screenState.isSaving : false);
                mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content(copy));
            }
        }
        displayName = refText;
        copy = screenState.copy((r18 & 1) != 0 ? screenState.paypalBalance : null, (r18 & 2) != 0 ? screenState.preferredPaymentMethods : null, (r18 & 4) != 0 ? screenState.selectedPaymentMethodId : paymentMethodId, (r18 & 8) != 0 ? screenState.selectedFundingType : fundingType, (r18 & 16) != 0 ? screenState.selectedDisplayName : displayName, (r18 & 32) != 0 ? screenState.showBalance : false, (r18 & 64) != 0 ? screenState.bannerState : com.paypal.oslo.feature.wallet.common.WalletBannerState.Hidden.INSTANCE, (r18 & 128) != 0 ? screenState.isSaving : false);
        mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content(copy));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error access$toErrorUiState(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel, com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError onlinePaymentError) {
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        if (onlinePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError.Network) {
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_network_error_please_try_again, new java.lang.Object[0]);
        } else if (onlinePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError.Business.MissingData) {
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_error_missing_data, new java.lang.Object[0]);
        } else if (onlinePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError.Business.SetPreferenceFailed) {
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_error_set_preference_failed, new java.lang.Object[0]);
        } else {
            if (!(onlinePaymentError instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError.Business.PartialDataAvailable)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_error_generic, new java.lang.Object[0]);
        }
        return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Error(stringResourceRef);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState access$toScreenState(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel, com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentPreference onlinePaymentPreference) {
        java.lang.Object obj;
        java.lang.Object obj2;
        final java.lang.String currentPreferenceId = onlinePaymentPreference.getCurrentPreferenceId();
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(com.paypal.oslo.feature.wallet.preferred.ui.common.PaymentMethodUiMapperKt.toPaymentMethodUiModels(onlinePaymentPreference.getPaymentMethods()), new java.util.Comparator() { // from class: com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$toScreenState$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) t2).getId(), currentPreferenceId)), java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) t).getId(), currentPreferenceId)));
            }
        });
        java.util.List list = sortedWith;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) obj).getId(), currentPreferenceId)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel = (com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) obj;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingType = paymentMethodUiModel != null ? paymentMethodUiModel.getFundingType() : null;
        java.util.Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) obj2).getId(), currentPreferenceId)) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel2 = (com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel) obj2;
        return new com.paypal.oslo.feature.wallet.preferred.ui.online.model.OnlinePaymentScreenState(new com.paypal.oslo.feature.wallet.preferred.ui.common.model.PayPalBalanceUiModel("", null, "", null, 10, null), sortedWith, currentPreferenceId, fundingType, paymentMethodUiModel2 != null ? paymentMethodUiModel2.getDisplayName() : null, false, null, false, 192, 0 == true ? 1 : 0);
    }

    public final void retry() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$loadData$1(this, null), 3, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
