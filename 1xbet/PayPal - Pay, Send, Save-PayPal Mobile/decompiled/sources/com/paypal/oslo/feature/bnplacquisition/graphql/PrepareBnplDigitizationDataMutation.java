package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PrepareBNPLDigitizationDataInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OPERATION_NAME, "OnPrepareBNPLDigitizationDataSuccess", "IssuerDigitizationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PrepareBnplDigitizationDataMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data> {
    public static final java.lang.String OPERATION_ID = "cbf6e4609f2bbba6935e610e80cd62a31439867775d3376c88664e0c644d7a90";
    public static final java.lang.String OPERATION_NAME = "PrepareBnplDigitizationData";
    private final com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Companion(null);
    public static final int $stable = 8;

    public PrepareBnplDigitizationDataMutation(com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput prepareBNPLDigitizationDataInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prepareBNPLDigitizationDataInput, "");
        this.input = prepareBNPLDigitizationDataInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput getInput() {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.PrepareBnplDigitizationDataMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.PrepareBnplDigitizationDataMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.PrepareBnplDigitizationDataMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$PrepareBnplDigitizationData;", "prepareBnplDigitizationData", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$PrepareBnplDigitizationData;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$PrepareBnplDigitizationData;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$PrepareBnplDigitizationData;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$PrepareBnplDigitizationData;", "getPrepareBnplDigitizationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData) {
            this.prepareBnplDigitizationData = prepareBnplDigitizationData;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData getPrepareBnplDigitizationData() {
            return this.prepareBnplDigitizationData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData = this.prepareBnplDigitizationData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(prepareBnplDigitizationData=");
            sb.append(prepareBnplDigitizationData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData = this.prepareBnplDigitizationData;
            if (prepareBnplDigitizationData == null) {
                return 0;
            }
            return prepareBnplDigitizationData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.prepareBnplDigitizationData, ((com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data) other).prepareBnplDigitizationData);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data(prepareBnplDigitizationData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData getPrepareBnplDigitizationData() {
            return this.prepareBnplDigitizationData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                prepareBnplDigitizationData = data.prepareBnplDigitizationData;
            }
            return data.copy(prepareBnplDigitizationData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$PrepareBnplDigitizationData;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$OnPrepareBNPLDigitizationDataSuccess;", "onPrepareBNPLDigitizationDataSuccess", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$OnPrepareBNPLDigitizationDataSuccess;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$OnPrepareBNPLDigitizationDataSuccess;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$OnPrepareBNPLDigitizationDataSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$PrepareBnplDigitizationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$OnPrepareBNPLDigitizationDataSuccess;", "getOnPrepareBNPLDigitizationDataSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrepareBnplDigitizationData {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess;

        public PrepareBnplDigitizationData(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPrepareBNPLDigitizationDataSuccess = onPrepareBNPLDigitizationDataSuccess;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess getOnPrepareBNPLDigitizationDataSuccess() {
            return this.onPrepareBNPLDigitizationDataSuccess;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess = this.onPrepareBNPLDigitizationDataSuccess;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareBnplDigitizationData(__typename=");
            sb.append(str);
            sb.append(", onPrepareBNPLDigitizationDataSuccess=");
            sb.append(onPrepareBNPLDigitizationDataSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess = this.onPrepareBNPLDigitizationDataSuccess;
            return (hashCode * 31) + (onPrepareBNPLDigitizationDataSuccess == null ? 0 : onPrepareBNPLDigitizationDataSuccess.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData = (com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, prepareBnplDigitizationData.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPrepareBNPLDigitizationDataSuccess, prepareBnplDigitizationData.onPrepareBNPLDigitizationDataSuccess);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData(__typename, onPrepareBNPLDigitizationDataSuccess);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess getOnPrepareBNPLDigitizationDataSuccess() {
            return this.onPrepareBNPLDigitizationDataSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.PrepareBnplDigitizationData prepareBnplDigitizationData, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = prepareBnplDigitizationData.__typename;
            }
            if ((i & 2) != 0) {
                onPrepareBNPLDigitizationDataSuccess = prepareBnplDigitizationData.onPrepareBNPLDigitizationDataSuccess;
            }
            return prepareBnplDigitizationData.copy(str, onPrepareBNPLDigitizationDataSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$OnPrepareBNPLDigitizationDataSuccess;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$IssuerDigitizationData;", "issuerDigitizationData", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$IssuerDigitizationData;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$IssuerDigitizationData;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$IssuerDigitizationData;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$OnPrepareBNPLDigitizationDataSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$IssuerDigitizationData;", "getIssuerDigitizationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPrepareBNPLDigitizationDataSuccess {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData issuerDigitizationData;

        public OnPrepareBNPLDigitizationDataSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData issuerDigitizationData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerDigitizationData, "");
            this.issuerDigitizationData = issuerDigitizationData;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData getIssuerDigitizationData() {
            return this.issuerDigitizationData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData issuerDigitizationData = this.issuerDigitizationData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPrepareBNPLDigitizationDataSuccess(issuerDigitizationData=");
            sb.append(issuerDigitizationData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.issuerDigitizationData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerDigitizationData, ((com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess) other).issuerDigitizationData);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess copy(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData issuerDigitizationData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerDigitizationData, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess(issuerDigitizationData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData getIssuerDigitizationData() {
            return this.issuerDigitizationData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.OnPrepareBNPLDigitizationDataSuccess onPrepareBNPLDigitizationDataSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData issuerDigitizationData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                issuerDigitizationData = onPrepareBNPLDigitizationDataSuccess.issuerDigitizationData;
            }
            return onPrepareBNPLDigitizationDataSuccess.copy(issuerDigitizationData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$IssuerDigitizationData;", "", "", "opaquePaymentCard", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$IssuerDigitizationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOpaquePaymentCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IssuerDigitizationData {
        public static final int $stable = 0;
        private final java.lang.String opaquePaymentCard;

        public IssuerDigitizationData(java.lang.String str) {
            this.opaquePaymentCard = str;
        }

        public final java.lang.String getOpaquePaymentCard() {
            return this.opaquePaymentCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.opaquePaymentCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerDigitizationData(opaquePaymentCard=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.opaquePaymentCard;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData) && kotlin.jvm.internal.Intrinsics.areEqual(this.opaquePaymentCard, ((com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData) other).opaquePaymentCard);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData copy(java.lang.String opaquePaymentCard) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData(opaquePaymentCard);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOpaquePaymentCard() {
            return this.opaquePaymentCard;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation.IssuerDigitizationData issuerDigitizationData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = issuerDigitizationData.opaquePaymentCard;
            }
            return issuerDigitizationData.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/PrepareBnplDigitizationDataMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation PrepareBnplDigitizationData($input: PrepareBNPLDigitizationDataInput!) { prepareBnplDigitizationData(input: $input) { __typename ... on PrepareBNPLDigitizationDataSuccess { issuerDigitizationData { opaquePaymentCard } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput prepareBNPLDigitizationDataInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareBnplDigitizationDataMutation(input=");
        sb.append(prepareBNPLDigitizationDataInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation copy(com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.PrepareBnplDigitizationDataMutation prepareBnplDigitizationDataMutation, com.paypal.oslo.api.graphql.schema.type.PrepareBNPLDigitizationDataInput prepareBNPLDigitizationDataInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            prepareBNPLDigitizationDataInput = prepareBnplDigitizationDataMutation.input;
        }
        return prepareBnplDigitizationDataMutation.copy(prepareBNPLDigitizationDataInput);
    }
}
