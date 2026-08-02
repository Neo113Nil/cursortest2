package com.paypal.oslo.feature.settings.closeaccount.domain.repository;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00140\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountEligibilityResult;", "checkCloseAccountEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "reason", "", "skipNotification", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountResult;", "closeAccount", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;", "activityLog", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$CreateAccountActivityLog;", "createAccountActivityLog", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/AccountActivityLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserProfile;", "getUserProfileForCloseAccount", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CloseAccountRepository {
    java.lang.Object checkCloseAccountEligibility(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult>> continuation);

    java.lang.Object closeAccount(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountResult>> continuation);

    java.lang.Object createAccountActivityLog(com.paypal.oslo.feature.settings.closeaccount.domain.model.AccountActivityLog accountActivityLog, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog>> continuation);

    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile>> getUserProfileForCloseAccount();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object closeAccount$default(com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeAccount");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return closeAccountRepository.closeAccount(str, z, continuation);
    }
}
