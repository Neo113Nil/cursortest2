package com.paypal.oslo.feature.shoppingrewards.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b+,-./01234*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyMembershipsInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", "RedeemablePointBalance", "LoyaltyMemberships", "Item", "CurrentTier", "Metrics", "QualifyingPoints", "Milestone", "Tier", "Threshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetRewardsLandingQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data> {
    public static final java.lang.String OPERATION_ID = "45270af1817c2676ba765f9a304c3eeb79e12c1c2174265e858b053edf2816ce";
    public static final java.lang.String OPERATION_NAME = "GetRewardsLanding";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LoyaltyMembershipsInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Companion(null);
    public static final int $stable = 8;

    public GetRewardsLandingQuery(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LoyaltyMembershipsInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ GetRewardsLandingQuery(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LoyaltyMembershipsInput> getInput() {
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
        com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetRewardsLandingQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.shoppingrewards.graphql.adapter.GetRewardsLandingQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.shoppingrewards.graphql.selections.GetRewardsLandingQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$RedeemablePointBalance;", "redeemablePointBalance", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$LoyaltyMemberships;", "loyaltyMemberships", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$RedeemablePointBalance;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$LoyaltyMemberships;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$RedeemablePointBalance;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$LoyaltyMemberships;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$RedeemablePointBalance;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$LoyaltyMemberships;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$RedeemablePointBalance;", "getRedeemablePointBalance", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$LoyaltyMemberships;", "getLoyaltyMemberships"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships loyaltyMemberships;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance redeemablePointBalance;

        public Data(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance redeemablePointBalance, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships loyaltyMemberships) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyMemberships, "");
            this.redeemablePointBalance = redeemablePointBalance;
            this.loyaltyMemberships = loyaltyMemberships;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance getRedeemablePointBalance() {
            return this.redeemablePointBalance;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships getLoyaltyMemberships() {
            return this.loyaltyMemberships;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance redeemablePointBalance = this.redeemablePointBalance;
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships loyaltyMemberships = this.loyaltyMemberships;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(redeemablePointBalance=");
            sb.append(redeemablePointBalance);
            sb.append(", loyaltyMemberships=");
            sb.append(loyaltyMemberships);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.redeemablePointBalance.hashCode() * 31) + this.loyaltyMemberships.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data data = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.redeemablePointBalance, data.redeemablePointBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.loyaltyMemberships, data.loyaltyMemberships);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance redeemablePointBalance, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships loyaltyMemberships) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemablePointBalance, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyMemberships, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data(redeemablePointBalance, loyaltyMemberships);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships getLoyaltyMemberships() {
            return this.loyaltyMemberships;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance getRedeemablePointBalance() {
            return this.redeemablePointBalance;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Data data, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance redeemablePointBalance, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships loyaltyMemberships, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemablePointBalance = data.redeemablePointBalance;
            }
            if ((i & 2) != 0) {
                loyaltyMemberships = data.loyaltyMemberships;
            }
            return data.copy(redeemablePointBalance, loyaltyMemberships);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$RedeemablePointBalance;", "", "pointsAvailable", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$RedeemablePointBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPointsAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedeemablePointBalance {
        public static final int $stable = 8;
        private final java.lang.Object pointsAvailable;

        public RedeemablePointBalance(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.pointsAvailable = obj;
        }

        public final java.lang.Object getPointsAvailable() {
            return this.pointsAvailable;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.pointsAvailable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemablePointBalance(pointsAvailable=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pointsAvailable.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.pointsAvailable, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance) other).pointsAvailable);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance copy(java.lang.Object pointsAvailable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointsAvailable, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance(pointsAvailable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPointsAvailable() {
            return this.pointsAvailable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.RedeemablePointBalance redeemablePointBalance, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = redeemablePointBalance.pointsAvailable;
            }
            return redeemablePointBalance.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$LoyaltyMemberships;", "", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$LoyaltyMemberships;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoyaltyMemberships {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item> items;

        public LoyaltyMemberships(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoyaltyMemberships(items=");
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships) other).items);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships(items);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.LoyaltyMemberships loyaltyMemberships, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loyaltyMemberships.items;
            }
            return loyaltyMemberships.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Item;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$CurrentTier;", "currentTier", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Metrics;", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Milestone;", "milestones", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Tier;", "tiers", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$CurrentTier;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Metrics;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$CurrentTier;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Metrics;", "component3", "()Ljava/util/List;", "component4", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$CurrentTier;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Metrics;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$CurrentTier;", "getCurrentTier", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Metrics;", "getMetrics", "Ljava/util/List;", "getMilestones", "getTiers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier currentTier;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics metrics;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> milestones;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> tiers;

        public Item(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier currentTier, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics metrics, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> list, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.currentTier = currentTier;
            this.metrics = metrics;
            this.milestones = list;
            this.tiers = list2;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier getCurrentTier() {
            return this.currentTier;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics getMetrics() {
            return this.metrics;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> getMilestones() {
            return this.milestones;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> getTiers() {
            return this.tiers;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier currentTier = this.currentTier;
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics metrics = this.metrics;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> list = this.milestones;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> list2 = this.tiers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(currentTier=");
            sb.append(currentTier);
            sb.append(", metrics=");
            sb.append(metrics);
            sb.append(", milestones=");
            sb.append(list);
            sb.append(", tiers=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.currentTier.hashCode() * 31) + this.metrics.hashCode()) * 31) + this.milestones.hashCode()) * 31) + this.tiers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item item = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currentTier, item.currentTier) && kotlin.jvm.internal.Intrinsics.areEqual(this.metrics, item.metrics) && kotlin.jvm.internal.Intrinsics.areEqual(this.milestones, item.milestones) && kotlin.jvm.internal.Intrinsics.areEqual(this.tiers, item.tiers);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier currentTier, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics metrics, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> milestones, java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> tiers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metrics, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(milestones, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tiers, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item(currentTier, metrics, milestones, tiers);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier> component4() {
            return this.tiers;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone> component3() {
            return this.milestones;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics getMetrics() {
            return this.metrics;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier getCurrentTier() {
            return this.currentTier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Item item, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier currentTier, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics metrics, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currentTier = item.currentTier;
            }
            if ((i & 2) != 0) {
                metrics = item.metrics;
            }
            if ((i & 4) != 0) {
                list = item.milestones;
            }
            if ((i & 8) != 0) {
                list2 = item.tiers;
            }
            return item.copy(currentTier, metrics, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$CurrentTier;", "", "Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;", "tierCode", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$CurrentTier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;", "getTierCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentTier {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode tierCode;

        public CurrentTier(com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode loyaltyTierCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyTierCode, "");
            this.tierCode = loyaltyTierCode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode getTierCode() {
            return this.tierCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode loyaltyTierCode = this.tierCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentTier(tierCode=");
            sb.append(loyaltyTierCode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.tierCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier) && this.tierCode == ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier) other).tierCode;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier copy(com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode tierCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tierCode, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier(tierCode);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode getTierCode() {
            return this.tierCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.CurrentTier currentTier, com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode loyaltyTierCode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loyaltyTierCode = currentTier.tierCode;
            }
            return currentTier.copy(loyaltyTierCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Metrics;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$QualifyingPoints;", "qualifyingPoints", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$QualifyingPoints;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$QualifyingPoints;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$QualifyingPoints;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Metrics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$QualifyingPoints;", "getQualifyingPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Metrics {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints;

        public Metrics(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints) {
            this.qualifyingPoints = qualifyingPoints;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints getQualifyingPoints() {
            return this.qualifyingPoints;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints = this.qualifyingPoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Metrics(qualifyingPoints=");
            sb.append(qualifyingPoints);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints = this.qualifyingPoints;
            if (qualifyingPoints == null) {
                return 0;
            }
            return qualifyingPoints.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifyingPoints, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics) other).qualifyingPoints);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics copy(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints) {
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics(qualifyingPoints);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints getQualifyingPoints() {
            return this.qualifyingPoints;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Metrics metrics, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qualifyingPoints = metrics.qualifyingPoints;
            }
            return metrics.copy(qualifyingPoints);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$QualifyingPoints;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$QualifyingPoints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QualifyingPoints {
        public static final int $stable = 8;
        private final java.lang.Object value;

        public QualifyingPoints(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = obj;
        }

        public final java.lang.Object getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QualifyingPoints(value=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints) other).value);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints copy(java.lang.Object value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.QualifyingPoints qualifyingPoints, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = qualifyingPoints.value;
            }
            return qualifyingPoints.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Milestone;", "", "", "code", "qualifyingPoints", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Milestone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "Ljava/lang/Object;", "getQualifyingPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Milestone {
        public static final int $stable = 8;
        private final java.lang.String code;
        private final java.lang.Object qualifyingPoints;

        public Milestone(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.code = str;
            this.qualifyingPoints = obj;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.Object getQualifyingPoints() {
            return this.qualifyingPoints;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.code;
            java.lang.Object obj = this.qualifyingPoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Milestone(code=");
            sb.append(str);
            sb.append(", qualifyingPoints=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.code.hashCode() * 31) + this.qualifyingPoints.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone milestone = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.code, milestone.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifyingPoints, milestone.qualifyingPoints);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone copy(java.lang.String code, java.lang.Object qualifyingPoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifyingPoints, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone(code, qualifyingPoints);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getQualifyingPoints() {
            return this.qualifyingPoints;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Milestone milestone, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = milestone.code;
            }
            if ((i & 2) != 0) {
                obj = milestone.qualifyingPoints;
            }
            return milestone.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Tier;", "", "Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;", "tierCode", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Threshold;", "threshold", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Threshold;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Threshold;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Threshold;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Tier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/LoyaltyTierCode;", "getTierCode", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Threshold;", "getThreshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Tier {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold threshold;
        private final com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode tierCode;

        public Tier(com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode loyaltyTierCode, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold threshold) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyTierCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threshold, "");
            this.tierCode = loyaltyTierCode;
            this.threshold = threshold;
        }

        public final com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode getTierCode() {
            return this.tierCode;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold getThreshold() {
            return this.threshold;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode loyaltyTierCode = this.tierCode;
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold threshold = this.threshold;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tier(tierCode=");
            sb.append(loyaltyTierCode);
            sb.append(", threshold=");
            sb.append(threshold);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.tierCode.hashCode() * 31) + this.threshold.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier tier = (com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier) other;
            return this.tierCode == tier.tierCode && kotlin.jvm.internal.Intrinsics.areEqual(this.threshold, tier.threshold);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier copy(com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode tierCode, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold threshold) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tierCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threshold, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier(tierCode, threshold);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold getThreshold() {
            return this.threshold;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode getTierCode() {
            return this.tierCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Tier tier, com.paypal.oslo.api.graphql.schema.type.LoyaltyTierCode loyaltyTierCode, com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold threshold, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loyaltyTierCode = tier.tierCode;
            }
            if ((i & 2) != 0) {
                threshold = tier.threshold;
            }
            return tier.copy(loyaltyTierCode, threshold);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Threshold;", "", "qualifyingPoints", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Threshold;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getQualifyingPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Threshold {
        public static final int $stable = 8;
        private final java.lang.Object qualifyingPoints;

        public Threshold(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.qualifyingPoints = obj;
        }

        public final java.lang.Object getQualifyingPoints() {
            return this.qualifyingPoints;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.qualifyingPoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Threshold(qualifyingPoints=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.qualifyingPoints.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifyingPoints, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold) other).qualifyingPoints);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold copy(java.lang.Object qualifyingPoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualifyingPoints, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold(qualifyingPoints);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getQualifyingPoints() {
            return this.qualifyingPoints;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery.Threshold threshold, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = threshold.qualifyingPoints;
            }
            return threshold.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/GetRewardsLandingQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetRewardsLanding($input: LoyaltyMembershipsInput) { redeemablePointBalance { pointsAvailable } loyaltyMemberships(input: $input) { items { currentTier { tierCode } metrics { qualifyingPoints { value } } milestones { code qualifyingPoints } tiers { tierCode threshold { qualifyingPoints } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LoyaltyMembershipsInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetRewardsLandingQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery) other).input);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LoyaltyMembershipsInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.LoyaltyMembershipsInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.GetRewardsLandingQuery getRewardsLandingQuery, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = getRewardsLandingQuery.input;
        }
        return getRewardsLandingQuery.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetRewardsLandingQuery() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
