package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b*+,-./0)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.OPERATION_NAME, "Item", "CardHolder", "Product", "SmallImage", "Front"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitCardWidgetQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data> {
    public static final java.lang.String OPERATION_ID = "a5f7fca7b8eff1f5784f5fbf4bcc7d6008849cb146ac2e34da5c3aef61662109";
    public static final java.lang.String OPERATION_NAME = "DebitCardWidget";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Companion(null);
    public static final int $stable = 8;

    public DebitCardWidgetQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput) {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.DebitCardWidgetQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitCardWidgetQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.DebitCardWidgetQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$DebitInstruments;", "debitInstruments", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$DebitInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$DebitInstruments;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$DebitInstruments;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$DebitInstruments;", "getDebitInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments debitInstruments;

        public Data(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            this.debitInstruments = debitInstruments;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments debitInstruments = this.debitInstruments;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstruments, ((com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data) other).debitInstruments);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data(debitInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments debitInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstruments = data.debitInstruments;
            }
            return data.copy(debitInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$DebitInstruments;", "", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$DebitInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item> items;

        public DebitInstruments(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments) other).items);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments(items);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.DebitInstruments debitInstruments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = debitInstruments.items;
            }
            return debitInstruments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$CardHolder;", "cardHolder", "", "primary", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Product;", "product", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "debitInstrumentCoreFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$CardHolder;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$CardHolder;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Product;", "component5", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$CardHolder;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$CardHolder;", "getCardHolder", "Ljava/lang/Boolean;", "getPrimary", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Product;", "getProduct", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "getDebitInstrumentCoreFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment;
        private final java.lang.Boolean primary;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product;

        public Item(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder, java.lang.Boolean bool, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCoreFragment, "");
            this.__typename = str;
            this.cardHolder = cardHolder;
            this.primary = bool;
            this.product = product;
            this.debitInstrumentCoreFragment = debitInstrumentCoreFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        public final java.lang.Boolean getPrimary() {
            return this.primary;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment getDebitInstrumentCoreFragment() {
            return this.debitInstrumentCoreFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder = this.cardHolder;
            java.lang.Boolean bool = this.primary;
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product = this.product;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment = this.debitInstrumentCoreFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", cardHolder=");
            sb.append(cardHolder);
            sb.append(", primary=");
            sb.append(bool);
            sb.append(", product=");
            sb.append(product);
            sb.append(", debitInstrumentCoreFragment=");
            sb.append(debitInstrumentCoreFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder = this.cardHolder;
            int hashCode2 = cardHolder == null ? 0 : cardHolder.hashCode();
            java.lang.Boolean bool = this.primary;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product = this.product;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (product != null ? product.hashCode() : 0)) * 31) + this.debitInstrumentCoreFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item item = (com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolder, item.cardHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.primary, item.primary) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, item.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentCoreFragment, item.debitInstrumentCoreFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder, java.lang.Boolean primary, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCoreFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item(__typename, cardHolder, primary, product, debitInstrumentCoreFragment);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment getDebitInstrumentCoreFragment() {
            return this.debitInstrumentCoreFragment;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product getProduct() {
            return this.product;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Item item, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder, java.lang.Boolean bool, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                cardHolder = item.cardHolder;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder2 = cardHolder;
            if ((i & 4) != 0) {
                bool = item.primary;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 8) != 0) {
                product = item.product;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product2 = product;
            if ((i & 16) != 0) {
                debitInstrumentCoreFragment = item.debitInstrumentCoreFragment;
            }
            return item.copy(str, cardHolder2, bool2, product2, debitInstrumentCoreFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$CardHolder;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "debitInstrumentCardHolderFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$CardHolder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "getDebitInstrumentCardHolderFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder = (com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardHolder.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentCardHolderFragment, cardHolder.debitInstrumentCardHolderFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardHolderFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder(__typename, debitInstrumentCardHolderFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment getDebitInstrumentCardHolderFragment() {
            return this.debitInstrumentCardHolderFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.CardHolder cardHolder, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardHolder.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentCardHolderFragment = cardHolder.debitInstrumentCardHolderFragment;
            }
            return cardHolder.copy(str, debitInstrumentCardHolderFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Product;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$SmallImage;", "smallImage", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductCoreFragment;", "debitInstrumentProductCoreFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$SmallImage;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductCoreFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$SmallImage;", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductCoreFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$SmallImage;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductCoreFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Product;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$SmallImage;", "getSmallImage", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductCoreFragment;", "getDebitInstrumentProductCoreFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment debitInstrumentProductCoreFragment;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage;

        public Product(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment debitInstrumentProductCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductCoreFragment, "");
            this.__typename = str;
            this.smallImage = smallImage;
            this.debitInstrumentProductCoreFragment = debitInstrumentProductCoreFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage getSmallImage() {
            return this.smallImage;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment getDebitInstrumentProductCoreFragment() {
            return this.debitInstrumentProductCoreFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage = this.smallImage;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment debitInstrumentProductCoreFragment = this.debitInstrumentProductCoreFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(__typename=");
            sb.append(str);
            sb.append(", smallImage=");
            sb.append(smallImage);
            sb.append(", debitInstrumentProductCoreFragment=");
            sb.append(debitInstrumentProductCoreFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage = this.smallImage;
            return (((hashCode * 31) + (smallImage == null ? 0 : smallImage.hashCode())) * 31) + this.debitInstrumentProductCoreFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product = (com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, product.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.smallImage, product.smallImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentProductCoreFragment, product.debitInstrumentProductCoreFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment debitInstrumentProductCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductCoreFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product(__typename, smallImage, debitInstrumentProductCoreFragment);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment getDebitInstrumentProductCoreFragment() {
            return this.debitInstrumentProductCoreFragment;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage getSmallImage() {
            return this.smallImage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Product product, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment debitInstrumentProductCoreFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = product.__typename;
            }
            if ((i & 2) != 0) {
                smallImage = product.smallImage;
            }
            if ((i & 4) != 0) {
                debitInstrumentProductCoreFragment = product.debitInstrumentProductCoreFragment;
            }
            return product.copy(str, smallImage, debitInstrumentProductCoreFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$SmallImage;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Front;", "front", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Front;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Front;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Front;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$SmallImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Front;", "getFront"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmallImage {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front;

        public SmallImage(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
            this.front = front;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front getFront() {
            return this.front;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front = this.front;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SmallImage(front=");
            sb.append(front);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.front.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.front, ((com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage) other).front);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage copy(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage(front);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front getFront() {
            return this.front;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.SmallImage smallImage, com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                front = smallImage.front;
            }
            return smallImage.copy(front);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Front;", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Front;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getContentType", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Front {
        public static final int $stable = 8;
        private final java.lang.Object contentType;
        private final java.lang.Object referenceUrl;

        public Front(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.contentType = obj;
            this.referenceUrl = obj2;
        }

        public final java.lang.Object getContentType() {
            return this.contentType;
        }

        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.contentType;
            java.lang.Object obj2 = this.referenceUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Front(contentType=");
            sb.append(obj);
            sb.append(", referenceUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contentType.hashCode() * 31) + this.referenceUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front = (com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, front.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, front.referenceUrl);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front copy(java.lang.Object contentType, java.lang.Object referenceUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front(contentType, referenceUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getContentType() {
            return this.contentType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery.Front front, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = front.contentType;
            }
            if ((i & 2) != 0) {
                obj2 = front.referenceUrl;
            }
            return front.copy(obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitCardWidgetQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query DebitCardWidget($input: DebitInstrumentsInput!) { debitInstruments(input: $input) { items { __typename ...DebitInstrumentCoreFragment cardHolder { __typename ...DebitInstrumentCardHolderFragment } primary product { __typename ...DebitInstrumentProductCoreFragment smallImage { front { contentType referenceUrl } } } } } }  fragment DebitInstrumentStatusFragment on DebitInstrumentStatus { lifecycleState displayState statusChangeReasons }  fragment DebitInstrumentPinFragment on DebitInstrumentPin { status profileName origin }  fragment DebitInstrumentShipmentFragment on DebitInstrumentShipment { status shipmentDate estimatedArrivalDate }  fragment DebitInstrumentCoreFragment on DebitInstrument { id productName lastNChars status { __typename ...DebitInstrumentStatusFragment } pin { __typename ...DebitInstrumentPinFragment } shipment { __typename ...DebitInstrumentShipmentFragment } }  fragment DebitInstrumentCardHolderFragment on DebitInstrumentCardHolder { firstName lastName billingAddress { id address { addressLine1 addressLine2 adminArea1 adminArea2 countryCode postalCode } displayAddress normalizationStatus } }  fragment DebitInstrumentProductCoreFragment on DebitInstrumentProduct { name legalName longName shortName largeImage { back { contentType referenceUrl } front { contentType referenceUrl } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardWidgetQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitCardWidgetQuery debitCardWidgetQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentsInput = debitCardWidgetQuery.input;
        }
        return debitCardWidgetQuery.copy(debitInstrumentsInput);
    }
}
