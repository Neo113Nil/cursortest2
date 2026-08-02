package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n*+,-./012)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.OPERATION_NAME, "Item", "Pin", "Pricing", "Funding", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "UserPreferences", "FundingSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetDebitInstrumentForRequestPhysicalCardQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data> {
    public static final java.lang.String OPERATION_ID = "4f85a06921fc575ad182e0ebcd71194e9dc9994d307e8bf81b083dd1f2809e9f";
    public static final java.lang.String OPERATION_NAME = "GetDebitInstrumentForRequestPhysicalCardQuery";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Companion(null);
    public static final int $stable = 8;

    public GetDebitInstrumentForRequestPhysicalCardQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput) {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.GetDebitInstrumentForRequestPhysicalCardQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.GetDebitInstrumentForRequestPhysicalCardQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.GetDebitInstrumentForRequestPhysicalCardQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$DebitInstruments;", "debitInstruments", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$DebitInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$DebitInstruments;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$DebitInstruments;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$DebitInstruments;", "getDebitInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments debitInstruments;

        public Data(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            this.debitInstruments = debitInstruments;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments debitInstruments = this.debitInstruments;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstruments, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data) other).debitInstruments);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data(debitInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments debitInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstruments = data.debitInstruments;
            }
            return data.copy(debitInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$DebitInstruments;", "", "", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$DebitInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item> items;

        public DebitInstruments(java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments) other).items);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments(items);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.DebitInstruments debitInstruments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = debitInstruments.items;
            }
            return debitInstruments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Item;", "", "", "id", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pin;", "pin", "", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pricing;", "pricing", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Funding;", "funding", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pin;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Funding;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pin;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Funding;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pin;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Funding;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pin;", "getPin", "Ljava/util/List;", "getPricing", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Funding;", "getFunding"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> pricing;

        public Item(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin, java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> list, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.pin = pin;
            this.pricing = list;
            this.funding = funding;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin getPin() {
            return this.pin;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> getPricing() {
            return this.pricing;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding getFunding() {
            return this.funding;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin = this.pin;
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> list = this.pricing;
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding = this.funding;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", pin=");
            sb.append(pin);
            sb.append(", pricing=");
            sb.append(list);
            sb.append(", funding=");
            sb.append(funding);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin = this.pin;
            int hashCode2 = pin == null ? 0 : pin.hashCode();
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> list = this.pricing;
            int hashCode3 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding = this.funding;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (funding != null ? funding.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item item = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, item.pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.pricing, item.pricing) && kotlin.jvm.internal.Intrinsics.areEqual(this.funding, item.funding);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item copy(java.lang.String id, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin, java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> pricing, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item(id, pin, pricing, funding);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding getFunding() {
            return this.funding;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing> component3() {
            return this.pricing;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin getPin() {
            return this.pin;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Item item, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin, java.util.List list, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                pin = item.pin;
            }
            if ((i & 4) != 0) {
                list = item.pricing;
            }
            if ((i & 8) != 0) {
                funding = item.funding;
            }
            return item.copy(str, pin, list, funding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pin;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;", "origin", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pin;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;", "getOrigin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pin {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin origin;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus status;

        public Pin(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus debitInstrumentPinStatus, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinStatus, "");
            this.status = debitInstrumentPinStatus;
            this.origin = debitInstrumentPinOrigin;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin getOrigin() {
            return this.origin;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus debitInstrumentPinStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin = this.origin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pin(status=");
            sb.append(debitInstrumentPinStatus);
            sb.append(", origin=");
            sb.append(debitInstrumentPinOrigin);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin = this.origin;
            return (hashCode * 31) + (debitInstrumentPinOrigin == null ? 0 : debitInstrumentPinOrigin.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin) other;
            return this.status == pin.status && this.origin == pin.origin;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus status, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin origin) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin(status, origin);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin getOrigin() {
            return this.origin;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pin pin, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus debitInstrumentPinStatus, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentPinStatus = pin.status;
            }
            if ((i & 2) != 0) {
                debitInstrumentPinOrigin = pin.origin;
            }
            return pin.copy(debitInstrumentPinStatus, debitInstrumentPinOrigin);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pricing;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment;", "debitInstrumentPricingFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Pricing;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPricingFragment;", "getDebitInstrumentPricingFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pricing {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment debitInstrumentPricingFragment;

        public Pricing(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment debitInstrumentPricingFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPricingFragment, "");
            this.__typename = str;
            this.debitInstrumentPricingFragment = debitInstrumentPricingFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment getDebitInstrumentPricingFragment() {
            return this.debitInstrumentPricingFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment debitInstrumentPricingFragment = this.debitInstrumentPricingFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pricing(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentPricingFragment=");
            sb.append(debitInstrumentPricingFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentPricingFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing pricing = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, pricing.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentPricingFragment, pricing.debitInstrumentPricingFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment debitInstrumentPricingFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPricingFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing(__typename, debitInstrumentPricingFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment getDebitInstrumentPricingFragment() {
            return this.debitInstrumentPricingFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Pricing pricing, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPricingFragment debitInstrumentPricingFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pricing.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentPricingFragment = pricing.debitInstrumentPricingFragment;
            }
            return pricing.copy(str, debitInstrumentPricingFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Funding;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Configuration;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Configuration;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Configuration;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Funding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Configuration;", "getConfiguration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Funding {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration;

        public Funding(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration) {
            this.configuration = configuration;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration getConfiguration() {
            return this.configuration;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration = this.configuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Funding(configuration=");
            sb.append(configuration);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration = this.configuration;
            if (configuration == null) {
                return 0;
            }
            return configuration.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding) other).configuration);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding copy(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration) {
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding(configuration);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration getConfiguration() {
            return this.configuration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Funding funding, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configuration = funding.configuration;
            }
            return funding.copy(configuration);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Configuration;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$UserPreferences;", "userPreferences", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$UserPreferences;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$UserPreferences;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$UserPreferences;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Configuration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$UserPreferences;", "getUserPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Configuration {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences;

        public Configuration(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences) {
            this.userPreferences = userPreferences;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences getUserPreferences() {
            return this.userPreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences = this.userPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(userPreferences=");
            sb.append(userPreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences = this.userPreferences;
            if (userPreferences == null) {
                return 0;
            }
            return userPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.userPreferences, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration) other).userPreferences);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration copy(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences) {
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration(userPreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences getUserPreferences() {
            return this.userPreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.Configuration configuration, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userPreferences = configuration.userPreferences;
            }
            return configuration.copy(userPreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$UserPreferences;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$FundingSource;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$FundingSource;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$FundingSource;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$FundingSource;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$UserPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$FundingSource;", "getFundingSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserPreferences {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource;

        public UserPreferences(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource) {
            this.fundingSource = fundingSource;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource getFundingSource() {
            return this.fundingSource;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource = this.fundingSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserPreferences(fundingSource=");
            sb.append(fundingSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource = this.fundingSource;
            if (fundingSource == null) {
                return 0;
            }
            return fundingSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences) other).fundingSource);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences copy(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource) {
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences(fundingSource);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource getFundingSource() {
            return this.fundingSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.UserPreferences userPreferences, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingSource = userPreferences.fundingSource;
            }
            return userPreferences.copy(fundingSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$FundingSource;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$FundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingSource {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus status;

        public FundingSource(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus) {
            this.status = debitInstrumentFundingSourceStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(status=");
            sb.append(debitInstrumentFundingSourceStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = this.status;
            if (debitInstrumentFundingSourceStatus == null) {
                return 0;
            }
            return debitInstrumentFundingSourceStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource) && this.status == ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource) other).status;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus status) {
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery.FundingSource fundingSource, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentFundingSourceStatus = fundingSource.status;
            }
            return fundingSource.copy(debitInstrumentFundingSourceStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentForRequestPhysicalCardQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetDebitInstrumentForRequestPhysicalCardQuery($input: DebitInstrumentsInput!) { debitInstruments(input: $input) { items { id pin { status origin } pricing { __typename ...DebitInstrumentPricingFragment } funding { configuration { userPreferences { fundingSource { status } } } } } } }  fragment DebitInstrumentPricingFragment on DebitInstrumentPricing { formattedFee type fee { currencyCode value } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetDebitInstrumentForRequestPhysicalCardQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentForRequestPhysicalCardQuery getDebitInstrumentForRequestPhysicalCardQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentsInput = getDebitInstrumentForRequestPhysicalCardQuery.input;
        }
        return getDebitInstrumentForRequestPhysicalCardQuery.copy(debitInstrumentsInput);
    }
}
