package com.paypal.oslo.feature.smartroute.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Data;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupDetails;", "toAutoReloadSetupDetails", "(Lcom/paypal/oslo/feature/smartroute/graphql/GetSmartRouteSavingsAutoReloadSetupDetailsQuery$Data;)Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoReloadMapperKt {
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails toAutoReloadSetupDetails(com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data data) {
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.TotalBalance totalBalance;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item item = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data.getBalances().getItems());
        java.math.BigDecimal bigDecimal = null;
        java.lang.String id = item != null ? item.getId() : null;
        java.util.List<com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount> savingsAccounts = data.getSavingsAccounts();
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount savingsAccount = savingsAccounts != null ? (com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.SavingsAccount) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) savingsAccounts) : null;
        java.lang.String moneyboxId = savingsAccount != null ? savingsAccount.getMoneyboxId() : null;
        if (savingsAccount != null && (totalBalance = savingsAccount.getTotalBalance()) != null && (value = totalBalance.getValue()) != null) {
            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(value);
            if (bigDecimalOrNull == null) {
                bigDecimalOrNull = java.math.BigDecimal.ZERO;
            }
            bigDecimal = bigDecimalOrNull;
        }
        return new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails(id, moneyboxId, bigDecimal);
    }
}
