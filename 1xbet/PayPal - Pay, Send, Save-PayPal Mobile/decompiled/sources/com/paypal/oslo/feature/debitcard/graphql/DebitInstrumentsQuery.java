package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f*+,-./01234)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.OPERATION_NAME, "Item", "Product", "CardHolder", "Limits", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS, "Balances", "TotalAvailableAmount", "TotalReservedAmount", "TotalPendingAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "b2797d09e3da7c34fc8c18d4fe0ccdf0085bc48f9e918e8dc254e989fb40b0b6";
    public static final java.lang.String OPERATION_NAME = "DebitInstruments";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Companion(null);
    public static final int $stable = 8;

    public DebitInstrumentsQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentsInput, "");
        this.input = debitInstrumentsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.DebitInstrumentsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$DebitInstruments;", "debitInstruments", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;", "balances", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$DebitInstruments;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$DebitInstruments;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$DebitInstruments;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$DebitInstruments;", "getDebitInstruments", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;", "getBalances"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments debitInstruments;

        public Data(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments debitInstruments, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            this.debitInstruments = debitInstruments;
            this.balances = balances;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances getBalances() {
            return this.balances;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments debitInstruments = this.debitInstruments;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances = this.balances;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(debitInstruments=");
            sb.append(debitInstruments);
            sb.append(", balances=");
            sb.append(balances);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.debitInstruments.hashCode() * 31) + this.balances.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data data = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstruments, data.debitInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.balances, data.balances);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments debitInstruments, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data(debitInstruments, balances);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances getBalances() {
            return this.balances;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments debitInstruments, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstruments = data.debitInstruments;
            }
            if ((i & 2) != 0) {
                balances = data.balances;
            }
            return data.copy(debitInstruments, balances);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$DebitInstruments;", "", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$DebitInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item> items;

        public DebitInstruments(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstruments(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments) other).items);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments(items);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.DebitInstruments debitInstruments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = debitInstruments.items;
            }
            return debitInstruments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b0\u00101J®\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\bA\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bD\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\bE\u0010\u001eR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010-R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bO\u0010/R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\bQ\u00101"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Item;", "", "", "__typename", "", "virtualCard", "primaryCurrencyCode", "primary", "Lcom/paypal/oslo/api/graphql/schema/type/Month;", "expirationMonth", "expirationYear", com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_EXPIRED, "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Product;", "product", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$CardHolder;", "cardHolder", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Limits;", "limits", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Rewards;", "rewards", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "debitInstrumentCoreFragment", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/Month;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$CardHolder;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Limits;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Rewards;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Object;", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/Month;", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Product;", "component10", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$CardHolder;", "component11", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Limits;", "component12", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Rewards;", "component13", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/Month;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$CardHolder;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Limits;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Rewards;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/lang/Boolean;", "getVirtualCard", "Ljava/lang/Object;", "getPrimaryCurrencyCode", "getPrimary", "Lcom/paypal/oslo/api/graphql/schema/type/Month;", "getExpirationMonth", "getExpirationYear", "getExpired", "Ljava/util/List;", "getActions", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Product;", "getProduct", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$CardHolder;", "getCardHolder", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Limits;", "getLimits", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Rewards;", "getRewards", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "getDebitInstrumentCoreFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment;
        private final com.paypal.oslo.api.graphql.schema.type.Month expirationMonth;
        private final java.lang.Object expirationYear;
        private final java.lang.Boolean expired;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits;
        private final java.lang.Boolean primary;
        private final java.lang.Object primaryCurrencyCode;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards rewards;
        private final java.lang.Boolean virtualCard;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, java.lang.Boolean bool, java.lang.Object obj, java.lang.Boolean bool2, com.paypal.oslo.api.graphql.schema.type.Month month, java.lang.Object obj2, java.lang.Boolean bool3, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards rewards, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCoreFragment, "");
            this.__typename = str;
            this.virtualCard = bool;
            this.primaryCurrencyCode = obj;
            this.primary = bool2;
            this.expirationMonth = month;
            this.expirationYear = obj2;
            this.expired = bool3;
            this.actions = list;
            this.product = product;
            this.cardHolder = cardHolder;
            this.limits = limits;
            this.rewards = rewards;
            this.debitInstrumentCoreFragment = debitInstrumentCoreFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.Boolean getVirtualCard() {
            return this.virtualCard;
        }

        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        public final java.lang.Boolean getPrimary() {
            return this.primary;
        }

        public final com.paypal.oslo.api.graphql.schema.type.Month getExpirationMonth() {
            return this.expirationMonth;
        }

        public final java.lang.Object getExpirationYear() {
            return this.expirationYear;
        }

        public final java.lang.Boolean getExpired() {
            return this.expired;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getActions() {
            return this.actions;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits getLimits() {
            return this.limits;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards getRewards() {
            return this.rewards;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment getDebitInstrumentCoreFragment() {
            return this.debitInstrumentCoreFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.Boolean bool = this.virtualCard;
            java.lang.Object obj = this.primaryCurrencyCode;
            java.lang.Boolean bool2 = this.primary;
            com.paypal.oslo.api.graphql.schema.type.Month month = this.expirationMonth;
            java.lang.Object obj2 = this.expirationYear;
            java.lang.Boolean bool3 = this.expired;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product = this.product;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder = this.cardHolder;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits = this.limits;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards rewards = this.rewards;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment = this.debitInstrumentCoreFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", virtualCard=");
            sb.append(bool);
            sb.append(", primaryCurrencyCode=");
            sb.append(obj);
            sb.append(", primary=");
            sb.append(bool2);
            sb.append(", expirationMonth=");
            sb.append(month);
            sb.append(", expirationYear=");
            sb.append(obj2);
            sb.append(", expired=");
            sb.append(bool3);
            sb.append(", actions=");
            sb.append(list);
            sb.append(", product=");
            sb.append(product);
            sb.append(", cardHolder=");
            sb.append(cardHolder);
            sb.append(", limits=");
            sb.append(limits);
            sb.append(", rewards=");
            sb.append(rewards);
            sb.append(", debitInstrumentCoreFragment=");
            sb.append(debitInstrumentCoreFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            java.lang.Boolean bool = this.virtualCard;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.Object obj = this.primaryCurrencyCode;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.Boolean bool2 = this.primary;
            int hashCode4 = bool2 == null ? 0 : bool2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.Month month = this.expirationMonth;
            int hashCode5 = month == null ? 0 : month.hashCode();
            java.lang.Object obj2 = this.expirationYear;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Boolean bool3 = this.expired;
            int hashCode7 = bool3 == null ? 0 : bool3.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            int hashCode8 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product = this.product;
            int hashCode9 = product == null ? 0 : product.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder = this.cardHolder;
            int hashCode10 = cardHolder == null ? 0 : cardHolder.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits = this.limits;
            int hashCode11 = limits == null ? 0 : limits.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards rewards = this.rewards;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (rewards != null ? rewards.hashCode() : 0)) * 31) + this.debitInstrumentCoreFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item item = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCard, item.virtualCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, item.primaryCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.primary, item.primary) && this.expirationMonth == item.expirationMonth && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationYear, item.expirationYear) && kotlin.jvm.internal.Intrinsics.areEqual(this.expired, item.expired) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, item.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, item.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolder, item.cardHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.limits, item.limits) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewards, item.rewards) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentCoreFragment, item.debitInstrumentCoreFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item copy(java.lang.String __typename, java.lang.Boolean virtualCard, java.lang.Object primaryCurrencyCode, java.lang.Boolean primary, com.paypal.oslo.api.graphql.schema.type.Month expirationMonth, java.lang.Object expirationYear, java.lang.Boolean expired, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards rewards, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCoreFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Item(__typename, virtualCard, primaryCurrencyCode, primary, expirationMonth, expirationYear, expired, actions, product, cardHolder, limits, rewards, debitInstrumentCoreFragment);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product getProduct() {
            return this.product;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> component8() {
            return this.actions;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Boolean getExpired() {
            return this.expired;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getExpirationYear() {
            return this.expirationYear;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.Month getExpirationMonth() {
            return this.expirationMonth;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getVirtualCard() {
            return this.virtualCard;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment getDebitInstrumentCoreFragment() {
            return this.debitInstrumentCoreFragment;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards getRewards() {
            return this.rewards;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits getLimits() {
            return this.limits;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Product;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "debitInstrumentProductFullFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Product;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "getDebitInstrumentProductFullFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment;

        public Product(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductFullFragment, "");
            this.__typename = str;
            this.debitInstrumentProductFullFragment = debitInstrumentProductFullFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment getDebitInstrumentProductFullFragment() {
            return this.debitInstrumentProductFullFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment = this.debitInstrumentProductFullFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentProductFullFragment=");
            sb.append(debitInstrumentProductFullFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentProductFullFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, product.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentProductFullFragment, product.debitInstrumentProductFullFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductFullFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product(__typename, debitInstrumentProductFullFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment getDebitInstrumentProductFullFragment() {
            return this.debitInstrumentProductFullFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Product product, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = product.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentProductFullFragment = product.debitInstrumentProductFullFragment;
            }
            return product.copy(str, debitInstrumentProductFullFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$CardHolder;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "debitInstrumentCardHolderFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$CardHolder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "getDebitInstrumentCardHolderFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardHolder {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment;

        public CardHolder(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardHolderFragment, "");
            this.__typename = str;
            this.debitInstrumentCardHolderFragment = debitInstrumentCardHolderFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment getDebitInstrumentCardHolderFragment() {
            return this.debitInstrumentCardHolderFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment = this.debitInstrumentCardHolderFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardHolder(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentCardHolderFragment=");
            sb.append(debitInstrumentCardHolderFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentCardHolderFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardHolder.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentCardHolderFragment, cardHolder.debitInstrumentCardHolderFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardHolderFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder(__typename, debitInstrumentCardHolderFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment getDebitInstrumentCardHolderFragment() {
            return this.debitInstrumentCardHolderFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.CardHolder cardHolder, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardHolder.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentCardHolderFragment = cardHolder.debitInstrumentCardHolderFragment;
            }
            return cardHolder.copy(str, debitInstrumentCardHolderFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Limits;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;", "debitInstrumentLimitsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Limits;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentLimitsFragment;", "getDebitInstrumentLimitsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Limits {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment;

        public Limits(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentLimitsFragment, "");
            this.__typename = str;
            this.debitInstrumentLimitsFragment = debitInstrumentLimitsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment getDebitInstrumentLimitsFragment() {
            return this.debitInstrumentLimitsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment = this.debitInstrumentLimitsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Limits(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentLimitsFragment=");
            sb.append(debitInstrumentLimitsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentLimitsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, limits.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentLimitsFragment, limits.debitInstrumentLimitsFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentLimitsFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits(__typename, debitInstrumentLimitsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment getDebitInstrumentLimitsFragment() {
            return this.debitInstrumentLimitsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Limits limits, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentLimitsFragment debitInstrumentLimitsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = limits.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentLimitsFragment = limits.debitInstrumentLimitsFragment;
            }
            return limits.copy(str, debitInstrumentLimitsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Rewards;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment;", "debitInstrumentRewardsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Rewards;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentRewardsFragment;", "getDebitInstrumentRewardsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Rewards {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment debitInstrumentRewardsFragment;

        public Rewards(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment debitInstrumentRewardsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentRewardsFragment, "");
            this.__typename = str;
            this.debitInstrumentRewardsFragment = debitInstrumentRewardsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment getDebitInstrumentRewardsFragment() {
            return this.debitInstrumentRewardsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment debitInstrumentRewardsFragment = this.debitInstrumentRewardsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rewards(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentRewardsFragment=");
            sb.append(debitInstrumentRewardsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentRewardsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards rewards = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, rewards.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentRewardsFragment, rewards.debitInstrumentRewardsFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment debitInstrumentRewardsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentRewardsFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards(__typename, debitInstrumentRewardsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment getDebitInstrumentRewardsFragment() {
            return this.debitInstrumentRewardsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Rewards rewards, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentRewardsFragment debitInstrumentRewardsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rewards.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentRewardsFragment = rewards.debitInstrumentRewardsFragment;
            }
            return rewards.copy(str, debitInstrumentRewardsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalAvailableAmount;", "totalAvailableAmount", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalReservedAmount;", "totalReservedAmount", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalPendingAmount;", "totalPendingAmount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalAvailableAmount;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalReservedAmount;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalPendingAmount;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalAvailableAmount;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalReservedAmount;", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalPendingAmount;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalAvailableAmount;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalReservedAmount;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalPendingAmount;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Balances;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalAvailableAmount;", "getTotalAvailableAmount", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalReservedAmount;", "getTotalReservedAmount", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalPendingAmount;", "getTotalPendingAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balances {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount totalAvailableAmount;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount totalReservedAmount;

        public Balances(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            this.totalAvailableAmount = totalAvailableAmount;
            this.totalReservedAmount = totalReservedAmount;
            this.totalPendingAmount = totalPendingAmount;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount getTotalPendingAmount() {
            return this.totalPendingAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount totalAvailableAmount = this.totalAvailableAmount;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount totalReservedAmount = this.totalReservedAmount;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount = this.totalPendingAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balances(totalAvailableAmount=");
            sb.append(totalAvailableAmount);
            sb.append(", totalReservedAmount=");
            sb.append(totalReservedAmount);
            sb.append(", totalPendingAmount=");
            sb.append(totalPendingAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.totalAvailableAmount.hashCode();
            int hashCode2 = this.totalReservedAmount.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount = this.totalPendingAmount;
            return (((hashCode * 31) + hashCode2) * 31) + (totalPendingAmount == null ? 0 : totalPendingAmount.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalAvailableAmount, balances.totalAvailableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalReservedAmount, balances.totalReservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPendingAmount, balances.totalPendingAmount);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances copy(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalReservedAmount, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances(totalAvailableAmount, totalReservedAmount, totalPendingAmount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount getTotalPendingAmount() {
            return this.totalPendingAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount getTotalReservedAmount() {
            return this.totalReservedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.Balances balances, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount totalAvailableAmount, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount totalReservedAmount, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalAvailableAmount = balances.totalAvailableAmount;
            }
            if ((i & 2) != 0) {
                totalReservedAmount = balances.totalReservedAmount;
            }
            if ((i & 4) != 0) {
                totalPendingAmount = balances.totalPendingAmount;
            }
            return balances.copy(totalAvailableAmount, totalReservedAmount, totalPendingAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalAvailableAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalAvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAvailableAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAvailableAmount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAvailableAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount totalAvailableAmount = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAvailableAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAvailableAmount.value);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalAvailableAmount totalAvailableAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAvailableAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAvailableAmount.value;
            }
            return totalAvailableAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalReservedAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalReservedAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalReservedAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalReservedAmount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalReservedAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount totalReservedAmount = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalReservedAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalReservedAmount.value);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalReservedAmount totalReservedAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalReservedAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalReservedAmount.value;
            }
            return totalReservedAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalPendingAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$TotalPendingAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalPendingAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalPendingAmount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalPendingAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalPendingAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalPendingAmount.value);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.TotalPendingAmount totalPendingAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalPendingAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalPendingAmount.value;
            }
            return totalPendingAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query DebitInstruments($input: DebitInstrumentsInput!) { debitInstruments(input: $input) { items { __typename ...DebitInstrumentCoreFragment virtualCard primaryCurrencyCode primary expirationMonth expirationYear expired actions product { __typename ...DebitInstrumentProductFullFragment } cardHolder { __typename ...DebitInstrumentCardHolderFragment } limits { __typename ...DebitInstrumentLimitsFragment } rewards { __typename ...DebitInstrumentRewardsFragment } } } balances { totalAvailableAmount { currencyCode value } totalReservedAmount { currencyCode value } totalPendingAmount { currencyCode value } } }  fragment DebitInstrumentStatusFragment on DebitInstrumentStatus { lifecycleState displayState statusChangeReasons }  fragment DebitInstrumentPinFragment on DebitInstrumentPin { status profileName origin }  fragment DebitInstrumentShipmentFragment on DebitInstrumentShipment { status shipmentDate estimatedArrivalDate }  fragment DebitInstrumentCoreFragment on DebitInstrument { id productName lastNChars status { __typename ...DebitInstrumentStatusFragment } pin { __typename ...DebitInstrumentPinFragment } shipment { __typename ...DebitInstrumentShipmentFragment } }  fragment DebitInstrumentProductCoreFragment on DebitInstrumentProduct { name legalName longName shortName largeImage { back { contentType referenceUrl } front { contentType referenceUrl } } }  fragment DebitInstrumentProductFullFragment on DebitInstrumentProduct { __typename ...DebitInstrumentProductCoreFragment smallImage { back { contentType referenceUrl } front { contentType referenceUrl } } physicalCardOrderProgressCardArt { contentType referenceUrl } learnMoreUrl faqUrl helpUrl cardHolderAgreementUrl virtualCardHolderAgreementUrl privacyPolicyUrl feeUrl actionUrls { activateCard learnMore faq reportCardLost } tags availableActions brand capabilities maxAdditionalCardsAllowed issuanceConfig { defaultDebitIssuanceFormFactor allowFormFactorChoice formFactors } }  fragment DebitInstrumentCardHolderFragment on DebitInstrumentCardHolder { firstName lastName billingAddress { id address { addressLine1 addressLine2 adminArea1 adminArea2 countryCode postalCode } displayAddress normalizationStatus } }  fragment DebitInstrumentLimitsFragment on DebitInstrumentLimits { posLimit { currencyCode value } atmLimit { currencyCode value } otcLimit { currencyCode value } }  fragment DebitInstrumentRewardsFragment on DebitInstrumentRewards { eligibleCashbackPrograms { cashbackPercentage description } enrolledCashbackProgram { cashbackPercentage description } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentsQuery(input=");
        sb.append(debitInstrumentsInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery debitInstrumentsQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentsInput = debitInstrumentsQuery.input;
        }
        return debitInstrumentsQuery.copy(debitInstrumentsInput);
    }
}
