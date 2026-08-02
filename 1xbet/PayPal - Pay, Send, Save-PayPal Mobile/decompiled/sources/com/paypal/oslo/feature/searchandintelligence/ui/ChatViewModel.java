package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\\B[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010/R\u0014\u00102\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00100\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u0014\u00107\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00106R&\u0010=\u001a\u0014\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020:088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u0002090>8\u0007¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010D\u001a\b\u0012\u0004\u0012\u00020:0C8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010N\u001a\b\u0012\u0004\u0012\u00020M0>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010@\u001a\u0004\bO\u0010BR\u0018\u0010J\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010TR\u0016\u0010;\u001a\u00020U8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010VR\u0018\u0010P\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010XR\u0014\u0010[\u001a\u00020Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010Z"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CreateChatUseCase;", "createChatUseCase", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/SubscribeToChatUseCase;", "subscribeToChatUseCase", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CloseChatUseCase;", "closeChatUseCase", "Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;", "internalSearchAndIntelligence", "Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;", "configManager", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetStartersUseCase;", "getStartersUseCase", "Lkotlin/time/TimeSource;", "timeSource", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMetricsTracker;", "chatMetricsTracker", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatReducer;", "reducer", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CreateChatUseCase;Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/SubscribeToChatUseCase;Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CloseChatUseCase;Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetStartersUseCase;Lkotlin/time/TimeSource;Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMetricsTracker;Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatReducer;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;)V", "onCleared", "()V", "", "p0", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/CloseChatReason;", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/CloseChatReason;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CreateChatUseCase;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/SubscribeToChatUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CloseChatUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;", "getInputFormats", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetStartersUseCase;", "getOutputMinFrameDuration", "toString", "Lkotlin/time/TimeSource;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMetricsTracker;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiState;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect;", "getOutputSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getOutputStallDurationlomOqCM", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "starters", "getStarters", "getOutputStallDuration", "Ljava/lang/String;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "Lkotlinx/coroutines/channels/Channel;", "", "Z", "Lkotlin/time/TimeMark;", "Lkotlin/time/TimeMark;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatViewModel$delegate$1;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatViewModel$delegate$1;", "unwrapAs", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final int ActionInfoMaxLength = 256;

    @java.lang.Deprecated
    public static final int MaxPromptLogLength = 50;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$delegate$1 unwrapAs;
    private final com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getOutputSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private kotlin.time.TimeMark getOutputStallDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput> getOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> getOutputFormats;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private java.lang.String getOutputStallDurationlomOqCM;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> getOutputMinFrameDurationlomOqCM;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters> starters;

    /* renamed from: toString, reason: from kotlin metadata */
    private final kotlin.time.TimeSource getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState> uiState;
    private static final com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.Companion Companion = new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$delegate$1] */
    @javax.inject.Inject
    public ChatViewModel(com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase createChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase subscribeToChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase closeChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence, com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager searchAndIntelligenceConfigManager, com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase getStartersUseCase, kotlin.time.TimeSource timeSource, com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer chatReducer, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createChatUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscribeToChatUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeChatUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSearchAndIntelligence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchAndIntelligenceConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getStartersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatMetricsTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = createChatUseCase;
        this.getHighSpeedVideoSizes = subscribeToChatUseCase;
        this.getHighSpeedVideoFpsRanges = closeChatUseCase;
        this.Camera2StreamConfigurationMap = internalSearchAndIntelligence;
        this.getHighSpeedVideoFpsRangesFor = searchAndIntelligenceConfigManager;
        this.getOutputMinFrameDuration = getStartersUseCase;
        this.getInputSizeshNQ4ISI = timeSource;
        this.getInputFormats = chatMetricsTracker;
        this.getHighSpeedVideoSizesFor = coroutineDispatcher;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ChatViewModel.store", new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(null, null, false, null, false, 31, null), chatReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$sideEffectsMiddleware$1
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            
                if (r0 != false) goto L16;
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent> input) {
                com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent event;
                java.lang.String str;
                java.lang.String str2;
                java.lang.String str3;
                boolean z;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent event2 = input.getEvent();
                if (!(event2 instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) && !(event2 instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction) && !(event2 instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ContinueChat) && !(event2 instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted)) {
                    if ((event2 instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) && !((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) event2).isVisible()) {
                        z = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputSizes;
                    }
                    event = input.getEvent();
                    if (!(event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged)) {
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$handleVisibility(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) event, input.getEventDispatcher());
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Retry) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$createSession$1(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, input.getEventDispatcher(), null), 3, null);
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver) {
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$handleStartOver(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, input.getEventDispatcher());
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Logout) {
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$handleLogout(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this);
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) {
                        str3 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputStallDurationlomOqCM;
                        if (str3 == null || !(input.getStates().getFirst().getStatus() instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending)) {
                            com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$handleSendMessage(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) event, input);
                            return;
                        }
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage) {
                        str2 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputStallDurationlomOqCM;
                        if (str2 == null || !(input.getStates().getFirst().getStatus() instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending)) {
                            com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage delegateSendMessage = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage) event;
                            input.getEventDispatcher().invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage(delegateSendMessage.getText(), delegateSendMessage.getMessageType(), delegateSendMessage.getMaxLines()));
                            return;
                        }
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt) {
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$handleNavigationWithPrompt(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt) event, input.getEventDispatcher());
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$subscribeToChatStream$1(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream) event, input.getEventDispatcher(), null), 3, null);
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction) {
                        str = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputStallDurationlomOqCM;
                        if (str == null || !(input.getStates().getFirst().getStatus() instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending)) {
                            com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$handleExecuteAction(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction) event, input.getEventDispatcher());
                            return;
                        }
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted) {
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$processNextPendingInput(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, input.getEventDispatcher());
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated) {
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated sessionCreated = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated) event;
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputStallDurationlomOqCM = sessionCreated.getSessionId();
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Chat created successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", sessionCreated.getSessionId())), null, 4, null);
                        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$processNextPendingInput(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this, input.getEventDispatcher());
                        return;
                    }
                    return;
                }
                com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.access$recordInteraction(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this);
                event = input.getEvent();
                if (!(event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged)) {
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$metricsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent> input) {
                com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker2;
                java.lang.String str;
                com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker3;
                java.lang.String str2;
                com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker4;
                com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker5;
                com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker6;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) {
                    chatMetricsTracker6 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getInputFormats;
                    chatMetricsTracker6.logSessionCreateFailed(((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) event).getError());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream) {
                    chatMetricsTracker5 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getInputFormats;
                    chatMetricsTracker5.setInput(((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream) event).getInput());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) {
                    chatMetricsTracker4 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getInputFormats;
                    chatMetricsTracker4.trackSseResponse(((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) event).getResponse());
                } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived) {
                    chatMetricsTracker3 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getInputFormats;
                    str2 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputStallDurationlomOqCM;
                    chatMetricsTracker3.onError(str2, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived) event).getError());
                } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted) {
                    chatMetricsTracker2 = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getInputFormats;
                    str = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputStallDurationlomOqCM;
                    chatMetricsTracker2.logStreamCompletionAndReset(str);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(chatViewModel));
        this.getOutputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0L);
        this.getOutputMinFrameDurationlomOqCM = MutableStateFlow;
        this.starters = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.transformLatest(MutableStateFlow, new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$special$$inlined$flatMapLatest$1(null, this)), androidx.view.ViewModelKt.getViewModelScope(chatViewModel), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(null, null == true ? 1 : 0, 3, null == true ? 1 : 0));
        this.getOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        ?? r1 = new com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$delegate$1
            @Override // com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate
            public final void onAction(com.paypal.oslo.feature.searchandintelligence.domain.ChatAction action) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
                if (action instanceof com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage) {
                    com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage sendMessage = (com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.SendMessage) action;
                    com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.processEvent(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage(sendMessage.getText(), sendMessage.getMessageType(), sendMessage.getMaxLines()));
                } else if (action instanceof com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents) {
                    com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.processEvent(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents(((com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.DisplayComponents) action).getComponents()));
                } else {
                    if (!(action instanceof com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.processEvent(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction(((com.paypal.oslo.feature.searchandintelligence.domain.ChatAction.ExecuteAction) action).getActionContent()));
                }
            }

            @Override // com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate
            public final java.lang.String getSessionId() {
                java.lang.String str;
                str = com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.getOutputStallDurationlomOqCM;
                return str;
            }

            @Override // com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate
            public final void onLogout() {
                com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel.this.processEvent(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Logout.INSTANCE);
            }
        };
        this.unwrapAs = r1;
        internalSearchAndIntelligence.setDelegate((com.paypal.oslo.feature.searchandintelligence.domain.SearchAndIntelligenceDelegate) r1);
    }

    public /* synthetic */ ChatViewModel(com.paypal.oslo.feature.searchandintelligence.domain.usecase.CreateChatUseCase createChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase subscribeToChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase closeChatUseCase, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence, com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager searchAndIntelligenceConfigManager, com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase getStartersUseCase, kotlin.time.TimeSource timeSource, com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducer chatReducer, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(createChatUseCase, subscribeToChatUseCase, closeChatUseCase, internalSearchAndIntelligence, searchAndIntelligenceConfigManager, getStartersUseCase, timeSource, chatMetricsTracker, chatReducer, (i & 512) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputFormats.onEvent(event);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters> getStarters() {
        return this.starters;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        getHighSpeedVideoFpsRanges(this.getOutputStallDurationlomOqCM, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.COMPLETED);
        this.Camera2StreamConfigurationMap.setDelegate(null);
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.String p0, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason p1) {
        if (p0 == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(this.getHighSpeedVideoSizesFor)), null, null, new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$closeSession$1(this, p0, p1, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatViewModel$Companion;", "", "<init>", "()V", "", "MaxPromptLogLength", com.visa.cbp.getEncExpo.warmup, "ActionInfoMaxLength"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$handleExecuteAction(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction delegateExecuteAction, kotlin.jvm.functions.Function1 function1) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Executing action", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action_info", kotlin.text.StringsKt.take(delegateExecuteAction.getActionContent().getActionInfo().toString(), 256))), null, 4, null);
        java.lang.String str = chatViewModel.getOutputStallDurationlomOqCM;
        if (str != null) {
            function1.invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream(str, new com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action(delegateExecuteAction.getActionContent())));
        } else {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(chatViewModel.getOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action(delegateExecuteAction.getActionContent())));
        }
    }

    public static final /* synthetic */ void access$handleLogout(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel) {
        chatViewModel.getHighSpeedVideoFpsRanges(chatViewModel.getOutputStallDurationlomOqCM, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.LOGOUT);
        chatViewModel.getOutputStallDurationlomOqCM = null;
        chatViewModel.getOutputStallDuration = null;
        chatViewModel.getOutputSizes = false;
        while (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(chatViewModel.getOutputSizeshNQ4ISI.mo24073tryReceivePtdJZtk())) {
        }
    }

    public static final /* synthetic */ void access$handleNavigationWithPrompt(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt handleNavigationWithPrompt, kotlin.jvm.functions.Function1 function1) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.searchandintelligence.LoggerKt.log;
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("session_id", chatViewModel.getOutputStallDurationlomOqCM);
        createMapBuilder.put("silent_prompt", java.lang.Boolean.valueOf(!handleNavigationWithPrompt.getMessageType().getIsVisibleInUi()));
        java.lang.String source = handleNavigationWithPrompt.getSource();
        if (source != null) {
            createMapBuilder.put("source", source);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        logger.i("sni.navigation.external.triggered", kotlin.collections.MapsKt.build(createMapBuilder), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("chat_prompt", kotlin.text.StringsKt.take(handleNavigationWithPrompt.getPrompt(), 50))));
        chatViewModel.getOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text(handleNavigationWithPrompt.getPrompt()));
        chatViewModel.getHighSpeedVideoFpsRanges(chatViewModel.getOutputStallDurationlomOqCM, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.USER_REQUEST);
        chatViewModel.getOutputStallDurationlomOqCM = null;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(chatViewModel), null, null, new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$createSession$1(chatViewModel, function1, null), 3, null);
    }

    public static final /* synthetic */ void access$handleSendMessage(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage sendMessage, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.searchandintelligence.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, sendMessage.getMessageType());
        pairArr[1] = kotlin.TuplesKt.to("text_length", java.lang.Integer.valueOf(sendMessage.getText().length()));
        pairArr[2] = kotlin.TuplesKt.to("session_ready", java.lang.Boolean.valueOf(chatViewModel.getOutputStallDurationlomOqCM != null));
        com.paypal.android.logger.Logger.d$default(logger, "Handling chat message", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        if (sendMessage.getMessageType().getShouldSendToBackend()) {
            java.lang.String str = chatViewModel.getOutputStallDurationlomOqCM;
            if (str != null) {
                input.getEventDispatcher().invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream(str, new com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text(sendMessage.getText())));
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Queueing message for later", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MESSAGE_TYPE, sendMessage.getMessageType()), kotlin.TuplesKt.to("text_length", java.lang.Integer.valueOf(sendMessage.getText().length()))), null, 4, null);
                kotlinx.coroutines.channels.ChannelResult.m24079boximpl(chatViewModel.getOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text(sendMessage.getText())));
            }
        }
    }

    public static final /* synthetic */ void access$handleStartOver(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, kotlin.jvm.functions.Function1 function1) {
        java.lang.Long value;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> mutableStateFlow = chatViewModel.getOutputMinFrameDurationlomOqCM;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Long.valueOf(value.longValue() + 1)));
        chatViewModel.getHighSpeedVideoFpsRanges(chatViewModel.getOutputStallDurationlomOqCM, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.USER_REQUEST);
        chatViewModel.getOutputStallDurationlomOqCM = null;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(chatViewModel), null, null, new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$createSession$1(chatViewModel, function1, null), 3, null);
    }

    public static final /* synthetic */ void access$handleVisibility(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged visibilityChanged, kotlin.jvm.functions.Function1 function1) {
        chatViewModel.getOutputSizes = visibilityChanged.isVisible();
        if (visibilityChanged.isVisible()) {
            boolean isEmpty = chatViewModel.getOutputFormats.getCurrentState().getConversations().isEmpty();
            kotlin.time.TimeMark timeMark = chatViewModel.getOutputStallDuration;
            long mo23933elapsedNowUwyO8pc = timeMark != null ? timeMark.mo23933elapsedNowUwyO8pc() : kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc();
            long mo19113getSessionInactivityTimeoutUwyO8pc = chatViewModel.getHighSpeedVideoFpsRangesFor.mo19113getSessionInactivityTimeoutUwyO8pc();
            boolean z = !isEmpty && kotlin.time.Duration.m23941compareToLRDsOJo(mo23933elapsedNowUwyO8pc, mo19113getSessionInactivityTimeoutUwyO8pc) >= 0;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Resume overlay check", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("has_messages", java.lang.Boolean.valueOf(!isEmpty)), kotlin.TuplesKt.to("elapsed_seconds", java.lang.Long.valueOf(kotlin.time.Duration.m23956getInWholeSecondsimpl(mo23933elapsedNowUwyO8pc))), kotlin.TuplesKt.to("threshold_seconds", java.lang.Long.valueOf(kotlin.time.Duration.m23956getInWholeSecondsimpl(mo19113getSessionInactivityTimeoutUwyO8pc))), kotlin.TuplesKt.to("should_show", java.lang.Boolean.valueOf(z))), null, 4, null);
            if (z) {
                function1.invoke(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ShowResumeOverlay.INSTANCE);
            }
            if (chatViewModel.getOutputStallDurationlomOqCM == null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(chatViewModel), null, null, new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$createSession$1(chatViewModel, function1, null), 3, null);
            }
        }
    }

    public static final /* synthetic */ void access$processNextPendingInput(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput;
        java.lang.String str = chatViewModel.getOutputStallDurationlomOqCM;
        if (str == null || (chatInput = (com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(chatViewModel.getOutputSizeshNQ4ISI.mo24073tryReceivePtdJZtk())) == null) {
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Processing pending input", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("input_type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(chatInput.getClass()).getSimpleName())), null, 4, null);
        function1.invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream(str, chatInput));
    }

    public static final /* synthetic */ void access$recordInteraction(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel) {
        boolean z = chatViewModel.getOutputStallDuration != null;
        chatViewModel.getOutputStallDuration = chatViewModel.getInputSizeshNQ4ISI.markNow();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Recorded interaction", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("has_messages", java.lang.Boolean.valueOf(!chatViewModel.getOutputFormats.getCurrentState().getConversations().isEmpty())), kotlin.TuplesKt.to("had_previous_interaction", java.lang.Boolean.valueOf(z))), null, 4, null);
    }
}
