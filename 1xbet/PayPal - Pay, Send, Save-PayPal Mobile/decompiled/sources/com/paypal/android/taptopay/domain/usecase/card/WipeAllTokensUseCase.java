package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/card/WipeAllTokensUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WipeAllTokensUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public WipeAllTokensUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighSpeedVideoSizes = cardRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running WipeAllTokensUseCase", null, null, 6, null);
        java.lang.Object wipeAllTokens = this.getHighSpeedVideoSizes.wipeAllTokens(continuation);
        return wipeAllTokens == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wipeAllTokens : kotlin.Unit.INSTANCE;
    }
}
