package com.paypal.oslo.feature.onboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\" B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ResendOnboardingEmailConfirmationCodeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Companion(null);
    public static final java.lang.String OPERATION_ID = "78e58361e890d9ce14453b343aac5074787c107627cc6d1e11ceb705c8248a3e";
    public static final java.lang.String OPERATION_NAME = "ResendOnboardingEmailConfirmationCode";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.onboarding.graphql.adapter.ResendOnboardingEmailConfirmationCodeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.onboarding.graphql.selections.ResendOnboardingEmailConfirmationCodeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;", "resendOnboardingEmailConfirmationCode", "<init>", "(Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;", "copy", "(Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;)Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;", "getResendOnboardingEmailConfirmationCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode;

        public Data(com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resendOnboardingEmailConfirmationCode, "");
            this.resendOnboardingEmailConfirmationCode = resendOnboardingEmailConfirmationCode;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode getResendOnboardingEmailConfirmationCode() {
            return this.resendOnboardingEmailConfirmationCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode = this.resendOnboardingEmailConfirmationCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(resendOnboardingEmailConfirmationCode=");
            sb.append(resendOnboardingEmailConfirmationCode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.resendOnboardingEmailConfirmationCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.resendOnboardingEmailConfirmationCode, ((com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data) other).resendOnboardingEmailConfirmationCode);
        }

        public final com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data copy(com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resendOnboardingEmailConfirmationCode, "");
            return new com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data(resendOnboardingEmailConfirmationCode);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode getResendOnboardingEmailConfirmationCode() {
            return this.resendOnboardingEmailConfirmationCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data copy$default(com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.Data data, com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                resendOnboardingEmailConfirmationCode = data.resendOnboardingEmailConfirmationCode;
            }
            return data.copy(resendOnboardingEmailConfirmationCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "status", "", "success", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$ResendOnboardingEmailConfirmationCode;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "getStatus", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResendOnboardingEmailConfirmationCode {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status;
        private final boolean success;

        public ResendOnboardingEmailConfirmationCode(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResendOnboardingEmailConfirmationCode(status=");
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
            if (!(other instanceof com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode = (com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode) other;
            return this.status == resendOnboardingEmailConfirmationCode.status && this.success == resendOnboardingEmailConfirmationCode.success;
        }

        public final com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode copy(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status, boolean success) {
            return new com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode(status, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode copy$default(com.paypal.oslo.feature.onboarding.graphql.ResendOnboardingEmailConfirmationCodeMutation.ResendOnboardingEmailConfirmationCode resendOnboardingEmailConfirmationCode, com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingConfirmationStatus = resendOnboardingEmailConfirmationCode.status;
            }
            if ((i & 2) != 0) {
                z = resendOnboardingEmailConfirmationCode.success;
            }
            return resendOnboardingEmailConfirmationCode.copy(onboardingConfirmationStatus, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/graphql/ResendOnboardingEmailConfirmationCodeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ResendOnboardingEmailConfirmationCode { resendOnboardingEmailConfirmationCode { status success } }";
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
