package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b*+,-./0123)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeInput;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OPERATION_NAME, "AvailableChallenge", "OnTextOneTimePasscodeIdentityChallenge", "OnEmailOneTimePasscodeIdentityChallenge", "OnWhatsappOneTimePasscodeIdentityChallenge", "OnPhoneOneTimePasscodeIdentityChallenge", "OnAuthenticatorAppIdentityChallenge", "OnSkipChangePasswordAndLoginIdentityChallenge", "OnChangePasswordIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ValidateStepUpIdentityChallengeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "257e69bacb0f9f7410ccb939f654cbf563d5206006415cd0d046d705fee496c4";
    public static final java.lang.String OPERATION_NAME = "ValidateStepUpIdentityChallenge";
    private final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Companion(null);
    public static final int $stable = 8;

    public ValidateStepUpIdentityChallengeMutation(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput validateStepUpIdentityChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateStepUpIdentityChallengeInput, "");
        this.input = validateStepUpIdentityChallengeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.ValidateStepUpIdentityChallengeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;", "validateStepUpIdentityChallenge", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;", "getValidateStepUpIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge;

        public Data(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateStepUpIdentityChallenge, "");
            this.validateStepUpIdentityChallenge = validateStepUpIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge getValidateStepUpIdentityChallenge() {
            return this.validateStepUpIdentityChallenge;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge = this.validateStepUpIdentityChallenge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(validateStepUpIdentityChallenge=");
            sb.append(validateStepUpIdentityChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.validateStepUpIdentityChallenge.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.validateStepUpIdentityChallenge, ((com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data) other).validateStepUpIdentityChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data copy(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateStepUpIdentityChallenge, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data(validateStepUpIdentityChallenge);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge getValidateStepUpIdentityChallenge() {
            return this.validateStepUpIdentityChallenge;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data data, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateStepUpIdentityChallenge = data.validateStepUpIdentityChallenge;
            }
            return data.copy(validateStepUpIdentityChallenge);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "validationChallengeResultStatus", "", "canRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "stepUpStatus", "", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$AvailableChallenge;", "availableChallenges", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;ZLcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "getValidationChallengeResultStatus", "Z", "getCanRetry", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeStatus;", "getStepUpStatus", "Ljava/util/List;", "getAvailableChallenges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidateStepUpIdentityChallenge {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> availableChallenges;
        private final boolean canRetry;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus;
        private final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus;

        public ValidateStepUpIdentityChallenge(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeStatus, "");
            this.validationChallengeResultStatus = validateStepUpIdentityChallengeResultStatus;
            this.canRetry = z;
            this.stepUpStatus = stepUpIdentityChallengeStatus;
            this.availableChallenges = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus getValidationChallengeResultStatus() {
            return this.validationChallengeResultStatus;
        }

        public final boolean getCanRetry() {
            return this.canRetry;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> getAvailableChallenges() {
            return this.availableChallenges;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus = this.validationChallengeResultStatus;
            boolean z = this.canRetry;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus = this.stepUpStatus;
            java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> list = this.availableChallenges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateStepUpIdentityChallenge(validationChallengeResultStatus=");
            sb.append(validateStepUpIdentityChallengeResultStatus);
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
            com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus = this.validationChallengeResultStatus;
            int hashCode = validateStepUpIdentityChallengeResultStatus == null ? 0 : validateStepUpIdentityChallengeResultStatus.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.canRetry);
            int hashCode3 = this.stepUpStatus.hashCode();
            java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> list = this.availableChallenges;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge) other;
            return this.validationChallengeResultStatus == validateStepUpIdentityChallenge.validationChallengeResultStatus && this.canRetry == validateStepUpIdentityChallenge.canRetry && this.stepUpStatus == validateStepUpIdentityChallenge.stepUpStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.availableChallenges, validateStepUpIdentityChallenge.availableChallenges);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge copy(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus, boolean canRetry, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpStatus, java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> availableChallenges) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpStatus, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge(validationChallengeResultStatus, canRetry, stepUpStatus, availableChallenges);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> component4() {
            return this.availableChallenges;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus getStepUpStatus() {
            return this.stepUpStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCanRetry() {
            return this.canRetry;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus getValidationChallengeResultStatus() {
            return this.validationChallengeResultStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus, boolean z, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateStepUpIdentityChallengeResultStatus = validateStepUpIdentityChallenge.validationChallengeResultStatus;
            }
            if ((i & 2) != 0) {
                z = validateStepUpIdentityChallenge.canRetry;
            }
            if ((i & 4) != 0) {
                stepUpIdentityChallengeStatus = validateStepUpIdentityChallenge.stepUpStatus;
            }
            if ((i & 8) != 0) {
                list = validateStepUpIdentityChallenge.availableChallenges;
            }
            return validateStepUpIdentityChallenge.copy(validateStepUpIdentityChallengeResultStatus, z, stepUpIdentityChallengeStatus, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jn\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$AvailableChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "onTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "onEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "onWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "onPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "onAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "onSkipChangePasswordAndLoginIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "onChangePasswordIdentityChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "component3", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "component4", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "component5", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "component6", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "component7", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "component8", "()Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$AvailableChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "getOnTextOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "getOnEmailOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "getOnWhatsappOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "getOnPhoneOneTimePasscodeIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "getOnAuthenticatorAppIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "getOnSkipChangePasswordAndLoginIdentityChallenge", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "getOnChangePasswordIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableChallenge {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
        private final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;

        public AvailableChallenge(java.lang.String str, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onTextOneTimePasscodeIdentityChallenge = onTextOneTimePasscodeIdentityChallenge;
            this.onEmailOneTimePasscodeIdentityChallenge = onEmailOneTimePasscodeIdentityChallenge;
            this.onWhatsappOneTimePasscodeIdentityChallenge = onWhatsappOneTimePasscodeIdentityChallenge;
            this.onPhoneOneTimePasscodeIdentityChallenge = onPhoneOneTimePasscodeIdentityChallenge;
            this.onAuthenticatorAppIdentityChallenge = onAuthenticatorAppIdentityChallenge;
            this.onSkipChangePasswordAndLoginIdentityChallenge = onSkipChangePasswordAndLoginIdentityChallenge;
            this.onChangePasswordIdentityChallenge = onChangePasswordIdentityChallenge;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge getOnSkipChangePasswordAndLoginIdentityChallenge() {
            return this.onSkipChangePasswordAndLoginIdentityChallenge;
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge getOnChangePasswordIdentityChallenge() {
            return this.onChangePasswordIdentityChallenge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge = this.onSkipChangePasswordAndLoginIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge = this.onChangePasswordIdentityChallenge;
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
            sb.append(", onSkipChangePasswordAndLoginIdentityChallenge=");
            sb.append(onSkipChangePasswordAndLoginIdentityChallenge);
            sb.append(", onChangePasswordIdentityChallenge=");
            sb.append(onChangePasswordIdentityChallenge);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = this.onTextOneTimePasscodeIdentityChallenge;
            int hashCode2 = onTextOneTimePasscodeIdentityChallenge == null ? 0 : onTextOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = this.onEmailOneTimePasscodeIdentityChallenge;
            int hashCode3 = onEmailOneTimePasscodeIdentityChallenge == null ? 0 : onEmailOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = this.onWhatsappOneTimePasscodeIdentityChallenge;
            int hashCode4 = onWhatsappOneTimePasscodeIdentityChallenge == null ? 0 : onWhatsappOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = this.onPhoneOneTimePasscodeIdentityChallenge;
            int hashCode5 = onPhoneOneTimePasscodeIdentityChallenge == null ? 0 : onPhoneOneTimePasscodeIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = this.onAuthenticatorAppIdentityChallenge;
            int hashCode6 = onAuthenticatorAppIdentityChallenge == null ? 0 : onAuthenticatorAppIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge = this.onSkipChangePasswordAndLoginIdentityChallenge;
            int hashCode7 = onSkipChangePasswordAndLoginIdentityChallenge == null ? 0 : onSkipChangePasswordAndLoginIdentityChallenge.hashCode();
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge = this.onChangePasswordIdentityChallenge;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (onChangePasswordIdentityChallenge != null ? onChangePasswordIdentityChallenge.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge availableChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, availableChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onTextOneTimePasscodeIdentityChallenge, availableChallenge.onTextOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmailOneTimePasscodeIdentityChallenge, availableChallenge.onEmailOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onWhatsappOneTimePasscodeIdentityChallenge, availableChallenge.onWhatsappOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPhoneOneTimePasscodeIdentityChallenge, availableChallenge.onPhoneOneTimePasscodeIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAuthenticatorAppIdentityChallenge, availableChallenge.onAuthenticatorAppIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSkipChangePasswordAndLoginIdentityChallenge, availableChallenge.onSkipChangePasswordAndLoginIdentityChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.onChangePasswordIdentityChallenge, availableChallenge.onChangePasswordIdentityChallenge);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge(__typename, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onAuthenticatorAppIdentityChallenge, onSkipChangePasswordAndLoginIdentityChallenge, onChangePasswordIdentityChallenge);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge getOnChangePasswordIdentityChallenge() {
            return this.onChangePasswordIdentityChallenge;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge getOnSkipChangePasswordAndLoginIdentityChallenge() {
            return this.onSkipChangePasswordAndLoginIdentityChallenge;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge getOnAuthenticatorAppIdentityChallenge() {
            return this.onAuthenticatorAppIdentityChallenge;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge getOnPhoneOneTimePasscodeIdentityChallenge() {
            return this.onPhoneOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge getOnWhatsappOneTimePasscodeIdentityChallenge() {
            return this.onWhatsappOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge getOnEmailOneTimePasscodeIdentityChallenge() {
            return this.onEmailOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge getOnTextOneTimePasscodeIdentityChallenge() {
            return this.onTextOneTimePasscodeIdentityChallenge;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "textOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/TextOtpChallengeFragment;", "getTextOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onTextOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.textOtpChallengeFragment, onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge(__typename, textOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment getTextOtpChallengeFragment() {
            return this.textOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTextOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                textOtpChallengeFragment = onTextOneTimePasscodeIdentityChallenge.textOtpChallengeFragment;
            }
            return onTextOneTimePasscodeIdentityChallenge.copy(str, textOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "emailOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/EmailOtpChallengeFragment;", "getEmailOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onEmailOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailOtpChallengeFragment, onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge(__typename, emailOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment getEmailOtpChallengeFragment() {
            return this.emailOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmailOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                emailOtpChallengeFragment = onEmailOneTimePasscodeIdentityChallenge.emailOtpChallengeFragment;
            }
            return onEmailOneTimePasscodeIdentityChallenge.copy(str, emailOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "whatsappOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/WhatsappOtpChallengeFragment;", "getWhatsappOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onWhatsappOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.whatsappOtpChallengeFragment, onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsappOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge(__typename, whatsappOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment getWhatsappOtpChallengeFragment() {
            return this.whatsappOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onWhatsappOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                whatsappOtpChallengeFragment = onWhatsappOneTimePasscodeIdentityChallenge.whatsappOtpChallengeFragment;
            }
            return onWhatsappOneTimePasscodeIdentityChallenge.copy(str, whatsappOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "phoneOtpChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/PhoneOtpChallengeFragment;", "getPhoneOtpChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onPhoneOneTimePasscodeIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneOtpChallengeFragment, onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOtpChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge(__typename, phoneOtpChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment getPhoneOtpChallengeFragment() {
            return this.phoneOtpChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPhoneOneTimePasscodeIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                phoneOtpChallengeFragment = onPhoneOneTimePasscodeIdentityChallenge.phoneOtpChallengeFragment;
            }
            return onPhoneOneTimePasscodeIdentityChallenge.copy(str, phoneOtpChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "", "", "__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "authenticatorAppChallengeFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "getAuthenticatorAppChallengeFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onAuthenticatorAppIdentityChallenge.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAppChallengeFragment, onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge copy(java.lang.String __typename, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAppChallengeFragment, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge(__typename, authenticatorAppChallengeFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment getAuthenticatorAppChallengeFragment() {
            return this.authenticatorAppChallengeFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge, java.lang.String str, com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAuthenticatorAppIdentityChallenge.__typename;
            }
            if ((i & 2) != 0) {
                authenticatorAppChallengeFragment = onAuthenticatorAppIdentityChallenge.authenticatorAppChallengeFragment;
            }
            return onAuthenticatorAppIdentityChallenge.copy(str, authenticatorAppChallengeFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "challengeMethod", "validationToken", "nonce", "partialToken", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getChallengeMethod", "getValidationToken", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSkipChangePasswordAndLoginIdentityChallenge {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;
        private final java.lang.String validationToken;

        public OnSkipChangePasswordAndLoginIdentityChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.challengeMethod = stepUpIdentityChallengeMethod;
            this.validationToken = str2;
            this.nonce = str3;
            this.partialToken = str4;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
            return this.challengeMethod;
        }

        public final java.lang.String getValidationToken() {
            return this.validationToken;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.challengeMethod;
            java.lang.String str2 = this.validationToken;
            java.lang.String str3 = this.nonce;
            java.lang.String str4 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSkipChangePasswordAndLoginIdentityChallenge(id=");
            sb.append(str);
            sb.append(", challengeMethod=");
            sb.append(stepUpIdentityChallengeMethod);
            sb.append(", validationToken=");
            sb.append(str2);
            sb.append(", nonce=");
            sb.append(str3);
            sb.append(", partialToken=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.challengeMethod.hashCode();
            int hashCode3 = this.validationToken.hashCode();
            java.lang.String str = this.nonce;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onSkipChangePasswordAndLoginIdentityChallenge.id) && this.challengeMethod == onSkipChangePasswordAndLoginIdentityChallenge.challengeMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.validationToken, onSkipChangePasswordAndLoginIdentityChallenge.validationToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onSkipChangePasswordAndLoginIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onSkipChangePasswordAndLoginIdentityChallenge.partialToken);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod, java.lang.String validationToken, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationToken, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge(id, challengeMethod, validationToken, nonce, partialToken);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getValidationToken() {
            return this.validationToken;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
            return this.challengeMethod;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSkipChangePasswordAndLoginIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                stepUpIdentityChallengeMethod = onSkipChangePasswordAndLoginIdentityChallenge.challengeMethod;
            }
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod2 = stepUpIdentityChallengeMethod;
            if ((i & 4) != 0) {
                str2 = onSkipChangePasswordAndLoginIdentityChallenge.validationToken;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = onSkipChangePasswordAndLoginIdentityChallenge.nonce;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                str4 = onSkipChangePasswordAndLoginIdentityChallenge.partialToken;
            }
            return onSkipChangePasswordAndLoginIdentityChallenge.copy(str, stepUpIdentityChallengeMethod2, str5, str6, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "challengeMethod", "nonce", "partialToken", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/StepUpIdentityChallengeMethod;", "getChallengeMethod", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChangePasswordIdentityChallenge {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod;
        private final java.lang.String id;
        private final java.lang.String nonce;
        private final java.lang.String partialToken;

        public OnChangePasswordIdentityChallenge(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepUpIdentityChallengeMethod, "");
            this.id = str;
            this.challengeMethod = stepUpIdentityChallengeMethod;
            this.nonce = str2;
            this.partialToken = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
            return this.challengeMethod;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = this.challengeMethod;
            java.lang.String str2 = this.nonce;
            java.lang.String str3 = this.partialToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnChangePasswordIdentityChallenge(id=");
            sb.append(str);
            sb.append(", challengeMethod=");
            sb.append(stepUpIdentityChallengeMethod);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(", partialToken=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.challengeMethod.hashCode();
            java.lang.String str = this.nonce;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.partialToken;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onChangePasswordIdentityChallenge.id) && this.challengeMethod == onChangePasswordIdentityChallenge.challengeMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, onChangePasswordIdentityChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, onChangePasswordIdentityChallenge.partialToken);
        }

        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod challengeMethod, java.lang.String nonce, java.lang.String partialToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeMethod, "");
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge(id, challengeMethod, nonce, partialToken);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPartialToken() {
            return this.partialToken;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod getChallengeMethod() {
            return this.challengeMethod;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onChangePasswordIdentityChallenge.id;
            }
            if ((i & 2) != 0) {
                stepUpIdentityChallengeMethod = onChangePasswordIdentityChallenge.challengeMethod;
            }
            if ((i & 4) != 0) {
                str2 = onChangePasswordIdentityChallenge.nonce;
            }
            if ((i & 8) != 0) {
                str3 = onChangePasswordIdentityChallenge.partialToken;
            }
            return onChangePasswordIdentityChallenge.copy(str, stepUpIdentityChallengeMethod, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ValidateStepUpIdentityChallenge($input: ValidateStepUpIdentityChallengeInput!) { validateStepUpIdentityChallenge(input: $input) { validationChallengeResultStatus canRetry stepUpStatus availableChallenges { __typename ... on TextOneTimePasscodeIdentityChallenge { __typename ...TextOtpChallengeFragment } ... on EmailOneTimePasscodeIdentityChallenge { __typename ...EmailOtpChallengeFragment } ... on WhatsappOneTimePasscodeIdentityChallenge { __typename ...WhatsappOtpChallengeFragment } ... on PhoneOneTimePasscodeIdentityChallenge { __typename ...PhoneOtpChallengeFragment } ... on AuthenticatorAppIdentityChallenge { __typename ...AuthenticatorAppChallengeFragment } ... on SkipChangePasswordAndLoginIdentityChallenge { id challengeMethod validationToken nonce partialToken } ... on ChangePasswordIdentityChallenge { id challengeMethod nonce partialToken } } } }  fragment TextOtpChallengeFragment on TextOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment EmailOtpChallengeFragment on EmailOneTimePasscodeIdentityChallenge { id emailAddresses { challengeId maskedEmail notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment WhatsappOtpChallengeFragment on WhatsappOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment PhoneOtpChallengeFragment on PhoneOneTimePasscodeIdentityChallenge { id phoneNumbers { challengeId maskedNumber notified } challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }  fragment AuthenticatorAppChallengeFragment on AuthenticatorAppIdentityChallenge { id challengeMethod stepUpNonce: nonce stepUpPartialToken: partialToken }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput validateStepUpIdentityChallengeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateStepUpIdentityChallengeMutation(input=");
        sb.append(validateStepUpIdentityChallengeInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation copy(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation copy$default(com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation validateStepUpIdentityChallengeMutation, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput validateStepUpIdentityChallengeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            validateStepUpIdentityChallengeInput = validateStepUpIdentityChallengeMutation.input;
        }
        return validateStepUpIdentityChallengeMutation.copy(validateStepUpIdentityChallengeInput);
    }
}
