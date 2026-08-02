package com.paypal.oslo.feature.pools.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n'()*+,-./&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Data;", "", "id", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Companion", "Data", "MoneyPool", "Creator", "Name", "AccountBalance", "TargetAmount", "AvailableBalance", "TotalContributionAmount", "Metadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetPoolDetailsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Companion INSTANCE = new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "99f31c8e96fad537c130886d6b348bffb6098842d8c51bd15dd120f26f045304";
    public static final java.lang.String OPERATION_NAME = "GetPoolDetails";
    private final java.lang.String id;

    public GetPoolDetailsQuery(java.lang.String str) {
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
        com.paypal.oslo.feature.pools.graphql.adapter.GetPoolDetailsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.pools.graphql.adapter.GetPoolDetailsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.pools.graphql.selections.GetPoolDetailsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;", "moneyPool", "<init>", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;)V", "component1", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;", "copy", "(Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;", "getMoneyPool"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool;

        public Data(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPool, "");
            this.moneyPool = moneyPool;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool getMoneyPool() {
            return this.moneyPool;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool = this.moneyPool;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(moneyPool=");
            sb.append(moneyPool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.moneyPool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyPool, ((com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data) other).moneyPool);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data copy(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPool, "");
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data(moneyPool);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool getMoneyPool() {
            return this.moneyPool;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Data data, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneyPool = data.moneyPool;
            }
            return data.copy(moneyPool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b2\u0010 J´\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u00162\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bH\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bL\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bM\u0010 R\u001a\u0010\u0013\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bN\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010/R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\b\u0017\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bR\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;", "", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "backgroundImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "status", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;", "creator", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;", "targetAmount", "targetDate", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;", "availableBalance", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;", "totalContributionAmount", "contributionProgressPercentage", "link", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Metadata;", "metadata", "", "isEditable", "reportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Metadata;ZLjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "component6", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;", "component7", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;", "component8", "component9", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;", "component10", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Metadata;", "component14", "()Z", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Metadata;ZLjava/lang/Object;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$MoneyPool;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDescription", "Ljava/lang/Object;", "getBackgroundImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "getStatus", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;", "getCreator", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;", "getTargetAmount", "getTargetDate", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;", "getAvailableBalance", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;", "getTotalContributionAmount", "getContributionProgressPercentage", "getLink", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Metadata;", "getMetadata", "Z", "getReportUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyPool {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance availableBalance;
        private final java.lang.Object backgroundImageUrl;
        private final java.lang.Object contributionProgressPercentage;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator creator;
        private final java.lang.String description;
        private final java.lang.String id;
        private final boolean isEditable;
        private final java.lang.Object link;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata;
        private final java.lang.String name;
        private final java.lang.Object reportUrl;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus status;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount;
        private final java.lang.Object targetDate;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount totalContributionAmount;

        public MoneyPool(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus moneyPoolStatus, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator creator, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount, java.lang.Object obj2, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance availableBalance, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount totalContributionAmount, java.lang.Object obj3, java.lang.Object obj4, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata, boolean z, java.lang.Object obj5) {
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

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator getCreator() {
            return this.creator;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount getTargetAmount() {
            return this.targetAmount;
        }

        public final java.lang.Object getTargetDate() {
            return this.targetDate;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance getAvailableBalance() {
            return this.availableBalance;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount getTotalContributionAmount() {
            return this.totalContributionAmount;
        }

        public final java.lang.Object getContributionProgressPercentage() {
            return this.contributionProgressPercentage;
        }

        public final java.lang.Object getLink() {
            return this.link;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata getMetadata() {
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
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator creator = this.creator;
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount = this.targetAmount;
            java.lang.Object obj2 = this.targetDate;
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance availableBalance = this.availableBalance;
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount totalContributionAmount = this.totalContributionAmount;
            java.lang.Object obj3 = this.contributionProgressPercentage;
            java.lang.Object obj4 = this.link;
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata = this.metadata;
            boolean z = this.isEditable;
            java.lang.Object obj5 = this.reportUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyPool(id=");
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
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount = this.targetAmount;
            int hashCode7 = targetAmount == null ? 0 : targetAmount.hashCode();
            java.lang.Object obj2 = this.targetDate;
            int hashCode8 = obj2 == null ? 0 : obj2.hashCode();
            int hashCode9 = this.availableBalance.hashCode();
            int hashCode10 = this.totalContributionAmount.hashCode();
            java.lang.Object obj3 = this.contributionProgressPercentage;
            int hashCode11 = obj3 == null ? 0 : obj3.hashCode();
            int hashCode12 = this.link.hashCode();
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata = this.metadata;
            int hashCode13 = metadata == null ? 0 : metadata.hashCode();
            int hashCode14 = java.lang.Boolean.hashCode(this.isEditable);
            java.lang.Object obj4 = this.reportUrl;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (obj4 != null ? obj4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool moneyPool = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, moneyPool.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, moneyPool.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, moneyPool.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundImageUrl, moneyPool.backgroundImageUrl) && this.status == moneyPool.status && kotlin.jvm.internal.Intrinsics.areEqual(this.creator, moneyPool.creator) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, moneyPool.targetAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetDate, moneyPool.targetDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableBalance, moneyPool.availableBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalContributionAmount, moneyPool.totalContributionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.contributionProgressPercentage, moneyPool.contributionProgressPercentage) && kotlin.jvm.internal.Intrinsics.areEqual(this.link, moneyPool.link) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, moneyPool.metadata) && this.isEditable == moneyPool.isEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.reportUrl, moneyPool.reportUrl);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool copy(java.lang.String id, java.lang.String name2, java.lang.String description, java.lang.Object backgroundImageUrl, com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus status, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator creator, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount, java.lang.Object targetDate, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance availableBalance, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount totalContributionAmount, java.lang.Object contributionProgressPercentage, java.lang.Object link, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata, boolean isEditable, java.lang.Object reportUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creator, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalContributionAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.MoneyPool(id, name2, description, backgroundImageUrl, status, creator, targetAmount, targetDate, availableBalance, totalContributionAmount, contributionProgressPercentage, link, metadata, isEditable, reportUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance getAvailableBalance() {
            return this.availableBalance;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getTargetDate() {
            return this.targetDate;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount getTargetAmount() {
            return this.targetAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator getCreator() {
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
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata getMetadata() {
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
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount getTotalContributionAmount() {
            return this.totalContributionAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;", "", "", "id", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;", "name", "profilePhotoUrl", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;", "accountBalance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;Ljava/lang/Object;Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Creator;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;", "getName", "Ljava/lang/Object;", "getProfilePhotoUrl", "Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;", "getAccountBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Creator {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name;
        private final java.lang.Object profilePhotoUrl;

        public Creator(java.lang.String str, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2, java.lang.Object obj, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.name = name2;
            this.profilePhotoUrl = obj;
            this.accountBalance = accountBalance;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name getName() {
            return this.name;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance getAccountBalance() {
            return this.accountBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2 = this.name;
            java.lang.Object obj = this.profilePhotoUrl;
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance = this.accountBalance;
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
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2 = this.name;
            int hashCode2 = name2 == null ? 0 : name2.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance = this.accountBalance;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (accountBalance != null ? accountBalance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator creator = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, creator.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, creator.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, creator.profilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountBalance, creator.accountBalance);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator copy(java.lang.String id, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2, java.lang.Object profilePhotoUrl, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator(id, name2, profilePhotoUrl, accountBalance);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance getAccountBalance() {
            return this.accountBalance;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Creator creator, java.lang.String str, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2, java.lang.Object obj, com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance, int i, java.lang.Object obj2) {
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

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2 = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, name2.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, name2.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, name2.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, name2.fullName);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name(prefix, givenName, surname, middleName, suffix, fullName);
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

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Name name2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AccountBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, accountBalance.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, accountBalance.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AccountBalance accountBalance, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = accountBalance.currencyCode;
            }
            if ((i & 2) != 0) {
                str = accountBalance.value;
            }
            return accountBalance.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TargetAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, targetAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, targetAmount.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TargetAmount targetAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = targetAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = targetAmount.value;
            }
            return targetAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$AvailableBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance availableBalance = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, availableBalance.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, availableBalance.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.AvailableBalance availableBalance, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = availableBalance.currencyCode;
            }
            if ((i & 2) != 0) {
                str = availableBalance.value;
            }
            return availableBalance.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$TotalContributionAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount totalContributionAmount = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalContributionAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalContributionAmount.value);
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.TotalContributionAmount totalContributionAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalContributionAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalContributionAmount.value;
            }
            return totalContributionAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Metadata;", "", "", "isTransferEnabled", "isContributionEnabled", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Metadata;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata)) {
                return false;
            }
            com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata = (com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata) other;
            return this.isTransferEnabled == metadata.isTransferEnabled && this.isContributionEnabled == metadata.isContributionEnabled;
        }

        public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata copy(boolean isTransferEnabled, boolean isContributionEnabled) {
            return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata(isTransferEnabled, isContributionEnabled);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsContributionEnabled() {
            return this.isContributionEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTransferEnabled() {
            return this.isTransferEnabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery.Metadata metadata, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = metadata.isTransferEnabled;
            }
            if ((i & 2) != 0) {
                z2 = metadata.isContributionEnabled;
            }
            return metadata.copy(z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pools/graphql/GetPoolDetailsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPoolDetails($id: ID!) { moneyPool(id: $id) { id name description backgroundImageUrl status creator { id name { prefix givenName surname middleName suffix fullName } profilePhotoUrl accountBalance { currencyCode value } } targetAmount { currencyCode value } targetDate availableBalance { currencyCode value } totalContributionAmount { currencyCode value } contributionProgressPercentage link metadata { isTransferEnabled isContributionEnabled } isEditable reportUrl } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPoolDetailsQuery(id=");
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
        return (other instanceof com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery) other).id);
    }

    public final com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery copy$default(com.paypal.oslo.feature.pools.graphql.GetPoolDetailsQuery getPoolDetailsQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getPoolDetailsQuery.id;
        }
        return getPoolDetailsQuery.copy(str);
    }
}
