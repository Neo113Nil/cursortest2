package com.paypal.oslo.feature.onboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RequestOnboardingEmailConfirmationCodeInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestOnboardingEmailConfirmationCodeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RequestOnboardingEmailConfirmationCodeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestOnboardingEmailConfirmationCodeInput;)Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RequestOnboardingEmailConfirmationCodeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RequestOnboardingEmailConfirmationCodeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "40acdb962fc0b0feef7dd62d3d585fac86244fec40c863b5c50b0e78b0b65742";
    public static final java.lang.String OPERATION_NAME = "RequestOnboardingEmailConfirmationCode";
    private final com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Companion(null);
    public static final int $stable = 8;

    public RequestOnboardingEmailConfirmationCodeMutation(com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput requestOnboardingEmailConfirmationCodeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestOnboardingEmailConfirmationCodeInput, "");
        this.input = requestOnboardingEmailConfirmationCodeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput getInput() {
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
        com.paypal.oslo.feature.onboarding.graphql.adapter.RequestOnboardingEmailConfirmationCodeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.onboarding.graphql.adapter.RequestOnboardingEmailConfirmationCodeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.onboarding.graphql.selections.RequestOnboardingEmailConfirmationCodeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;", "requestOnboardingEmailConfirmationCode", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;)Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;", "getRequestOnboardingEmailConfirmationCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode;

        public Data(com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestOnboardingEmailConfirmationCode, "");
            this.requestOnboardingEmailConfirmationCode = requestOnboardingEmailConfirmationCode;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode getRequestOnboardingEmailConfirmationCode() {
            return this.requestOnboardingEmailConfirmationCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode = this.requestOnboardingEmailConfirmationCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(requestOnboardingEmailConfirmationCode=");
            sb.append(requestOnboardingEmailConfirmationCode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requestOnboardingEmailConfirmationCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestOnboardingEmailConfirmationCode, ((com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data) other).requestOnboardingEmailConfirmationCode);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data copy(com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestOnboardingEmailConfirmationCode, "");
            return new com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data(requestOnboardingEmailConfirmationCode);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode getRequestOnboardingEmailConfirmationCode() {
            return this.requestOnboardingEmailConfirmationCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data copy$default(com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.Data data, com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestOnboardingEmailConfirmationCode = data.requestOnboardingEmailConfirmationCode;
            }
            return data.copy(requestOnboardingEmailConfirmationCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "status", "", "success", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$RequestOnboardingEmailConfirmationCode;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "getStatus", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestOnboardingEmailConfirmationCode {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status;
        private final boolean success;

        public RequestOnboardingEmailConfirmationCode(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z) {
            this.status = onboardingConfirmationStatus;
            this.success = z;
        }

        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus = this.status;
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestOnboardingEmailConfirmationCode(status=");
            sb.append(onboardingConfirmationStatus);
            sb.append(", success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus = this.status;
            return ((onboardingConfirmationStatus == null ? 0 : onboardingConfirmationStatus.hashCode()) * 31) + java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode = (com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode) other;
            return this.status == requestOnboardingEmailConfirmationCode.status && this.success == requestOnboardingEmailConfirmationCode.success;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode copy(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status, boolean success) {
            return new com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode(status, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode copy$default(com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation.RequestOnboardingEmailConfirmationCode requestOnboardingEmailConfirmationCode, com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingConfirmationStatus = requestOnboardingEmailConfirmationCode.status;
            }
            if ((i & 2) != 0) {
                z = requestOnboardingEmailConfirmationCode.success;
            }
            return requestOnboardingEmailConfirmationCode.copy(onboardingConfirmationStatus, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/RequestOnboardingEmailConfirmationCodeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RequestOnboardingEmailConfirmationCode($input: RequestOnboardingEmailConfirmationCodeInput!) { requestOnboardingEmailConfirmationCode(input: $input) { status success } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput requestOnboardingEmailConfirmationCodeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestOnboardingEmailConfirmationCodeMutation(input=");
        sb.append(requestOnboardingEmailConfirmationCodeInput);
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
        return (other instanceof com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation) other).input);
    }

    public final com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation copy(com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation copy$default(com.paypal.oslo.feature.onboarding.graphql.RequestOnboardingEmailConfirmationCodeMutation requestOnboardingEmailConfirmationCodeMutation, com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput requestOnboardingEmailConfirmationCodeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestOnboardingEmailConfirmationCodeInput = requestOnboardingEmailConfirmationCodeMutation.input;
        }
        return requestOnboardingEmailConfirmationCodeMutation.copy(requestOnboardingEmailConfirmationCodeInput);
    }
}
