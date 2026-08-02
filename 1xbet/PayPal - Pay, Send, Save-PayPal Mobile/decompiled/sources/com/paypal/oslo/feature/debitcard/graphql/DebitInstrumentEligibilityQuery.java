package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.OPERATION_NAME, "EligibilityReason", "EligibleInstrumentProduct"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "41e75bf21cf019a9870154a2a226b17c0a6995682c200d8e54072fb7e106015a";
    public static final java.lang.String OPERATION_NAME = "DebitInstrumentEligibility";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public DebitInstrumentEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput debitInstrumentEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentEligibilityInput, "");
        this.input = debitInstrumentEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.DebitInstrumentEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$DebitInstrumentEligibility;", "debitInstrumentEligibility", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$DebitInstrumentEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$DebitInstrumentEligibility;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$DebitInstrumentEligibility;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$DebitInstrumentEligibility;", "getDebitInstrumentEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility;

        public Data(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentEligibility, "");
            this.debitInstrumentEligibility = debitInstrumentEligibility;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility getDebitInstrumentEligibility() {
            return this.debitInstrumentEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility = this.debitInstrumentEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(debitInstrumentEligibility=");
            sb.append(debitInstrumentEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstrumentEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentEligibility, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data) other).debitInstrumentEligibility);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentEligibility, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data(debitInstrumentEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility getDebitInstrumentEligibility() {
            return this.debitInstrumentEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentEligibility = data.debitInstrumentEligibility;
            }
            return data.copy(debitInstrumentEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$DebitInstrumentEligibility;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;", "eligibilityStatus", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$EligibilityReason;", "eligibilityReason", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$EligibleInstrumentProduct;", "eligibleInstrumentProducts", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$DebitInstrumentEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;", "getEligibilityStatus", "Ljava/util/List;", "getEligibilityReason", "getEligibleInstrumentProducts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrumentEligibility {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> eligibilityReason;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus eligibilityStatus;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct> eligibleInstrumentProducts;

        public DebitInstrumentEligibility(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus debitInstrumentEligibilityStatus, java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> list, java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentEligibilityStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.eligibilityStatus = debitInstrumentEligibilityStatus;
            this.eligibilityReason = list;
            this.eligibleInstrumentProducts = list2;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> getEligibilityReason() {
            return this.eligibilityReason;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct> getEligibleInstrumentProducts() {
            return this.eligibleInstrumentProducts;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus debitInstrumentEligibilityStatus = this.eligibilityStatus;
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> list = this.eligibilityReason;
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct> list2 = this.eligibleInstrumentProducts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentEligibility(eligibilityStatus=");
            sb.append(debitInstrumentEligibilityStatus);
            sb.append(", eligibilityReason=");
            sb.append(list);
            sb.append(", eligibleInstrumentProducts=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.eligibilityStatus.hashCode();
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> list = this.eligibilityReason;
            return (((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.eligibleInstrumentProducts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility) other;
            return this.eligibilityStatus == debitInstrumentEligibility.eligibilityStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibilityReason, debitInstrumentEligibility.eligibilityReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleInstrumentProducts, debitInstrumentEligibility.eligibleInstrumentProducts);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus eligibilityStatus, java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> eligibilityReason, java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct> eligibleInstrumentProducts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleInstrumentProducts, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility(eligibilityStatus, eligibilityReason, eligibleInstrumentProducts);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct> component3() {
            return this.eligibleInstrumentProducts;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> component2() {
            return this.eligibilityReason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus debitInstrumentEligibilityStatus, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentEligibilityStatus = debitInstrumentEligibility.eligibilityStatus;
            }
            if ((i & 2) != 0) {
                list = debitInstrumentEligibility.eligibilityReason;
            }
            if ((i & 4) != 0) {
                list2 = debitInstrumentEligibility.eligibleInstrumentProducts;
            }
            return debitInstrumentEligibility.copy(debitInstrumentEligibilityStatus, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$EligibilityReason;", "", "", "reason", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$EligibilityReason;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityReason {
        public static final int $stable = 0;
        private final java.lang.String description;
        private final java.lang.String reason;

        public EligibilityReason(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
            this.description = str2;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.String str2 = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityReason(reason=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode();
            java.lang.String str = this.description;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason eligibilityReason = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, eligibilityReason.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, eligibilityReason.description);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason copy(java.lang.String reason, java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason(reason, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason eligibilityReason, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = eligibilityReason.reason;
            }
            if ((i & 2) != 0) {
                str2 = eligibilityReason.description;
            }
            return eligibilityReason.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$EligibleInstrumentProduct;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "name", "virtualCardHolderAgreementUrl", "privacyPolicyUrl", "", "shortName", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$EligibleInstrumentProduct;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getName", "Ljava/lang/Object;", "getVirtualCardHolderAgreementUrl", "getPrivacyPolicyUrl", "Ljava/lang/String;", "getShortName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibleInstrumentProduct {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName name;
        private final java.lang.Object privacyPolicyUrl;
        private final java.lang.String shortName;
        private final java.lang.Object virtualCardHolderAgreementUrl;

        public EligibleInstrumentProduct(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Object obj, java.lang.Object obj2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductName, "");
            this.name = debitInstrumentProductName;
            this.virtualCardHolderAgreementUrl = obj;
            this.privacyPolicyUrl = obj2;
            this.shortName = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getName() {
            return this.name;
        }

        public final java.lang.Object getVirtualCardHolderAgreementUrl() {
            return this.virtualCardHolderAgreementUrl;
        }

        public final java.lang.Object getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        public final java.lang.String getShortName() {
            return this.shortName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.name;
            java.lang.Object obj = this.virtualCardHolderAgreementUrl;
            java.lang.Object obj2 = this.privacyPolicyUrl;
            java.lang.String str = this.shortName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleInstrumentProduct(name=");
            sb.append(debitInstrumentProductName);
            sb.append(", virtualCardHolderAgreementUrl=");
            sb.append(obj);
            sb.append(", privacyPolicyUrl=");
            sb.append(obj2);
            sb.append(", shortName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.Object obj = this.virtualCardHolderAgreementUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.privacyPolicyUrl;
            int hashCode3 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.String str = this.shortName;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct eligibleInstrumentProduct = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct) other;
            return this.name == eligibleInstrumentProduct.name && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCardHolderAgreementUrl, eligibleInstrumentProduct.virtualCardHolderAgreementUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacyPolicyUrl, eligibleInstrumentProduct.privacyPolicyUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.shortName, eligibleInstrumentProduct.shortName);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName name2, java.lang.Object virtualCardHolderAgreementUrl, java.lang.Object privacyPolicyUrl, java.lang.String shortName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct(name2, virtualCardHolderAgreementUrl, privacyPolicyUrl, shortName);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getShortName() {
            return this.shortName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getVirtualCardHolderAgreementUrl() {
            return this.virtualCardHolderAgreementUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct eligibleInstrumentProduct, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Object obj, java.lang.Object obj2, java.lang.String str, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                debitInstrumentProductName = eligibleInstrumentProduct.name;
            }
            if ((i & 2) != 0) {
                obj = eligibleInstrumentProduct.virtualCardHolderAgreementUrl;
            }
            if ((i & 4) != 0) {
                obj2 = eligibleInstrumentProduct.privacyPolicyUrl;
            }
            if ((i & 8) != 0) {
                str = eligibleInstrumentProduct.shortName;
            }
            return eligibleInstrumentProduct.copy(debitInstrumentProductName, obj, obj2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query DebitInstrumentEligibility($input: DebitInstrumentEligibilityInput!) { debitInstrumentEligibility(input: $input) { eligibilityStatus eligibilityReason { reason description } eligibleInstrumentProducts { name virtualCardHolderAgreementUrl privacyPolicyUrl shortName } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput debitInstrumentEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentEligibilityQuery(input=");
        sb.append(debitInstrumentEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery debitInstrumentEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput debitInstrumentEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentEligibilityInput = debitInstrumentEligibilityQuery.input;
        }
        return debitInstrumentEligibilityQuery.copy(debitInstrumentEligibilityInput);
    }
}
