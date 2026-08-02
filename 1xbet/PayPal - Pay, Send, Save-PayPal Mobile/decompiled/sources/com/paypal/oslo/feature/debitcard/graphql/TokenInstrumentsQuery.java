package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;)Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentsQuery.OPERATION_NAME, "Item", "Status", "Token"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TokenInstrumentsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "3fdf9f704ff42489d37ecc60283d5854875b9ed46dcfe33e09bab774bbcfeb15";
    public static final java.lang.String OPERATION_NAME = "TokenInstruments";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Companion(null);
    public static final int $stable = 8;

    public TokenInstrumentsQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput) {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.TokenInstrumentsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.TokenInstrumentsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.TokenInstrumentsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$DebitInstruments;", "debitInstruments", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$DebitInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$DebitInstruments;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$DebitInstruments;)Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$DebitInstruments;", "getDebitInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments debitInstruments;

        public Data(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            this.debitInstruments = debitInstruments;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments debitInstruments = this.debitInstruments;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstruments, ((com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data) other).debitInstruments);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments debitInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstruments, "");
            return new com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data(debitInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments getDebitInstruments() {
            return this.debitInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments debitInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstruments = data.debitInstruments;
            }
            return data.copy(debitInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$DebitInstruments;", "", "", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$DebitInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item> items;

        public DebitInstruments(java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item> list = this.items;
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
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments) other).items);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments(items);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments copy$default(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.DebitInstruments debitInstruments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = debitInstruments.items;
            }
            return debitInstruments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019Jb\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0019R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b/\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Item;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "lastNChars", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Status;", "status", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Token;", "tokens", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Status;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Status;", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Status;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Ljava/lang/Object;", "getLastNChars", "Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Status;", "getStatus", "Ljava/util/List;", "getActions", "getTokens"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions;
        private final java.lang.String id;
        private final java.lang.Object lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;
        private final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> tokens;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Object obj, com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list, java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.productName = debitInstrumentProductName;
            this.lastNChars = obj;
            this.status = status;
            this.actions = list;
            this.tokens = list2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getActions() {
            return this.actions;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> getTokens() {
            return this.tokens;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            java.lang.Object obj = this.lastNChars;
            com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status = this.status;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> list2 = this.tokens;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitInstrumentProductName);
            sb.append(", lastNChars=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(status);
            sb.append(", actions=");
            sb.append(list);
            sb.append(", tokens=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            int hashCode2 = debitInstrumentProductName == null ? 0 : debitInstrumentProductName.hashCode();
            java.lang.Object obj = this.lastNChars;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status = this.status;
            int hashCode4 = status == null ? 0 : status.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            int hashCode5 = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> list2 = this.tokens;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item item = (com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && this.productName == item.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, item.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, item.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, item.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokens, item.tokens);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, java.lang.Object lastNChars, com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions, java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> tokens) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item(id, productName, lastNChars, status, actions, tokens);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token> component6() {
            return this.tokens;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> component5() {
            return this.actions;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item copy$default(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Item item, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Object obj, com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status, java.util.List list, java.util.List list2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = item.id;
            }
            if ((i & 2) != 0) {
                debitInstrumentProductName = item.productName;
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName2 = debitInstrumentProductName;
            if ((i & 4) != 0) {
                obj = item.lastNChars;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                status = item.status;
            }
            com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status2 = status;
            if ((i & 16) != 0) {
                list = item.actions;
            }
            java.util.List list3 = list;
            if ((i & 32) != 0) {
                list2 = item.tokens;
            }
            return item.copy(str, debitInstrumentProductName2, obj3, status2, list3, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Status;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "lifecycleState", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;)Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Status;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "getLifecycleState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState lifecycleState;

        public Status(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState) {
            this.lifecycleState = debitInstrumentLifecycleState;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getLifecycleState() {
            return this.lifecycleState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Status(lifecycleState=");
            sb.append(debitInstrumentLifecycleState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
            if (debitInstrumentLifecycleState == null) {
                return 0;
            }
            return debitInstrumentLifecycleState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status) && this.lifecycleState == ((com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status) other).lifecycleState;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState lifecycleState) {
            return new com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status(lifecycleState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getLifecycleState() {
            return this.lifecycleState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status copy$default(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Status status, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentLifecycleState = status.lifecycleState;
            }
            return status.copy(debitInstrumentLifecycleState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Token;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;", "debitInstrumentTokenFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Token;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentTokenFragment;", "getDebitInstrumentTokenFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Token {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment;

        public Token(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenFragment, "");
            this.__typename = str;
            this.debitInstrumentTokenFragment = debitInstrumentTokenFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment getDebitInstrumentTokenFragment() {
            return this.debitInstrumentTokenFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment = this.debitInstrumentTokenFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Token(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentTokenFragment=");
            sb.append(debitInstrumentTokenFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentTokenFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token token = (com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, token.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentTokenFragment, token.debitInstrumentTokenFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token(__typename, debitInstrumentTokenFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment getDebitInstrumentTokenFragment() {
            return this.debitInstrumentTokenFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token copy$default(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery.Token token, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentTokenFragment debitInstrumentTokenFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = token.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentTokenFragment = token.debitInstrumentTokenFragment;
            }
            return token.copy(str, debitInstrumentTokenFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/TokenInstrumentsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query TokenInstruments($input: DebitInstrumentsInput!) { debitInstruments(input: $input) { items { id productName lastNChars status { lifecycleState } actions tokens { __typename ...DebitInstrumentTokenFragment } } } }  fragment DebitInstrumentTokenFragment on DebitInstrumentToken { externalReferenceId deviceInfo { deviceName } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenInstrumentsQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.TokenInstrumentsQuery tokenInstrumentsQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsInput debitInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentsInput = tokenInstrumentsQuery.input;
        }
        return tokenInstrumentsQuery.copy(debitInstrumentsInput);
    }
}
