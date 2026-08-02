package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RequestPhysicalDebitInstrumentInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestPhysicalDebitInstrumentInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RequestPhysicalDebitInstrumentInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RequestPhysicalDebitInstrumentInput;)Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RequestPhysicalDebitInstrumentInput;", "getInput", "Companion", "Data", "RequestPhysicalDebitInstrument", "DebitInstrument", "Shipment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RequestPhysicalDebitCardMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data> {
    public static final java.lang.String OPERATION_ID = "54e7dd572a0fa826b6d4428a9e31d8779e332fbf6e2a3eda679b1d9d8a805993";
    public static final java.lang.String OPERATION_NAME = "RequestPhysicalDebitCard";
    private final com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Companion(null);
    public static final int $stable = 8;

    public RequestPhysicalDebitCardMutation(com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput requestPhysicalDebitInstrumentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalDebitInstrumentInput, "");
        this.input = requestPhysicalDebitInstrumentInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.RequestPhysicalDebitCardMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.RequestPhysicalDebitCardMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.RequestPhysicalDebitCardMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$RequestPhysicalDebitInstrument;", "requestPhysicalDebitInstrument", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$RequestPhysicalDebitInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$RequestPhysicalDebitInstrument;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$RequestPhysicalDebitInstrument;)Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$RequestPhysicalDebitInstrument;", "getRequestPhysicalDebitInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument requestPhysicalDebitInstrument;

        public Data(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument requestPhysicalDebitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalDebitInstrument, "");
            this.requestPhysicalDebitInstrument = requestPhysicalDebitInstrument;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument getRequestPhysicalDebitInstrument() {
            return this.requestPhysicalDebitInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument requestPhysicalDebitInstrument = this.requestPhysicalDebitInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(requestPhysicalDebitInstrument=");
            sb.append(requestPhysicalDebitInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requestPhysicalDebitInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestPhysicalDebitInstrument, ((com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data) other).requestPhysicalDebitInstrument);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data copy(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument requestPhysicalDebitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalDebitInstrument, "");
            return new com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data(requestPhysicalDebitInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument getRequestPhysicalDebitInstrument() {
            return this.requestPhysicalDebitInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data data, com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument requestPhysicalDebitInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestPhysicalDebitInstrument = data.requestPhysicalDebitInstrument;
            }
            return data.copy(requestPhysicalDebitInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$RequestPhysicalDebitInstrument;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$DebitInstrument;", "debitInstrument", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$DebitInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$DebitInstrument;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$DebitInstrument;)Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$RequestPhysicalDebitInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$DebitInstrument;", "getDebitInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestPhysicalDebitInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument debitInstrument;

        public RequestPhysicalDebitInstrument(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument debitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            this.debitInstrument = debitInstrument;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument debitInstrument = this.debitInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestPhysicalDebitInstrument(debitInstrument=");
            sb.append(debitInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, ((com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument) other).debitInstrument);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument copy(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument debitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            return new com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument(debitInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument copy$default(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.RequestPhysicalDebitInstrument requestPhysicalDebitInstrument, com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument debitInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrument = requestPhysicalDebitInstrument.debitInstrument;
            }
            return requestPhysicalDebitInstrument.copy(debitInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$DebitInstrument;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Shipment;", "shipment", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Shipment;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Shipment;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Shipment;)Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$DebitInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Shipment;", "getShipment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment;

        public DebitInstrument(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment) {
            this.shipment = shipment;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment getShipment() {
            return this.shipment;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment = this.shipment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrument(shipment=");
            sb.append(shipment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment = this.shipment;
            if (shipment == null) {
                return 0;
            }
            return shipment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipment, ((com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument) other).shipment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument copy(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment) {
            return new com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument(shipment);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment getShipment() {
            return this.shipment;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument copy$default(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                shipment = debitInstrument.shipment;
            }
            return debitInstrument.copy(shipment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Shipment;", "", "estimatedArrivalDate", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Shipment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getEstimatedArrivalDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Shipment {
        public static final int $stable = 8;
        private final java.lang.Object estimatedArrivalDate;

        public Shipment(java.lang.Object obj) {
            this.estimatedArrivalDate = obj;
        }

        public final java.lang.Object getEstimatedArrivalDate() {
            return this.estimatedArrivalDate;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.estimatedArrivalDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Shipment(estimatedArrivalDate=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.estimatedArrivalDate;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedArrivalDate, ((com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment) other).estimatedArrivalDate);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment copy(java.lang.Object estimatedArrivalDate) {
            return new com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment(estimatedArrivalDate);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getEstimatedArrivalDate() {
            return this.estimatedArrivalDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment copy$default(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = shipment.estimatedArrivalDate;
            }
            return shipment.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RequestPhysicalDebitCard($input: RequestPhysicalDebitInstrumentInput!) { requestPhysicalDebitInstrument(input: $input) { debitInstrument { shipment { estimatedArrivalDate } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput requestPhysicalDebitInstrumentInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestPhysicalDebitCardMutation(input=");
        sb.append(requestPhysicalDebitInstrumentInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation copy(com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation copy$default(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation requestPhysicalDebitCardMutation, com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput requestPhysicalDebitInstrumentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            requestPhysicalDebitInstrumentInput = requestPhysicalDebitCardMutation.input;
        }
        return requestPhysicalDebitCardMutation.copy(requestPhysicalDebitInstrumentInput);
    }
}
