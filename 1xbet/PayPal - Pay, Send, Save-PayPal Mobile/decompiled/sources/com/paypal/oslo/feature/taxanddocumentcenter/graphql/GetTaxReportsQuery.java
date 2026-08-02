package com.paypal.oslo.feature.taxanddocumentcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/TaxReportsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportsInput;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportsInput;", "getInput", "Companion", "Data", "TaxReports", "Item", "Correction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetTaxReportsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "e7c1c2173ed2cb8713966f52a889fdaa863aa1ce52c1cf0def01e45b4df0ec9c";
    public static final java.lang.String OPERATION_NAME = "GetTaxReports";
    private final com.paypal.oslo.api.graphql.schema.type.TaxReportsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Companion INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Companion(null);
    public static final int $stable = 8;

    public GetTaxReportsQuery(com.paypal.oslo.api.graphql.schema.type.TaxReportsInput taxReportsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportsInput, "");
        this.input = taxReportsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.TaxReportsInput getInput() {
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
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.GetTaxReportsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.taxanddocumentcenter.graphql.selections.GetTaxReportsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;", "taxReports", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;", "getTaxReports"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports;

        public Data(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReports, "");
            this.taxReports = taxReports;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports getTaxReports() {
            return this.taxReports;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports = this.taxReports;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(taxReports=");
            sb.append(taxReports);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.taxReports.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxReports, ((com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data) other).taxReports);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data copy(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReports, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data(taxReports);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports getTaxReports() {
            return this.taxReports;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data copy$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Data data, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                taxReports = data.taxReports;
            }
            return data.copy(taxReports);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;", "", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$TaxReports;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxReports {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> items;

        public TaxReports(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> list) {
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxReports(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports) other).items);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports copy(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> items) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports(items);
        }

        public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports copy$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.TaxReports taxReports, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = taxReports.items;
            }
            return taxReports.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0086\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b:\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b;\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Item;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportMode;", "mode", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "type", "name", "createdTime", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "downloadId", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "correctionFlowStatus", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Correction;", "correction", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportMode;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Correction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/TaxReportMode;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "component5", "component6", "()Ljava/lang/Object;", "component7", "component8", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "component10", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Correction;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportMode;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Correction;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportMode;", "getMode", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportType;", "getType", "getName", "Ljava/lang/Object;", "getCreatedTime", "getAccountNumber", "getDownloadId", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionFlowStatus;", "getCorrectionFlowStatus", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Correction;", "getCorrection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String accountNumber;
        private final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction;
        private final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus correctionFlowStatus;
        private final java.lang.Object createdTime;
        private final java.lang.String downloadId;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.TaxReportMode mode;
        private final java.lang.String name;
        private final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.TaxReportType type;

        public Item(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.TaxReportMode taxReportMode, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus, com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType, java.lang.String str2, java.lang.Object obj, java.lang.String str3, java.lang.String str4, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportType, "");
            this.id = str;
            this.mode = taxReportMode;
            this.status = taxReportStatus;
            this.type = taxReportType;
            this.name = str2;
            this.createdTime = obj;
            this.accountNumber = str3;
            this.downloadId = str4;
            this.correctionFlowStatus = taxReportCorrectionFlowStatus;
            this.correction = correction;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportMode getMode() {
            return this.mode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportType getType() {
            return this.type;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        public final java.lang.String getDownloadId() {
            return this.downloadId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus getCorrectionFlowStatus() {
            return this.correctionFlowStatus;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction getCorrection() {
            return this.correction;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.TaxReportMode taxReportMode = this.mode;
            com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.TaxReportType taxReportType = this.type;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.createdTime;
            java.lang.String str3 = this.accountNumber;
            java.lang.String str4 = this.downloadId;
            com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus = this.correctionFlowStatus;
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction = this.correction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", mode=");
            sb.append(taxReportMode);
            sb.append(", status=");
            sb.append(taxReportStatus);
            sb.append(", type=");
            sb.append(taxReportType);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", createdTime=");
            sb.append(obj);
            sb.append(", accountNumber=");
            sb.append(str3);
            sb.append(", downloadId=");
            sb.append(str4);
            sb.append(", correctionFlowStatus=");
            sb.append(taxReportCorrectionFlowStatus);
            sb.append(", correction=");
            sb.append(correction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.TaxReportMode taxReportMode = this.mode;
            int hashCode2 = taxReportMode == null ? 0 : taxReportMode.hashCode();
            com.paypal.oslo.api.graphql.schema.type.TaxReportStatus taxReportStatus = this.status;
            int hashCode3 = taxReportStatus == null ? 0 : taxReportStatus.hashCode();
            int hashCode4 = this.type.hashCode();
            java.lang.String str2 = this.name;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            java.lang.Object obj = this.createdTime;
            int hashCode6 = obj == null ? 0 : obj.hashCode();
            java.lang.String str3 = this.accountNumber;
            int hashCode7 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.downloadId;
            int hashCode8 = str4 == null ? 0 : str4.hashCode();
            com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus taxReportCorrectionFlowStatus = this.correctionFlowStatus;
            int hashCode9 = taxReportCorrectionFlowStatus == null ? 0 : taxReportCorrectionFlowStatus.hashCode();
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction = this.correction;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (correction != null ? correction.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item item = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && this.mode == item.mode && this.status == item.status && this.type == item.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, item.createdTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, item.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadId, item.downloadId) && this.correctionFlowStatus == item.correctionFlowStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.correction, item.correction);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.TaxReportMode mode, com.paypal.oslo.api.graphql.schema.type.TaxReportStatus status, com.paypal.oslo.api.graphql.schema.type.TaxReportType type, java.lang.String name2, java.lang.Object createdTime, java.lang.String accountNumber, java.lang.String downloadId, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus correctionFlowStatus, com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Item(id, mode, status, type, name2, createdTime, accountNumber, downloadId, correctionFlowStatus, correction);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionFlowStatus getCorrectionFlowStatus() {
            return this.correctionFlowStatus;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getDownloadId() {
            return this.downloadId;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportMode getMode() {
            return this.mode;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction getCorrection() {
            return this.correction;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Correction;", "", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "status", "", "id", "deepLink", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Correction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/TaxReportCorrectionStatus;", "getStatus", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getDeepLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Correction {
        public static final int $stable = 8;
        private final java.lang.Object deepLink;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus status;

        public Correction(com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus, java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxReportCorrectionStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.status = taxReportCorrectionStatus;
            this.id = str;
            this.deepLink = obj;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus = this.status;
            java.lang.String str = this.id;
            java.lang.Object obj = this.deepLink;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Correction(status=");
            sb.append(taxReportCorrectionStatus);
            sb.append(", id=");
            sb.append(str);
            sb.append(", deepLink=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.status.hashCode() * 31) + this.id.hashCode()) * 31) + this.deepLink.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction) other;
            return this.status == correction.status && kotlin.jvm.internal.Intrinsics.areEqual(this.id, correction.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, correction.deepLink);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction copy(com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus status, java.lang.String id, java.lang.Object deepLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction(status, id, deepLink);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction copy$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery.Correction correction, com.paypal.oslo.api.graphql.schema.type.TaxReportCorrectionStatus taxReportCorrectionStatus, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                taxReportCorrectionStatus = correction.status;
            }
            if ((i & 2) != 0) {
                str = correction.id;
            }
            if ((i & 4) != 0) {
                obj = correction.deepLink;
            }
            return correction.copy(taxReportCorrectionStatus, str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/GetTaxReportsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetTaxReports($input: TaxReportsInput!) { taxReports(input: $input) { items { id mode status type name createdTime accountNumber downloadId correctionFlowStatus correction { status id deepLink } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.TaxReportsInput taxReportsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetTaxReportsQuery(input=");
        sb.append(taxReportsInput);
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
        return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery) other).input);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery copy(com.paypal.oslo.api.graphql.schema.type.TaxReportsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.TaxReportsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery copy$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.GetTaxReportsQuery getTaxReportsQuery, com.paypal.oslo.api.graphql.schema.type.TaxReportsInput taxReportsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxReportsInput = getTaxReportsQuery.input;
        }
        return getTaxReportsQuery.copy(taxReportsInput);
    }
}
