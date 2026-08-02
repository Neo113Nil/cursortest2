package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f*+,-./01234)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "getInput", "Companion", "Data", "UpdateBnplApplication", "OnUpdateBNPLApplicationSuccess", "Application", "PaymentFundingInstrument", "OnBankAccount", "OnCard", "Document", "SelectedOffer", "PeriodicPaymentAmount", "OnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateBnplApplicationAndFetchRepaymentsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data> {
    public static final java.lang.String OPERATION_ID = "9c053108d6c4f573096127807ceeb8ff6e8a3143895f347f78a7ca093c78ed69";
    public static final java.lang.String OPERATION_NAME = "UpdateBnplApplicationAndFetchRepayments";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateBnplApplicationAndFetchRepaymentsMutation(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput) {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchRepaymentsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchRepaymentsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.UpdateBnplApplicationAndFetchRepaymentsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$UpdateBnplApplication;", "updateBnplApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$UpdateBnplApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$UpdateBnplApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$UpdateBnplApplication;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$UpdateBnplApplication;", "getUpdateBnplApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication) {
            this.updateBnplApplication = updateBnplApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateBnplApplication=");
            sb.append(updateBnplApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            if (updateBnplApplication == null) {
                return 0;
            }
            return updateBnplApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateBnplApplication, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data) other).updateBnplApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data(updateBnplApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateBnplApplication = data.updateBnplApplication;
            }
            return data.copy(updateBnplApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$UpdateBnplApplication;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationSuccess;", "onUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationDecline;", "onUpdateBNPLApplicationDecline", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationDecline;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationSuccess;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationDecline;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationDecline;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$UpdateBnplApplication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationSuccess;", "getOnUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationDecline;", "getOnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateBnplApplication {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess;

        public UpdateBnplApplication(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onUpdateBNPLApplicationSuccess = onUpdateBNPLApplicationSuccess;
            this.onUpdateBNPLApplicationDecline = onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
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
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            int hashCode2 = onUpdateBNPLApplicationSuccess == null ? 0 : onUpdateBNPLApplicationSuccess.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
            return (((hashCode * 31) + hashCode2) * 31) + (onUpdateBNPLApplicationDecline != null ? onUpdateBNPLApplicationDecline.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, updateBnplApplication.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationSuccess, updateBnplApplication.onUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationDecline, updateBnplApplication.onUpdateBNPLApplicationDecline);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication(__typename, onUpdateBNPLApplicationSuccess, onUpdateBNPLApplicationDecline);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.UpdateBnplApplication updateBnplApplication, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationSuccess;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Application;", "application", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Application;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Application;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Application;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Application;", "getApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateBNPLApplicationSuccess {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application;

        public OnUpdateBNPLApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            this.application = application;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application getApplication() {
            return this.application;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application = this.application;
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess) other).application);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess(application);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application getApplication() {
            return this.application;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = onUpdateBNPLApplicationSuccess.application;
            }
            return onUpdateBNPLApplicationSuccess.copy(application);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Application;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PaymentFundingInstrument;", "paymentFundingInstruments", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Document;", "documents", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$SelectedOffer;", "selectedOffer", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$SelectedOffer;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$SelectedOffer;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$SelectedOffer;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getPaymentFundingInstruments", "getDocuments", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$SelectedOffer;", "getSelectedOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Application {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document> documents;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument> paymentFundingInstruments;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer;

        public Application(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument> list, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document> list2, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.creditProductIdentifier = bNPLCreditProductIdentifier;
            this.paymentFundingInstruments = list;
            this.documents = list2;
            this.selectedOffer = selectedOffer;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument> getPaymentFundingInstruments() {
            return this.paymentFundingInstruments;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document> getDocuments() {
            return this.documents;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer getSelectedOffer() {
            return this.selectedOffer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument> list = this.paymentFundingInstruments;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document> list2 = this.documents;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer = this.selectedOffer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Application(creditProductIdentifier=");
            sb.append(bNPLCreditProductIdentifier);
            sb.append(", paymentFundingInstruments=");
            sb.append(list);
            sb.append(", documents=");
            sb.append(list2);
            sb.append(", selectedOffer=");
            sb.append(selectedOffer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            int hashCode = bNPLCreditProductIdentifier == null ? 0 : bNPLCreditProductIdentifier.hashCode();
            int hashCode2 = this.paymentFundingInstruments.hashCode();
            int hashCode3 = this.documents.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer = this.selectedOffer;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (selectedOffer != null ? selectedOffer.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application) other;
            return this.creditProductIdentifier == application.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstruments, application.paymentFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.documents, application.documents) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOffer, application.selectedOffer);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application copy(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument> paymentFundingInstruments, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document> documents, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documents, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application(creditProductIdentifier, paymentFundingInstruments, documents, selectedOffer);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer getSelectedOffer() {
            return this.selectedOffer;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document> component3() {
            return this.documents;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument> component2() {
            return this.paymentFundingInstruments;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Application application, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.util.List list, java.util.List list2, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLCreditProductIdentifier = application.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                list = application.paymentFundingInstruments;
            }
            if ((i & 4) != 0) {
                list2 = application.documents;
            }
            if ((i & 8) != 0) {
                selectedOffer = application.selectedOffer;
            }
            return application.copy(bNPLCreditProductIdentifier, list, list2, selectedOffer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnBankAccount;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnCard;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentFundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard;

        public PaymentFundingInstrument(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentFundingInstrument(__typename=");
            sb.append(str);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount);
            sb.append(", onCard=");
            sb.append(onCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode2 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard = this.onCard;
            return (((hashCode * 31) + hashCode2) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, paymentFundingInstrument.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, paymentFundingInstrument.onCard);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument(__typename, onBankAccount, onCard);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PaymentFundingInstrument paymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount = paymentFundingInstrument.onBankAccount;
            }
            if ((i & 4) != 0) {
                onCard = paymentFundingInstrument.onCard;
            }
            return paymentFundingInstrument.copy(str, onBankAccount, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnBankAccount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "bnplAcquisitionBankFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "getBnplAcquisitionBankFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment;

        public OnBankAccount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            this.__typename = str;
            this.bnplAcquisitionBankFragment = bnplAcquisitionBankFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment = this.bnplAcquisitionBankFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionBankFragment=");
            sb.append(bnplAcquisitionBankFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionBankFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionBankFragment, onBankAccount.bnplAcquisitionBankFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount(__typename, bnplAcquisitionBankFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnBankAccount onBankAccount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionBankFragment = onBankAccount.bnplAcquisitionBankFragment;
            }
            return onBankAccount.copy(str, bnplAcquisitionBankFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "bnplAcquisitionCardFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "getBnplAcquisitionCardFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCard {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment;

        public OnCard(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            this.__typename = str;
            this.bnplAcquisitionCardFragment = bnplAcquisitionCardFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment = this.bnplAcquisitionCardFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionCardFragment=");
            sb.append(bnplAcquisitionCardFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionCardFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionCardFragment, onCard.bnplAcquisitionCardFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard(__typename, bnplAcquisitionCardFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnCard onCard, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionCardFragment = onCard.bnplAcquisitionCardFragment;
            }
            return onCard.copy(str, bnplAcquisitionCardFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Document;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "bnplAcquisitionDocumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Document;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "getBnplAcquisitionDocumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document document = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, document.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionDocumentFragment, document.bnplAcquisitionDocumentFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionDocumentFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document(__typename, bnplAcquisitionDocumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment getBnplAcquisitionDocumentFragment() {
            return this.bnplAcquisitionDocumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Document document, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = document.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionDocumentFragment = document.bnplAcquisitionDocumentFragment;
            }
            return document.copy(str, bnplAcquisitionDocumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$SelectedOffer;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PeriodicPaymentAmount;", "periodicPaymentAmount", "", "installmentCount", "firstPaymentDate", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PeriodicPaymentAmount;ILjava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PeriodicPaymentAmount;", "component2", "()I", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PeriodicPaymentAmount;ILjava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$SelectedOffer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PeriodicPaymentAmount;", "getPeriodicPaymentAmount", com.visa.cbp.getEncExpo.warmup, "getInstallmentCount", "Ljava/lang/Object;", "getFirstPaymentDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectedOffer {
        public static final int $stable = 8;
        private final java.lang.Object firstPaymentDate;
        private final int installmentCount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount;

        public SelectedOffer(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount, int i, java.lang.Object obj) {
            this.periodicPaymentAmount = periodicPaymentAmount;
            this.installmentCount = i;
            this.firstPaymentDate = obj;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount getPeriodicPaymentAmount() {
            return this.periodicPaymentAmount;
        }

        public final int getInstallmentCount() {
            return this.installmentCount;
        }

        public final java.lang.Object getFirstPaymentDate() {
            return this.firstPaymentDate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount = this.periodicPaymentAmount;
            int i = this.installmentCount;
            java.lang.Object obj = this.firstPaymentDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedOffer(periodicPaymentAmount=");
            sb.append(periodicPaymentAmount);
            sb.append(", installmentCount=");
            sb.append(i);
            sb.append(", firstPaymentDate=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount = this.periodicPaymentAmount;
            int hashCode = periodicPaymentAmount == null ? 0 : periodicPaymentAmount.hashCode();
            int hashCode2 = java.lang.Integer.hashCode(this.installmentCount);
            java.lang.Object obj = this.firstPaymentDate;
            return (((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.periodicPaymentAmount, selectedOffer.periodicPaymentAmount) && this.installmentCount == selectedOffer.installmentCount && kotlin.jvm.internal.Intrinsics.areEqual(this.firstPaymentDate, selectedOffer.firstPaymentDate);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount, int installmentCount, java.lang.Object firstPaymentDate) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer(periodicPaymentAmount, installmentCount, firstPaymentDate);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getFirstPaymentDate() {
            return this.firstPaymentDate;
        }

        /* renamed from: component2, reason: from getter */
        public final int getInstallmentCount() {
            return this.installmentCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount getPeriodicPaymentAmount() {
            return this.periodicPaymentAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.SelectedOffer selectedOffer, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
            if ((i2 & 1) != 0) {
                periodicPaymentAmount = selectedOffer.periodicPaymentAmount;
            }
            if ((i2 & 2) != 0) {
                i = selectedOffer.installmentCount;
            }
            if ((i2 & 4) != 0) {
                obj = selectedOffer.firstPaymentDate;
            }
            return selectedOffer.copy(periodicPaymentAmount, i, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PeriodicPaymentAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$PeriodicPaymentAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PeriodicPaymentAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public PeriodicPaymentAmount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            this.__typename = str;
            this.bnplAcquisitionMoneyFragment = bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = this.bnplAcquisitionMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PeriodicPaymentAmount(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionMoneyFragment=");
            sb.append(bnplAcquisitionMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, periodicPaymentAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, periodicPaymentAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.PeriodicPaymentAmount periodicPaymentAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = periodicPaymentAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = periodicPaymentAmount.bnplAcquisitionMoneyFragment;
            }
            return periodicPaymentAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationDecline;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$OnUpdateBNPLApplicationDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline) other).reason;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLAcquisitionApplicationDeclineReason = onUpdateBNPLApplicationDecline.reason;
            }
            return onUpdateBNPLApplicationDecline.copy(bNPLAcquisitionApplicationDeclineReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateBnplApplicationAndFetchRepayments($input: UpdateBNPLApplicationInput!) { updateBnplApplication(input: $input) { __typename ... on UpdateBNPLApplicationSuccess { application { creditProductIdentifier paymentFundingInstruments { __typename ... on BankAccount { __typename ...BnplAcquisitionBankFragment } ... on Card { __typename ...BnplAcquisitionCardFragment } } documents { __typename ...BnplAcquisitionDocumentFragment } selectedOffer { periodicPaymentAmount { __typename ...BnplAcquisitionMoneyFragment } installmentCount firstPaymentDate } } } ... on UpdateBNPLApplicationDecline { reason } } }  fragment BnplAcquisitionBankFragment on BankAccount { id type lastNChars bankIssuer: issuer { name } institutionImages { url } }  fragment BnplAcquisitionCardFragment on Card { id cardIssuer: issuer { name } lastNChars cardArt { primaryImage { baseCdnLinkPath } } productClass }  fragment BnplAcquisitionDocumentFragment on BNPLAcquisitionDocument { downloadLink { fileName relativePath staticUrl type } viewLink { fileName relativePath staticUrl type } type html }  fragment BnplAcquisitionMoneyFragment on Money { currencyCode value }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBnplApplicationAndFetchRepaymentsMutation(input=");
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation updateBnplApplicationAndFetchRepaymentsMutation, com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateBNPLApplicationInput = updateBnplApplicationAndFetchRepaymentsMutation.input;
        }
        return updateBnplApplicationAndFetchRepaymentsMutation.copy(updateBNPLApplicationInput);
    }
}
