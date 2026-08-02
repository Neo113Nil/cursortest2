package com.paypal.oslo.feature.bnplservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b*+,-./0123)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "getInput", "Companion", "Data", "BnplMakePaymentOverview", "PaymentOption", "Amount", "CurrentDueAmount", "Autopay", "PaymentFundingInstrument", "PaymentFundingInstrument1", "MaxRepaymentAmount", "MinRepaymentAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetMakePaymentOverviewQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data> {
    public static final java.lang.String OPERATION_ID = "63daa4ce2bfd0b9f5e8ccaac0b6f9cc42a7800f2fabaa4d62eba380cc8153f59";
    public static final java.lang.String OPERATION_NAME = "GetMakePaymentOverview";
    private final com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Companion(null);
    public static final int $stable = 8;

    public GetMakePaymentOverviewQuery(com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput bNPLMakePaymentOverviewInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLMakePaymentOverviewInput, "");
        this.input = bNPLMakePaymentOverviewInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput getInput() {
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
        com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetMakePaymentOverviewQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetMakePaymentOverviewQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplservicing.graphql.selections.GetMakePaymentOverviewQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$BnplMakePaymentOverview;", com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.MAKE_A_PAYMENT, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$BnplMakePaymentOverview;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$BnplMakePaymentOverview;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$BnplMakePaymentOverview;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$BnplMakePaymentOverview;", "getBnplMakePaymentOverview"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview;

        public Data(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview) {
            this.bnplMakePaymentOverview = bnplMakePaymentOverview;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview getBnplMakePaymentOverview() {
            return this.bnplMakePaymentOverview;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview = this.bnplMakePaymentOverview;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bnplMakePaymentOverview=");
            sb.append(bnplMakePaymentOverview);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview = this.bnplMakePaymentOverview;
            if (bnplMakePaymentOverview == null) {
                return 0;
            }
            return bnplMakePaymentOverview.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplMakePaymentOverview, ((com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data) other).bnplMakePaymentOverview);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data copy(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data(bnplMakePaymentOverview);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview getBnplMakePaymentOverview() {
            return this.bnplMakePaymentOverview;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Data data, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bnplMakePaymentOverview = data.bnplMakePaymentOverview;
            }
            return data.copy(bnplMakePaymentOverview);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b4\u00105J¾\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010#R\u001a\u0010\t\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010%R\u001a\u0010\n\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bI\u0010%R\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bJ\u0010%R\u001a\u0010\f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bK\u0010%R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010*R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010.R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bR\u0010!R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\bS\u0010!R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bT\u0010%R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\bV\u00103R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u00105"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$BnplMakePaymentOverview;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanStatus;", "planStatus", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentOption;", "paymentOptions", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "countryCode", "currencyCode", "productTimezone", "creditAccountId", "", "interestBearing", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$CurrentDueAmount;", "currentDueAmount", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Autopay;", "autopay", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument1;", "paymentFundingInstruments", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingSupportedPaymentFundingInstrumentType;", "supportedPaymentFundingInstrumentsToAdd", "paymentAuthorizationLink", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MaxRepaymentAmount;", "maxRepaymentAmount", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MinRepaymentAmount;", "minRepaymentAmount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanStatus;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$CurrentDueAmount;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Autopay;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MaxRepaymentAmount;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MinRepaymentAmount;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanStatus;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component4", "()Ljava/lang/Object;", "component5", "component6", "component7", "component8", "()Z", "component9", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$CurrentDueAmount;", "component10", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Autopay;", "component11", "component12", "component13", "component14", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MaxRepaymentAmount;", "component15", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MinRepaymentAmount;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanStatus;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$CurrentDueAmount;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Autopay;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MaxRepaymentAmount;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MinRepaymentAmount;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$BnplMakePaymentOverview;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanStatus;", "getPlanStatus", "Ljava/util/List;", "getPaymentOptions", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/Object;", "getCountryCode", "getCurrencyCode", "getProductTimezone", "getCreditAccountId", "Z", "getInterestBearing", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$CurrentDueAmount;", "getCurrentDueAmount", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Autopay;", "getAutopay", "getPaymentFundingInstruments", "getSupportedPaymentFundingInstrumentsToAdd", "getPaymentAuthorizationLink", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MaxRepaymentAmount;", "getMaxRepaymentAmount", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MinRepaymentAmount;", "getMinRepaymentAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplMakePaymentOverview {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay;
        private final java.lang.Object countryCode;
        private final java.lang.Object creditAccountId;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        private final java.lang.Object currencyCode;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount currentDueAmount;
        private final boolean interestBearing;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount maxRepaymentAmount;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount minRepaymentAmount;
        private final java.lang.Object paymentAuthorizationLink;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1> paymentFundingInstruments;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> paymentOptions;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus;
        private final java.lang.Object productTimezone;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> supportedPaymentFundingInstrumentsToAdd;

        /* JADX WARN: Multi-variable type inference failed */
        public BnplMakePaymentOverview(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus bNPLServicingPlanStatus, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> list, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, boolean z, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount currentDueAmount, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1> list2, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> list3, java.lang.Object obj5, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount maxRepaymentAmount, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount minRepaymentAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingPlanStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDueAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxRepaymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minRepaymentAmount, "");
            this.planStatus = bNPLServicingPlanStatus;
            this.paymentOptions = list;
            this.creditProductIdentifier = bNPLCreditProductIdentifier;
            this.countryCode = obj;
            this.currencyCode = obj2;
            this.productTimezone = obj3;
            this.creditAccountId = obj4;
            this.interestBearing = z;
            this.currentDueAmount = currentDueAmount;
            this.autopay = autopay;
            this.paymentFundingInstruments = list2;
            this.supportedPaymentFundingInstrumentsToAdd = list3;
            this.paymentAuthorizationLink = obj5;
            this.maxRepaymentAmount = maxRepaymentAmount;
            this.minRepaymentAmount = minRepaymentAmount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus getPlanStatus() {
            return this.planStatus;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> getPaymentOptions() {
            return this.paymentOptions;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.Object getProductTimezone() {
            return this.productTimezone;
        }

        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public final boolean getInterestBearing() {
            return this.interestBearing;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount getCurrentDueAmount() {
            return this.currentDueAmount;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay getAutopay() {
            return this.autopay;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1> getPaymentFundingInstruments() {
            return this.paymentFundingInstruments;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> getSupportedPaymentFundingInstrumentsToAdd() {
            return this.supportedPaymentFundingInstrumentsToAdd;
        }

        public final java.lang.Object getPaymentAuthorizationLink() {
            return this.paymentAuthorizationLink;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount getMaxRepaymentAmount() {
            return this.maxRepaymentAmount;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount getMinRepaymentAmount() {
            return this.minRepaymentAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus bNPLServicingPlanStatus = this.planStatus;
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> list = this.paymentOptions;
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
            java.lang.Object obj = this.countryCode;
            java.lang.Object obj2 = this.currencyCode;
            java.lang.Object obj3 = this.productTimezone;
            java.lang.Object obj4 = this.creditAccountId;
            boolean z = this.interestBearing;
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount currentDueAmount = this.currentDueAmount;
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay = this.autopay;
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1> list2 = this.paymentFundingInstruments;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> list3 = this.supportedPaymentFundingInstrumentsToAdd;
            java.lang.Object obj5 = this.paymentAuthorizationLink;
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount maxRepaymentAmount = this.maxRepaymentAmount;
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount minRepaymentAmount = this.minRepaymentAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplMakePaymentOverview(planStatus=");
            sb.append(bNPLServicingPlanStatus);
            sb.append(", paymentOptions=");
            sb.append(list);
            sb.append(", creditProductIdentifier=");
            sb.append(bNPLCreditProductIdentifier);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(", currencyCode=");
            sb.append(obj2);
            sb.append(", productTimezone=");
            sb.append(obj3);
            sb.append(", creditAccountId=");
            sb.append(obj4);
            sb.append(", interestBearing=");
            sb.append(z);
            sb.append(", currentDueAmount=");
            sb.append(currentDueAmount);
            sb.append(", autopay=");
            sb.append(autopay);
            sb.append(", paymentFundingInstruments=");
            sb.append(list2);
            sb.append(", supportedPaymentFundingInstrumentsToAdd=");
            sb.append(list3);
            sb.append(", paymentAuthorizationLink=");
            sb.append(obj5);
            sb.append(", maxRepaymentAmount=");
            sb.append(maxRepaymentAmount);
            sb.append(", minRepaymentAmount=");
            sb.append(minRepaymentAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.planStatus.hashCode();
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> list = this.paymentOptions;
            int hashCode2 = list == null ? 0 : list.hashCode();
            int hashCode3 = this.creditProductIdentifier.hashCode();
            int hashCode4 = this.countryCode.hashCode();
            int hashCode5 = this.currencyCode.hashCode();
            int hashCode6 = this.productTimezone.hashCode();
            int hashCode7 = this.creditAccountId.hashCode();
            int hashCode8 = java.lang.Boolean.hashCode(this.interestBearing);
            int hashCode9 = this.currentDueAmount.hashCode();
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay = this.autopay;
            int hashCode10 = autopay == null ? 0 : autopay.hashCode();
            int hashCode11 = this.paymentFundingInstruments.hashCode();
            int hashCode12 = this.supportedPaymentFundingInstrumentsToAdd.hashCode();
            java.lang.Object obj = this.paymentAuthorizationLink;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.maxRepaymentAmount.hashCode()) * 31) + this.minRepaymentAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview bnplMakePaymentOverview = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview) other;
            return this.planStatus == bnplMakePaymentOverview.planStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentOptions, bnplMakePaymentOverview.paymentOptions) && this.creditProductIdentifier == bnplMakePaymentOverview.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, bnplMakePaymentOverview.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, bnplMakePaymentOverview.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.productTimezone, bnplMakePaymentOverview.productTimezone) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, bnplMakePaymentOverview.creditAccountId) && this.interestBearing == bnplMakePaymentOverview.interestBearing && kotlin.jvm.internal.Intrinsics.areEqual(this.currentDueAmount, bnplMakePaymentOverview.currentDueAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopay, bnplMakePaymentOverview.autopay) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstruments, bnplMakePaymentOverview.paymentFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedPaymentFundingInstrumentsToAdd, bnplMakePaymentOverview.supportedPaymentFundingInstrumentsToAdd) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthorizationLink, bnplMakePaymentOverview.paymentAuthorizationLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxRepaymentAmount, bnplMakePaymentOverview.maxRepaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.minRepaymentAmount, bnplMakePaymentOverview.minRepaymentAmount);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview copy(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> paymentOptions, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, java.lang.Object countryCode, java.lang.Object currencyCode, java.lang.Object productTimezone, java.lang.Object creditAccountId, boolean interestBearing, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount currentDueAmount, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1> paymentFundingInstruments, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> supportedPaymentFundingInstrumentsToAdd, java.lang.Object paymentAuthorizationLink, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount maxRepaymentAmount, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount minRepaymentAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productTimezone, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDueAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedPaymentFundingInstrumentsToAdd, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxRepaymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minRepaymentAmount, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.BnplMakePaymentOverview(planStatus, paymentOptions, creditProductIdentifier, countryCode, currencyCode, productTimezone, creditAccountId, interestBearing, currentDueAmount, autopay, paymentFundingInstruments, supportedPaymentFundingInstrumentsToAdd, paymentAuthorizationLink, maxRepaymentAmount, minRepaymentAmount);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount getCurrentDueAmount() {
            return this.currentDueAmount;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getInterestBearing() {
            return this.interestBearing;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getProductTimezone() {
            return this.productTimezone;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption> component2() {
            return this.paymentOptions;
        }

        /* renamed from: component15, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount getMinRepaymentAmount() {
            return this.minRepaymentAmount;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount getMaxRepaymentAmount() {
            return this.maxRepaymentAmount;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.Object getPaymentAuthorizationLink() {
            return this.paymentAuthorizationLink;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> component12() {
            return this.supportedPaymentFundingInstrumentsToAdd;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1> component11() {
            return this.paymentFundingInstruments;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay getAutopay() {
            return this.autopay;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus getPlanStatus() {
            return this.planStatus;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentOption;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPaymentOptionType;", "type", "", "shouldShowAutopayOnText", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Amount;", "amount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPaymentOptionType;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Amount;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPaymentOptionType;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Amount;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPaymentOptionType;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Amount;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentOption;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPaymentOptionType;", "getType", "Ljava/lang/Boolean;", "getShouldShowAutopayOnText", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentOption {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount amount;
        private final java.lang.Boolean shouldShowAutopayOnText;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentOptionType type;

        public PaymentOption(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentOptionType bNPLServicingPaymentOptionType, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingPaymentOptionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.type = bNPLServicingPaymentOptionType;
            this.shouldShowAutopayOnText = bool;
            this.amount = amount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentOptionType getType() {
            return this.type;
        }

        public final java.lang.Boolean getShouldShowAutopayOnText() {
            return this.shouldShowAutopayOnText;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentOptionType bNPLServicingPaymentOptionType = this.type;
            java.lang.Boolean bool = this.shouldShowAutopayOnText;
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentOption(type=");
            sb.append(bNPLServicingPaymentOptionType);
            sb.append(", shouldShowAutopayOnText=");
            sb.append(bool);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode();
            java.lang.Boolean bool = this.shouldShowAutopayOnText;
            return (((hashCode * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption paymentOption = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption) other;
            return this.type == paymentOption.type && kotlin.jvm.internal.Intrinsics.areEqual(this.shouldShowAutopayOnText, paymentOption.shouldShowAutopayOnText) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, paymentOption.amount);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption copy(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentOptionType type, java.lang.Boolean shouldShowAutopayOnText, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption(type, shouldShowAutopayOnText, amount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getShouldShowAutopayOnText() {
            return this.shouldShowAutopayOnText;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentOptionType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentOption paymentOption, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPaymentOptionType bNPLServicingPaymentOptionType, java.lang.Boolean bool, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLServicingPaymentOptionType = paymentOption.type;
            }
            if ((i & 2) != 0) {
                bool = paymentOption.shouldShowAutopayOnText;
            }
            if ((i & 4) != 0) {
                amount = paymentOption.amount;
            }
            return paymentOption.copy(bNPLServicingPaymentOptionType, bool, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            this.__typename = str;
            this.bnplServicingMoneyFragment = bnplServicingMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment = this.bnplServicingMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMoneyFragment=");
            sb.append(bnplServicingMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount amount = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, amount.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Amount amount, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = amount.bnplServicingMoneyFragment;
            }
            return amount.copy(str, bnplServicingMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$CurrentDueAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$CurrentDueAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentDueAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;

        public CurrentDueAmount(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            this.__typename = str;
            this.bnplServicingMoneyFragment = bnplServicingMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment = this.bnplServicingMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentDueAmount(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMoneyFragment=");
            sb.append(bnplServicingMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount currentDueAmount = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, currentDueAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, currentDueAmount.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.CurrentDueAmount currentDueAmount, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = currentDueAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = currentDueAmount.bnplServicingMoneyFragment;
            }
            return currentDueAmount.copy(str, bnplServicingMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Autopay;", "", "", "enabled", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument;", "paymentFundingInstrument", "isFundingInstrumentValid", "<init>", "(ZLcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument;Ljava/lang/Boolean;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument;", "component3", "()Ljava/lang/Boolean;", "copy", "(ZLcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Autopay;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument;", "getPaymentFundingInstrument", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Autopay {
        public static final int $stable = 8;
        private final boolean enabled;
        private final java.lang.Boolean isFundingInstrumentValid;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument paymentFundingInstrument;

        public Autopay(boolean z, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument paymentFundingInstrument, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstrument, "");
            this.enabled = z;
            this.paymentFundingInstrument = paymentFundingInstrument;
            this.isFundingInstrumentValid = bool;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument getPaymentFundingInstrument() {
            return this.paymentFundingInstrument;
        }

        public final java.lang.Boolean isFundingInstrumentValid() {
            return this.isFundingInstrumentValid;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument paymentFundingInstrument = this.paymentFundingInstrument;
            java.lang.Boolean bool = this.isFundingInstrumentValid;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Autopay(enabled=");
            sb.append(z);
            sb.append(", paymentFundingInstrument=");
            sb.append(paymentFundingInstrument);
            sb.append(", isFundingInstrumentValid=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.enabled);
            int hashCode2 = this.paymentFundingInstrument.hashCode();
            java.lang.Boolean bool = this.isFundingInstrumentValid;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay) other;
            return this.enabled == autopay.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstrument, autopay.paymentFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.isFundingInstrumentValid, autopay.isFundingInstrumentValid);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay copy(boolean enabled, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument paymentFundingInstrument, java.lang.Boolean isFundingInstrumentValid) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstrument, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay(enabled, paymentFundingInstrument, isFundingInstrumentValid);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getIsFundingInstrumentValid() {
            return this.isFundingInstrumentValid;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument getPaymentFundingInstrument() {
            return this.paymentFundingInstrument;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.Autopay autopay, boolean z, com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument paymentFundingInstrument, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = autopay.enabled;
            }
            if ((i & 2) != 0) {
                paymentFundingInstrument = autopay.paymentFundingInstrument;
            }
            if ((i & 4) != 0) {
                bool = autopay.isFundingInstrumentValid;
            }
            return autopay.copy(z, paymentFundingInstrument, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "bnplServicingPaymentFundingInstrumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "getBnplServicingPaymentFundingInstrumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentFundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment;

        public PaymentFundingInstrument(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            this.__typename = str;
            this.bnplServicingPaymentFundingInstrumentFragment = bnplServicingPaymentFundingInstrumentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment = this.bnplServicingPaymentFundingInstrumentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentFundingInstrument(__typename=");
            sb.append(str);
            sb.append(", bnplServicingPaymentFundingInstrumentFragment=");
            sb.append(bnplServicingPaymentFundingInstrumentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingPaymentFundingInstrumentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPaymentFundingInstrumentFragment, paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument(__typename, bnplServicingPaymentFundingInstrumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument paymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingPaymentFundingInstrumentFragment = paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment;
            }
            return paymentFundingInstrument.copy(str, bnplServicingPaymentFundingInstrumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument1;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "bnplServicingPaymentFundingInstrumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$PaymentFundingInstrument1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "getBnplServicingPaymentFundingInstrumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentFundingInstrument1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment;

        public PaymentFundingInstrument1(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            this.__typename = str;
            this.bnplServicingPaymentFundingInstrumentFragment = bnplServicingPaymentFundingInstrumentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment = this.bnplServicingPaymentFundingInstrumentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentFundingInstrument1(__typename=");
            sb.append(str);
            sb.append(", bnplServicingPaymentFundingInstrumentFragment=");
            sb.append(bnplServicingPaymentFundingInstrumentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingPaymentFundingInstrumentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1 paymentFundingInstrument1 = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentFundingInstrument1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPaymentFundingInstrumentFragment, paymentFundingInstrument1.bnplServicingPaymentFundingInstrumentFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1 copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1(__typename, bnplServicingPaymentFundingInstrumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1 copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.PaymentFundingInstrument1 paymentFundingInstrument1, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentFundingInstrument1.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingPaymentFundingInstrumentFragment = paymentFundingInstrument1.bnplServicingPaymentFundingInstrumentFragment;
            }
            return paymentFundingInstrument1.copy(str, bnplServicingPaymentFundingInstrumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MaxRepaymentAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MaxRepaymentAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MaxRepaymentAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;

        public MaxRepaymentAmount(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            this.__typename = str;
            this.bnplServicingMoneyFragment = bnplServicingMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment = this.bnplServicingMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxRepaymentAmount(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMoneyFragment=");
            sb.append(bnplServicingMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount maxRepaymentAmount = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, maxRepaymentAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, maxRepaymentAmount.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MaxRepaymentAmount maxRepaymentAmount, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = maxRepaymentAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = maxRepaymentAmount.bnplServicingMoneyFragment;
            }
            return maxRepaymentAmount.copy(str, bnplServicingMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MinRepaymentAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$MinRepaymentAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MinRepaymentAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;

        public MinRepaymentAmount(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            this.__typename = str;
            this.bnplServicingMoneyFragment = bnplServicingMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment = this.bnplServicingMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MinRepaymentAmount(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMoneyFragment=");
            sb.append(bnplServicingMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount minRepaymentAmount = (com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, minRepaymentAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, minRepaymentAmount.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery.MinRepaymentAmount minRepaymentAmount, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = minRepaymentAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = minRepaymentAmount.bnplServicingMoneyFragment;
            }
            return minRepaymentAmount.copy(str, bnplServicingMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetMakePaymentOverviewQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetMakePaymentOverview($input: BNPLMakePaymentOverviewInput!) { bnplMakePaymentOverview(input: $input) { planStatus paymentOptions { type shouldShowAutopayOnText amount { __typename ...BnplServicingMoneyFragment } } creditProductIdentifier countryCode currencyCode productTimezone creditAccountId interestBearing currentDueAmount { __typename ...BnplServicingMoneyFragment } autopay { enabled paymentFundingInstrument { __typename ...BnplServicingPaymentFundingInstrumentFragment } isFundingInstrumentValid } paymentFundingInstruments { __typename ...BnplServicingPaymentFundingInstrumentFragment } supportedPaymentFundingInstrumentsToAdd paymentAuthorizationLink maxRepaymentAmount { __typename ...BnplServicingMoneyFragment } minRepaymentAmount { __typename ...BnplServicingMoneyFragment } } }  fragment BnplServicingMoneyFragment on Money { currencyCode value }  fragment BnplServicingBalanceFragment on Balance { id availableAmount { __typename ...BnplServicingMoneyFragment } }  fragment BnplServicingBankAccountFragment on BankAccount { id lastNChars bankIssuer: issuer { name } institutionImages { url } type }  fragment BnplServicingCardFragment on Card { id brand expirationDate lastNChars productClass nickName issuer { name } cardArt { primaryImage { baseCdnLinkPath mimeType height width } thumbnailImage { baseCdnLinkPath mimeType height width } backgroundColor foregroundColor labelColor } }  fragment BnplServicingPaymentFundingInstrumentFragment on BNPLServicingPaymentFundingInstrument { __typename ... on Balance { __typename ...BnplServicingBalanceFragment } ... on BankAccount { __typename ...BnplServicingBankAccountFragment } ... on Card { __typename ...BnplServicingCardFragment } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput bNPLMakePaymentOverviewInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetMakePaymentOverviewQuery(input=");
        sb.append(bNPLMakePaymentOverviewInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery) other).input);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery copy(com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetMakePaymentOverviewQuery getMakePaymentOverviewQuery, com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput bNPLMakePaymentOverviewInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLMakePaymentOverviewInput = getMakePaymentOverviewQuery.input;
        }
        return getMakePaymentOverviewQuery.copy(bNPLMakePaymentOverviewInput);
    }
}
