package com.paypal.oslo.feature.activity.graphql;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b(\b\u0086\b\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001bABCDEFGHIJKLMNOPQRSTUVWXYZ@B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010'JL\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b5\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010'R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010)R\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b>\u0010'R\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b?\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityDetailsInput;", "input", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;", "packageInput", "", "skipPackages", "Lcom/paypal/oslo/api/graphql/schema/type/TransactionRewardSummaryInput;", "rewardInput", "skipRewards", "skipRelationship", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityDetailsInput;Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;ZLcom/paypal/oslo/api/graphql/schema/type/TransactionRewardSummaryInput;ZZ)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityDetailsInput;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;", "component3", "()Z", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/TransactionRewardSummaryInput;", "component5", "component6", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityDetailsInput;Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;ZLcom/paypal/oslo/api/graphql/schema/type/TransactionRewardSummaryInput;ZZ)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityDetailsInput;", "getInput", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityShipmentPackagesInput;", "getPackageInput", "Z", "getSkipPackages", "Lcom/paypal/oslo/api/graphql/schema/type/TransactionRewardSummaryInput;", "getRewardInput", "getSkipRewards", "getSkipRelationship", "Companion", "Data", "Result", "HelpCenterOption", "Avatar", "MoneyMovement", "Counterparty", "AmountInfo", "Order", "Action", "ActivityInsight", "RelatedActivity", "MoneyConversion", "CryptoAssetConversion", "SkuItem", "ShippingDetails", "EtaProgress", "Dispute", "Partner", "SynchronyReward", "Flags", "CryptoAsset", "RegulatoryInfo", "ShipmentPackages", "TransactionRewardSummary", "Relationship", "Relationship1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetActivityDetailsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "ff34df8e835767fe73887af52b4e2d317f09aa0b454f7543a39aae0bc529fed7";
    public static final java.lang.String OPERATION_NAME = "GetActivityDetails";
    private final com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput input;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput packageInput;
    private final com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput rewardInput;
    private final boolean skipPackages;
    private final boolean skipRelationship;
    private final boolean skipRewards;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Companion INSTANCE = new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Companion(null);
    public static final int $stable = 8;

    public GetActivityDetailsQuery(com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput activityDetailsInput, com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput activityShipmentPackagesInput, boolean z, com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput transactionRewardSummaryInput, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShipmentPackagesInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionRewardSummaryInput, "");
        this.input = activityDetailsInput;
        this.packageInput = activityShipmentPackagesInput;
        this.skipPackages = z;
        this.rewardInput = transactionRewardSummaryInput;
        this.skipRewards = z2;
        this.skipRelationship = z3;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput getInput() {
        return this.input;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput getPackageInput() {
        return this.packageInput;
    }

    public final boolean getSkipPackages() {
        return this.skipPackages;
    }

    public final com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput getRewardInput() {
        return this.rewardInput;
    }

    public final boolean getSkipRewards() {
        return this.skipRewards;
    }

    public final boolean getSkipRelationship() {
        return this.skipRelationship;
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
        com.paypal.oslo.feature.activity.graphql.adapter.GetActivityDetailsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.activity.graphql.adapter.GetActivityDetailsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.activity.graphql.selections.GetActivityDetailsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Result;", "result", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShipmentPackages;", "shipmentPackages", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$TransactionRewardSummary;", "transactionRewardSummary", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship;", "relationship", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Result;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShipmentPackages;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$TransactionRewardSummary;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship;)V", "component1", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Result;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShipmentPackages;", "component3", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$TransactionRewardSummary;", "component4", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship;", "copy", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Result;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShipmentPackages;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$TransactionRewardSummary;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Result;", "getResult", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShipmentPackages;", "getShipmentPackages", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$TransactionRewardSummary;", "getTransactionRewardSummary", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship;", "getRelationship"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary;

        public Data(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            this.result = result;
            this.shipmentPackages = shipmentPackages;
            this.transactionRewardSummary = transactionRewardSummary;
            this.relationship = relationship;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result getResult() {
            return this.result;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages getShipmentPackages() {
            return this.shipmentPackages;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary getTransactionRewardSummary() {
            return this.transactionRewardSummary;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship getRelationship() {
            return this.relationship;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result = this.result;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages = this.shipmentPackages;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary = this.transactionRewardSummary;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship = this.relationship;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(result=");
            sb.append(result);
            sb.append(", shipmentPackages=");
            sb.append(shipmentPackages);
            sb.append(", transactionRewardSummary=");
            sb.append(transactionRewardSummary);
            sb.append(", relationship=");
            sb.append(relationship);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.result.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages = this.shipmentPackages;
            int hashCode2 = shipmentPackages == null ? 0 : shipmentPackages.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary = this.transactionRewardSummary;
            int hashCode3 = transactionRewardSummary == null ? 0 : transactionRewardSummary.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship = this.relationship;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (relationship != null ? relationship.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.result, data.result) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipmentPackages, data.shipmentPackages) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionRewardSummary, data.transactionRewardSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.relationship, data.relationship);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data copy(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data(result, shipmentPackages, transactionRewardSummary, relationship);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship getRelationship() {
            return this.relationship;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary getTransactionRewardSummary() {
            return this.transactionRewardSummary;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages getShipmentPackages() {
            return this.shipmentPackages;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data data, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                result = data.result;
            }
            if ((i & 2) != 0) {
                shipmentPackages = data.shipmentPackages;
            }
            if ((i & 4) != 0) {
                transactionRewardSummary = data.transactionRewardSummary;
            }
            if ((i & 8) != 0) {
                relationship = data.relationship;
            }
            return data.copy(result, shipmentPackages, transactionRewardSummary, relationship);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001B«\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000f\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000f\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u000f\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000f\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\u0006\u0010?\u001a\u00020>\u0012\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u000f\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0010\u0010I\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bK\u0010GJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010GJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010GJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010GJ\u0010\u0010O\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010GJ\u0018\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0016\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fHÆ\u0003¢\u0006\u0004\bX\u0010UJ\u0010\u0010Y\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0018\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b[\u0010UJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010GJ\u0010\u0010]\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0018\u0010c\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bc\u0010UJ\u0018\u0010d\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bd\u0010UJ\u0018\u0010e\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\be\u0010UJ\u0018\u0010f\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bf\u0010UJ\u0018\u0010g\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bg\u0010UJ\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bh\u0010UJ\u0012\u0010i\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0012\u0010q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bq\u0010GJ\u0012\u0010r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\br\u0010GJ\u0010\u0010s\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bs\u0010GJ\u0012\u0010t\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0012\u0010v\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0012\u0010x\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0004\bx\u0010yJ\u0010\u0010z\u001a\u00020>HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0018\u0010|\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b|\u0010UJ\u0012\u0010}\u001a\u0004\u0018\u00010BHÆ\u0003¢\u0006\u0004\b}\u0010~J\u0081\u0004\u0010\u007f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000f2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000f2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u000f2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00107\u001a\u00020\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010?\u001a\u00020>2\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u000f2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010BHÆ\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001f\u0010\u0083\u0001\u001a\u00030\u0082\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0014\u0010\u0086\u0001\u001a\u00030\u0085\u0001HÖ\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0012\u0010\u0088\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u0088\u0001\u0010GR\u0019\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u000e\n\u0005\b\u0003\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010GR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010\u0089\u0001\u001a\u0005\b\u008b\u0001\u0010GR\u001c\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010JR\u001c\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u0089\u0001\u001a\u0005\b\u008e\u0001\u0010GR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010\u0089\u0001\u001a\u0005\b\u008f\u0001\u0010GR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u0089\u0001\u001a\u0005\b\u0090\u0001\u0010GR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u0089\u0001\u001a\u0005\b\u0091\u0001\u0010GR\u001c\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010PR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010RR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u0089\u0001\u001a\u0005\b\u0096\u0001\u0010GR$\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010UR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010WR\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010\u0097\u0001\u001a\u0005\b\u009b\u0001\u0010UR\u001c\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010ZR$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u0097\u0001\u001a\u0005\b\u009e\u0001\u0010UR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u0089\u0001\u001a\u0005\b\u009f\u0001\u0010GR\u001c\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010 \u0001\u001a\u0005\b¡\u0001\u0010^R\u001c\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010¢\u0001\u001a\u0005\b£\u0001\u0010`R\u001e\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010¤\u0001\u001a\u0005\b¥\u0001\u0010bR$\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0097\u0001\u001a\u0005\b¦\u0001\u0010UR$\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0097\u0001\u001a\u0005\b§\u0001\u0010UR$\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u0097\u0001\u001a\u0005\b¨\u0001\u0010UR$\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u0097\u0001\u001a\u0005\b©\u0001\u0010UR$\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u0097\u0001\u001a\u0005\bª\u0001\u0010UR$\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0097\u0001\u001a\u0005\b«\u0001\u0010UR\u001e\u0010.\u001a\u0004\u0018\u00010-8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010jR\u001e\u00100\u001a\u0004\u0018\u00010/8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010®\u0001\u001a\u0005\b¯\u0001\u0010lR\u001e\u00102\u001a\u0004\u0018\u0001018\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010°\u0001\u001a\u0005\b±\u0001\u0010nR\u001e\u00104\u001a\u0004\u0018\u0001038\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010²\u0001\u001a\u0005\b³\u0001\u0010pR\u001e\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010\u0089\u0001\u001a\u0005\b´\u0001\u0010GR\u001e\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010\u0089\u0001\u001a\u0005\bµ\u0001\u0010GR\u001c\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010\u0089\u0001\u001a\u0005\b¶\u0001\u0010GR\u001e\u00109\u001a\u0004\u0018\u0001088\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b9\u0010·\u0001\u001a\u0005\b¸\u0001\u0010uR\u001e\u0010;\u001a\u0004\u0018\u00010:8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b;\u0010¹\u0001\u001a\u0005\bº\u0001\u0010wR\u001e\u0010=\u001a\u0004\u0018\u00010<8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b=\u0010»\u0001\u001a\u0005\b¼\u0001\u0010yR\u001c\u0010?\u001a\u00020>8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b?\u0010½\u0001\u001a\u0005\b¾\u0001\u0010{R$\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bA\u0010\u0097\u0001\u001a\u0005\b¿\u0001\u0010UR\u001e\u0010C\u001a\u0004\u0018\u00010B8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bC\u0010À\u0001\u001a\u0005\bÁ\u0001\u0010~"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Result;", "", "", "id", "groupId", "createdTime", "displayDateFormat", "systemNote", "userNote", "etaNote", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;", "subType", "displayStatus", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityChannel;", "channels", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;", "moneyMovementDirection", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$HelpCenterOption;", "helpCenterOptions", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Avatar;", "avatar", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$MoneyMovement;", "moneyMovements", "invoiceId", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Counterparty;", "counterparty", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;", "amountInfo", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Order;", "order", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Action;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ActivityInsight;", "activityInsights", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RelatedActivity;", "relatedActivities", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$MoneyConversion;", "moneyConversions", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$CryptoAssetConversion;", "cryptoAssetConversions", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SkuItem;", "skuItems", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRecurringBuyFrequency;", "recurringBuyFrequency", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShippingDetails;", "shippingDetails", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$EtaProgress;", "etaProgress", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Dispute;", "dispute", "cryptoTxnSignatureId", "transactionNote", "shortDescription", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Partner;", "partner", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SynchronyReward;", "synchronyReward", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Flags;", "flags", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "status", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$CryptoAsset;", "cryptoAssets", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RegulatoryInfo;", "regulatoryInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;Ljava/util/List;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Avatar;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Counterparty;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Order;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRecurringBuyFrequency;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShippingDetails;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$EtaProgress;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Dispute;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Partner;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SynchronyReward;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Flags;Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Ljava/util/List;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RegulatoryInfo;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;", "component10", "component11", "()Ljava/util/List;", "component12", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;", "component13", "component14", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Avatar;", "component15", "component16", "component17", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Counterparty;", "component18", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;", "component19", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Order;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityRecurringBuyFrequency;", "component27", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShippingDetails;", "component28", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$EtaProgress;", "component29", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Dispute;", "component30", "component31", "component32", "component33", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Partner;", "component34", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SynchronyReward;", "component35", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Flags;", "component36", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "component37", "component38", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RegulatoryInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;Ljava/util/List;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Avatar;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Counterparty;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Order;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRecurringBuyFrequency;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShippingDetails;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$EtaProgress;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Dispute;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Partner;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SynchronyReward;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Flags;Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;Ljava/util/List;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RegulatoryInfo;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Result;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getGroupId", "Ljava/lang/Object;", "getCreatedTime", "getDisplayDateFormat", "getSystemNote", "getUserNote", "getEtaNote", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySubType;", "getSubType", "getDisplayStatus", "Ljava/util/List;", "getChannels", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;", "getMoneyMovementDirection", "getHelpCenterOptions", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Avatar;", "getAvatar", "getMoneyMovements", "getInvoiceId", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Counterparty;", "getCounterparty", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;", "getAmountInfo", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Order;", "getOrder", "getActions", "getActivityInsights", "getRelatedActivities", "getMoneyConversions", "getCryptoAssetConversions", "getSkuItems", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRecurringBuyFrequency;", "getRecurringBuyFrequency", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShippingDetails;", "getShippingDetails", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$EtaProgress;", "getEtaProgress", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Dispute;", "getDispute", "getCryptoTxnSignatureId", "getTransactionNote", "getShortDescription", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Partner;", "getPartner", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SynchronyReward;", "getSynchronyReward", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Flags;", "getFlags", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "getStatus", "getCryptoAssets", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RegulatoryInfo;", "getRegulatoryInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> actions;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> activityInsights;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo amountInfo;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar avatar;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> channels;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty counterparty;
        private final java.lang.Object createdTime;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> cryptoAssetConversions;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> cryptoAssets;
        private final java.lang.String cryptoTxnSignatureId;
        private final java.lang.String displayDateFormat;
        private final java.lang.String displayStatus;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute;
        private final java.lang.String etaNote;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags;
        private final java.lang.String groupId;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption> helpCenterOptions;
        private final java.lang.String id;
        private final java.lang.String invoiceId;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> moneyConversions;
        private final com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> moneyMovements;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order order;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner;
        private final com.paypal.oslo.api.graphql.schema.type.ActivityRecurringBuyFrequency recurringBuyFrequency;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> relatedActivities;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails;
        private final java.lang.String shortDescription;
        private final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> skuItems;
        private final com.paypal.oslo.api.graphql.schema.type.ActivityStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.ActivitySubType subType;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward;
        private final java.lang.String systemNote;
        private final java.lang.String transactionNote;
        private final com.paypal.oslo.api.graphql.schema.type.ActivityType type;
        private final java.lang.String userNote;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType, java.lang.String str7, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityChannel> list, com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption> list2, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar avatar, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> list3, java.lang.String str8, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty counterparty, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo amountInfo, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order order, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> list4, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> list5, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> list6, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> list7, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> list8, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> list9, com.paypal.oslo.api.graphql.schema.type.ActivityRecurringBuyFrequency activityRecurringBuyFrequency, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute, java.lang.String str9, java.lang.String str10, java.lang.String str11, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags, com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> list10, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatar, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counterparty, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStatus, "");
            this.id = str;
            this.groupId = str2;
            this.createdTime = obj;
            this.displayDateFormat = str3;
            this.systemNote = str4;
            this.userNote = str5;
            this.etaNote = str6;
            this.type = activityType;
            this.subType = activitySubType;
            this.displayStatus = str7;
            this.channels = list;
            this.moneyMovementDirection = moneyMovementDirection;
            this.helpCenterOptions = list2;
            this.avatar = avatar;
            this.moneyMovements = list3;
            this.invoiceId = str8;
            this.counterparty = counterparty;
            this.amountInfo = amountInfo;
            this.order = order;
            this.actions = list4;
            this.activityInsights = list5;
            this.relatedActivities = list6;
            this.moneyConversions = list7;
            this.cryptoAssetConversions = list8;
            this.skuItems = list9;
            this.recurringBuyFrequency = activityRecurringBuyFrequency;
            this.shippingDetails = shippingDetails;
            this.etaProgress = etaProgress;
            this.dispute = dispute;
            this.cryptoTxnSignatureId = str9;
            this.transactionNote = str10;
            this.shortDescription = str11;
            this.partner = partner;
            this.synchronyReward = synchronyReward;
            this.flags = flags;
            this.status = activityStatus;
            this.cryptoAssets = list10;
            this.regulatoryInfo = regulatoryInfo;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getGroupId() {
            return this.groupId;
        }

        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        public final java.lang.String getDisplayDateFormat() {
            return this.displayDateFormat;
        }

        public final java.lang.String getSystemNote() {
            return this.systemNote;
        }

        public final java.lang.String getUserNote() {
            return this.userNote;
        }

        public final java.lang.String getEtaNote() {
            return this.etaNote;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
            return this.type;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivitySubType getSubType() {
            return this.subType;
        }

        public final java.lang.String getDisplayStatus() {
            return this.displayStatus;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> getChannels() {
            return this.channels;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection getMoneyMovementDirection() {
            return this.moneyMovementDirection;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption> getHelpCenterOptions() {
            return this.helpCenterOptions;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar getAvatar() {
            return this.avatar;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> getMoneyMovements() {
            return this.moneyMovements;
        }

        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty getCounterparty() {
            return this.counterparty;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo getAmountInfo() {
            return this.amountInfo;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order getOrder() {
            return this.order;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> getActions() {
            return this.actions;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> getActivityInsights() {
            return this.activityInsights;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> getRelatedActivities() {
            return this.relatedActivities;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> getMoneyConversions() {
            return this.moneyConversions;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> getCryptoAssetConversions() {
            return this.cryptoAssetConversions;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> getSkuItems() {
            return this.skuItems;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityRecurringBuyFrequency getRecurringBuyFrequency() {
            return this.recurringBuyFrequency;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails getShippingDetails() {
            return this.shippingDetails;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress getEtaProgress() {
            return this.etaProgress;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute getDispute() {
            return this.dispute;
        }

        public final java.lang.String getCryptoTxnSignatureId() {
            return this.cryptoTxnSignatureId;
        }

        public final java.lang.String getTransactionNote() {
            return this.transactionNote;
        }

        public final java.lang.String getShortDescription() {
            return this.shortDescription;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner getPartner() {
            return this.partner;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward getSynchronyReward() {
            return this.synchronyReward;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags getFlags() {
            return this.flags;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> getCryptoAssets() {
            return this.cryptoAssets;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo getRegulatoryInfo() {
            return this.regulatoryInfo;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.groupId;
            java.lang.Object obj = this.createdTime;
            java.lang.String str3 = this.displayDateFormat;
            java.lang.String str4 = this.systemNote;
            java.lang.String str5 = this.userNote;
            java.lang.String str6 = this.etaNote;
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = this.type;
            com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType = this.subType;
            java.lang.String str7 = this.displayStatus;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> list = this.channels;
            com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection = this.moneyMovementDirection;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption> list2 = this.helpCenterOptions;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar avatar = this.avatar;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> list3 = this.moneyMovements;
            java.lang.String str8 = this.invoiceId;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty counterparty = this.counterparty;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo amountInfo = this.amountInfo;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order order = this.order;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> list4 = this.actions;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> list5 = this.activityInsights;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> list6 = this.relatedActivities;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> list7 = this.moneyConversions;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> list8 = this.cryptoAssetConversions;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> list9 = this.skuItems;
            com.paypal.oslo.api.graphql.schema.type.ActivityRecurringBuyFrequency activityRecurringBuyFrequency = this.recurringBuyFrequency;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails = this.shippingDetails;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress = this.etaProgress;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute = this.dispute;
            java.lang.String str9 = this.cryptoTxnSignatureId;
            java.lang.String str10 = this.transactionNote;
            java.lang.String str11 = this.shortDescription;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner = this.partner;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward = this.synchronyReward;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags = this.flags;
            com.paypal.oslo.api.graphql.schema.type.ActivityStatus activityStatus = this.status;
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> list10 = this.cryptoAssets;
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo = this.regulatoryInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Result(id=");
            sb.append(str);
            sb.append(", groupId=");
            sb.append(str2);
            sb.append(", createdTime=");
            sb.append(obj);
            sb.append(", displayDateFormat=");
            sb.append(str3);
            sb.append(", systemNote=");
            sb.append(str4);
            sb.append(", userNote=");
            sb.append(str5);
            sb.append(", etaNote=");
            sb.append(str6);
            sb.append(", type=");
            sb.append(activityType);
            sb.append(", subType=");
            sb.append(activitySubType);
            sb.append(", displayStatus=");
            sb.append(str7);
            sb.append(", channels=");
            sb.append(list);
            sb.append(", moneyMovementDirection=");
            sb.append(moneyMovementDirection);
            sb.append(", helpCenterOptions=");
            sb.append(list2);
            sb.append(", avatar=");
            sb.append(avatar);
            sb.append(", moneyMovements=");
            sb.append(list3);
            sb.append(", invoiceId=");
            sb.append(str8);
            sb.append(", counterparty=");
            sb.append(counterparty);
            sb.append(", amountInfo=");
            sb.append(amountInfo);
            sb.append(", order=");
            sb.append(order);
            sb.append(", actions=");
            sb.append(list4);
            sb.append(", activityInsights=");
            sb.append(list5);
            sb.append(", relatedActivities=");
            sb.append(list6);
            sb.append(", moneyConversions=");
            sb.append(list7);
            sb.append(", cryptoAssetConversions=");
            sb.append(list8);
            sb.append(", skuItems=");
            sb.append(list9);
            sb.append(", recurringBuyFrequency=");
            sb.append(activityRecurringBuyFrequency);
            sb.append(", shippingDetails=");
            sb.append(shippingDetails);
            sb.append(", etaProgress=");
            sb.append(etaProgress);
            sb.append(", dispute=");
            sb.append(dispute);
            sb.append(", cryptoTxnSignatureId=");
            sb.append(str9);
            sb.append(", transactionNote=");
            sb.append(str10);
            sb.append(", shortDescription=");
            sb.append(str11);
            sb.append(", partner=");
            sb.append(partner);
            sb.append(", synchronyReward=");
            sb.append(synchronyReward);
            sb.append(", flags=");
            sb.append(flags);
            sb.append(", status=");
            sb.append(activityStatus);
            sb.append(", cryptoAssets=");
            sb.append(list10);
            sb.append(", regulatoryInfo=");
            sb.append(regulatoryInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.groupId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.createdTime.hashCode();
            int hashCode4 = this.displayDateFormat.hashCode();
            java.lang.String str2 = this.systemNote;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.userNote;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.etaNote;
            int hashCode7 = str4 == null ? 0 : str4.hashCode();
            int hashCode8 = this.type.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ActivitySubType activitySubType = this.subType;
            int hashCode9 = activitySubType == null ? 0 : activitySubType.hashCode();
            java.lang.String str5 = this.displayStatus;
            int hashCode10 = str5 == null ? 0 : str5.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> list = this.channels;
            int hashCode11 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection = this.moneyMovementDirection;
            int hashCode12 = moneyMovementDirection == null ? 0 : moneyMovementDirection.hashCode();
            int hashCode13 = this.helpCenterOptions.hashCode();
            int hashCode14 = this.avatar.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> list2 = this.moneyMovements;
            int hashCode15 = list2 == null ? 0 : list2.hashCode();
            java.lang.String str6 = this.invoiceId;
            int hashCode16 = str6 == null ? 0 : str6.hashCode();
            int hashCode17 = this.counterparty.hashCode();
            int hashCode18 = this.amountInfo.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order order = this.order;
            int hashCode19 = order == null ? 0 : order.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> list3 = this.actions;
            int hashCode20 = list3 == null ? 0 : list3.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> list4 = this.activityInsights;
            int hashCode21 = list4 == null ? 0 : list4.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> list5 = this.relatedActivities;
            int hashCode22 = list5 == null ? 0 : list5.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> list6 = this.moneyConversions;
            int hashCode23 = list6 == null ? 0 : list6.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> list7 = this.cryptoAssetConversions;
            int hashCode24 = list7 == null ? 0 : list7.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> list8 = this.skuItems;
            int hashCode25 = list8 == null ? 0 : list8.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ActivityRecurringBuyFrequency activityRecurringBuyFrequency = this.recurringBuyFrequency;
            int hashCode26 = activityRecurringBuyFrequency == null ? 0 : activityRecurringBuyFrequency.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails = this.shippingDetails;
            int hashCode27 = shippingDetails == null ? 0 : shippingDetails.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress = this.etaProgress;
            int hashCode28 = etaProgress == null ? 0 : etaProgress.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute = this.dispute;
            int hashCode29 = dispute == null ? 0 : dispute.hashCode();
            java.lang.String str7 = this.cryptoTxnSignatureId;
            int hashCode30 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.transactionNote;
            int hashCode31 = str8 == null ? 0 : str8.hashCode();
            int hashCode32 = this.shortDescription.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner = this.partner;
            int hashCode33 = partner == null ? 0 : partner.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward = this.synchronyReward;
            int hashCode34 = synchronyReward == null ? 0 : synchronyReward.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags = this.flags;
            int hashCode35 = flags == null ? 0 : flags.hashCode();
            int hashCode36 = this.status.hashCode();
            java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> list9 = this.cryptoAssets;
            int hashCode37 = list9 == null ? 0 : list9.hashCode();
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo = this.regulatoryInfo;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + hashCode29) * 31) + hashCode30) * 31) + hashCode31) * 31) + hashCode32) * 31) + hashCode33) * 31) + hashCode34) * 31) + hashCode35) * 31) + hashCode36) * 31) + hashCode37) * 31) + (regulatoryInfo != null ? regulatoryInfo.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, result.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.groupId, result.groupId) && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, result.createdTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayDateFormat, result.displayDateFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.systemNote, result.systemNote) && kotlin.jvm.internal.Intrinsics.areEqual(this.userNote, result.userNote) && kotlin.jvm.internal.Intrinsics.areEqual(this.etaNote, result.etaNote) && this.type == result.type && this.subType == result.subType && kotlin.jvm.internal.Intrinsics.areEqual(this.displayStatus, result.displayStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.channels, result.channels) && this.moneyMovementDirection == result.moneyMovementDirection && kotlin.jvm.internal.Intrinsics.areEqual(this.helpCenterOptions, result.helpCenterOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.avatar, result.avatar) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyMovements, result.moneyMovements) && kotlin.jvm.internal.Intrinsics.areEqual(this.invoiceId, result.invoiceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.counterparty, result.counterparty) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountInfo, result.amountInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.order, result.order) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, result.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityInsights, result.activityInsights) && kotlin.jvm.internal.Intrinsics.areEqual(this.relatedActivities, result.relatedActivities) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyConversions, result.moneyConversions) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAssetConversions, result.cryptoAssetConversions) && kotlin.jvm.internal.Intrinsics.areEqual(this.skuItems, result.skuItems) && this.recurringBuyFrequency == result.recurringBuyFrequency && kotlin.jvm.internal.Intrinsics.areEqual(this.shippingDetails, result.shippingDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.etaProgress, result.etaProgress) && kotlin.jvm.internal.Intrinsics.areEqual(this.dispute, result.dispute) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoTxnSignatureId, result.cryptoTxnSignatureId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionNote, result.transactionNote) && kotlin.jvm.internal.Intrinsics.areEqual(this.shortDescription, result.shortDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.partner, result.partner) && kotlin.jvm.internal.Intrinsics.areEqual(this.synchronyReward, result.synchronyReward) && kotlin.jvm.internal.Intrinsics.areEqual(this.flags, result.flags) && this.status == result.status && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoAssets, result.cryptoAssets) && kotlin.jvm.internal.Intrinsics.areEqual(this.regulatoryInfo, result.regulatoryInfo);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result copy(java.lang.String id, java.lang.String groupId, java.lang.Object createdTime, java.lang.String displayDateFormat, java.lang.String systemNote, java.lang.String userNote, java.lang.String etaNote, com.paypal.oslo.api.graphql.schema.type.ActivityType type, com.paypal.oslo.api.graphql.schema.type.ActivitySubType subType, java.lang.String displayStatus, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityChannel> channels, com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection moneyMovementDirection, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption> helpCenterOptions, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar avatar, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> moneyMovements, java.lang.String invoiceId, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty counterparty, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo amountInfo, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order order, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> actions, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> activityInsights, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> relatedActivities, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> moneyConversions, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> cryptoAssetConversions, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> skuItems, com.paypal.oslo.api.graphql.schema.type.ActivityRecurringBuyFrequency recurringBuyFrequency, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute, java.lang.String cryptoTxnSignatureId, java.lang.String transactionNote, java.lang.String shortDescription, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags, com.paypal.oslo.api.graphql.schema.type.ActivityStatus status, java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> cryptoAssets, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayDateFormat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatar, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counterparty, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shortDescription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result(id, groupId, createdTime, displayDateFormat, systemNote, userNote, etaNote, type, subType, displayStatus, channels, moneyMovementDirection, helpCenterOptions, avatar, moneyMovements, invoiceId, counterparty, amountInfo, order, actions, activityInsights, relatedActivities, moneyConversions, cryptoAssetConversions, skuItems, recurringBuyFrequency, shippingDetails, etaProgress, dispute, cryptoTxnSignatureId, transactionNote, shortDescription, partner, synchronyReward, flags, status, cryptoAssets, regulatoryInfo);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivitySubType getSubType() {
            return this.subType;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
            return this.type;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getEtaNote() {
            return this.etaNote;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getUserNote() {
            return this.userNote;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSystemNote() {
            return this.systemNote;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDisplayDateFormat() {
            return this.displayDateFormat;
        }

        /* renamed from: component38, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo getRegulatoryInfo() {
            return this.regulatoryInfo;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset> component37() {
            return this.cryptoAssets;
        }

        /* renamed from: component36, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivityStatus getStatus() {
            return this.status;
        }

        /* renamed from: component35, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags getFlags() {
            return this.flags;
        }

        /* renamed from: component34, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward getSynchronyReward() {
            return this.synchronyReward;
        }

        /* renamed from: component33, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner getPartner() {
            return this.partner;
        }

        /* renamed from: component32, reason: from getter */
        public final java.lang.String getShortDescription() {
            return this.shortDescription;
        }

        /* renamed from: component31, reason: from getter */
        public final java.lang.String getTransactionNote() {
            return this.transactionNote;
        }

        /* renamed from: component30, reason: from getter */
        public final java.lang.String getCryptoTxnSignatureId() {
            return this.cryptoTxnSignatureId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        /* renamed from: component29, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute getDispute() {
            return this.dispute;
        }

        /* renamed from: component28, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress getEtaProgress() {
            return this.etaProgress;
        }

        /* renamed from: component27, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails getShippingDetails() {
            return this.shippingDetails;
        }

        /* renamed from: component26, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivityRecurringBuyFrequency getRecurringBuyFrequency() {
            return this.recurringBuyFrequency;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem> component25() {
            return this.skuItems;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion> component24() {
            return this.cryptoAssetConversions;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion> component23() {
            return this.moneyConversions;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> component22() {
            return this.relatedActivities;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight> component21() {
            return this.activityInsights;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action> component20() {
            return this.actions;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGroupId() {
            return this.groupId;
        }

        /* renamed from: component19, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order getOrder() {
            return this.order;
        }

        /* renamed from: component18, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo getAmountInfo() {
            return this.amountInfo;
        }

        /* renamed from: component17, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty getCounterparty() {
            return this.counterparty;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getInvoiceId() {
            return this.invoiceId;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement> component15() {
            return this.moneyMovements;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar getAvatar() {
            return this.avatar;
        }

        public final java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption> component13() {
            return this.helpCenterOptions;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection getMoneyMovementDirection() {
            return this.moneyMovementDirection;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> component11() {
            return this.channels;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getDisplayStatus() {
            return this.displayStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$HelpCenterOption;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityHelpCenterFragment;", "activityHelpCenterFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityHelpCenterFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityHelpCenterFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityHelpCenterFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$HelpCenterOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityHelpCenterFragment;", "getActivityHelpCenterFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HelpCenterOption {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment activityHelpCenterFragment;

        public HelpCenterOption(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment activityHelpCenterFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHelpCenterFragment, "");
            this.__typename = str;
            this.activityHelpCenterFragment = activityHelpCenterFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment getActivityHelpCenterFragment() {
            return this.activityHelpCenterFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment activityHelpCenterFragment = this.activityHelpCenterFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpCenterOption(__typename=");
            sb.append(str);
            sb.append(", activityHelpCenterFragment=");
            sb.append(activityHelpCenterFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityHelpCenterFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption helpCenterOption = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, helpCenterOption.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityHelpCenterFragment, helpCenterOption.activityHelpCenterFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment activityHelpCenterFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHelpCenterFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption(__typename, activityHelpCenterFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment getActivityHelpCenterFragment() {
            return this.activityHelpCenterFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.HelpCenterOption helpCenterOption, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityHelpCenterFragment activityHelpCenterFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = helpCenterOption.__typename;
            }
            if ((i & 2) != 0) {
                activityHelpCenterFragment = helpCenterOption.activityHelpCenterFragment;
            }
            return helpCenterOption.copy(str, activityHelpCenterFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Avatar;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;", "activityAvatarDetailFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Avatar;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAvatarDetailFragment;", "getActivityAvatarDetailFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Avatar {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment activityAvatarDetailFragment;

        public Avatar(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment activityAvatarDetailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAvatarDetailFragment, "");
            this.__typename = str;
            this.activityAvatarDetailFragment = activityAvatarDetailFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment getActivityAvatarDetailFragment() {
            return this.activityAvatarDetailFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment activityAvatarDetailFragment = this.activityAvatarDetailFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Avatar(__typename=");
            sb.append(str);
            sb.append(", activityAvatarDetailFragment=");
            sb.append(activityAvatarDetailFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityAvatarDetailFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar avatar = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, avatar.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityAvatarDetailFragment, avatar.activityAvatarDetailFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment activityAvatarDetailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAvatarDetailFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar(__typename, activityAvatarDetailFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment getActivityAvatarDetailFragment() {
            return this.activityAvatarDetailFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Avatar avatar, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAvatarDetailFragment activityAvatarDetailFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = avatar.__typename;
            }
            if ((i & 2) != 0) {
                activityAvatarDetailFragment = avatar.activityAvatarDetailFragment;
            }
            return avatar.copy(str, activityAvatarDetailFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$MoneyMovement;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyMovementFragment;", "activityMoneyMovementFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyMovementFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyMovementFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyMovementFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$MoneyMovement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyMovementFragment;", "getActivityMoneyMovementFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyMovement {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment activityMoneyMovementFragment;

        public MoneyMovement(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment activityMoneyMovementFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyMovementFragment, "");
            this.__typename = str;
            this.activityMoneyMovementFragment = activityMoneyMovementFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment getActivityMoneyMovementFragment() {
            return this.activityMoneyMovementFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment activityMoneyMovementFragment = this.activityMoneyMovementFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyMovement(__typename=");
            sb.append(str);
            sb.append(", activityMoneyMovementFragment=");
            sb.append(activityMoneyMovementFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityMoneyMovementFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement moneyMovement = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, moneyMovement.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyMovementFragment, moneyMovement.activityMoneyMovementFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment activityMoneyMovementFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyMovementFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement(__typename, activityMoneyMovementFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment getActivityMoneyMovementFragment() {
            return this.activityMoneyMovementFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyMovement moneyMovement, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyMovementFragment activityMoneyMovementFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneyMovement.__typename;
            }
            if ((i & 2) != 0) {
                activityMoneyMovementFragment = moneyMovement.activityMoneyMovementFragment;
            }
            return moneyMovement.copy(str, activityMoneyMovementFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Counterparty;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment;", "activityCounterpartyDetailFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Counterparty;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment;", "getActivityCounterpartyDetailFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Counterparty {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment;

        public Counterparty(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCounterpartyDetailFragment, "");
            this.__typename = str;
            this.activityCounterpartyDetailFragment = activityCounterpartyDetailFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment getActivityCounterpartyDetailFragment() {
            return this.activityCounterpartyDetailFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment = this.activityCounterpartyDetailFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Counterparty(__typename=");
            sb.append(str);
            sb.append(", activityCounterpartyDetailFragment=");
            sb.append(activityCounterpartyDetailFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityCounterpartyDetailFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty counterparty = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, counterparty.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityCounterpartyDetailFragment, counterparty.activityCounterpartyDetailFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCounterpartyDetailFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty(__typename, activityCounterpartyDetailFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment getActivityCounterpartyDetailFragment() {
            return this.activityCounterpartyDetailFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Counterparty counterparty, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = counterparty.__typename;
            }
            if ((i & 2) != 0) {
                activityCounterpartyDetailFragment = counterparty.activityCounterpartyDetailFragment;
            }
            return counterparty.copy(str, activityCounterpartyDetailFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoDetailFragment;", "activityAmountInfoDetailFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoDetailFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoDetailFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoDetailFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$AmountInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityAmountInfoDetailFragment;", "getActivityAmountInfoDetailFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountInfo {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment activityAmountInfoDetailFragment;

        public AmountInfo(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment activityAmountInfoDetailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAmountInfoDetailFragment, "");
            this.__typename = str;
            this.activityAmountInfoDetailFragment = activityAmountInfoDetailFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment getActivityAmountInfoDetailFragment() {
            return this.activityAmountInfoDetailFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment activityAmountInfoDetailFragment = this.activityAmountInfoDetailFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountInfo(__typename=");
            sb.append(str);
            sb.append(", activityAmountInfoDetailFragment=");
            sb.append(activityAmountInfoDetailFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityAmountInfoDetailFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo amountInfo = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amountInfo.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityAmountInfoDetailFragment, amountInfo.activityAmountInfoDetailFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment activityAmountInfoDetailFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAmountInfoDetailFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo(__typename, activityAmountInfoDetailFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment getActivityAmountInfoDetailFragment() {
            return this.activityAmountInfoDetailFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.AmountInfo amountInfo, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityAmountInfoDetailFragment activityAmountInfoDetailFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amountInfo.__typename;
            }
            if ((i & 2) != 0) {
                activityAmountInfoDetailFragment = amountInfo.activityAmountInfoDetailFragment;
            }
            return amountInfo.copy(str, activityAmountInfoDetailFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Order;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityOrderFragment;", "activityOrderFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityOrderFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityOrderFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityOrderFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Order;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityOrderFragment;", "getActivityOrderFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Order {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityOrderFragment activityOrderFragment;

        public Order(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityOrderFragment activityOrderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityOrderFragment, "");
            this.__typename = str;
            this.activityOrderFragment = activityOrderFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityOrderFragment getActivityOrderFragment() {
            return this.activityOrderFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityOrderFragment activityOrderFragment = this.activityOrderFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Order(__typename=");
            sb.append(str);
            sb.append(", activityOrderFragment=");
            sb.append(activityOrderFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityOrderFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order order = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, order.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityOrderFragment, order.activityOrderFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityOrderFragment activityOrderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityOrderFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order(__typename, activityOrderFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityOrderFragment getActivityOrderFragment() {
            return this.activityOrderFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Order order, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityOrderFragment activityOrderFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = order.__typename;
            }
            if ((i & 2) != 0) {
                activityOrderFragment = order.activityOrderFragment;
            }
            return order.copy(str, activityOrderFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Action;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "activityActionsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Action;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "getActivityActionsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment;

        public Action(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionsFragment, "");
            this.__typename = str;
            this.activityActionsFragment = activityActionsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment getActivityActionsFragment() {
            return this.activityActionsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment = this.activityActionsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(__typename=");
            sb.append(str);
            sb.append(", activityActionsFragment=");
            sb.append(activityActionsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityActionsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action action = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, action.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityActionsFragment, action.activityActionsFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionsFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action(__typename, activityActionsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment getActivityActionsFragment() {
            return this.activityActionsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Action action, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = action.__typename;
            }
            if ((i & 2) != 0) {
                activityActionsFragment = action.activityActionsFragment;
            }
            return action.copy(str, activityActionsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ActivityInsight;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityInsightFragment;", "activityInsightFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityInsightFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityInsightFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityInsightFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ActivityInsight;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityInsightFragment;", "getActivityInsightFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityInsight {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment;

        public ActivityInsight(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInsightFragment, "");
            this.__typename = str;
            this.activityInsightFragment = activityInsightFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment getActivityInsightFragment() {
            return this.activityInsightFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment = this.activityInsightFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityInsight(__typename=");
            sb.append(str);
            sb.append(", activityInsightFragment=");
            sb.append(activityInsightFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityInsightFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight activityInsight = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, activityInsight.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityInsightFragment, activityInsight.activityInsightFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInsightFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight(__typename, activityInsightFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment getActivityInsightFragment() {
            return this.activityInsightFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ActivityInsight activityInsight, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsightFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activityInsight.__typename;
            }
            if ((i & 2) != 0) {
                activityInsightFragment = activityInsight.activityInsightFragment;
            }
            return activityInsight.copy(str, activityInsightFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RelatedActivity;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RelatedActivity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RelatedActivity {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.ActivityType type;

        public RelatedActivity(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
            this.id = str;
            this.type = activityType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelatedActivity(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(activityType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity relatedActivity = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, relatedActivity.id) && this.type == relatedActivity.type;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.ActivityType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity(id, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivityType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity relatedActivity, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = relatedActivity.id;
            }
            if ((i & 2) != 0) {
                activityType = relatedActivity.type;
            }
            return relatedActivity.copy(str, activityType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$MoneyConversion;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;", "activityMoneyConversionFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$MoneyConversion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;", "getActivityMoneyConversionFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoneyConversion {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment;

        public MoneyConversion(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyConversionFragment, "");
            this.__typename = str;
            this.activityMoneyConversionFragment = activityMoneyConversionFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment getActivityMoneyConversionFragment() {
            return this.activityMoneyConversionFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment = this.activityMoneyConversionFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyConversion(__typename=");
            sb.append(str);
            sb.append(", activityMoneyConversionFragment=");
            sb.append(activityMoneyConversionFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityMoneyConversionFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion moneyConversion = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, moneyConversion.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityMoneyConversionFragment, moneyConversion.activityMoneyConversionFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityMoneyConversionFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion(__typename, activityMoneyConversionFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment getActivityMoneyConversionFragment() {
            return this.activityMoneyConversionFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.MoneyConversion moneyConversion, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment activityMoneyConversionFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneyConversion.__typename;
            }
            if ((i & 2) != 0) {
                activityMoneyConversionFragment = moneyConversion.activityMoneyConversionFragment;
            }
            return moneyConversion.copy(str, activityMoneyConversionFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$CryptoAssetConversion;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment;", "activityCryptoAssetConversionFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$CryptoAssetConversion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCryptoAssetConversionFragment;", "getActivityCryptoAssetConversionFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoAssetConversion {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment;

        public CryptoAssetConversion(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCryptoAssetConversionFragment, "");
            this.__typename = str;
            this.activityCryptoAssetConversionFragment = activityCryptoAssetConversionFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment getActivityCryptoAssetConversionFragment() {
            return this.activityCryptoAssetConversionFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment = this.activityCryptoAssetConversionFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoAssetConversion(__typename=");
            sb.append(str);
            sb.append(", activityCryptoAssetConversionFragment=");
            sb.append(activityCryptoAssetConversionFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityCryptoAssetConversionFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion cryptoAssetConversion = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cryptoAssetConversion.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityCryptoAssetConversionFragment, cryptoAssetConversion.activityCryptoAssetConversionFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityCryptoAssetConversionFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion(__typename, activityCryptoAssetConversionFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment getActivityCryptoAssetConversionFragment() {
            return this.activityCryptoAssetConversionFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAssetConversion cryptoAssetConversion, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCryptoAssetConversionFragment activityCryptoAssetConversionFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoAssetConversion.__typename;
            }
            if ((i & 2) != 0) {
                activityCryptoAssetConversionFragment = cryptoAssetConversion.activityCryptoAssetConversionFragment;
            }
            return cryptoAssetConversion.copy(str, activityCryptoAssetConversionFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SkuItem;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitySkuItemFragment;", "activitySkuItemFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitySkuItemFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitySkuItemFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitySkuItemFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SkuItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitySkuItemFragment;", "getActivitySkuItemFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SkuItem {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment activitySkuItemFragment;

        public SkuItem(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment activitySkuItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySkuItemFragment, "");
            this.__typename = str;
            this.activitySkuItemFragment = activitySkuItemFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment getActivitySkuItemFragment() {
            return this.activitySkuItemFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment activitySkuItemFragment = this.activitySkuItemFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SkuItem(__typename=");
            sb.append(str);
            sb.append(", activitySkuItemFragment=");
            sb.append(activitySkuItemFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activitySkuItemFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem skuItem = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, skuItem.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activitySkuItemFragment, skuItem.activitySkuItemFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment activitySkuItemFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySkuItemFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem(__typename, activitySkuItemFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment getActivitySkuItemFragment() {
            return this.activitySkuItemFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SkuItem skuItem, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivitySkuItemFragment activitySkuItemFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = skuItem.__typename;
            }
            if ((i & 2) != 0) {
                activitySkuItemFragment = skuItem.activitySkuItemFragment;
            }
            return skuItem.copy(str, activitySkuItemFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShippingDetails;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment;", "activityShippingDetailsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShippingDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShippingDetailsFragment;", "getActivityShippingDetailsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShippingDetails {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment;

        public ShippingDetails(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShippingDetailsFragment, "");
            this.__typename = str;
            this.activityShippingDetailsFragment = activityShippingDetailsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment getActivityShippingDetailsFragment() {
            return this.activityShippingDetailsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment = this.activityShippingDetailsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingDetails(__typename=");
            sb.append(str);
            sb.append(", activityShippingDetailsFragment=");
            sb.append(activityShippingDetailsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityShippingDetailsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, shippingDetails.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityShippingDetailsFragment, shippingDetails.activityShippingDetailsFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShippingDetailsFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails(__typename, activityShippingDetailsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment getActivityShippingDetailsFragment() {
            return this.activityShippingDetailsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shippingDetails.__typename;
            }
            if ((i & 2) != 0) {
                activityShippingDetailsFragment = shippingDetails.activityShippingDetailsFragment;
            }
            return shippingDetails.copy(str, activityShippingDetailsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$EtaProgress;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment;", "activityEtaProgressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$EtaProgress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment;", "getActivityEtaProgressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EtaProgress {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment;

        public EtaProgress(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityEtaProgressFragment, "");
            this.__typename = str;
            this.activityEtaProgressFragment = activityEtaProgressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment getActivityEtaProgressFragment() {
            return this.activityEtaProgressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment = this.activityEtaProgressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EtaProgress(__typename=");
            sb.append(str);
            sb.append(", activityEtaProgressFragment=");
            sb.append(activityEtaProgressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityEtaProgressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, etaProgress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityEtaProgressFragment, etaProgress.activityEtaProgressFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityEtaProgressFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress(__typename, activityEtaProgressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment getActivityEtaProgressFragment() {
            return this.activityEtaProgressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.EtaProgress etaProgress, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = etaProgress.__typename;
            }
            if ((i & 2) != 0) {
                activityEtaProgressFragment = etaProgress.activityEtaProgressFragment;
            }
            return etaProgress.copy(str, activityEtaProgressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Dispute;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment;", "activityDisputeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Dispute;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDisputeFragment;", "getActivityDisputeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dispute {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment;

        public Dispute(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDisputeFragment, "");
            this.__typename = str;
            this.activityDisputeFragment = activityDisputeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment getActivityDisputeFragment() {
            return this.activityDisputeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment = this.activityDisputeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dispute(__typename=");
            sb.append(str);
            sb.append(", activityDisputeFragment=");
            sb.append(activityDisputeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityDisputeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, dispute.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDisputeFragment, dispute.activityDisputeFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDisputeFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute(__typename, activityDisputeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment getActivityDisputeFragment() {
            return this.activityDisputeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Dispute dispute, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDisputeFragment activityDisputeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dispute.__typename;
            }
            if ((i & 2) != 0) {
                activityDisputeFragment = dispute.activityDisputeFragment;
            }
            return dispute.copy(str, activityDisputeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Partner;", "", "", "externalId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Partner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExternalId", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityPartnerType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Partner {
        public static final int $stable = 0;
        private final java.lang.String externalId;
        private final com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType type;

        public Partner(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType) {
            this.externalId = str;
            this.type = activityPartnerType;
        }

        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.externalId;
            com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Partner(externalId=");
            sb.append(str);
            sb.append(", type=");
            sb.append(activityPartnerType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.externalId;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType = this.type;
            return (hashCode * 31) + (activityPartnerType != null ? activityPartnerType.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, partner.externalId) && this.type == partner.type;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner copy(java.lang.String externalId, com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType type) {
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner(externalId, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType activityPartnerType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = partner.externalId;
            }
            if ((i & 2) != 0) {
                activityPartnerType = partner.type;
            }
            return partner.copy(str, activityPartnerType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SynchronyReward;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment;", "activityDetailSynchronyRewardFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$SynchronyReward;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment;", "getActivityDetailSynchronyRewardFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SynchronyReward {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment;

        public SynchronyReward(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSynchronyRewardFragment, "");
            this.__typename = str;
            this.activityDetailSynchronyRewardFragment = activityDetailSynchronyRewardFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment getActivityDetailSynchronyRewardFragment() {
            return this.activityDetailSynchronyRewardFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment = this.activityDetailSynchronyRewardFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SynchronyReward(__typename=");
            sb.append(str);
            sb.append(", activityDetailSynchronyRewardFragment=");
            sb.append(activityDetailSynchronyRewardFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityDetailSynchronyRewardFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, synchronyReward.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDetailSynchronyRewardFragment, synchronyReward.activityDetailSynchronyRewardFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailSynchronyRewardFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward(__typename, activityDetailSynchronyRewardFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment getActivityDetailSynchronyRewardFragment() {
            return this.activityDetailSynchronyRewardFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.SynchronyReward synchronyReward, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = synchronyReward.__typename;
            }
            if ((i & 2) != 0) {
                activityDetailSynchronyRewardFragment = synchronyReward.activityDetailSynchronyRewardFragment;
            }
            return synchronyReward.copy(str, activityDetailSynchronyRewardFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Flags;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;", "activityFlagsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Flags;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityFlagsFragment;", "getActivityFlagsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Flags {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment;

        public Flags(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFlagsFragment, "");
            this.__typename = str;
            this.activityFlagsFragment = activityFlagsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment getActivityFlagsFragment() {
            return this.activityFlagsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment = this.activityFlagsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Flags(__typename=");
            sb.append(str);
            sb.append(", activityFlagsFragment=");
            sb.append(activityFlagsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityFlagsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, flags.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityFlagsFragment, flags.activityFlagsFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFlagsFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags(__typename, activityFlagsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment getActivityFlagsFragment() {
            return this.activityFlagsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Flags flags, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityFlagsFragment activityFlagsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = flags.__typename;
            }
            if ((i & 2) != 0) {
                activityFlagsFragment = flags.activityFlagsFragment;
            }
            return flags.copy(str, activityFlagsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$CryptoAsset;", "", "", "network", "memo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$CryptoAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNetwork", "getMemo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoAsset {
        public static final int $stable = 0;
        private final java.lang.String memo;
        private final java.lang.String network;

        public CryptoAsset(java.lang.String str, java.lang.String str2) {
            this.network = str;
            this.memo = str2;
        }

        public final java.lang.String getNetwork() {
            return this.network;
        }

        public final java.lang.String getMemo() {
            return this.memo;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.network;
            java.lang.String str2 = this.memo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoAsset(network=");
            sb.append(str);
            sb.append(", memo=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.network;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.memo;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset cryptoAsset = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.network, cryptoAsset.network) && kotlin.jvm.internal.Intrinsics.areEqual(this.memo, cryptoAsset.memo);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset copy(java.lang.String network, java.lang.String memo) {
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset(network, memo);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMemo() {
            return this.memo;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNetwork() {
            return this.network;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.CryptoAsset cryptoAsset, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoAsset.network;
            }
            if ((i & 2) != 0) {
                str2 = cryptoAsset.memo;
            }
            return cryptoAsset.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RegulatoryInfo;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRegulatoryInfoFragment;", "activityRegulatoryInfoFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRegulatoryInfoFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRegulatoryInfoFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRegulatoryInfoFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$RegulatoryInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityRegulatoryInfoFragment;", "getActivityRegulatoryInfoFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RegulatoryInfo {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment activityRegulatoryInfoFragment;

        public RegulatoryInfo(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment activityRegulatoryInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRegulatoryInfoFragment, "");
            this.__typename = str;
            this.activityRegulatoryInfoFragment = activityRegulatoryInfoFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment getActivityRegulatoryInfoFragment() {
            return this.activityRegulatoryInfoFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment activityRegulatoryInfoFragment = this.activityRegulatoryInfoFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RegulatoryInfo(__typename=");
            sb.append(str);
            sb.append(", activityRegulatoryInfoFragment=");
            sb.append(activityRegulatoryInfoFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityRegulatoryInfoFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, regulatoryInfo.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityRegulatoryInfoFragment, regulatoryInfo.activityRegulatoryInfoFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment activityRegulatoryInfoFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRegulatoryInfoFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo(__typename, activityRegulatoryInfoFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment getActivityRegulatoryInfoFragment() {
            return this.activityRegulatoryInfoFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RegulatoryInfo regulatoryInfo, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityRegulatoryInfoFragment activityRegulatoryInfoFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = regulatoryInfo.__typename;
            }
            if ((i & 2) != 0) {
                activityRegulatoryInfoFragment = regulatoryInfo.activityRegulatoryInfoFragment;
            }
            return regulatoryInfo.copy(str, activityRegulatoryInfoFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShipmentPackages;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment;", "activityShipmentPackagesFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$ShipmentPackages;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentPackagesFragment;", "getActivityShipmentPackagesFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShipmentPackages {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment;

        public ShipmentPackages(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShipmentPackagesFragment, "");
            this.__typename = str;
            this.activityShipmentPackagesFragment = activityShipmentPackagesFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment getActivityShipmentPackagesFragment() {
            return this.activityShipmentPackagesFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment = this.activityShipmentPackagesFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShipmentPackages(__typename=");
            sb.append(str);
            sb.append(", activityShipmentPackagesFragment=");
            sb.append(activityShipmentPackagesFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.activityShipmentPackagesFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, shipmentPackages.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityShipmentPackagesFragment, shipmentPackages.activityShipmentPackagesFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityShipmentPackagesFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages(__typename, activityShipmentPackagesFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment getActivityShipmentPackagesFragment() {
            return this.activityShipmentPackagesFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShipmentPackages shipmentPackages, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentPackagesFragment activityShipmentPackagesFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = shipmentPackages.__typename;
            }
            if ((i & 2) != 0) {
                activityShipmentPackagesFragment = shipmentPackages.activityShipmentPackagesFragment;
            }
            return shipmentPackages.copy(str, activityShipmentPackagesFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$TransactionRewardSummary;", "", "", "__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;", "promotionRewardSummaryFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$TransactionRewardSummary;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardSummaryFragment;", "getPromotionRewardSummaryFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionRewardSummary {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment;

        public TransactionRewardSummary(java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionRewardSummaryFragment, "");
            this.__typename = str;
            this.promotionRewardSummaryFragment = promotionRewardSummaryFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment getPromotionRewardSummaryFragment() {
            return this.promotionRewardSummaryFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment = this.promotionRewardSummaryFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionRewardSummary(__typename=");
            sb.append(str);
            sb.append(", promotionRewardSummaryFragment=");
            sb.append(promotionRewardSummaryFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.promotionRewardSummaryFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, transactionRewardSummary.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.promotionRewardSummaryFragment, transactionRewardSummary.promotionRewardSummaryFragment);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary copy(java.lang.String __typename, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionRewardSummaryFragment, "");
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary(__typename, promotionRewardSummaryFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment getPromotionRewardSummaryFragment() {
            return this.promotionRewardSummaryFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.TransactionRewardSummary transactionRewardSummary, java.lang.String str, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardSummaryFragment promotionRewardSummaryFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transactionRewardSummary.__typename;
            }
            if ((i & 2) != 0) {
                promotionRewardSummaryFragment = transactionRewardSummary.promotionRewardSummaryFragment;
            }
            return transactionRewardSummary.copy(str, promotionRewardSummaryFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship;", "", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship1;", "relationship", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship1;)V", "component1", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship1;", "copy", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship1;)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship1;", "getRelationship"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Relationship {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship;

        public Relationship(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship1) {
            this.relationship = relationship1;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 getRelationship() {
            return this.relationship;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship1 = this.relationship;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Relationship(relationship=");
            sb.append(relationship1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship1 = this.relationship;
            if (relationship1 == null) {
                return 0;
            }
            return relationship1.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship) && kotlin.jvm.internal.Intrinsics.areEqual(this.relationship, ((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship) other).relationship);
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship copy(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship) {
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship(relationship);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 getRelationship() {
            return this.relationship;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship relationship, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                relationship1 = relationship.relationship;
            }
            return relationship.copy(relationship1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship1;", "", "", "isBlocked", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Relationship1;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Relationship1 {
        public static final int $stable = 0;
        private final boolean isBlocked;

        public Relationship1(boolean z) {
            this.isBlocked = z;
        }

        public final boolean isBlocked() {
            return this.isBlocked;
        }

        public final java.lang.String toString() {
            boolean z = this.isBlocked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Relationship1(isBlocked=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isBlocked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1) && this.isBlocked == ((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1) other).isBlocked;
        }

        public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 copy(boolean isBlocked) {
            return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1(isBlocked);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsBlocked() {
            return this.isBlocked;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Relationship1 relationship1, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = relationship1.isBlocked;
            }
            return relationship1.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetActivityDetails($input: ActivityDetailsInput!, $packageInput: ActivityShipmentPackagesInput!, $skipPackages: Boolean!, $rewardInput: TransactionRewardSummaryInput!, $skipRewards: Boolean!, $skipRelationship: Boolean!) { result: activityDetails(input: $input) { id groupId createdTime displayDateFormat systemNote userNote etaNote type subType displayStatus channels moneyMovementDirection helpCenterOptions { __typename ...ActivityHelpCenterFragment } avatar { __typename ...ActivityAvatarDetailFragment } moneyMovements { __typename ...ActivityMoneyMovementFragment } invoiceId counterparty { __typename ...ActivityCounterpartyDetailFragment } amountInfo { __typename ...ActivityAmountInfoDetailFragment } order { __typename ...ActivityOrderFragment } actions { __typename ...ActivityActionsFragment } activityInsights { __typename ...ActivityInsightFragment } relatedActivities { id type } moneyConversions { __typename ...ActivityMoneyConversionFragment } cryptoAssetConversions { __typename ...ActivityCryptoAssetConversionFragment } skuItems { __typename ...ActivitySkuItemFragment } recurringBuyFrequency shippingDetails { __typename ...ActivityShippingDetailsFragment } etaProgress { __typename ...ActivityEtaProgressFragment } dispute { __typename ...ActivityDisputeFragment } cryptoTxnSignatureId transactionNote shortDescription partner { externalId type } synchronyReward { __typename ...ActivityDetailSynchronyRewardFragment } flags { __typename ...ActivityFlagsFragment } status cryptoAssets { network memo } regulatoryInfo { __typename ...ActivityRegulatoryInfoFragment } } shipmentPackages: activityShipmentPackages(input: $packageInput) @skip(if: $skipPackages) { __typename ...ActivityShipmentPackagesFragment } transactionRewardSummary: transactionRewardSummary(input: $rewardInput) @skip(if: $skipRewards) { __typename ...PromotionRewardSummaryFragment } relationship: contactById @skip(if: $skipRelationship) { relationship { isBlocked } } }  fragment ActivityHelpCenterFragment on ActivityHelpCenterOption { action { type url } contact { email phone { countryCode extensionNumber nationalNumber } url } description option title url }  fragment GenericActivityAvatarFragment on GenericActivityAvatar { name }  fragment IconActivityAvatarFragment on IconActivityAvatar { name }  fragment ImageActivityAvatarFragment on ImageActivityAvatar { url fallBackAvatar { name } iconType }  fragment InitialsActivityAvatarFragment on InitialsActivityAvatar { initials iconType }  fragment ActivityAvatarDetailFragment on ActivityAvatar { __typename ...GenericActivityAvatarFragment ...IconActivityAvatarFragment ...ImageActivityAvatarFragment ...InitialsActivityAvatarFragment }  fragment ActivityMoneyFragment on Money { currencyCode value }  fragment ActivityMoneyMovementFragment on ActivityMoneyMovement { name lastNChars description moneyMovementDirection amount { __typename ...ActivityMoneyFragment } isBackupSource }  fragment ActivityCounterpartyDetailFragment on ActivityCounterparty { displayName email accountId phone { countryCode extensionNumber nationalNumber } }  fragment ActivityCryptoAssetQuantityFragment on CryptocurrencyAssetQuantity { assetSymbol quantity quantityInSubunits decimals }  fragment ActivityAmountInfoDetailFragment on ActivityAmountInfo { amount { __typename ...ActivityMoneyFragment } cryptoAssetQuantity { __typename ...ActivityCryptoAssetQuantityFragment } isAmountNeutral isAmountSettlementCanceled amountBreakdowns { name sign isAmountReversed amount { __typename ...ActivityMoneyFragment } cryptoAssetQuantity { __typename ...ActivityCryptoAssetQuantityFragment } } }  fragment ActivityOrderFragment on ActivityOrder { id }  fragment ActivityActionsFragment on ActivityAction { type url }  fragment ActivityInsightFragment on ActivityInsight { displayMessage displaySubMessages type linkedActivityId actions { __typename ...ActivityActionsFragment } }  fragment ActivityMoneyConversionFragment on MoneyConversion { sourceAmount { __typename ...ActivityMoneyFragment } targetAmount { __typename ...ActivityMoneyFragment } exchangeRate }  fragment ActivityCryptoAssetConversionFragment on CryptocurrencyAssetConversion { assetQuantity { __typename ...ActivityCryptoAssetQuantityFragment } amount { __typename ...ActivityMoneyFragment } }  fragment ActivitySkuItemFragment on ActivitySKUItem { name imageUrl price { currencyCode value } quantity options { name selection } isPrime deliveryEstimate { maxTime minTime } }  fragment ActivityShippingDetailsFragment on ActivityShippingDetails { recipients { recipientName address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } } shippingMethodDescription shippingServiceDescription }  fragment ActivityEtaProgressFragment on ActivityETAProgress { summary milestones { description status milestoneTime note } }  fragment ActivityDisputeFragment on ActivityDispute { id summary description action { __typename ...ActivityActionsFragment } }  fragment ActivityDetailSynchronyRewardFragment on ActivityRewardDetails { rewardList { description status percentage } note }  fragment ActivityFlagsFragment on ActivityFlags { isAnonymousContribution isUprTransaction isPaypalWorldTransaction }  fragment ActivityTaxHoldBreakdownItemFragment on Activity { id type actions { __typename ...ActivityActionsFragment } amountInfo { amount { __typename ...ActivityMoneyFragment } } displayDateFormat createdTime }  fragment ActivityTaxHoldBreakdownFragment on ActivityTaxHoldBreakdown { title description items { __typename ...ActivityTaxHoldBreakdownItemFragment } }  fragment ActivityRegulatoryInfoFragment on ActivityRegulatoryInfo { processId description status taxHoldInfo { __typename ...ActivityInsightFragment } taxHoldBreakdown { __typename ...ActivityTaxHoldBreakdownFragment } }  fragment ActivityShipmentCarrierFragment on ShippingCarrier { id name logoImageUrl }  fragment ActivityShipmentItemFragment on ShipmentItem { name quantity imageUrl tags }  fragment ActivityShipmentPackageItemFragment on ShipmentPackage { logoImageUrl trackingNumber status statusMessage deliveryTime carrier { __typename ...ActivityShipmentCarrierFragment } items { __typename ...ActivityShipmentItemFragment } }  fragment ActivityShipmentPackagesFragment on ActivityShipmentPackages { activityId items { __typename ...ActivityShipmentPackageItemFragment } }  fragment PromotionRewardProgressItemFragment on PromotionRewardProgressItem { progress { transactionCountCompleted transactionCountRemaining } enrollmentExpiryDateTime description }  fragment PromotionOfferEarnedRewardTotalsFragment on PromotionOfferEarnedRewardTotals { amounts { __typename ...ActivityMoneyFragment } points }  fragment PromotionRewardSummaryFragment on PromotionRewardSummary { earnedRewards { __typename pending description ... on PromotionOfferEarnedRewardCurrency { amount { __typename ...ActivityMoneyFragment } } ... on PromotionOfferEarnedRewardPoints { points } } rewardProgress { __typename ...PromotionRewardProgressItemFragment } pendingRewardTotals { __typename ...PromotionOfferEarnedRewardTotalsFragment } completedRewardTotals { __typename ...PromotionOfferEarnedRewardTotalsFragment } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput activityDetailsInput = this.input;
        com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput activityShipmentPackagesInput = this.packageInput;
        boolean z = this.skipPackages;
        com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput transactionRewardSummaryInput = this.rewardInput;
        boolean z2 = this.skipRewards;
        boolean z3 = this.skipRelationship;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetActivityDetailsQuery(input=");
        sb.append(activityDetailsInput);
        sb.append(", packageInput=");
        sb.append(activityShipmentPackagesInput);
        sb.append(", skipPackages=");
        sb.append(z);
        sb.append(", rewardInput=");
        sb.append(transactionRewardSummaryInput);
        sb.append(", skipRewards=");
        sb.append(z2);
        sb.append(", skipRelationship=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.input.hashCode() * 31) + this.packageInput.hashCode()) * 31) + java.lang.Boolean.hashCode(this.skipPackages)) * 31) + this.rewardInput.hashCode()) * 31) + java.lang.Boolean.hashCode(this.skipRewards)) * 31) + java.lang.Boolean.hashCode(this.skipRelationship);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery getActivityDetailsQuery = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.input, getActivityDetailsQuery.input) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageInput, getActivityDetailsQuery.packageInput) && this.skipPackages == getActivityDetailsQuery.skipPackages && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardInput, getActivityDetailsQuery.rewardInput) && this.skipRewards == getActivityDetailsQuery.skipRewards && this.skipRelationship == getActivityDetailsQuery.skipRelationship;
    }

    public final com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery copy(com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput input, com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput packageInput, boolean skipPackages, com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput rewardInput, boolean skipRewards, boolean skipRelationship) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardInput, "");
        return new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery(input, packageInput, skipPackages, rewardInput, skipRewards, skipRelationship);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSkipRelationship() {
        return this.skipRelationship;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSkipRewards() {
        return this.skipRewards;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput getRewardInput() {
        return this.rewardInput;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSkipPackages() {
        return this.skipPackages;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput getPackageInput() {
        return this.packageInput;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery copy$default(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery getActivityDetailsQuery, com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput activityDetailsInput, com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput activityShipmentPackagesInput, boolean z, com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput transactionRewardSummaryInput, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityDetailsInput = getActivityDetailsQuery.input;
        }
        if ((i & 2) != 0) {
            activityShipmentPackagesInput = getActivityDetailsQuery.packageInput;
        }
        com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput activityShipmentPackagesInput2 = activityShipmentPackagesInput;
        if ((i & 4) != 0) {
            z = getActivityDetailsQuery.skipPackages;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            transactionRewardSummaryInput = getActivityDetailsQuery.rewardInput;
        }
        com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput transactionRewardSummaryInput2 = transactionRewardSummaryInput;
        if ((i & 16) != 0) {
            z2 = getActivityDetailsQuery.skipRewards;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = getActivityDetailsQuery.skipRelationship;
        }
        return getActivityDetailsQuery.copy(activityDetailsInput, activityShipmentPackagesInput2, z4, transactionRewardSummaryInput2, z5, z3);
    }
}
