package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/SubscribeToChatUseCase;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "chatRepository", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;)V", "", "sessionId", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "input", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/SseResponse;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SubscribeToChatUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SubscribeToChatUseCase(com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository chatRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = chatRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.sse.domain.error.SseError, com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse>> invoke(java.lang.String sessionId, com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.subscribe(sessionId, input);
    }
}
