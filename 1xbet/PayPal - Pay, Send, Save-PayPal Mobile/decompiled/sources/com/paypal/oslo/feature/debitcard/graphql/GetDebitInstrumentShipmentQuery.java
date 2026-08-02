package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.OPERATION_NAME, "Item", "Status", "Product", "Shipment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetDebitInstrumentShipmentQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data> {
    public static final java.lang.String OPERATION_ID = "8b0d03c62df9ac1366475a9a54171234e5b4c684e0f375d82ae31d94d7a92a29";
    public static final java.lang.String OPERATION_NAME = "GetDebitInstrumentShipment";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Companion(null);
    public static final int $stable = 8;

    public GetDebitInstrumentShipmentQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput) {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.GetDebitInstrumentShipmentQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.GetDebitInstrumentShipmentQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.GetDebitInstrumentShipmentQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$DebitInstruments;", "debitInstruments", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$DebitInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$DebitInstruments;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$DebitInstruments;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$DebitInstruments;", "getDebitInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments debitInstruments;

        public Data(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            this.debitInstruments = debitInstruments;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments debitInstruments = this.debitInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(debitInstruments=");
            sb.append(debitInstruments);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstruments, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data) other).debitInstruments);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data(debitInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments debitInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstruments = data.debitInstruments;
            }
            return data.copy(debitInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$DebitInstruments;", "", "", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$DebitInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item> items;

        public DebitInstruments(java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments) other).items);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments(items);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.DebitInstruments debitInstruments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = debitInstruments.items;
            }
            return debitInstruments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u008c\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b;\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b<\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010%R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Item;", "", "", "id", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Status;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "virtualCard", "primaryCurrencyCode", "primary", "lastNChars", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Product;", "product", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Shipment;", "shipment", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Status;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Shipment;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Status;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/lang/Object;", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Product;", "component9", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Shipment;", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Status;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Shipment;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Status;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Ljava/lang/Boolean;", "getVirtualCard", "Ljava/lang/Object;", "getPrimaryCurrencyCode", "getPrimary", "getLastNChars", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Product;", "getProduct", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Shipment;", "getShipment", "Ljava/util/List;", "getActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions;
        private final java.lang.String id;
        private final java.lang.Object lastNChars;
        private final java.lang.Boolean primary;
        private final java.lang.Object primaryCurrencyCode;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product product;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status;
        private final java.lang.Boolean virtualCard;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Boolean bool, java.lang.Object obj, java.lang.Boolean bool2, java.lang.Object obj2, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.status = status;
            this.productName = debitInstrumentProductName;
            this.virtualCard = bool;
            this.primaryCurrencyCode = obj;
            this.primary = bool2;
            this.lastNChars = obj2;
            this.product = product;
            this.shipment = shipment;
            this.actions = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
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

        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment getShipment() {
            return this.shipment;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getActions() {
            return this.actions;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status = this.status;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            java.lang.Boolean bool = this.virtualCard;
            java.lang.Object obj = this.primaryCurrencyCode;
            java.lang.Boolean bool2 = this.primary;
            java.lang.Object obj2 = this.lastNChars;
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product product = this.product;
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment = this.shipment;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(status);
            sb.append(", productName=");
            sb.append(debitInstrumentProductName);
            sb.append(", virtualCard=");
            sb.append(bool);
            sb.append(", primaryCurrencyCode=");
            sb.append(obj);
            sb.append(", primary=");
            sb.append(bool2);
            sb.append(", lastNChars=");
            sb.append(obj2);
            sb.append(", product=");
            sb.append(product);
            sb.append(", shipment=");
            sb.append(shipment);
            sb.append(", actions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status = this.status;
            int hashCode2 = status == null ? 0 : status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            int hashCode3 = debitInstrumentProductName == null ? 0 : debitInstrumentProductName.hashCode();
            java.lang.Boolean bool = this.virtualCard;
            int hashCode4 = bool == null ? 0 : bool.hashCode();
            java.lang.Object obj = this.primaryCurrencyCode;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            java.lang.Boolean bool2 = this.primary;
            int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Object obj2 = this.lastNChars;
            int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product product = this.product;
            int hashCode8 = product == null ? 0 : product.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment = this.shipment;
            int hashCode9 = shipment == null ? 0 : shipment.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item item = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, item.status) && this.productName == item.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCard, item.virtualCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, item.primaryCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.primary, item.primary) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, item.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, item.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipment, item.shipment) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, item.actions);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item copy(java.lang.String id, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, java.lang.Boolean virtualCard, java.lang.Object primaryCurrencyCode, java.lang.Boolean primary, java.lang.Object lastNChars, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Item(id, status, productName, virtualCard, primaryCurrencyCode, primary, lastNChars, product, shipment, actions);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment getShipment() {
            return this.shipment;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product getProduct() {
            return this.product;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getVirtualCard() {
            return this.virtualCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> component10() {
            return this.actions;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Status;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentStatusFragment;", "debitInstrumentStatusFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentStatusFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentStatusFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentStatusFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentStatusFragment;", "getDebitInstrumentStatusFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment;

        public Status(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentStatusFragment, "");
            this.__typename = str;
            this.debitInstrumentStatusFragment = debitInstrumentStatusFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment getDebitInstrumentStatusFragment() {
            return this.debitInstrumentStatusFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment = this.debitInstrumentStatusFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentStatusFragment=");
            sb.append(debitInstrumentStatusFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentStatusFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, status.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentStatusFragment, status.debitInstrumentStatusFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentStatusFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status(__typename, debitInstrumentStatusFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment getDebitInstrumentStatusFragment() {
            return this.debitInstrumentStatusFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Status status, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = status.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentStatusFragment = status.debitInstrumentStatusFragment;
            }
            return status.copy(str, debitInstrumentStatusFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Product;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", "availableActions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Product;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAvailableActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> availableActions;

        /* JADX WARN: Multi-variable type inference failed */
        public Product(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list) {
            this.availableActions = list;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getAvailableActions() {
            return this.availableActions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.availableActions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(availableActions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.availableActions;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableActions, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product) other).availableActions);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> availableActions) {
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product(availableActions);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> component1() {
            return this.availableActions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Product product, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = product.availableActions;
            }
            return product.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Shipment;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentShipmentFragment;", "debitInstrumentShipmentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentShipmentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentShipmentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentShipmentFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Shipment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentShipmentFragment;", "getDebitInstrumentShipmentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Shipment {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment;

        public Shipment(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentShipmentFragment, "");
            this.__typename = str;
            this.debitInstrumentShipmentFragment = debitInstrumentShipmentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment getDebitInstrumentShipmentFragment() {
            return this.debitInstrumentShipmentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment = this.debitInstrumentShipmentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Shipment(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentShipmentFragment=");
            sb.append(debitInstrumentShipmentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentShipmentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, shipment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentShipmentFragment, shipment.debitInstrumentShipmentFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentShipmentFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment(__typename, debitInstrumentShipmentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment getDebitInstrumentShipmentFragment() {
            return this.debitInstrumentShipmentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery.Shipment shipment, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment debitInstrumentShipmentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shipment.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentShipmentFragment = shipment.debitInstrumentShipmentFragment;
            }
            return shipment.copy(str, debitInstrumentShipmentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentShipmentQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetDebitInstrumentShipment($input: DebitInstrumentsInput!) { debitInstruments(input: $input) { items { id status { __typename ...DebitInstrumentStatusFragment } productName virtualCard primaryCurrencyCode primary lastNChars product { availableActions } shipment { __typename ...DebitInstrumentShipmentFragment } actions } } }  fragment DebitInstrumentStatusFragment on DebitInstrumentStatus { lifecycleState displayState statusChangeReasons }  fragment DebitInstrumentShipmentFragment on DebitInstrumentShipment { status shipmentDate estimatedArrivalDate }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetDebitInstrumentShipmentQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentShipmentQuery getDebitInstrumentShipmentQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentsInput = getDebitInstrumentShipmentQuery.input;
        }
        return getDebitInstrumentShipmentQuery.copy(debitInstrumentsInput);
    }
}
