package com.paypal.oslo.feature.bnplservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLMakePaymentOverviewInput;", "getInput", "Companion", "Data", "BnplMakePaymentOverview", "PaymentFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBnplMakePaymentFIsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "cf00e3d0d8d9858f988ccb4b3724518f2825d3b372d41b34524411d31b3ebd20";
    public static final java.lang.String OPERATION_NAME = "GetBnplMakePaymentFIs";
    private final com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Companion(null);
    public static final int $stable = 8;

    public GetBnplMakePaymentFIsQuery(com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput bNPLMakePaymentOverviewInput) {
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
        com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplMakePaymentFIsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplMakePaymentFIsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplservicing.graphql.selections.GetBnplMakePaymentFIsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$BnplMakePaymentOverview;", com.paypal.oslo.feature.bnplservicing.data.mapper.error.ErrorPaths.MAKE_A_PAYMENT, "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$BnplMakePaymentOverview;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$BnplMakePaymentOverview;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$BnplMakePaymentOverview;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$BnplMakePaymentOverview;", "getBnplMakePaymentOverview"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview;

        public Data(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview) {
            this.bnplMakePaymentOverview = bnplMakePaymentOverview;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview getBnplMakePaymentOverview() {
            return this.bnplMakePaymentOverview;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview = this.bnplMakePaymentOverview;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bnplMakePaymentOverview=");
            sb.append(bnplMakePaymentOverview);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview = this.bnplMakePaymentOverview;
            if (bnplMakePaymentOverview == null) {
                return 0;
            }
            return bnplMakePaymentOverview.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplMakePaymentOverview, ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data) other).bnplMakePaymentOverview);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data copy(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data(bnplMakePaymentOverview);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview getBnplMakePaymentOverview() {
            return this.bnplMakePaymentOverview;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.Data data, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bnplMakePaymentOverview = data.bnplMakePaymentOverview;
            }
            return data.copy(bnplMakePaymentOverview);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$BnplMakePaymentOverview;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$PaymentFundingInstrument;", "paymentFundingInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$BnplMakePaymentOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPaymentFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplMakePaymentOverview {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument> paymentFundingInstruments;

        public BnplMakePaymentOverview(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.paymentFundingInstruments = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument> getPaymentFundingInstruments() {
            return this.paymentFundingInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument> list = this.paymentFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplMakePaymentOverview(paymentFundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstruments, ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview) other).paymentFundingInstruments);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview copy(java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument> paymentFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstruments, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview(paymentFundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument> component1() {
            return this.paymentFundingInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.BnplMakePaymentOverview bnplMakePaymentOverview, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = bnplMakePaymentOverview.paymentFundingInstruments;
            }
            return bnplMakePaymentOverview.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$PaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "bnplServicingPaymentFundingInstrumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$PaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "getBnplServicingPaymentFundingInstrumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPaymentFundingInstrumentFragment, paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument(__typename, bnplServicingPaymentFundingInstrumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery.PaymentFundingInstrument paymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingPaymentFundingInstrumentFragment = paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment;
            }
            return paymentFundingInstrument.copy(str, bnplServicingPaymentFundingInstrumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplMakePaymentFIsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBnplMakePaymentFIs($input: BNPLMakePaymentOverviewInput!) { bnplMakePaymentOverview(input: $input) { paymentFundingInstruments { __typename ...BnplServicingPaymentFundingInstrumentFragment } } }  fragment BnplServicingMoneyFragment on Money { currencyCode value }  fragment BnplServicingBalanceFragment on Balance { id availableAmount { __typename ...BnplServicingMoneyFragment } }  fragment BnplServicingBankAccountFragment on BankAccount { id lastNChars bankIssuer: issuer { name } institutionImages { url } type }  fragment BnplServicingCardFragment on Card { id brand expirationDate lastNChars productClass nickName issuer { name } cardArt { primaryImage { baseCdnLinkPath mimeType height width } thumbnailImage { baseCdnLinkPath mimeType height width } backgroundColor foregroundColor labelColor } }  fragment BnplServicingPaymentFundingInstrumentFragment on BNPLServicingPaymentFundingInstrument { __typename ... on Balance { __typename ...BnplServicingBalanceFragment } ... on BankAccount { __typename ...BnplServicingBankAccountFragment } ... on Card { __typename ...BnplServicingCardFragment } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput bNPLMakePaymentOverviewInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBnplMakePaymentFIsQuery(input=");
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery) other).input);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery copy(com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplMakePaymentFIsQuery getBnplMakePaymentFIsQuery, com.paypal.oslo.api.graphql.schema.type.BNPLMakePaymentOverviewInput bNPLMakePaymentOverviewInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLMakePaymentOverviewInput = getBnplMakePaymentFIsQuery.input;
        }
        return getBnplMakePaymentFIsQuery.copy(bNPLMakePaymentOverviewInput);
    }
}
