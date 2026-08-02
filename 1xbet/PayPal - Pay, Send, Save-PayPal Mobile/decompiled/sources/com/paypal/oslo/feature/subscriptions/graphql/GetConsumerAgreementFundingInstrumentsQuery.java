package com.paypal.oslo.feature.subscriptions.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b*+,-./0)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementFundingInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementFundingInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementFundingInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementFundingInstrumentsInput;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementFundingInstrumentsInput;", "getInput", "Companion", "Data", "ConsumerAgreementFundingInstruments", "PreferredFundingInstrument", "BalanceFundingInstrument", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "FundingInstrument", "Balance1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetConsumerAgreementFundingInstrumentsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "6c9b5c738794e15d1454d2c8e8a54eda2c9412f913e13f950716fc19c91b00c6";
    public static final java.lang.String OPERATION_NAME = "GetConsumerAgreementFundingInstruments";
    private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Companion(null);
    public static final int $stable = 8;

    public GetConsumerAgreementFundingInstrumentsQuery(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput consumerAgreementFundingInstrumentsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementFundingInstrumentsInput, "");
        this.input = consumerAgreementFundingInstrumentsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput getInput() {
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
        com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementFundingInstrumentsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementFundingInstrumentsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.subscriptions.graphql.selections.GetConsumerAgreementFundingInstrumentsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;", "consumerAgreementFundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;", "getConsumerAgreementFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments;

        public Data(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementFundingInstruments, "");
            this.consumerAgreementFundingInstruments = consumerAgreementFundingInstruments;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments getConsumerAgreementFundingInstruments() {
            return this.consumerAgreementFundingInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments = this.consumerAgreementFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(consumerAgreementFundingInstruments=");
            sb.append(consumerAgreementFundingInstruments);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.consumerAgreementFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreementFundingInstruments, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data) other).consumerAgreementFundingInstruments);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data copy(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementFundingInstruments, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data(consumerAgreementFundingInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments getConsumerAgreementFundingInstruments() {
            return this.consumerAgreementFundingInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data data, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                consumerAgreementFundingInstruments = data.consumerAgreementFundingInstruments;
            }
            return data.copy(consumerAgreementFundingInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "balancePreference", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$PreferredFundingInstrument;", "preferredFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$BalanceFundingInstrument;", "balanceFundingInstrument", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$FundingInstrument;", "fundingInstruments", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$PreferredFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$BalanceFundingInstrument;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$PreferredFundingInstrument;", "component3", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$BalanceFundingInstrument;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$PreferredFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$BalanceFundingInstrument;Ljava/util/List;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "getBalancePreference", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$PreferredFundingInstrument;", "getPreferredFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$BalanceFundingInstrument;", "getBalanceFundingInstrument", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsumerAgreementFundingInstruments {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument> fundingInstruments;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument;

        public ConsumerAgreementFundingInstruments(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.balancePreference = consumerAgreementBalancePreference;
            this.preferredFundingInstrument = preferredFundingInstrument;
            this.balanceFundingInstrument = balanceFundingInstrument;
            this.fundingInstruments = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference getBalancePreference() {
            return this.balancePreference;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument getPreferredFundingInstrument() {
            return this.preferredFundingInstrument;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument getBalanceFundingInstrument() {
            return this.balanceFundingInstrument;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = this.balancePreference;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument = this.preferredFundingInstrument;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument = this.balanceFundingInstrument;
            java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument> list = this.fundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerAgreementFundingInstruments(balancePreference=");
            sb.append(consumerAgreementBalancePreference);
            sb.append(", preferredFundingInstrument=");
            sb.append(preferredFundingInstrument);
            sb.append(", balanceFundingInstrument=");
            sb.append(balanceFundingInstrument);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = this.balancePreference;
            int hashCode = consumerAgreementBalancePreference == null ? 0 : consumerAgreementBalancePreference.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument = this.preferredFundingInstrument;
            int hashCode2 = preferredFundingInstrument == null ? 0 : preferredFundingInstrument.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument = this.balanceFundingInstrument;
            return (((((hashCode * 31) + hashCode2) * 31) + (balanceFundingInstrument != null ? balanceFundingInstrument.hashCode() : 0)) * 31) + this.fundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments) other;
            return this.balancePreference == consumerAgreementFundingInstruments.balancePreference && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, consumerAgreementFundingInstruments.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, consumerAgreementFundingInstruments.balanceFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, consumerAgreementFundingInstruments.fundingInstruments);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments copy(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument> fundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments(balancePreference, preferredFundingInstrument, balanceFundingInstrument, fundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument> component4() {
            return this.fundingInstruments;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument getBalanceFundingInstrument() {
            return this.balanceFundingInstrument;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument getPreferredFundingInstrument() {
            return this.preferredFundingInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference getBalancePreference() {
            return this.balancePreference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                consumerAgreementBalancePreference = consumerAgreementFundingInstruments.balancePreference;
            }
            if ((i & 2) != 0) {
                preferredFundingInstrument = consumerAgreementFundingInstruments.preferredFundingInstrument;
            }
            if ((i & 4) != 0) {
                balanceFundingInstrument = consumerAgreementFundingInstruments.balanceFundingInstrument;
            }
            if ((i & 8) != 0) {
                list = consumerAgreementFundingInstruments.fundingInstruments;
            }
            return consumerAgreementFundingInstruments.copy(consumerAgreementBalancePreference, preferredFundingInstrument, balanceFundingInstrument, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$PreferredFundingInstrument;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$PreferredFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PreferredFundingInstrument {
        public static final int $stable = 0;
        private final java.lang.String id;

        public PreferredFundingInstrument(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PreferredFundingInstrument(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument) other).id);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = preferredFundingInstrument.id;
            }
            return preferredFundingInstrument.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JR\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$BalanceFundingInstrument;", "", "", "id", "name", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "primaryImageUrl", "thumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance;", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component4", "()Ljava/lang/Object;", "component5", "component6", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$BalanceFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "Ljava/lang/Object;", "getPrimaryImageUrl", "getThumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance;", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceFundingInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance;
        private final java.lang.String id;
        private final java.lang.String name;
        private final java.lang.Object primaryImageUrl;
        private final java.lang.Object thumbnailImageUrl;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public BalanceFundingInstrument(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.id = str;
            this.name = str2;
            this.type = fundingInstrumentType;
            this.primaryImageUrl = obj;
            this.thumbnailImageUrl = obj2;
            this.balance = balance;
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

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance getBalance() {
            return this.balance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.Object obj = this.primaryImageUrl;
            java.lang.Object obj2 = this.thumbnailImageUrl;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance = this.balance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceFundingInstrument(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", primaryImageUrl=");
            sb.append(obj);
            sb.append(", thumbnailImageUrl=");
            sb.append(obj2);
            sb.append(", balance=");
            sb.append(balance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            int hashCode3 = this.type.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.thumbnailImageUrl;
            int hashCode5 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance = this.balance;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (balance != null ? balance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, balanceFundingInstrument.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, balanceFundingInstrument.name) && this.type == balanceFundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, balanceFundingInstrument.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImageUrl, balanceFundingInstrument.thumbnailImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, balanceFundingInstrument.balance);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument copy(java.lang.String id, java.lang.String name2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.Object primaryImageUrl, java.lang.Object thumbnailImageUrl, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument(id, name2, type, primaryImageUrl, thumbnailImageUrl, balance);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance getBalance() {
            return this.balance;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
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

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = balanceFundingInstrument.id;
            }
            if ((i & 2) != 0) {
                str2 = balanceFundingInstrument.name;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                fundingInstrumentType = balanceFundingInstrument.type;
            }
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
            if ((i & 8) != 0) {
                obj = balanceFundingInstrument.primaryImageUrl;
            }
            java.lang.Object obj4 = obj;
            if ((i & 16) != 0) {
                obj2 = balanceFundingInstrument.thumbnailImageUrl;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 32) != 0) {
                balance = balanceFundingInstrument.balance;
            }
            return balanceFundingInstrument.copy(str, str3, fundingInstrumentType2, obj4, obj5, balance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balance.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, balance.value);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = balance.currencyCode;
            }
            if ((i & 2) != 0) {
                str = balance.value;
            }
            return balance.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J^\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$FundingInstrument;", "", "", "id", "name", "lastDigits", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "primaryImageUrl", "thumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance1;", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component5", "()Ljava/lang/Object;", "component6", "component7", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance1;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$FundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getLastDigits", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "Ljava/lang/Object;", "getPrimaryImageUrl", "getThumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance1;", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance;
        private final java.lang.String id;
        private final java.lang.String lastDigits;
        private final java.lang.String name;
        private final java.lang.Object primaryImageUrl;
        private final java.lang.Object thumbnailImageUrl;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public FundingInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.id = str;
            this.name = str2;
            this.lastDigits = str3;
            this.type = fundingInstrumentType;
            this.primaryImageUrl = obj;
            this.thumbnailImageUrl = obj2;
            this.balance = balance1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 getBalance() {
            return this.balance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.lastDigits;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.Object obj = this.primaryImageUrl;
            java.lang.Object obj2 = this.thumbnailImageUrl;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance1 = this.balance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrument(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", lastDigits=");
            sb.append(str3);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", primaryImageUrl=");
            sb.append(obj);
            sb.append(", thumbnailImageUrl=");
            sb.append(obj2);
            sb.append(", balance=");
            sb.append(balance1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.String str = this.lastDigits;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.type.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.thumbnailImageUrl;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance1 = this.balance;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (balance1 != null ? balance1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingInstrument.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrument.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, fundingInstrument.lastDigits) && this.type == fundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, fundingInstrument.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImageUrl, fundingInstrument.thumbnailImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, fundingInstrument.balance);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument copy(java.lang.String id, java.lang.String name2, java.lang.String lastDigits, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.Object primaryImageUrl, java.lang.Object thumbnailImageUrl, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument(id, name2, lastDigits, type, primaryImageUrl, thumbnailImageUrl, balance);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 getBalance() {
            return this.balance;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument fundingInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance1, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = fundingInstrument.id;
            }
            if ((i & 2) != 0) {
                str2 = fundingInstrument.name;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = fundingInstrument.lastDigits;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                fundingInstrumentType = fundingInstrument.type;
            }
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
            if ((i & 16) != 0) {
                obj = fundingInstrument.primaryImageUrl;
            }
            java.lang.Object obj4 = obj;
            if ((i & 32) != 0) {
                obj2 = fundingInstrument.thumbnailImageUrl;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 64) != 0) {
                balance1 = fundingInstrument.balance;
            }
            return fundingInstrument.copy(str, str4, str5, fundingInstrumentType2, obj4, obj5, balance1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Balance1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balance1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Balance1(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance1(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance1 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balance1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, balance1.value);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = balance1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = balance1.value;
            }
            return balance1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetConsumerAgreementFundingInstruments($input: ConsumerAgreementFundingInstrumentsInput!) { consumerAgreementFundingInstruments(input: $input) { balancePreference preferredFundingInstrument { id } balanceFundingInstrument { id name type primaryImageUrl thumbnailImageUrl balance { currencyCode value } } fundingInstruments { id name lastDigits type primaryImageUrl thumbnailImageUrl balance { currencyCode value } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput consumerAgreementFundingInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetConsumerAgreementFundingInstrumentsQuery(input=");
        sb.append(consumerAgreementFundingInstrumentsInput);
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
        return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery) other).input);
    }

    public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery copy(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery getConsumerAgreementFundingInstrumentsQuery, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput consumerAgreementFundingInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            consumerAgreementFundingInstrumentsInput = getConsumerAgreementFundingInstrumentsQuery.input;
        }
        return getConsumerAgreementFundingInstrumentsQuery.copy(consumerAgreementFundingInstrumentsInput);
    }
}
