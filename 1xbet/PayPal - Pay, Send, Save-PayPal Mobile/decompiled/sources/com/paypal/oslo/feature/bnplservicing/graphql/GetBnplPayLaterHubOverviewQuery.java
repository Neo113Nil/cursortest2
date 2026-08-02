package com.paypal.oslo.feature.bnplservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004;<=:B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010&JB\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b1\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010!R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b4\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010&R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "activePlansInput", "historyPlansInput", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "prequalSummaryInput", "", "includeActive", "includeHistory", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;ZZ)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "component4", "()Z", "component5", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;ZZ)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansInput;", "getActivePlansInput", "getHistoryPlansInput", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPrequalificationSummaryInput;", "getPrequalSummaryInput", "Z", "getIncludeActive", "getIncludeHistory", "Companion", "Data", "BnplPrequalificationSummary", "SpendingPower"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBnplPayLaterHubOverviewQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data> {
    public static final java.lang.String OPERATION_ID = "93df3d5f35f2973dd3fbe6742750c1fd64d5fb1f0145e8da28da8225c4c205f3";
    public static final java.lang.String OPERATION_NAME = "GetBnplPayLaterHubOverview";
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput activePlansInput;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput historyPlansInput;
    private final boolean includeActive;
    private final boolean includeHistory;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput prequalSummaryInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Companion(null);
    public static final int $stable = 8;

    public GetBnplPayLaterHubOverviewQuery(com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput, com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput2, com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPlansInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPlansInput2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLPrequalificationSummaryInput, "");
        this.activePlansInput = bNPLPlansInput;
        this.historyPlansInput = bNPLPlansInput2;
        this.prequalSummaryInput = bNPLPrequalificationSummaryInput;
        this.includeActive = z;
        this.includeHistory = z2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput getActivePlansInput() {
        return this.activePlansInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput getHistoryPlansInput() {
        return this.historyPlansInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput getPrequalSummaryInput() {
        return this.prequalSummaryInput;
    }

    public final boolean getIncludeActive() {
        return this.includeActive;
    }

    public final boolean getIncludeHistory() {
        return this.includeHistory;
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
        com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplPayLaterHubOverviewQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplPayLaterHubOverviewQuery_ResponseAdapter.Data.INSTANCE, true);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplservicing.graphql.selections.GetBnplPayLaterHubOverviewQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$BnplPrequalificationSummary;", com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.PREQUALIFICATION_SUMMARY, "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;", "bnplServicingPlansOverviewFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$BnplPrequalificationSummary;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$BnplPrequalificationSummary;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$BnplPrequalificationSummary;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$BnplPrequalificationSummary;", "getBnplPrequalificationSummary", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlansOverviewFragment;", "getBnplServicingPlansOverviewFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment;

        public Data(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPlansOverviewFragment, "");
            this.__typename = str;
            this.bnplPrequalificationSummary = bnplPrequalificationSummary;
            this.bnplServicingPlansOverviewFragment = bnplServicingPlansOverviewFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary getBnplPrequalificationSummary() {
            return this.bnplPrequalificationSummary;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment getBnplServicingPlansOverviewFragment() {
            return this.bnplServicingPlansOverviewFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary = this.bnplPrequalificationSummary;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment = this.bnplServicingPlansOverviewFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(__typename=");
            sb.append(str);
            sb.append(", bnplPrequalificationSummary=");
            sb.append(bnplPrequalificationSummary);
            sb.append(", bnplServicingPlansOverviewFragment=");
            sb.append(bnplServicingPlansOverviewFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary = this.bnplPrequalificationSummary;
            return (((hashCode * 31) + (bnplPrequalificationSummary == null ? 0 : bnplPrequalificationSummary.hashCode())) * 31) + this.bnplServicingPlansOverviewFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data data = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, data.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplPrequalificationSummary, data.bnplPrequalificationSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPlansOverviewFragment, data.bnplServicingPlansOverviewFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPlansOverviewFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data(__typename, bnplPrequalificationSummary, bnplServicingPlansOverviewFragment);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment getBnplServicingPlansOverviewFragment() {
            return this.bnplServicingPlansOverviewFragment;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary getBnplPrequalificationSummary() {
            return this.bnplPrequalificationSummary;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.Data data, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlansOverviewFragment bnplServicingPlansOverviewFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = data.__typename;
            }
            if ((i & 2) != 0) {
                bnplPrequalificationSummary = data.bnplPrequalificationSummary;
            }
            if ((i & 4) != 0) {
                bnplServicingPlansOverviewFragment = data.bnplServicingPlansOverviewFragment;
            }
            return data.copy(str, bnplPrequalificationSummary, bnplServicingPlansOverviewFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$BnplPrequalificationSummary;", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$SpendingPower;", "spendingPower", "", "preQualificationEligible", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$SpendingPower;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$SpendingPower;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$SpendingPower;Z)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$BnplPrequalificationSummary;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$SpendingPower;", "getSpendingPower", "Z", "getPreQualificationEligible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplPrequalificationSummary {
        public static final int $stable = 8;
        private final boolean preQualificationEligible;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower;

        public BnplPrequalificationSummary(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower, boolean z) {
            this.spendingPower = spendingPower;
            this.preQualificationEligible = z;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower getSpendingPower() {
            return this.spendingPower;
        }

        public final boolean getPreQualificationEligible() {
            return this.preQualificationEligible;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower = this.spendingPower;
            boolean z = this.preQualificationEligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplPrequalificationSummary(spendingPower=");
            sb.append(spendingPower);
            sb.append(", preQualificationEligible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower = this.spendingPower;
            return ((spendingPower == null ? 0 : spendingPower.hashCode()) * 31) + java.lang.Boolean.hashCode(this.preQualificationEligible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.spendingPower, bnplPrequalificationSummary.spendingPower) && this.preQualificationEligible == bnplPrequalificationSummary.preQualificationEligible;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary copy(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower, boolean preQualificationEligible) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary(spendingPower, preQualificationEligible);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getPreQualificationEligible() {
            return this.preQualificationEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower getSpendingPower() {
            return this.spendingPower;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.BnplPrequalificationSummary bnplPrequalificationSummary, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                spendingPower = bnplPrequalificationSummary.spendingPower;
            }
            if ((i & 2) != 0) {
                z = bnplPrequalificationSummary.preQualificationEligible;
            }
            return bnplPrequalificationSummary.copy(spendingPower, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$SpendingPower;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$SpendingPower;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, spendingPower.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, spendingPower.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery.SpendingPower spendingPower, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = spendingPower.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = spendingPower.bnplServicingMoneyFragment;
            }
            return spendingPower.copy(str, bnplServicingMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplPayLaterHubOverviewQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBnplPayLaterHubOverview($activePlansInput: BNPLPlansInput!, $historyPlansInput: BNPLPlansInput!, $prequalSummaryInput: BNPLPrequalificationSummaryInput!, $includeActive: Boolean!, $includeHistory: Boolean!) { __typename ...BnplServicingPlansOverviewFragment bnplPrequalificationSummary(input: $prequalSummaryInput) { spendingPower { __typename ...BnplServicingMoneyFragment } preQualificationEligible } }  fragment BnplServicingMoneyFragment on Money { currencyCode value }  fragment BnplServicingProductFragment on BNPLProduct { creditProductIdentifier name timeZone }  fragment BnplServicingVariantPolicyFragment on BNPLServicingProductVariantPolicy { instrumentFormat usageChannel autopayRequirement }  fragment BnplServicingAlmostCompletePlanFragment on BNPLAlmostCompletePlan { contextualLabel creditAccountId currencyCode currentBalanceAmount { __typename ...BnplServicingMoneyFragment } merchantLogoUrl merchantName planStatus product { __typename ...BnplServicingProductFragment } variantPolicy { __typename ...BnplServicingVariantPolicyFragment } }  fragment BnplServicingCompletedPlanFragment on BNPLCompletedPlan { contextualLabel creditAccountId currencyCode isRefundPending merchantLogoUrl merchantName planCompletedDateTime planStatus product { __typename ...BnplServicingProductFragment } purchaseAmount { __typename ...BnplServicingMoneyFragment } totalInstallmentsCount totalInstallmentsPaid totalInstallmentsRemaining variantPolicy { __typename ...BnplServicingVariantPolicyFragment } }  fragment BnplServicingDelinquentPlanFragment on BNPLDelinquentPlan { contextualLabel creditAccountId currencyCode merchantLogoUrl merchantName overdueAmount { __typename ...BnplServicingMoneyFragment } planStatus product { __typename ...BnplServicingProductFragment } totalInstallmentsCount totalInstallmentsOverdue totalInstallmentsPaid totalInstallmentsRemaining variantPolicy { __typename ...BnplServicingVariantPolicyFragment } }  fragment BnplServicingOnTrackPlanFragment on BNPLOnTrackPlan { contextualLabel creditAccountId currencyCode currentPaymentDue { __typename ...BnplServicingMoneyFragment } isDueToday merchantLogoUrl merchantName nextPaymentDueAmount { __typename ...BnplServicingMoneyFragment } nextPaymentDueDate planStatus product { __typename ...BnplServicingProductFragment } totalInstallmentsCount totalInstallmentsPaid totalInstallmentsRemaining variantPolicy { __typename ...BnplServicingVariantPolicyFragment } }  fragment BnplServicingPastDuePlanFragment on BNPLPastDuePlan { contextualLabel creditAccountId currencyCode merchantLogoUrl merchantName overdueAmount { __typename ...BnplServicingMoneyFragment } planStatus product { __typename ...BnplServicingProductFragment } totalInstallmentsCount totalInstallmentsOverdue totalInstallmentsPaid totalInstallmentsRemaining variantPolicy { __typename ...BnplServicingVariantPolicyFragment } }  fragment BnplServicingPendingPlanFragment on BNPLPendingPlan { contextualLabel creditAccountId currencyCode merchantLogoUrl merchantName planStatus product { __typename ...BnplServicingProductFragment } purchaseAmount { __typename ...BnplServicingMoneyFragment } totalInstallmentsCount totalInstallmentsPaid totalInstallmentsRemaining variantPolicy { __typename ...BnplServicingVariantPolicyFragment } }  fragment BnplServicingVirtualCardFragment on BNPLServicingVirtualCard { cardArt { url thumbnailUrl } }  fragment BnplServicingReadyToUsePlanFragment on BNPLReadyToUsePlan { approvedLoanAmount { __typename ...BnplServicingMoneyFragment } contextualLabel creditAccountId currencyCode merchantLogoUrl planStatus product { __typename ...BnplServicingProductFragment } validityDuration variantPolicy { __typename ...BnplServicingVariantPolicyFragment } virtualCard { __typename ...BnplServicingVirtualCardFragment } }  fragment BnplServicingMaturedPlanFragment on BNPLMaturedPlan { contextualLabel creditAccountId currencyCode isRefundPending merchantLogoUrl merchantName planCompletedDateTime planStatus product { __typename ...BnplServicingProductFragment } purchaseAmount { __typename ...BnplServicingMoneyFragment } variantPolicy { __typename ...BnplServicingVariantPolicyFragment } }  fragment BnplServicingPlansOverviewFragment on Query { bnplServicingActivePlans: bnplPlans(input: $activePlansInput) @include(if: $includeActive) { page { items { __typename ... on BNPLAlmostCompletePlan { __typename ...BnplServicingAlmostCompletePlanFragment } ... on BNPLCompletedPlan { __typename ...BnplServicingCompletedPlanFragment } ... on BNPLDelinquentPlan { __typename ...BnplServicingDelinquentPlanFragment } ... on BNPLOnTrackPlan { __typename ...BnplServicingOnTrackPlanFragment } ... on BNPLPastDuePlan { __typename ...BnplServicingPastDuePlanFragment } ... on BNPLPendingPlan { __typename ...BnplServicingPendingPlanFragment } ... on BNPLReadyToUsePlan { __typename ...BnplServicingReadyToUsePlanFragment } } } } bnplServicingHistoryPlans: bnplPlans(input: $historyPlansInput) @include(if: $includeHistory) { page { items { __typename ... on BNPLCompletedPlan { __typename ...BnplServicingCompletedPlanFragment } ... on BNPLMaturedPlan { __typename ...BnplServicingMaturedPlanFragment } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput = this.activePlansInput;
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput2 = this.historyPlansInput;
        com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput = this.prequalSummaryInput;
        boolean z = this.includeActive;
        boolean z2 = this.includeHistory;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBnplPayLaterHubOverviewQuery(activePlansInput=");
        sb.append(bNPLPlansInput);
        sb.append(", historyPlansInput=");
        sb.append(bNPLPlansInput2);
        sb.append(", prequalSummaryInput=");
        sb.append(bNPLPrequalificationSummaryInput);
        sb.append(", includeActive=");
        sb.append(z);
        sb.append(", includeHistory=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.activePlansInput.hashCode() * 31) + this.historyPlansInput.hashCode()) * 31) + this.prequalSummaryInput.hashCode()) * 31) + java.lang.Boolean.hashCode(this.includeActive)) * 31) + java.lang.Boolean.hashCode(this.includeHistory);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery getBnplPayLaterHubOverviewQuery = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.activePlansInput, getBnplPayLaterHubOverviewQuery.activePlansInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.historyPlansInput, getBnplPayLaterHubOverviewQuery.historyPlansInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.prequalSummaryInput, getBnplPayLaterHubOverviewQuery.prequalSummaryInput) && this.includeActive == getBnplPayLaterHubOverviewQuery.includeActive && this.includeHistory == getBnplPayLaterHubOverviewQuery.includeHistory;
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery copy(com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput activePlansInput, com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput historyPlansInput, com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput prequalSummaryInput, boolean includeActive, boolean includeHistory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activePlansInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyPlansInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prequalSummaryInput, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery(activePlansInput, historyPlansInput, prequalSummaryInput, includeActive, includeHistory);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIncludeHistory() {
        return this.includeHistory;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludeActive() {
        return this.includeActive;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput getPrequalSummaryInput() {
        return this.prequalSummaryInput;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput getHistoryPlansInput() {
        return this.historyPlansInput;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput getActivePlansInput() {
        return this.activePlansInput;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPayLaterHubOverviewQuery getBnplPayLaterHubOverviewQuery, com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput, com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput2, com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLPlansInput = getBnplPayLaterHubOverviewQuery.activePlansInput;
        }
        if ((i & 2) != 0) {
            bNPLPlansInput2 = getBnplPayLaterHubOverviewQuery.historyPlansInput;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansInput bNPLPlansInput3 = bNPLPlansInput2;
        if ((i & 4) != 0) {
            bNPLPrequalificationSummaryInput = getBnplPayLaterHubOverviewQuery.prequalSummaryInput;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPrequalificationSummaryInput bNPLPrequalificationSummaryInput2 = bNPLPrequalificationSummaryInput;
        if ((i & 8) != 0) {
            z = getBnplPayLaterHubOverviewQuery.includeActive;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = getBnplPayLaterHubOverviewQuery.includeHistory;
        }
        return getBnplPayLaterHubOverviewQuery.copy(bNPLPlansInput, bNPLPlansInput3, bNPLPrequalificationSummaryInput2, z3, z2);
    }
}
