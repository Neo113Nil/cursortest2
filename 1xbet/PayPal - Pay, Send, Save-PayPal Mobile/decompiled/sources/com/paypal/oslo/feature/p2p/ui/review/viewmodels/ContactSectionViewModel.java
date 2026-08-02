package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00140 H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010.R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R&\u0010;\u001a\u0014\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000209078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010:R \u0010=\u001a\b\u0012\u0004\u0012\u0002080<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010B\u001a\b\u0012\u0004\u0012\u0002090A8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0018\u00104\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010G"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateTransferAttemptReceiverUseCase;", "updateTransferAttemptReceiverUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getPaymentTransferAttemptUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/IsAmountAndIntentUpdateInitiatedUseCase;", "isAmountAndIntentUpdateInitiatedUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePaymentContingencyUseCase;", "resolvePaymentContingencyUseCase", "Lcom/paypal/oslo/feature/p2p/ui/transfer/mapper/RecommendedContactToP2PContactItemMapper;", "recommendedContactMapper", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "p2pFeatureGateManager", "Lcom/paypal/oslo/feature/contacts/api/ContactsApi;", "contactsApi", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateTransferAttemptReceiverUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/IsAmountAndIntentUpdateInitiatedUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePaymentContingencyUseCase;Lcom/paypal/oslo/feature/p2p/ui/transfer/mapper/RecommendedContactToP2PContactItemMapper;Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;Lcom/paypal/oslo/feature/contacts/api/ContactsApi;)V", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;)V", "onCleared", "()V", "", "p0", "p1", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "p2", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;)V", "Lkotlin/Function1;", "p3", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;Lkotlin/jvm/functions/Function1;)Z", "getInputFormats", "Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateTransferAttemptReceiverUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/usecase/IsAmountAndIntentUpdateInitiatedUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePaymentContingencyUseCase;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/mapper/RecommendedContactToP2PContactItemMapper;", "Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "Lcom/paypal/oslo/feature/contacts/api/ContactsApi;", "getContactsApi", "()Lcom/paypal/oslo/feature/contacts/api/ContactsApi;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel$sideEffectsMiddleware$1;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel$sideEffectsMiddleware$1;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ContactSectionUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ContactSectionEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContactSectionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.UpdateTransferAttemptReceiverUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState, com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect> getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$sideEffectsMiddleware$1 getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState> uiState;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$sideEffectsMiddleware$1, java.lang.Object] */
    @javax.inject.Inject
    public ContactSectionViewModel(com.paypal.oslo.feature.p2p.domain.usecase.UpdateTransferAttemptReceiverUseCase updateTransferAttemptReceiverUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase isAmountAndIntentUpdateInitiatedUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase resolvePaymentContingencyUseCase, com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper recommendedContactToP2PContactItemMapper, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTransferAttemptReceiverUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferAttemptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAmountAndIntentUpdateInitiatedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePaymentContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedContactToP2PContactItemMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2pFeatureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsApi, "");
        this.Camera2StreamConfigurationMap = updateTransferAttemptReceiverUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getPaymentTransferAttemptUseCase;
        this.getHighSpeedVideoFpsRanges = isAmountAndIntentUpdateInitiatedUseCase;
        this.getHighSpeedVideoSizes = resolvePaymentContingencyUseCase;
        this.getHighSpeedVideoFpsRangesFor = recommendedContactToP2PContactItemMapper;
        this.getInputFormats = p2pFeatureGateManager;
        this.contactsApi = contactsApi;
        ?? r1 = new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState, com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent>() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState, com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected) {
                    com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected contactSelected = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected) event;
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$handleReceiverSelection(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this, input.getEventDispatcher(), input.getStates().getFirst().getPaymentId(), contactSelected.getContactId(), contactSelected.getReceiverType());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentLinkOptionSelected) {
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this;
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                    java.lang.String paymentId = input.getStates().getFirst().getPaymentId();
                    java.lang.String obj = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$handleReceiverSelection(contactSectionViewModel, eventDispatcher, paymentId, kotlin.text.StringsKt.replace$default(obj, "-", "", false, 4, (java.lang.Object) null), com.paypal.oslo.feature.p2p.domain.model.ReceiverType.UNIQUE_PAYMENT_CODE);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested) {
                    com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested resolveContingencyRequested = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested) event;
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$handleResolveContingency(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this, input.getEventDispatcher(), input.getStates().getFirst().getPaymentId(), resolveContingencyRequested.getGivenName(), resolveContingencyRequested.getSurname());
                } else if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact) {
                    com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem selectedContact = input.getStates().getFirst().getSelectedContact();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(selectedContact != null ? selectedContact.getId() : null, ((com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact) event).getContactId())) {
                        input.getEventDispatcher().invoke(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearSelections.INSTANCE);
                    }
                }
            }
        };
        this.getInputSizeshNQ4ISI = r1;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState, com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ContactSectionViewModel.store", new com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState(null, false, null, null, null, false, null, null, null, false, false, false, null, false, null, null, p2pFeatureGateManager.isContactSyncEnabled(), p2pFeatureGateManager.isPpLinkEnabled(), p2pFeatureGateManager.isQrcFlowEnabled(), p2pFeatureGateManager.isPublicProfileEnabled(), 65535, null), com.paypal.oslo.feature.p2p.ui.review.reducers.ContactSectionReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf(r1), androidx.view.ViewModelKt.getViewModelScope(contactSectionViewModel));
        this.getOutputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(contactSectionViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.AnonymousClass1(null), 3, null);
    }

    public final com.paypal.oslo.feature.contacts.api.ContactsApi getContactsApi() {
        return this.contactsApi;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.review.effects.ContactSectionEffect> getUiEffect() {
        return this.uiEffect;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$1", f = "ContactSectionViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m = "invokeSuspend", n = {}, nl = {257}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow combine = kotlinx.coroutines.flow.FlowKt.combine(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getHighSpeedVideoFpsRanges.invoke(), com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getHighResolutionOutputSizeshNQ4ISI.invoke(), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.AnonymousClass1.C01281(null));
                final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (combine.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        kotlin.Pair pair = (kotlin.Pair) obj2;
                        boolean booleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
                        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) pair.component2();
                        if (!booleanValue) {
                            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded(kotlin.collections.CollectionsKt.emptyList()));
                        } else if (paymentTransferAttempt != null) {
                            java.lang.String paymentId = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getUiState().getValue().getPaymentId();
                            if (paymentId.length() > 0 && !kotlin.jvm.internal.Intrinsics.areEqual(paymentId, paymentTransferAttempt.getId())) {
                                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow(paymentTransferAttempt.getId(), com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getInputFormats.isContactSyncEnabled(), com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getInputFormats.isPpLinkEnabled(), com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getInputFormats.isQrcFlowEnabled(), com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getInputFormats.isPublicProfileEnabled()));
                            } else {
                                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentIdInitialized(paymentTransferAttempt.getId()));
                            }
                            java.util.List<com.paypal.oslo.feature.p2p.domain.model.RecommendedContact> recommendedContacts = paymentTransferAttempt.getRecommendedContacts();
                            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel2 = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this;
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(recommendedContacts, 10));
                            java.util.Iterator<T> it = recommendedContacts.iterator();
                            while (it.hasNext()) {
                                arrayList.add(contactSectionViewModel2.getHighSpeedVideoFpsRangesFor.map((com.paypal.oslo.feature.p2p.domain.model.RecommendedContact) it.next()));
                            }
                            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded(arrayList));
                            if (paymentTransferAttempt.getReceiver() != null && com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.getUiState().getValue().getSelectedContact() == null) {
                                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.access$autoSelectReceiver(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this, paymentTransferAttempt);
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "isUpdateInitiated", "attempt"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$1$1", f = "ContactSectionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01281 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt>>, java.lang.Object> {
            /* synthetic */ boolean Camera2StreamConfigurationMap;
            /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRanges;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                boolean z = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoFpsRanges != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return new kotlin.Pair(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z), paymentTransferAttempt);
            }

            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt>> continuation) {
                boolean booleanValue = bool.booleanValue();
                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.AnonymousClass1.C01281 c01281 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.AnonymousClass1.C01281(continuation);
                c01281.Camera2StreamConfigurationMap = booleanValue;
                c01281.getHighResolutionOutputSizeshNQ4ISI = paymentTransferAttempt;
                return c01281.invokeSuspend(kotlin.Unit.INSTANCE);
            }

            C01281(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.AnonymousClass1.C01281> continuation) {
                super(3, continuation);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected) {
            java.lang.String id = ((com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected) event).getContact().getId();
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem selectedContact = this.uiState.getValue().getSelectedContact();
            if (kotlin.jvm.internal.Intrinsics.areEqual(id, selectedContact != null ? selectedContact.getId() : null)) {
                return;
            }
        }
        this.getOutputFormats.onEvent(event);
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String p0, java.lang.String p1, com.paypal.oslo.feature.p2p.domain.model.ReceiverType p2) {
        com.paypal.oslo.feature.p2p.LoggerKt.log.i(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_SELECTED_RECEIVER, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", p0), kotlin.TuplesKt.to("receiverType", p2.name())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, p1)));
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String p0, java.lang.String p1, com.paypal.oslo.feature.p2p.domain.model.ReceiverType p2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent, kotlin.Unit> p3) {
        if (p0.length() != 0) {
            return true;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_RECEIVER_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("receiverType", p2.name()), kotlin.TuplesKt.to("errorType", "InvalidState")), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, p1)), null, 8, null);
        p3.invoke(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverFailed.INSTANCE);
        return false;
    }

    public static final /* synthetic */ void access$autoSelectReceiver(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt) {
        com.paypal.oslo.feature.p2p.domain.model.AttemptReceiver receiver = paymentTransferAttempt.getReceiver();
        if (receiver != null) {
            java.lang.String accountId = receiver.getAccountId();
            if (accountId == null) {
                accountId = receiver.getId();
            }
            java.lang.String str = accountId;
            java.lang.String firstName = receiver.getFirstName();
            if (firstName == null) {
                firstName = receiver.getId();
            }
            java.lang.String str2 = firstName;
            java.lang.String lastName = receiver.getLastName();
            if (lastName == null) {
                lastName = "";
            }
            contactSectionViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated(new com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem(str, str2, lastName, receiver.getType() == com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER ? receiver.getId() : null, receiver.getType() == com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS ? receiver.getId() : null, receiver.getProfilePhotoUrl(), false, null, null, null, null, null, null, null, false, false, false, 0, null, 524224, null), new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver(paymentTransferAttempt.getId(), paymentTransferAttempt.getSupportedTransferTypes(), paymentTransferAttempt.getSelectedTransferType(), paymentTransferAttempt.getFundingOptions(), null, null, null, null, paymentTransferAttempt.getPaymentLink(), null, 752, null)));
        }
    }

    public static final /* synthetic */ void access$handleContingencyResolutionError(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, com.paypal.oslo.feature.p2p.domain.error.TransferError transferError, java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        kotlin.Pair pair;
        boolean z = transferError instanceof com.paypal.oslo.feature.p2p.domain.error.TransferError.HighRiskScamDecline;
        if (z) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONTINGENCY_RESOLUTION_DECLINED_RISK_SCAM, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str)), null, 4, null);
            function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.HighRiskScamDeclineDetected.INSTANCE);
            return;
        }
        if (transferError instanceof com.paypal.oslo.feature.p2p.domain.error.TransferError.Network) {
            pair = new kotlin.Pair(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel.WARN, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str), kotlin.TuplesKt.to("errorType", "Network"), kotlin.TuplesKt.to("errorMessage", "Network connectivity issue")));
        } else if (transferError instanceof com.paypal.oslo.feature.p2p.domain.error.TransferError.DataNotFound) {
            pair = new kotlin.Pair(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel.WARN, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str), kotlin.TuplesKt.to("errorType", "DataNotFound"), kotlin.TuplesKt.to("errorMessage", "Required data missing in response")));
        } else {
            if (!(transferError instanceof com.paypal.oslo.feature.p2p.domain.error.TransferError.Unknown)) {
                if (!z) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return;
            }
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel contingencyErrorLogLevel = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel.ERROR;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
            pairArr[2] = kotlin.TuplesKt.to("errorMessage", ((com.paypal.oslo.feature.p2p.domain.error.TransferError.Unknown) transferError).toString());
            pair = new kotlin.Pair(contingencyErrorLogLevel, kotlin.collections.MapsKt.mapOf(pairArr));
        }
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel contingencyErrorLogLevel2 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel) pair.component1();
        java.util.Map map = (java.util.Map) pair.component2();
        int i = com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.WhenMappings.$EnumSwitchMapping$0[contingencyErrorLogLevel2.ordinal()];
        if (i == 1) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Contingency resolution failed", map, null, 4, null);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Contingency resolution failed", map, null, null, 12, null);
        }
        function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverFailed.INSTANCE);
    }

    public static final /* synthetic */ void access$handleReceiverSelection(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType) {
        kotlinx.coroutines.Job launch$default;
        if (getHighSpeedVideoFpsRangesFor(str, str2, receiverType, function1)) {
            kotlinx.coroutines.Job job = contactSectionViewModel.getOutputMinFrameDuration;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(contactSectionViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleReceiverSelection$1(contactSectionViewModel, str, str2, receiverType, function1, null), 3, null);
            contactSectionViewModel.getOutputMinFrameDuration = launch$default;
        }
    }

    public static final /* synthetic */ void access$handleReceiverUpdateSuccess(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver) {
        java.util.ArrayList emptyList;
        java.lang.Object obj;
        com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> contingencies;
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = updatePaymentTransferAttemptReceiver.getFundingOptions();
        if (fundingOptions == null || (contingencies = fundingOptions.getContingencies()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : contingencies) {
                if (((com.paypal.oslo.feature.p2p.domain.model.Contingency) obj2).getStatus() == com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNRESOLVED) {
                    arrayList.add(obj2);
                }
            }
            emptyList = arrayList;
        }
        java.util.Iterator it = emptyList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.paypal.oslo.feature.p2p.domain.model.Contingency) obj).getAction() == com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.DISPLAY_SCAM_WARNING) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.paypal.oslo.feature.p2p.domain.model.Contingency contingency = (com.paypal.oslo.feature.p2p.domain.model.Contingency) obj;
        if (contingency != null) {
            com.paypal.oslo.feature.p2p.domain.model.PaymentTxType selectedTransferType = updatePaymentTransferAttemptReceiver.getSelectedTransferType();
            com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType = selectedTransferType != null ? com.paypal.oslo.feature.p2p.domain.model.PaymentTypeKt.toPaymentType(selectedTransferType) : null;
            com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails details = contingency.getDetails();
            com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning scamWarning = details instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning ? (com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning) details : null;
            if (scamWarning == null || (scamRiskLevel = scamWarning.getRiskLevel()) == null) {
                scamRiskLevel = com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.UNKNOWN;
            }
            Camera2StreamConfigurationMap(str, str2, receiverType);
            if (paymentType != null) {
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.INSTANCE.resolve(paymentType, scamRiskLevel), updatePaymentTransferAttemptReceiver));
                return;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.RECEIVER_MISSING_PAYMENT_SCAM_CONTINGENCY, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", str), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTINGENCY_ACTION, contingency.getAction().name())), null, 4, null);
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess(updatePaymentTransferAttemptReceiver));
                return;
            }
        }
        if (!emptyList.isEmpty()) {
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected(emptyList, updatePaymentTransferAttemptReceiver));
        } else {
            Camera2StreamConfigurationMap(str, str2, receiverType);
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess(updatePaymentTransferAttemptReceiver));
        }
    }

    public static final /* synthetic */ void access$handleResolveContingency(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (getHighSpeedVideoFpsRangesFor(str, str, com.paypal.oslo.feature.p2p.domain.model.ReceiverType.UNIQUE_PAYMENT_CODE, function1)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(contactSectionViewModel), null, null, new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel$handleResolveContingency$1(contactSectionViewModel, str, str2, str3, function1, null), 3, null);
        }
    }

    public static final /* synthetic */ void access$logReceiverUpdateFailed(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, java.lang.Throwable th) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("attemptId", str);
        pairArr[1] = kotlin.TuplesKt.to("receiverType", receiverType.name());
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
        }
        pairArr[2] = kotlin.TuplesKt.to("errorType", simpleName);
        logger.e(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.PAYMENT_RECEIVER_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, str2)), th);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel.WARN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContingencyErrorLogLevel.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
