package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CloseChatUseCase;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "chatRepository", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;)V", "", "chatId", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/CloseChatReason;", "reason", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/CloseChatReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseChatUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CloseChatUseCase(com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository chatRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = chatRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, java.lang.Boolean>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.close(str, closeChatReason, continuation);
    }
}
