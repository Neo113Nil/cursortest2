package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus$Error;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus$Error;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatReducerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error getHighSpeedVideoSizes(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error.HttpError(httpError.getCode(), httpError.getMessage(), httpError.getBody());
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error.NoInternet.INSTANCE;
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error.Unknown(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ java.util.List access$appendToLast(java.util.List list, java.util.List list2) {
        if (list.isEmpty()) {
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.ui.Conversation(list2, null, 2, null));
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.searchandintelligence.ui.Conversation>) kotlin.collections.CollectionsKt.dropLast(list, 1), com.paypal.oslo.feature.searchandintelligence.ui.Conversation.copy$default((com.paypal.oslo.feature.searchandintelligence.ui.Conversation) kotlin.collections.CollectionsKt.last(list), kotlin.collections.CollectionsKt.plus((java.util.Collection) ((com.paypal.oslo.feature.searchandintelligence.ui.Conversation) kotlin.collections.CollectionsKt.last(list)).getMessages(), (java.lang.Iterable) list2), null, 2, null));
    }

    public static final /* synthetic */ java.util.List access$removeThinkingFromLast(java.util.List list) {
        if (list.isEmpty()) {
            return list;
        }
        java.util.List dropLast = kotlin.collections.CollectionsKt.dropLast(list, 1);
        com.paypal.oslo.feature.searchandintelligence.ui.Conversation conversation = (com.paypal.oslo.feature.searchandintelligence.ui.Conversation) kotlin.collections.CollectionsKt.last(list);
        java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage> messages = ((com.paypal.oslo.feature.searchandintelligence.ui.Conversation) kotlin.collections.CollectionsKt.last(list)).getMessages();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : messages) {
            if (!(((com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage) obj) instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage.Thinking)) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.searchandintelligence.ui.Conversation>) dropLast, com.paypal.oslo.feature.searchandintelligence.ui.Conversation.copy$default(conversation, arrayList, null, 2, null));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error access$toChatStatusError(com.paypal.oslo.core.network.sse.domain.error.SseError sseError) {
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) {
            return getHighSpeedVideoSizes(((com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) sseError).getError());
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) {
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error.NoData(((com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) sseError).getThrowable());
        }
        if (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) {
            return new com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error.Unknown(((com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) sseError).getThrowable());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
