package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001c\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\u001e\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020,0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020+0/8\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00105\u001a\b\u0012\u0004\u0012\u00020,048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyReducer;", "reducer", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateUserUseCase;", "validateUserUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateSendMoneyInitialUrlUseCase;", "createSendMoneyInitialUrlUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;", "createWebViewHeadersUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/GetUserAgreementAcceptedUseCase;", "getUserAgreementAcceptedUseCase", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyReducer;Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateUserUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateSendMoneyInitialUrlUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/GetUserAgreementAcceptedUseCase;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;)V", "", "sendCurrencyCode", "receiveCurrencyCode", "destinationCountryCode", "amount", "refTag", "sendMoneyUrl", "onLoad", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onReloadAfterAccountLinking", "getOutputFormats", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateUserUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateSendMoneyInitialUrlUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/xoom/domain/usecase/GetUserAgreementAcceptedUseCase;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiState;", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SendMoneyViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect> getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.xoom.domain.usecase.CreateSendMoneyInitialUrlUseCase getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState> uiState;
    private static final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.Companion Companion = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public SendMoneyViewModel(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyReducer sendMoneyReducer, com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase validateUserUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateSendMoneyInitialUrlUseCase createSendMoneyInitialUrlUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase, com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase getUserAgreementAcceptedUseCase, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendMoneyReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createSendMoneyInitialUrlUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createWebViewHeadersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserAgreementAcceptedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighResolutionOutputSizeshNQ4ISI = validateUserUseCase;
        this.getHighSpeedVideoSizes = createSendMoneyInitialUrlUseCase;
        this.Camera2StreamConfigurationMap = createWebViewHeadersUseCase;
        this.getHighSpeedVideoFpsRanges = getUserAgreementAcceptedUseCase;
        this.getHighSpeedVideoFpsRangesFor = dynamicConfiguration;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("SendMoneyViewModel.store", com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial.INSTANCE, sendMoneyReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent>() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize) {
                    com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent event = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event, "");
                    com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize initialize = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$initialize$1(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.this, input.getEventDispatcher(), initialize.getSendCurrencyCode(), initialize.getReceiveCurrencyCode(), initialize.getDestinationCountryCode(), initialize.getAmount(), initialize.getRefTag(), initialize.getSendMoneyUrl(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$createOnInitializedEventWithUrlAndHeaders(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel sendMoneyViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1 sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1;
        int i;
        java.lang.String invoke;
        java.lang.String str7;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1) {
            sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1 = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1) continuation;
            if ((sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (str6 != null) {
                        okhttp3.HttpUrl parse = okhttp3.HttpUrl.INSTANCE.parse(str6);
                        okhttp3.HttpUrl parse2 = okhttp3.HttpUrl.INSTANCE.parse((java.lang.String) sendMoneyViewModel.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.xoom.domain.config.XoomConfigs.INSTANCE.getBaseWebsiteUrl()));
                        if (parse == null || parse2 == null || !parse.isHttps() || !kotlin.jvm.internal.Intrinsics.areEqual(parse.host(), parse2.host()) || parse.port() != parse2.port()) {
                            return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInvalidUrlEncountered.INSTANCE;
                        }
                    }
                    if (str6 == null) {
                        invoke = sendMoneyViewModel.getHighSpeedVideoSizes.invoke(str, str2, str3, str4, str5);
                    } else {
                        invoke = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str6, (java.lang.CharSequence) "_rt=", false, 2, (java.lang.Object) null) ? str6 : okhttp3.HttpUrl.INSTANCE.get(str6).newBuilder().addQueryParameter("_rt", str5).build().toString();
                    }
                    com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase = sendMoneyViewModel.Camera2StreamConfigurationMap;
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getOutputFormats = invoke;
                    sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getOutputMinFrameDuration = 1;
                    java.lang.Object invoke2 = createWebViewHeadersUseCase.invoke(sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1);
                    if (invoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    java.lang.String str8 = invoke;
                    obj = invoke2;
                    str7 = str8;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str7 = (java.lang.String) sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.xoom.LoggerKt.log;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInitialized(new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiModel(str7, (java.util.Map) ((arrow.core.Either.Right) either).getValue()));
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(webSessionTransferError.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "Unknown";
                }
                java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", "send money"), kotlin.TuplesKt.to("errorType", simpleName));
                if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.UserCancelled) {
                    com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.xoom.ui.WebViewHeadersExtensionsKt.WebViewHeadersErrorMessage, mapOf, null, 4, null);
                } else {
                    if (!(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.xoom.ui.WebViewHeadersExtensionsKt.WebViewHeadersErrorMessage, mapOf, null, 4, null);
                }
                return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnNetworkError.INSTANCE;
            }
        }
        sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1 = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1(sendMoneyViewModel, continuation);
        java.lang.Object obj2 = sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendMoneyViewModel$createOnInitializedEventWithUrlAndHeaders$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.xoom.LoggerKt.log;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyViewModel$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
    }

    public final void onLoad(java.lang.String sendCurrencyCode, java.lang.String receiveCurrencyCode, java.lang.String destinationCountryCode, java.lang.String amount, java.lang.String refTag, java.lang.String sendMoneyUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refTag, "");
        if (this.uiState.getValue() instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiState.Initial) {
            processEvent(new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize(sendCurrencyCode, receiveCurrencyCode, destinationCountryCode, amount, refTag, sendMoneyUrl));
        }
    }

    public final void onReloadAfterAccountLinking(java.lang.String sendCurrencyCode, java.lang.String receiveCurrencyCode, java.lang.String destinationCountryCode, java.lang.String amount, java.lang.String refTag, java.lang.String sendMoneyUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refTag, "");
        processEvent(new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.Initialize(sendCurrencyCode, receiveCurrencyCode, destinationCountryCode, amount, refTag, sendMoneyUrl));
    }
}
