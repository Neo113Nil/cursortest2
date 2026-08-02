package com.paypal.oslo.feature.wallet.cards.ui.add.manual;

@kotlin.Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020(H\u0016¢\u0006\u0004\b/\u0010+J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00122\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00122\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b5\u00103J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u0010\u0016J\u0017\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0012H\u0016¢\u0006\u0004\b?\u0010\u0016J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010J\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020R8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00120V8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020[0Z8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0015\u0010`\u001a\u00020R8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bB\u0010_R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00120a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020[0d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010M\u001a\u00020k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bj\u0010lR\u0016\u0010P\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010m\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010nR(\u0010p\u001a\u0002008\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\bp\u0010n\u0012\u0004\bt\u0010\u0016\u001a\u0004\bq\u0010r\"\u0004\bs\u00103R\u0016\u0010o\u001a\u00020u8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010vR\u0016\u0010D\u001a\u00020w8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010xR\u0016\u0010h\u001a\u00020y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010zR\u0016\u0010{\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b{\u0010|"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/AddCardsManualViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/AddCardsManualViewModel;", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetUserProfileUseCase;", "getUserProfile", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AddCardUseCase;", "addCardUseCase", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AutodetectCardUseCase;", "autodetectCardUseCase", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDefinitionsUseCase;", "getCardDefinitionsUseCase", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetUserProfileUseCase;Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AddCardUseCase;Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AutodetectCardUseCase;Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDefinitionsUseCase;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;", "args", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;)V", "refreshData", "()V", "handleCameraClick", "handleAddNewAddress", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;", "result", "handleScannerResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;)V", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;", "handleAddAddressResult", "(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "navAction", "handleHeaderNavAction", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "config", "handleBackNavigation", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;)V", "", "number", "updateCardNumber", "(Ljava/lang/String;)V", "date", "updateExpirationDate", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "updateCvv", "", "isFocused", "onCardNumberFocusChanged", "(Z)V", "onExpirationDateFocusChanged", "onCvvFocusChanged", "onSubmit", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "address", "onBillingAddressSelected", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;", "cardDefinition", "onCardBrandSelected", "(Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardDefinition;)V", "resetCardBrandSelectionGuidance", "", "p0", "Camera2StreamConfigurationMap", "(I)V", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetUserProfileUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AddCardUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AutodetectCardUseCase;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDefinitionsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputStallDuration", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoSizes", "getOutputSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardNavRequestIds;", "getNavigationRequestIds", "()Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardNavRequestIds;", "navigationRequestIds", "Lkotlinx/coroutines/flow/SharedFlow;", "getCardBrandGuidanceEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "cardBrandGuidanceEvent", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/AddCardScreenState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlin/Lazy;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputFormats", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenStateManager;", "toString", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenStateManager;", "getOutputFormats", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/AddCardFormState;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/core/AddCardFormState;", "getOutputStallDurationlomOqCM", "Z", "getOutputSizeshNQ4ISI", "honorFiPriority", "getHonorFiPriority$wallet_prodRelease", "()Z", "setHonorFiPriority$wallet_prodRelease", "getHonorFiPriority$wallet_prodRelease$annotations", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CardNumberValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CardNumberValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/ExpirationDateValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/ExpirationDateValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator;", "unwrapAs", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/manual/screen/AddCardScreenArgs;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardsManualViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> getInputFormats;
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.AutodetectCardUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.domain.add.validation.CardNumberValidator getOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator toString;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState getOutputStallDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getOutputMinFrameDuration;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private boolean getOutputSizes;
    private boolean honorFiPriority;

    /* renamed from: toString, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenStateManager getOutputFormats;
    private com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs unwrapAs;

    public static /* synthetic */ void getHonorFiPriority$wallet_prodRelease$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public AddCardsManualViewModelImpl(com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase addCardUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.AutodetectCardUseCase autodetectCardUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getCardDefinitionsUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, @com.paypal.oslo.feature.wallet.common.di.IoDispatcher kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserProfileUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autodetectCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardDefinitionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = getUserProfileUseCase;
        this.Camera2StreamConfigurationMap = addCardUseCase;
        this.getHighSpeedVideoFpsRanges = autodetectCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getCardDefinitionsUseCase;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getOutputMinFrameDuration = coroutineDispatcher;
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21010$r8$lambda$WZWJ1rv62SFJSKSsJrUBPrXDw();
            }
        });
        int i = 1;
        this.getInputSizeshNQ4ISI = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 4, null);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.Loading.INSTANCE);
        this.getInputFormats = MutableStateFlow;
        this.getOutputFormats = new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenStateManager(MutableStateFlow);
        this.getOutputStallDuration = new com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState(null, null, null, null, null, null, null, false, null, false, null, 2047, null);
        this.honorFiPriority = true;
        this.getOutputSizeshNQ4ISI = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CardNumberValidator(null, i, 0 == true ? 1 : 0);
        this.getOutputMinFrameDurationlomOqCM = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.toString = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getCardBrandGuidanceEvent() {
        return kotlinx.coroutines.flow.FlowKt.asSharedFlow(this.getInputSizeshNQ4ISI);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState> getUiState() {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(this.getInputFormats);
    }

    /* renamed from: getHonorFiPriority$wallet_prodRelease, reason: from getter */
    public final boolean getHonorFiPriority() {
        return this.honorFiPriority;
    }

    public final void setHonorFiPriority$wallet_prodRelease(boolean z) {
        this.honorFiPriority = z;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void initialize(com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs args) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        if (this.getOutputSizes) {
            return;
        }
        this.getOutputSizes = true;
        this.unwrapAs = args;
        java.lang.String errorMessage = args.getErrorMessage();
        if (errorMessage != null) {
            copy = r0.copy((r24 & 1) != 0 ? r0.firstName : null, (r24 & 2) != 0 ? r0.lastName : null, (r24 & 4) != 0 ? r0.cardNumberField : null, (r24 & 8) != 0 ? r0.expirationDateField : null, (r24 & 16) != 0 ? r0.cvvField : null, (r24 & 32) != 0 ? r0.address : null, (r24 & 64) != 0 ? r0.cardBrandField : null, (r24 & 128) != 0 ? r0.showCardBrandDropDown : false, (r24 & 256) != 0 ? r0.cardBrandDropdownState : null, (r24 & 512) != 0 ? r0.isSubmitting : false, (r24 & 1024) != 0 ? this.getOutputStallDuration.bannerState : new com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible(com.paypal.pds.components.BannerStyle.Warning.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(errorMessage), null, null, null, null, 60, null));
            this.getOutputStallDuration = copy;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1(this, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void handleCameraClick() {
        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(((com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds) this.getHighSpeedVideoSizesFor.getValue()).m21030getCameraScannerRequestIdQDVFmTU(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$lAv_lfs4A49tyL7bDGtXWupqEzs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void handleAddNewAddress() {
        this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(((com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds) this.getHighSpeedVideoSizesFor.getValue()).m21029getAddAddressRequestIdQDVFmTU(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21006$r8$lambda$U3p0MNFpgXZPu9gpvwRdmq6fU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void handleScannerResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome = result.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success) {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success) outcome;
            java.lang.String cardNumber = success.getCardNumber();
            if (cardNumber != null) {
                updateCardNumber(cardNumber);
            }
            java.lang.String expiryDate = success.getExpiryDate();
            if (expiryDate != null) {
                updateExpirationDate(expiryDate);
            }
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void handleAddAddressResult(com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddressKt.toBillingAddress(result.getAddress());
        if (billingAddress == null) {
            return;
        }
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$UZRsNlAVbUuTMStSYbTTIFvOspg(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress.this, this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void handleHeaderNavAction(final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navAction, "");
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$De3LGb9LuqrNKeGv8di0rBkGcvk(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void handleBackNavigation(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        if (config.getDisableBackNavigation()) {
            config = null;
        }
        if (config != null) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$6ZZOrMIqAZ_MXMClr9VSuf1EuJ8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void updateCardNumber(java.lang.String number) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        java.util.Set set;
        java.util.Set set2;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        final java.lang.String take = kotlin.text.StringsKt.take(com.paypal.oslo.feature.wallet.cards.domain.add.StringKtKt.digits(number), this.getOutputSizeshNQ4ISI.getMaxLength());
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState.copy$default(addCardFormState.getCardNumberField(), take, null, false, false, null, 0, 60, null), (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        this.getOutputStallDuration = copy;
        int length = take.length();
        set = com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelKt.getHighSpeedVideoSizes;
        if (length < ((java.lang.Number) kotlin.collections.CollectionsKt.minOrThrow((java.lang.Iterable<java.lang.Double>) set)).intValue()) {
            this.getOutputStallDurationlomOqCM = false;
            com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState2 = this.getOutputStallDuration;
            copy2 = addCardFormState2.copy((r24 & 1) != 0 ? addCardFormState2.firstName : null, (r24 & 2) != 0 ? addCardFormState2.lastName : null, (r24 & 4) != 0 ? addCardFormState2.cardNumberField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState.copy$default(addCardFormState2.getCardNumberField(), null, null, false, false, new com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState(null, null, false, false, null, 0, 63, null).getMask(), new com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState(null, null, false, false, null, 0, 63, null).getMaxDigits(), 15, null), (r24 & 8) != 0 ? addCardFormState2.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState2.cvvField : null, (r24 & 32) != 0 ? addCardFormState2.address : null, (r24 & 64) != 0 ? addCardFormState2.cardBrandField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(this.getOutputStallDuration.getCardBrandField(), null, null, false, false, 14, null), (r24 & 128) != 0 ? addCardFormState2.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState2.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState2.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState2.bannerState : null);
            this.getOutputStallDuration = copy2;
            int i = 1;
            this.getOutputSizeshNQ4ISI = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CardNumberValidator(null, i, 0 == true ? 1 : 0);
            this.getOutputMinFrameDurationlomOqCM = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.toString = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        }
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$zCwgKBm1EcrWmLPs8zczmeOHR1g(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
        set2 = com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelKt.getHighSpeedVideoSizes;
        if (set2.contains(java.lang.Integer.valueOf(take.length()))) {
            this.getOutputFormats.effectWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$dp4H3prhixKcDIO3r8gjtPH1euM(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, take, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
                }
            });
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void updateExpirationDate(java.lang.String date) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState.expirationDateField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(addCardFormState.getExpirationDateField(), kotlin.text.StringsKt.take(com.paypal.oslo.feature.wallet.cards.domain.add.StringKtKt.digits(date), this.getOutputMinFrameDurationlomOqCM.getMaxLength()), null, false, false, this.getOutputMinFrameDurationlomOqCM.getMaxLength(), 12, null), (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21009$r8$lambda$MF729JKvpdbKXkZUC84DQ0lWBA(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void updateCvv(java.lang.String cvv) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(addCardFormState.getCvvField(), kotlin.text.StringsKt.take(com.paypal.oslo.feature.wallet.cards.domain.add.StringKtKt.digits(cvv), this.toString.getMaxLength()), null, false, false, this.toString.getMaxLength(), 12, null), (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21012$r8$lambda$fF0CCxs3pxHZJbQM5uPmRllqEU(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void onCardNumberFocusChanged(boolean isFocused) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState validateIfVisited;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
        if (isFocused) {
            validateIfVisited = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState.copy$default(addCardFormState.getCardNumberField(), null, null, true, true, null, 0, 51, null);
        } else {
            validateIfVisited = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState.copy$default(addCardFormState.getCardNumberField(), null, null, false, false, null, 0, 55, null).validateIfVisited(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$THotOJVntoBLY77_JbM8rUAOGKM(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (java.lang.String) obj));
                }
            }, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_card_number, new java.lang.Object[0]));
        }
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : validateIfVisited, (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$I0gtG2G9GI51rutAzP81CtxqP9E(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void onExpirationDateFocusChanged(boolean isFocused) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState validateIfVisited;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
        if (isFocused) {
            validateIfVisited = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(addCardFormState.getExpirationDateField(), null, null, true, true, 0, 19, null);
        } else {
            validateIfVisited = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(addCardFormState.getExpirationDateField(), null, null, false, false, 0, 23, null).validateIfVisited(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21007$r8$lambda$59jcXOneVnKAO0J3wm7wPrWYcU(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (java.lang.String) obj));
                }
            }, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_expiration_date, new java.lang.Object[0]));
        }
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState.expirationDateField : validateIfVisited, (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21013$r8$lambda$kdjWamudKm1o9gXJJi9Ez9yjaM(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void onCvvFocusChanged(boolean isFocused) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState validateIfVisited;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
        if (isFocused) {
            validateIfVisited = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(addCardFormState.getCvvField(), null, null, true, true, 0, 19, null);
        } else {
            validateIfVisited = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(addCardFormState.getCvvField(), null, null, false, false, 0, 23, null).validateIfVisited(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21011$r8$lambda$Z4S7N1XKiJhJEENaTDyV_XSUw(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (java.lang.String) obj));
                }
            }, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_cvv, new java.lang.Object[0]));
        }
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : validateIfVisited, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$6Zkcl3V17KMWBGSSC4q9Psl5x3c(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void onSubmit() {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy2;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy3;
        if (this.getInputFormats.getValue() instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) {
            copy = r2.copy((r24 & 1) != 0 ? r2.firstName : null, (r24 & 2) != 0 ? r2.lastName : null, (r24 & 4) != 0 ? r2.cardNumberField : null, (r24 & 8) != 0 ? r2.expirationDateField : null, (r24 & 16) != 0 ? r2.cvvField : null, (r24 & 32) != 0 ? r2.address : null, (r24 & 64) != 0 ? r2.cardBrandField : null, (r24 & 128) != 0 ? r2.showCardBrandDropDown : false, (r24 & 256) != 0 ? r2.cardBrandDropdownState : null, (r24 & 512) != 0 ? r2.isSubmitting : false, (r24 & 1024) != 0 ? this.getOutputStallDuration.bannerState : com.paypal.oslo.feature.wallet.common.WalletBannerState.Hidden.INSTANCE);
            this.getOutputStallDuration = copy;
            this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$7qdM0AChdqXHBdcBEiECdCRFuJo(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
                }
            });
            boolean isValid = this.getOutputSizeshNQ4ISI.isValid(this.getOutputStallDuration.getCardNumberField().getValue());
            boolean isValid2 = this.getOutputMinFrameDurationlomOqCM.isValid(this.getOutputStallDuration.getExpirationDateField().getValue());
            boolean isValid3 = this.toString.isValid(this.getOutputStallDuration.getCvvField().getValue());
            boolean z = this.getOutputStallDuration.getAddress() != null;
            if (!isValid3 || !isValid2 || !isValid || !z) {
                if (!z) {
                    Camera2StreamConfigurationMap(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_error_check_billing_address);
                    return;
                }
                com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
                copy2 = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState.copy$default(addCardFormState.getCardNumberField(), null, isValid ? null : com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_card_number, new java.lang.Object[0]), false, false, null, 0, 61, null), (r24 & 8) != 0 ? addCardFormState.expirationDateField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(this.getOutputStallDuration.getExpirationDateField(), null, isValid2 ? null : com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_expiration_date, new java.lang.Object[0]), false, false, 0, 29, null), (r24 & 16) != 0 ? addCardFormState.cvvField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.TextFieldState.copy$default(this.getOutputStallDuration.getCvvField(), null, isValid3 ? null : com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_cvv, new java.lang.Object[0]), false, false, 0, 29, null), (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : null, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
                this.getOutputStallDuration = copy2;
                this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$6a0V3jo5NYem_f42a_MMkExp1yI(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
                    }
                });
                return;
            }
            if (this.getOutputStallDuration.isCardBrandDetected()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$onSubmit$3(this, null), 3, null);
                return;
            }
            com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState2 = this.getOutputStallDuration;
            copy3 = addCardFormState2.copy((r24 & 1) != 0 ? addCardFormState2.firstName : null, (r24 & 2) != 0 ? addCardFormState2.lastName : null, (r24 & 4) != 0 ? addCardFormState2.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState2.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState2.cvvField : null, (r24 & 32) != 0 ? addCardFormState2.address : null, (r24 & 64) != 0 ? addCardFormState2.cardBrandField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(addCardFormState2.getCardBrandField(), null, null, false, true, 7, null), (r24 & 128) != 0 ? addCardFormState2.showCardBrandDropDown : true, (r24 & 256) != 0 ? addCardFormState2.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState2.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState2.bannerState : null);
            this.getOutputStallDuration = copy3;
            this.getInputSizeshNQ4ISI.tryEmit(kotlin.Unit.INSTANCE);
            this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$gQ4nIsN2nvjQIONVOuMRNB1JNno(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
                }
            });
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void onBillingAddressSelected(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        copy = r2.copy((r24 & 1) != 0 ? r2.firstName : null, (r24 & 2) != 0 ? r2.lastName : null, (r24 & 4) != 0 ? r2.cardNumberField : null, (r24 & 8) != 0 ? r2.expirationDateField : null, (r24 & 16) != 0 ? r2.cvvField : null, (r24 & 32) != 0 ? r2.address : address, (r24 & 64) != 0 ? r2.cardBrandField : null, (r24 & 128) != 0 ? r2.showCardBrandDropDown : false, (r24 & 256) != 0 ? r2.cardBrandDropdownState : null, (r24 & 512) != 0 ? r2.isSubmitting : false, (r24 & 1024) != 0 ? this.getOutputStallDuration.bannerState : null);
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21015$r8$lambda$oFUKaoDjT5DDI0Vkg13_W70W0(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void onCardBrandSelected(final com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDefinition, "");
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$Mvg2ws1D9d_YXTP5LBEDW8tD_qA(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, cardDefinition, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void resetCardBrandSelectionGuidance() {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = this.getOutputStallDuration;
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(addCardFormState.getCardBrandField(), null, null, false, false, 7, null), (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21014$r8$lambda$lsdJqTDqMz18oTkpiacuwMETkQ(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(int p0) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        copy = r0.copy((r24 & 1) != 0 ? r0.firstName : null, (r24 & 2) != 0 ? r0.lastName : null, (r24 & 4) != 0 ? r0.cardNumberField : null, (r24 & 8) != 0 ? r0.expirationDateField : null, (r24 & 16) != 0 ? r0.cvvField : null, (r24 & 32) != 0 ? r0.address : null, (r24 & 64) != 0 ? r0.cardBrandField : null, (r24 & 128) != 0 ? r0.showCardBrandDropDown : false, (r24 & 256) != 0 ? r0.cardBrandDropdownState : null, (r24 & 512) != 0 ? r0.isSubmitting : false, (r24 & 1024) != 0 ? this.getOutputStallDuration.bannerState : new com.paypal.oslo.feature.wallet.common.WalletBannerState.Visible(com.paypal.pds.components.BannerStyle.Warning.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(p0, new java.lang.Object[0]), null, null, null, null, 60, null));
        this.getOutputStallDuration = copy;
        this.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21008$r8$lambda$ELEZ0LPyV8gK8TQ03D9i9c0Yy0(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$-RQueaZNkhkop6RVi_o4IcFVecU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState m21005$r8$lambda$RQueaZNkhkop6RVi_o4IcFVecU(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    /* renamed from: $r8$lambda$-U3p0MN-FpgXZPu9gpvwRdmq6fU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21006$r8$lambda$U3p0MNFpgXZPu9gpvwRdmq6fU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$59jcXOneVnKAO0J-3wm7wPrWYcU, reason: not valid java name */
    public static /* synthetic */ boolean m21007$r8$lambda$59jcXOneVnKAO0J3wm7wPrWYcU(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return addCardsManualViewModelImpl.getOutputMinFrameDurationlomOqCM.isValid(str);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ZZOrMIqAZ_MXMClr9VSuf1EuJ8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$6Zkcl3V17KMWBGSSC4q9Psl5x3c(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$6a0V3jo5NYem_f42a_MMkExp1yI(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$74KSdmJsUA9YF6smob4KwV0O8BY(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$7qdM0AChdqXHBdcBEiECdCRFuJo(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$8QjpqJY4B68hRJBNHyXbyRPFv18(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header) (0 == true ? 1 : 0), new com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo(kotlin.text.StringsKt.takeLast(addCardsManualViewModelImpl.getOutputStallDuration.getCardNumberField().getValue(), 4), creditCard), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$De3LGb9LuqrNKeGv8di0rBkGcvk(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack userNavigatedBack;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        int i = com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.WhenMappings.$EnumSwitchMapping$0[navAction.ordinal()];
        if (i == 1) {
            userNavigatedBack = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE;
        } else if (i == 2) {
            userNavigatedBack = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            userNavigatedBack = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE;
        }
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled(userNavigatedBack)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ELEZ0LPyV8gK8TQ03D9i-9c0Yy0, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState m21008$r8$lambda$ELEZ0LPyV8gK8TQ03D9i9c0Yy0(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$I0gtG2G9GI51rutAzP81CtxqP9E(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    /* renamed from: $r8$lambda$MF729JKvpd-bKXkZUC84DQ0lWBA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState m21009$r8$lambda$MF729JKvpdbKXkZUC84DQ0lWBA(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r4 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$Mvg2ws1D9d_YXTP5LBEDW8tD_qA(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        java.lang.Object obj;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState cardNumberField;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        java.util.Iterator<T> it = formReady.getCardBrandDefinitionList().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) obj).getBrand() == cardDefinition.getBrand()) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition cardDefinition2 = (com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) obj;
        if (cardDefinition2 == null) {
            return formReady;
        }
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = addCardsManualViewModelImpl.getOutputStallDuration;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState copy$default = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(addCardFormState.getCardBrandField(), cardDefinition2, null, false, false, 14, null);
        java.lang.String cardNumberMask = com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.getCardNumberMask(cardDefinition2);
        if (cardNumberMask != null) {
            com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState cardNumberField2 = addCardsManualViewModelImpl.getOutputStallDuration.getCardNumberField();
            java.lang.String str = cardNumberMask;
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) != ' ') {
                    i++;
                }
            }
            cardNumberField = com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardNumberFieldState.copy$default(cardNumberField2, null, null, false, false, cardNumberMask, i, 15, null);
        }
        cardNumberField = addCardsManualViewModelImpl.getOutputStallDuration.getCardNumberField();
        copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : cardNumberField, (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : copy$default, (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
        addCardsManualViewModelImpl.getOutputStallDuration = copy;
        addCardsManualViewModelImpl.getOutputSizeshNQ4ISI = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CardNumberValidator(new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardNumberRule(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.toCardNumberMetadata(cardDefinition2)));
        addCardsManualViewModelImpl.getOutputMinFrameDurationlomOqCM = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator(new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationMonthRule(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.toExpiryMonthMetadata(cardDefinition2)), new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardExpirationYearRule(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.toExpiryYearMetadata(cardDefinition2)));
        addCardsManualViewModelImpl.toString = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator(new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CreditCardCvvRule(com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinitionValidationExtKt.toCvvMetadata(cardDefinition2)));
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ boolean $r8$lambda$THotOJVntoBLY77_JbM8rUAOGKM(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return addCardsManualViewModelImpl.getOutputSizeshNQ4ISI.isValid(str);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$UZRsNlAVbUuTMStSYbTTIFvOspg(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> addNewBillingAddress = com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddressKt.addNewBillingAddress(formReady.getBillingAddresses(), billingAddress);
        if (addNewBillingAddress != null) {
            copy = r8.copy((r24 & 1) != 0 ? r8.firstName : null, (r24 & 2) != 0 ? r8.lastName : null, (r24 & 4) != 0 ? r8.cardNumberField : null, (r24 & 8) != 0 ? r8.expirationDateField : null, (r24 & 16) != 0 ? r8.cvvField : null, (r24 & 32) != 0 ? r8.address : billingAddress, (r24 & 64) != 0 ? r8.cardBrandField : null, (r24 & 128) != 0 ? r8.showCardBrandDropDown : false, (r24 & 256) != 0 ? r8.cardBrandDropdownState : null, (r24 & 512) != 0 ? r8.isSubmitting : false, (r24 & 1024) != 0 ? addCardsManualViewModelImpl.getOutputStallDuration.bannerState : null);
            addCardsManualViewModelImpl.getOutputStallDuration = copy;
            com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady copy$default = com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, copy, addNewBillingAddress, null, null, 12, null);
            if (copy$default != null) {
                return copy$default;
            }
        }
        return formReady;
    }

    /* renamed from: $r8$lambda$WZWJ1rv62SFJSKSsJrUB--PrXDw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds m21010$r8$lambda$WZWJ1rv62SFJSKSsJrUBPrXDw() {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds(com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), null);
    }

    /* renamed from: $r8$lambda$Z4S7N1XK-iJhJEENaTD-yV_XSUw, reason: not valid java name */
    public static /* synthetic */ boolean m21011$r8$lambda$Z4S7N1XKiJhJEENaTDyV_XSUw(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return addCardsManualViewModelImpl.toString.isValid(str);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dp4H3prhixKcDIO3r8gjtPH1euM(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, java.lang.String str, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        java.lang.String accountCountryCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        com.paypal.oslo.core.userstore.model.User userProfile = formReady.getUserProfile();
        if (userProfile != null && (accountCountryCode = userProfile.getAccountCountryCode()) != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(addCardsManualViewModelImpl), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$autoDetectCardBrand$1(str, accountCountryCode, addCardsManualViewModelImpl, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fF0CC-xs3pxHZJbQM5uPmRllqEU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState m21012$r8$lambda$fF0CCxs3pxHZJbQM5uPmRllqEU(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$gQ4nIsN2nvjQIONVOuMRNB1JNno(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    /* renamed from: $r8$lambda$kdjWamudKm1o9gX-JJi9Ez9yjaM, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState m21013$r8$lambda$kdjWamudKm1o9gXJJi9Ez9yjaM(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lAv_lfs4A49tyL7bDGtXWupqEzs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard(false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lsdJqTD-qMz18oTkpiacuwMETkQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState m21014$r8$lambda$lsdJqTDqMz18oTkpiacuwMETkQ(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    /* renamed from: $r8$lambda$oFUKaoDjT5DDI0Vkg-1-3_W70W0, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState m21015$r8$lambda$oFUKaoDjT5DDI0Vkg13_W70W0(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$uua70LO1AAFK2BxawePcEF7RvkA(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, java.util.List list, java.util.List list2, com.paypal.oslo.core.userstore.model.User user, boolean z) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = addCardsManualViewModelImpl.getOutputStallDuration;
        if (list2 == null) {
            list2 = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady = new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady(addCardFormState, list, list2, user);
        if (z) {
            return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.withError$default(formReady, com.paypal.pds.components.BannerStyle.Warning.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_add_error_server, new java.lang.Object[0]), null, 4, null);
        }
        return formReady;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState $r8$lambda$zCwgKBm1EcrWmLPs8zczmeOHR1g(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady formReady) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formReady, "");
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.copy$default(formReady, addCardsManualViewModelImpl.getOutputStallDuration, null, null, null, 14, null);
    }

    public static final /* synthetic */ void access$onDataLoaded(final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, final com.paypal.oslo.core.userstore.model.User user, final java.util.List list, final boolean z) {
        final java.util.List emptyList;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName2;
        com.paypal.oslo.core.userstore.model.ProfileName legalName = user.getLegalName();
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs = null;
        java.lang.String givenName = (legalName == null || (personName2 = legalName.getPersonName()) == null) ? null : personName2.getGivenName();
        java.lang.String str = givenName == null ? "" : givenName;
        com.paypal.oslo.core.userstore.model.ProfileName legalName2 = user.getLegalName();
        java.lang.String surname = (legalName2 == null || (personName = legalName2.getPersonName()) == null) ? null : personName.getSurname();
        java.lang.String str2 = surname == null ? "" : surname;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> profileAddresses = user.getProfileAddresses();
        if (profileAddresses == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = profileAddresses.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddressKt.toBillingAddress((com.paypal.oslo.core.userstore.model.ProfileAddress) it.next());
                if (billingAddress != null) {
                    arrayList.add(billingAddress);
                }
            }
            emptyList = arrayList;
        }
        copy = r9.copy((r24 & 1) != 0 ? r9.firstName : str, (r24 & 2) != 0 ? r9.lastName : str2, (r24 & 4) != 0 ? r9.cardNumberField : null, (r24 & 8) != 0 ? r9.expirationDateField : null, (r24 & 16) != 0 ? r9.cvvField : null, (r24 & 32) != 0 ? r9.address : (com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress) kotlin.collections.CollectionsKt.firstOrNull(emptyList), (r24 & 64) != 0 ? r9.cardBrandField : null, (r24 & 128) != 0 ? r9.showCardBrandDropDown : false, (r24 & 256) != 0 ? r9.cardBrandDropdownState : null, (r24 & 512) != 0 ? r9.isSubmitting : false, (r24 & 1024) != 0 ? addCardsManualViewModelImpl.getOutputStallDuration.bannerState : null);
        addCardsManualViewModelImpl.getOutputStallDuration = copy;
        addCardsManualViewModelImpl.getOutputFormats.transition(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$uua70LO1AAFK2BxawePcEF7RvkA(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, emptyList, list, user, z);
            }
        });
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs2 = addCardsManualViewModelImpl.unwrapAs;
        if (addCardScreenArgs2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            addCardScreenArgs2 = null;
        }
        java.lang.String prefilledCardNumber = addCardScreenArgs2.getPrefilledCardNumber();
        if (prefilledCardNumber != null) {
            addCardsManualViewModelImpl.updateCardNumber(prefilledCardNumber);
        }
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs addCardScreenArgs3 = addCardsManualViewModelImpl.unwrapAs;
        if (addCardScreenArgs3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            addCardScreenArgs = addCardScreenArgs3;
        }
        java.lang.String prefilledExpiryDate = addCardScreenArgs.getPrefilledExpiryDate();
        if (prefilledExpiryDate != null) {
            addCardsManualViewModelImpl.updateExpirationDate(prefilledExpiryDate);
        }
    }

    public static final /* synthetic */ java.lang.Object access$performCardSubmission(final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        if (addCardsManualViewModelImpl.getInputFormats.getValue() instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) {
            copy = r2.copy((r24 & 1) != 0 ? r2.firstName : null, (r24 & 2) != 0 ? r2.lastName : null, (r24 & 4) != 0 ? r2.cardNumberField : null, (r24 & 8) != 0 ? r2.expirationDateField : null, (r24 & 16) != 0 ? r2.cvvField : null, (r24 & 32) != 0 ? r2.address : null, (r24 & 64) != 0 ? r2.cardBrandField : null, (r24 & 128) != 0 ? r2.showCardBrandDropDown : false, (r24 & 256) != 0 ? r2.cardBrandDropdownState : null, (r24 & 512) != 0 ? r2.isSubmitting : true, (r24 & 1024) != 0 ? addCardsManualViewModelImpl.getOutputStallDuration.bannerState : null);
            addCardsManualViewModelImpl.getOutputStallDuration = copy;
            addCardsManualViewModelImpl.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.$r8$lambda$74KSdmJsUA9YF6smob4KwV0O8BY(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
                }
            });
            java.lang.String take = kotlin.text.StringsKt.take(addCardsManualViewModelImpl.getOutputStallDuration.getExpirationDateField().getValue(), 2);
            java.lang.String drop = kotlin.text.StringsKt.drop(addCardsManualViewModelImpl.getOutputStallDuration.getExpirationDateField().getValue(), 2);
            java.lang.String value = addCardsManualViewModelImpl.getOutputStallDuration.getCardNumberField().getValue();
            java.lang.String value2 = addCardsManualViewModelImpl.getOutputStallDuration.getCvvField().getValue();
            com.paypal.oslo.feature.wallet.cards.domain.add.model.CardholderName cardholderName = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardholderName(addCardsManualViewModelImpl.getOutputStallDuration.getFirstName(), addCardsManualViewModelImpl.getOutputStallDuration.getLastName());
            com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address = addCardsManualViewModelImpl.getOutputStallDuration.getAddress();
            com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address2 = addCardsManualViewModelImpl.getOutputStallDuration.getAddress();
            java.lang.String id = address2 != null ? address2.getId() : null;
            com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition value3 = addCardsManualViewModelImpl.getOutputStallDuration.getCardBrandField().getValue();
            com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard(value, take, drop, value2, address, id, value3 != null ? value3.getBrand() : null, cardholderName, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 1792, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.flowOn(addCardsManualViewModelImpl.Camera2StreamConfigurationMap.invoke(creditCard), addCardsManualViewModelImpl.getOutputMinFrameDuration).collect(new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$performCardSubmission$3(addCardsManualViewModelImpl, creditCard), continuation);
            if (collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return collect;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$processAndUpdateCardDefinitions(final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl addCardsManualViewModelImpl, java.util.List list) {
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy;
        java.util.List list2;
        java.util.Iterator it;
        com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState copy2;
        if (addCardsManualViewModelImpl.getInputFormats.getValue() instanceof com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) {
            boolean isCardBrandDetected = addCardsManualViewModelImpl.getOutputStallDuration.isCardBrandDetected();
            java.util.List list3 = list;
            if (!list3.isEmpty() && (list.size() == 1 || addCardsManualViewModelImpl.honorFiPriority)) {
                addCardsManualViewModelImpl.onCardBrandSelected((com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) kotlin.collections.CollectionsKt.first(list));
            } else if (list.size() > 1) {
                addCardsManualViewModelImpl.getOutputStallDurationlomOqCM = true;
                if (isCardBrandDetected && !addCardsManualViewModelImpl.getOutputStallDuration.getShowCardBrandDropDown()) {
                    com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState = addCardsManualViewModelImpl.getOutputStallDuration;
                    copy = addCardFormState.copy((r24 & 1) != 0 ? addCardFormState.firstName : null, (r24 & 2) != 0 ? addCardFormState.lastName : null, (r24 & 4) != 0 ? addCardFormState.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState.cvvField : null, (r24 & 32) != 0 ? addCardFormState.address : null, (r24 & 64) != 0 ? addCardFormState.cardBrandField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(addCardFormState.getCardBrandField(), null, null, false, false, 14, null), (r24 & 128) != 0 ? addCardFormState.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState.bannerState : null);
                    addCardsManualViewModelImpl.getOutputStallDuration = copy;
                }
                if (addCardsManualViewModelImpl.getOutputStallDuration.isCardBrandDetected() && !list3.isEmpty()) {
                    list2 = list;
                    if ((list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                        it = list2.iterator();
                        while (it.hasNext()) {
                            com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand = ((com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition) it.next()).getBrand();
                            com.paypal.oslo.feature.wallet.cards.domain.model.CardDefinition value = addCardsManualViewModelImpl.getOutputStallDuration.getCardBrandField().getValue();
                            if (brand == (value != null ? value.getBrand() : null)) {
                                break;
                            }
                        }
                    }
                    com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState2 = addCardsManualViewModelImpl.getOutputStallDuration;
                    copy2 = addCardFormState2.copy((r24 & 1) != 0 ? addCardFormState2.firstName : null, (r24 & 2) != 0 ? addCardFormState2.lastName : null, (r24 & 4) != 0 ? addCardFormState2.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState2.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState2.cvvField : null, (r24 & 32) != 0 ? addCardFormState2.address : null, (r24 & 64) != 0 ? addCardFormState2.cardBrandField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(addCardFormState2.getCardBrandField(), null, null, false, false, 14, null), (r24 & 128) != 0 ? addCardFormState2.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState2.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState2.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState2.bannerState : null);
                    addCardsManualViewModelImpl.getOutputStallDuration = copy2;
                    addCardsManualViewModelImpl.getOutputStallDurationlomOqCM = true;
                }
                addCardsManualViewModelImpl.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21005$r8$lambda$RQueaZNkhkop6RVi_o4IcFVecU(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
                    }
                });
            }
            addCardsManualViewModelImpl.getOutputStallDurationlomOqCM = false;
            if (addCardsManualViewModelImpl.getOutputStallDuration.isCardBrandDetected()) {
                list2 = list;
                if (list2 instanceof java.util.Collection) {
                }
                it = list2.iterator();
                while (it.hasNext()) {
                }
                com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.AddCardFormState addCardFormState22 = addCardsManualViewModelImpl.getOutputStallDuration;
                copy2 = addCardFormState22.copy((r24 & 1) != 0 ? addCardFormState22.firstName : null, (r24 & 2) != 0 ? addCardFormState22.lastName : null, (r24 & 4) != 0 ? addCardFormState22.cardNumberField : null, (r24 & 8) != 0 ? addCardFormState22.expirationDateField : null, (r24 & 16) != 0 ? addCardFormState22.cvvField : null, (r24 & 32) != 0 ? addCardFormState22.address : null, (r24 & 64) != 0 ? addCardFormState22.cardBrandField : com.paypal.oslo.feature.wallet.cards.ui.add.manual.core.CardBrandFieldState.copy$default(addCardFormState22.getCardBrandField(), null, null, false, false, 14, null), (r24 & 128) != 0 ? addCardFormState22.showCardBrandDropDown : false, (r24 & 256) != 0 ? addCardFormState22.cardBrandDropdownState : null, (r24 & 512) != 0 ? addCardFormState22.isSubmitting : false, (r24 & 1024) != 0 ? addCardFormState22.bannerState : null);
                addCardsManualViewModelImpl.getOutputStallDuration = copy2;
                addCardsManualViewModelImpl.getOutputStallDurationlomOqCM = true;
            }
            addCardsManualViewModelImpl.getOutputFormats.updateWhen(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady.class), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.m21005$r8$lambda$RQueaZNkhkop6RVi_o4IcFVecU(com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl.this, (com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardScreenState.FormReady) obj);
                }
            });
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds getNavigationRequestIds() {
        return (com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardNavRequestIds) this.getHighSpeedVideoSizesFor.getValue();
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel
    public final void refreshData() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl$loadData$1(this, null), 3, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
