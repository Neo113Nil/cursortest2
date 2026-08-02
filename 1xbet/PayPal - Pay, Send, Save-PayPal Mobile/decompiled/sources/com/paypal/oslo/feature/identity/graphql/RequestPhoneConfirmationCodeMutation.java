package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RequestPhoneConfirmationCodeInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestPhoneConfirmationCodeInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RequestPhoneConfirmationCodeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestPhoneConfirmationCodeInput;)Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RequestPhoneConfirmationCodeInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RequestPhoneConfirmationCodeMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data> {
    public static final java.lang.String OPERATION_ID = "5df50869a242ea6dd762d464b8981348ecb627001c4c65b31a66053cdddde21d";
    public static final java.lang.String OPERATION_NAME = "RequestPhoneConfirmationCode";
    private final com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Companion(null);
    public static final int $stable = 8;

    public RequestPhoneConfirmationCodeMutation(com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput requestPhoneConfirmationCodeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhoneConfirmationCodeInput, "");
        this.input = requestPhoneConfirmationCodeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.RequestPhoneConfirmationCodeMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.RequestPhoneConfirmationCodeMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.RequestPhoneConfirmationCodeMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$RequestPhoneConfirmationCode;", "requestPhoneConfirmationCode", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$RequestPhoneConfirmationCode;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$RequestPhoneConfirmationCode;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$RequestPhoneConfirmationCode;)Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$RequestPhoneConfirmationCode;", "getRequestPhoneConfirmationCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode;

        public Data(com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhoneConfirmationCode, "");
            this.requestPhoneConfirmationCode = requestPhoneConfirmationCode;
        }

        public final com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode getRequestPhoneConfirmationCode() {
            return this.requestPhoneConfirmationCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode = this.requestPhoneConfirmationCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(requestPhoneConfirmationCode=");
            sb.append(requestPhoneConfirmationCode);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requestPhoneConfirmationCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestPhoneConfirmationCode, ((com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data) other).requestPhoneConfirmationCode);
        }

        public final com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data copy(com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhoneConfirmationCode, "");
            return new com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data(requestPhoneConfirmationCode);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode getRequestPhoneConfirmationCode() {
            return this.requestPhoneConfirmationCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.Data data, com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestPhoneConfirmationCode = data.requestPhoneConfirmationCode;
            }
            return data.copy(requestPhoneConfirmationCode);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ4\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$RequestPhoneConfirmationCode;", "", "", "maskedPhoneNumber", "countryCode", "message", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$RequestPhoneConfirmationCode;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMaskedPhoneNumber", "Ljava/lang/Object;", "getCountryCode", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestPhoneConfirmationCode {
        public static final int $stable = 8;
        private final java.lang.Object countryCode;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String message;

        public RequestPhoneConfirmationCode(java.lang.String str, java.lang.Object obj, java.lang.String str2) {
            this.maskedPhoneNumber = str;
            this.countryCode = obj;
            this.message = str2;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.maskedPhoneNumber;
            java.lang.Object obj = this.countryCode;
            java.lang.String str2 = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestPhoneConfirmationCode(maskedPhoneNumber=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(", message=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.maskedPhoneNumber;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.countryCode;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.lang.String str2 = this.message;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode = (com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, requestPhoneConfirmationCode.maskedPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, requestPhoneConfirmationCode.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, requestPhoneConfirmationCode.message);
        }

        public final com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode copy(java.lang.String maskedPhoneNumber, java.lang.Object countryCode, java.lang.String message) {
            return new com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode(maskedPhoneNumber, countryCode, message);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode copy$default(com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation.RequestPhoneConfirmationCode requestPhoneConfirmationCode, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = requestPhoneConfirmationCode.maskedPhoneNumber;
            }
            if ((i & 2) != 0) {
                obj = requestPhoneConfirmationCode.countryCode;
            }
            if ((i & 4) != 0) {
                str2 = requestPhoneConfirmationCode.message;
            }
            return requestPhoneConfirmationCode.copy(str, obj, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RequestPhoneConfirmationCodeMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RequestPhoneConfirmationCode($input: RequestPhoneConfirmationCodeInput!) { requestPhoneConfirmationCode(input: $input) { maskedPhoneNumber countryCode message } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput requestPhoneConfirmationCodeInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestPhoneConfirmationCodeMutation(input=");
        sb.append(requestPhoneConfirmationCodeInput);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation copy(com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation copy$default(com.paypal.oslo.feature.identity.graphql.RequestPhoneConfirmationCodeMutation requestPhoneConfirmationCodeMutation, com.paypal.oslo.api.graphql.schema.type.RequestPhoneConfirmationCodeInput requestPhoneConfirmationCodeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestPhoneConfirmationCodeInput = requestPhoneConfirmationCodeMutation.input;
        }
        return requestPhoneConfirmationCodeMutation.copy(requestPhoneConfirmationCodeInput);
    }
}
