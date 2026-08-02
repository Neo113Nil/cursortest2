package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/ShouldShowEngagementCardUseCase;", "", "Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;)V", "", "cardId", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShouldShowEngagementCardUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ShouldShowEngagementCardUseCase(com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository engagementCardDismissalRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engagementCardDismissalRepository, "");
        this.getHighSpeedVideoFpsRanges = engagementCardDismissalRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase$invoke$1 shouldShowEngagementCardUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo cardDismissalInfo;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase$invoke$1) {
            shouldShowEngagementCardUseCase$invoke$1 = (com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase$invoke$1) continuation;
            if ((shouldShowEngagementCardUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                shouldShowEngagementCardUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = shouldShowEngagementCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = shouldShowEngagementCardUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository engagementCardDismissalRepository = this.getHighSpeedVideoFpsRanges;
                    shouldShowEngagementCardUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    shouldShowEngagementCardUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = engagementCardDismissalRepository.getDismissalInfo(str, shouldShowEngagementCardUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardDismissalInfo = (com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo) obj;
                if (cardDismissalInfo != null) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo.shouldShowAgain$default(cardDismissalInfo, 0L, 1, null));
            }
        }
        shouldShowEngagementCardUseCase$invoke$1 = new com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = shouldShowEngagementCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = shouldShowEngagementCardUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        cardDismissalInfo = (com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo) obj2;
        if (cardDismissalInfo != null) {
        }
    }
}
