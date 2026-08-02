package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountUserProfileUseCase;", "", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;)V", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserProfile;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetCloseAccountUserProfileUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetCloseAccountUserProfileUseCase(com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = closeAccountRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile> continuation) {
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase$invoke$1 getCloseAccountUserProfileUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase$invoke$1) {
            getCloseAccountUserProfileUseCase$invoke$1 = (com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase$invoke$1) continuation;
            if ((getCloseAccountUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getCloseAccountUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getCloseAccountUserProfileUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCloseAccountUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow filterNotNull = kotlinx.coroutines.flow.FlowKt.filterNotNull(this.getHighResolutionOutputSizeshNQ4ISI.getUserProfileForCloseAccount());
                    getCloseAccountUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(filterNotNull, getCloseAccountUserProfileUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((arrow.core.Either) obj).getOrNull();
            }
        }
        getCloseAccountUserProfileUseCase$invoke$1 = new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCloseAccountUserProfileUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCloseAccountUserProfileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return ((arrow.core.Either) obj2).getOrNull();
    }
}
