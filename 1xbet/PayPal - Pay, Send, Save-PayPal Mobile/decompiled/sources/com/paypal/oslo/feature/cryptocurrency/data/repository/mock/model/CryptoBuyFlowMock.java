package com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u0003R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/model/CryptoBuyFlowMock;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", "amount", "currencyCode", "", "isLoyaltyForCryptoEnabled", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingOption;", "getMockFundingOptions", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "fiatCurrencyCode", "quoteFiatAmount", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "getMockQuote", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "quote", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeExecution;", "getMockTradeExecution", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeExecution;", "getLastQuote", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "", "storeQuote", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;)V", "clearQuote", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoBuyFlowMock {
    private static com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock INSTANCE = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock();
    public static final int $stable = 8;

    private CryptoBuyFlowMock() {
    }

    public static /* synthetic */ java.util.List getMockFundingOptions$default(com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock cryptoBuyFlowMock, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return cryptoBuyFlowMock.getMockFundingOptions(cryptoTradeAction, str, str2, z);
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption> getMockFundingOptions(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction action, java.lang.String amount, java.lang.String currencyCode, boolean isLoyaltyForCryptoEnabled) {
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance balance;
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(amount, currencyCode);
        if (isLoyaltyForCryptoEnabled) {
            balance = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card("mock-ppdc-001", "mock-funding-option-ppdc", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata("CARD", null, new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt("https://www.paypalobjects.com/ucs/card/ppdc/us/cons-debit-card-small.png", "https://www.paypalobjects.com/ucs/card/ppdc/us/cons-debit-card-large.png")), "5678", "DEBIT", "Visa", currencyCode, new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money("12567.00", currencyCode), new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.DISPLAY_PRODUCT_NAME));
        } else {
            balance = new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance("mock-balance-001", "mock-funding-option-001", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata("PayPal Balance", "PayPal", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(null, null)), new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money("1500.00", currencyCode));
        }
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(balance);
        if (action == com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.BUY) {
            list = mutableListOf;
            list.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource[]{new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank("mock-bank-001", "mock-funding-option-002", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata("Bank Account", "Chase", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(null, null)), "1234"), new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card("mock-card-001", "mock-funding-option-003", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata("Debit Card", "Visa", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(null, null)), "5678", "DEBIT", "Visa", currencyCode, null, null, 384, null)}));
        } else {
            list = mutableListOf;
        }
        if (action == com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.SELL) {
            list.add(new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto("mock-crypto-001", "mock-funding-option-004", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentMetadata("Crypto Wallet", "MockCrypto", new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt(null, null)), new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(com.visa.cbp.getEncExpo.IPostMessageService, "USD"), "PYUSD", "800"));
        }
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption("mock-funding-option-001", money, list));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote getMockQuote(java.lang.String action, java.lang.String assetSymbol, java.lang.String fiatCurrencyCode, java.lang.String quoteFiatAmount) {
        double d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quoteFiatAmount, "");
        java.lang.String concat = "mock-quote-".concat(java.lang.String.valueOf(java.util.UUID.randomUUID()));
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = assetSymbol.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        switch (upperCase.hashCode()) {
            case 65575:
                if (upperCase.equals("BCH")) {
                    d = 485.0d;
                    break;
                }
                d = 100.0d;
                break;
            case 66097:
                if (upperCase.equals("BTC")) {
                    d = 97500.0d;
                    break;
                }
                d = 100.0d;
                break;
            case 68985:
                if (upperCase.equals("ETH")) {
                    d = 3450.0d;
                    break;
                }
                d = 100.0d;
                break;
            case 75707:
                if (upperCase.equals("LTC")) {
                    d = 105.0d;
                    break;
                }
                d = 100.0d;
                break;
            case 82288:
                if (upperCase.equals("SOL")) {
                    d = 195.0d;
                    break;
                }
                d = 100.0d;
                break;
            case 2336762:
                if (upperCase.equals("LINK")) {
                    d = 22.5d;
                    break;
                }
                d = 100.0d;
                break;
            case 76617405:
                if (upperCase.equals("PYUSD")) {
                    d = 1.0d;
                    break;
                }
                d = 100.0d;
                break;
            default:
                d = 100.0d;
                break;
        }
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(quoteFiatAmount);
        double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 100.0d;
        double d2 = 0.015d * doubleValue;
        double d3 = doubleValue - d2;
        double d4 = d3 / d;
        com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money money = new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(java.lang.String.valueOf(d), fiatCurrencyCode);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "%.8f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d4)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote(concat, assetSymbol, action, money, new com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity(assetSymbol, format), new com.paypal.oslo.feature.cryptocurrency.domain.model.quote.TradeAmountBreakdown(new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(java.lang.String.valueOf(d3), fiatCurrencyCode), new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(quoteFiatAmount, fiatCurrencyCode), new com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money(java.lang.String.valueOf(d2), fiatCurrencyCode)));
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution getMockTradeExecution(java.lang.String action, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote quote) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quote, "");
        java.lang.String concat = "mock-trade-".concat(java.lang.String.valueOf(java.util.UUID.randomUUID()));
        java.lang.String concat2 = "mock-payment-".concat(java.lang.String.valueOf(java.util.UUID.randomUUID()));
        java.lang.String instant = java.time.Instant.now().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(instant, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution(concat, "COMPLETED", null, quote.getTradeAmountBreakdown().getTotalAmount(), quote.getQuoteQuantity(), concat2, instant, instant, action);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote getLastQuote() {
        return getHighSpeedVideoFpsRanges;
    }

    public final void storeQuote(com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote quote) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quote, "");
        getHighSpeedVideoFpsRanges = quote;
    }

    public final void clearQuote() {
        getHighSpeedVideoFpsRanges = null;
    }
}
