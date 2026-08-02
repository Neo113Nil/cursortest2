package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\t0\u00172\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/ChatRepositoryImpl;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/network/sse/domain/usecase/SubscribeToSseUseCase;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "subscribeToSseUseCase", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/core/network/sse/domain/usecase/SubscribeToSseUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "", "create", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chatId", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/CloseChatReason;", "reason", "", "close", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/CloseChatReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionId", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "input", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "subscribe", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/network/sse/domain/usecase/SubscribeToSseUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatRepositoryImpl implements com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ChatRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> subscribeToSseUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscribeToSseUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
        this.Camera2StreamConfigurationMap = subscribeToSseUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object create(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$create$1 chatRepositoryImpl$create$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession;
        com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session;
        java.lang.Object id;
        java.lang.String obj;
        arrow.core.Either right;
        com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.CreateAgenticSession createAgenticSession2;
        com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Session session2;
        java.lang.Object id2;
        java.lang.String obj2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$create$1) {
            chatRepositoryImpl$create$1 = (com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$create$1) continuation;
            if ((chatRepositoryImpl$create$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$create$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$create$1 chatRepositoryImpl$create$12 = chatRepositoryImpl$create$1;
                java.lang.Object obj3 = chatRepositoryImpl$create$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatRepositoryImpl$create$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation createAgenticSessionMutation = new com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation(new com.paypal.oslo.api.graphql.schema.type.CreateAgenticSessionInput(null, 1, null));
                    chatRepositoryImpl$create$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj3 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, createAgenticSessionMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, chatRepositoryImpl$create$12, 2, (java.lang.Object) null);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj3);
                }
                ior = (arrow.core.Ior) obj3;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.toNetworkError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data data = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return (data == null || (createAgenticSession2 = data.getCreateAgenticSession()) == null || (session2 = createAgenticSession2.getSession()) == null || (id2 = session2.getId()) == null || (obj2 = id2.toString()) == null || (right2 = arrow.core.EitherKt.right(obj2)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.noDataError$default(null, 1, null)) : right2;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data data2 = (com.paypal.oslo.feature.searchandintelligence.graphql.CreateAgenticSessionMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return (data2 == null || (createAgenticSession = data2.getCreateAgenticSession()) == null || (session = createAgenticSession.getSession()) == null || (id = session.getId()) == null || (obj = id.toString()) == null || (right = arrow.core.EitherKt.right(obj)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.toNetworkError(callError)) : right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        chatRepositoryImpl$create$1 = new com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$create$1(this, continuation);
        com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$create$1 chatRepositoryImpl$create$122 = chatRepositoryImpl$create$1;
        java.lang.Object obj32 = chatRepositoryImpl$create$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatRepositoryImpl$create$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj32;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object close(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$close$1 chatRepositoryImpl$close$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason agenticCloseReason;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession;
        arrow.core.Either right;
        com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.CloseAgenticSession closeAgenticSession2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$close$1) {
            chatRepositoryImpl$close$1 = (com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$close$1) continuation;
            if ((chatRepositoryImpl$close$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$close$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$close$1 chatRepositoryImpl$close$12 = chatRepositoryImpl$close$1;
                java.lang.Object obj = chatRepositoryImpl$close$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatRepositoryImpl$close$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    switch (com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[closeChatReason.ordinal()]) {
                        case 1:
                            agenticCloseReason = com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason.USER_REQUEST;
                            break;
                        case 2:
                            agenticCloseReason = com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason.INACTIVITY;
                            break;
                        case 3:
                            agenticCloseReason = com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason.COMPLETED;
                            break;
                        case 4:
                            agenticCloseReason = com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason.ERROR;
                            break;
                        case 5:
                            agenticCloseReason = com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason.OTHER;
                            break;
                        case 6:
                            agenticCloseReason = com.paypal.oslo.api.graphql.schema.type.AgenticCloseReason.OTHER;
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation closeAgenticSessionMutation = new com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation(new com.paypal.oslo.api.graphql.schema.type.CloseAgenticSessionInput(str, companion.present(agenticCloseReason), com.apollographql.apollo.api.Optional.INSTANCE.absent()));
                    chatRepositoryImpl$close$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    chatRepositoryImpl$close$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeChatReason);
                    chatRepositoryImpl$close$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, closeAgenticSessionMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, chatRepositoryImpl$close$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.toNetworkError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data data = (com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return (data == null || (closeAgenticSession2 = data.getCloseAgenticSession()) == null || (right2 = arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(closeAgenticSession2.getSuccess()))) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.noDataError$default(null, 1, null)) : right2;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data data2 = (com.paypal.oslo.feature.searchandintelligence.graphql.CloseAgenticSessionMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return (data2 == null || (closeAgenticSession = data2.getCloseAgenticSession()) == null || (right = arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(closeAgenticSession.getSuccess()))) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.data.repository.ErrorExtensionsKt.toNetworkError(callError)) : right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        chatRepositoryImpl$close$1 = new com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$close$1(this, continuation);
        com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$close$1 chatRepositoryImpl$close$122 = chatRepositoryImpl$close$1;
        java.lang.Object obj2 = chatRepositoryImpl$close$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatRepositoryImpl$close$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.sse.domain.error.SseError, com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse>> subscribe(java.lang.String sessionId, com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput input) {
        com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action action;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse> subscribeToSseUseCase = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("v1/consumer/agentic-sessions/");
        sb.append(sessionId);
        sb.append("/message-stream");
        java.lang.String obj = sb.toString();
        if (input instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text) {
            action = new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Text(new com.paypal.oslo.feature.searchandintelligence.domain.model.request.TextContentJson(((com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text) input).getText()));
        } else {
            if (!(input instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            action = new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseContentJson.Action(((com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action) input).getActionContent());
        }
        return com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.invoke$default(subscribeToSseUseCase, obj, null, kotlinx.serialization.json.Json.INSTANCE.encodeToString(com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseRequestJson.INSTANCE.serializer(), new com.paypal.oslo.feature.searchandintelligence.domain.model.request.SseRequestJson(kotlin.collections.CollectionsKt.listOf(action))), 2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.USER_REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.INACTIVITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.COMPLETED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.LOGOUT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason.OTHER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
