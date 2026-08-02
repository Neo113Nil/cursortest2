package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$SavingsAccount;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/SavingsAccount;", "toSavingsAccount", "(Lcom/paypal/oslo/feature/balance/graphql/FetchSavingsAccountsQuery$SavingsAccount;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/SavingsAccount;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SavingsAccountMapperKt {
    public static final com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount toSavingsAccount(com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.SavingsAccount savingsAccount) {
        java.math.BigDecimal bigDecimal;
        java.lang.String str;
        java.lang.Object currencyCode;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccount, "");
        com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.Moneybox moneybox = savingsAccount.getMoneybox();
        if (moneybox == null) {
            return null;
        }
        java.lang.String id = savingsAccount.getId();
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus = savingsAccount.getAccountStatus();
        java.lang.String moneyboxId = savingsAccount.getMoneyboxId();
        java.lang.String id2 = moneybox.getId();
        java.lang.String name2 = moneybox.getName();
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(moneybox.getCurrentBalance().getValue());
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = java.math.BigDecimal.ZERO;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
        com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox moneybox2 = new com.paypal.oslo.feature.balance.domain.model.autoreload.Moneybox(id2, name2, new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(moneybox.getCurrentBalance().getCurrencyCode().toString()), null));
        com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance = savingsAccount.getTotalBalance();
        if (totalBalance == null || (value = totalBalance.getValue()) == null || (bigDecimal = kotlin.text.StringsKt.toBigDecimalOrNull(value)) == null) {
            bigDecimal = java.math.BigDecimal.ZERO;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
        com.paypal.oslo.feature.balance.graphql.FetchSavingsAccountsQuery.TotalBalance totalBalance2 = savingsAccount.getTotalBalance();
        if (totalBalance2 == null || (currencyCode = totalBalance2.getCurrencyCode()) == null || (str = currencyCode.toString()) == null) {
            str = "USD";
        }
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount(id, accountStatus, moneyboxId, moneybox2, new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimal, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str), null));
    }
}
