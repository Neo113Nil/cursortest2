package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiState;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiState;Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent;)Larrow/core/Either;", "p0", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiState;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SendMessage;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatUiState;Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatEvent$SendMessage;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ChatReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ChatReducer";
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState p0, com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse p1) {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.Conversation> conversations;
        if (p1 instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamStarted) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component) {
            com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component component = (com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.Component) p1;
            if (!component.getComponents().isEmpty()) {
                conversations = com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$appendToLast(p0.getConversations(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote(component.getComponents())));
            } else {
                conversations = p0.getConversations();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(p0, null, conversations, false, null, false, 29, null), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamCompleted) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(p0, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$removeThinkingFromLast(p0.getConversations()), false, null, false, 28, null), null, 2, null);
        }
        if (p1 instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.StreamProcessing) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }
        if (!(p1 instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse.ErrorReceived)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(p0, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.ErrorReceived.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$appendToLast(com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$removeThinkingFromLast(p0.getConversations()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.ErrorReceived.INSTANCE))), false, null, false, 28, null), null, 2, null);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect>> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState p0, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage p1) {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.Conversation> plus;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending status;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage user;
        boolean shouldSendToBackend = p1.getMessageType().getShouldSendToBackend();
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(p0.getStatus(), com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE);
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (p1.getMessageType().getIsVisibleInUi()) {
            if (p1.getMessageType() == com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.AGENT_VISIBLE_LOCAL) {
                user = new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Agent(p1.getText(), p1.getMaxLines());
            } else {
                user = new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.User(p1.getText(), p1.getMaxLines());
            }
            createListBuilder.add(user);
        }
        if (shouldSendToBackend && !areEqual) {
            createListBuilder.add(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking.INSTANCE);
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        if (build.isEmpty()) {
            plus = p0.getConversations();
        } else if (p1.getMessageType() == com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.AGENT_VISIBLE_LOCAL) {
            plus = com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$appendToLast(p0.getConversations(), build);
        } else {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.searchandintelligence.ui.Conversation>) p0.getConversations(), new com.paypal.oslo.feature.searchandintelligence.ui.Conversation(build, null, 2, null));
        }
        if (shouldSendToBackend && !areEqual) {
            status = com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE;
        } else {
            status = p0.getStatus();
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(p0, status, plus, false, "", false, 4, null), new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect.ScrollToPin(kotlin.collections.CollectionsKt.getLastIndex(plus)));
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState, com.paypal.oslo.feature.searchandintelligence.ui.ChatUiEffect>> reduce(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState state, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent event) {
        arrow.core.Either.Right output$default;
        java.util.List plus;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error highSpeedVideoSizes;
        java.util.List plus2;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error highSpeedVideoSizes2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, null, null, false, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.InputTextChanged) event).getText(), false, 23, null), null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) {
            if (!((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) event).isVisible()) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, null, null, false, "", false, 23, null), null, 2, null);
            }
            output$default = null;
        } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ShowResumeOverlay) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, null, null, true, null, false, 27, null), null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.ContinueChat) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, null, null, false, null, false, 27, null), null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents) {
            com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents delegateDisplayComponents = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateDisplayComponents) event;
            if (!delegateDisplayComponents.getComponents().isEmpty()) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, null, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$appendToLast(state.getConversations(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Remote(delegateDisplayComponents.getComponents()))), false, null, false, 29, null), null, 2, null);
            } else {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
        } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt) {
            com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt handleNavigationWithPrompt = (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.HandleNavigationWithPrompt) event;
            output$default = getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(null, null, false, null, false, 31, null), new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage(handleNavigationWithPrompt.getPrompt(), handleNavigationWithPrompt.getMessageType(), 0, 4, null));
            if (output$default instanceof arrow.core.Either.Right) {
                com.paypal.oslo.core.mvi.Reducer.Output output = (com.paypal.oslo.core.mvi.Reducer.Output) ((arrow.core.Either.Right) output$default).getValue();
                output$default = new arrow.core.Either.Right(com.paypal.oslo.core.mvi.Reducer.Output.copy$default(output, com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default((com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState) output.getState(), null, null, false, null, true, 15, null), null, 2, null));
            } else if (!(output$default instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Logout) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(null, null, false, null, false, 31, null), null, 2, null);
        } else if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream) {
            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        } else {
            if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateSendMessage) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
            }
            output$default = null;
        }
        if (output$default != null) {
            return output$default;
        }
        com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus status = state.getStatus();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.ErrorReceived.INSTANCE)) {
                    if (!(status instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (!(event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.Retry)) {
                        return event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE, null, false, null, false, 30, null), null, 2, null) : event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                    }
                    if (!state.getConversations().isEmpty()) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$appendToLast(com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$removeThinkingFromLast(state.getConversations()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking.INSTANCE)), false, null, false, 28, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE, null, false, null, false, 30, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) {
                    return getHighResolutionOutputSizeshNQ4ISI(state, (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) event);
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE, null, false, null, false, 30, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction) {
                    com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending sending = com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE;
                    plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.searchandintelligence.ui.Conversation>) state.getConversations(), new com.paypal.oslo.feature.searchandintelligence.ui.Conversation(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking.INSTANCE), null, 2, null));
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, sending, plus, false, "", false, 20, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) {
                    return getHighSpeedVideoSizes(state, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) event).getResponse());
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, null, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$removeThinkingFromLast(state.getConversations()), false, null, false, 29, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
            }
            if (!(event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) && !(event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated)) {
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) {
                    highSpeedVideoSizes = com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.getHighSpeedVideoSizes(((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) event).getError());
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, highSpeedVideoSizes, null, false, null, false, 30, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) {
                    return getHighSpeedVideoSizes(state, ((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived) event).getResponse());
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$appendToLast(com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$removeThinkingFromLast(state.getConversations()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Error(com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$toChatStatusError(((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived) event).getError())))), false, null, false, 28, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE, com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.access$removeThinkingFromLast(state.getConversations()), false, null, false, 28, null), null, 2, null);
                }
                return event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null) : event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE, null, false, null, false, 30, null), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) {
            return getHighResolutionOutputSizeshNQ4ISI(state, (com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SendMessage) event);
        }
        if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) {
            highSpeedVideoSizes2 = com.paypal.oslo.feature.searchandintelligence.ui.ChatReducerKt.getHighSpeedVideoSizes(((com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreateFailed) event).getError());
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, highSpeedVideoSizes2, null, false, null, false, 30, null), null, 2, null);
        }
        if ((event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SessionCreated) || (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.VisibilityChanged)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StartOver) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE, null, false, null, false, 30, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.DelegateExecuteAction) {
            com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending sending2 = com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE;
            plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.searchandintelligence.ui.Conversation>) state.getConversations(), new com.paypal.oslo.feature.searchandintelligence.ui.Conversation(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking.INSTANCE), null, 2, null));
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.searchandintelligence.ui.ChatUiState.copy$default(state, sending2, plus2, false, null, false, 28, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
    }
}
