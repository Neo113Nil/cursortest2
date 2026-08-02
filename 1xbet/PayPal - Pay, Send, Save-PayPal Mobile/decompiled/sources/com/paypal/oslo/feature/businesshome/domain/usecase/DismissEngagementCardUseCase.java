package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/DismissEngagementCardUseCase;", "", "Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;)V", "", "cardId", "", "dismissedAtMillis", "", "invoke", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DismissEngagementCardUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DismissEngagementCardUseCase(com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository engagementCardDismissalRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engagementCardDismissalRepository, "");
        this.getHighSpeedVideoFpsRangesFor = engagementCardDismissalRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase dismissEngagementCardUseCase, java.lang.String str, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return dismissEngagementCardUseCase.invoke(str, j, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object dismissCard = this.getHighSpeedVideoFpsRangesFor.dismissCard(str, j, continuation);
        return dismissCard == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? dismissCard : kotlin.Unit.INSTANCE;
    }
}
