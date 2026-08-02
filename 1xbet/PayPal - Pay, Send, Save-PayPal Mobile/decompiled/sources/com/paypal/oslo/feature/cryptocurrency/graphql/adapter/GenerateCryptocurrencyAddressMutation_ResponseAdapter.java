package com.paypal.oslo.feature.cryptocurrency.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GenerateCryptocurrencyAddressMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.OPERATION_NAME, "BlockchainAddress", "BlockchainNetwork"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GenerateCryptocurrencyAddressMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GenerateCryptocurrencyAddressMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("generateCryptocurrencyAddress");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                generateCryptocurrencyAddress = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.GenerateCryptocurrencyAddress.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data(generateCryptocurrencyAddress);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("generateCryptocurrencyAddress");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.GenerateCryptocurrencyAddress.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getGenerateCryptocurrencyAddress());
        }
    }

    private GenerateCryptocurrencyAddressMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GenerateCryptocurrencyAddressMutation_ResponseAdapter$GenerateCryptocurrencyAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GenerateCryptocurrencyAddress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.GenerateCryptocurrencyAddress INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.GenerateCryptocurrencyAddress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"action", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "blockchainAddress", "transactionTrackingId"});
        public static final int $stable = 8;

        private GenerateCryptocurrencyAddress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction cryptocurrencyTransferAction = null;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = null;
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cryptocurrencyTransferAction = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyTransferAction_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    cryptocurrencyAssetSymbol = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    blockchainAddress = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainAddress.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cryptocurrencyTransferAction == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "action");
                throw new kotlin.KotlinNothingValueException();
            }
            if (cryptocurrencyAssetSymbol == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
                throw new kotlin.KotlinNothingValueException();
            }
            if (blockchainAddress == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "blockchainAddress");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress(cryptocurrencyTransferAction, cryptocurrencyAssetSymbol, blockchainAddress, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "transactionTrackingId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("action");
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyTransferAction_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAction());
            writer.name(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL);
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAssetSymbol_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAssetSymbol());
            writer.name("blockchainAddress");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainAddress.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getBlockchainAddress());
            writer.name("transactionTrackingId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTransactionTrackingId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GenerateCryptocurrencyAddressMutation_ResponseAdapter$BlockchainAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BlockchainAddress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainAddress INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainAddress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "accountId", "addressBookEntryName", "cryptoProvisioned", "displayMemo", "memo", "blockchainNetworks", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner});
        public static final int $stable = 8;

        private BlockchainAddress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x009a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r1 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress(r3, r4, r5, r1.booleanValue(), r7, r8, r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "cryptoProvisioned");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.Boolean bool2 = null;
            java.lang.String str4 = null;
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType cryptocurrencyAddressOwnerType = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainNetwork.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        cryptocurrencyAddressOwnerType = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAddressOwnerType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("accountId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAccountId());
            writer.name("addressBookEntryName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAddressBookEntryName());
            writer.name("cryptoProvisioned");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getCryptoProvisioned()));
            writer.name("displayMemo");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getDisplayMemo());
            writer.name("memo");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMemo());
            writer.name("blockchainNetworks");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainNetwork.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getBlockchainNetworks());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyAddressOwnerType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getOwner());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/adapter/GenerateCryptocurrencyAddressMutation_ResponseAdapter$BlockchainNetwork;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainNetwork;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainNetwork;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainNetwork;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BlockchainNetwork implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> {
        public static final com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainNetwork INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.BlockchainNetwork();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "blockchain", "defaultNetwork", "imageURL"});
        public static final int $stable = 8;

        private BlockchainNetwork() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork = null;
            java.lang.String str = null;
            java.lang.Boolean bool = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cryptocurrencyBlockchainNetwork = com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyBlockchainNetwork_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cryptocurrencyBlockchainNetwork == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork(cryptocurrencyBlockchainNetwork, str, bool, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "blockchain");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.api.graphql.schema.type.adapter.CryptocurrencyBlockchainNetwork_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("blockchain");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBlockchain());
            writer.name("defaultNetwork");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getDefaultNetwork());
            writer.name("imageURL");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getImageURL());
        }
    }
}
