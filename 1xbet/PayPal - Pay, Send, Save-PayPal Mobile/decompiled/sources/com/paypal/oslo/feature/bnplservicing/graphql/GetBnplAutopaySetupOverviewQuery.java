package com.paypal.oslo.feature.bnplservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopaySetupOverviewInput;", "getInput", "Companion", "Data", "BnplAutopaySetupOverview", "PaymentFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBnplAutopaySetupOverviewQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data> {
    public static final java.lang.String OPERATION_ID = "cfa804333dadff972e537f18348e467e0111b12c6a6cb57c2982796e937bd58f";
    public static final java.lang.String OPERATION_NAME = "GetBnplAutopaySetupOverview";
    private final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Companion(null);
    public static final int $stable = 8;

    public GetBnplAutopaySetupOverviewQuery(com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput bNPLAutopaySetupOverviewInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAutopaySetupOverviewInput, "");
        this.input = bNPLAutopaySetupOverviewInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput getInput() {
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
        com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplAutopaySetupOverviewQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.adapter.GetBnplAutopaySetupOverviewQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplservicing.graphql.selections.GetBnplAutopaySetupOverviewQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$BnplAutopaySetupOverview;", "bnplAutopaySetupOverview", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$BnplAutopaySetupOverview;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$BnplAutopaySetupOverview;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$BnplAutopaySetupOverview;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$BnplAutopaySetupOverview;", "getBnplAutopaySetupOverview"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview;

        public Data(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview) {
            this.bnplAutopaySetupOverview = bnplAutopaySetupOverview;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview getBnplAutopaySetupOverview() {
            return this.bnplAutopaySetupOverview;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview = this.bnplAutopaySetupOverview;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bnplAutopaySetupOverview=");
            sb.append(bnplAutopaySetupOverview);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview = this.bnplAutopaySetupOverview;
            if (bnplAutopaySetupOverview == null) {
                return 0;
            }
            return bnplAutopaySetupOverview.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAutopaySetupOverview, ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data) other).bnplAutopaySetupOverview);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data copy(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data(bnplAutopaySetupOverview);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview getBnplAutopaySetupOverview() {
            return this.bnplAutopaySetupOverview;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.Data data, com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bnplAutopaySetupOverview = data.bnplAutopaySetupOverview;
            }
            return data.copy(bnplAutopaySetupOverview);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ<\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$BnplAutopaySetupOverview;", "", "paymentAuthorizationLink", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingSupportedPaymentFundingInstrumentType;", "supportedFundingInstrumentsToAdd", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$PaymentFundingInstrument;", "paymentFundingInstruments", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$BnplAutopaySetupOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPaymentAuthorizationLink", "Ljava/util/List;", "getSupportedFundingInstrumentsToAdd", "getPaymentFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplAutopaySetupOverview {
        public static final int $stable = 8;
        private final java.lang.Object paymentAuthorizationLink;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument> paymentFundingInstruments;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> supportedFundingInstrumentsToAdd;

        /* JADX WARN: Multi-variable type inference failed */
        public BnplAutopaySetupOverview(java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> list, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.paymentAuthorizationLink = obj;
            this.supportedFundingInstrumentsToAdd = list;
            this.paymentFundingInstruments = list2;
        }

        public final java.lang.Object getPaymentAuthorizationLink() {
            return this.paymentAuthorizationLink;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> getSupportedFundingInstrumentsToAdd() {
            return this.supportedFundingInstrumentsToAdd;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument> getPaymentFundingInstruments() {
            return this.paymentFundingInstruments;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.paymentAuthorizationLink;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> list = this.supportedFundingInstrumentsToAdd;
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument> list2 = this.paymentFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplAutopaySetupOverview(paymentAuthorizationLink=");
            sb.append(obj);
            sb.append(", supportedFundingInstrumentsToAdd=");
            sb.append(list);
            sb.append(", paymentFundingInstruments=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.paymentAuthorizationLink;
            return ((((obj == null ? 0 : obj.hashCode()) * 31) + this.supportedFundingInstrumentsToAdd.hashCode()) * 31) + this.paymentFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthorizationLink, bnplAutopaySetupOverview.paymentAuthorizationLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedFundingInstrumentsToAdd, bnplAutopaySetupOverview.supportedFundingInstrumentsToAdd) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstruments, bnplAutopaySetupOverview.paymentFundingInstruments);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview copy(java.lang.Object paymentAuthorizationLink, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> supportedFundingInstrumentsToAdd, java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument> paymentFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedFundingInstrumentsToAdd, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstruments, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview(paymentAuthorizationLink, supportedFundingInstrumentsToAdd, paymentFundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument> component3() {
            return this.paymentFundingInstruments;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingSupportedPaymentFundingInstrumentType> component2() {
            return this.supportedFundingInstrumentsToAdd;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPaymentAuthorizationLink() {
            return this.paymentAuthorizationLink;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.BnplAutopaySetupOverview bnplAutopaySetupOverview, java.lang.Object obj, java.util.List list, java.util.List list2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = bnplAutopaySetupOverview.paymentAuthorizationLink;
            }
            if ((i & 2) != 0) {
                list = bnplAutopaySetupOverview.supportedFundingInstrumentsToAdd;
            }
            if ((i & 4) != 0) {
                list2 = bnplAutopaySetupOverview.paymentFundingInstruments;
            }
            return bnplAutopaySetupOverview.copy(obj, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$PaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "bnplServicingPaymentFundingInstrumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$PaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "getBnplServicingPaymentFundingInstrumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingPaymentFundingInstrumentFragment, paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument(__typename, bnplServicingPaymentFundingInstrumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment getBnplServicingPaymentFundingInstrumentFragment() {
            return this.bnplServicingPaymentFundingInstrumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery.PaymentFundingInstrument paymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingPaymentFundingInstrumentFragment = paymentFundingInstrument.bnplServicingPaymentFundingInstrumentFragment;
            }
            return paymentFundingInstrument.copy(str, bnplServicingPaymentFundingInstrumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplAutopaySetupOverviewQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBnplAutopaySetupOverview($input: BNPLAutopaySetupOverviewInput!) { bnplAutopaySetupOverview(input: $input) { paymentAuthorizationLink supportedFundingInstrumentsToAdd paymentFundingInstruments { __typename ...BnplServicingPaymentFundingInstrumentFragment } } }  fragment BnplServicingMoneyFragment on Money { currencyCode value }  fragment BnplServicingBalanceFragment on Balance { id availableAmount { __typename ...BnplServicingMoneyFragment } }  fragment BnplServicingBankAccountFragment on BankAccount { id lastNChars bankIssuer: issuer { name } institutionImages { url } type }  fragment BnplServicingCardFragment on Card { id brand expirationDate lastNChars productClass nickName issuer { name } cardArt { primaryImage { baseCdnLinkPath mimeType height width } thumbnailImage { baseCdnLinkPath mimeType height width } backgroundColor foregroundColor labelColor } }  fragment BnplServicingPaymentFundingInstrumentFragment on BNPLServicingPaymentFundingInstrument { __typename ... on Balance { __typename ...BnplServicingBalanceFragment } ... on BankAccount { __typename ...BnplServicingBankAccountFragment } ... on Card { __typename ...BnplServicingCardFragment } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput bNPLAutopaySetupOverviewInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBnplAutopaySetupOverviewQuery(input=");
        sb.append(bNPLAutopaySetupOverviewInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery) other).input);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery copy(com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery copy$default(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplAutopaySetupOverviewQuery getBnplAutopaySetupOverviewQuery, com.paypal.oslo.api.graphql.schema.type.BNPLAutopaySetupOverviewInput bNPLAutopaySetupOverviewInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLAutopaySetupOverviewInput = getBnplAutopaySetupOverviewQuery.input;
        }
        return getBnplAutopaySetupOverviewQuery.copy(bNPLAutopaySetupOverviewInput);
    }
}
