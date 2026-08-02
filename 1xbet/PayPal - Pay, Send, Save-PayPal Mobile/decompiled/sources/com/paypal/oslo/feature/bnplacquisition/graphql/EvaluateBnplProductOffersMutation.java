package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OPERATION_NAME, "OnEvaluateBNPLProductOffersSuccess", "EligibleProductOfferEvaluation", "OnEvaluateBNPLProductOffersDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EvaluateBnplProductOffersMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data> {
    public static final java.lang.String OPERATION_ID = "9133bd6fd01cafebb0b2d5fe94f41159686170944e26eb849ddc20292c773120";
    public static final java.lang.String OPERATION_NAME = "EvaluateBnplProductOffers";
    private final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Companion(null);
    public static final int $stable = 8;

    public EvaluateBnplProductOffersMutation(com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput evaluateBNPLProductOffersInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateBNPLProductOffersInput, "");
        this.input = evaluateBNPLProductOffersInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput getInput() {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.EvaluateBnplProductOffersMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;", "evaluateBnplProductOffers", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;", "getEvaluateBnplProductOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers) {
            this.evaluateBnplProductOffers = evaluateBnplProductOffers;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers getEvaluateBnplProductOffers() {
            return this.evaluateBnplProductOffers;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers = this.evaluateBnplProductOffers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(evaluateBnplProductOffers=");
            sb.append(evaluateBnplProductOffers);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers = this.evaluateBnplProductOffers;
            if (evaluateBnplProductOffers == null) {
                return 0;
            }
            return evaluateBnplProductOffers.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluateBnplProductOffers, ((com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data) other).evaluateBnplProductOffers);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data(evaluateBnplProductOffers);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers getEvaluateBnplProductOffers() {
            return this.evaluateBnplProductOffers;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                evaluateBnplProductOffers = data.evaluateBnplProductOffers;
            }
            return data.copy(evaluateBnplProductOffers);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;", "onEvaluateBNPLProductOffersSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;", "onEvaluateBNPLProductOffersDecline", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;", "getOnEvaluateBNPLProductOffersSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;", "getOnEvaluateBNPLProductOffersDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EvaluateBnplProductOffers {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess;

        public EvaluateBnplProductOffers(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onEvaluateBNPLProductOffersSuccess = onEvaluateBNPLProductOffersSuccess;
            this.onEvaluateBNPLProductOffersDecline = onEvaluateBNPLProductOffersDecline;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess getOnEvaluateBNPLProductOffersSuccess() {
            return this.onEvaluateBNPLProductOffersSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline getOnEvaluateBNPLProductOffersDecline() {
            return this.onEvaluateBNPLProductOffersDecline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess = this.onEvaluateBNPLProductOffersSuccess;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline = this.onEvaluateBNPLProductOffersDecline;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateBnplProductOffers(__typename=");
            sb.append(str);
            sb.append(", onEvaluateBNPLProductOffersSuccess=");
            sb.append(onEvaluateBNPLProductOffersSuccess);
            sb.append(", onEvaluateBNPLProductOffersDecline=");
            sb.append(onEvaluateBNPLProductOffersDecline);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess = this.onEvaluateBNPLProductOffersSuccess;
            int hashCode2 = onEvaluateBNPLProductOffersSuccess == null ? 0 : onEvaluateBNPLProductOffersSuccess.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline = this.onEvaluateBNPLProductOffersDecline;
            return (((hashCode * 31) + hashCode2) * 31) + (onEvaluateBNPLProductOffersDecline != null ? onEvaluateBNPLProductOffersDecline.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, evaluateBnplProductOffers.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEvaluateBNPLProductOffersSuccess, evaluateBnplProductOffers.onEvaluateBNPLProductOffersSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEvaluateBNPLProductOffersDecline, evaluateBnplProductOffers.onEvaluateBNPLProductOffersDecline);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers(__typename, onEvaluateBNPLProductOffersSuccess, onEvaluateBNPLProductOffersDecline);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline getOnEvaluateBNPLProductOffersDecline() {
            return this.onEvaluateBNPLProductOffersDecline;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess getOnEvaluateBNPLProductOffersSuccess() {
            return this.onEvaluateBNPLProductOffersSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = evaluateBnplProductOffers.__typename;
            }
            if ((i & 2) != 0) {
                onEvaluateBNPLProductOffersSuccess = evaluateBnplProductOffers.onEvaluateBNPLProductOffersSuccess;
            }
            if ((i & 4) != 0) {
                onEvaluateBNPLProductOffersDecline = evaluateBnplProductOffers.onEvaluateBNPLProductOffersDecline;
            }
            return evaluateBnplProductOffers.copy(str, onEvaluateBNPLProductOffersSuccess, onEvaluateBNPLProductOffersDecline);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EligibleProductOfferEvaluation;", "eligibleProductOfferEvaluations", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getEligibleProductOfferEvaluations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEvaluateBNPLProductOffersSuccess {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> eligibleProductOfferEvaluations;

        public OnEvaluateBNPLProductOffersSuccess(java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.eligibleProductOfferEvaluations = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> getEligibleProductOfferEvaluations() {
            return this.eligibleProductOfferEvaluations;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> list = this.eligibleProductOfferEvaluations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEvaluateBNPLProductOffersSuccess(eligibleProductOfferEvaluations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eligibleProductOfferEvaluations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleProductOfferEvaluations, ((com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess) other).eligibleProductOfferEvaluations);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> eligibleProductOfferEvaluations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleProductOfferEvaluations, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess(eligibleProductOfferEvaluations);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> component1() {
            return this.eligibleProductOfferEvaluations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onEvaluateBNPLProductOffersSuccess.eligibleProductOfferEvaluations;
            }
            return onEvaluateBNPLProductOffersSuccess.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EligibleProductOfferEvaluation;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "id", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EligibleProductOfferEvaluation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/Object;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibleProductOfferEvaluation {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        private final java.lang.Object id;

        public EligibleProductOfferEvaluation(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.creditProductIdentifier = bNPLCreditProductIdentifier;
            this.id = obj;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            java.lang.Object obj = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleProductOfferEvaluation(creditProductIdentifier=");
            sb.append(bNPLCreditProductIdentifier);
            sb.append(", id=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.creditProductIdentifier.hashCode() * 31) + this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation eligibleProductOfferEvaluation = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation) other;
            return this.creditProductIdentifier == eligibleProductOfferEvaluation.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.id, eligibleProductOfferEvaluation.id);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation copy(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, java.lang.Object id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation(creditProductIdentifier, id);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation eligibleProductOfferEvaluation, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                bNPLCreditProductIdentifier = eligibleProductOfferEvaluation.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                obj = eligibleProductOfferEvaluation.id;
            }
            return eligibleProductOfferEvaluation.copy(bNPLCreditProductIdentifier, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionProductOffersEligibilityDeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionProductOffersEligibilityDeclineReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionProductOffersEligibilityDeclineReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionProductOffersEligibilityDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionProductOffersEligibilityDeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEvaluateBNPLProductOffersDecline {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason reason;

        public OnEvaluateBNPLProductOffersDecline(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason bNPLAcquisitionProductOffersEligibilityDeclineReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionProductOffersEligibilityDeclineReason, "");
            this.reason = bNPLAcquisitionProductOffersEligibilityDeclineReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason bNPLAcquisitionProductOffersEligibilityDeclineReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEvaluateBNPLProductOffersDecline(reason=");
            sb.append(bNPLAcquisitionProductOffersEligibilityDeclineReason);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline) other).reason;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason bNPLAcquisitionProductOffersEligibilityDeclineReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLAcquisitionProductOffersEligibilityDeclineReason = onEvaluateBNPLProductOffersDecline.reason;
            }
            return onEvaluateBNPLProductOffersDecline.copy(bNPLAcquisitionProductOffersEligibilityDeclineReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation EvaluateBnplProductOffers($input: EvaluateBNPLProductOffersInput!) { evaluateBnplProductOffers(input: $input) { __typename ... on EvaluateBNPLProductOffersSuccess { eligibleProductOfferEvaluations { creditProductIdentifier id } } ... on EvaluateBNPLProductOffersDecline { reason } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput evaluateBNPLProductOffersInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateBnplProductOffersMutation(input=");
        sb.append(evaluateBNPLProductOffersInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation copy(com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation evaluateBnplProductOffersMutation, com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput evaluateBNPLProductOffersInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluateBNPLProductOffersInput = evaluateBnplProductOffersMutation.input;
        }
        return evaluateBnplProductOffersMutation.copy(evaluateBNPLProductOffersInput);
    }
}
