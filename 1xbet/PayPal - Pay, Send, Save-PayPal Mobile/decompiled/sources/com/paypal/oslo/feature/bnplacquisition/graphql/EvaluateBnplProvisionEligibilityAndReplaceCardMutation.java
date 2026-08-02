package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n*+,-./012)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OPERATION_NAME, "OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess", "ApprovedLoanAmount", "FundingPrimaryAccountNumberToken", com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardTestTag.VIRTUAL_CARD, "CardHolder", "InstallmentSummary", "OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EvaluateBnplProvisionEligibilityAndReplaceCardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "0afe9ea81b48f1be80c962a6381641f362e61aa6be585700b06bbc21c973fe42";
    public static final java.lang.String OPERATION_NAME = "EvaluateBnplProvisionEligibilityAndReplaceCard";
    private final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Companion(null);
    public static final int $stable = 8;

    public EvaluateBnplProvisionEligibilityAndReplaceCardMutation(com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput evaluateBNPLProvisionEligibilityAndReplaceCardInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateBNPLProvisionEligibilityAndReplaceCardInput, "");
        this.input = evaluateBNPLProvisionEligibilityAndReplaceCardInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput getInput() {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.EvaluateBnplProvisionEligibilityAndReplaceCardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;", "evaluateBnplProvisionEligibilityAndReplaceCard", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;", "getEvaluateBnplProvisionEligibilityAndReplaceCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard) {
            this.evaluateBnplProvisionEligibilityAndReplaceCard = evaluateBnplProvisionEligibilityAndReplaceCard;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard getEvaluateBnplProvisionEligibilityAndReplaceCard() {
            return this.evaluateBnplProvisionEligibilityAndReplaceCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard = this.evaluateBnplProvisionEligibilityAndReplaceCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(evaluateBnplProvisionEligibilityAndReplaceCard=");
            sb.append(evaluateBnplProvisionEligibilityAndReplaceCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard = this.evaluateBnplProvisionEligibilityAndReplaceCard;
            if (evaluateBnplProvisionEligibilityAndReplaceCard == null) {
                return 0;
            }
            return evaluateBnplProvisionEligibilityAndReplaceCard.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluateBnplProvisionEligibilityAndReplaceCard, ((com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data) other).evaluateBnplProvisionEligibilityAndReplaceCard);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data(evaluateBnplProvisionEligibilityAndReplaceCard);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard getEvaluateBnplProvisionEligibilityAndReplaceCard() {
            return this.evaluateBnplProvisionEligibilityAndReplaceCard;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                evaluateBnplProvisionEligibilityAndReplaceCard = data.evaluateBnplProvisionEligibilityAndReplaceCard;
            }
            return data.copy(evaluateBnplProvisionEligibilityAndReplaceCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "getOnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "getOnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EvaluateBnplProvisionEligibilityAndReplaceCard {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;

        public EvaluateBnplProvisionEligibilityAndReplaceCard(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;
            this.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline = onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess getOnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess() {
            return this.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline getOnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline() {
            return this.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = this.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline = this.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateBnplProvisionEligibilityAndReplaceCard(__typename=");
            sb.append(str);
            sb.append(", onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess=");
            sb.append(onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess);
            sb.append(", onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline=");
            sb.append(onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = this.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;
            int hashCode2 = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess == null ? 0 : onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline = this.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;
            return (((hashCode * 31) + hashCode2) * 31) + (onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline != null ? onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, evaluateBnplProvisionEligibilityAndReplaceCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, evaluateBnplProvisionEligibilityAndReplaceCard.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline, evaluateBnplProvisionEligibilityAndReplaceCard.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard(__typename, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline getOnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline() {
            return this.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess getOnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess() {
            return this.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = evaluateBnplProvisionEligibilityAndReplaceCard.__typename;
            }
            if ((i & 2) != 0) {
                onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = evaluateBnplProvisionEligibilityAndReplaceCard.onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;
            }
            if ((i & 4) != 0) {
                onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline = evaluateBnplProvisionEligibilityAndReplaceCard.onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;
            }
            return evaluateBnplProvisionEligibilityAndReplaceCard.copy(str, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "approvedLoanAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;", "fundingPrimaryAccountNumberToken", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;", "virtualCard", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;", "cardHolder", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;", "installmentSummary", "", "primaryDeviceTokenRelinked", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;", "component5", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;", "component6", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;", "component7", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;Z)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "getApprovedLoanAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;", "getFundingPrimaryAccountNumberToken", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;", "getVirtualCard", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;", "getCardHolder", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;", "getInstallmentSummary", "Z", "getPrimaryDeviceTokenRelinked"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary;
        private final boolean primaryDeviceTokenRelinked;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard;

        public OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvedLoanAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardHolder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentSummary, "");
            this.creditProductIdentifier = bNPLCreditProductIdentifier;
            this.approvedLoanAmount = approvedLoanAmount;
            this.fundingPrimaryAccountNumberToken = fundingPrimaryAccountNumberToken;
            this.virtualCard = virtualCard;
            this.cardHolder = cardHolder;
            this.installmentSummary = installmentSummary;
            this.primaryDeviceTokenRelinked = z;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount getApprovedLoanAmount() {
            return this.approvedLoanAmount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken getFundingPrimaryAccountNumberToken() {
            return this.fundingPrimaryAccountNumberToken;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard getVirtualCard() {
            return this.virtualCard;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary getInstallmentSummary() {
            return this.installmentSummary;
        }

        public final boolean getPrimaryDeviceTokenRelinked() {
            return this.primaryDeviceTokenRelinked;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount = this.approvedLoanAmount;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken = this.fundingPrimaryAccountNumberToken;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard = this.virtualCard;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder = this.cardHolder;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary = this.installmentSummary;
            boolean z = this.primaryDeviceTokenRelinked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess(creditProductIdentifier=");
            sb.append(bNPLCreditProductIdentifier);
            sb.append(", approvedLoanAmount=");
            sb.append(approvedLoanAmount);
            sb.append(", fundingPrimaryAccountNumberToken=");
            sb.append(fundingPrimaryAccountNumberToken);
            sb.append(", virtualCard=");
            sb.append(virtualCard);
            sb.append(", cardHolder=");
            sb.append(cardHolder);
            sb.append(", installmentSummary=");
            sb.append(installmentSummary);
            sb.append(", primaryDeviceTokenRelinked=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditProductIdentifier.hashCode();
            int hashCode2 = this.approvedLoanAmount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken = this.fundingPrimaryAccountNumberToken;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + (fundingPrimaryAccountNumberToken == null ? 0 : fundingPrimaryAccountNumberToken.hashCode())) * 31) + this.virtualCard.hashCode()) * 31) + this.cardHolder.hashCode()) * 31) + this.installmentSummary.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primaryDeviceTokenRelinked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess) other;
            return this.creditProductIdentifier == onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.approvedLoanAmount, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.approvedLoanAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberToken, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.fundingPrimaryAccountNumberToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCard, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.virtualCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolder, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.cardHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.installmentSummary, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.installmentSummary) && this.primaryDeviceTokenRelinked == onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.primaryDeviceTokenRelinked;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess copy(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary, boolean primaryDeviceTokenRelinked) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvedLoanAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualCard, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardHolder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installmentSummary, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess(creditProductIdentifier, approvedLoanAmount, fundingPrimaryAccountNumberToken, virtualCard, cardHolder, installmentSummary, primaryDeviceTokenRelinked);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getPrimaryDeviceTokenRelinked() {
            return this.primaryDeviceTokenRelinked;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary getInstallmentSummary() {
            return this.installmentSummary;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard getVirtualCard() {
            return this.virtualCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken getFundingPrimaryAccountNumberToken() {
            return this.fundingPrimaryAccountNumberToken;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount getApprovedLoanAmount() {
            return this.approvedLoanAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLCreditProductIdentifier = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                approvedLoanAmount = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.approvedLoanAmount;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount2 = approvedLoanAmount;
            if ((i & 4) != 0) {
                fundingPrimaryAccountNumberToken = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.fundingPrimaryAccountNumberToken;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken2 = fundingPrimaryAccountNumberToken;
            if ((i & 8) != 0) {
                virtualCard = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.virtualCard;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard2 = virtualCard;
            if ((i & 16) != 0) {
                cardHolder = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.cardHolder;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder2 = cardHolder;
            if ((i & 32) != 0) {
                installmentSummary = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.installmentSummary;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary2 = installmentSummary;
            if ((i & 64) != 0) {
                z = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.primaryDeviceTokenRelinked;
            }
            return onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.copy(bNPLCreditProductIdentifier, approvedLoanAmount2, fundingPrimaryAccountNumberToken2, virtualCard2, cardHolder2, installmentSummary2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApprovedLoanAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public ApprovedLoanAmount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            this.__typename = str;
            this.bnplAcquisitionMoneyFragment = bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = this.bnplAcquisitionMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApprovedLoanAmount(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionMoneyFragment=");
            sb.append(bnplAcquisitionMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, approvedLoanAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, approvedLoanAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = approvedLoanAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = approvedLoanAmount.bnplAcquisitionMoneyFragment;
            }
            return approvedLoanAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "bnplAcquisitionFpanTokenFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "getBnplAcquisitionFpanTokenFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingPrimaryAccountNumberToken {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment;

        public FundingPrimaryAccountNumberToken(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionFpanTokenFragment, "");
            this.__typename = str;
            this.bnplAcquisitionFpanTokenFragment = bnplAcquisitionFpanTokenFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment getBnplAcquisitionFpanTokenFragment() {
            return this.bnplAcquisitionFpanTokenFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment = this.bnplAcquisitionFpanTokenFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingPrimaryAccountNumberToken(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionFpanTokenFragment=");
            sb.append(bnplAcquisitionFpanTokenFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionFpanTokenFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingPrimaryAccountNumberToken.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionFpanTokenFragment, fundingPrimaryAccountNumberToken.bnplAcquisitionFpanTokenFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionFpanTokenFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken(__typename, bnplAcquisitionFpanTokenFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment getBnplAcquisitionFpanTokenFragment() {
            return this.bnplAcquisitionFpanTokenFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fundingPrimaryAccountNumberToken.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionFpanTokenFragment = fundingPrimaryAccountNumberToken.bnplAcquisitionFpanTokenFragment;
            }
            return fundingPrimaryAccountNumberToken.copy(str, bnplAcquisitionFpanTokenFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;", "bnplAcquisitionVirtualCardFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionVirtualCardFragment;", "getBnplAcquisitionVirtualCardFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VirtualCard {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment;

        public VirtualCard(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionVirtualCardFragment, "");
            this.__typename = str;
            this.bnplAcquisitionVirtualCardFragment = bnplAcquisitionVirtualCardFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment getBnplAcquisitionVirtualCardFragment() {
            return this.bnplAcquisitionVirtualCardFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment = this.bnplAcquisitionVirtualCardFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualCard(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionVirtualCardFragment=");
            sb.append(bnplAcquisitionVirtualCardFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionVirtualCardFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, virtualCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionVirtualCardFragment, virtualCard.bnplAcquisitionVirtualCardFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionVirtualCardFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard(__typename, bnplAcquisitionVirtualCardFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment getBnplAcquisitionVirtualCardFragment() {
            return this.bnplAcquisitionVirtualCardFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = virtualCard.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionVirtualCardFragment = virtualCard.bnplAcquisitionVirtualCardFragment;
            }
            return virtualCard.copy(str, bnplAcquisitionVirtualCardFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;", "bnplAcquisitionCardHolderFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardHolderFragment;", "getBnplAcquisitionCardHolderFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardHolder {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment;

        public CardHolder(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardHolderFragment, "");
            this.__typename = str;
            this.bnplAcquisitionCardHolderFragment = bnplAcquisitionCardHolderFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment getBnplAcquisitionCardHolderFragment() {
            return this.bnplAcquisitionCardHolderFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment = this.bnplAcquisitionCardHolderFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardHolder(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionCardHolderFragment=");
            sb.append(bnplAcquisitionCardHolderFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionCardHolderFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardHolder.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionCardHolderFragment, cardHolder.bnplAcquisitionCardHolderFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardHolderFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder(__typename, bnplAcquisitionCardHolderFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment getBnplAcquisitionCardHolderFragment() {
            return this.bnplAcquisitionCardHolderFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment bnplAcquisitionCardHolderFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardHolder.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionCardHolderFragment = cardHolder.bnplAcquisitionCardHolderFragment;
            }
            return cardHolder.copy(str, bnplAcquisitionCardHolderFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;", "bnplAcquisitionInstallmentSummaryFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionInstallmentSummaryFragment;", "getBnplAcquisitionInstallmentSummaryFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InstallmentSummary {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment;

        public InstallmentSummary(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionInstallmentSummaryFragment, "");
            this.__typename = str;
            this.bnplAcquisitionInstallmentSummaryFragment = bnplAcquisitionInstallmentSummaryFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment getBnplAcquisitionInstallmentSummaryFragment() {
            return this.bnplAcquisitionInstallmentSummaryFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment = this.bnplAcquisitionInstallmentSummaryFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallmentSummary(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionInstallmentSummaryFragment=");
            sb.append(bnplAcquisitionInstallmentSummaryFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionInstallmentSummaryFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, installmentSummary.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionInstallmentSummaryFragment, installmentSummary.bnplAcquisitionInstallmentSummaryFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionInstallmentSummaryFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary(__typename, bnplAcquisitionInstallmentSummaryFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment getBnplAcquisitionInstallmentSummaryFragment() {
            return this.bnplAcquisitionInstallmentSummaryFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment bnplAcquisitionInstallmentSummaryFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = installmentSummary.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionInstallmentSummaryFragment = installmentSummary.bnplAcquisitionInstallmentSummaryFragment;
            }
            return installmentSummary.copy(str, bnplAcquisitionInstallmentSummaryFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLTokenProvisionEligibilityDeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLTokenProvisionEligibilityDeclineReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLTokenProvisionEligibilityDeclineReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLTokenProvisionEligibilityDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLTokenProvisionEligibilityDeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason reason;

        public OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline(com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason bNPLTokenProvisionEligibilityDeclineReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLTokenProvisionEligibilityDeclineReason, "");
            this.reason = bNPLTokenProvisionEligibilityDeclineReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason bNPLTokenProvisionEligibilityDeclineReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline(reason=");
            sb.append(bNPLTokenProvisionEligibilityDeclineReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline) other).reason;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline copy(com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline, com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason bNPLTokenProvisionEligibilityDeclineReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLTokenProvisionEligibilityDeclineReason = onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline.reason;
            }
            return onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline.copy(bNPLTokenProvisionEligibilityDeclineReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation EvaluateBnplProvisionEligibilityAndReplaceCard($input: EvaluateBNPLProvisionEligibilityAndReplaceCardInput!) { evaluateBnplProvisionEligibilityAndReplaceCard(input: $input) { __typename ... on EvaluateBNPLProvisionEligibilityAndReplaceCardSuccess { creditProductIdentifier approvedLoanAmount { __typename ...BnplAcquisitionMoneyFragment } fundingPrimaryAccountNumberToken { __typename ...BnplAcquisitionFpanTokenFragment } virtualCard { __typename ...BnplAcquisitionVirtualCardFragment } cardHolder { __typename ...BnplAcquisitionCardHolderFragment } installmentSummary { __typename ...BnplAcquisitionInstallmentSummaryFragment } primaryDeviceTokenRelinked } ... on EvaluateBNPLProvisionEligibilityAndReplaceCardDecline { reason } } }  fragment BnplAcquisitionMoneyFragment on Money { currencyCode value }  fragment BnplAcquisitionFpanTokenFragment on BNPLFundingPrimaryAccountNumberToken { cardNetwork provisionedExternalWalletTokens { deviceType referenceId walletType } serviceProvider }  fragment BnplAcquisitionVirtualCardFragment on BNPLAcquisitionVirtualCard { cardArt { url } createTime expirationDuration lastNChars }  fragment BnplAcquisitionAddressFragment on AddressPortable { addressLine1 addressLine2 adminArea1 adminArea2 postalCode countryCode }  fragment BnplAcquisitionCardHolderFragment on BNPLCardHolder { name { fullName } phoneNumber billingAddresses { __typename ...BnplAcquisitionAddressFragment } }  fragment BnplAcquisitionInstallmentSummaryFragment on BNPLAcquisitionPlanInstallmentSummary { installmentAmount { __typename ...BnplAcquisitionMoneyFragment } installmentFrequency totalInstallmentsCount }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput evaluateBNPLProvisionEligibilityAndReplaceCardInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateBnplProvisionEligibilityAndReplaceCardMutation(input=");
        sb.append(evaluateBNPLProvisionEligibilityAndReplaceCardInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation copy(com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation evaluateBnplProvisionEligibilityAndReplaceCardMutation, com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput evaluateBNPLProvisionEligibilityAndReplaceCardInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluateBNPLProvisionEligibilityAndReplaceCardInput = evaluateBnplProvisionEligibilityAndReplaceCardMutation.input;
        }
        return evaluateBnplProvisionEligibilityAndReplaceCardMutation.copy(evaluateBNPLProvisionEligibilityAndReplaceCardInput);
    }
}
