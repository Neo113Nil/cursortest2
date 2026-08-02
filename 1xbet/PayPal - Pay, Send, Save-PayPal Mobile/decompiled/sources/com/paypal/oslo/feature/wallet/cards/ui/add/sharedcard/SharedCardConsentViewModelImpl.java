package com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u00101R \u00104\u001a\b\u0012\u0004\u0012\u000200038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/sharedcard/SharedCardConsentViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/sharedcard/SharedCardConsentViewModel;", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AddCardUseCase;", "addCardUseCase", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AddCardUseCase;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "sharedCardInfo", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;)V", "onSendText", "()V", "onAddDifferentCard", "onNotNow", "onTextSentAcknowledged", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/AddCardUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getInputFormats", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/SharedCardInfo;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "getHeader", "()Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", "setHeader", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;)V", "", "getHighSpeedVideoSizesFor", "Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/sharedcard/SharedCardConsentUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SharedCardConsentViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState> getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult Camera2StreamConfigurationMap;
    private com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    private com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState> uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public SharedCardConsentViewModelImpl(com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase addCardUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, @com.paypal.oslo.feature.wallet.common.di.IoDispatcher kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(appNavigator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = addCardUseCase;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState(null, null, null, true, false, null, false, 119, null));
        this.getOutputFormats = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel
    public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header getHeader() {
        return this.header;
    }

    public final void setHeader(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header) {
        this.header = header;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState> getUiState() {
        return this.uiState;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel
    public final void initialize(com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedCardInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        if (this.getHighSpeedVideoSizesFor) {
            return;
        }
        this.getHighSpeedVideoSizesFor = true;
        this.getHighSpeedVideoFpsRangesFor = sharedCardInfo;
        this.getInputSizeshNQ4ISI = analyticsContext;
        setHeader(header);
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard creditCard = sharedCardInfo.getCreditCard();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardholderName cardholderName = creditCard.getCardholderName();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState> mutableStateFlow = this.getOutputFormats;
        java.lang.String firstName = cardholderName != null ? cardholderName.getFirstName() : null;
        if (firstName == null) {
            firstName = "";
        }
        java.lang.String lastName = cardholderName != null ? cardholderName.getLastName() : null;
        java.lang.String str = lastName != null ? lastName : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(str);
        java.lang.String obj = kotlin.text.StringsKt.trim(sb.toString()).toString();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand = creditCard.getBrand();
        mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState(obj, brand != null ? brand.getDisplayName() : null, sharedCardInfo.getLast4Char(), false, false, null, false, 96, null));
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel
    public final void onSendText() {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.SharedCardInfo sharedCardInfo;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CreditCard copy;
        com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState value = this.getOutputFormats.getValue();
        if (value.getShowShimmer() || value.getShowSendTextLoading() || (sharedCardInfo = this.getHighSpeedVideoFpsRangesFor) == null) {
            return;
        }
        this.getOutputFormats.setValue(com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState.copy$default(value, null, null, null, false, true, null, false, 79, null));
        copy = r13.copy((r24 & 1) != 0 ? r13.number : null, (r24 & 2) != 0 ? r13.expiryMonth : null, (r24 & 4) != 0 ? r13.expiryYear : null, (r24 & 8) != 0 ? r13.cvv : null, (r24 & 16) != 0 ? r13.billingAddress : null, (r24 & 32) != 0 ? r13.addressId : null, (r24 & 64) != 0 ? r13.brand : null, (r24 & 128) != 0 ? r13.cardholderName : null, (r24 & 256) != 0 ? r13.inTransaction : null, (r24 & 512) != 0 ? r13.deferredAuthorization : null, (r24 & 1024) != 0 ? sharedCardInfo.getCreditCard().consentForSharedCard : java.lang.Boolean.TRUE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$onSendText$1(this, copy, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel
    public final void onAddDifferentCard() {
        final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext;
        com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState value = this.getOutputFormats.getValue();
        if (value.getShowShimmer() || value.getShowSendTextLoading() || (addFIAnalyticsContext = this.getInputSizeshNQ4ISI) == null) {
            return;
        }
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl.$r8$lambda$0AmoED8l4zmXg5F7w1zpB9pM7uU(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel
    public final void onNotNow() {
        com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentUiState value = this.getOutputFormats.getValue();
        if (value.getShowShimmer() || value.getShowSendTextLoading()) {
            return;
        }
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl.$r8$lambda$caYKTQx1KlM3qHV6EGp5UV03RtM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModel
    public final void onTextSentAcknowledged() {
        final com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult addCardResult = this.Camera2StreamConfigurationMap;
        if (addCardResult == null) {
            return;
        }
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl.$r8$lambda$pQ6hAxa2UicWQfcKliTzWnyQxY8(com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0AmoED8l4zmXg5F7w1zpB9pM7uU(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.class));
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header = null;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config = null;
        navigationScope.replaceTop(new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(addFIAnalyticsContext, header, config, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, false, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.SCANNER, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$caYKTQx1KlM3qHV6EGp5UV03RtM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.class));
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pQ6hAxa2UicWQfcKliTzWnyQxY8(com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult addCardResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.class));
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success(com.paypal.oslo.feature.wallet.cards.ui.AddCardResultKtKt.toCard(addCardResult), "")));
        return kotlin.Unit.INSTANCE;
    }
}
