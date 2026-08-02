package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "getInput", "Companion", "Data", "UpdateBnplApplication", "OnUpdateBNPLApplicationSuccess", "Application", "Document", "OnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateBnplApplicationAndFetchTermsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data> {
    public static final java.lang.String OPERATION_ID = "fc4e9c42101e6b8de6363e0480fb40e8460a8ab547ffda9053b8771995072984";
    public static final java.lang.String OPERATION_NAME = "UpdateBnplApplicationAndFetchTerms";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateBnplApplicationAndFetchTermsMutation(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateBNPLApplicationInput, "");
        this.input = updateBNPLApplicationInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput getInput() {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchTermsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchTermsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.UpdateBnplApplicationAndFetchTermsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$UpdateBnplApplication;", "updateBnplApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$UpdateBnplApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$UpdateBnplApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$UpdateBnplApplication;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$UpdateBnplApplication;", "getUpdateBnplApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication) {
            this.updateBnplApplication = updateBnplApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateBnplApplication=");
            sb.append(updateBnplApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            if (updateBnplApplication == null) {
                return 0;
            }
            return updateBnplApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateBnplApplication, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data) other).updateBnplApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data(updateBnplApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateBnplApplication = data.updateBnplApplication;
            }
            return data.copy(updateBnplApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$UpdateBnplApplication;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationSuccess;", "onUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationDecline;", "onUpdateBNPLApplicationDecline", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationDecline;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationSuccess;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationDecline;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationDecline;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$UpdateBnplApplication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationSuccess;", "getOnUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationDecline;", "getOnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateBnplApplication {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess;

        public UpdateBnplApplication(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onUpdateBNPLApplicationSuccess = onUpdateBNPLApplicationSuccess;
            this.onUpdateBNPLApplicationDecline = onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBnplApplication(__typename=");
            sb.append(str);
            sb.append(", onUpdateBNPLApplicationSuccess=");
            sb.append(onUpdateBNPLApplicationSuccess);
            sb.append(", onUpdateBNPLApplicationDecline=");
            sb.append(onUpdateBNPLApplicationDecline);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            int hashCode2 = onUpdateBNPLApplicationSuccess == null ? 0 : onUpdateBNPLApplicationSuccess.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
            return (((hashCode * 31) + hashCode2) * 31) + (onUpdateBNPLApplicationDecline != null ? onUpdateBNPLApplicationDecline.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, updateBnplApplication.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationSuccess, updateBnplApplication.onUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationDecline, updateBnplApplication.onUpdateBNPLApplicationDecline);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication(__typename, onUpdateBNPLApplicationSuccess, onUpdateBNPLApplicationDecline);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.UpdateBnplApplication updateBnplApplication, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateBnplApplication.__typename;
            }
            if ((i & 2) != 0) {
                onUpdateBNPLApplicationSuccess = updateBnplApplication.onUpdateBNPLApplicationSuccess;
            }
            if ((i & 4) != 0) {
                onUpdateBNPLApplicationDecline = updateBnplApplication.onUpdateBNPLApplicationDecline;
            }
            return updateBnplApplication.copy(str, onUpdateBNPLApplicationSuccess, onUpdateBNPLApplicationDecline);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationSuccess;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Application;", "application", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Application;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Application;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Application;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Application;", "getApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateBNPLApplicationSuccess {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application;

        public OnUpdateBNPLApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            this.application = application;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application getApplication() {
            return this.application;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application = this.application;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateBNPLApplicationSuccess(application=");
            sb.append(application);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.application.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess) other).application);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess(application);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application getApplication() {
            return this.application;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = onUpdateBNPLApplicationSuccess.application;
            }
            return onUpdateBNPLApplicationSuccess.copy(application);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Application;", "", "creditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Document;", "documents", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getDocuments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Application {
        public static final int $stable = 8;
        private final java.lang.Object creditAccountId;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document> documents;

        public Application(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.creditAccountId = obj;
            this.creditProductIdentifier = bNPLCreditProductIdentifier;
            this.documents = list;
        }

        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document> getDocuments() {
            return this.documents;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.creditAccountId;
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document> list = this.documents;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Application(creditAccountId=");
            sb.append(obj);
            sb.append(", creditProductIdentifier=");
            sb.append(bNPLCreditProductIdentifier);
            sb.append(", documents=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.creditAccountId;
            int hashCode = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            return (((hashCode * 31) + (bNPLCreditProductIdentifier != null ? bNPLCreditProductIdentifier.hashCode() : 0)) * 31) + this.documents.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, application.creditAccountId) && this.creditProductIdentifier == application.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.documents, application.documents);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application copy(java.lang.Object creditAccountId, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document> documents) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documents, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application(creditAccountId, creditProductIdentifier, documents);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document> component3() {
            return this.documents;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Application application, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = application.creditAccountId;
            }
            if ((i & 2) != 0) {
                bNPLCreditProductIdentifier = application.creditProductIdentifier;
            }
            if ((i & 4) != 0) {
                list = application.documents;
            }
            return application.copy(obj, bNPLCreditProductIdentifier, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Document;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "bnplAcquisitionDocumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Document;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "getBnplAcquisitionDocumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Document {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment;

        public Document(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionDocumentFragment, "");
            this.__typename = str;
            this.bnplAcquisitionDocumentFragment = bnplAcquisitionDocumentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment getBnplAcquisitionDocumentFragment() {
            return this.bnplAcquisitionDocumentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment = this.bnplAcquisitionDocumentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Document(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionDocumentFragment=");
            sb.append(bnplAcquisitionDocumentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionDocumentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document document = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, document.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionDocumentFragment, document.bnplAcquisitionDocumentFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionDocumentFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document(__typename, bnplAcquisitionDocumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment getBnplAcquisitionDocumentFragment() {
            return this.bnplAcquisitionDocumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.Document document, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = document.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionDocumentFragment = document.bnplAcquisitionDocumentFragment;
            }
            return document.copy(str, bnplAcquisitionDocumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationDecline;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$OnUpdateBNPLApplicationDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateBNPLApplicationDecline {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;

        public OnUpdateBNPLApplicationDecline(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionApplicationDeclineReason, "");
            this.reason = bNPLAcquisitionApplicationDeclineReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateBNPLApplicationDecline(reason=");
            sb.append(bNPLAcquisitionApplicationDeclineReason);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline) other).reason;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLAcquisitionApplicationDeclineReason = onUpdateBNPLApplicationDecline.reason;
            }
            return onUpdateBNPLApplicationDecline.copy(bNPLAcquisitionApplicationDeclineReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchTermsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateBnplApplicationAndFetchTerms($input: UpdateBNPLApplicationInput!) { updateBnplApplication(input: $input) { __typename ... on UpdateBNPLApplicationSuccess { application { creditAccountId creditProductIdentifier documents { __typename ...BnplAcquisitionDocumentFragment } } } ... on UpdateBNPLApplicationDecline { reason } } }  fragment BnplAcquisitionDocumentFragment on BNPLAcquisitionDocument { downloadLink { fileName relativePath staticUrl type } viewLink { fileName relativePath staticUrl type } type html }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBnplApplicationAndFetchTermsMutation(input=");
        sb.append(updateBNPLApplicationInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchTermsMutation updateBnplApplicationAndFetchTermsMutation, com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateBNPLApplicationInput = updateBnplApplicationAndFetchTermsMutation.input;
        }
        return updateBnplApplicationAndFetchTermsMutation.copy(updateBNPLApplicationInput);
    }
}
