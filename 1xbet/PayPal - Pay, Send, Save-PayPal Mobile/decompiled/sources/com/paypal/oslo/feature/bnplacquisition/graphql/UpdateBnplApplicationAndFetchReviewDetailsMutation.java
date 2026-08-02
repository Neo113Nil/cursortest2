package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000f*+,-./01234567)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateBNPLApplicationInput;", "getInput", "Companion", "Data", "UpdateBnplApplication", "OnUpdateBNPLApplicationSuccess", "Application", "SelectedOffer", "DueTodayAmount", "PeriodicPaymentAmount", "TotalAmount", "TotalInterest", "Document", "SelectedPaymentFundingInstrument", "OnBankAccount", "OnCard", "OnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateBnplApplicationAndFetchReviewDetailsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data> {
    public static final java.lang.String OPERATION_ID = "54cced2656d160c2cfa4a646c031b4264882ea695394f6c9b05145c123a98a0e";
    public static final java.lang.String OPERATION_NAME = "UpdateBnplApplicationAndFetchReviewDetails";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateBnplApplicationAndFetchReviewDetailsMutation(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput) {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.UpdateBnplApplicationAndFetchReviewDetailsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;", "updateBnplApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;", "getUpdateBnplApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication) {
            this.updateBnplApplication = updateBnplApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateBnplApplication=");
            sb.append(updateBnplApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication = this.updateBnplApplication;
            if (updateBnplApplication == null) {
                return 0;
            }
            return updateBnplApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateBnplApplication, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data) other).updateBnplApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data(updateBnplApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication getUpdateBnplApplication() {
            return this.updateBnplApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateBnplApplication = data.updateBnplApplication;
            }
            return data.copy(updateBnplApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;", "onUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;", "onUpdateBNPLApplicationDecline", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;", "getOnUpdateBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;", "getOnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateBnplApplication {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess;

        public UpdateBnplApplication(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onUpdateBNPLApplicationSuccess = onUpdateBNPLApplicationSuccess;
            this.onUpdateBNPLApplicationDecline = onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
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
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess = this.onUpdateBNPLApplicationSuccess;
            int hashCode2 = onUpdateBNPLApplicationSuccess == null ? 0 : onUpdateBNPLApplicationSuccess.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = this.onUpdateBNPLApplicationDecline;
            return (((hashCode * 31) + hashCode2) * 31) + (onUpdateBNPLApplicationDecline != null ? onUpdateBNPLApplicationDecline.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, updateBnplApplication.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationSuccess, updateBnplApplication.onUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onUpdateBNPLApplicationDecline, updateBnplApplication.onUpdateBNPLApplicationDecline);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication(__typename, onUpdateBNPLApplicationSuccess, onUpdateBNPLApplicationDecline);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline getOnUpdateBNPLApplicationDecline() {
            return this.onUpdateBNPLApplicationDecline;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess getOnUpdateBNPLApplicationSuccess() {
            return this.onUpdateBNPLApplicationSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "application", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "getApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateBNPLApplicationSuccess {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application;

        public OnUpdateBNPLApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            this.application = application;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application getApplication() {
            return this.application;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application = this.application;
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess) other).application);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess(application);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application getApplication() {
            return this.application;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = onUpdateBNPLApplicationSuccess.application;
            }
            return onUpdateBNPLApplicationSuccess.copy(application);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;", "selectedOffer", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Document;", "documents", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;", "selectedPaymentFundingInstrument", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;", "getSelectedOffer", "Ljava/util/List;", "getDocuments", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;", "getSelectedPaymentFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Application {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> documents;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument;

        public Application(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> list, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.creditProductIdentifier = bNPLCreditProductIdentifier;
            this.selectedOffer = selectedOffer;
            this.documents = list;
            this.selectedPaymentFundingInstrument = selectedPaymentFundingInstrument;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer getSelectedOffer() {
            return this.selectedOffer;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> getDocuments() {
            return this.documents;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument getSelectedPaymentFundingInstrument() {
            return this.selectedPaymentFundingInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer = this.selectedOffer;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> list = this.documents;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = this.selectedPaymentFundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Application(creditProductIdentifier=");
            sb.append(bNPLCreditProductIdentifier);
            sb.append(", selectedOffer=");
            sb.append(selectedOffer);
            sb.append(", documents=");
            sb.append(list);
            sb.append(", selectedPaymentFundingInstrument=");
            sb.append(selectedPaymentFundingInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            int hashCode = bNPLCreditProductIdentifier == null ? 0 : bNPLCreditProductIdentifier.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer = this.selectedOffer;
            int hashCode2 = selectedOffer == null ? 0 : selectedOffer.hashCode();
            int hashCode3 = this.documents.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = this.selectedPaymentFundingInstrument;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (selectedPaymentFundingInstrument != null ? selectedPaymentFundingInstrument.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application) other;
            return this.creditProductIdentifier == application.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOffer, application.selectedOffer) && kotlin.jvm.internal.Intrinsics.areEqual(this.documents, application.documents) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedPaymentFundingInstrument, application.selectedPaymentFundingInstrument);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application copy(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> documents, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documents, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application(creditProductIdentifier, selectedOffer, documents, selectedPaymentFundingInstrument);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument getSelectedPaymentFundingInstrument() {
            return this.selectedPaymentFundingInstrument;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> component3() {
            return this.documents;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer getSelectedOffer() {
            return this.selectedOffer;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer, java.util.List list, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLCreditProductIdentifier = application.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                selectedOffer = application.selectedOffer;
            }
            if ((i & 4) != 0) {
                list = application.documents;
            }
            if ((i & 8) != 0) {
                selectedPaymentFundingInstrument = application.selectedPaymentFundingInstrument;
            }
            return application.copy(bNPLCreditProductIdentifier, selectedOffer, list, selectedPaymentFundingInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ^\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;", "", "", "installmentCount", "apr", "nominalInterestRate", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;", "dueTodayAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;", "periodicPaymentAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;", "totalAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;", "totalInterest", "<init>", "(ILjava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;", "component5", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;", "component6", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;", "component7", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;", "copy", "(ILjava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getInstallmentCount", "Ljava/lang/Object;", "getApr", "getNominalInterestRate", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;", "getDueTodayAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;", "getPeriodicPaymentAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;", "getTotalAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;", "getTotalInterest"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectedOffer {
        public static final int $stable = 8;
        private final java.lang.Object apr;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount;
        private final int installmentCount;
        private final java.lang.Object nominalInterestRate;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest;

        public SelectedOffer(int i, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueTodayAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
            this.installmentCount = i;
            this.apr = obj;
            this.nominalInterestRate = obj2;
            this.dueTodayAmount = dueTodayAmount;
            this.periodicPaymentAmount = periodicPaymentAmount;
            this.totalAmount = totalAmount;
            this.totalInterest = totalInterest;
        }

        public final int getInstallmentCount() {
            return this.installmentCount;
        }

        public final java.lang.Object getApr() {
            return this.apr;
        }

        public final java.lang.Object getNominalInterestRate() {
            return this.nominalInterestRate;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount getDueTodayAmount() {
            return this.dueTodayAmount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount getPeriodicPaymentAmount() {
            return this.periodicPaymentAmount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest getTotalInterest() {
            return this.totalInterest;
        }

        public final java.lang.String toString() {
            int i = this.installmentCount;
            java.lang.Object obj = this.apr;
            java.lang.Object obj2 = this.nominalInterestRate;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount = this.dueTodayAmount;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount = this.periodicPaymentAmount;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount = this.totalAmount;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest = this.totalInterest;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedOffer(installmentCount=");
            sb.append(i);
            sb.append(", apr=");
            sb.append(obj);
            sb.append(", nominalInterestRate=");
            sb.append(obj2);
            sb.append(", dueTodayAmount=");
            sb.append(dueTodayAmount);
            sb.append(", periodicPaymentAmount=");
            sb.append(periodicPaymentAmount);
            sb.append(", totalAmount=");
            sb.append(totalAmount);
            sb.append(", totalInterest=");
            sb.append(totalInterest);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.installmentCount);
            java.lang.Object obj = this.apr;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.nominalInterestRate;
            int hashCode3 = obj2 == null ? 0 : obj2.hashCode();
            int hashCode4 = this.dueTodayAmount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount = this.periodicPaymentAmount;
            int hashCode5 = periodicPaymentAmount == null ? 0 : periodicPaymentAmount.hashCode();
            int hashCode6 = this.totalAmount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest = this.totalInterest;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (totalInterest != null ? totalInterest.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer) other;
            return this.installmentCount == selectedOffer.installmentCount && kotlin.jvm.internal.Intrinsics.areEqual(this.apr, selectedOffer.apr) && kotlin.jvm.internal.Intrinsics.areEqual(this.nominalInterestRate, selectedOffer.nominalInterestRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueTodayAmount, selectedOffer.dueTodayAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.periodicPaymentAmount, selectedOffer.periodicPaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, selectedOffer.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalInterest, selectedOffer.totalInterest);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer copy(int installmentCount, java.lang.Object apr, java.lang.Object nominalInterestRate, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueTodayAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer(installmentCount, apr, nominalInterestRate, dueTodayAmount, periodicPaymentAmount, totalAmount, totalInterest);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest getTotalInterest() {
            return this.totalInterest;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount getPeriodicPaymentAmount() {
            return this.periodicPaymentAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount getDueTodayAmount() {
            return this.dueTodayAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getNominalInterestRate() {
            return this.nominalInterestRate;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getApr() {
            return this.apr;
        }

        /* renamed from: component1, reason: from getter */
        public final int getInstallmentCount() {
            return this.installmentCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer, int i, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest, int i2, java.lang.Object obj3) {
            if ((i2 & 1) != 0) {
                i = selectedOffer.installmentCount;
            }
            if ((i2 & 2) != 0) {
                obj = selectedOffer.apr;
            }
            java.lang.Object obj4 = obj;
            if ((i2 & 4) != 0) {
                obj2 = selectedOffer.nominalInterestRate;
            }
            java.lang.Object obj5 = obj2;
            if ((i2 & 8) != 0) {
                dueTodayAmount = selectedOffer.dueTodayAmount;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount2 = dueTodayAmount;
            if ((i2 & 16) != 0) {
                periodicPaymentAmount = selectedOffer.periodicPaymentAmount;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount2 = periodicPaymentAmount;
            if ((i2 & 32) != 0) {
                totalAmount = selectedOffer.totalAmount;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount2 = totalAmount;
            if ((i2 & 64) != 0) {
                totalInterest = selectedOffer.totalInterest;
            }
            return selectedOffer.copy(i, obj4, obj5, dueTodayAmount2, periodicPaymentAmount2, totalAmount2, totalInterest);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, dueTodayAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, dueTodayAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dueTodayAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = dueTodayAmount.bnplAcquisitionMoneyFragment;
            }
            return dueTodayAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, periodicPaymentAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, periodicPaymentAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = periodicPaymentAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = periodicPaymentAmount.bnplAcquisitionMoneyFragment;
            }
            return periodicPaymentAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, totalAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = totalAmount.bnplAcquisitionMoneyFragment;
            }
            return totalAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalInterest.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, totalInterest.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalInterest.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = totalInterest.bnplAcquisitionMoneyFragment;
            }
            return totalInterest.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Document;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "bnplAcquisitionDocumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Document;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "getBnplAcquisitionDocumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document document = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, document.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionDocumentFragment, document.bnplAcquisitionDocumentFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionDocumentFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document(__typename, bnplAcquisitionDocumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment getBnplAcquisitionDocumentFragment() {
            return this.bnplAcquisitionDocumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document document, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = document.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionDocumentFragment = document.bnplAcquisitionDocumentFragment;
            }
            return document.copy(str, bnplAcquisitionDocumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectedPaymentFundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard;

        public SelectedPaymentFundingInstrument(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedPaymentFundingInstrument(__typename=");
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
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode2 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard = this.onCard;
            return (((hashCode * 31) + hashCode2) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, selectedPaymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, selectedPaymentFundingInstrument.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, selectedPaymentFundingInstrument.onCard);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument(__typename, onBankAccount, onCard);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selectedPaymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount = selectedPaymentFundingInstrument.onBankAccount;
            }
            if ((i & 4) != 0) {
                onCard = selectedPaymentFundingInstrument.onCard;
            }
            return selectedPaymentFundingInstrument.copy(str, onBankAccount, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "bnplAcquisitionBankFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "getBnplAcquisitionBankFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionBankFragment, onBankAccount.bnplAcquisitionBankFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount(__typename, bnplAcquisitionBankFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionBankFragment = onBankAccount.bnplAcquisitionBankFragment;
            }
            return onBankAccount.copy(str, bnplAcquisitionBankFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "bnplAcquisitionCardFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "getBnplAcquisitionCardFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionCardFragment, onCard.bnplAcquisitionCardFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard(__typename, bnplAcquisitionCardFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionCardFragment = onCard.bnplAcquisitionCardFragment;
            }
            return onCard.copy(str, bnplAcquisitionCardFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline) other).reason;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLAcquisitionApplicationDeclineReason = onUpdateBNPLApplicationDecline.reason;
            }
            return onUpdateBNPLApplicationDecline.copy(bNPLAcquisitionApplicationDeclineReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateBnplApplicationAndFetchReviewDetails($input: UpdateBNPLApplicationInput!) { updateBnplApplication(input: $input) { __typename ... on UpdateBNPLApplicationSuccess { application { creditProductIdentifier selectedOffer { installmentCount apr nominalInterestRate dueTodayAmount { __typename ...BnplAcquisitionMoneyFragment } periodicPaymentAmount { __typename ...BnplAcquisitionMoneyFragment } totalAmount { __typename ...BnplAcquisitionMoneyFragment } totalInterest { __typename ...BnplAcquisitionMoneyFragment } } documents { __typename ...BnplAcquisitionDocumentFragment } selectedPaymentFundingInstrument { __typename ... on BankAccount { __typename ...BnplAcquisitionBankFragment } ... on Card { __typename ...BnplAcquisitionCardFragment } } } } ... on UpdateBNPLApplicationDecline { reason } } }  fragment BnplAcquisitionMoneyFragment on Money { currencyCode value }  fragment BnplAcquisitionDocumentFragment on BNPLAcquisitionDocument { downloadLink { fileName relativePath staticUrl type } viewLink { fileName relativePath staticUrl type } type html }  fragment BnplAcquisitionBankFragment on BankAccount { id type lastNChars bankIssuer: issuer { name } institutionImages { url } }  fragment BnplAcquisitionCardFragment on Card { id cardIssuer: issuer { name } lastNChars cardArt { primaryImage { baseCdnLinkPath } } productClass }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBnplApplicationAndFetchReviewDetailsMutation(input=");
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation updateBnplApplicationAndFetchReviewDetailsMutation, com.paypal.oslo.api.graphql.schema.type.UpdateBNPLApplicationInput updateBNPLApplicationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateBNPLApplicationInput = updateBnplApplicationAndFetchReviewDetailsMutation.input;
        }
        return updateBnplApplicationAndFetchReviewDetailsMutation.copy(updateBNPLApplicationInput);
    }
}
