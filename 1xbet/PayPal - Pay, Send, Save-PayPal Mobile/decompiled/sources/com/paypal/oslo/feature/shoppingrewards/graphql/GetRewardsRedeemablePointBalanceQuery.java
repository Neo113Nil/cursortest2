package com.paypal.oslo.feature.shoppingrewards.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/RedeemablePointBalanceInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", "RedeemablePointBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetRewardsRedeemablePointBalanceQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data> {
    public static final java.lang.String OPERATION_ID = "545b60a16eca302f603d29aa8cf6b69c847478413413b69611f4ca963e5bd141";
    public static final java.lang.String OPERATION_NAME = "GetRewardsRedeemablePointBalance";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Companion(null);
    public static final int $stable = 8;

    public GetRewardsRedeemablePointBalanceQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ GetRewardsRedeemablePointBalanceQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput> getInput() {
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
        com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetRewardsRedeemablePointBalanceQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetRewardsRedeemablePointBalanceQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.shoppingrewards.graphql.selections.GetRewardsRedeemablePointBalanceQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$RedeemablePointBalance;", "redeemablePointBalance", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$RedeemablePointBalance;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$RedeemablePointBalance;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$RedeemablePointBalance;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$RedeemablePointBalance;", "getRedeemablePointBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance redeemablePointBalance;

        public Data(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance redeemablePointBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalance, "");
            this.redeemablePointBalance = redeemablePointBalance;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance getRedeemablePointBalance() {
            return this.redeemablePointBalance;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance redeemablePointBalance = this.redeemablePointBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(redeemablePointBalance=");
            sb.append(redeemablePointBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redeemablePointBalance.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemablePointBalance, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data) other).redeemablePointBalance);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance redeemablePointBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalance, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data(redeemablePointBalance);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance getRedeemablePointBalance() {
            return this.redeemablePointBalance;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.Data data, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance redeemablePointBalance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemablePointBalance = data.redeemablePointBalance;
            }
            return data.copy(redeemablePointBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$RedeemablePointBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment;", "redeemablePointBalanceFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$RedeemablePointBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/RedeemablePointBalanceFragment;", "getRedeemablePointBalanceFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedeemablePointBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment;

        public RedeemablePointBalance(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalanceFragment, "");
            this.__typename = str;
            this.redeemablePointBalanceFragment = redeemablePointBalanceFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment getRedeemablePointBalanceFragment() {
            return this.redeemablePointBalanceFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment = this.redeemablePointBalanceFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemablePointBalance(__typename=");
            sb.append(str);
            sb.append(", redeemablePointBalanceFragment=");
            sb.append(redeemablePointBalanceFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.redeemablePointBalanceFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance redeemablePointBalance = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, redeemablePointBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemablePointBalanceFragment, redeemablePointBalance.redeemablePointBalanceFragment);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalanceFragment, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance(__typename, redeemablePointBalanceFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment getRedeemablePointBalanceFragment() {
            return this.redeemablePointBalanceFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery.RedeemablePointBalance redeemablePointBalance, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.RedeemablePointBalanceFragment redeemablePointBalanceFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = redeemablePointBalance.__typename;
            }
            if ((i & 2) != 0) {
                redeemablePointBalanceFragment = redeemablePointBalance.redeemablePointBalanceFragment;
            }
            return redeemablePointBalance.copy(str, redeemablePointBalanceFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsRedeemablePointBalanceQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetRewardsRedeemablePointBalance($input: RedeemablePointBalanceInput) { redeemablePointBalance(input: $input) { __typename ...RedeemablePointBalanceFragment } }  fragment RewardsMoneyFragment on Money { currencyCode value }  fragment RedeemablePointBalanceFragment on RedeemablePointBalance { amountAvailable { __typename ...RewardsMoneyFragment } pointsAvailable exchangeRate { points amount { __typename ...RewardsMoneyFragment } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetRewardsRedeemablePointBalanceQuery(input=");
        sb.append(optional);
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
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery) other).input);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsRedeemablePointBalanceQuery getRewardsRedeemablePointBalanceQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getRewardsRedeemablePointBalanceQuery.input;
        }
        return getRewardsRedeemablePointBalanceQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetRewardsRedeemablePointBalanceQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
