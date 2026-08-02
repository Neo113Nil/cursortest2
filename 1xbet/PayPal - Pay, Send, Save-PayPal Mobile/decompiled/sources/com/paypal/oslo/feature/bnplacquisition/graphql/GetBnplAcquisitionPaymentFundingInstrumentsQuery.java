package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006*+,-.)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationPaymentFundingInstrumentsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationPaymentFundingInstrumentsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationPaymentFundingInstrumentsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationPaymentFundingInstrumentsInput;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationPaymentFundingInstrumentsInput;", "getInput", "Companion", "Data", "BnplApplicationPaymentFundingInstruments", "Item", "OnBankAccount", "OnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetBnplAcquisitionPaymentFundingInstrumentsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "a770d9fc839a23407b81830891f243c259b57b6a12b47b3e1046b5880642ec0a";
    public static final java.lang.String OPERATION_NAME = "GetBnplAcquisitionPaymentFundingInstruments";
    private final com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Companion(null);
    public static final int $stable = 8;

    public GetBnplAcquisitionPaymentFundingInstrumentsQuery(com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput bNPLApplicationPaymentFundingInstrumentsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLApplicationPaymentFundingInstrumentsInput, "");
        this.input = bNPLApplicationPaymentFundingInstrumentsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput getInput() {
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplAcquisitionPaymentFundingInstrumentsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplAcquisitionPaymentFundingInstrumentsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.GetBnplAcquisitionPaymentFundingInstrumentsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$BnplApplicationPaymentFundingInstruments;", "bnplApplicationPaymentFundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$BnplApplicationPaymentFundingInstruments;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$BnplApplicationPaymentFundingInstruments;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$BnplApplicationPaymentFundingInstruments;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$BnplApplicationPaymentFundingInstruments;", "getBnplApplicationPaymentFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments) {
            this.bnplApplicationPaymentFundingInstruments = bnplApplicationPaymentFundingInstruments;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments getBnplApplicationPaymentFundingInstruments() {
            return this.bnplApplicationPaymentFundingInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments = this.bnplApplicationPaymentFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(bnplApplicationPaymentFundingInstruments=");
            sb.append(bnplApplicationPaymentFundingInstruments);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments = this.bnplApplicationPaymentFundingInstruments;
            if (bnplApplicationPaymentFundingInstruments == null) {
                return 0;
            }
            return bnplApplicationPaymentFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplApplicationPaymentFundingInstruments, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data) other).bnplApplicationPaymentFundingInstruments);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data(bnplApplicationPaymentFundingInstruments);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments getBnplApplicationPaymentFundingInstruments() {
            return this.bnplApplicationPaymentFundingInstruments;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bnplApplicationPaymentFundingInstruments = data.bnplApplicationPaymentFundingInstruments;
            }
            return data.copy(bnplApplicationPaymentFundingInstruments);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$BnplApplicationPaymentFundingInstruments;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$BnplApplicationPaymentFundingInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BnplApplicationPaymentFundingInstruments {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item> items;

        public BnplApplicationPaymentFundingInstruments(java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplApplicationPaymentFundingInstruments(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments) other).items);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments(items);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.BnplApplicationPaymentFundingInstruments bnplApplicationPaymentFundingInstruments, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = bnplApplicationPaymentFundingInstruments.items;
            }
            return bnplApplicationPaymentFundingInstruments.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnBankAccount;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnCard;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard;

        public Item(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
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
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode2 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard = this.onCard;
            return (((hashCode * 31) + hashCode2) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item item = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, item.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, item.onCard);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item(__typename, onBankAccount, onCard);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.Item item, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount = item.onBankAccount;
            }
            if ((i & 4) != 0) {
                onCard = item.onCard;
            }
            return item.copy(str, onBankAccount, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnBankAccount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "bnplAcquisitionBankFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "getBnplAcquisitionBankFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionBankFragment, onBankAccount.bnplAcquisitionBankFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount(__typename, bnplAcquisitionBankFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnBankAccount onBankAccount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionBankFragment = onBankAccount.bnplAcquisitionBankFragment;
            }
            return onBankAccount.copy(str, bnplAcquisitionBankFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "bnplAcquisitionCardFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "getBnplAcquisitionCardFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionCardFragment, onCard.bnplAcquisitionCardFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard(__typename, bnplAcquisitionCardFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery.OnCard onCard, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionCardFragment = onCard.bnplAcquisitionCardFragment;
            }
            return onCard.copy(str, bnplAcquisitionCardFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplAcquisitionPaymentFundingInstrumentsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBnplAcquisitionPaymentFundingInstruments($input: BNPLApplicationPaymentFundingInstrumentsInput!) { bnplApplicationPaymentFundingInstruments(input: $input) { items { __typename ... on BankAccount { __typename ...BnplAcquisitionBankFragment } ... on Card { __typename ...BnplAcquisitionCardFragment } } } }  fragment BnplAcquisitionBankFragment on BankAccount { id type lastNChars bankIssuer: issuer { name } institutionImages { url } }  fragment BnplAcquisitionCardFragment on Card { id cardIssuer: issuer { name } lastNChars cardArt { primaryImage { baseCdnLinkPath } } productClass }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput bNPLApplicationPaymentFundingInstrumentsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBnplAcquisitionPaymentFundingInstrumentsQuery(input=");
        sb.append(bNPLApplicationPaymentFundingInstrumentsInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery) other).input);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery copy(com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery getBnplAcquisitionPaymentFundingInstrumentsQuery, com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput bNPLApplicationPaymentFundingInstrumentsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLApplicationPaymentFundingInstrumentsInput = getBnplAcquisitionPaymentFundingInstrumentsQuery.input;
        }
        return getBnplAcquisitionPaymentFundingInstrumentsQuery.copy(bNPLApplicationPaymentFundingInstrumentsInput);
    }
}
