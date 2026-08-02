package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./01)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeInput;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OPERATION_NAME, "AvailableChallenge", "OnTextOneTimePasscodeIdentityChallenge", "OnEmailOneTimePasscodeIdentityChallenge", "OnWhatsappOneTimePasscodeIdentityChallenge", "OnPhoneOneTimePasscodeIdentityChallenge", "OnAuthenticatorAppIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliverStepUpIdentityChallengeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "df0b0fe1f03abfbbf1e15b690b1b687a02754cb07a0dfd5ea3eb85afc68712f6";
    public static final java.lang.String OPERATION_NAME = "DeliverStepUpIdentityChallenge";
    private final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Companion(null);
    public static final int $stable = 8;

    public DeliverStepUpIdentityChallengeMutation(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput notifyStepUpIdentityChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyStepUpIdentityChallengeInput, "");
        this.input = notifyStepUpIdentityChallengeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.DeliverStepUpIdentityChallengeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;", "deliverStepUpIdentityChallenge", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;", "getDeliverStepUpIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge;

        public Data(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deliverStepUpIdentityChallenge, "");
            this.deliverStepUpIdentityChallenge = deliverStepUpIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge getDeliverStepUpIdentityChallenge() {
            return this.deliverStepUpIdentityChallenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge = this.deliverStepUpIdentityChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(deliverStepUpIdentityChallenge=");
            sb.append(deliverStepUpIdentityChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deliverStepUpIdentityChallenge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.deliverStepUpIdentityChallenge, ((com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data) other).deliverStepUpIdentityChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data copy(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deliverStepUpIdentityChallenge, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data(deliverStepUpIdentityChallenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge getDeliverStepUpIdentityChallenge() {
            return this.deliverStepUpIdentityChallenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data data, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deliverStepUpIdentityChallenge = data.deliverStepUpIdentityChallenge;
            }
            return data.copy(deliverStepUpIdentityChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJd\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001cR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;", "", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "notifyChallengeResultStatus", "", "challengeId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "deliveryMethod", "deliveryTarget", "", "canRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "stepUpStatus", "", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$AvailableChallenge;", "availableChallenges", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component4", "component5", "()Z", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "component7", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "getNotifyChallengeResultStatus", "Ljava/lang/String;", "getChallengeId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getDeliveryMethod", "getDeliveryTarget", "Z", "getCanRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "getStepUpStatus", "Ljava/util/List;", "getAvailableChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeliverStepUpIdentityChallenge {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> availableChallenges;
        private final boolean canRetry;
        private final java.lang.String challengeId;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod;
        private final java.lang.String deliveryTarget;
        private final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyChallengeResultStatus;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus;

        public DeliverStepUpIdentityChallenge(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyStepUpIdentityChallengeResultStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeStatus, "");
            this.notifyChallengeResultStatus = notifyStepUpIdentityChallengeResultStatus;
            this.challengeId = str;
            this.deliveryMethod = stepUpIdentityChallengeMethod;
            this.deliveryTarget = str2;
            this.canRetry = z;
            this.stepUpStatus = stepUpIdentityChallengeStatus;
            this.availableChallenges = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus getNotifyChallengeResultStatus() {
            return this.notifyChallengeResultStatus;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getDeliveryMethod() {
            return this.deliveryMethod;
        }

        public final java.lang.String getDeliveryTarget() {
            return this.deliveryTarget;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> getAvailableChallenges() {
            return this.availableChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus = this.notifyChallengeResultStatus;
            java.lang.String str = this.challengeId;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.deliveryMethod;
            java.lang.String str2 = this.deliveryTarget;
            boolean z = this.canRetry;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus = this.stepUpStatus;
            java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> list = this.availableChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeliverStepUpIdentityChallenge(notifyChallengeResultStatus=");
            sb.append(notifyStepUpIdentityChallengeResultStatus);
            sb.append(", challengeId=");
            sb.append(str);
            sb.append(", deliveryMethod=");
            sb.append(stepUpIdentityChallengeMethod);
            sb.append(", deliveryTarget=");
            sb.append(str2);
            sb.append(", canRetry=");
            sb.append(z);
            sb.append(", stepUpStatus=");
            sb.append(stepUpIdentityChallengeStatus);
            sb.append(", availableChallenges=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.notifyChallengeResultStatus.hashCode();
            java.lang.String str = this.challengeId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.deliveryMethod;
            int hashCode3 = stepUpIdentityChallengeMethod == null ? 0 : stepUpIdentityChallengeMethod.hashCode();
            java.lang.String str2 = this.deliveryTarget;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            int hashCode5 = java.lang.Boolean.hashCode(this.canRetry);
            int hashCode6 = this.stepUpStatus.hashCode();
            java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> list = this.availableChallenges;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge) other;
            return this.notifyChallengeResultStatus == deliverStepUpIdentityChallenge.notifyChallengeResultStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, deliverStepUpIdentityChallenge.challengeId) && this.deliveryMethod == deliverStepUpIdentityChallenge.deliveryMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTarget, deliverStepUpIdentityChallenge.deliveryTarget) && this.canRetry == deliverStepUpIdentityChallenge.canRetry && this.stepUpStatus == deliverStepUpIdentityChallenge.stepUpStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.availableChallenges, deliverStepUpIdentityChallenge.availableChallenges);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge copy(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyChallengeResultStatus, java.lang.String challengeId, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod, java.lang.String deliveryTarget, boolean canRetry, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus, java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> availableChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyChallengeResultStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpStatus, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge(notifyChallengeResultStatus, challengeId, deliveryMethod, deliveryTarget, canRetry, stepUpStatus, availableChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> component7() {
            return this.availableChallenges;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDeliveryTarget() {
            return this.deliveryTarget;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getDeliveryMethod() {
            return this.deliveryMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus getNotifyChallengeResultStatus() {
            return this.notifyChallengeResultStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                notifyStepUpIdentityChallengeResultStatus = deliverStepUpIdentityChallenge.notifyChallengeResultStatus;
            }
            if ((i & 2) != 0) {
                str = deliverStepUpIdentityChallenge.challengeId;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                stepUpIdentityChallengeMethod = deliverStepUpIdentityChallenge.deliveryMethod;
            }
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod2 = stepUpIdentityChallengeMethod;
            if ((i & 8) != 0) {
                str2 = deliverStepUpIdentityChallenge.deliveryTarget;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                z = deliverStepUpIdentityChallenge.canRetry;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                stepUpIdentityChallengeStatus = deliverStepUpIdentityChallenge.stepUpStatus;
            }
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus2 = stepUpIdentityChallengeStatus;
            if ((i & 64) != 0) {
                list = deliverStepUpIdentityChallenge.availableChallenges;
            }
            return deliverStepUpIdentityChallenge.copy(notifyStepUpIdentityChallengeResultStatus, str3, stepUpIdentityChallengeMethod2, str4, z2, stepUpIdentityChallengeStatus2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$AvailableChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "onTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "onEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "onWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "onPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "onAuthenticatorAppIdentityChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "component4", "()Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "component5", "()Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "component6", "()Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$AvailableChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "getOnTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "getOnEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "getOnWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "getOnPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "getOnAuthenticatorAppIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;

        public AvailableChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onTextOneTimePasscodeIdentityChallenge = onTextOneTimePasscodeIdentityChallenge;
            this.onEmailOneTimePasscodeIdentityChallenge = onEmailOneTimePasscodeIdentityChallenge;
            this.onWhatsappOneTimePasscodeIdentityChallenge = onWhatsappOneTimePasscodeIdentityChallenge;
            this.onPhoneOneTimePasscodeIdentityChallenge = onPhoneOneTimePasscodeIdentityChallenge;
            this.onAuthenticatorAppIdentityChallenge = onAuthenticatorAppIdentityChallenge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableChallenge(__typename=");
            sb.append(str);
            sb.append(", onTextOneTimePasscodeIdentityChallenge=");
            sb.append(onTextOneTimePasscodeIdentityChallenge);
            sb.append(", onEmailOneTimePasscodeIdentityChallenge=");
            sb.append(onEmailOneTimePasscodeIdentityChallenge);
            sb.append(", onWhatsappOneTimePasscodeIdentityChallenge=");
            sb.append(onWhatsappOneTimePasscodeIdentityChallenge);
            sb.append(", onPhoneOneTimePasscodeIdentityChallenge=");
            sb.append(onPhoneOneTimePasscodeIdentityChallenge);
            sb.append(", onAuthenticatorAppIdentityChallenge=");
            sb.append(onAuthenticatorAppIdentityChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            int hashCode2 = onTextOneTimePasscodeIdentityChallenge == null ? 0 : onTextOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            int hashCode3 = onEmailOneTimePasscodeIdentityChallenge == null ? 0 : onEmailOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            int hashCode4 = onWhatsappOneTimePasscodeIdentityChallenge == null ? 0 : onWhatsappOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            int hashCode5 = onPhoneOneTimePasscodeIdentityChallenge == null ? 0 : onPhoneOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (onAuthenticatorAppIdentityChallenge != null ? onAuthenticatorAppIdentityChallenge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge availableChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, availableChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTextOneTimePasscodeIdentityChallenge, availableChallenge.onTextOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmailOneTimePasscodeIdentityChallenge, availableChallenge.onEmailOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onWhatsappOneTimePasscodeIdentityChallenge, availableChallenge.onWhatsappOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPhoneOneTimePasscodeIdentityChallenge, availableChallenge.onPhoneOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticatorAppIdentityChallenge, availableChallenge.onAuthenticatorAppIdentityChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge(__typename, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onAuthenticatorAppIdentityChallenge);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge availableChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = availableChallenge.__typename;
            }
            if ((i & 2) != 0) {
                onTextOneTimePasscodeIdentityChallenge = availableChallenge.onTextOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge2 = onTextOneTimePasscodeIdentityChallenge;
            if ((i & 4) != 0) {
                onEmailOneTimePasscodeIdentityChallenge = availableChallenge.onEmailOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge2 = onEmailOneTimePasscodeIdentityChallenge;
            if ((i & 8) != 0) {
                onWhatsappOneTimePasscodeIdentityChallenge = availableChallenge.onWhatsappOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge2 = onWhatsappOneTimePasscodeIdentityChallenge;
            if ((i & 16) != 0) {
                onPhoneOneTimePasscodeIdentityChallenge = availableChallenge.onPhoneOneTimePasscodeIdentityChallenge;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge2 = onPhoneOneTimePasscodeIdentityChallenge;
            if ((i & 32) != 0) {
                onAuthenticatorAppIdentityChallenge = availableChallenge.onAuthenticatorAppIdentityChallenge;
            }
            return availableChallenge.copy(str, onTextOneTimePasscodeIdentityChallenge2, onEmailOneTimePasscodeIdentityChallenge2, onWhatsappOneTimePasscodeIdentityChallenge2, onPhoneOneTimePasscodeIdentityChallenge2, onAuthenticatorAppIdentityChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "textOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "getTextOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTextOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment;

        public OnTextOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textOtpChallengeFragment, "");
            this.__typename = str;
            this.textOtpChallengeFragment = textOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment getTextOtpChallengeFragment() {
            return this.textOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment = this.textOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTextOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", textOtpChallengeFragment=");
            sb.append(textOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.textOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onTextOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.textOtpChallengeFragment, onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge(__typename, textOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment getTextOtpChallengeFragment() {
            return this.textOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTextOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                textOtpChallengeFragment = onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment;
            }
            return onTextOneTimePasscodeIdentityChallenge.copy(str, textOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "emailOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "getEmailOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEmailOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment;

        public OnEmailOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOtpChallengeFragment, "");
            this.__typename = str;
            this.emailOtpChallengeFragment = emailOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment getEmailOtpChallengeFragment() {
            return this.emailOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment = this.emailOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEmailOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", emailOtpChallengeFragment=");
            sb.append(emailOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.emailOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onEmailOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailOtpChallengeFragment, onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge(__typename, emailOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment getEmailOtpChallengeFragment() {
            return this.emailOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmailOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                emailOtpChallengeFragment = onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment;
            }
            return onEmailOneTimePasscodeIdentityChallenge.copy(str, emailOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "whatsappOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "getWhatsappOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnWhatsappOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment;

        public OnWhatsappOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsappOtpChallengeFragment, "");
            this.__typename = str;
            this.whatsappOtpChallengeFragment = whatsappOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment getWhatsappOtpChallengeFragment() {
            return this.whatsappOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment = this.whatsappOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnWhatsappOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", whatsappOtpChallengeFragment=");
            sb.append(whatsappOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.whatsappOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onWhatsappOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.whatsappOtpChallengeFragment, onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsappOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge(__typename, whatsappOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment getWhatsappOtpChallengeFragment() {
            return this.whatsappOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onWhatsappOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                whatsappOtpChallengeFragment = onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment;
            }
            return onWhatsappOneTimePasscodeIdentityChallenge.copy(str, whatsappOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "phoneOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "getPhoneOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPhoneOneTimePasscodeIdentityChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment;

        public OnPhoneOneTimePasscodeIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpChallengeFragment, "");
            this.__typename = str;
            this.phoneOtpChallengeFragment = phoneOtpChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment getPhoneOtpChallengeFragment() {
            return this.phoneOtpChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment = this.phoneOtpChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPhoneOneTimePasscodeIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", phoneOtpChallengeFragment=");
            sb.append(phoneOtpChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.phoneOtpChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onPhoneOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneOtpChallengeFragment, onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge(__typename, phoneOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment getPhoneOtpChallengeFragment() {
            return this.phoneOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPhoneOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                phoneOtpChallengeFragment = onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment;
            }
            return onPhoneOneTimePasscodeIdentityChallenge.copy(str, phoneOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "authenticatorAppChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "getAuthenticatorAppChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthenticatorAppIdentityChallenge {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment;

        public OnAuthenticatorAppIdentityChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAppChallengeFragment, "");
            this.__typename = str;
            this.authenticatorAppChallengeFragment = authenticatorAppChallengeFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment getAuthenticatorAppChallengeFragment() {
            return this.authenticatorAppChallengeFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment = this.authenticatorAppChallengeFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAuthenticatorAppIdentityChallenge(__typename=");
            sb.append(str);
            sb.append(", authenticatorAppChallengeFragment=");
            sb.append(authenticatorAppChallengeFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.authenticatorAppChallengeFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onAuthenticatorAppIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAppChallengeFragment, onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAppChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge(__typename, authenticatorAppChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment getAuthenticatorAppChallengeFragment() {
            return this.authenticatorAppChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAuthenticatorAppIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                authenticatorAppChallengeFragment = onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment;
            }
            return onAuthenticatorAppIdentityChallenge.copy(str, authenticatorAppChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation DeliverStepUpIdentityChallenge($input: NotifyStepUpIdentityChallengeInput!) { deliverStepUpIdentityChallenge(input: $input) { notifyChallengeResultStatus challengeId deliveryMethod deliveryTarget canRetry stepUpStatus availableChallenges { __typename ... on TextOneTimePasscodeIdentityChallenge { __typename ...TextOtpChallengeFragment } ... on EmailOneTimePasscodeIdentityChallenge { __typename ...EmailOtpChallengeFragment } ... on WhatsappOneTimePasscodeIdentityChallenge { __typename ...WhatsappOtpChallengeFragment } ... on PhoneOneTimePasscodeIdentityChallenge { __typename ...PhoneOtpChallengeFragment } ... on AuthenticatorAppIdentityChallenge { __typename ...AuthenticatorAppChallengeFragment } } } }  fragment TextOtpChallengeFragment on TextOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment EmailOtpChallengeFragment on EmailOneTimePasscodeIdentityChallenge { id emailAddresses { challengeId maskedEmail notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment WhatsappOtpChallengeFragment on WhatsappOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment PhoneOtpChallengeFragment on PhoneOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment AuthenticatorAppChallengeFragment on AuthenticatorAppIdentityChallenge { id challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput notifyStepUpIdentityChallengeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeliverStepUpIdentityChallengeMutation(input=");
        sb.append(notifyStepUpIdentityChallengeInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation copy(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation copy$default(com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation deliverStepUpIdentityChallengeMutation, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput notifyStepUpIdentityChallengeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            notifyStepUpIdentityChallengeInput = deliverStepUpIdentityChallengeMutation.input;
        }
        return deliverStepUpIdentityChallengeMutation.copy(notifyStepUpIdentityChallengeInput);
    }
}
