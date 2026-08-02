package com.paypal.oslo.feature.wallet.banks.domain.repository.addbankmanual;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/repository/addbankmanual/BankDefinitionsRepository;", "", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinitionsError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinitionsResult;", "getBankDefinitions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BankDefinitionsRepository {
    java.lang.Object getBankDefinitions(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsResult>> continuation);
}
