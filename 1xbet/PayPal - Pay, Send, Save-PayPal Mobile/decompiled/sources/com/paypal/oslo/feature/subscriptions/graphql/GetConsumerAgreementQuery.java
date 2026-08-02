package com.paypal.oslo.feature.subscriptions.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f'()*+,-./01&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Data;", "", "id", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Companion", "Data", "ConsumerAgreement", "LastPayment", "Amount", "PreferredFundingInstrument", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, "BalanceFundingInstrument", "Balance1", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "Merchant1", "ContactPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetConsumerAgreementQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "449e1f0dab280ddff0afbf12f655c558102cf9d21445378639b4e086f12e5275";
    public static final java.lang.String OPERATION_NAME = "GetConsumerAgreement";
    private final java.lang.String id;

    public GetConsumerAgreementQuery(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
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
        com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetConsumerAgreementQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.subscriptions.graphql.selections.GetConsumerAgreementQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "consumerAgreement", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "getConsumerAgreement"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement;

        public Data(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreement, "");
            this.consumerAgreement = consumerAgreement;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement getConsumerAgreement() {
            return this.consumerAgreement;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement = this.consumerAgreement;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(consumerAgreement=");
            sb.append(consumerAgreement);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.consumerAgreement.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreement, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data) other).consumerAgreement);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data copy(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreement, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data(consumerAgreement);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement getConsumerAgreement() {
            return this.consumerAgreement;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data data, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                consumerAgreement = data.consumerAgreement;
            }
            return data.copy(consumerAgreement);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0088\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010*R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "type", "billingAgreementStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "balancePreference", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementManagementType;", "managementType", "startedTime", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;", "lastPayment", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;", "preferredFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;", "balanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;", "merchant", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementManagementType;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementManagementType;", "component7", "()Ljava/lang/Object;", "component8", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;", "component9", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;", "component10", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;", "component11", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementManagementType;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "getType", "getBillingAgreementStatus", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "getBalancePreference", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementManagementType;", "getManagementType", "Ljava/lang/Object;", "getStartedTime", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;", "getLastPayment", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;", "getPreferredFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;", "getBalanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;", "getMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsumerAgreement {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference;
        private final java.lang.String billingAgreementStatus;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType managementType;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant merchant;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument;
        private final java.lang.Object startedTime;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType type;

        public ConsumerAgreement(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType consumerAgreementManagementType, java.lang.Object obj, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementManagementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            this.id = str;
            this.status = consumerAgreementStatus;
            this.type = consumerAgreementType;
            this.billingAgreementStatus = str2;
            this.balancePreference = consumerAgreementBalancePreference;
            this.managementType = consumerAgreementManagementType;
            this.startedTime = obj;
            this.lastPayment = lastPayment;
            this.preferredFundingInstrument = preferredFundingInstrument;
            this.balanceFundingInstrument = balanceFundingInstrument;
            this.merchant = merchant;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType getType() {
            return this.type;
        }

        public final java.lang.String getBillingAgreementStatus() {
            return this.billingAgreementStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference getBalancePreference() {
            return this.balancePreference;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType getManagementType() {
            return this.managementType;
        }

        public final java.lang.Object getStartedTime() {
            return this.startedTime;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment getLastPayment() {
            return this.lastPayment;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument getPreferredFundingInstrument() {
            return this.preferredFundingInstrument;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument getBalanceFundingInstrument() {
            return this.balanceFundingInstrument;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant getMerchant() {
            return this.merchant;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus consumerAgreementStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType = this.type;
            java.lang.String str2 = this.billingAgreementStatus;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = this.balancePreference;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType consumerAgreementManagementType = this.managementType;
            java.lang.Object obj = this.startedTime;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment = this.lastPayment;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument = this.preferredFundingInstrument;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument = this.balanceFundingInstrument;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant merchant = this.merchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerAgreement(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(consumerAgreementStatus);
            sb.append(", type=");
            sb.append(consumerAgreementType);
            sb.append(", billingAgreementStatus=");
            sb.append(str2);
            sb.append(", balancePreference=");
            sb.append(consumerAgreementBalancePreference);
            sb.append(", managementType=");
            sb.append(consumerAgreementManagementType);
            sb.append(", startedTime=");
            sb.append(obj);
            sb.append(", lastPayment=");
            sb.append(lastPayment);
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
            int hashCode2 = this.status.hashCode();
            int hashCode3 = this.type.hashCode();
            int hashCode4 = this.billingAgreementStatus.hashCode();
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference consumerAgreementBalancePreference = this.balancePreference;
            int hashCode5 = consumerAgreementBalancePreference == null ? 0 : consumerAgreementBalancePreference.hashCode();
            int hashCode6 = this.managementType.hashCode();
            java.lang.Object obj = this.startedTime;
            int hashCode7 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment = this.lastPayment;
            int hashCode8 = lastPayment == null ? 0 : lastPayment.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument = this.preferredFundingInstrument;
            int hashCode9 = preferredFundingInstrument == null ? 0 : preferredFundingInstrument.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument = this.balanceFundingInstrument;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (balanceFundingInstrument != null ? balanceFundingInstrument.hashCode() : 0)) * 31) + this.merchant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, consumerAgreement.id) && this.status == consumerAgreement.status && this.type == consumerAgreement.type && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAgreementStatus, consumerAgreement.billingAgreementStatus) && this.balancePreference == consumerAgreement.balancePreference && this.managementType == consumerAgreement.managementType && kotlin.jvm.internal.Intrinsics.areEqual(this.startedTime, consumerAgreement.startedTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastPayment, consumerAgreement.lastPayment) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, consumerAgreement.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, consumerAgreement.balanceFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, consumerAgreement.merchant);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus status, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType type, java.lang.String billingAgreementStatus, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType managementType, java.lang.Object startedTime, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant merchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAgreementStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(managementType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement(id, status, type, billingAgreementStatus, balancePreference, managementType, startedTime, lastPayment, preferredFundingInstrument, balanceFundingInstrument, merchant);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument getPreferredFundingInstrument() {
            return this.preferredFundingInstrument;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment getLastPayment() {
            return this.lastPayment;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getStartedTime() {
            return this.startedTime;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType getManagementType() {
            return this.managementType;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference getBalancePreference() {
            return this.balancePreference;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBillingAgreementStatus() {
            return this.billingAgreementStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus getStatus() {
            return this.status;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant getMerchant() {
            return this.merchant;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument getBalanceFundingInstrument() {
            return this.balanceFundingInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;", "", "paymentTime", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;", "amount", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$LastPayment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPaymentTime", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LastPayment {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount;
        private final java.lang.Object paymentTime;

        public LastPayment(java.lang.Object obj, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.paymentTime = obj;
            this.amount = amount;
        }

        public final java.lang.Object getPaymentTime() {
            return this.paymentTime;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.paymentTime;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LastPayment(paymentTime=");
            sb.append(obj);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.paymentTime.hashCode() * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTime, lastPayment.paymentTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, lastPayment.amount);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment copy(java.lang.Object paymentTime, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment(paymentTime, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPaymentTime() {
            return this.paymentTime;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.LastPayment lastPayment, java.lang.Object obj, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = lastPayment.paymentTime;
            }
            if ((i & 2) != 0) {
                amount = lastPayment.amount;
            }
            return lastPayment.copy(obj, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Amount amount, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = amount.value;
            }
            if ((i & 2) != 0) {
                obj = amount.currencyCode;
            }
            return amount.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J^\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "name", "lastDigits", "primaryImageUrl", "thumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;", "balance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component3", "component4", "component5", "()Ljava/lang/Object;", "component6", "component7", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$PreferredFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "getName", "getLastDigits", "Ljava/lang/Object;", "getPrimaryImageUrl", "getThumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PreferredFundingInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance;
        private final java.lang.String id;
        private final java.lang.String lastDigits;
        private final java.lang.String name;
        private final java.lang.Object primaryImageUrl;
        private final java.lang.Object thumbnailImageUrl;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public PreferredFundingInstrument(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.type = fundingInstrumentType;
            this.name = str2;
            this.lastDigits = str3;
            this.primaryImageUrl = obj;
            this.thumbnailImageUrl = obj2;
            this.balance = balance;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance getBalance() {
            return this.balance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.lastDigits;
            java.lang.Object obj = this.primaryImageUrl;
            java.lang.Object obj2 = this.thumbnailImageUrl;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance = this.balance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PreferredFundingInstrument(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", lastDigits=");
            sb.append(str3);
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
            int hashCode2 = this.type.hashCode();
            int hashCode3 = this.name.hashCode();
            java.lang.String str = this.lastDigits;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.thumbnailImageUrl;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance = this.balance;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (balance != null ? balance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, preferredFundingInstrument.id) && this.type == preferredFundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, preferredFundingInstrument.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, preferredFundingInstrument.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, preferredFundingInstrument.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImageUrl, preferredFundingInstrument.thumbnailImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, preferredFundingInstrument.balance);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.String name2, java.lang.String lastDigits, java.lang.Object primaryImageUrl, java.lang.Object thumbnailImageUrl, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument(id, type, name2, lastDigits, primaryImageUrl, thumbnailImageUrl, balance);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance getBalance() {
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
        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = preferredFundingInstrument.id;
            }
            if ((i & 2) != 0) {
                fundingInstrumentType = preferredFundingInstrument.type;
            }
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
            if ((i & 4) != 0) {
                str2 = preferredFundingInstrument.name;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = preferredFundingInstrument.lastDigits;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                obj = preferredFundingInstrument.primaryImageUrl;
            }
            java.lang.Object obj4 = obj;
            if ((i & 32) != 0) {
                obj2 = preferredFundingInstrument.thumbnailImageUrl;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 64) != 0) {
                balance = preferredFundingInstrument.balance;
            }
            return preferredFundingInstrument.copy(str, fundingInstrumentType2, str4, str5, obj4, obj5, balance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balance {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Balance(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, balance.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balance.currencyCode);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = balance.value;
            }
            if ((i & 2) != 0) {
                obj = balance.currencyCode;
            }
            return balance.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J^\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "name", "lastDigits", "primaryImageUrl", "thumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;", "balance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component3", "component4", "component5", "()Ljava/lang/Object;", "component6", "component7", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$BalanceFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "getName", "getLastDigits", "Ljava/lang/Object;", "getPrimaryImageUrl", "getThumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceFundingInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance;
        private final java.lang.String id;
        private final java.lang.String lastDigits;
        private final java.lang.String name;
        private final java.lang.Object primaryImageUrl;
        private final java.lang.Object thumbnailImageUrl;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public BalanceFundingInstrument(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.type = fundingInstrumentType;
            this.name = str2;
            this.lastDigits = str3;
            this.primaryImageUrl = obj;
            this.thumbnailImageUrl = obj2;
            this.balance = balance1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.lang.Object getThumbnailImageUrl() {
            return this.thumbnailImageUrl;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 getBalance() {
            return this.balance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.lastDigits;
            java.lang.Object obj = this.primaryImageUrl;
            java.lang.Object obj2 = this.thumbnailImageUrl;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance1 = this.balance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceFundingInstrument(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", lastDigits=");
            sb.append(str3);
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
            int hashCode2 = this.type.hashCode();
            int hashCode3 = this.name.hashCode();
            java.lang.String str = this.lastDigits;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.thumbnailImageUrl;
            int hashCode6 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance1 = this.balance;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (balance1 != null ? balance1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, balanceFundingInstrument.id) && this.type == balanceFundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, balanceFundingInstrument.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, balanceFundingInstrument.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, balanceFundingInstrument.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImageUrl, balanceFundingInstrument.thumbnailImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, balanceFundingInstrument.balance);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.String name2, java.lang.String lastDigits, java.lang.Object primaryImageUrl, java.lang.Object thumbnailImageUrl, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument(id, type, name2, lastDigits, primaryImageUrl, thumbnailImageUrl, balance);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 getBalance() {
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
        public final java.lang.String getLastDigits() {
            return this.lastDigits;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance1, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = balanceFundingInstrument.id;
            }
            if ((i & 2) != 0) {
                fundingInstrumentType = balanceFundingInstrument.type;
            }
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
            if ((i & 4) != 0) {
                str2 = balanceFundingInstrument.name;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = balanceFundingInstrument.lastDigits;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                obj = balanceFundingInstrument.primaryImageUrl;
            }
            java.lang.Object obj4 = obj;
            if ((i & 32) != 0) {
                obj2 = balanceFundingInstrument.thumbnailImageUrl;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 64) != 0) {
                balance1 = balanceFundingInstrument.balance;
            }
            return balanceFundingInstrument.copy(str, fundingInstrumentType2, str4, str5, obj4, obj5, balance1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Balance1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balance1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Balance1(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance1(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance1 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, balance1.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balance1.currencyCode);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance1, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = balance1.value;
            }
            if ((i & 2) != 0) {
                obj = balance1.currencyCode;
            }
            return balance1.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;", "merchant", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;", "getMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant;

        public Merchant(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant1) {
            this.merchant = merchant1;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 getMerchant() {
            return this.merchant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant1 = this.merchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(merchant=");
            sb.append(merchant1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant1 = this.merchant;
            if (merchant1 == null) {
                return 0;
            }
            return merchant1.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant) other).merchant);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant copy(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant) {
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant(merchant);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 getMerchant() {
            return this.merchant;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant merchant, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchant1 = merchant.merchant;
            }
            return merchant.copy(merchant1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JT\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;", "", "", "id", "name", "logoUrl", "websiteUrl", "contactEmail", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;", "contactPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Merchant1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl", "getWebsiteUrl", "getContactEmail", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;", "getContactPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant1 {
        public static final int $stable = 8;
        private final java.lang.Object contactEmail;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone;
        private final java.lang.String id;
        private final java.lang.Object logoUrl;
        private final java.lang.String name;
        private final java.lang.Object websiteUrl;

        public Merchant1(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.name = str2;
            this.logoUrl = obj;
            this.websiteUrl = obj2;
            this.contactEmail = obj3;
            this.contactPhone = contactPhone;
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

        public final java.lang.Object getWebsiteUrl() {
            return this.websiteUrl;
        }

        public final java.lang.Object getContactEmail() {
            return this.contactEmail;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone getContactPhone() {
            return this.contactPhone;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoUrl;
            java.lang.Object obj2 = this.websiteUrl;
            java.lang.Object obj3 = this.contactEmail;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone = this.contactPhone;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant1(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", websiteUrl=");
            sb.append(obj2);
            sb.append(", contactEmail=");
            sb.append(obj3);
            sb.append(", contactPhone=");
            sb.append(contactPhone);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.Object obj = this.logoUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.websiteUrl;
            int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.contactEmail;
            int hashCode5 = obj3 == null ? 0 : obj3.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone = this.contactPhone;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (contactPhone != null ? contactPhone.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant1 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchant1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchant1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, merchant1.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.websiteUrl, merchant1.websiteUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactEmail, merchant1.contactEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactPhone, merchant1.contactPhone);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl, java.lang.Object websiteUrl, java.lang.Object contactEmail, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1(id, name2, logoUrl, websiteUrl, contactEmail, contactPhone);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone getContactPhone() {
            return this.contactPhone;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getContactEmail() {
            return this.contactEmail;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getWebsiteUrl() {
            return this.websiteUrl;
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

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant1, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone, int i, java.lang.Object obj4) {
            if ((i & 1) != 0) {
                str = merchant1.id;
            }
            if ((i & 2) != 0) {
                str2 = merchant1.name;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                obj = merchant1.logoUrl;
            }
            java.lang.Object obj5 = obj;
            if ((i & 8) != 0) {
                obj2 = merchant1.websiteUrl;
            }
            java.lang.Object obj6 = obj2;
            if ((i & 16) != 0) {
                obj3 = merchant1.contactEmail;
            }
            java.lang.Object obj7 = obj3;
            if ((i & 32) != 0) {
                contactPhone = merchant1.contactPhone;
            }
            return merchant1.copy(str, str3, obj5, obj6, obj7, contactPhone);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;", "", "", "countryCode", "extensionNumber", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ContactPhone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getExtensionNumber", "getNationalNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactPhone {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String extensionNumber;
        private final java.lang.String nationalNumber;

        public ContactPhone(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.countryCode = str;
            this.extensionNumber = str2;
            this.nationalNumber = str3;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getExtensionNumber() {
            return this.extensionNumber;
        }

        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            java.lang.String str2 = this.extensionNumber;
            java.lang.String str3 = this.nationalNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactPhone(countryCode=");
            sb.append(str);
            sb.append(", extensionNumber=");
            sb.append(str2);
            sb.append(", nationalNumber=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.countryCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.extensionNumber;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.nationalNumber;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, contactPhone.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensionNumber, contactPhone.extensionNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, contactPhone.nationalNumber);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone copy(java.lang.String countryCode, java.lang.String extensionNumber, java.lang.String nationalNumber) {
            return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone(countryCode, extensionNumber, nationalNumber);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExtensionNumber() {
            return this.extensionNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ContactPhone contactPhone, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contactPhone.countryCode;
            }
            if ((i & 2) != 0) {
                str2 = contactPhone.extensionNumber;
            }
            if ((i & 4) != 0) {
                str3 = contactPhone.nationalNumber;
            }
            return contactPhone.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetConsumerAgreement($id: ID!) { consumerAgreement(id: $id) { id status type billingAgreementStatus balancePreference managementType startedTime lastPayment { paymentTime amount { value currencyCode } } preferredFundingInstrument { id type name lastDigits primaryImageUrl thumbnailImageUrl balance { value currencyCode } } balanceFundingInstrument { id type name lastDigits primaryImageUrl thumbnailImageUrl balance { value currencyCode } } merchant { merchant { id name logoUrl websiteUrl contactEmail contactPhone { countryCode extensionNumber nationalNumber } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetConsumerAgreementQuery(id=");
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
        return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery) other).id);
    }

    public final com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery getConsumerAgreementQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getConsumerAgreementQuery.id;
        }
        return getConsumerAgreementQuery.copy(str);
    }
}
