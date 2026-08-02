package com.paypal.oslo.feature.wallet.fifo.common.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;", "toGetAccountBalancesError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetAccountBalancesError;", "Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Data;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;", "toAccountBalances", "(Lcom/paypal/oslo/feature/wallet/graphql/GetAccountBalancesQuery$Data;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AccountBalancesMapperKt {
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError toGetAccountBalancesError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError.Network.NetworkFailure.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError.Business.MissingData.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult toAccountBalances(com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Data data) {
        java.lang.Object obj;
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount2 amount;
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Available available;
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount2;
        java.lang.Object currencyCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", data.getBalances().getTotalAvailableAmount().getCurrencyCode().toString()), kotlin.TuplesKt.to("itemCount", java.lang.Integer.valueOf(data.getBalances().getItems().size())));
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("totalAvailableAmount", data.getBalances().getTotalAvailableAmount().getValue()));
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Balances balances = data.getBalances();
        java.util.Iterator<T> it = balances.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item) obj).isBalanceAccountPrimary()) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item item = (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item) obj;
        java.lang.String obj2 = (item == null || (available = item.getAvailable()) == null || (amount2 = available.getAmount()) == null || (currencyCode = amount2.getCurrencyCode()) == null) ? null : currencyCode.toString();
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount = balances.getTotalAvailableAmount();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalAvailableAmount.getCurrencyCode().toString(), totalAvailableAmount.getValue());
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalAvailableAmount totalAvailableAmount2 = balances.getTotalAvailableAmount();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalAvailableAmount2.getCurrencyCode().toString(), totalAvailableAmount2.getValue());
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalPendingAmount totalPendingAmount = balances.getTotalPendingAmount();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = totalPendingAmount != null ? new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalPendingAmount.getCurrencyCode().toString(), totalPendingAmount.getValue()) : null;
        com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.TotalReservedAmount totalReservedAmount = balances.getTotalReservedAmount();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money4 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalReservedAmount.getCurrencyCode().toString(), totalReservedAmount.getValue());
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item> items = balances.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        for (com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Item item2 : items) {
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount amount3 = item2.getAvailable().getAmount();
            com.paypal.oslo.feature.wallet.common.domain.model.Money money5 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(amount3.getCurrencyCode().toString(), amount3.getValue());
            java.lang.String id = item2.getId();
            boolean isBalanceAccountPrimary = item2.isBalanceAccountPrimary();
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = item2.getAvailable().getPrimaryCurrencyAmount();
            com.paypal.oslo.feature.wallet.common.domain.model.Money money6 = primaryCurrencyAmount != null ? new com.paypal.oslo.feature.wallet.common.domain.model.Money(primaryCurrencyAmount.getCurrencyCode().toString(), primaryCurrencyAmount.getValue()) : null;
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Amount1 amount4 = item2.getReserved().getAmount();
            com.paypal.oslo.feature.wallet.common.domain.model.Money money7 = new com.paypal.oslo.feature.wallet.common.domain.model.Money(amount4.getCurrencyCode().toString(), amount4.getValue());
            com.paypal.oslo.feature.wallet.graphql.GetAccountBalancesQuery.Pending pending = item2.getPending();
            com.paypal.oslo.feature.wallet.common.domain.model.Money money8 = (pending == null || (amount = pending.getAmount()) == null) ? null : new com.paypal.oslo.feature.wallet.common.domain.model.Money(amount.getCurrencyCode().toString(), amount.getValue());
            java.lang.String exchangeRate = item2.getAvailable().getExchangeRate();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes = item2.getAvailable().getSubBalanceTypes();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subBalanceTypes, 10));
            java.util.Iterator<T> it2 = subBalanceTypes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((com.paypal.oslo.api.graphql.schema.type.SubBalanceType) it2.next()).name());
            }
            arrayList.add(new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance(id, money5, money5, isBalanceAccountPrimary, money6, money7, money8, exchangeRate, arrayList2));
        }
        java.time.ZonedDateTime now = java.time.ZonedDateTime.now();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult(money, money2, money3, money4, obj2, arrayList, now);
    }
}
