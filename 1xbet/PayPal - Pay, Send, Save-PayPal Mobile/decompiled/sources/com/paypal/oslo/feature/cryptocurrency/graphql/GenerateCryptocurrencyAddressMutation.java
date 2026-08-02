package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGenerateAddressesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGenerateAddressesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGenerateAddressesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGenerateAddressesInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGenerateAddressesInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.OPERATION_NAME, "BlockchainAddress", "BlockchainNetwork"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GenerateCryptocurrencyAddressMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data> {
    public static final java.lang.String OPERATION_ID = "35a1b0d5380b442402417add52161737cfe3fc76af407b44482c0c1cd55ff446";
    public static final java.lang.String OPERATION_NAME = "GenerateCryptocurrencyAddress";
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Companion(null);
    public static final int $stable = 8;

    public GenerateCryptocurrencyAddressMutation(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput cryptocurrencyGenerateAddressesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyGenerateAddressesInput, "");
        this.input = cryptocurrencyGenerateAddressesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput getInput() {
        return this.input;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GenerateCryptocurrencyAddressMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.GenerateCryptocurrencyAddressMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;", "generateCryptocurrencyAddress", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;", "getGenerateCryptocurrencyAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress) {
            this.generateCryptocurrencyAddress = generateCryptocurrencyAddress;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress getGenerateCryptocurrencyAddress() {
            return this.generateCryptocurrencyAddress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress = this.generateCryptocurrencyAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(generateCryptocurrencyAddress=");
            sb.append(generateCryptocurrencyAddress);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress = this.generateCryptocurrencyAddress;
            if (generateCryptocurrencyAddress == null) {
                return 0;
            }
            return generateCryptocurrencyAddress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.generateCryptocurrencyAddress, ((com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data) other).generateCryptocurrencyAddress);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data(generateCryptocurrencyAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress getGenerateCryptocurrencyAddress() {
            return this.generateCryptocurrencyAddress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                generateCryptocurrencyAddress = data.generateCryptocurrencyAddress;
            }
            return data.copy(generateCryptocurrencyAddress);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR \u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTransferAction;", "action", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;", "blockchainAddress", "", "transactionTrackingId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTransferAction;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTransferAction;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTransferAction;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$GenerateCryptocurrencyAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyTransferAction;", "getAction", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;", "getBlockchainAddress", "getBlockchainAddress$annotations", "()V", "Ljava/lang/String;", "getTransactionTrackingId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenerateCryptocurrencyAddress {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction action;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress;
        private final java.lang.String transactionTrackingId;

        @kotlin.Deprecated(message = "Use blockchain instead, which provides structured metadata including address book entries and account context.")
        public static /* synthetic */ void getBlockchainAddress$annotations() {
        }

        public GenerateCryptocurrencyAddress(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction cryptocurrencyTransferAction, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyTransferAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchainAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.action = cryptocurrencyTransferAction;
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.blockchainAddress = blockchainAddress;
            this.transactionTrackingId = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction getAction() {
            return this.action;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress getBlockchainAddress() {
            return this.blockchainAddress;
        }

        public final java.lang.String getTransactionTrackingId() {
            return this.transactionTrackingId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction cryptocurrencyTransferAction = this.action;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress = this.blockchainAddress;
            java.lang.String str = this.transactionTrackingId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GenerateCryptocurrencyAddress(action=");
            sb.append(cryptocurrencyTransferAction);
            sb.append(", assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", blockchainAddress=");
            sb.append(blockchainAddress);
            sb.append(", transactionTrackingId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.action.hashCode() * 31) + this.assetSymbol.hashCode()) * 31) + this.blockchainAddress.hashCode()) * 31) + this.transactionTrackingId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress) other;
            return this.action == generateCryptocurrencyAddress.action && this.assetSymbol == generateCryptocurrencyAddress.assetSymbol && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchainAddress, generateCryptocurrencyAddress.blockchainAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTrackingId, generateCryptocurrencyAddress.transactionTrackingId);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction action, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress, java.lang.String transactionTrackingId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchainAddress, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTrackingId, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress(action, assetSymbol, blockchainAddress, transactionTrackingId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getTransactionTrackingId() {
            return this.transactionTrackingId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress getBlockchainAddress() {
            return this.blockchainAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction getAction() {
            return this.action;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.GenerateCryptocurrencyAddress generateCryptocurrencyAddress, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTransferAction cryptocurrencyTransferAction, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyTransferAction = generateCryptocurrencyAddress.action;
            }
            if ((i & 2) != 0) {
                cryptocurrencyAssetSymbol = generateCryptocurrencyAddress.assetSymbol;
            }
            if ((i & 4) != 0) {
                blockchainAddress = generateCryptocurrencyAddress.blockchainAddress;
            }
            if ((i & 8) != 0) {
                str = generateCryptocurrencyAddress.transactionTrackingId;
            }
            return generateCryptocurrencyAddress.copy(cryptocurrencyTransferAction, cryptocurrencyAssetSymbol, blockchainAddress, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJt\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b3\u0010\u0012R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "accountId", "addressBookEntryName", "", "cryptoProvisioned", "displayMemo", "memo", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainNetwork;", "blockchainNetworks", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAddressOwnerType;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAddressOwnerType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAddressOwnerType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAddressOwnerType;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainAddress;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getAccountId", "getAccountId$annotations", "()V", "getAddressBookEntryName", "getAddressBookEntryName$annotations", "Z", "getCryptoProvisioned", "Ljava/lang/Boolean;", "getDisplayMemo", "getDisplayMemo$annotations", "getMemo", "Ljava/util/List;", "getBlockchainNetworks", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAddressOwnerType;", "getOwner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockchainAddress {
        public static final int $stable = 8;
        private final java.lang.String accountId;
        private final java.lang.String addressBookEntryName;
        private final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> blockchainNetworks;
        private final boolean cryptoProvisioned;
        private final java.lang.Boolean displayMemo;
        private final java.lang.String memo;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType owner;
        private final java.lang.String value;

        @kotlin.Deprecated(message = "Use CryptocurrencyBlockchainAddressResult.accountId instead.")
        public static /* synthetic */ void getAccountId$annotations() {
        }

        @kotlin.Deprecated(message = "Use CryptocurrencyBlockchainAddressResult.addressBook.name instead.")
        public static /* synthetic */ void getAddressBookEntryName$annotations() {
        }

        @kotlin.Deprecated(message = "Use CryptocurrencyBlockchainAddressResult.displayMemo instead.")
        public static /* synthetic */ void getDisplayMemo$annotations() {
        }

        public BlockchainAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.Boolean bool, java.lang.String str4, java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> list, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType cryptocurrencyAddressOwnerType) {
            this.value = str;
            this.accountId = str2;
            this.addressBookEntryName = str3;
            this.cryptoProvisioned = z;
            this.displayMemo = bool;
            this.memo = str4;
            this.blockchainNetworks = list;
            this.owner = cryptocurrencyAddressOwnerType;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.String getAddressBookEntryName() {
            return this.addressBookEntryName;
        }

        public final boolean getCryptoProvisioned() {
            return this.cryptoProvisioned;
        }

        public final java.lang.Boolean getDisplayMemo() {
            return this.displayMemo;
        }

        public final java.lang.String getMemo() {
            return this.memo;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> getBlockchainNetworks() {
            return this.blockchainNetworks;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType getOwner() {
            return this.owner;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.String str2 = this.accountId;
            java.lang.String str3 = this.addressBookEntryName;
            boolean z = this.cryptoProvisioned;
            java.lang.Boolean bool = this.displayMemo;
            java.lang.String str4 = this.memo;
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> list = this.blockchainNetworks;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType cryptocurrencyAddressOwnerType = this.owner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockchainAddress(value=");
            sb.append(str);
            sb.append(", accountId=");
            sb.append(str2);
            sb.append(", addressBookEntryName=");
            sb.append(str3);
            sb.append(", cryptoProvisioned=");
            sb.append(z);
            sb.append(", displayMemo=");
            sb.append(bool);
            sb.append(", memo=");
            sb.append(str4);
            sb.append(", blockchainNetworks=");
            sb.append(list);
            sb.append(", owner=");
            sb.append(cryptocurrencyAddressOwnerType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.value;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.accountId;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.addressBookEntryName;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.cryptoProvisioned);
            java.lang.Boolean bool = this.displayMemo;
            int hashCode5 = bool == null ? 0 : bool.hashCode();
            java.lang.String str4 = this.memo;
            int hashCode6 = str4 == null ? 0 : str4.hashCode();
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> list = this.blockchainNetworks;
            int hashCode7 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType cryptocurrencyAddressOwnerType = this.owner;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (cryptocurrencyAddressOwnerType != null ? cryptocurrencyAddressOwnerType.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress blockchainAddress = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, blockchainAddress.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, blockchainAddress.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressBookEntryName, blockchainAddress.addressBookEntryName) && this.cryptoProvisioned == blockchainAddress.cryptoProvisioned && kotlin.jvm.internal.Intrinsics.areEqual(this.displayMemo, blockchainAddress.displayMemo) && kotlin.jvm.internal.Intrinsics.areEqual(this.memo, blockchainAddress.memo) && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchainNetworks, blockchainAddress.blockchainNetworks) && this.owner == blockchainAddress.owner;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress copy(java.lang.String value, java.lang.String accountId, java.lang.String addressBookEntryName, boolean cryptoProvisioned, java.lang.Boolean displayMemo, java.lang.String memo, java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> blockchainNetworks, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType owner) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainAddress(value, accountId, addressBookEntryName, cryptoProvisioned, displayMemo, memo, blockchainNetworks, owner);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAddressOwnerType getOwner() {
            return this.owner;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork> component7() {
            return this.blockchainNetworks;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getMemo() {
            return this.memo;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getDisplayMemo() {
            return this.displayMemo;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getCryptoProvisioned() {
            return this.cryptoProvisioned;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAddressBookEntryName() {
            return this.addressBookEntryName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainNetwork;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "name", "", "blockchain", "", "defaultNetwork", "imageURL", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$BlockchainNetwork;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "getName", "Ljava/lang/String;", "getBlockchain", "Ljava/lang/Boolean;", "getDefaultNetwork", "Ljava/lang/Object;", "getImageURL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockchainNetwork {
        public static final int $stable = 8;
        private final java.lang.String blockchain;
        private final java.lang.Boolean defaultNetwork;
        private final java.lang.Object imageURL;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork name;

        public BlockchainNetwork(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork, java.lang.String str, java.lang.Boolean bool, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyBlockchainNetwork, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = cryptocurrencyBlockchainNetwork;
            this.blockchain = str;
            this.defaultNetwork = bool;
            this.imageURL = obj;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork getName() {
            return this.name;
        }

        public final java.lang.String getBlockchain() {
            return this.blockchain;
        }

        public final java.lang.Boolean getDefaultNetwork() {
            return this.defaultNetwork;
        }

        public final java.lang.Object getImageURL() {
            return this.imageURL;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork = this.name;
            java.lang.String str = this.blockchain;
            java.lang.Boolean bool = this.defaultNetwork;
            java.lang.Object obj = this.imageURL;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockchainNetwork(name=");
            sb.append(cryptocurrencyBlockchainNetwork);
            sb.append(", blockchain=");
            sb.append(str);
            sb.append(", defaultNetwork=");
            sb.append(bool);
            sb.append(", imageURL=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            int hashCode2 = this.blockchain.hashCode();
            java.lang.Boolean bool = this.defaultNetwork;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            java.lang.Object obj = this.imageURL;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork blockchainNetwork = (com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork) other;
            return this.name == blockchainNetwork.name && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchain, blockchainNetwork.blockchain) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultNetwork, blockchainNetwork.defaultNetwork) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageURL, blockchainNetwork.imageURL);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork name2, java.lang.String blockchain, java.lang.Boolean defaultNetwork, java.lang.Object imageURL) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchain, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork(name2, blockchain, defaultNetwork, imageURL);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getImageURL() {
            return this.imageURL;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getDefaultNetwork() {
            return this.defaultNetwork;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBlockchain() {
            return this.blockchain;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation.BlockchainNetwork blockchainNetwork, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork, java.lang.String str, java.lang.Boolean bool, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                cryptocurrencyBlockchainNetwork = blockchainNetwork.name;
            }
            if ((i & 2) != 0) {
                str = blockchainNetwork.blockchain;
            }
            if ((i & 4) != 0) {
                bool = blockchainNetwork.defaultNetwork;
            }
            if ((i & 8) != 0) {
                obj = blockchainNetwork.imageURL;
            }
            return blockchainNetwork.copy(cryptocurrencyBlockchainNetwork, str, bool, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GenerateCryptocurrencyAddressMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation GenerateCryptocurrencyAddress($input: CryptocurrencyGenerateAddressesInput!) { generateCryptocurrencyAddress(input: $input) { action assetSymbol blockchainAddress { value accountId addressBookEntryName cryptoProvisioned displayMemo memo blockchainNetworks { name blockchain defaultNetwork imageURL } owner } transactionTrackingId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput cryptocurrencyGenerateAddressesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GenerateCryptocurrencyAddressMutation(input=");
        sb.append(cryptocurrencyGenerateAddressesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GenerateCryptocurrencyAddressMutation generateCryptocurrencyAddressMutation, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGenerateAddressesInput cryptocurrencyGenerateAddressesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyGenerateAddressesInput = generateCryptocurrencyAddressMutation.input;
        }
        return generateCryptocurrencyAddressMutation.copy(cryptocurrencyGenerateAddressesInput);
    }
}
