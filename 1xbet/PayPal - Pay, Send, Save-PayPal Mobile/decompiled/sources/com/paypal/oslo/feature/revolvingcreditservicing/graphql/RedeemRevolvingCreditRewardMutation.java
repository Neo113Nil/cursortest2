package com.paypal.oslo.feature.revolvingcreditservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RedeemRevolvingCreditRewardInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RedeemRevolvingCreditRewardInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RedeemRevolvingCreditRewardInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RedeemRevolvingCreditRewardInput;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RedeemRevolvingCreditRewardInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RedeemRevolvingCreditRewardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "3d3c03f7c38aa5537c62303b3bfa4cc18bd5495f35559f527e960ee996e427a0";
    public static final java.lang.String OPERATION_NAME = "RedeemRevolvingCreditReward";
    private final com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Companion(null);
    public static final int $stable = 8;

    public RedeemRevolvingCreditRewardMutation(com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput redeemRevolvingCreditRewardInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemRevolvingCreditRewardInput, "");
        this.input = redeemRevolvingCreditRewardInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput getInput() {
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.RedeemRevolvingCreditRewardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.RedeemRevolvingCreditRewardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.RedeemRevolvingCreditRewardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$RedeemRevolvingCreditReward;", "redeemRevolvingCreditReward", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$RedeemRevolvingCreditReward;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$RedeemRevolvingCreditReward;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$RedeemRevolvingCreditReward;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$RedeemRevolvingCreditReward;", "getRedeemRevolvingCreditReward"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward;

        public Data(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward) {
            this.redeemRevolvingCreditReward = redeemRevolvingCreditReward;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward getRedeemRevolvingCreditReward() {
            return this.redeemRevolvingCreditReward;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward = this.redeemRevolvingCreditReward;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(redeemRevolvingCreditReward=");
            sb.append(redeemRevolvingCreditReward);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward = this.redeemRevolvingCreditReward;
            if (redeemRevolvingCreditReward == null) {
                return 0;
            }
            return redeemRevolvingCreditReward.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemRevolvingCreditReward, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data) other).redeemRevolvingCreditReward);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data(redeemRevolvingCreditReward);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward getRedeemRevolvingCreditReward() {
            return this.redeemRevolvingCreditReward;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.Data data, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemRevolvingCreditReward = data.redeemRevolvingCreditReward;
            }
            return data.copy(redeemRevolvingCreditReward);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$RedeemRevolvingCreditReward;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditRewardRedemptionStatus;", "redemptionStatus", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditRewardRedemptionStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditRewardRedemptionStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditRewardRedemptionStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$RedeemRevolvingCreditReward;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditRewardRedemptionStatus;", "getRedemptionStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RedeemRevolvingCreditReward {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus redemptionStatus;

        public RedeemRevolvingCreditReward(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus revolvingCreditRewardRedemptionStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditRewardRedemptionStatus, "");
            this.redemptionStatus = revolvingCreditRewardRedemptionStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus getRedemptionStatus() {
            return this.redemptionStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus revolvingCreditRewardRedemptionStatus = this.redemptionStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemRevolvingCreditReward(redemptionStatus=");
            sb.append(revolvingCreditRewardRedemptionStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redemptionStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward) && this.redemptionStatus == ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward) other).redemptionStatus;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus redemptionStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionStatus, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward(redemptionStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus getRedemptionStatus() {
            return this.redemptionStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation.RedeemRevolvingCreditReward redeemRevolvingCreditReward, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditRewardRedemptionStatus revolvingCreditRewardRedemptionStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                revolvingCreditRewardRedemptionStatus = redeemRevolvingCreditReward.redemptionStatus;
            }
            return redeemRevolvingCreditReward.copy(revolvingCreditRewardRedemptionStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RedeemRevolvingCreditRewardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RedeemRevolvingCreditReward($input: RedeemRevolvingCreditRewardInput!) { redeemRevolvingCreditReward(input: $input) { redemptionStatus } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput redeemRevolvingCreditRewardInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemRevolvingCreditRewardMutation(input=");
        sb.append(redeemRevolvingCreditRewardInput);
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
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation) other).input);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation copy(com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RedeemRevolvingCreditRewardMutation redeemRevolvingCreditRewardMutation, com.paypal.oslo.api.graphql.schema.type.RedeemRevolvingCreditRewardInput redeemRevolvingCreditRewardInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            redeemRevolvingCreditRewardInput = redeemRevolvingCreditRewardMutation.input;
        }
        return redeemRevolvingCreditRewardMutation.copy(redeemRevolvingCreditRewardInput);
    }
}
