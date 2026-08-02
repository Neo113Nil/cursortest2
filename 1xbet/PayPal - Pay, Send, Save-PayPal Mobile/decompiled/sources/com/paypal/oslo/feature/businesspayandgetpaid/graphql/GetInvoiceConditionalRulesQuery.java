package com.paypal.oslo.feature.businesspayandgetpaid.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005'()*&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Data;", "", "id", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Companion", "Data", "InvoiceConditionalRules", "InvoiceTotalPreRules", "Rule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetInvoiceConditionalRulesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "b2dda849cf44ab4e055601a2a46437d7d1e545e3d38df35f3ea52b4bfc2a1668";
    public static final java.lang.String OPERATION_NAME = "GetInvoiceConditionalRules";
    private final java.lang.String id;

    public GetInvoiceConditionalRulesQuery(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
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
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetInvoiceConditionalRulesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesspayandgetpaid.graphql.selections.GetInvoiceConditionalRulesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "invoiceConditionalRules", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "getInvoiceConditionalRules"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules;

        public Data(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules) {
            this.invoiceConditionalRules = invoiceConditionalRules;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules getInvoiceConditionalRules() {
            return this.invoiceConditionalRules;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules = this.invoiceConditionalRules;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(invoiceConditionalRules=");
            sb.append(invoiceConditionalRules);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules = this.invoiceConditionalRules;
            if (invoiceConditionalRules == null) {
                return 0;
            }
            return invoiceConditionalRules.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceConditionalRules, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data) other).invoiceConditionalRules);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data(invoiceConditionalRules);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules getInvoiceConditionalRules() {
            return this.invoiceConditionalRules;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data data, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                invoiceConditionalRules = data.invoiceConditionalRules;
            }
            return data.copy(invoiceConditionalRules);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;", "invoiceTotalPreRules", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Rule;", "rules", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;Ljava/util/List;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;", "getInvoiceTotalPreRules", "Ljava/util/List;", "getRules"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvoiceConditionalRules {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules;
        private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> rules;

        public InvoiceConditionalRules(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.invoiceTotalPreRules = invoiceTotalPreRules;
            this.rules = list;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules getInvoiceTotalPreRules() {
            return this.invoiceTotalPreRules;
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> getRules() {
            return this.rules;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules = this.invoiceTotalPreRules;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> list = this.rules;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceConditionalRules(invoiceTotalPreRules=");
            sb.append(invoiceTotalPreRules);
            sb.append(", rules=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules = this.invoiceTotalPreRules;
            return ((invoiceTotalPreRules == null ? 0 : invoiceTotalPreRules.hashCode()) * 31) + this.rules.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceTotalPreRules, invoiceConditionalRules.invoiceTotalPreRules) && kotlin.jvm.internal.Intrinsics.areEqual(this.rules, invoiceConditionalRules.rules);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> rules) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules(invoiceTotalPreRules, rules);
        }

        public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> component2() {
            return this.rules;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules getInvoiceTotalPreRules() {
            return this.invoiceTotalPreRules;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                invoiceTotalPreRules = invoiceConditionalRules.invoiceTotalPreRules;
            }
            if ((i & 2) != 0) {
                list = invoiceConditionalRules.rules;
            }
            return invoiceConditionalRules.copy(invoiceTotalPreRules, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;", "", "", "__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "moneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceTotalPreRules;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/MoneyFragment;", "getMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvoiceTotalPreRules {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;

        public InvoiceTotalPreRules(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            this.__typename = str;
            this.moneyFragment = moneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment = this.moneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceTotalPreRules(__typename=");
            sb.append(str);
            sb.append(", moneyFragment=");
            sb.append(moneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.moneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, invoiceTotalPreRules.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyFragment, invoiceTotalPreRules.moneyFragment);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules copy(java.lang.String __typename, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyFragment, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules(__typename, moneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment getMoneyFragment() {
            return this.moneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invoiceTotalPreRules.__typename;
            }
            if ((i & 2) != 0) {
                moneyFragment = invoiceTotalPreRules.moneyFragment;
            }
            return invoiceTotalPreRules.copy(str, moneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017JT\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b\n\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b\u000b\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Rule;", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleType;", "conditionalRuleType", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountType;", "conditionalRuleValueType", "", "conditionalRuleValue", "effectiveDate", "", "isActive", "isCurrentlyApplicable", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleType;Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountType;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Object;", "component5", "()Ljava/lang/Boolean;", "component6", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleType;Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Rule;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceConditionalRuleType;", "getConditionalRuleType", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceDiscountType;", "getConditionalRuleValueType", "Ljava/lang/String;", "getConditionalRuleValue", "Ljava/lang/Object;", "getEffectiveDate", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Rule {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType conditionalRuleType;
        private final java.lang.String conditionalRuleValue;
        private final com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType conditionalRuleValueType;
        private final java.lang.Object effectiveDate;
        private final java.lang.Boolean isActive;
        private final java.lang.Boolean isCurrentlyApplicable;

        public Rule(com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType invoiceConditionalRuleType, com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType invoiceDiscountType, java.lang.String str, java.lang.Object obj, java.lang.Boolean bool, java.lang.Boolean bool2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceConditionalRuleType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.conditionalRuleType = invoiceConditionalRuleType;
            this.conditionalRuleValueType = invoiceDiscountType;
            this.conditionalRuleValue = str;
            this.effectiveDate = obj;
            this.isActive = bool;
            this.isCurrentlyApplicable = bool2;
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType getConditionalRuleType() {
            return this.conditionalRuleType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType getConditionalRuleValueType() {
            return this.conditionalRuleValueType;
        }

        public final java.lang.String getConditionalRuleValue() {
            return this.conditionalRuleValue;
        }

        public final java.lang.Object getEffectiveDate() {
            return this.effectiveDate;
        }

        public final java.lang.Boolean isActive() {
            return this.isActive;
        }

        public final java.lang.Boolean isCurrentlyApplicable() {
            return this.isCurrentlyApplicable;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType invoiceConditionalRuleType = this.conditionalRuleType;
            com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType invoiceDiscountType = this.conditionalRuleValueType;
            java.lang.String str = this.conditionalRuleValue;
            java.lang.Object obj = this.effectiveDate;
            java.lang.Boolean bool = this.isActive;
            java.lang.Boolean bool2 = this.isCurrentlyApplicable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Rule(conditionalRuleType=");
            sb.append(invoiceConditionalRuleType);
            sb.append(", conditionalRuleValueType=");
            sb.append(invoiceDiscountType);
            sb.append(", conditionalRuleValue=");
            sb.append(str);
            sb.append(", effectiveDate=");
            sb.append(obj);
            sb.append(", isActive=");
            sb.append(bool);
            sb.append(", isCurrentlyApplicable=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.conditionalRuleType.hashCode();
            com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType invoiceDiscountType = this.conditionalRuleValueType;
            int hashCode2 = invoiceDiscountType == null ? 0 : invoiceDiscountType.hashCode();
            java.lang.String str = this.conditionalRuleValue;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.effectiveDate.hashCode();
            java.lang.Boolean bool = this.isActive;
            int hashCode5 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.isCurrentlyApplicable;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule rule = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule) other;
            return this.conditionalRuleType == rule.conditionalRuleType && this.conditionalRuleValueType == rule.conditionalRuleValueType && kotlin.jvm.internal.Intrinsics.areEqual(this.conditionalRuleValue, rule.conditionalRuleValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveDate, rule.effectiveDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.isActive, rule.isActive) && kotlin.jvm.internal.Intrinsics.areEqual(this.isCurrentlyApplicable, rule.isCurrentlyApplicable);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule copy(com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType conditionalRuleType, com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType conditionalRuleValueType, java.lang.String conditionalRuleValue, java.lang.Object effectiveDate, java.lang.Boolean isActive, java.lang.Boolean isCurrentlyApplicable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conditionalRuleType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effectiveDate, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule(conditionalRuleType, conditionalRuleValueType, conditionalRuleValue, effectiveDate, isActive, isCurrentlyApplicable);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getIsCurrentlyApplicable() {
            return this.isCurrentlyApplicable;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getEffectiveDate() {
            return this.effectiveDate;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConditionalRuleValue() {
            return this.conditionalRuleValue;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType getConditionalRuleValueType() {
            return this.conditionalRuleValueType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType getConditionalRuleType() {
            return this.conditionalRuleType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule rule, com.paypal.oslo.api.graphql.schema.type.InvoiceConditionalRuleType invoiceConditionalRuleType, com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType invoiceDiscountType, java.lang.String str, java.lang.Object obj, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                invoiceConditionalRuleType = rule.conditionalRuleType;
            }
            if ((i & 2) != 0) {
                invoiceDiscountType = rule.conditionalRuleValueType;
            }
            com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType invoiceDiscountType2 = invoiceDiscountType;
            if ((i & 4) != 0) {
                str = rule.conditionalRuleValue;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                obj = rule.effectiveDate;
            }
            java.lang.Object obj3 = obj;
            if ((i & 16) != 0) {
                bool = rule.isActive;
            }
            java.lang.Boolean bool3 = bool;
            if ((i & 32) != 0) {
                bool2 = rule.isCurrentlyApplicable;
            }
            return rule.copy(invoiceConditionalRuleType, invoiceDiscountType2, str2, obj3, bool3, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetInvoiceConditionalRules($id: ID!) { invoiceConditionalRules(id: $id) { invoiceTotalPreRules { __typename ...MoneyFragment } rules { conditionalRuleType conditionalRuleValueType conditionalRuleValue effectiveDate isActive isCurrentlyApplicable } } }  fragment MoneyFragment on Money { value currencyCode }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetInvoiceConditionalRulesQuery(id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery) other).id);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery getInvoiceConditionalRulesQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getInvoiceConditionalRulesQuery.id;
        }
        return getInvoiceConditionalRulesQuery.copy(str);
    }
}
