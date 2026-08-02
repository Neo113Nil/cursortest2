package com.paypal.oslo.feature.bnplservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "getInput", "Companion", "Data", "BnplPrequalificationSummary", "SpendingPower"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBnplPrequalificationAmountQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data> {
    public static final java.lang.String OPERATION_ID = "2a993d47f2a1b4ff3fdc5b63df59216b50d1a4cb1addaf37da2ca10d1720c53f";
    public static final java.lang.String OPERATION_NAME = "GetBnplPrequalificationAmount";
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Companion(null);
    public static final int $stable = 8;

    public GetBnplPrequalificationAmountQuery(com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPrequalificationSummaryInput, "");
        this.input = bNPLPrequalificationSummaryInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput getInput() {
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
        com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplPrequalificationAmountQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplPrequalificationAmountQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplservicing.graphql.selections.GetBnplPrequalificationAmountQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$BnplPrequalificationSummary;", com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PREQUALIFICATION_SUMMARY, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$BnplPrequalificationSummary;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$BnplPrequalificationSummary;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$BnplPrequalificationSummary;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$BnplPrequalificationSummary;", "getBnplPrequalificationSummary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary;

        public Data(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary) {
            this.bnplPrequalificationSummary = bnplPrequalificationSummary;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary getBnplPrequalificationSummary() {
            return this.bnplPrequalificationSummary;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary = this.bnplPrequalificationSummary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bnplPrequalificationSummary=");
            sb.append(bnplPrequalificationSummary);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary = this.bnplPrequalificationSummary;
            if (bnplPrequalificationSummary == null) {
                return 0;
            }
            return bnplPrequalificationSummary.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplPrequalificationSummary, ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data) other).bnplPrequalificationSummary);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data copy(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data(bnplPrequalificationSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary getBnplPrequalificationSummary() {
            return this.bnplPrequalificationSummary;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.Data data, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bnplPrequalificationSummary = data.bnplPrequalificationSummary;
            }
            return data.copy(bnplPrequalificationSummary);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$BnplPrequalificationSummary;", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$SpendingPower;", "spendingPower", "", "preQualificationEligible", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$SpendingPower;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$SpendingPower;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$SpendingPower;Z)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$BnplPrequalificationSummary;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$SpendingPower;", "getSpendingPower", "Z", "getPreQualificationEligible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplPrequalificationSummary {
        public static final int $stable = 8;
        private final boolean preQualificationEligible;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower;

        public BnplPrequalificationSummary(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower, boolean z) {
            this.spendingPower = spendingPower;
            this.preQualificationEligible = z;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower getSpendingPower() {
            return this.spendingPower;
        }

        public final boolean getPreQualificationEligible() {
            return this.preQualificationEligible;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower = this.spendingPower;
            boolean z = this.preQualificationEligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplPrequalificationSummary(spendingPower=");
            sb.append(spendingPower);
            sb.append(", preQualificationEligible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower = this.spendingPower;
            return ((spendingPower == null ? 0 : spendingPower.hashCode()) * 31) + java.lang.Boolean.hashCode(this.preQualificationEligible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.spendingPower, bnplPrequalificationSummary.spendingPower) && this.preQualificationEligible == bnplPrequalificationSummary.preQualificationEligible;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary copy(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower, boolean preQualificationEligible) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary(spendingPower, preQualificationEligible);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPreQualificationEligible() {
            return this.preQualificationEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower getSpendingPower() {
            return this.spendingPower;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.BnplPrequalificationSummary bnplPrequalificationSummary, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                spendingPower = bnplPrequalificationSummary.spendingPower;
            }
            if ((i & 2) != 0) {
                z = bnplPrequalificationSummary.preQualificationEligible;
            }
            return bnplPrequalificationSummary.copy(spendingPower, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$SpendingPower;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$SpendingPower;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SpendingPower {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;

        public SpendingPower(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            this.__typename = str;
            this.bnplServicingMoneyFragment = bnplServicingMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment = this.bnplServicingMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SpendingPower(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMoneyFragment=");
            sb.append(bnplServicingMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, spendingPower.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, spendingPower.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery.SpendingPower spendingPower, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = spendingPower.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = spendingPower.bnplServicingMoneyFragment;
            }
            return spendingPower.copy(str, bnplServicingMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPrequalificationAmountQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBnplPrequalificationAmount($input: BNPLPrequalificationSummaryInput!) { bnplPrequalificationSummary(input: $input) { spendingPower { __typename ...BnplServicingMoneyFragment } preQualificationEligible } }  fragment BnplServicingMoneyFragment on Money { currencyCode value }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBnplPrequalificationAmountQuery(input=");
        sb.append(bNPLPrequalificationSummaryInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery) other).input);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery copy(com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery getBnplPrequalificationAmountQuery, com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLPrequalificationSummaryInput = getBnplPrequalificationAmountQuery.input;
        }
        return getBnplPrequalificationAmountQuery.copy(bNPLPrequalificationSummaryInput);
    }
}
