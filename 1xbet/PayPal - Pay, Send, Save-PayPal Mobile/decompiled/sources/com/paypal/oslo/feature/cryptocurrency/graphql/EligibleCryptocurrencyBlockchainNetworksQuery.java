package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/EligibleCryptocurrencyBlockchainNetworksInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EligibleCryptocurrencyBlockchainNetworksInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EligibleCryptocurrencyBlockchainNetworksInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EligibleCryptocurrencyBlockchainNetworksInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/EligibleCryptocurrencyBlockchainNetworksInput;", "getInput", "Companion", "Data", "EligibleCryptocurrencyBlockchainNetworks", "BlockchainNetwork"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EligibleCryptocurrencyBlockchainNetworksQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data> {
    public static final java.lang.String OPERATION_ID = "54106c97744c7e1036402d1b1ddf30487f424e9f41e3b021f3002e9ba20c4f84";
    public static final java.lang.String OPERATION_NAME = "eligibleCryptocurrencyBlockchainNetworks";
    private final com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Companion(null);
    public static final int $stable = 8;

    public EligibleCryptocurrencyBlockchainNetworksQuery(com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput eligibleCryptocurrencyBlockchainNetworksInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleCryptocurrencyBlockchainNetworksInput, "");
        this.input = eligibleCryptocurrencyBlockchainNetworksInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput getInput() {
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
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.EligibleCryptocurrencyBlockchainNetworksQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.EligibleCryptocurrencyBlockchainNetworksQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.EligibleCryptocurrencyBlockchainNetworksQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$EligibleCryptocurrencyBlockchainNetworks;", com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.OPERATION_NAME, "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$EligibleCryptocurrencyBlockchainNetworks;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$EligibleCryptocurrencyBlockchainNetworks;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$EligibleCryptocurrencyBlockchainNetworks;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$EligibleCryptocurrencyBlockchainNetworks;", "getEligibleCryptocurrencyBlockchainNetworks"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks) {
            this.eligibleCryptocurrencyBlockchainNetworks = eligibleCryptocurrencyBlockchainNetworks;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks getEligibleCryptocurrencyBlockchainNetworks() {
            return this.eligibleCryptocurrencyBlockchainNetworks;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks = this.eligibleCryptocurrencyBlockchainNetworks;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(eligibleCryptocurrencyBlockchainNetworks=");
            sb.append(eligibleCryptocurrencyBlockchainNetworks);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks = this.eligibleCryptocurrencyBlockchainNetworks;
            if (eligibleCryptocurrencyBlockchainNetworks == null) {
                return 0;
            }
            return eligibleCryptocurrencyBlockchainNetworks.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleCryptocurrencyBlockchainNetworks, ((com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data) other).eligibleCryptocurrencyBlockchainNetworks);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data(eligibleCryptocurrencyBlockchainNetworks);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks getEligibleCryptocurrencyBlockchainNetworks() {
            return this.eligibleCryptocurrencyBlockchainNetworks;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                eligibleCryptocurrencyBlockchainNetworks = data.eligibleCryptocurrencyBlockchainNetworks;
            }
            return data.copy(eligibleCryptocurrencyBlockchainNetworks);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$EligibleCryptocurrencyBlockchainNetworks;", "", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$BlockchainNetwork;", "blockchainNetworks", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$EligibleCryptocurrencyBlockchainNetworks;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getBlockchainNetworks"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibleCryptocurrencyBlockchainNetworks {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> blockchainNetworks;

        public EligibleCryptocurrencyBlockchainNetworks(java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.blockchainNetworks = list;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> getBlockchainNetworks() {
            return this.blockchainNetworks;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> list = this.blockchainNetworks;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleCryptocurrencyBlockchainNetworks(blockchainNetworks=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.blockchainNetworks.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks) && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchainNetworks, ((com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks) other).blockchainNetworks);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks copy(java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> blockchainNetworks) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchainNetworks, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks(blockchainNetworks);
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork> component1() {
            return this.blockchainNetworks;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.EligibleCryptocurrencyBlockchainNetworks eligibleCryptocurrencyBlockchainNetworks, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = eligibleCryptocurrencyBlockchainNetworks.blockchainNetworks;
            }
            return eligibleCryptocurrencyBlockchainNetworks.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$BlockchainNetwork;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "name", "", "blockchain", "", "defaultNetwork", "imageURL", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$BlockchainNetwork;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "getName", "Ljava/lang/String;", "getBlockchain", "Ljava/lang/Boolean;", "getDefaultNetwork", "Ljava/lang/Object;", "getImageURL"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork blockchainNetwork = (com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork) other;
            return this.name == blockchainNetwork.name && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchain, blockchainNetwork.blockchain) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultNetwork, blockchainNetwork.defaultNetwork) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageURL, blockchainNetwork.imageURL);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork name2, java.lang.String blockchain, java.lang.Boolean defaultNetwork, java.lang.Object imageURL) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchain, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork(name2, blockchain, defaultNetwork, imageURL);
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

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery.BlockchainNetwork blockchainNetwork, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork, java.lang.String str, java.lang.Boolean bool, java.lang.Object obj, int i, java.lang.Object obj2) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EligibleCryptocurrencyBlockchainNetworksQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query eligibleCryptocurrencyBlockchainNetworks($input: EligibleCryptocurrencyBlockchainNetworksInput!) { eligibleCryptocurrencyBlockchainNetworks(input: $input) { blockchainNetworks { name blockchain defaultNetwork imageURL } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput eligibleCryptocurrencyBlockchainNetworksInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleCryptocurrencyBlockchainNetworksQuery(input=");
        sb.append(eligibleCryptocurrencyBlockchainNetworksInput);
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery copy(com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.EligibleCryptocurrencyBlockchainNetworksQuery eligibleCryptocurrencyBlockchainNetworksQuery, com.paypal.oslo.api.graphql.schema.type.EligibleCryptocurrencyBlockchainNetworksInput eligibleCryptocurrencyBlockchainNetworksInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            eligibleCryptocurrencyBlockchainNetworksInput = eligibleCryptocurrencyBlockchainNetworksQuery.input;
        }
        return eligibleCryptocurrencyBlockchainNetworksQuery.copy(eligibleCryptocurrencyBlockchainNetworksInput);
    }
}
