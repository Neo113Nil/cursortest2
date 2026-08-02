package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0%8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020\"0*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/usecase/ValidateConnectUseCase;", "validateConnectUseCase", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "identitySessionTransfer", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/usecase/ValidateConnectUseCase;Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingReducer;)V", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "partnerLinkingRequest", "", "initialize", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;)V", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;", "event", "processEvent", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingEvent;)V", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectResult;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "redirectUrl", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;", "buildWebSessionTransferContext$identity_prodRelease", "(Ljava/lang/String;)Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferAuthenticationContext;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/usecase/ValidateConnectUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PartnerLinkingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.IdentitySessionTransfer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState> uiState;

    @javax.inject.Inject
    public PartnerLinkingViewModel(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase validateConnectUseCase, com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingReducer partnerLinkingReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateConnectUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySessionTransfer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingReducer, "");
        this.getHighSpeedVideoFpsRanges = validateConnectUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = identitySessionTransfer;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PartnerLinkingViewModel.store", com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial.INSTANCE, partnerLinkingReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent>() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner) {
                    kotlin.Pair<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState> states = input.getStates();
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState component1 = states.component1();
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState component2 = states.component2();
                    if ((component1 instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial) && (component2 instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.InitializingOAuth)) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.this), null, null, new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.this, event, null), 3, null);
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted webViewRedirectUrlIntercepted = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectUrlIntercepted) event;
                    if (!com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.access$hasAuthCode(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.this, webViewRedirectUrlIntercepted.getUrl())) {
                        java.lang.String access$extractOAuthErrorDescription = com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.access$extractOAuthErrorDescription(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.this, webViewRedirectUrlIntercepted.getUrl());
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", access$extractOAuthErrorDescription == null ? com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR : access$extractOAuthErrorDescription));
                        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", webViewRedirectUrlIntercepted.getUrl()));
                        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                        if (access$extractOAuthErrorDescription == null) {
                            access$extractOAuthErrorDescription = "OAuth authorization failed";
                        }
                        com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError unknownError = new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError(access$extractOAuthErrorDescription);
                        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState first = input.getStates().getFirst();
                        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady webViewReady = first instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady ? (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady) first : null;
                        java.lang.String connectUrl = webViewReady != null ? webViewReady.getConnectUrl() : null;
                        eventDispatcher.invoke(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectFailed(unknownError, connectUrl != null ? connectUrl : ""));
                        return;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel - OAuth redirect successful", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", webViewRedirectUrlIntercepted.getUrl())), 2, null);
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.WebViewRedirectSucceeded(webViewRedirectUrlIntercepted.getUrl()));
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.effect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (r20.Camera2StreamConfigurationMap(r4, r2) == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0144, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r1 != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$validatePartner(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner validatePartner, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$validatePartner$1 partnerLinkingViewModel$validatePartner$1;
        int i;
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner validatePartner2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$validatePartner$1) {
            partnerLinkingViewModel$validatePartner$1 = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$validatePartner$1) continuation;
            if ((partnerLinkingViewModel$validatePartner$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                partnerLinkingViewModel$validatePartner$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = partnerLinkingViewModel$validatePartner$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = partnerLinkingViewModel$validatePartner$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validatePartner - calling use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", validatePartner.getType()), kotlin.TuplesKt.to("partnerName", validatePartner.getPartnerName()), kotlin.TuplesKt.to(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, validatePartner.getFlowContextId())), null, 4, null);
                    com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase validateConnectUseCase = partnerLinkingViewModel.getHighSpeedVideoFpsRanges;
                    java.lang.String type = validatePartner.getType();
                    java.lang.String partnerName = validatePartner.getPartnerName();
                    java.lang.String flowContextId = validatePartner.getFlowContextId();
                    validatePartner2 = validatePartner;
                    partnerLinkingViewModel$validatePartner$1.getHighSpeedVideoFpsRangesFor = validatePartner2;
                    partnerLinkingViewModel$validatePartner$1.getInputSizeshNQ4ISI = 1;
                    obj = validateConnectUseCase.invoke(type, partnerName, flowContextId, partnerLinkingViewModel$validatePartner$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = partnerLinkingViewModel$validatePartner$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = partnerLinkingViewModel$validatePartner$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner validatePartner3 = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner) partnerLinkingViewModel$validatePartner$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    validatePartner2 = validatePartner3;
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult validateConnectResult = (com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validatePartner - validation succeeded, proceeding to session transfer", null, null, 6, null);
                    partnerLinkingViewModel$validatePartner$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validatePartner2);
                    partnerLinkingViewModel$validatePartner$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    partnerLinkingViewModel$validatePartner$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateConnectResult);
                    partnerLinkingViewModel$validatePartner$1.getHighSpeedVideoSizes = 0;
                    partnerLinkingViewModel$validatePartner$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    partnerLinkingViewModel$validatePartner$1.getInputSizeshNQ4ISI = 2;
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError = (com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validatePartner - validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", validateConnectError.toString()), kotlin.TuplesKt.to("type", validatePartner2.getType()), kotlin.TuplesKt.to("partnerName", validatePartner2.getPartnerName())), null, 4, null);
                    partnerLinkingViewModel.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed(validateConnectError, validatePartner2.getType(), validatePartner2.getPartnerName(), validatePartner2.getFlowContextId()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        partnerLinkingViewModel$validatePartner$1 = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$validatePartner$1(partnerLinkingViewModel, continuation);
        java.lang.Object obj2 = partnerLinkingViewModel$validatePartner$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = partnerLinkingViewModel$validatePartner$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect> getEffect() {
        return this.effect;
    }

    public final void initialize(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingRequest, "");
        if (!(this.uiState.getValue() instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.initialize - already initialized, ignoring", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currentState", this.uiState.getValue().getName())), null, 4, null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = partnerLinkingRequest instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated;
        if (z) {
            if (kotlin.text.StringsKt.isBlank(((com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated) partnerLinkingRequest).getPartnerName())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validateRequest - PayPalInitiated partnerName is blank", null, null, 6, null);
                arrayList.add("Partner name cannot be empty");
            }
        } else {
            if (!(partnerLinkingRequest instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated partnerInitiated = (com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated) partnerLinkingRequest;
            if (kotlin.text.StringsKt.isBlank(partnerInitiated.getClientId())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validateRequest - PartnerInitiated clientId is blank", null, null, 6, null);
                arrayList.add("Client ID cannot be empty");
            }
            if (kotlin.text.StringsKt.isBlank(partnerInitiated.getScope())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validateRequest - PartnerInitiated scope is blank", null, null, 6, null);
                arrayList.add("Scope cannot be empty");
            }
            if (kotlin.text.StringsKt.isBlank(partnerInitiated.getAuthClaim())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validateRequest - PartnerInitiated authClaim is blank", null, null, 6, null);
                arrayList.add("Auth claim cannot be empty");
            }
            if (kotlin.text.StringsKt.isBlank(partnerInitiated.getRedirectUri())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validateRequest - PartnerInitiated redirectUri is blank", null, null, 6, null);
                arrayList.add("Redirect URI cannot be empty");
            }
            if (kotlin.text.StringsKt.isBlank(partnerInitiated.getState())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.validateRequest - PartnerInitiated state is blank", null, null, 6, null);
                arrayList.add("State cannot be empty");
            }
        }
        java.lang.String joinToString$default = !arrayList.isEmpty() ? kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) : null;
        if (joinToString$default != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.initialize - request validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", joinToString$default)), null, 4, null);
            this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput(joinToString$default), "", "", ""));
            return;
        }
        if (z) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated = (com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated) partnerLinkingRequest;
            pairArr[0] = kotlin.TuplesKt.to("partnerName", payPalInitiated.getPartnerName());
            java.lang.String flowContextId = payPalInitiated.getFlowContextId();
            if (flowContextId == null) {
                flowContextId = "";
            }
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, flowContextId);
            com.paypal.android.logger.Logger.d$default(logger, "PartnerLinkingViewModel.initialize - starting PayPal-Initiated flow", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect> mviStateStore = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String partnerName = payPalInitiated.getPartnerName();
            java.lang.String flowContextId2 = payPalInitiated.getFlowContextId();
            mviStateStore.onEvent(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidatePartner(com.paypal.oslo.feature.identity.connect.shared.utils.ConnectConstants.PAYPAL_INITIATED, partnerName, flowContextId2 != null ? flowContextId2 : ""));
            return;
        }
        if (!(partnerLinkingRequest instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.initialize - Partner-Initiated flow not yet implemented", null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.ValidationFailed(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput("Partner-initiated linking is planned for a future release. Please try again later."), "", "", ""));
    }

    public final void processEvent(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.android.logger.Logger.v$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.processEvent - called", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("eventType", event.getName()), kotlin.TuplesKt.to("currentState", this.uiState.getValue().getName())), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult validateConnectResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$transferSessionToWeb$1 partnerLinkingViewModel$transferSessionToWeb$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$transferSessionToWeb$1) {
            partnerLinkingViewModel$transferSessionToWeb$1 = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$transferSessionToWeb$1) continuation;
            if ((partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = partnerLinkingViewModel$transferSessionToWeb$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.transferSessionToWeb - initiating session transfer", null, null, 6, null);
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext buildWebSessionTransferContext$identity_prodRelease = buildWebSessionTransferContext$identity_prodRelease(validateConnectResult.getConnectUrl());
                    com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer = this.getHighResolutionOutputSizeshNQ4ISI;
                    partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoFpsRanges = validateConnectResult;
                    partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildWebSessionTransferContext$identity_prodRelease);
                    partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = identitySessionTransfer.transferSessionToWeb(buildWebSessionTransferContext$identity_prodRelease, partnerLinkingViewModel$transferSessionToWeb$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    validateConnectResult = (com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult) partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferData webSessionTransferData = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferData) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.transferSessionToWeb - OAuth initialization completed", null, null, 6, null);
                    this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationComplete(webSessionTransferData.getRedirectUrl(), validateConnectResult.getReturnUrl()));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PartnerLinkingViewModel.transferSessionToWeb - OAuth initialization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(webSessionTransferError.getClass()).getSimpleName()), kotlin.TuplesKt.to("errorMessage", webSessionTransferError.toString())), null, 4, null);
                    this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingEvent.OAuthInitializationFailed(new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError("Session transfer failed"), validateConnectResult.getConnectUrl()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        partnerLinkingViewModel$transferSessionToWeb$1 = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$transferSessionToWeb$1(this, continuation);
        java.lang.Object obj2 = partnerLinkingViewModel$transferSessionToWeb$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = partnerLinkingViewModel$transferSessionToWeb$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext buildWebSessionTransferContext$identity_prodRelease(java.lang.String redirectUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUrl, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        kotlin.Pair pair = kotlin.TuplesKt.to("tenant", "PAYPAL");
        java.lang.String str = com.paypal.oslo.feature.identity.connect.shared.utils.ConnectConstants.SOURCE_PARTNER_LINKING_CONNECT;
        com.paypal.android.logger.Logger.d$default(logger, "Building WebSessionTransferContext for Partner Linking", kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to("source", com.paypal.oslo.feature.identity.connect.shared.utils.ConnectConstants.SOURCE_PARTNER_LINKING_CONNECT)), null, 4, null);
        return new com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext(com.paypal.oslo.core.identity.domain.model.Tenant.PAYPAL, new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(str, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0))), redirectUrl, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.CONNECT_SINGLE_SIGN_ON);
    }

    public static final /* synthetic */ java.lang.String access$extractOAuthErrorDescription(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, java.lang.String str) {
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("error_description");
        return queryParameter == null ? android.net.Uri.parse(str).getQueryParameter("error") : queryParameter;
    }

    public static final /* synthetic */ boolean access$hasAuthCode(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, java.lang.String str) {
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("code");
        return !(queryParameter == null || kotlin.text.StringsKt.isBlank(queryParameter));
    }
}
