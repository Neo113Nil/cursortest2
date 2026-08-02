package com.paypal.oslo.feature.taxanddocumentcenter.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RequestTaxReportSelfCorrectionInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestTaxReportSelfCorrectionInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RequestTaxReportSelfCorrectionInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestTaxReportSelfCorrectionInput;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RequestTaxReportSelfCorrectionInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RequestTaxReportSelfCorrectionMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data> {
    public static final java.lang.String OPERATION_ID = "dc9dea34291547c051718bb30d28ae7b85de491786b40886788f55e1cf98c37a";
    public static final java.lang.String OPERATION_NAME = "RequestTaxReportSelfCorrection";
    private final com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Companion INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Companion(null);
    public static final int $stable = 8;

    public RequestTaxReportSelfCorrectionMutation(com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput requestTaxReportSelfCorrectionInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTaxReportSelfCorrectionInput, "");
        this.input = requestTaxReportSelfCorrectionInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput getInput() {
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
        com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.RequestTaxReportSelfCorrectionMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.adapter.RequestTaxReportSelfCorrectionMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.taxanddocumentcenter.graphql.selections.RequestTaxReportSelfCorrectionMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$RequestTaxReportSelfCorrection;", "requestTaxReportSelfCorrection", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$RequestTaxReportSelfCorrection;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$RequestTaxReportSelfCorrection;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$RequestTaxReportSelfCorrection;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$RequestTaxReportSelfCorrection;", "getRequestTaxReportSelfCorrection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection;

        public Data(com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTaxReportSelfCorrection, "");
            this.requestTaxReportSelfCorrection = requestTaxReportSelfCorrection;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection getRequestTaxReportSelfCorrection() {
            return this.requestTaxReportSelfCorrection;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection = this.requestTaxReportSelfCorrection;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(requestTaxReportSelfCorrection=");
            sb.append(requestTaxReportSelfCorrection);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requestTaxReportSelfCorrection.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestTaxReportSelfCorrection, ((com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data) other).requestTaxReportSelfCorrection);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data copy(com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTaxReportSelfCorrection, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data(requestTaxReportSelfCorrection);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection getRequestTaxReportSelfCorrection() {
            return this.requestTaxReportSelfCorrection;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data copy$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.Data data, com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestTaxReportSelfCorrection = data.requestTaxReportSelfCorrection;
            }
            return data.copy(requestTaxReportSelfCorrection);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$RequestTaxReportSelfCorrection;", "", "", "success", "deepLink", "<init>", "(ZLjava/lang/Object;)V", "component1", "()Z", "component2", "()Ljava/lang/Object;", "copy", "(ZLjava/lang/Object;)Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$RequestTaxReportSelfCorrection;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Ljava/lang/Object;", "getDeepLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestTaxReportSelfCorrection {
        public static final int $stable = 8;
        private final java.lang.Object deepLink;
        private final boolean success;

        public RequestTaxReportSelfCorrection(boolean z, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.success = z;
            this.deepLink = obj;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.lang.Object obj = this.deepLink;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestTaxReportSelfCorrection(success=");
            sb.append(z);
            sb.append(", deepLink=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.success) * 31) + this.deepLink.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection = (com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection) other;
            return this.success == requestTaxReportSelfCorrection.success && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLink, requestTaxReportSelfCorrection.deepLink);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection copy(boolean success, java.lang.Object deepLink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLink, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection(success, deepLink);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getDeepLink() {
            return this.deepLink;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection copy$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation.RequestTaxReportSelfCorrection requestTaxReportSelfCorrection, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = requestTaxReportSelfCorrection.success;
            }
            if ((i & 2) != 0) {
                obj = requestTaxReportSelfCorrection.deepLink;
            }
            return requestTaxReportSelfCorrection.copy(z, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxReportSelfCorrectionMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RequestTaxReportSelfCorrection($input: RequestTaxReportSelfCorrectionInput!) { requestTaxReportSelfCorrection(input: $input) { success deepLink } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput requestTaxReportSelfCorrectionInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestTaxReportSelfCorrectionMutation(input=");
        sb.append(requestTaxReportSelfCorrectionInput);
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
        return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation) other).input);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation copy(com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation copy$default(com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxReportSelfCorrectionMutation requestTaxReportSelfCorrectionMutation, com.paypal.oslo.api.graphql.schema.type.RequestTaxReportSelfCorrectionInput requestTaxReportSelfCorrectionInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestTaxReportSelfCorrectionInput = requestTaxReportSelfCorrectionMutation.input;
        }
        return requestTaxReportSelfCorrectionMutation.copy(requestTaxReportSelfCorrectionInput);
    }
}
