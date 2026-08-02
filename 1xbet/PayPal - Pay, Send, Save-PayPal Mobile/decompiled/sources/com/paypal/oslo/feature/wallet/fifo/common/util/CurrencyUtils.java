package com.paypal.oslo.feature.wallet.fifo.common.util;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/util/CurrencyUtils;", "", "<init>", "()V", "", "currencyCode", "getCurrencySymbol$wallet_prodRelease", "(Ljava/lang/String;)Ljava/lang/String;", "amountInput", "", "parseLocalizedAmount$wallet_prodRelease", "(Ljava/lang/String;)Ljava/lang/Double;", "", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CurrencyBalance;", "availableCurrencies", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/CurrencySelectorConfig;", "", "createCurrencySelectorConfig$wallet_prodRelease", "(Ljava/util/List;)Lkotlin/Pair;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CurrencyUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils INSTANCE = new com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils();

    private CurrencyUtils() {
    }

    public final java.lang.String getCurrencySymbol$wallet_prodRelease(java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        try {
            java.lang.String symbol = java.util.Currency.getInstance(currencyCode).getSymbol();
            kotlin.jvm.internal.Intrinsics.checkNotNull(symbol);
            return symbol;
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException unused) {
            return currencyCode;
        }
    }

    public final java.lang.Double parseLocalizedAmount$wallet_prodRelease(java.lang.String amountInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInput, "");
        return kotlin.text.StringsKt.toDoubleOrNull(kotlin.text.StringsKt.replace$default(amountInput, java.text.DecimalFormatSymbols.getInstance(java.util.Locale.getDefault()).getDecimalSeparator(), com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ee, code lost:
    
        if (r5 != null) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig, java.lang.Boolean> createCurrencySelectorConfig$wallet_prodRelease(java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> availableCurrencies) {
        java.lang.Object obj;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableCurrencies, "");
        java.util.List<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> list = availableCurrencies;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance currencyBalance = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance) obj2;
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(currencyBalance.getAvailableAmount().getValue());
            if ((doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) > 0.0d || currencyBalance.isPrimary()) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance currencyBalance2 : arrayList2) {
            java.lang.String currencyCode = currencyBalance2.getAvailableAmount().getCurrencyCode();
            java.lang.Double doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(currencyBalance2.getAvailableAmount().getValue());
            arrayList3.add(new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency(currencyCode, doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d, kotlin.text.StringsKt.take(currencyBalance2.getAvailableAmount().getCurrencyCode(), 2), currencyBalance2.getId()));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.lang.Object obj3 = null;
        if (arrayList4.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list) {
            if (((com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance) obj4).isPrimary()) {
                arrayList5.add(obj4);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10)), 16));
        for (java.lang.Object obj5 : arrayList6) {
            linkedHashMap.put(((com.paypal.oslo.feature.wallet.fifo.common.domain.model.CurrencyBalance) obj5).getAvailableAmount().getCurrencyCode(), obj5);
        }
        java.util.ArrayList arrayList7 = arrayList4;
        java.util.Iterator it = arrayList7.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (linkedHashMap.containsKey(((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj).getCurrency())) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency2 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj;
        boolean z = false;
        if (arrayList4.size() >= 3 && selectedCurrency2 != null && selectedCurrency2.getAvailableBalance() <= 0.0d && !arrayList7.isEmpty()) {
            java.util.Iterator it2 = arrayList7.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) it2.next()).getAvailableBalance() > 0.0d && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
            if (i >= 2) {
                z = true;
            }
        }
        if (arrayList4.size() != 2) {
            if (z) {
                java.util.Iterator it3 = arrayList7.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it3.next();
                    if (((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) next).getAvailableBalance() > 0.0d) {
                        obj3 = next;
                        break;
                    }
                }
                selectedCurrency2 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj3;
                if (selectedCurrency2 == null) {
                    selectedCurrency2 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4);
                }
            } else if (selectedCurrency2 != null && selectedCurrency2.getAvailableBalance() <= 0.0d) {
                java.util.Iterator it4 = arrayList7.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it4.next();
                    if (((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) next2).getAvailableBalance() > 0.0d) {
                        obj3 = next2;
                        break;
                    }
                }
                selectedCurrency = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj3;
            } else if (selectedCurrency2 == null) {
                selectedCurrency2 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4);
            }
            return kotlin.TuplesKt.to(new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig(arrayList4, selectedCurrency2), java.lang.Boolean.valueOf(z));
        }
        java.util.Iterator it5 = arrayList7.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            java.lang.Object next3 = it5.next();
            if (!kotlin.jvm.internal.Intrinsics.areEqual((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) next3, selectedCurrency2)) {
                obj3 = next3;
                break;
            }
        }
        selectedCurrency = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj3;
        if (selectedCurrency2 == null || selectedCurrency == null || selectedCurrency2.getAvailableBalance() > 0.0d || selectedCurrency.getAvailableBalance() <= 0.0d) {
            if (selectedCurrency2 == null) {
                selectedCurrency2 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4);
            }
            return kotlin.TuplesKt.to(new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig(arrayList4, selectedCurrency2), java.lang.Boolean.valueOf(z));
        }
        selectedCurrency2 = selectedCurrency;
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig(arrayList4, selectedCurrency2), java.lang.Boolean.valueOf(z));
    }
}
