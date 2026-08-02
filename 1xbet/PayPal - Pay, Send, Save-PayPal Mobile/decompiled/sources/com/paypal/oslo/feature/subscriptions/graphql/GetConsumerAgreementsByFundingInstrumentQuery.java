package com.paypal.oslo.feature.subscriptions.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\n*+,-./012)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementsByFundingInstrumentInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementsByFundingInstrumentInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementsByFundingInstrumentInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementsByFundingInstrumentInput;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementsByFundingInstrumentInput;", "getInput", "Companion", "Data", "ConsumerAgreementsByFundingInstrument", "FundingInstrument", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "ConsumerAgreement", "PreferredFundingInstrument", "BalanceFundingInstrument", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "Merchant1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetConsumerAgreementsByFundingInstrumentQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data> {
    public static final java.lang.String OPERATION_ID = "bdf08ee4dbabd02a70a3474700ee8564b56cef46d5659e027745b0af9389d28a";
    public static final java.lang.String OPERATION_NAME = "GetConsumerAgreementsByFundingInstrument";
    private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Companion(null);
    public static final int $stable = 8;

    public GetConsumerAgreementsByFundingInstrumentQuery(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput consumerAgreementsByFundingInstrumentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementsByFundingInstrumentInput, "");
        this.input = consumerAgreementsByFundingInstrumentInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput getInput() {
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
        com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementsByFundingInstrumentQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.subscriptions.graphql.selections.GetConsumerAgreementsByFundingInstrumentQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;", "consumerAgreementsByFundingInstrument", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getConsumerAgreementsByFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> consumerAgreementsByFundingInstrument;

        public Data(java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.consumerAgreementsByFundingInstrument = list;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> getConsumerAgreementsByFundingInstrument() {
            return this.consumerAgreementsByFundingInstrument;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> list = this.consumerAgreementsByFundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(consumerAgreementsByFundingInstrument=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.consumerAgreementsByFundingInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreementsByFundingInstrument, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data) other).consumerAgreementsByFundingInstrument);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data copy(java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> consumerAgreementsByFundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementsByFundingInstrument, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data(consumerAgreementsByFundingInstrument);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> component1() {
            return this.consumerAgreementsByFundingInstrument;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.consumerAgreementsByFundingInstrument;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;", "fundingInstrument", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreement;", "consumerAgreements", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;", "getFundingInstrument", "Ljava/util/List;", "getConsumerAgreements"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsumerAgreementsByFundingInstrument {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> consumerAgreements;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument;

        public ConsumerAgreementsByFundingInstrument(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fundingInstrument = fundingInstrument;
            this.consumerAgreements = list;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> getConsumerAgreements() {
            return this.consumerAgreements;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument = this.fundingInstrument;
            java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> list = this.consumerAgreements;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerAgreementsByFundingInstrument(fundingInstrument=");
            sb.append(fundingInstrument);
            sb.append(", consumerAgreements=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument = this.fundingInstrument;
            return ((fundingInstrument == null ? 0 : fundingInstrument.hashCode()) * 31) + this.consumerAgreements.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument consumerAgreementsByFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, consumerAgreementsByFundingInstrument.fundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreements, consumerAgreementsByFundingInstrument.consumerAgreements);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument copy(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> consumerAgreements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreements, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument(fundingInstrument, consumerAgreements);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> component2() {
            return this.consumerAgreements;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument getFundingInstrument() {
            return this.fundingInstrument;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument consumerAgreementsByFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrument = consumerAgreementsByFundingInstrument.fundingInstrument;
            }
            if ((i & 2) != 0) {
                list = consumerAgreementsByFundingInstrument.consumerAgreements;
            }
            return consumerAgreementsByFundingInstrument.copy(fundingInstrument, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JR\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;", "", "", "id", "lastDigits", "name", "thumbnailImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Object;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component6", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$FundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastDigits", "getName", "Ljava/lang/Object;", "getThumbnailImageUrl", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance;
        private final java.lang.String id;
        private final java.lang.String lastDigits;
        private final java.lang.String name;
        private final java.lang.Object thumbnailImageUrl;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public FundingInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.id = str;
            this.lastDigits = str2;
            this.name = str3;
            this.thumbnailImageUrl = obj;
            this.type = fundingInstrumentType;
            this.balance = balance;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance getBalance() {
            return this.balance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastDigits;
            java.lang.String str3 = this.name;
            java.lang.Object obj = this.thumbnailImageUrl;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance = this.balance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrument(id=");
            sb.append(str);
            sb.append(", lastDigits=");
            sb.append(str2);
            sb.append(", name=");
            sb.append(str3);
            sb.append(", thumbnailImageUrl=");
            sb.append(obj);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", balance=");
            sb.append(balance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.lastDigits;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.name.hashCode();
            java.lang.Object obj = this.thumbnailImageUrl;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            int hashCode5 = this.type.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance = this.balance;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (balance != null ? balance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingInstrument.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, fundingInstrument.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrument.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImageUrl, fundingInstrument.thumbnailImageUrl) && this.type == fundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, fundingInstrument.balance);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument copy(java.lang.String id, java.lang.String lastDigits, java.lang.String name2, java.lang.Object thumbnailImageUrl, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument(id, lastDigits, name2, thumbnailImageUrl, type, balance);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance getBalance() {
            return this.balance;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = fundingInstrument.id;
            }
            if ((i & 2) != 0) {
                str2 = fundingInstrument.lastDigits;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = fundingInstrument.name;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                obj = fundingInstrument.thumbnailImageUrl;
            }
            java.lang.Object obj3 = obj;
            if ((i & 16) != 0) {
                fundingInstrumentType = fundingInstrument.type;
            }
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
            if ((i & 32) != 0) {
                balance = fundingInstrument.balance;
            }
            return fundingInstrument.copy(str, str4, str5, obj3, fundingInstrumentType2, balance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Balance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balance {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Balance(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balance.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, balance.value);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = balance.currencyCode;
            }
            if ((i & 2) != 0) {
                str = balance.value;
            }
            return balance.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\\\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreement;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "balancePreference", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;", "preferredFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;", "balanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;", "merchant", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "component5", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;", "component6", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;", "component7", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "getBalancePreference", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;", "getPreferredFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;", "getBalanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;", "getMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsumerAgreement {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant merchant;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType type;

        public ConsumerAgreement(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            this.id = str;
            this.type = consumerAgreementType;
            this.status = consumerAgreementStatus;
            this.balancePreference = consumerAgreementBalancePreference;
            this.preferredFundingInstrument = preferredFundingInstrument;
            this.balanceFundingInstrument = balanceFundingInstrument;
            this.merchant = merchant;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType getType() {
            return this.type;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference getBalancePreference() {
            return this.balancePreference;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument getPreferredFundingInstrument() {
            return this.preferredFundingInstrument;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument getBalanceFundingInstrument() {
            return this.balanceFundingInstrument;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant getMerchant() {
            return this.merchant;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType = this.type;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = this.balancePreference;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument = this.preferredFundingInstrument;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument = this.balanceFundingInstrument;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant merchant = this.merchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerAgreement(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(consumerAgreementType);
            sb.append(", status=");
            sb.append(consumerAgreementStatus);
            sb.append(", balancePreference=");
            sb.append(consumerAgreementBalancePreference);
            sb.append(", preferredFundingInstrument=");
            sb.append(preferredFundingInstrument);
            sb.append(", balanceFundingInstrument=");
            sb.append(balanceFundingInstrument);
            sb.append(", merchant=");
            sb.append(merchant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            int hashCode3 = this.status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = this.balancePreference;
            int hashCode4 = consumerAgreementBalancePreference == null ? 0 : consumerAgreementBalancePreference.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument = this.preferredFundingInstrument;
            int hashCode5 = preferredFundingInstrument == null ? 0 : preferredFundingInstrument.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument = this.balanceFundingInstrument;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (balanceFundingInstrument != null ? balanceFundingInstrument.hashCode() : 0)) * 31) + this.merchant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement consumerAgreement = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, consumerAgreement.id) && this.type == consumerAgreement.type && this.status == consumerAgreement.status && this.balancePreference == consumerAgreement.balancePreference && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, consumerAgreement.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, consumerAgreement.balanceFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, consumerAgreement.merchant);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType type, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus status, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement(id, type, status, balancePreference, preferredFundingInstrument, balanceFundingInstrument, merchant);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant getMerchant() {
            return this.merchant;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument getBalanceFundingInstrument() {
            return this.balanceFundingInstrument;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument getPreferredFundingInstrument() {
            return this.preferredFundingInstrument;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference getBalancePreference() {
            return this.balancePreference;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement consumerAgreement, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant merchant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = consumerAgreement.id;
            }
            if ((i & 2) != 0) {
                consumerAgreementType = consumerAgreement.type;
            }
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType2 = consumerAgreementType;
            if ((i & 4) != 0) {
                consumerAgreementStatus = consumerAgreement.status;
            }
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus2 = consumerAgreementStatus;
            if ((i & 8) != 0) {
                consumerAgreementBalancePreference = consumerAgreement.balancePreference;
            }
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference2 = consumerAgreementBalancePreference;
            if ((i & 16) != 0) {
                preferredFundingInstrument = consumerAgreement.preferredFundingInstrument;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument2 = preferredFundingInstrument;
            if ((i & 32) != 0) {
                balanceFundingInstrument = consumerAgreement.balanceFundingInstrument;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument2 = balanceFundingInstrument;
            if ((i & 64) != 0) {
                merchant = consumerAgreement.merchant;
            }
            return consumerAgreement.copy(str, consumerAgreementType2, consumerAgreementStatus2, consumerAgreementBalancePreference2, preferredFundingInstrument2, balanceFundingInstrument2, merchant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;", "", "", "id", "name", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "lastDigits", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$PreferredFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "getLastDigits"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PreferredFundingInstrument {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String lastDigits;
        private final java.lang.String name;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public PreferredFundingInstrument(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.id = str;
            this.name = str2;
            this.type = fundingInstrumentType;
            this.lastDigits = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.String str3 = this.lastDigits;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PreferredFundingInstrument(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", lastDigits=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            int hashCode3 = this.type.hashCode();
            java.lang.String str = this.lastDigits;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, preferredFundingInstrument.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, preferredFundingInstrument.name) && this.type == preferredFundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, preferredFundingInstrument.lastDigits);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument copy(java.lang.String id, java.lang.String name2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.String lastDigits) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument(id, name2, type, lastDigits);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = preferredFundingInstrument.id;
            }
            if ((i & 2) != 0) {
                str2 = preferredFundingInstrument.name;
            }
            if ((i & 4) != 0) {
                fundingInstrumentType = preferredFundingInstrument.type;
            }
            if ((i & 8) != 0) {
                str3 = preferredFundingInstrument.lastDigits;
            }
            return preferredFundingInstrument.copy(str, str2, fundingInstrumentType, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$BalanceFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceFundingInstrument {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public BalanceFundingInstrument(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.id = str;
            this.type = fundingInstrumentType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceFundingInstrument(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, balanceFundingInstrument.id) && this.type == balanceFundingInstrument.type;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument(id, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = balanceFundingInstrument.id;
            }
            if ((i & 2) != 0) {
                fundingInstrumentType = balanceFundingInstrument.type;
            }
            return balanceFundingInstrument.copy(str, fundingInstrumentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;", "merchant", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;", "getMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant;

        public Merchant(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant1) {
            this.merchant = merchant1;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 getMerchant() {
            return this.merchant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant1 = this.merchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(merchant=");
            sb.append(merchant1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant1 = this.merchant;
            if (merchant1 == null) {
                return 0;
            }
            return merchant1.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant) other).merchant);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant copy(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant) {
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant(merchant);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 getMerchant() {
            return this.merchant;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant merchant, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchant1 = merchant.merchant;
            }
            return merchant.copy(merchant1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;", "", "", "id", "name", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Merchant1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant1 {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.Object logoUrl;
        private final java.lang.String name;

        public Merchant1(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.name = str2;
            this.logoUrl = obj;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant1(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.Object obj = this.logoUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant1 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchant1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchant1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, merchant1.logoUrl);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1(id, name2, logoUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant1, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = merchant1.id;
            }
            if ((i & 2) != 0) {
                str2 = merchant1.name;
            }
            if ((i & 4) != 0) {
                obj = merchant1.logoUrl;
            }
            return merchant1.copy(str, str2, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetConsumerAgreementsByFundingInstrument($input: ConsumerAgreementsByFundingInstrumentInput!) { consumerAgreementsByFundingInstrument(input: $input) { fundingInstrument { id lastDigits name thumbnailImageUrl type balance { currencyCode value } } consumerAgreements { id type status balancePreference preferredFundingInstrument { id name type lastDigits } balanceFundingInstrument { id type } merchant { merchant { id name logoUrl } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput consumerAgreementsByFundingInstrumentInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetConsumerAgreementsByFundingInstrumentQuery(input=");
        sb.append(consumerAgreementsByFundingInstrumentInput);
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
        return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery) other).input);
    }

    public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery copy(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery getConsumerAgreementsByFundingInstrumentQuery, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput consumerAgreementsByFundingInstrumentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            consumerAgreementsByFundingInstrumentInput = getConsumerAgreementsByFundingInstrumentQuery.input;
        }
        return getConsumerAgreementsByFundingInstrumentQuery.copy(consumerAgreementsByFundingInstrumentInput);
    }
}
