package com.paypal.oslo.feature.pools.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f*+,-./01234)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolsInput;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolsInput;", "getInput", "Companion", "Data", "MoneyPools", "Page", "Item", "Creator", "Name", "AccountBalance", "TargetAmount", "AvailableBalance", "TotalContributionAmount", "Metadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetMoneyPoolsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "8939adefccd88573218abffe03e72964293e1270468a8483b862c742346a8c30";
    public static final java.lang.String OPERATION_NAME = "GetMoneyPools";
    private final com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Companion INSTANCE = new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Companion(null);
    public static final int $stable = 8;

    public GetMoneyPoolsQuery(com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput moneyPoolsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPoolsInput, "");
        this.input = moneyPoolsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput getInput() {
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
        com.paypal.oslo.feature.pools.graphql.adapter.GetMoneyPoolsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.pools.graphql.adapter.GetMoneyPoolsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.pools.graphql.selections.GetMoneyPoolsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$MoneyPools;", "moneyPools", "<init>", "(Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$MoneyPools;)V", "component1", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$MoneyPools;", "copy", "(Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$MoneyPools;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$MoneyPools;", "getMoneyPools"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools;

        public Data(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPools, "");
            this.moneyPools = moneyPools;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools getMoneyPools() {
            return this.moneyPools;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools = this.moneyPools;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(moneyPools=");
            sb.append(moneyPools);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.moneyPools.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyPools, ((com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data) other).moneyPools);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data copy(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPools, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data(moneyPools);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools getMoneyPools() {
            return this.moneyPools;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data data, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyPools = data.moneyPools;
            }
            return data.copy(moneyPools);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$MoneyPools;", "", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Page;", "page", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "<init>", "(Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Page;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Page;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Page;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$MoneyPools;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Page;", "getPage", "Ljava/lang/Integer;", "getTotalCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyPools {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page;
        private final java.lang.Integer totalCount;

        public MoneyPools(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
            this.totalCount = num;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page = this.page;
            java.lang.Integer num = this.totalCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyPools(page=");
            sb.append(page);
            sb.append(", totalCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.page.hashCode();
            java.lang.Integer num = this.totalCount;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.page, moneyPools.page) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalCount, moneyPools.totalCount);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools copy(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page, java.lang.Integer totalCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools(page, totalCount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = moneyPools.page;
            }
            if ((i & 2) != 0) {
                num = moneyPools.totalCount;
            }
            return moneyPools.copy(page, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0011R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Page;", "", "", "offset", "limit", "", "hasNextPage", "hasPreviousPage", "", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Item;", "items", "<init>", "(IIZZLjava/util/List;)V", "component1", "()I", "component2", "component3", "()Z", "component4", "component5", "()Ljava/util/List;", "copy", "(IIZZLjava/util/List;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Page;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getOffset", "getLimit", "Z", "getHasNextPage", "getHasPreviousPage", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final boolean hasNextPage;
        private final boolean hasPreviousPage;
        private final java.util.List<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item> items;
        private final int limit;
        private final int offset;

        public Page(int i, int i2, boolean z, boolean z2, java.util.List<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.offset = i;
            this.limit = i2;
            this.hasNextPage = z;
            this.hasPreviousPage = z2;
            this.items = list;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public final java.util.List<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            int i = this.offset;
            int i2 = this.limit;
            boolean z = this.hasNextPage;
            boolean z2 = this.hasPreviousPage;
            java.util.List<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(offset=");
            sb.append(i);
            sb.append(", limit=");
            sb.append(i2);
            sb.append(", hasNextPage=");
            sb.append(z);
            sb.append(", hasPreviousPage=");
            sb.append(z2);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((java.lang.Integer.hashCode(this.offset) * 31) + java.lang.Integer.hashCode(this.limit)) * 31) + java.lang.Boolean.hashCode(this.hasNextPage)) * 31) + java.lang.Boolean.hashCode(this.hasPreviousPage)) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page) other;
            return this.offset == page.offset && this.limit == page.limit && this.hasNextPage == page.hasNextPage && this.hasPreviousPage == page.hasPreviousPage && kotlin.jvm.internal.Intrinsics.areEqual(this.items, page.items);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page copy(int offset, int limit, boolean hasNextPage, boolean hasPreviousPage, java.util.List<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page(offset, limit, hasNextPage, hasPreviousPage, items);
        }

        public final java.util.List<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item> component5() {
            return this.items;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLimit() {
            return this.limit;
        }

        /* renamed from: component1, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page, int i, int i2, boolean z, boolean z2, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = page.offset;
            }
            if ((i3 & 2) != 0) {
                i2 = page.limit;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                z = page.hasNextPage;
            }
            boolean z3 = z;
            if ((i3 & 8) != 0) {
                z2 = page.hasPreviousPage;
            }
            boolean z4 = z2;
            if ((i3 & 16) != 0) {
                list = page.items;
            }
            return page.copy(i, i4, z3, z4, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b2\u0010 J´\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u00162\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bH\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bM\u0010 R\u001a\u0010\u0013\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bN\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010/R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\b\u0017\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bR\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Item;", "", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "backgroundImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "status", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Creator;", "creator", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TargetAmount;", "targetAmount", "targetDate", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AvailableBalance;", "availableBalance", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TotalContributionAmount;", "totalContributionAmount", "contributionProgressPercentage", "link", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Metadata;", "metadata", "", "isEditable", "reportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Creator;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TargetAmount;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AvailableBalance;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TotalContributionAmount;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Metadata;ZLjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "component6", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Creator;", "component7", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TargetAmount;", "component8", "component9", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AvailableBalance;", "component10", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TotalContributionAmount;", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Metadata;", "component14", "()Z", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Creator;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TargetAmount;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AvailableBalance;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TotalContributionAmount;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Metadata;ZLjava/lang/Object;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Item;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDescription", "Ljava/lang/Object;", "getBackgroundImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "getStatus", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Creator;", "getCreator", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TargetAmount;", "getTargetAmount", "getTargetDate", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AvailableBalance;", "getAvailableBalance", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TotalContributionAmount;", "getTotalContributionAmount", "getContributionProgressPercentage", "getLink", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Metadata;", "getMetadata", "Z", "getReportUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance availableBalance;
        private final java.lang.Object backgroundImageUrl;
        private final java.lang.Object contributionProgressPercentage;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator creator;
        private final java.lang.String description;
        private final java.lang.String id;
        private final boolean isEditable;
        private final java.lang.Object link;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata metadata;
        private final java.lang.String name;
        private final java.lang.Object reportUrl;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus status;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount targetAmount;
        private final java.lang.Object targetDate;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount totalContributionAmount;

        public Item(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus moneyPoolStatus, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator creator, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount targetAmount, java.lang.Object obj2, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance availableBalance, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount totalContributionAmount, java.lang.Object obj3, java.lang.Object obj4, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata metadata, boolean z, java.lang.Object obj5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPoolStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalContributionAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "");
            this.id = str;
            this.name = str2;
            this.description = str3;
            this.backgroundImageUrl = obj;
            this.status = moneyPoolStatus;
            this.creator = creator;
            this.targetAmount = targetAmount;
            this.targetDate = obj2;
            this.availableBalance = availableBalance;
            this.totalContributionAmount = totalContributionAmount;
            this.contributionProgressPercentage = obj3;
            this.link = obj4;
            this.metadata = metadata;
            this.isEditable = z;
            this.reportUrl = obj5;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.Object getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator getCreator() {
            return this.creator;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount getTargetAmount() {
            return this.targetAmount;
        }

        public final java.lang.Object getTargetDate() {
            return this.targetDate;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance getAvailableBalance() {
            return this.availableBalance;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount getTotalContributionAmount() {
            return this.totalContributionAmount;
        }

        public final java.lang.Object getContributionProgressPercentage() {
            return this.contributionProgressPercentage;
        }

        public final java.lang.Object getLink() {
            return this.link;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata getMetadata() {
            return this.metadata;
        }

        public final boolean isEditable() {
            return this.isEditable;
        }

        public final java.lang.Object getReportUrl() {
            return this.reportUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.description;
            java.lang.Object obj = this.backgroundImageUrl;
            com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus moneyPoolStatus = this.status;
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator creator = this.creator;
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount targetAmount = this.targetAmount;
            java.lang.Object obj2 = this.targetDate;
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance availableBalance = this.availableBalance;
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount totalContributionAmount = this.totalContributionAmount;
            java.lang.Object obj3 = this.contributionProgressPercentage;
            java.lang.Object obj4 = this.link;
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata metadata = this.metadata;
            boolean z = this.isEditable;
            java.lang.Object obj5 = this.reportUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", backgroundImageUrl=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(moneyPoolStatus);
            sb.append(", creator=");
            sb.append(creator);
            sb.append(", targetAmount=");
            sb.append(targetAmount);
            sb.append(", targetDate=");
            sb.append(obj2);
            sb.append(", availableBalance=");
            sb.append(availableBalance);
            sb.append(", totalContributionAmount=");
            sb.append(totalContributionAmount);
            sb.append(", contributionProgressPercentage=");
            sb.append(obj3);
            sb.append(", link=");
            sb.append(obj4);
            sb.append(", metadata=");
            sb.append(metadata);
            sb.append(", isEditable=");
            sb.append(z);
            sb.append(", reportUrl=");
            sb.append(obj5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.String str = this.description;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.backgroundImageUrl;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            int hashCode5 = this.status.hashCode();
            int hashCode6 = this.creator.hashCode();
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount targetAmount = this.targetAmount;
            int hashCode7 = targetAmount == null ? 0 : targetAmount.hashCode();
            java.lang.Object obj2 = this.targetDate;
            int hashCode8 = obj2 == null ? 0 : obj2.hashCode();
            int hashCode9 = this.availableBalance.hashCode();
            int hashCode10 = this.totalContributionAmount.hashCode();
            java.lang.Object obj3 = this.contributionProgressPercentage;
            int hashCode11 = obj3 == null ? 0 : obj3.hashCode();
            int hashCode12 = this.link.hashCode();
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata metadata = this.metadata;
            int hashCode13 = metadata == null ? 0 : metadata.hashCode();
            int hashCode14 = java.lang.Boolean.hashCode(this.isEditable);
            java.lang.Object obj4 = this.reportUrl;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (obj4 != null ? obj4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item item = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, item.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, item.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundImageUrl, item.backgroundImageUrl) && this.status == item.status && kotlin.jvm.internal.Intrinsics.areEqual(this.creator, item.creator) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, item.targetAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetDate, item.targetDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableBalance, item.availableBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalContributionAmount, item.totalContributionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.contributionProgressPercentage, item.contributionProgressPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.link, item.link) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, item.metadata) && this.isEditable == item.isEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.reportUrl, item.reportUrl);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item copy(java.lang.String id, java.lang.String name2, java.lang.String description, java.lang.Object backgroundImageUrl, com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus status, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator creator, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount targetAmount, java.lang.Object targetDate, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance availableBalance, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount totalContributionAmount, java.lang.Object contributionProgressPercentage, java.lang.Object link, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata metadata, boolean isEditable, java.lang.Object reportUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalContributionAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item(id, name2, description, backgroundImageUrl, status, creator, targetAmount, targetDate, availableBalance, totalContributionAmount, contributionProgressPercentage, link, metadata, isEditable, reportUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance getAvailableBalance() {
            return this.availableBalance;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getTargetDate() {
            return this.targetDate;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount getTargetAmount() {
            return this.targetAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator getCreator() {
            return this.creator;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.Object getReportUrl() {
            return this.reportUrl;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsEditable() {
            return this.isEditable;
        }

        /* renamed from: component13, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata getMetadata() {
            return this.metadata;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Object getLink() {
            return this.link;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Object getContributionProgressPercentage() {
            return this.contributionProgressPercentage;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount getTotalContributionAmount() {
            return this.totalContributionAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Creator;", "", "", "id", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Name;", "name", "profilePhotoUrl", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AccountBalance;", "accountBalance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Name;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AccountBalance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Name;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AccountBalance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Name;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AccountBalance;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Creator;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Name;", "getName", "Ljava/lang/Object;", "getProfilePhotoUrl", "Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AccountBalance;", "getAccountBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Creator {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name;
        private final java.lang.Object profilePhotoUrl;

        public Creator(java.lang.String str, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name2, java.lang.Object obj, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.name = name2;
            this.profilePhotoUrl = obj;
            this.accountBalance = accountBalance;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name getName() {
            return this.name;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance getAccountBalance() {
            return this.accountBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name2 = this.name;
            java.lang.Object obj = this.profilePhotoUrl;
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance = this.accountBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Creator(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(name2);
            sb.append(", profilePhotoUrl=");
            sb.append(obj);
            sb.append(", accountBalance=");
            sb.append(accountBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name2 = this.name;
            int hashCode2 = name2 == null ? 0 : name2.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance = this.accountBalance;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (accountBalance != null ? accountBalance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator creator = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, creator.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, creator.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, creator.profilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountBalance, creator.accountBalance);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator copy(java.lang.String id, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name2, java.lang.Object profilePhotoUrl, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator(id, name2, profilePhotoUrl, accountBalance);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance getAccountBalance() {
            return this.accountBalance;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Creator creator, java.lang.String str, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name2, java.lang.Object obj, com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = creator.id;
            }
            if ((i & 2) != 0) {
                name2 = creator.name;
            }
            if ((i & 4) != 0) {
                obj = creator.profilePhotoUrl;
            }
            if ((i & 8) != 0) {
                accountBalance = creator.accountBalance;
            }
            return creator.copy(str, name2, obj, accountBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Name;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public Name(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.middleName = str4;
            this.suffix = str5;
            this.fullName = str6;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.middleName;
            java.lang.String str5 = this.suffix;
            java.lang.String str6 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", middleName=");
            sb.append(str4);
            sb.append(", suffix=");
            sb.append(str5);
            sb.append(", fullName=");
            sb.append(str6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.prefix;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.middleName;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.suffix;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.fullName;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name2 = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, name2.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, name2.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, name2.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, name2.fullName);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name(prefix, givenName, surname, middleName, suffix, fullName);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Name name2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.prefix;
            }
            if ((i & 2) != 0) {
                str2 = name2.givenName;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = name2.surname;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = name2.middleName;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = name2.suffix;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = name2.fullName;
            }
            return name2.copy(str, str7, str8, str9, str10, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AccountBalance;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AccountBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AccountBalance {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AccountBalance(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountBalance(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, accountBalance.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, accountBalance.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AccountBalance accountBalance, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = accountBalance.currencyCode;
            }
            if ((i & 2) != 0) {
                str = accountBalance.value;
            }
            return accountBalance.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TargetAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TargetAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TargetAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TargetAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount targetAmount = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, targetAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, targetAmount.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TargetAmount targetAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = targetAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = targetAmount.value;
            }
            return targetAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AvailableBalance;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$AvailableBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableBalance {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public AvailableBalance(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableBalance(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance availableBalance = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, availableBalance.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, availableBalance.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.AvailableBalance availableBalance, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = availableBalance.currencyCode;
            }
            if ((i & 2) != 0) {
                str = availableBalance.value;
            }
            return availableBalance.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TotalContributionAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$TotalContributionAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalContributionAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalContributionAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalContributionAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount totalContributionAmount = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalContributionAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalContributionAmount.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.TotalContributionAmount totalContributionAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalContributionAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalContributionAmount.value;
            }
            return totalContributionAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Metadata;", "", "", "isTransferEnabled", "isContributionEnabled", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Metadata;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Metadata {
        public static final int $stable = 0;
        private final boolean isContributionEnabled;
        private final boolean isTransferEnabled;

        public Metadata(boolean z, boolean z2) {
            this.isTransferEnabled = z;
            this.isContributionEnabled = z2;
        }

        public final boolean isTransferEnabled() {
            return this.isTransferEnabled;
        }

        public final boolean isContributionEnabled() {
            return this.isContributionEnabled;
        }

        public final java.lang.String toString() {
            boolean z = this.isTransferEnabled;
            boolean z2 = this.isContributionEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata(isTransferEnabled=");
            sb.append(z);
            sb.append(", isContributionEnabled=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isTransferEnabled) * 31) + java.lang.Boolean.hashCode(this.isContributionEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata metadata = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata) other;
            return this.isTransferEnabled == metadata.isTransferEnabled && this.isContributionEnabled == metadata.isContributionEnabled;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata copy(boolean isTransferEnabled, boolean isContributionEnabled) {
            return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata(isTransferEnabled, isContributionEnabled);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsContributionEnabled() {
            return this.isContributionEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTransferEnabled() {
            return this.isTransferEnabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Metadata metadata, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = metadata.isTransferEnabled;
            }
            if ((i & 2) != 0) {
                z2 = metadata.isContributionEnabled;
            }
            return metadata.copy(z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetMoneyPoolsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetMoneyPools($input: MoneyPoolsInput!) { moneyPools(input: $input) { page { offset limit hasNextPage hasPreviousPage items { id name description backgroundImageUrl status creator { id name { prefix givenName surname middleName suffix fullName } profilePhotoUrl accountBalance { currencyCode value } } targetAmount { currencyCode value } targetDate availableBalance { currencyCode value } totalContributionAmount { currencyCode value } contributionProgressPercentage link metadata { isTransferEnabled isContributionEnabled } isEditable reportUrl } } totalCount } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput moneyPoolsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetMoneyPoolsQuery(input=");
        sb.append(moneyPoolsInput);
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
        return (other instanceof com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery) other).input);
    }

    public final com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery copy(com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery copy$default(com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery getMoneyPoolsQuery, com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput moneyPoolsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            moneyPoolsInput = getMoneyPoolsQuery.input;
        }
        return getMoneyPoolsQuery.copy(moneyPoolsInput);
    }
}
