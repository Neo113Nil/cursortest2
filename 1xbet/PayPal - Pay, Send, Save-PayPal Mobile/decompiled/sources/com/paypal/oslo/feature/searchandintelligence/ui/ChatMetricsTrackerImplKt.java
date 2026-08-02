package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatMetricsTrackerImplKt {
    public static final /* synthetic */ boolean access$isClientNetworkIssue(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        return networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet;
    }

    public static final /* synthetic */ boolean access$isClientNetworkIssue(com.paypal.oslo.core.network.sse.domain.error.SseError sseError) {
        return (sseError instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) && (((com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) sseError).getError() instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet);
    }

    public static final /* synthetic */ java.lang.String access$toInputType(com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput) {
        if (chatInput instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text) {
            return "TEXT";
        }
        if (chatInput instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action) {
            return "ACTION";
        }
        if (chatInput != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "UNKNOWN";
    }

    public static final /* synthetic */ java.lang.String access$toMessageDetails(com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput chatInput) {
        if (chatInput instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text) {
            return kotlin.text.StringsKt.take(((com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text) chatInput).getText(), 50);
        }
        if (chatInput instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action) {
            return kotlin.text.StringsKt.take("action_info=".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action) chatInput).getActionContent().getActionInfo())), 200);
        }
        if (chatInput == null) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
