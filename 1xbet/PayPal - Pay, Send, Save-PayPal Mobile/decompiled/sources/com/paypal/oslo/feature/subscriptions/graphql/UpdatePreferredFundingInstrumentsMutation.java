package com.paypal.oslo.feature.subscriptions.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePreferredFundingInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePreferredFundingInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdatePreferredFundingInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdatePreferredFundingInstrumentsInput;)Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePreferredFundingInstrumentsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.OPERATION_NAME, "FailedConsumerAgreement"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UpdatePreferredFundingInstrumentsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data> {
    public static final java.lang.String OPERATION_ID = "12ba86fd9101f1976f1137330f8cb93b5f13451222b3f19c633d6f181af85192";
    public static final java.lang.String OPERATION_NAME = "UpdatePreferredFundingInstruments";
    private final com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Companion(null);
    public static final int $stable = 8;

    public UpdatePreferredFundingInstrumentsMutation(com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput updatePreferredFundingInstrumentsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePreferredFundingInstrumentsInput, "");
        this.input = updatePreferredFundingInstrumentsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput getInput() {
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
        com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.UpdatePreferredFundingInstrumentsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.subscriptions.graphql.selections.UpdatePreferredFundingInstrumentsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;", "updatePreferredFundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;)Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;", "getUpdatePreferredFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments;

        public Data(com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePreferredFundingInstruments, "");
            this.updatePreferredFundingInstruments = updatePreferredFundingInstruments;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments getUpdatePreferredFundingInstruments() {
            return this.updatePreferredFundingInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments = this.updatePreferredFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updatePreferredFundingInstruments=");
            sb.append(updatePreferredFundingInstruments);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updatePreferredFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatePreferredFundingInstruments, ((com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data) other).updatePreferredFundingInstruments);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data copy(com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePreferredFundingInstruments, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data(updatePreferredFundingInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments getUpdatePreferredFundingInstruments() {
            return this.updatePreferredFundingInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data copy$default(com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data data, com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updatePreferredFundingInstruments = data.updatePreferredFundingInstruments;
            }
            return data.copy(updatePreferredFundingInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;", "", "", "", "updatedConsumerAgreementIds", "Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$FailedConsumerAgreement;", "failedConsumerAgreements", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$UpdatePreferredFundingInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getUpdatedConsumerAgreementIds", "getFailedConsumerAgreements"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdatePreferredFundingInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> failedConsumerAgreements;
        private final java.util.List<java.lang.String> updatedConsumerAgreementIds;

        public UpdatePreferredFundingInstruments(java.util.List<java.lang.String> list, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> list2) {
            this.updatedConsumerAgreementIds = list;
            this.failedConsumerAgreements = list2;
        }

        public final java.util.List<java.lang.String> getUpdatedConsumerAgreementIds() {
            return this.updatedConsumerAgreementIds;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> getFailedConsumerAgreements() {
            return this.failedConsumerAgreements;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.updatedConsumerAgreementIds;
            java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> list2 = this.failedConsumerAgreements;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePreferredFundingInstruments(updatedConsumerAgreementIds=");
            sb.append(list);
            sb.append(", failedConsumerAgreements=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<java.lang.String> list = this.updatedConsumerAgreementIds;
            int hashCode = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> list2 = this.failedConsumerAgreements;
            return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments = (com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.updatedConsumerAgreementIds, updatePreferredFundingInstruments.updatedConsumerAgreementIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedConsumerAgreements, updatePreferredFundingInstruments.failedConsumerAgreements);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments copy(java.util.List<java.lang.String> updatedConsumerAgreementIds, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> failedConsumerAgreements) {
            return new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments(updatedConsumerAgreementIds, failedConsumerAgreements);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> component2() {
            return this.failedConsumerAgreements;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.updatedConsumerAgreementIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments copy$default(com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = updatePreferredFundingInstruments.updatedConsumerAgreementIds;
            }
            if ((i & 2) != 0) {
                list2 = updatePreferredFundingInstruments.failedConsumerAgreements;
            }
            return updatePreferredFundingInstruments.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$FailedConsumerAgreement;", "", "", "consumerAgreementId", "Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "reason", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;)Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$FailedConsumerAgreement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConsumerAgreementId", "Lcom/paypal/oslo/api/graphql/schema/type/FailUpdatePreferredFundingInstrumentReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FailedConsumerAgreement {
        public static final int $stable = 0;
        private final java.lang.String consumerAgreementId;
        private final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason reason;

        public FailedConsumerAgreement(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failUpdatePreferredFundingInstrumentReason, "");
            this.consumerAgreementId = str;
            this.reason = failUpdatePreferredFundingInstrumentReason;
        }

        public final java.lang.String getConsumerAgreementId() {
            return this.consumerAgreementId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.consumerAgreementId;
            com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FailedConsumerAgreement(consumerAgreementId=");
            sb.append(str);
            sb.append(", reason=");
            sb.append(failUpdatePreferredFundingInstrumentReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.consumerAgreementId.hashCode() * 31) + this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement failedConsumerAgreement = (com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreementId, failedConsumerAgreement.consumerAgreementId) && this.reason == failedConsumerAgreement.reason;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement copy(java.lang.String consumerAgreementId, com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement(consumerAgreementId, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConsumerAgreementId() {
            return this.consumerAgreementId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement copy$default(com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement failedConsumerAgreement, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FailUpdatePreferredFundingInstrumentReason failUpdatePreferredFundingInstrumentReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failedConsumerAgreement.consumerAgreementId;
            }
            if ((i & 2) != 0) {
                failUpdatePreferredFundingInstrumentReason = failedConsumerAgreement.reason;
            }
            return failedConsumerAgreement.copy(str, failUpdatePreferredFundingInstrumentReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/UpdatePreferredFundingInstrumentsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdatePreferredFundingInstruments($input: UpdatePreferredFundingInstrumentsInput!) { updatePreferredFundingInstruments(input: $input) { updatedConsumerAgreementIds failedConsumerAgreements { consumerAgreementId reason } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput updatePreferredFundingInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePreferredFundingInstrumentsMutation(input=");
        sb.append(updatePreferredFundingInstrumentsInput);
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
        return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation) other).input);
    }

    public final com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation copy$default(com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation updatePreferredFundingInstrumentsMutation, com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput updatePreferredFundingInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updatePreferredFundingInstrumentsInput = updatePreferredFundingInstrumentsMutation.input;
        }
        return updatePreferredFundingInstrumentsMutation.copy(updatePreferredFundingInstrumentsInput);
    }
}
