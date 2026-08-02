package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"# B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "BalanceHoldPolicies", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetCIPHoldPolicyQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "77beeca5f442c614f3882e54deac5004e820e3868ac88ca1c326cc5fe29c4456";
    public static final java.lang.String OPERATION_NAME = "GetCIPHoldPolicy";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.GetCIPHoldPolicyQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.GetCIPHoldPolicyQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$BalanceHoldPolicies;", "balanceHoldPolicies", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$BalanceHoldPolicies;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$BalanceHoldPolicies;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$BalanceHoldPolicies;)Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$BalanceHoldPolicies;", "getBalanceHoldPolicies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies balanceHoldPolicies;

        public Data(com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies balanceHoldPolicies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceHoldPolicies, "");
            this.balanceHoldPolicies = balanceHoldPolicies;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies getBalanceHoldPolicies() {
            return this.balanceHoldPolicies;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies balanceHoldPolicies = this.balanceHoldPolicies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(balanceHoldPolicies=");
            sb.append(balanceHoldPolicies);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.balanceHoldPolicies.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceHoldPolicies, ((com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data) other).balanceHoldPolicies);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data copy(com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies balanceHoldPolicies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceHoldPolicies, "");
            return new com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data(balanceHoldPolicies);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies getBalanceHoldPolicies() {
            return this.balanceHoldPolicies;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data copy$default(com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Data data, com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies balanceHoldPolicies, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balanceHoldPolicies = data.balanceHoldPolicies;
            }
            return data.copy(balanceHoldPolicies);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$BalanceHoldPolicies;", "", "", "Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$BalanceHoldPolicies;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceHoldPolicies {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item> items;

        public BalanceHoldPolicies(java.util.List<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceHoldPolicies(items=");
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
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies) other).items);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies copy(java.util.List<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies(items);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies copy$default(com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.BalanceHoldPolicies balanceHoldPolicies, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = balanceHoldPolicies.items;
            }
            return balanceHoldPolicies.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$Item;", "", "", "policyDefinitionId", "Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "policyStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "processStatus", "processId", "gracePeriodExpiryDate", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "component4", "component5", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPolicyDefinitionId", "Lcom/paypal/oslo/api/graphql/schema/type/PolicyStatus;", "getPolicyStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ProcessStatus;", "getProcessStatus", "getProcessId", "Ljava/lang/Object;", "getGracePeriodExpiryDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.Object gracePeriodExpiryDate;
        private final java.lang.String policyDefinitionId;
        private final com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus;
        private final java.lang.String processId;
        private final com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus;

        public Item(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus, com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus, java.lang.String str2, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policyStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.policyDefinitionId = str;
            this.policyStatus = policyStatus;
            this.processStatus = processStatus;
            this.processId = str2;
            this.gracePeriodExpiryDate = obj;
        }

        public final java.lang.String getPolicyDefinitionId() {
            return this.policyDefinitionId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PolicyStatus getPolicyStatus() {
            return this.policyStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ProcessStatus getProcessStatus() {
            return this.processStatus;
        }

        public final java.lang.String getProcessId() {
            return this.processId;
        }

        public final java.lang.Object getGracePeriodExpiryDate() {
            return this.gracePeriodExpiryDate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.policyDefinitionId;
            com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus = this.policyStatus;
            com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus = this.processStatus;
            java.lang.String str2 = this.processId;
            java.lang.Object obj = this.gracePeriodExpiryDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(policyDefinitionId=");
            sb.append(str);
            sb.append(", policyStatus=");
            sb.append(policyStatus);
            sb.append(", processStatus=");
            sb.append(processStatus);
            sb.append(", processId=");
            sb.append(str2);
            sb.append(", gracePeriodExpiryDate=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.policyDefinitionId.hashCode();
            int hashCode2 = this.policyStatus.hashCode();
            int hashCode3 = this.processStatus.hashCode();
            int hashCode4 = this.processId.hashCode();
            java.lang.Object obj = this.gracePeriodExpiryDate;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item item = (com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.policyDefinitionId, item.policyDefinitionId) && this.policyStatus == item.policyStatus && this.processStatus == item.processStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.processId, item.processId) && kotlin.jvm.internal.Intrinsics.areEqual(this.gracePeriodExpiryDate, item.gracePeriodExpiryDate);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item copy(java.lang.String policyDefinitionId, com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus, com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus, java.lang.String processId, java.lang.Object gracePeriodExpiryDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policyDefinitionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policyStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processId, "");
            return new com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item(policyDefinitionId, policyStatus, processStatus, processId, gracePeriodExpiryDate);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getGracePeriodExpiryDate() {
            return this.gracePeriodExpiryDate;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getProcessId() {
            return this.processId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ProcessStatus getProcessStatus() {
            return this.processStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PolicyStatus getPolicyStatus() {
            return this.policyStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPolicyDefinitionId() {
            return this.policyDefinitionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item copy$default(com.paypal.oslo.feature.balance.graphql.GetCIPHoldPolicyQuery.Item item, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus, com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = item.policyDefinitionId;
            }
            if ((i & 2) != 0) {
                policyStatus = item.policyStatus;
            }
            com.paypal.oslo.api.graphql.schema.type.PolicyStatus policyStatus2 = policyStatus;
            if ((i & 4) != 0) {
                processStatus = item.processStatus;
            }
            com.paypal.oslo.api.graphql.schema.type.ProcessStatus processStatus2 = processStatus;
            if ((i & 8) != 0) {
                str2 = item.processId;
            }
            java.lang.String str3 = str2;
            if ((i & 16) != 0) {
                obj = item.gracePeriodExpiryDate;
            }
            return item.copy(str, policyStatus2, processStatus2, str3, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetCIPHoldPolicyQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCIPHoldPolicy { balanceHoldPolicies(input: { policyDefinitionIds: [\"11F0-7100-55F23249-ABA1-3B4AD87B85DF\"] } ) { items { policyDefinitionId policyStatus processStatus processId gracePeriodExpiryDate } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
