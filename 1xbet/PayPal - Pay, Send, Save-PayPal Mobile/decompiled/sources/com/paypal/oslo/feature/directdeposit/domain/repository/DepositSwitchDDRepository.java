package com.paypal.oslo.feature.directdeposit.domain.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/repository/DepositSwitchDDRepository;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "getPublicToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "directDepositIntegrationId", "bankAccountNumber", "routingNumber", "", "linkAccountToPayrollProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DepositSwitchDDRepository {
    java.lang.Object getPublicToken(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String>> continuation);

    java.lang.Object linkAccountToPayrollProvider(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.Boolean>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object linkAccountToPayrollProvider$default(com.paypal.oslo.feature.directdeposit.domain.repository.DepositSwitchDDRepository depositSwitchDDRepository, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkAccountToPayrollProvider");
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return depositSwitchDDRepository.linkAccountToPayrollProvider(str, str2, str3, continuation);
    }
}
