package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0016\u0010\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMetricsTracker;", "", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "error", "", "logSessionCreateFailed", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "", "sessionId", "logSessionCloseFailed", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "input", "setInput", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "response", "trackSseResponse", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;)V", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "onError", "(Ljava/lang/String;Lcom/paypal/oslo/core/network/sse/domain/error/SseError;)V", "logStreamCompletionAndReset", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ChatMetricsTracker {
    void logSessionCloseFailed(java.lang.String sessionId, com.paypal.oslo.core.network.http.error.NetworkError error);

    void logSessionCreateFailed(com.paypal.oslo.core.network.http.error.NetworkError error);

    void logStreamCompletionAndReset(java.lang.String sessionId);

    void onError(java.lang.String sessionId, com.paypal.oslo.core.network.sse.domain.error.SseError error);

    void setInput(com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput input);

    void trackSseResponse(com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse response);
}
