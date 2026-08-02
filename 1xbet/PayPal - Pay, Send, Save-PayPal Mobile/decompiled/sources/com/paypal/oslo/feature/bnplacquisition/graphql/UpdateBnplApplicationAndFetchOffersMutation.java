package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000f*+,-./01234567)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "getInput", "Companion", "Data", "UpdateBnplApplication", "OnUpdateBNPLApplicationSuccess", "Application", "LoanAmount", "ProductOfferEvaluation", "Offer", "DueTodayAmount", "EstimatedInstallment", "TotalPayment", "PeriodicPaymentAmount", "TotalAmount", "TotalInterest", "OnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateBnplApplicationAndFetchOffersMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data> {
    public static final java.lang.String OPERATION_ID = "7318595445a2c36de9f7eb82e221171658d49b281e3593407f6aba8641abc36b";
    public static final java.lang.String OPERATION_NAME = "UpdateBnplApplicationAndFetchOffers";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateBnplApplicationAndFetchOffersMutation(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput) {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchOffersMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchOffersMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.UpdateBnplApplicationAndFetchOffersMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$UpdateBnplApplication;", "updateBnplApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$UpdateBnplApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$UpdateBnplApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$UpdateBnplApplication;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$UpdateBnplApplication;", "getUpdateBnplApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication) {
            this.updateBnplApplication = updateBnplApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateBnplApplication=");
            sb.append(updateBnplApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            if (updateBnplApplication == null) {
                return 0;
            }
            return updateBnplApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateBnplApplication, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data) other).updateBnplApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data(updateBnplApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateBnplApplication = data.updateBnplApplication;
            }
            return data.copy(updateBnplApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$UpdateBnplApplication;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationSuccess;", "onUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationDecline;", "onUpdateBNPLApplicationDecline", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationDecline;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationSuccess;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationDecline;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationDecline;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$UpdateBnplApplication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationSuccess;", "getOnUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationDecline;", "getOnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateBnplApplication {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess;

        public UpdateBnplApplication(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onUpdateBNPLApplicationSuccess = onUpdateBNPLApplicationSuccess;
            this.onUpdateBNPLApplicationDecline = onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
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
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            int hashCode2 = onUpdateBNPLApplicationSuccess == null ? 0 : onUpdateBNPLApplicationSuccess.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
            return (((hashCode * 31) + hashCode2) * 31) + (onUpdateBNPLApplicationDecline != null ? onUpdateBNPLApplicationDecline.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, updateBnplApplication.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationSuccess, updateBnplApplication.onUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationDecline, updateBnplApplication.onUpdateBNPLApplicationDecline);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication(__typename, onUpdateBNPLApplicationSuccess, onUpdateBNPLApplicationDecline);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.UpdateBnplApplication updateBnplApplication, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationSuccess;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Application;", "application", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Application;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Application;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Application;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Application;", "getApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateBNPLApplicationSuccess {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application;

        public OnUpdateBNPLApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            this.application = application;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application getApplication() {
            return this.application;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application = this.application;
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess) other).application);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess(application);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application getApplication() {
            return this.application;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = onUpdateBNPLApplicationSuccess.application;
            }
            return onUpdateBNPLApplicationSuccess.copy(application);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Application;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$LoanAmount;", "loanAmount", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$ProductOfferEvaluation;", "productOfferEvaluations", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$LoanAmount;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$LoanAmount;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$LoanAmount;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$LoanAmount;", "getLoanAmount", "Ljava/util/List;", "getProductOfferEvaluations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Application {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount loanAmount;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation> productOfferEvaluations;

        public Application(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount loanAmount, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loanAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.loanAmount = loanAmount;
            this.productOfferEvaluations = list;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount getLoanAmount() {
            return this.loanAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation> getProductOfferEvaluations() {
            return this.productOfferEvaluations;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount loanAmount = this.loanAmount;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation> list = this.productOfferEvaluations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Application(loanAmount=");
            sb.append(loanAmount);
            sb.append(", productOfferEvaluations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.loanAmount.hashCode() * 31) + this.productOfferEvaluations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.loanAmount, application.loanAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.productOfferEvaluations, application.productOfferEvaluations);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount loanAmount, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation> productOfferEvaluations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loanAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productOfferEvaluations, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application(loanAmount, productOfferEvaluations);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation> component2() {
            return this.productOfferEvaluations;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount getLoanAmount() {
            return this.loanAmount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Application application, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount loanAmount, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loanAmount = application.loanAmount;
            }
            if ((i & 2) != 0) {
                list = application.productOfferEvaluations;
            }
            return application.copy(loanAmount, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$LoanAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$LoanAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoanAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public LoanAmount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount loanAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, loanAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, loanAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.LoanAmount loanAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loanAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = loanAmount.bnplAcquisitionMoneyFragment;
            }
            return loanAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$ProductOfferEvaluation;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Offer;", "offers", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$ProductOfferEvaluation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProductOfferEvaluation {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> offers;

        public ProductOfferEvaluation(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
            this.creditProductIdentifier = bNPLCreditProductIdentifier;
            this.offers = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> getOffers() {
            return this.offers;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> list = this.offers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductOfferEvaluation(creditProductIdentifier=");
            sb.append(bNPLCreditProductIdentifier);
            sb.append(", offers=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditProductIdentifier.hashCode();
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> list = this.offers;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation productOfferEvaluation = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation) other;
            return this.creditProductIdentifier == productOfferEvaluation.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.offers, productOfferEvaluation.offers);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation copy(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> offers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation(creditProductIdentifier, offers);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer> component2() {
            return this.offers;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.ProductOfferEvaluation productOfferEvaluation, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLCreditProductIdentifier = productOfferEvaluation.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                list = productOfferEvaluation.offers;
            }
            return productOfferEvaluation.copy(bNPLCreditProductIdentifier, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0092\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b6\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b;\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b>\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010$R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010&R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bF\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Offer;", "", "id", "apr", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$DueTodayAmount;", "dueTodayAmount", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$EstimatedInstallment;", "estimatedInstallments", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionOfferHighlight;", "highlights", "", "installmentCount", "nominalInterestRate", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$PeriodicPaymentAmount;", "periodicPaymentAmount", "", "preselected", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalAmount;", "totalAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalInterest;", "totalInterest", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$DueTodayAmount;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$PeriodicPaymentAmount;ZLcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalInterest;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$DueTodayAmount;", "component4", "()Ljava/util/List;", "component5", "component6", "()I", "component7", "component8", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$PeriodicPaymentAmount;", "component9", "()Z", "component10", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalAmount;", "component11", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalInterest;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$DueTodayAmount;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$PeriodicPaymentAmount;ZLcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalInterest;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Offer;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "getApr", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$DueTodayAmount;", "getDueTodayAmount", "Ljava/util/List;", "getEstimatedInstallments", "getHighlights", com.visa.cbp.getEncExpo.warmup, "getInstallmentCount", "getNominalInterestRate", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$PeriodicPaymentAmount;", "getPeriodicPaymentAmount", "Z", "getPreselected", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalAmount;", "getTotalAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalInterest;", "getTotalInterest"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Offer {
        public static final int $stable = 8;
        private final java.lang.Object apr;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount dueTodayAmount;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment> estimatedInstallments;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> highlights;
        private final java.lang.Object id;
        private final int installmentCount;
        private final java.lang.Object nominalInterestRate;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount;
        private final boolean preselected;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount totalAmount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest;

        /* JADX WARN: Multi-variable type inference failed */
        public Offer(java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount dueTodayAmount, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment> list, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> list2, int i, java.lang.Object obj3, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount, boolean z, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount totalAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueTodayAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
            this.id = obj;
            this.apr = obj2;
            this.dueTodayAmount = dueTodayAmount;
            this.estimatedInstallments = list;
            this.highlights = list2;
            this.installmentCount = i;
            this.nominalInterestRate = obj3;
            this.periodicPaymentAmount = periodicPaymentAmount;
            this.preselected = z;
            this.totalAmount = totalAmount;
            this.totalInterest = totalInterest;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final java.lang.Object getApr() {
            return this.apr;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount getDueTodayAmount() {
            return this.dueTodayAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment> getEstimatedInstallments() {
            return this.estimatedInstallments;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> getHighlights() {
            return this.highlights;
        }

        public final int getInstallmentCount() {
            return this.installmentCount;
        }

        public final java.lang.Object getNominalInterestRate() {
            return this.nominalInterestRate;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount getPeriodicPaymentAmount() {
            return this.periodicPaymentAmount;
        }

        public final boolean getPreselected() {
            return this.preselected;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest getTotalInterest() {
            return this.totalInterest;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            java.lang.Object obj2 = this.apr;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount dueTodayAmount = this.dueTodayAmount;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment> list = this.estimatedInstallments;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> list2 = this.highlights;
            int i = this.installmentCount;
            java.lang.Object obj3 = this.nominalInterestRate;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount = this.periodicPaymentAmount;
            boolean z = this.preselected;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount totalAmount = this.totalAmount;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest = this.totalInterest;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Offer(id=");
            sb.append(obj);
            sb.append(", apr=");
            sb.append(obj2);
            sb.append(", dueTodayAmount=");
            sb.append(dueTodayAmount);
            sb.append(", estimatedInstallments=");
            sb.append(list);
            sb.append(", highlights=");
            sb.append(list2);
            sb.append(", installmentCount=");
            sb.append(i);
            sb.append(", nominalInterestRate=");
            sb.append(obj3);
            sb.append(", periodicPaymentAmount=");
            sb.append(periodicPaymentAmount);
            sb.append(", preselected=");
            sb.append(z);
            sb.append(", totalAmount=");
            sb.append(totalAmount);
            sb.append(", totalInterest=");
            sb.append(totalInterest);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.apr;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            int hashCode3 = this.dueTodayAmount.hashCode();
            int hashCode4 = this.estimatedInstallments.hashCode();
            int hashCode5 = this.highlights.hashCode();
            int hashCode6 = java.lang.Integer.hashCode(this.installmentCount);
            java.lang.Object obj2 = this.nominalInterestRate;
            int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount = this.periodicPaymentAmount;
            int hashCode8 = periodicPaymentAmount == null ? 0 : periodicPaymentAmount.hashCode();
            int hashCode9 = java.lang.Boolean.hashCode(this.preselected);
            int hashCode10 = this.totalAmount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest = this.totalInterest;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (totalInterest != null ? totalInterest.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer offer = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, offer.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.apr, offer.apr) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueTodayAmount, offer.dueTodayAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedInstallments, offer.estimatedInstallments) && kotlin.jvm.internal.Intrinsics.areEqual(this.highlights, offer.highlights) && this.installmentCount == offer.installmentCount && kotlin.jvm.internal.Intrinsics.areEqual(this.nominalInterestRate, offer.nominalInterestRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.periodicPaymentAmount, offer.periodicPaymentAmount) && this.preselected == offer.preselected && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, offer.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalInterest, offer.totalInterest);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer copy(java.lang.Object id, java.lang.Object apr, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount dueTodayAmount, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment> estimatedInstallments, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> highlights, int installmentCount, java.lang.Object nominalInterestRate, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount, boolean preselected, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount totalAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueTodayAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(estimatedInstallments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(highlights, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Offer(id, apr, dueTodayAmount, estimatedInstallments, highlights, installmentCount, nominalInterestRate, periodicPaymentAmount, preselected, totalAmount, totalInterest);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getPreselected() {
            return this.preselected;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount getPeriodicPaymentAmount() {
            return this.periodicPaymentAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getNominalInterestRate() {
            return this.nominalInterestRate;
        }

        /* renamed from: component6, reason: from getter */
        public final int getInstallmentCount() {
            return this.installmentCount;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionOfferHighlight> component5() {
            return this.highlights;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment> component4() {
            return this.estimatedInstallments;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount getDueTodayAmount() {
            return this.dueTodayAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getApr() {
            return this.apr;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest getTotalInterest() {
            return this.totalInterest;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$DueTodayAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$DueTodayAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DueTodayAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public DueTodayAmount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DueTodayAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount dueTodayAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, dueTodayAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, dueTodayAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.DueTodayAmount dueTodayAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dueTodayAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = dueTodayAmount.bnplAcquisitionMoneyFragment;
            }
            return dueTodayAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$EstimatedInstallment;", "", "paymentDate", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalPayment;", "totalPayment", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalPayment;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalPayment;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalPayment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$EstimatedInstallment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPaymentDate", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalPayment;", "getTotalPayment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EstimatedInstallment {
        public static final int $stable = 8;
        private final java.lang.Object paymentDate;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment totalPayment;

        public EstimatedInstallment(java.lang.Object obj, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment totalPayment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalPayment, "");
            this.paymentDate = obj;
            this.totalPayment = totalPayment;
        }

        public final java.lang.Object getPaymentDate() {
            return this.paymentDate;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment getTotalPayment() {
            return this.totalPayment;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.paymentDate;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment totalPayment = this.totalPayment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EstimatedInstallment(paymentDate=");
            sb.append(obj);
            sb.append(", totalPayment=");
            sb.append(totalPayment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.paymentDate.hashCode() * 31) + this.totalPayment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment estimatedInstallment = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDate, estimatedInstallment.paymentDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalPayment, estimatedInstallment.totalPayment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment copy(java.lang.Object paymentDate, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment totalPayment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalPayment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment(paymentDate, totalPayment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment getTotalPayment() {
            return this.totalPayment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPaymentDate() {
            return this.paymentDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.EstimatedInstallment estimatedInstallment, java.lang.Object obj, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment totalPayment, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = estimatedInstallment.paymentDate;
            }
            if ((i & 2) != 0) {
                totalPayment = estimatedInstallment.totalPayment;
            }
            return estimatedInstallment.copy(obj, totalPayment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalPayment;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalPayment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalPayment {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public TotalPayment(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalPayment(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment totalPayment = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalPayment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, totalPayment.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalPayment totalPayment, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalPayment.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = totalPayment.bnplAcquisitionMoneyFragment;
            }
            return totalPayment.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$PeriodicPaymentAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$PeriodicPaymentAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, periodicPaymentAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, periodicPaymentAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.PeriodicPaymentAmount periodicPaymentAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = periodicPaymentAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = periodicPaymentAmount.bnplAcquisitionMoneyFragment;
            }
            return periodicPaymentAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public TotalAmount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmount(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount totalAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, totalAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalAmount totalAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = totalAmount.bnplAcquisitionMoneyFragment;
            }
            return totalAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalInterest;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$TotalInterest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalInterest {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public TotalInterest(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalInterest(__typename=");
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalInterest.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, totalInterest.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.TotalInterest totalInterest, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalInterest.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = totalInterest.bnplAcquisitionMoneyFragment;
            }
            return totalInterest.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationDecline;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$OnUpdateBNPLApplicationDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline) other).reason;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLAcquisitionApplicationDeclineReason = onUpdateBNPLApplicationDecline.reason;
            }
            return onUpdateBNPLApplicationDecline.copy(bNPLAcquisitionApplicationDeclineReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateBnplApplicationAndFetchOffers($input: UpdateBNPLApplicationInput!) { updateBnplApplication(input: $input) { __typename ... on UpdateBNPLApplicationSuccess { application { loanAmount { __typename ...BnplAcquisitionMoneyFragment } productOfferEvaluations { creditProductIdentifier offers { id apr dueTodayAmount { __typename ...BnplAcquisitionMoneyFragment } estimatedInstallments { paymentDate totalPayment { __typename ...BnplAcquisitionMoneyFragment } } highlights installmentCount nominalInterestRate periodicPaymentAmount { __typename ...BnplAcquisitionMoneyFragment } preselected totalAmount { __typename ...BnplAcquisitionMoneyFragment } totalInterest { __typename ...BnplAcquisitionMoneyFragment } } } } } ... on UpdateBNPLApplicationDecline { reason } } }  fragment BnplAcquisitionMoneyFragment on Money { currencyCode value }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBnplApplicationAndFetchOffersMutation(input=");
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation updateBnplApplicationAndFetchOffersMutation, com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateBNPLApplicationInput = updateBnplApplicationAndFetchOffersMutation.input;
        }
        return updateBnplApplicationAndFetchOffersMutation.copy(updateBNPLApplicationInput);
    }
}
