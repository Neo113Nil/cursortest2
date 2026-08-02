package com.paypal.oslo.feature.revolvingcreditservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0015*+,-./0123456789:;<=)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Companion", "Data", "RevolvingCreditPaymentConstraint", "OnRevolvingCreditOneTimePaymentConstraints", "PaymentAmountOption", "Amount", "RevolvingCreditPayment", "RevolvingCreditAccount", "Product", "Capabilities", "RevolvingCreditAutopay", "RevolvingCreditEligiblePaymentFundingInstrument", "OnRevolvingCreditPaymentFundingInstrumentBalance", "Art", "Amount1", "OnRevolvingCreditPaymentFundingInstrumentBank", "Art1", "OnRevolvingCreditPaymentFundingInstrumentCard", "Art2", "RevolvingCreditServicingContent", "Payments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetRevolvingCreditPaymentOptionsOverviewQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "63c493ae954953e1d3bd5b88d19d5ebfd195c7499f7cb70b18cb06dce3f68b8a";
    public static final java.lang.String OPERATION_NAME = "GetRevolvingCreditPaymentOptionsOverview";
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;

    public GetRevolvingCreditPaymentOptionsOverviewQuery(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditPaymentOptionsOverviewQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditPaymentOptionsOverviewQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetRevolvingCreditPaymentOptionsOverviewQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b/\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditPaymentConstraint;", "revolvingCreditPaymentConstraints", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditPayment;", "revolvingCreditPayments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAccount;", "revolvingCreditAccount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAutopay;", "revolvingCreditAutopay", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;", "revolvingCreditEligiblePaymentFundingInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditServicingContent;", "revolvingCreditServicingContent", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAccount;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAutopay;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditServicingContent;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAccount;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAutopay;", "component5", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditServicingContent;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAccount;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAutopay;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditServicingContent;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRevolvingCreditPaymentConstraints", "getRevolvingCreditPayments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAccount;", "getRevolvingCreditAccount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAutopay;", "getRevolvingCreditAutopay", "getRevolvingCreditEligiblePaymentFundingInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditServicingContent;", "getRevolvingCreditServicingContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> revolvingCreditEligiblePaymentFundingInstruments;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> revolvingCreditPaymentConstraints;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent;

        public Data(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> list2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> list3, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent) {
            this.revolvingCreditPaymentConstraints = list;
            this.revolvingCreditPayments = list2;
            this.revolvingCreditAccount = revolvingCreditAccount;
            this.revolvingCreditAutopay = revolvingCreditAutopay;
            this.revolvingCreditEligiblePaymentFundingInstruments = list3;
            this.revolvingCreditServicingContent = revolvingCreditServicingContent;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> getRevolvingCreditPaymentConstraints() {
            return this.revolvingCreditPaymentConstraints;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> getRevolvingCreditPayments() {
            return this.revolvingCreditPayments;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount getRevolvingCreditAccount() {
            return this.revolvingCreditAccount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay getRevolvingCreditAutopay() {
            return this.revolvingCreditAutopay;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> getRevolvingCreditEligiblePaymentFundingInstruments() {
            return this.revolvingCreditEligiblePaymentFundingInstruments;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent getRevolvingCreditServicingContent() {
            return this.revolvingCreditServicingContent;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> list = this.revolvingCreditPaymentConstraints;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> list2 = this.revolvingCreditPayments;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = this.revolvingCreditAccount;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = this.revolvingCreditAutopay;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> list3 = this.revolvingCreditEligiblePaymentFundingInstruments;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = this.revolvingCreditServicingContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(revolvingCreditPaymentConstraints=");
            sb.append(list);
            sb.append(", revolvingCreditPayments=");
            sb.append(list2);
            sb.append(", revolvingCreditAccount=");
            sb.append(revolvingCreditAccount);
            sb.append(", revolvingCreditAutopay=");
            sb.append(revolvingCreditAutopay);
            sb.append(", revolvingCreditEligiblePaymentFundingInstruments=");
            sb.append(list3);
            sb.append(", revolvingCreditServicingContent=");
            sb.append(revolvingCreditServicingContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> list = this.revolvingCreditPaymentConstraints;
            int hashCode = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> list2 = this.revolvingCreditPayments;
            int hashCode2 = list2 == null ? 0 : list2.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = this.revolvingCreditAccount;
            int hashCode3 = revolvingCreditAccount == null ? 0 : revolvingCreditAccount.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = this.revolvingCreditAutopay;
            int hashCode4 = revolvingCreditAutopay == null ? 0 : revolvingCreditAutopay.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> list3 = this.revolvingCreditEligiblePaymentFundingInstruments;
            int hashCode5 = list3 == null ? 0 : list3.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = this.revolvingCreditServicingContent;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (revolvingCreditServicingContent != null ? revolvingCreditServicingContent.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data data = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPaymentConstraints, data.revolvingCreditPaymentConstraints) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPayments, data.revolvingCreditPayments) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAccount, data.revolvingCreditAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAutopay, data.revolvingCreditAutopay) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditEligiblePaymentFundingInstruments, data.revolvingCreditEligiblePaymentFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingContent, data.revolvingCreditServicingContent);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> revolvingCreditPaymentConstraints, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> revolvingCreditEligiblePaymentFundingInstruments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data(revolvingCreditPaymentConstraints, revolvingCreditPayments, revolvingCreditAccount, revolvingCreditAutopay, revolvingCreditEligiblePaymentFundingInstruments, revolvingCreditServicingContent);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent getRevolvingCreditServicingContent() {
            return this.revolvingCreditServicingContent;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> component5() {
            return this.revolvingCreditEligiblePaymentFundingInstruments;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay getRevolvingCreditAutopay() {
            return this.revolvingCreditAutopay;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount getRevolvingCreditAccount() {
            return this.revolvingCreditAccount;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> component2() {
            return this.revolvingCreditPayments;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> component1() {
            return this.revolvingCreditPaymentConstraints;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data data, java.util.List list, java.util.List list2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.util.List list3, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.revolvingCreditPaymentConstraints;
            }
            if ((i & 2) != 0) {
                list2 = data.revolvingCreditPayments;
            }
            java.util.List list4 = list2;
            if ((i & 4) != 0) {
                revolvingCreditAccount = data.revolvingCreditAccount;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount2 = revolvingCreditAccount;
            if ((i & 8) != 0) {
                revolvingCreditAutopay = data.revolvingCreditAutopay;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay2 = revolvingCreditAutopay;
            if ((i & 16) != 0) {
                list3 = data.revolvingCreditEligiblePaymentFundingInstruments;
            }
            java.util.List list5 = list3;
            if ((i & 32) != 0) {
                revolvingCreditServicingContent = data.revolvingCreditServicingContent;
            }
            return data.copy(list, list4, revolvingCreditAccount2, revolvingCreditAutopay2, list5, revolvingCreditServicingContent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditPaymentConstraint;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditOneTimePaymentConstraints;", "onRevolvingCreditOneTimePaymentConstraints", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditOneTimePaymentConstraints;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditOneTimePaymentConstraints;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditOneTimePaymentConstraints;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditPaymentConstraint;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditOneTimePaymentConstraints;", "getOnRevolvingCreditOneTimePaymentConstraints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditPaymentConstraint {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints;

        public RevolvingCreditPaymentConstraint(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRevolvingCreditOneTimePaymentConstraints = onRevolvingCreditOneTimePaymentConstraints;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints getOnRevolvingCreditOneTimePaymentConstraints() {
            return this.onRevolvingCreditOneTimePaymentConstraints;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints = this.onRevolvingCreditOneTimePaymentConstraints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditPaymentConstraint(__typename=");
            sb.append(str);
            sb.append(", onRevolvingCreditOneTimePaymentConstraints=");
            sb.append(onRevolvingCreditOneTimePaymentConstraints);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints = this.onRevolvingCreditOneTimePaymentConstraints;
            return (hashCode * 31) + (onRevolvingCreditOneTimePaymentConstraints == null ? 0 : onRevolvingCreditOneTimePaymentConstraints.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint revolvingCreditPaymentConstraint = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditPaymentConstraint.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditOneTimePaymentConstraints, revolvingCreditPaymentConstraint.onRevolvingCreditOneTimePaymentConstraints);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint(__typename, onRevolvingCreditOneTimePaymentConstraints);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints getOnRevolvingCreditOneTimePaymentConstraints() {
            return this.onRevolvingCreditOneTimePaymentConstraints;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint revolvingCreditPaymentConstraint, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditPaymentConstraint.__typename;
            }
            if ((i & 2) != 0) {
                onRevolvingCreditOneTimePaymentConstraints = revolvingCreditPaymentConstraint.onRevolvingCreditOneTimePaymentConstraints;
            }
            return revolvingCreditPaymentConstraint.copy(str, onRevolvingCreditOneTimePaymentConstraints);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditOneTimePaymentConstraints;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$PaymentAmountOption;", "paymentAmountOptions", "", "maxDaysInFuture", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditOneTimePaymentConstraints;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPaymentAmountOptions", com.visa.cbp.getEncExpo.warmup, "getMaxDaysInFuture"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditOneTimePaymentConstraints {
        public static final int $stable = 8;
        private final int maxDaysInFuture;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption> paymentAmountOptions;

        public OnRevolvingCreditOneTimePaymentConstraints(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption> list, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.paymentAmountOptions = list;
            this.maxDaysInFuture = i;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption> getPaymentAmountOptions() {
            return this.paymentAmountOptions;
        }

        public final int getMaxDaysInFuture() {
            return this.maxDaysInFuture;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption> list = this.paymentAmountOptions;
            int i = this.maxDaysInFuture;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditOneTimePaymentConstraints(paymentAmountOptions=");
            sb.append(list);
            sb.append(", maxDaysInFuture=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.paymentAmountOptions.hashCode() * 31) + java.lang.Integer.hashCode(this.maxDaysInFuture);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAmountOptions, onRevolvingCreditOneTimePaymentConstraints.paymentAmountOptions) && this.maxDaysInFuture == onRevolvingCreditOneTimePaymentConstraints.maxDaysInFuture;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption> paymentAmountOptions, int maxDaysInFuture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAmountOptions, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints(paymentAmountOptions, maxDaysInFuture);
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxDaysInFuture() {
            return this.maxDaysInFuture;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption> component1() {
            return this.paymentAmountOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints, java.util.List list, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = onRevolvingCreditOneTimePaymentConstraints.paymentAmountOptions;
            }
            if ((i2 & 2) != 0) {
                i = onRevolvingCreditOneTimePaymentConstraints.maxDaysInFuture;
            }
            return onRevolvingCreditOneTimePaymentConstraints.copy(list, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$PaymentAmountOption;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount;", "amount", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "type", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$PaymentAmountOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount;", "getAmount", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditOneTimePaymentAmountOptionType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentAmountOption {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType type;

        public PaymentAmountOption(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditOneTimePaymentAmountOptionType, "");
            this.amount = amount;
            this.type = revolvingCreditOneTimePaymentAmountOptionType;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount = this.amount;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentAmountOption(amount=");
            sb.append(amount);
            sb.append(", type=");
            sb.append(revolvingCreditOneTimePaymentAmountOptionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount = this.amount;
            return ((amount == null ? 0 : amount.hashCode()) * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption paymentAmountOption = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, paymentAmountOption.amount) && this.type == paymentAmountOption.type;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption(amount, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption paymentAmountOption, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType revolvingCreditOneTimePaymentAmountOptionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = paymentAmountOption.amount;
            }
            if ((i & 2) != 0) {
                revolvingCreditOneTimePaymentAmountOptionType = paymentAmountOption.type;
            }
            return paymentAmountOption.copy(amount, revolvingCreditOneTimePaymentAmountOptionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "revolvingCreditMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "getRevolvingCreditMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            this.__typename = str;
            this.revolvingCreditMoneyFragment = revolvingCreditMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment = this.revolvingCreditMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditMoneyFragment=");
            sb.append(revolvingCreditMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditMoneyFragment, amount.revolvingCreditMoneyFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount(__typename, revolvingCreditMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditMoneyFragment = amount.revolvingCreditMoneyFragment;
            }
            return amount.copy(str, revolvingCreditMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditPayment;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;", "revolvingCreditPaymentsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditPayment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;", "getRevolvingCreditPaymentsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditPayment {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment;

        public RevolvingCreditPayment(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentsFragment, "");
            this.__typename = str;
            this.revolvingCreditPaymentsFragment = revolvingCreditPaymentsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment getRevolvingCreditPaymentsFragment() {
            return this.revolvingCreditPaymentsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment = this.revolvingCreditPaymentsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditPayment(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditPaymentsFragment=");
            sb.append(revolvingCreditPaymentsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditPaymentsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment revolvingCreditPayment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditPayment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPaymentsFragment, revolvingCreditPayment.revolvingCreditPaymentsFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentsFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment(__typename, revolvingCreditPaymentsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment getRevolvingCreditPaymentsFragment() {
            return this.revolvingCreditPaymentsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment revolvingCreditPayment, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditPayment.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditPaymentsFragment = revolvingCreditPayment.revolvingCreditPaymentsFragment;
            }
            return revolvingCreditPayment.copy(str, revolvingCreditPaymentsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAccount;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Product;", "product", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditBillingFragment;", "revolvingCreditBillingFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Product;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditBillingFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Product;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditBillingFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Product;Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditBillingFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Product;", "getProduct", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditBillingFragment;", "getRevolvingCreditBillingFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditAccount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product product;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment;

        public RevolvingCreditAccount(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product product, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditBillingFragment, "");
            this.__typename = str;
            this.product = product;
            this.creditAccountId = obj;
            this.revolvingCreditBillingFragment = revolvingCreditBillingFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product getProduct() {
            return this.product;
        }

        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment getRevolvingCreditBillingFragment() {
            return this.revolvingCreditBillingFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product product = this.product;
            java.lang.Object obj = this.creditAccountId;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment = this.revolvingCreditBillingFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAccount(__typename=");
            sb.append(str);
            sb.append(", product=");
            sb.append(product);
            sb.append(", creditAccountId=");
            sb.append(obj);
            sb.append(", revolvingCreditBillingFragment=");
            sb.append(revolvingCreditBillingFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product product = this.product;
            return (((((hashCode * 31) + (product == null ? 0 : product.hashCode())) * 31) + this.creditAccountId.hashCode()) * 31) + this.revolvingCreditBillingFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, revolvingCreditAccount.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, revolvingCreditAccount.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditBillingFragment, revolvingCreditAccount.revolvingCreditBillingFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product product, java.lang.Object creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditBillingFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount(__typename, product, creditAccountId, revolvingCreditBillingFragment);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment getRevolvingCreditBillingFragment() {
            return this.revolvingCreditBillingFragment;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product getProduct() {
            return this.product;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product product, java.lang.Object obj, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = revolvingCreditAccount.__typename;
            }
            if ((i & 2) != 0) {
                product = revolvingCreditAccount.product;
            }
            if ((i & 4) != 0) {
                obj = revolvingCreditAccount.creditAccountId;
            }
            if ((i & 8) != 0) {
                revolvingCreditBillingFragment = revolvingCreditAccount.revolvingCreditBillingFragment;
            }
            return revolvingCreditAccount.copy(str, product, obj, revolvingCreditBillingFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Product;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Capabilities;", "capabilities", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Capabilities;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Capabilities;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Capabilities;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Product;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Capabilities;", "getCapabilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities capabilities;

        public Product(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities capabilities) {
            this.capabilities = capabilities;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities getCapabilities() {
            return this.capabilities;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities capabilities = this.capabilities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(capabilities=");
            sb.append(capabilities);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities capabilities = this.capabilities;
            if (capabilities == null) {
                return 0;
            }
            return capabilities.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product) other).capabilities);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities capabilities) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product(capabilities);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities getCapabilities() {
            return this.capabilities;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Product product, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities capabilities, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                capabilities = product.capabilities;
            }
            return product.copy(capabilities);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Capabilities;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentCapability;", "payment", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Capabilities;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPayment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Capabilities {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> payment;

        /* JADX WARN: Multi-variable type inference failed */
        public Capabilities(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> list) {
            this.payment = list;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> getPayment() {
            return this.payment;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> list = this.payment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Capabilities(payment=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> list = this.payment;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.payment, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities) other).payment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> payment) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities(payment);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentCapability> component1() {
            return this.payment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Capabilities capabilities, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = capabilities.payment;
            }
            return capabilities.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAutopay;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;", "revolvingCreditAutopayFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditAutopay;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;", "getRevolvingCreditAutopayFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditAutopay {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment;

        public RevolvingCreditAutopay(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayFragment, "");
            this.__typename = str;
            this.revolvingCreditAutopayFragment = revolvingCreditAutopayFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment getRevolvingCreditAutopayFragment() {
            return this.revolvingCreditAutopayFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment = this.revolvingCreditAutopayFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAutopay(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditAutopayFragment=");
            sb.append(revolvingCreditAutopayFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditAutopayFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditAutopay.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAutopayFragment, revolvingCreditAutopay.revolvingCreditAutopayFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay(__typename, revolvingCreditAutopayFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment getRevolvingCreditAutopayFragment() {
            return this.revolvingCreditAutopayFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditAutopay.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditAutopayFragment = revolvingCreditAutopay.revolvingCreditAutopayFragment;
            }
            return revolvingCreditAutopay.copy(str, revolvingCreditAutopayFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "onRevolvingCreditPaymentFundingInstrumentBalance", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "onRevolvingCreditPaymentFundingInstrumentBank", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "onRevolvingCreditPaymentFundingInstrumentCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "getOnRevolvingCreditPaymentFundingInstrumentBalance", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "getOnRevolvingCreditPaymentFundingInstrumentBank", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "getOnRevolvingCreditPaymentFundingInstrumentCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditEligiblePaymentFundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard;

        public RevolvingCreditEligiblePaymentFundingInstrument(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRevolvingCreditPaymentFundingInstrumentBalance = onRevolvingCreditPaymentFundingInstrumentBalance;
            this.onRevolvingCreditPaymentFundingInstrumentBank = onRevolvingCreditPaymentFundingInstrumentBank;
            this.onRevolvingCreditPaymentFundingInstrumentCard = onRevolvingCreditPaymentFundingInstrumentCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance getOnRevolvingCreditPaymentFundingInstrumentBalance() {
            return this.onRevolvingCreditPaymentFundingInstrumentBalance;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank getOnRevolvingCreditPaymentFundingInstrumentBank() {
            return this.onRevolvingCreditPaymentFundingInstrumentBank;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard getOnRevolvingCreditPaymentFundingInstrumentCard() {
            return this.onRevolvingCreditPaymentFundingInstrumentCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = this.onRevolvingCreditPaymentFundingInstrumentBalance;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = this.onRevolvingCreditPaymentFundingInstrumentBank;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = this.onRevolvingCreditPaymentFundingInstrumentCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditEligiblePaymentFundingInstrument(__typename=");
            sb.append(str);
            sb.append(", onRevolvingCreditPaymentFundingInstrumentBalance=");
            sb.append(onRevolvingCreditPaymentFundingInstrumentBalance);
            sb.append(", onRevolvingCreditPaymentFundingInstrumentBank=");
            sb.append(onRevolvingCreditPaymentFundingInstrumentBank);
            sb.append(", onRevolvingCreditPaymentFundingInstrumentCard=");
            sb.append(onRevolvingCreditPaymentFundingInstrumentCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = this.onRevolvingCreditPaymentFundingInstrumentBalance;
            int hashCode2 = onRevolvingCreditPaymentFundingInstrumentBalance == null ? 0 : onRevolvingCreditPaymentFundingInstrumentBalance.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = this.onRevolvingCreditPaymentFundingInstrumentBank;
            int hashCode3 = onRevolvingCreditPaymentFundingInstrumentBank == null ? 0 : onRevolvingCreditPaymentFundingInstrumentBank.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = this.onRevolvingCreditPaymentFundingInstrumentCard;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onRevolvingCreditPaymentFundingInstrumentCard != null ? onRevolvingCreditPaymentFundingInstrumentCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument revolvingCreditEligiblePaymentFundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditEligiblePaymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPaymentFundingInstrumentBalance, revolvingCreditEligiblePaymentFundingInstrument.onRevolvingCreditPaymentFundingInstrumentBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPaymentFundingInstrumentBank, revolvingCreditEligiblePaymentFundingInstrument.onRevolvingCreditPaymentFundingInstrumentBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPaymentFundingInstrumentCard, revolvingCreditEligiblePaymentFundingInstrument.onRevolvingCreditPaymentFundingInstrumentCard);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument(__typename, onRevolvingCreditPaymentFundingInstrumentBalance, onRevolvingCreditPaymentFundingInstrumentBank, onRevolvingCreditPaymentFundingInstrumentCard);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard getOnRevolvingCreditPaymentFundingInstrumentCard() {
            return this.onRevolvingCreditPaymentFundingInstrumentCard;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank getOnRevolvingCreditPaymentFundingInstrumentBank() {
            return this.onRevolvingCreditPaymentFundingInstrumentBank;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance getOnRevolvingCreditPaymentFundingInstrumentBalance() {
            return this.onRevolvingCreditPaymentFundingInstrumentBalance;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument revolvingCreditEligiblePaymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditEligiblePaymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                onRevolvingCreditPaymentFundingInstrumentBalance = revolvingCreditEligiblePaymentFundingInstrument.onRevolvingCreditPaymentFundingInstrumentBalance;
            }
            if ((i & 4) != 0) {
                onRevolvingCreditPaymentFundingInstrumentBank = revolvingCreditEligiblePaymentFundingInstrument.onRevolvingCreditPaymentFundingInstrumentBank;
            }
            if ((i & 8) != 0) {
                onRevolvingCreditPaymentFundingInstrumentCard = revolvingCreditEligiblePaymentFundingInstrument.onRevolvingCreditPaymentFundingInstrumentCard;
            }
            return revolvingCreditEligiblePaymentFundingInstrument.copy(str, onRevolvingCreditPaymentFundingInstrumentBalance, onRevolvingCreditPaymentFundingInstrumentBank, onRevolvingCreditPaymentFundingInstrumentCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "", "", "id", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art;", "art", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount1;", "amount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount1;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art;", "getArt", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount1;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPaymentFundingInstrumentBalance {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art;
        private final java.lang.String id;

        public OnRevolvingCreditPaymentFundingInstrumentBalance(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.art = art;
            this.amount = amount1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art getArt() {
            return this.art;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art = this.art;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount1 = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPaymentFundingInstrumentBalance(id=");
            sb.append(str);
            sb.append(", art=");
            sb.append(art);
            sb.append(", amount=");
            sb.append(amount1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art = this.art;
            int hashCode2 = art == null ? 0 : art.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount1 = this.amount;
            return (((hashCode * 31) + hashCode2) * 31) + (amount1 != null ? amount1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRevolvingCreditPaymentFundingInstrumentBalance.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.art, onRevolvingCreditPaymentFundingInstrumentBalance.art) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, onRevolvingCreditPaymentFundingInstrumentBalance.amount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance copy(java.lang.String id, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance(id, art, amount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art getArt() {
            return this.art;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onRevolvingCreditPaymentFundingInstrumentBalance.id;
            }
            if ((i & 2) != 0) {
                art = onRevolvingCreditPaymentFundingInstrumentBalance.art;
            }
            if ((i & 4) != 0) {
                amount1 = onRevolvingCreditPaymentFundingInstrumentBalance.amount;
            }
            return onRevolvingCreditPaymentFundingInstrumentBalance.copy(str, art, amount1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "revolvingCreditImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "getRevolvingCreditImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Art {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;

        public Art(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            this.__typename = str;
            this.revolvingCreditImageFragment = revolvingCreditImageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment = this.revolvingCreditImageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Art(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditImageFragment=");
            sb.append(revolvingCreditImageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditImageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, art.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditImageFragment, art.revolvingCreditImageFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art(__typename, revolvingCreditImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = art.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditImageFragment = art.revolvingCreditImageFragment;
            }
            return art.copy(str, revolvingCreditImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount1;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "revolvingCreditMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Amount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "getRevolvingCreditMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;

        public Amount1(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            this.__typename = str;
            this.revolvingCreditMoneyFragment = revolvingCreditMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment = this.revolvingCreditMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount1(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditMoneyFragment=");
            sb.append(revolvingCreditMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount1 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditMoneyFragment, amount1.revolvingCreditMoneyFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1(__typename, revolvingCreditMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount1, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount1.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditMoneyFragment = amount1.revolvingCreditMoneyFragment;
            }
            return amount1.copy(str, revolvingCreditMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "bankLastNChars", "name", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art1;", "art", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component3", "()Ljava/lang/Object;", "component4", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art1;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "Ljava/lang/Object;", "getBankLastNChars", "getName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art1;", "getArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPaymentFundingInstrumentBank {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art;
        private final java.lang.Object bankLastNChars;
        private final java.lang.String id;
        private final java.lang.String name;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public OnRevolvingCreditPaymentFundingInstrumentBank(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.type = bankAccountType;
            this.bankLastNChars = obj;
            this.name = str2;
            this.art = art1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.lang.Object getBankLastNChars() {
            return this.bankLastNChars;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 getArt() {
            return this.art;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.lang.Object obj = this.bankLastNChars;
            java.lang.String str2 = this.name;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art1 = this.art;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPaymentFundingInstrumentBank(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", bankLastNChars=");
            sb.append(obj);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", art=");
            sb.append(art1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            int hashCode2 = bankAccountType == null ? 0 : bankAccountType.hashCode();
            java.lang.Object obj = this.bankLastNChars;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.name;
            int hashCode4 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art1 = this.art;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (art1 != null ? art1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRevolvingCreditPaymentFundingInstrumentBank.id) && this.type == onRevolvingCreditPaymentFundingInstrumentBank.type && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLastNChars, onRevolvingCreditPaymentFundingInstrumentBank.bankLastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, onRevolvingCreditPaymentFundingInstrumentBank.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.art, onRevolvingCreditPaymentFundingInstrumentBank.art);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.lang.Object bankLastNChars, java.lang.String name2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank(id, type, bankLastNChars, name2, art);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 getArt() {
            return this.art;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getBankLastNChars() {
            return this.bankLastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art1, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onRevolvingCreditPaymentFundingInstrumentBank.id;
            }
            if ((i & 2) != 0) {
                bankAccountType = onRevolvingCreditPaymentFundingInstrumentBank.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 4) != 0) {
                obj = onRevolvingCreditPaymentFundingInstrumentBank.bankLastNChars;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                str2 = onRevolvingCreditPaymentFundingInstrumentBank.name;
            }
            java.lang.String str3 = str2;
            if ((i & 16) != 0) {
                art1 = onRevolvingCreditPaymentFundingInstrumentBank.art;
            }
            return onRevolvingCreditPaymentFundingInstrumentBank.copy(str, bankAccountType2, obj3, str3, art1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art1;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "revolvingCreditImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "getRevolvingCreditImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Art1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;

        public Art1(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            this.__typename = str;
            this.revolvingCreditImageFragment = revolvingCreditImageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment = this.revolvingCreditImageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Art1(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditImageFragment=");
            sb.append(revolvingCreditImageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditImageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art1 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, art1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditImageFragment, art1.revolvingCreditImageFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1(__typename, revolvingCreditImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art1, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = art1.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditImageFragment = art1.revolvingCreditImageFragment;
            }
            return art1.copy(str, revolvingCreditImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "", "", "id", "lastNChars", "name", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art2;", "art", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentCardProductClass;", "productClass", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art2;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentCardProductClass;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art2;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentCardProductClass;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art2;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentCardProductClass;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getLastNChars", "getName", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art2;", "getArt", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentFundingInstrumentCardProductClass;", "getProductClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPaymentFundingInstrumentCard {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art;
        private final java.lang.String id;
        private final java.lang.Object lastNChars;
        private final java.lang.String name;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass productClass;

        public OnRevolvingCreditPaymentFundingInstrumentCard(java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass revolvingCreditPaymentFundingInstrumentCardProductClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentFundingInstrumentCardProductClass, "");
            this.id = str;
            this.lastNChars = obj;
            this.name = str2;
            this.art = art2;
            this.productClass = revolvingCreditPaymentFundingInstrumentCardProductClass;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 getArt() {
            return this.art;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass getProductClass() {
            return this.productClass;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.lastNChars;
            java.lang.String str2 = this.name;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art2 = this.art;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass revolvingCreditPaymentFundingInstrumentCardProductClass = this.productClass;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPaymentFundingInstrumentCard(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(obj);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", art=");
            sb.append(art2);
            sb.append(", productClass=");
            sb.append(revolvingCreditPaymentFundingInstrumentCardProductClass);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            java.lang.String str = this.name;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art2 = this.art;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (art2 != null ? art2.hashCode() : 0)) * 31) + this.productClass.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRevolvingCreditPaymentFundingInstrumentCard.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onRevolvingCreditPaymentFundingInstrumentCard.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, onRevolvingCreditPaymentFundingInstrumentCard.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.art, onRevolvingCreditPaymentFundingInstrumentCard.art) && this.productClass == onRevolvingCreditPaymentFundingInstrumentCard.productClass;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard copy(java.lang.String id, java.lang.Object lastNChars, java.lang.String name2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass productClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productClass, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard(id, lastNChars, name2, art, productClass);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass getProductClass() {
            return this.productClass;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 getArt() {
            return this.art;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard, java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art2, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentFundingInstrumentCardProductClass revolvingCreditPaymentFundingInstrumentCardProductClass, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onRevolvingCreditPaymentFundingInstrumentCard.id;
            }
            if ((i & 2) != 0) {
                obj = onRevolvingCreditPaymentFundingInstrumentCard.lastNChars;
            }
            java.lang.Object obj3 = obj;
            if ((i & 4) != 0) {
                str2 = onRevolvingCreditPaymentFundingInstrumentCard.name;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                art2 = onRevolvingCreditPaymentFundingInstrumentCard.art;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art22 = art2;
            if ((i & 16) != 0) {
                revolvingCreditPaymentFundingInstrumentCardProductClass = onRevolvingCreditPaymentFundingInstrumentCard.productClass;
            }
            return onRevolvingCreditPaymentFundingInstrumentCard.copy(str, obj3, str3, art22, revolvingCreditPaymentFundingInstrumentCardProductClass);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art2;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "revolvingCreditImageFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Art2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "getRevolvingCreditImageFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Art2 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;

        public Art2(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            this.__typename = str;
            this.revolvingCreditImageFragment = revolvingCreditImageFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment = this.revolvingCreditImageFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Art2(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditImageFragment=");
            sb.append(revolvingCreditImageFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditImageFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art2 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, art2.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditImageFragment, art2.revolvingCreditImageFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2(__typename, revolvingCreditImageFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment getRevolvingCreditImageFragment() {
            return this.revolvingCreditImageFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art2, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = art2.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditImageFragment = art2.revolvingCreditImageFragment;
            }
            return art2.copy(str, revolvingCreditImageFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditServicingContent;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Payments;", "payments", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Payments;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Payments;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Payments;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditServicingContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Payments;", "getPayments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditServicingContent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments;

        public RevolvingCreditServicingContent(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments) {
            this.payments = payments;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments getPayments() {
            return this.payments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments = this.payments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingContent(payments=");
            sb.append(payments);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments = this.payments;
            if (payments == null) {
                return 0;
            }
            return payments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.payments, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent) other).payments);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent(payments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments getPayments() {
            return this.payments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payments = revolvingCreditServicingContent.payments;
            }
            return revolvingCreditServicingContent.copy(payments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Payments;", "", "oneTimePaymentTermsUrl", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Payments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getOneTimePaymentTermsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payments {
        public static final int $stable = 8;
        private final java.lang.Object oneTimePaymentTermsUrl;

        public Payments(java.lang.Object obj) {
            this.oneTimePaymentTermsUrl = obj;
        }

        public final java.lang.Object getOneTimePaymentTermsUrl() {
            return this.oneTimePaymentTermsUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.oneTimePaymentTermsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payments(oneTimePaymentTermsUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.oneTimePaymentTermsUrl;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments) && kotlin.jvm.internal.Intrinsics.areEqual(this.oneTimePaymentTermsUrl, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments) other).oneTimePaymentTermsUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments copy(java.lang.Object oneTimePaymentTermsUrl) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments(oneTimePaymentTermsUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getOneTimePaymentTermsUrl() {
            return this.oneTimePaymentTermsUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = payments.oneTimePaymentTermsUrl;
            }
            return payments.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetRevolvingCreditPaymentOptionsOverview($creditProductIdentifier: RevolvingCreditProductIdentifier!) { revolvingCreditPaymentConstraints(input: { creditProductIdentifier: $creditProductIdentifier types: [ONE_TIME] } ) { __typename ... on RevolvingCreditOneTimePaymentConstraints { paymentAmountOptions { amount { __typename ...RevolvingCreditMoneyFragment } type } maxDaysInFuture } } revolvingCreditPayments(input: { creditProductIdentifier: $creditProductIdentifier filterOptions: { types: [SCHEDULED,REAL_TIME] }  } ) { __typename ...RevolvingCreditPaymentsFragment } revolvingCreditAccount(input: { creditProductIdentifier: $creditProductIdentifier } ) { __typename ...RevolvingCreditBillingFragment product { capabilities { payment } } creditAccountId } revolvingCreditAutopay(input: { creditProductIdentifier: $creditProductIdentifier } ) { __typename ...RevolvingCreditAutopayFragment } revolvingCreditEligiblePaymentFundingInstruments(input: { creditProductIdentifier: $creditProductIdentifier paymentTypes: [REAL_TIME,SCHEDULED] } ) { __typename ... on RevolvingCreditPaymentFundingInstrumentBalance { id art { __typename ...RevolvingCreditImageFragment } amount { __typename ...RevolvingCreditMoneyFragment } } ... on RevolvingCreditPaymentFundingInstrumentBank { id type bankLastNChars: lastNChars name art { __typename ...RevolvingCreditImageFragment } } ... on RevolvingCreditPaymentFundingInstrumentCard { id lastNChars name art { __typename ...RevolvingCreditImageFragment } productClass } } revolvingCreditServicingContent(input: { creditProductIdentifier: $creditProductIdentifier } ) { payments { oneTimePaymentTermsUrl } } }  fragment RevolvingCreditMoneyFragment on Money { currencyCode value }  fragment RevolvingCreditImageFragment on CreditImage { url assetName }  fragment RevolvingCreditPaymentFundingInstrumentsFragment on RevolvingCreditPaymentFundingInstrument { __typename ... on RevolvingCreditPaymentFundingInstrumentBalance { id art { __typename ...RevolvingCreditImageFragment } amount { __typename ...RevolvingCreditMoneyFragment } } ... on RevolvingCreditPaymentFundingInstrumentBank { id type bankLastNChars: lastNChars name art { __typename ...RevolvingCreditImageFragment } } ... on RevolvingCreditPaymentFundingInstrumentCard { id cardLastNChars: lastNChars name art { __typename ...RevolvingCreditImageFragment } productClass } }  fragment RevolvingCreditPaymentsFragment on RevolvingCreditPayment { id amount { __typename ...RevolvingCreditMoneyFragment } cancelable channel createTime fundingInstruments { __typename ...RevolvingCreditPaymentFundingInstrumentsFragment } paymentTime status type }  fragment RevolvingCreditBillingFragment on RevolvingCreditAccount { billing { creditLines { creditLine { __typename ...RevolvingCreditMoneyFragment } temporaryCreditLine { __typename ...RevolvingCreditMoneyFragment } } currentBalance { __typename ...RevolvingCreditMoneyFragment } statementBalance { __typename ...RevolvingCreditMoneyFragment } remainingStatementBalance { __typename ...RevolvingCreditMoneyFragment } minimumPaymentDue { __typename ...RevolvingCreditMoneyFragment } minimumPaymentToAvoidInterest { __typename ...RevolvingCreditMoneyFragment } maxRepayableAmount { __typename ...RevolvingCreditMoneyFragment } openToBuy { __typename ...RevolvingCreditMoneyFragment } pastDueAmount { __typename ...RevolvingCreditMoneyFragment } nextPaymentDueTime paymentStatus } }  fragment RevolvingCreditAutopayFragment on RevolvingCreditAutopay { __typename ... on RevolvingCreditAutopayEnrolled { paymentAmountOptionType effectiveDueTime effectiveInCurrentBillingCycle fundingInstruments { __typename ...RevolvingCreditPaymentFundingInstrumentsFragment } customAmount { __typename ...RevolvingCreditMoneyFragment } } ... on RevolvingCreditAutopayUnenrolled { enrollmentEligible } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetRevolvingCreditPaymentOptionsOverviewQuery(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.creditProductIdentifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery) && this.creditProductIdentifier == ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery) other).creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery(creditProductIdentifier);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery getRevolvingCreditPaymentOptionsOverviewQuery, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = getRevolvingCreditPaymentOptionsOverviewQuery.creditProductIdentifier;
        }
        return getRevolvingCreditPaymentOptionsOverviewQuery.copy(revolvingCreditProductIdentifier);
    }
}
