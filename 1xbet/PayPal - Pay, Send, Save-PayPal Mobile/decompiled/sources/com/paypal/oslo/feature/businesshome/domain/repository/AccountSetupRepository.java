package com.paypal.oslo.feature.businesshome.domain.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fH¦@¢\u0006\u0004\b\u0011\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\fH¦@¢\u0006\u0004\b\u0012\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupError;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "getAccountSetupStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;", "type", "", "completeStep", "(Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPayGetPaidVerificationComplete", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "setPayGetPaidVerificationComplete", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAccountSetupComplete", "setAccountSetupComplete"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AccountSetupRepository {
    java.lang.Object completeStep(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getAccountSetupStatus(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupError, com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus>> continuation);

    java.lang.Object isAccountSetupComplete(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object isPayGetPaidVerificationComplete(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object setAccountSetupComplete(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object setPayGetPaidVerificationComplete(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
