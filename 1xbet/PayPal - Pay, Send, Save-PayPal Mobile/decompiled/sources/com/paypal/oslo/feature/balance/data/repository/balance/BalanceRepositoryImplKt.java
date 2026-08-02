package com.paypal.oslo.feature.balance.data.repository.balance;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;", "Lcom/paypal/oslo/feature/balance/domain/model/Balance;", "toBalance", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Balances;)Lcom/paypal/oslo/feature/balance/domain/model/Balance;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$TotalAvailableAmount;)Lcom/paypal/oslo/feature/balance/domain/model/Money;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceRepositoryImplKt {
    public static final com.paypal.oslo.feature.balance.domain.model.Balance toBalance(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances) {
        com.paypal.oslo.feature.balance.domain.model.Money money;
        com.paypal.oslo.feature.balance.domain.model.Money money2;
        com.paypal.oslo.feature.balance.domain.model.Money money3;
        com.paypal.oslo.feature.balance.domain.model.HoldType holdType;
        com.paypal.oslo.feature.balance.domain.model.Money money4;
        java.util.Iterator it;
        com.paypal.oslo.feature.balance.domain.model.Money money5;
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Amount2 amount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
        java.lang.String obj = balances.getTotalAvailableAmount().getCurrencyCode().toString();
        com.paypal.oslo.feature.balance.domain.model.Money highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(balances.getTotalAvailableAmount());
        com.paypal.oslo.feature.balance.domain.model.Money highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(balances.getTotalAvailableAmount());
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalPendingAmount totalPendingAmount = balances.getTotalPendingAmount();
        if (totalPendingAmount != null) {
            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(totalPendingAmount.getValue());
            if (bigDecimalOrNull == null) {
                bigDecimalOrNull = java.math.BigDecimal.ZERO;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
            money = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(totalPendingAmount.getCurrencyCode().toString()), null);
        } else {
            money = null;
        }
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalReservedAmount totalReservedAmount = balances.getTotalReservedAmount();
        java.math.BigDecimal bigDecimalOrNull2 = kotlin.text.StringsKt.toBigDecimalOrNull(totalReservedAmount.getValue());
        if (bigDecimalOrNull2 == null) {
            bigDecimalOrNull2 = java.math.BigDecimal.ZERO;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull2);
        com.paypal.oslo.feature.balance.domain.model.Money money6 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull2, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(totalReservedAmount.getCurrencyCode().toString()), null);
        java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> items = balances.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item item = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item) it2.next();
            java.lang.String obj2 = item.getAvailableAmount().getCurrencyCode().toString();
            boolean isBalanceAccountPrimary = item.isBalanceAccountPrimary();
            java.lang.String id = item.getId();
            java.math.BigDecimal bigDecimalOrNull3 = kotlin.text.StringsKt.toBigDecimalOrNull(item.getAvailableAmount().getValue());
            if (bigDecimalOrNull3 == null) {
                bigDecimalOrNull3 = java.math.BigDecimal.ZERO;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull3);
            com.paypal.oslo.feature.balance.domain.model.Money money7 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull3, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(obj2), null);
            java.math.BigDecimal bigDecimalOrNull4 = kotlin.text.StringsKt.toBigDecimalOrNull(item.getAvailableAmount().getValue());
            if (bigDecimalOrNull4 == null) {
                bigDecimalOrNull4 = java.math.BigDecimal.ZERO;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull4);
            com.paypal.oslo.feature.balance.domain.model.Money money8 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull4, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(obj2), null);
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.PrimaryCurrencyAmount primaryCurrencyAmount = item.getAvailable().getPrimaryCurrencyAmount();
            if (primaryCurrencyAmount != null) {
                java.math.BigDecimal bigDecimalOrNull5 = kotlin.text.StringsKt.toBigDecimalOrNull(primaryCurrencyAmount.getValue());
                if (bigDecimalOrNull5 == null) {
                    bigDecimalOrNull5 = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull5);
                money4 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull5, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(primaryCurrencyAmount.getCurrencyCode().toString()), null);
            } else {
                money4 = null;
            }
            java.math.BigDecimal bigDecimalOrNull6 = kotlin.text.StringsKt.toBigDecimalOrNull(item.getReserved().getAmount().getValue());
            if (bigDecimalOrNull6 == null) {
                bigDecimalOrNull6 = java.math.BigDecimal.ZERO;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull6);
            com.paypal.oslo.feature.balance.domain.model.Money money9 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull6, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(item.getReserved().getAmount().getCurrencyCode().toString()), null);
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Pending pending = item.getPending();
            if (pending == null || (amount = pending.getAmount()) == null) {
                it = it2;
                money5 = null;
            } else {
                java.math.BigDecimal bigDecimalOrNull7 = kotlin.text.StringsKt.toBigDecimalOrNull(amount.getValue());
                if (bigDecimalOrNull7 == null) {
                    bigDecimalOrNull7 = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull7);
                it = it2;
                money5 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull7, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(amount.getCurrencyCode().toString()), null);
            }
            java.lang.String exchangeRate = item.getAvailable().getExchangeRate();
            java.lang.Double doubleOrNull = exchangeRate != null ? kotlin.text.StringsKt.toDoubleOrNull(exchangeRate) : null;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes = item.getAvailable().getSubBalanceTypes();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subBalanceTypes, 10));
            java.util.Iterator<T> it3 = subBalanceTypes.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((com.paypal.oslo.api.graphql.schema.type.SubBalanceType) it3.next()).name());
            }
            arrayList.add(new com.paypal.oslo.feature.balance.domain.model.CurrencyBalance(id, money7, money8, isBalanceAccountPrimary, money4, money9, money5, doubleOrNull, arrayList2));
            it2 = it;
        }
        java.util.ArrayList arrayList3 = arrayList;
        java.time.ZonedDateTime now = java.time.ZonedDateTime.now();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
        java.util.List<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> items2 = balances.getItems();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : items2) {
            com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item item2 = (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item) obj3;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes2 = item2.getReserved().getSubBalanceTypes();
            boolean z = false;
            if (!(subBalanceTypes2 instanceof java.util.Collection) || !subBalanceTypes2.isEmpty()) {
                java.util.Iterator<T> it4 = subBalanceTypes2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((com.paypal.oslo.api.graphql.schema.type.SubBalanceType) it4.next()) == com.paypal.oslo.api.graphql.schema.type.SubBalanceType.PROGRESSIVE_KYC_HOLD) {
                        z = true;
                        break;
                    }
                }
            }
            java.math.BigDecimal bigDecimalOrNull8 = kotlin.text.StringsKt.toBigDecimalOrNull(item2.getReserved().getAmount().getValue());
            if (bigDecimalOrNull8 == null) {
                bigDecimalOrNull8 = java.math.BigDecimal.ZERO;
            }
            if (bigDecimalOrNull8.compareTo(java.math.BigDecimal.ZERO) > 0 && !z) {
                arrayList4.add(obj3);
            }
        }
        java.util.ArrayList<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item> arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Item item3 : arrayList5) {
            java.lang.String id2 = item3.getId();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> subBalanceTypes3 = item3.getReserved().getSubBalanceTypes();
            if (!(subBalanceTypes3 instanceof java.util.Collection) || !subBalanceTypes3.isEmpty()) {
                java.util.Iterator<T> it5 = subBalanceTypes3.iterator();
                while (it5.hasNext()) {
                    if (((com.paypal.oslo.api.graphql.schema.type.SubBalanceType) it5.next()) == com.paypal.oslo.api.graphql.schema.type.SubBalanceType.TAX_HOLD) {
                        holdType = com.paypal.oslo.feature.balance.domain.model.HoldType.TAX;
                        break;
                    }
                }
            }
            holdType = com.paypal.oslo.feature.balance.domain.model.HoldType.MONEY;
            arrayList6.add(new com.paypal.oslo.feature.balance.domain.model.Hold(id2, holdType, new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(item3.getReserved().getAmount().getValue()), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(item3.getReserved().getAmount().getCurrencyCode().toString()), null), "", null));
        }
        java.util.ArrayList arrayList7 = arrayList6;
        java.lang.Boolean prepaidStatus = balances.getPrepaidStatus();
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(balances.getHasTaxOnHold(), java.lang.Boolean.TRUE);
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TaxOnHoldAmount taxOnHoldAmount = balances.getTaxOnHoldAmount();
        if (taxOnHoldAmount != null) {
            java.math.BigDecimal bigDecimalOrNull9 = kotlin.text.StringsKt.toBigDecimalOrNull(taxOnHoldAmount.getValue());
            if (bigDecimalOrNull9 == null) {
                bigDecimalOrNull9 = java.math.BigDecimal.ZERO;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull9);
            money2 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull9, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(taxOnHoldAmount.getCurrencyCode().toString()), null);
        } else {
            money2 = null;
        }
        boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(balances.getHasMoneyOnHold(), java.lang.Boolean.TRUE);
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.MoneyOnHoldAmount moneyOnHoldAmount = balances.getMoneyOnHoldAmount();
        if (moneyOnHoldAmount != null) {
            java.math.BigDecimal bigDecimalOrNull10 = kotlin.text.StringsKt.toBigDecimalOrNull(moneyOnHoldAmount.getValue());
            if (bigDecimalOrNull10 == null) {
                bigDecimalOrNull10 = java.math.BigDecimal.ZERO;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull10);
            money3 = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull10, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(moneyOnHoldAmount.getCurrencyCode().toString()), null);
        } else {
            money3 = null;
        }
        return new com.paypal.oslo.feature.balance.domain.model.Balance(highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, money, money6, obj, arrayList7, arrayList3, now, prepaidStatus, areEqual2, money3, areEqual, money2);
    }

    private static final com.paypal.oslo.feature.balance.domain.model.Money getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.TotalAvailableAmount totalAvailableAmount) {
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(totalAvailableAmount.getValue());
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = java.math.BigDecimal.ZERO;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
        return new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(totalAvailableAmount.getCurrencyCode().toString()), null);
    }
}
