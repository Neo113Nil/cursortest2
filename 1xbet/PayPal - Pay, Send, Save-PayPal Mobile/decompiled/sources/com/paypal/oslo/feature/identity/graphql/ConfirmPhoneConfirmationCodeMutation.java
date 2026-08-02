package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ConfirmPhoneConfirmationCodeInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ConfirmPhoneConfirmationCodeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ConfirmPhoneConfirmationCodeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ConfirmPhoneConfirmationCodeInput;)Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ConfirmPhoneConfirmationCodeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConfirmPhoneConfirmationCodeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "dd14db0d13c5e908de7b993018f2cf41fd4de81a0a97182919a57737eaeb91e8";
    public static final java.lang.String OPERATION_NAME = "ConfirmPhoneConfirmationCode";
    private final com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Companion(null);
    public static final int $stable = 8;

    public ConfirmPhoneConfirmationCodeMutation(com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput confirmPhoneConfirmationCodeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPhoneConfirmationCodeInput, "");
        this.input = confirmPhoneConfirmationCodeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.ConfirmPhoneConfirmationCodeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ConfirmPhoneConfirmationCodeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.ConfirmPhoneConfirmationCodeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$ConfirmPhoneConfirmationCode;", "confirmPhoneConfirmationCode", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$ConfirmPhoneConfirmationCode;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$ConfirmPhoneConfirmationCode;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$ConfirmPhoneConfirmationCode;)Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$ConfirmPhoneConfirmationCode;", "getConfirmPhoneConfirmationCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode;

        public Data(com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPhoneConfirmationCode, "");
            this.confirmPhoneConfirmationCode = confirmPhoneConfirmationCode;
        }

        public final com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode getConfirmPhoneConfirmationCode() {
            return this.confirmPhoneConfirmationCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode = this.confirmPhoneConfirmationCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(confirmPhoneConfirmationCode=");
            sb.append(confirmPhoneConfirmationCode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.confirmPhoneConfirmationCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPhoneConfirmationCode, ((com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data) other).confirmPhoneConfirmationCode);
        }

        public final com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data copy(com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPhoneConfirmationCode, "");
            return new com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data(confirmPhoneConfirmationCode);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode getConfirmPhoneConfirmationCode() {
            return this.confirmPhoneConfirmationCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.Data data, com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                confirmPhoneConfirmationCode = data.confirmPhoneConfirmationCode;
            }
            return data.copy(confirmPhoneConfirmationCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$ConfirmPhoneConfirmationCode;", "", "", "confirmationCode", "Lcom/paypal/oslo/api/graphql/schema/type/ContactConfirmationStatus;", "confirmationStatus", "message", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ContactConfirmationStatus;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactConfirmationStatus;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ContactConfirmationStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$ConfirmPhoneConfirmationCode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmationCode", "Lcom/paypal/oslo/api/graphql/schema/type/ContactConfirmationStatus;", "getConfirmationStatus", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmPhoneConfirmationCode {
        public static final int $stable = 0;
        private final java.lang.String confirmationCode;
        private final com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus confirmationStatus;
        private final java.lang.String message;

        public ConfirmPhoneConfirmationCode(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus contactConfirmationStatus, java.lang.String str2) {
            this.confirmationCode = str;
            this.confirmationStatus = contactConfirmationStatus;
            this.message = str2;
        }

        public final java.lang.String getConfirmationCode() {
            return this.confirmationCode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus getConfirmationStatus() {
            return this.confirmationStatus;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.confirmationCode;
            com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus contactConfirmationStatus = this.confirmationStatus;
            java.lang.String str2 = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmPhoneConfirmationCode(confirmationCode=");
            sb.append(str);
            sb.append(", confirmationStatus=");
            sb.append(contactConfirmationStatus);
            sb.append(", message=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.confirmationCode;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus contactConfirmationStatus = this.confirmationStatus;
            int hashCode2 = contactConfirmationStatus == null ? 0 : contactConfirmationStatus.hashCode();
            java.lang.String str2 = this.message;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode = (com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationCode, confirmPhoneConfirmationCode.confirmationCode) && this.confirmationStatus == confirmPhoneConfirmationCode.confirmationStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.message, confirmPhoneConfirmationCode.message);
        }

        public final com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode copy(java.lang.String confirmationCode, com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus confirmationStatus, java.lang.String message) {
            return new com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode(confirmationCode, confirmationStatus, message);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus getConfirmationStatus() {
            return this.confirmationStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfirmationCode() {
            return this.confirmationCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode copy$default(com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation.ConfirmPhoneConfirmationCode confirmPhoneConfirmationCode, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ContactConfirmationStatus contactConfirmationStatus, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = confirmPhoneConfirmationCode.confirmationCode;
            }
            if ((i & 2) != 0) {
                contactConfirmationStatus = confirmPhoneConfirmationCode.confirmationStatus;
            }
            if ((i & 4) != 0) {
                str2 = confirmPhoneConfirmationCode.message;
            }
            return confirmPhoneConfirmationCode.copy(str, contactConfirmationStatus, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/ConfirmPhoneConfirmationCodeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ConfirmPhoneConfirmationCode($input: ConfirmPhoneConfirmationCodeInput!) { confirmPhoneConfirmationCode(input: $input) { confirmationCode confirmationStatus message } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput confirmPhoneConfirmationCodeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmPhoneConfirmationCodeMutation(input=");
        sb.append(confirmPhoneConfirmationCodeInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation copy(com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation copy$default(com.paypal.oslo.feature.identity.graphql.ConfirmPhoneConfirmationCodeMutation confirmPhoneConfirmationCodeMutation, com.paypal.oslo.api.graphql.schema.type.ConfirmPhoneConfirmationCodeInput confirmPhoneConfirmationCodeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            confirmPhoneConfirmationCodeInput = confirmPhoneConfirmationCodeMutation.input;
        }
        return confirmPhoneConfirmationCodeMutation.copy(confirmPhoneConfirmationCodeInput);
    }
}
