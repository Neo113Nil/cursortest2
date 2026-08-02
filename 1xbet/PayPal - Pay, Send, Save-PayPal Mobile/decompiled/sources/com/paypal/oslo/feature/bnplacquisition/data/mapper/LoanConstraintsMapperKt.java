package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/BNPLCreditProductIdentifier;", "toBNPLCreditProductIdentifier", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplApplicationConstraintsQuery$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanConstraints;", "toLoanConstraints", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplApplicationConstraintsQuery$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanConstraints;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LoanConstraintsMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier toBNPLCreditProductIdentifier(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier) obj).name(), creditProductIdentifier.name())) {
                break;
            }
        }
        return (com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier) obj;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints toLoanConstraints(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplApplicationConstraintsQuery.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplApplicationConstraintsQuery.BnplLoanConstraints bnplLoanConstraints;
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplApplicationConstraintsQuery.SpendingPower spendingPower;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money;
        com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower2 = null;
        if (data == null || (bnplLoanConstraints = data.getBnplLoanConstraints()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplApplicationConstraintsQuery.LoanAmountConstraints loanAmountConstraints = bnplLoanConstraints.getLoanAmountConstraints();
        com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints(com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(loanAmountConstraints.getMaxAmount().getBnplAcquisitionMoneyFragment()), com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(loanAmountConstraints.getMinAmount().getBnplAcquisitionMoneyFragment()));
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplApplicationConstraintsQuery.BnplPrequalificationSummary bnplPrequalificationSummary = data.getBnplPrequalificationSummary();
        if (bnplPrequalificationSummary != null && (spendingPower = bnplPrequalificationSummary.getSpendingPower()) != null && (bnplAcquisitionMoneyFragment = spendingPower.getBnplAcquisitionMoneyFragment()) != null && (money = com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplAcquisitionMoneyFragment)) != null) {
            spendingPower2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower(money);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints(loanAmountConstraints2, spendingPower2);
    }
}
