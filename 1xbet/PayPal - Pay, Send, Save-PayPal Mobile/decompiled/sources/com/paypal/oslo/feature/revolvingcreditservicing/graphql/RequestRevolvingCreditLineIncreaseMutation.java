package com.paypal.oslo.feature.revolvingcreditservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RequestRevolvingCreditLineIncreaseInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestRevolvingCreditLineIncreaseInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RequestRevolvingCreditLineIncreaseInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestRevolvingCreditLineIncreaseInput;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RequestRevolvingCreditLineIncreaseInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OPERATION_NAME, "OnRequestRevolvingCreditLineIncreaseDeclined", "OnRequestRevolvingCreditLineIncreaseApproved", "ApprovedCreditLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RequestRevolvingCreditLineIncreaseMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data> {
    public static final java.lang.String OPERATION_ID = "43136be2fd14293e2421de40eb06c05b65254b6a5455f32d107ea5dafb9b6256";
    public static final java.lang.String OPERATION_NAME = "RequestRevolvingCreditLineIncrease";
    private final com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Companion(null);
    public static final int $stable = 8;

    public RequestRevolvingCreditLineIncreaseMutation(com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput requestRevolvingCreditLineIncreaseInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestRevolvingCreditLineIncreaseInput, "");
        this.input = requestRevolvingCreditLineIncreaseInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput getInput() {
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.RequestRevolvingCreditLineIncreaseMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.RequestRevolvingCreditLineIncreaseMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.RequestRevolvingCreditLineIncreaseMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$RequestRevolvingCreditLineIncrease;", "requestRevolvingCreditLineIncrease", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$RequestRevolvingCreditLineIncrease;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$RequestRevolvingCreditLineIncrease;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$RequestRevolvingCreditLineIncrease;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$RequestRevolvingCreditLineIncrease;", "getRequestRevolvingCreditLineIncrease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease;

        public Data(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease) {
            this.requestRevolvingCreditLineIncrease = requestRevolvingCreditLineIncrease;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease getRequestRevolvingCreditLineIncrease() {
            return this.requestRevolvingCreditLineIncrease;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease = this.requestRevolvingCreditLineIncrease;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(requestRevolvingCreditLineIncrease=");
            sb.append(requestRevolvingCreditLineIncrease);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease = this.requestRevolvingCreditLineIncrease;
            if (requestRevolvingCreditLineIncrease == null) {
                return 0;
            }
            return requestRevolvingCreditLineIncrease.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestRevolvingCreditLineIncrease, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data) other).requestRevolvingCreditLineIncrease);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data(requestRevolvingCreditLineIncrease);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease getRequestRevolvingCreditLineIncrease() {
            return this.requestRevolvingCreditLineIncrease;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.Data data, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestRevolvingCreditLineIncrease = data.requestRevolvingCreditLineIncrease;
            }
            return data.copy(requestRevolvingCreditLineIncrease);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$RequestRevolvingCreditLineIncrease;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseDeclined;", "onRequestRevolvingCreditLineIncreaseDeclined", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseApproved;", "onRequestRevolvingCreditLineIncreaseApproved", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseDeclined;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseApproved;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseDeclined;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseApproved;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseDeclined;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseApproved;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$RequestRevolvingCreditLineIncrease;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseDeclined;", "getOnRequestRevolvingCreditLineIncreaseDeclined", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseApproved;", "getOnRequestRevolvingCreditLineIncreaseApproved"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestRevolvingCreditLineIncrease {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined;

        public RequestRevolvingCreditLineIncrease(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRequestRevolvingCreditLineIncreaseDeclined = onRequestRevolvingCreditLineIncreaseDeclined;
            this.onRequestRevolvingCreditLineIncreaseApproved = onRequestRevolvingCreditLineIncreaseApproved;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined getOnRequestRevolvingCreditLineIncreaseDeclined() {
            return this.onRequestRevolvingCreditLineIncreaseDeclined;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved getOnRequestRevolvingCreditLineIncreaseApproved() {
            return this.onRequestRevolvingCreditLineIncreaseApproved;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined = this.onRequestRevolvingCreditLineIncreaseDeclined;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved = this.onRequestRevolvingCreditLineIncreaseApproved;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRevolvingCreditLineIncrease(__typename=");
            sb.append(str);
            sb.append(", onRequestRevolvingCreditLineIncreaseDeclined=");
            sb.append(onRequestRevolvingCreditLineIncreaseDeclined);
            sb.append(", onRequestRevolvingCreditLineIncreaseApproved=");
            sb.append(onRequestRevolvingCreditLineIncreaseApproved);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined = this.onRequestRevolvingCreditLineIncreaseDeclined;
            int hashCode2 = onRequestRevolvingCreditLineIncreaseDeclined == null ? 0 : onRequestRevolvingCreditLineIncreaseDeclined.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved = this.onRequestRevolvingCreditLineIncreaseApproved;
            return (((hashCode * 31) + hashCode2) * 31) + (onRequestRevolvingCreditLineIncreaseApproved != null ? onRequestRevolvingCreditLineIncreaseApproved.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, requestRevolvingCreditLineIncrease.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRequestRevolvingCreditLineIncreaseDeclined, requestRevolvingCreditLineIncrease.onRequestRevolvingCreditLineIncreaseDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRequestRevolvingCreditLineIncreaseApproved, requestRevolvingCreditLineIncrease.onRequestRevolvingCreditLineIncreaseApproved);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease(__typename, onRequestRevolvingCreditLineIncreaseDeclined, onRequestRevolvingCreditLineIncreaseApproved);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved getOnRequestRevolvingCreditLineIncreaseApproved() {
            return this.onRequestRevolvingCreditLineIncreaseApproved;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined getOnRequestRevolvingCreditLineIncreaseDeclined() {
            return this.onRequestRevolvingCreditLineIncreaseDeclined;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.RequestRevolvingCreditLineIncrease requestRevolvingCreditLineIncrease, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requestRevolvingCreditLineIncrease.__typename;
            }
            if ((i & 2) != 0) {
                onRequestRevolvingCreditLineIncreaseDeclined = requestRevolvingCreditLineIncrease.onRequestRevolvingCreditLineIncreaseDeclined;
            }
            if ((i & 4) != 0) {
                onRequestRevolvingCreditLineIncreaseApproved = requestRevolvingCreditLineIncrease.onRequestRevolvingCreditLineIncreaseApproved;
            }
            return requestRevolvingCreditLineIncrease.copy(str, onRequestRevolvingCreditLineIncreaseDeclined, onRequestRevolvingCreditLineIncreaseApproved);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseDeclined;", "", "creditAccountId", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseDeclined;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRequestRevolvingCreditLineIncreaseDeclined {
        public static final int $stable = 8;
        private final java.lang.Object creditAccountId;

        public OnRequestRevolvingCreditLineIncreaseDeclined(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.creditAccountId = obj;
        }

        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRequestRevolvingCreditLineIncreaseDeclined(creditAccountId=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined copy(java.lang.Object creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseDeclined onRequestRevolvingCreditLineIncreaseDeclined, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onRequestRevolvingCreditLineIncreaseDeclined.creditAccountId;
            }
            return onRequestRevolvingCreditLineIncreaseDeclined.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseApproved;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$ApprovedCreditLimit;", "approvedCreditLimit", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseStatus;", "status", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$ApprovedCreditLimit;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseStatus;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$ApprovedCreditLimit;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseStatus;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$ApprovedCreditLimit;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$OnRequestRevolvingCreditLineIncreaseApproved;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$ApprovedCreditLimit;", "getApprovedCreditLimit", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRequestRevolvingCreditLineIncreaseApproved {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit approvedCreditLimit;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus status;

        public OnRequestRevolvingCreditLineIncreaseApproved(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit approvedCreditLimit, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus revolvingCreditLineIncreaseStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvedCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditLineIncreaseStatus, "");
            this.approvedCreditLimit = approvedCreditLimit;
            this.status = revolvingCreditLineIncreaseStatus;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit getApprovedCreditLimit() {
            return this.approvedCreditLimit;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit approvedCreditLimit = this.approvedCreditLimit;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus revolvingCreditLineIncreaseStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRequestRevolvingCreditLineIncreaseApproved(approvedCreditLimit=");
            sb.append(approvedCreditLimit);
            sb.append(", status=");
            sb.append(revolvingCreditLineIncreaseStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.approvedCreditLimit.hashCode() * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.approvedCreditLimit, onRequestRevolvingCreditLineIncreaseApproved.approvedCreditLimit) && this.status == onRequestRevolvingCreditLineIncreaseApproved.status;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit approvedCreditLimit, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvedCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved(approvedCreditLimit, status);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit getApprovedCreditLimit() {
            return this.approvedCreditLimit;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.OnRequestRevolvingCreditLineIncreaseApproved onRequestRevolvingCreditLineIncreaseApproved, com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit approvedCreditLimit, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseStatus revolvingCreditLineIncreaseStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                approvedCreditLimit = onRequestRevolvingCreditLineIncreaseApproved.approvedCreditLimit;
            }
            if ((i & 2) != 0) {
                revolvingCreditLineIncreaseStatus = onRequestRevolvingCreditLineIncreaseApproved.status;
            }
            return onRequestRevolvingCreditLineIncreaseApproved.copy(approvedCreditLimit, revolvingCreditLineIncreaseStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$ApprovedCreditLimit;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$ApprovedCreditLimit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApprovedCreditLimit {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ApprovedCreditLimit(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApprovedCreditLimit(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit approvedCreditLimit = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, approvedCreditLimit.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, approvedCreditLimit.value);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation.ApprovedCreditLimit approvedCreditLimit, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = approvedCreditLimit.currencyCode;
            }
            if ((i & 2) != 0) {
                str = approvedCreditLimit.value;
            }
            return approvedCreditLimit.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/RequestRevolvingCreditLineIncreaseMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RequestRevolvingCreditLineIncrease($input: RequestRevolvingCreditLineIncreaseInput!) { requestRevolvingCreditLineIncrease(input: $input) { __typename ... on RequestRevolvingCreditLineIncreaseDeclined { creditAccountId } ... on RequestRevolvingCreditLineIncreaseApproved { approvedCreditLimit { currencyCode value } status } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput requestRevolvingCreditLineIncreaseInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestRevolvingCreditLineIncreaseMutation(input=");
        sb.append(requestRevolvingCreditLineIncreaseInput);
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
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation) other).input);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation copy(com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.RequestRevolvingCreditLineIncreaseMutation requestRevolvingCreditLineIncreaseMutation, com.paypal.oslo.api.graphql.schema.type.RequestRevolvingCreditLineIncreaseInput requestRevolvingCreditLineIncreaseInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestRevolvingCreditLineIncreaseInput = requestRevolvingCreditLineIncreaseMutation.input;
        }
        return requestRevolvingCreditLineIncreaseMutation.copy(requestRevolvingCreditLineIncreaseInput);
    }
}
