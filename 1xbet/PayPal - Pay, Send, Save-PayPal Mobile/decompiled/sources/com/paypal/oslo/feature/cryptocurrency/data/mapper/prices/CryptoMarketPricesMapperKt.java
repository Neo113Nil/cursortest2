package com.paypal.oslo.feature.cryptocurrency.data.mapper.prices;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0011*\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0012\u001a\u001b\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014*\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "priceTimeRange", "currencyCode", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "toDomainAssetPriceHistory", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "toDomainAssetPriceDetails", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyMarketPricesQuery$CryptocurrencyMarketPrices;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceMovementIndicator;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/type/CryptocurrencyPriceMovementIndicator;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceMovementIndicator;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/type/CryptocurrencyPriceTimeRange;", "toGraphQLType", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPriceTimeRange;", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/lang/Long;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoMarketPricesMapperKt {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyMarketPrices, "");
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> cryptocurrencyMarketPrices2 = cryptocurrencyMarketPrices.getCryptocurrencyMarketPrices();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(cryptocurrencyMarketPrices2, 10));
        java.util.Iterator<T> it = cryptocurrencyMarketPrices2.iterator();
        while (true) {
            arrayList = null;
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator = null;
            if (!it.hasNext()) {
                break;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice cryptocurrencyMarketPrice = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice) it.next();
            java.lang.String assetName = cryptocurrencyMarketPrice.getAssetName();
            java.lang.String str = assetName == null ? "" : assetName;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol = cryptocurrencyMarketPrice.getAssetSymbol();
            java.lang.String rawValue = assetSymbol != null ? assetSymbol.getRawValue() : null;
            java.lang.String str2 = rawValue == null ? "" : rawValue;
            java.lang.String valueOf = java.lang.String.valueOf(cryptocurrencyMarketPrice.getLogoUrl());
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice = cryptocurrencyMarketPrice.getAssetPrice();
            java.lang.String valueOf2 = java.lang.String.valueOf(assetPrice != null ? assetPrice.getCurrencyCode() : null);
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice2 = cryptocurrencyMarketPrice.getAssetPrice();
            java.lang.String value = assetPrice2 != null ? assetPrice2.getValue() : null;
            java.lang.String str3 = value == null ? "" : value;
            java.lang.Object priceMovementPercent = cryptocurrencyMarketPrice.getPriceMovementPercent();
            java.lang.String obj = priceMovementPercent != null ? priceMovementPercent.toString() : null;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator priceMovementIndicator = cryptocurrencyMarketPrice.getPriceMovementIndicator();
            if (priceMovementIndicator != null) {
                cryptoPriceMovementIndicator = toDomain(priceMovementIndicator);
            }
            arrayList2.add(new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice(str, str2, valueOf, valueOf2, str3, obj, cryptoPriceMovementIndicator));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> cryptocurrencyMarketCapabilities = cryptocurrencyMarketPrices.getCryptocurrencyMarketCapabilities();
        if (cryptocurrencyMarketCapabilities != null) {
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> list = cryptocurrencyMarketCapabilities;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability cryptocurrencyMarketCapability : list) {
                java.lang.String obj2 = cryptocurrencyMarketCapability.getAssetSymbol().toString();
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade = cryptocurrencyMarketCapability.getTrade();
                boolean areEqual = trade != null ? kotlin.jvm.internal.Intrinsics.areEqual(trade.getBuy(), java.lang.Boolean.TRUE) : false;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade2 = cryptocurrencyMarketCapability.getTrade();
                boolean areEqual2 = trade2 != null ? kotlin.jvm.internal.Intrinsics.areEqual(trade2.getSell(), java.lang.Boolean.TRUE) : false;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer = cryptocurrencyMarketCapability.getTransfer();
                boolean areEqual3 = (transfer == null || (receive = transfer.getReceive()) == null) ? false : kotlin.jvm.internal.Intrinsics.areEqual(receive.getOnBlockchain(), java.lang.Boolean.TRUE);
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer2 = cryptocurrencyMarketCapability.getTransfer();
                boolean areEqual4 = (transfer2 == null || (send = transfer2.getSend()) == null) ? false : kotlin.jvm.internal.Intrinsics.areEqual(send.getOnBlockchain(), java.lang.Boolean.TRUE);
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade3 = cryptocurrencyMarketCapability.getTrade();
                arrayList4.add(new com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities(obj2, areEqual, areEqual2, areEqual3, areEqual4, trade3 != null ? kotlin.jvm.internal.Intrinsics.areEqual(trade3.getSwap(), java.lang.Boolean.TRUE) : false));
            }
            arrayList = arrayList4;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices(arrayList3, arrayList);
    }

    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory toDomainAssetPriceHistory(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, java.lang.String str2) {
        java.lang.String value;
        java.lang.Double doubleOrNull;
        java.lang.String obj;
        java.lang.Long highSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyMarketPrices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceTimeRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice> cryptocurrencyMarketPrices2 = cryptocurrencyMarketPrices.getCryptocurrencyMarketPrices();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(cryptocurrencyMarketPrices2, 10));
        for (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice cryptocurrencyMarketPrice : cryptocurrencyMarketPrices2) {
            java.lang.Object pricedAtTime = cryptocurrencyMarketPrice.getPricedAtTime();
            long longValue = (pricedAtTime == null || (obj = pricedAtTime.toString()) == null || (highSpeedVideoSizes = getHighSpeedVideoSizes(obj)) == null) ? 0L : highSpeedVideoSizes.longValue();
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice = cryptocurrencyMarketPrice.getAssetPrice();
            arrayList.add(new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint(longValue, (assetPrice == null || (value = assetPrice.getValue()) == null || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value)) == null) ? 0.0d : doubleOrNull.doubleValue()));
        }
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory(str, priceTimeRange, str2, arrayList);
    }

    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails toDomainAssetPriceDetails(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrices cryptocurrencyMarketPrices) {
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Send send;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Receive receive;
        java.lang.String obj;
        java.lang.Double doubleOrNull;
        java.lang.String value;
        java.lang.Double doubleOrNull2;
        java.lang.String value2;
        java.lang.Double doubleOrNull3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyMarketPrices, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice cryptocurrencyMarketPrice = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketPrice) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cryptocurrencyMarketPrices.getCryptocurrencyMarketPrices());
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability> cryptocurrencyMarketCapabilities = cryptocurrencyMarketPrices.getCryptocurrencyMarketCapabilities();
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability cryptocurrencyMarketCapability = cryptocurrencyMarketCapabilities != null ? (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.CryptocurrencyMarketCapability) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cryptocurrencyMarketCapabilities) : null;
        if (cryptocurrencyMarketPrice == null || cryptocurrencyMarketCapability == null) {
            return null;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol = cryptocurrencyMarketPrice.getAssetSymbol();
        java.lang.String rawValue = assetSymbol != null ? assetSymbol.getRawValue() : null;
        java.lang.String str = rawValue == null ? "" : rawValue;
        java.lang.String assetName = cryptocurrencyMarketPrice.getAssetName();
        java.lang.String str2 = assetName == null ? "" : assetName;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice = cryptocurrencyMarketPrice.getAssetPrice();
        double d = 0.0d;
        double doubleValue = (assetPrice == null || (value2 = assetPrice.getValue()) == null || (doubleOrNull3 = kotlin.text.StringsKt.toDoubleOrNull(value2)) == null) ? 0.0d : doubleOrNull3.doubleValue();
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.AssetPrice assetPrice2 = cryptocurrencyMarketPrice.getAssetPrice();
        java.lang.String valueOf = java.lang.String.valueOf(assetPrice2 != null ? assetPrice2.getCurrencyCode() : null);
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.PriceMovementAmount priceMovementAmount = cryptocurrencyMarketPrice.getPriceMovementAmount();
        double doubleValue2 = (priceMovementAmount == null || (value = priceMovementAmount.getValue()) == null || (doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(value)) == null) ? 0.0d : doubleOrNull2.doubleValue();
        java.lang.Object priceMovementPercent = cryptocurrencyMarketPrice.getPriceMovementPercent();
        if (priceMovementPercent != null && (obj = priceMovementPercent.toString()) != null && (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(obj)) != null) {
            d = doubleOrNull.doubleValue();
        }
        double d2 = d;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator priceMovementIndicator = cryptocurrencyMarketPrice.getPriceMovementIndicator();
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator domain = priceMovementIndicator != null ? toDomain(priceMovementIndicator) : null;
        java.lang.String valueOf2 = java.lang.String.valueOf(cryptocurrencyMarketPrice.getLogoUrl());
        java.lang.String obj2 = cryptocurrencyMarketCapability.getAssetSymbol().toString();
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade = cryptocurrencyMarketCapability.getTrade();
        boolean areEqual = trade != null ? kotlin.jvm.internal.Intrinsics.areEqual(trade.getBuy(), java.lang.Boolean.TRUE) : false;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade2 = cryptocurrencyMarketCapability.getTrade();
        boolean areEqual2 = trade2 != null ? kotlin.jvm.internal.Intrinsics.areEqual(trade2.getSell(), java.lang.Boolean.TRUE) : false;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer = cryptocurrencyMarketCapability.getTransfer();
        boolean areEqual3 = (transfer == null || (receive = transfer.getReceive()) == null) ? false : kotlin.jvm.internal.Intrinsics.areEqual(receive.getOnBlockchain(), java.lang.Boolean.TRUE);
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Transfer transfer2 = cryptocurrencyMarketCapability.getTransfer();
        boolean areEqual4 = (transfer2 == null || (send = transfer2.getSend()) == null) ? false : kotlin.jvm.internal.Intrinsics.areEqual(send.getOnBlockchain(), java.lang.Boolean.TRUE);
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyMarketPricesQuery.Trade trade3 = cryptocurrencyMarketCapability.getTrade();
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails(str, str2, doubleValue, valueOf, doubleValue2, d2, domain, valueOf2, new com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities(obj2, areEqual, areEqual2, areEqual3, areEqual4, trade3 != null ? kotlin.jvm.internal.Intrinsics.areEqual(trade3.getSwap(), java.lang.Boolean.TRUE) : false));
    }

    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator toDomain(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator cryptocurrencyPriceMovementIndicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyPriceMovementIndicator, "");
        int i = com.paypal.oslo.feature.cryptocurrency.data.mapper.prices.CryptoMarketPricesMapperKt.WhenMappings.$EnumSwitchMapping$0[cryptocurrencyPriceMovementIndicator.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.UP;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.DOWN;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.CONSTANT;
        }
        if (i == 4) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange toGraphQLType(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceTimeRange, "");
        switch (com.paypal.oslo.feature.cryptocurrency.data.mapper.prices.CryptoMarketPricesMapperKt.WhenMappings.$EnumSwitchMapping$1[priceTimeRange.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.DAY;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.WEEK;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.MONTH;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.SIX_MONTH;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.YEAR;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceTimeRange.ALL;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static final java.lang.Long getHighSpeedVideoSizes(java.lang.String str) {
        try {
            return java.lang.Long.valueOf(java.time.Instant.parse(str).toEpochMilli());
        } catch (java.time.format.DateTimeParseException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Failed to parse cryptocurrency market price at time to timestamp", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("pricedAtTime", str)), null, e, 4, null);
            return null;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator.CONSTANT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPriceMovementIndicator.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.values().length];
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.DAY_24H.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.WEEK_1W.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.MONTH_1M.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.MONTH_6M.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.YEAR_1Y.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.ALL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
