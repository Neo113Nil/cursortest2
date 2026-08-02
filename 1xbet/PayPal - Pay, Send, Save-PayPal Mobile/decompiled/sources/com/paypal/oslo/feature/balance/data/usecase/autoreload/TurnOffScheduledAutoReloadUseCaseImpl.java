package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/autoreload/TurnOffScheduledAutoReloadUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/TurnOffScheduledAutoReloadUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadDisableResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TurnOffScheduledAutoReloadUseCaseImpl implements com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TurnOffScheduledAutoReloadUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadRepository, "");
        this.getHighSpeedVideoFpsRangesFor = autoReloadRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl$invoke$1 turnOffScheduledAutoReloadUseCaseImpl$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl$invoke$1) {
            turnOffScheduledAutoReloadUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl$invoke$1) continuation;
            if ((turnOffScheduledAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                turnOffScheduledAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = turnOffScheduledAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = turnOffScheduledAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType balanceAutoReloadScheduleType = com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_FREQUENCY;
                    turnOffScheduledAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = autoReloadRepository.disableAutoReload(balanceAutoReloadScheduleType, turnOffScheduledAutoReloadUseCaseImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((arrow.core.Either) obj).toIor();
            }
        }
        turnOffScheduledAutoReloadUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = turnOffScheduledAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = turnOffScheduledAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return ((arrow.core.Either) obj2).toIor();
    }
}
