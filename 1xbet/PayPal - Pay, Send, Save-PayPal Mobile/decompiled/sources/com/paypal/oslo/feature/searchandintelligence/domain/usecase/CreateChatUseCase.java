package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/CreateChatUseCase;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "chatRepository", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/ChatRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreateChatUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CreateChatUseCase(com.paypal.oslo.feature.searchandintelligence.domain.repository.ChatRepository chatRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatRepository, "");
        this.getHighSpeedVideoFpsRangesFor = chatRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, java.lang.String>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.create(continuation);
    }
}
