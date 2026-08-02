package com.paypal.oslo.feature.packagetracking.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b*+,-./0123)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageInput;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageInput;", "getInput", "Companion", "Data", "ShipmentPackage", "DestinationAddress", "Carrier", "ShipmentUpdate", "Location", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "OnMerchant", "OnShipmentPackageExternalMerchant", "Item"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetPackageDetailQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data> {
    public static final java.lang.String OPERATION_ID = "ad0a7f9075b4024be362eb2397ca9944be7d9c6daabf7e549d761b6f78be79a0";
    public static final java.lang.String OPERATION_NAME = "GetPackageDetail";
    private final com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Companion(null);
    public static final int $stable = 8;

    public GetPackageDetailQuery(com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput shipmentPackageInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shipmentPackageInput, "");
        this.input = shipmentPackageInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput getInput() {
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
        com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageDetailQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.GetPackageDetailQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.packagetracking.graphql.selections.GetPackageDetailQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;", "shipmentPackage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;", "getShipmentPackage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage;

        public Data(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage) {
            this.shipmentPackage = shipmentPackage;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage getShipmentPackage() {
            return this.shipmentPackage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage = this.shipmentPackage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(shipmentPackage=");
            sb.append(shipmentPackage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage = this.shipmentPackage;
            if (shipmentPackage == null) {
                return 0;
            }
            return shipmentPackage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipmentPackage, ((com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data) other).shipmentPackage);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data copy(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage) {
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data(shipmentPackage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage getShipmentPackage() {
            return this.shipmentPackage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Data data, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                shipmentPackage = data.shipmentPackage;
            }
            return data.copy(shipmentPackage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b9\u00106J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010%J\u0010\u0010;\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010%J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b>\u00106J\u0012\u0010?\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\bA\u0010'J\u0096\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\u001a2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bJ\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010'R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bO\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010K\u001a\u0004\bP\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bS\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bT\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bU\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bV\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bW\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\b[\u00104R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\b]\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010^\u001a\u0004\b_\u00108R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b`\u00106R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\ba\u0010%R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010b\u001a\u0004\bc\u0010<R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bd\u0010%R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\\\u001a\u0004\be\u00106R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010f\u001a\u0004\bg\u0010@R\u001c\u0010!\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010M\u001a\u0004\bh\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;", "", "", "id", "logoImageUrl", "trackingNumber", "transactionNumber", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "status", "statusMessage", "deliveryTime", "exceptionSummary", "exceptionDetails", "trackingLink", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$DestinationAddress;", "destinationAddress", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Carrier;", "carrier", "", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentUpdate;", "shipmentUpdates", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Merchant;", "merchant", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Item;", "items", "packageNickname", "", "markedAsDelivered", "orderNumber", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingShipmentTag;", "tags", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;", "packageSource", "orderManagementUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$DestinationAddress;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Carrier;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Merchant;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$DestinationAddress;", "component12", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Carrier;", "component13", "()Ljava/util/List;", "component14", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Merchant;", "component15", "component16", "component17", "()Z", "component18", "component19", "component20", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;", "component21", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$DestinationAddress;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Carrier;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Merchant;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentPackage;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getLogoImageUrl", "getTrackingNumber", "getTransactionNumber", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "getStatus", "getStatusMessage", "getDeliveryTime", "getExceptionSummary", "getExceptionDetails", "getTrackingLink", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$DestinationAddress;", "getDestinationAddress", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Carrier;", "getCarrier", "Ljava/util/List;", "getShipmentUpdates", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Merchant;", "getMerchant", "getItems", "getPackageNickname", "Z", "getMarkedAsDelivered", "getOrderNumber", "getTags", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingSource;", "getPackageSource", "getOrderManagementUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShipmentPackage {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier;
        private final java.lang.Object deliveryTime;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress;
        private final java.lang.String exceptionDetails;
        private final java.lang.String exceptionSummary;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> items;
        private final java.lang.Object logoImageUrl;
        private final boolean markedAsDelivered;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant;
        private final java.lang.Object orderManagementUrl;
        private final java.lang.String orderNumber;
        private final java.lang.String packageNickname;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageSource;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> shipmentUpdates;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus status;
        private final java.lang.String statusMessage;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> tags;
        private final java.lang.Object trackingLink;
        private final java.lang.String trackingNumber;
        private final java.lang.String transactionNumber;

        /* JADX WARN: Multi-variable type inference failed */
        public ShipmentPackage(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus, java.lang.String str4, java.lang.Object obj2, java.lang.String str5, java.lang.String str6, java.lang.Object obj3, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> list, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> list2, java.lang.String str7, boolean z, java.lang.String str8, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list3, com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageTrackingSource, java.lang.Object obj4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingStatus, "");
            this.id = str;
            this.logoImageUrl = obj;
            this.trackingNumber = str2;
            this.transactionNumber = str3;
            this.status = packageTrackingStatus;
            this.statusMessage = str4;
            this.deliveryTime = obj2;
            this.exceptionSummary = str5;
            this.exceptionDetails = str6;
            this.trackingLink = obj3;
            this.destinationAddress = destinationAddress;
            this.carrier = carrier;
            this.shipmentUpdates = list;
            this.merchant = merchant;
            this.items = list2;
            this.packageNickname = str7;
            this.markedAsDelivered = z;
            this.orderNumber = str8;
            this.tags = list3;
            this.packageSource = packageTrackingSource;
            this.orderManagementUrl = obj4;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.lang.String getTrackingNumber() {
            return this.trackingNumber;
        }

        public final java.lang.String getTransactionNumber() {
            return this.transactionNumber;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getStatusMessage() {
            return this.statusMessage;
        }

        public final java.lang.Object getDeliveryTime() {
            return this.deliveryTime;
        }

        public final java.lang.String getExceptionSummary() {
            return this.exceptionSummary;
        }

        public final java.lang.String getExceptionDetails() {
            return this.exceptionDetails;
        }

        public final java.lang.Object getTrackingLink() {
            return this.trackingLink;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress getDestinationAddress() {
            return this.destinationAddress;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier getCarrier() {
            return this.carrier;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> getShipmentUpdates() {
            return this.shipmentUpdates;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant getMerchant() {
            return this.merchant;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String getPackageNickname() {
            return this.packageNickname;
        }

        public final boolean getMarkedAsDelivered() {
            return this.markedAsDelivered;
        }

        public final java.lang.String getOrderNumber() {
            return this.orderNumber;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> getTags() {
            return this.tags;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource getPackageSource() {
            return this.packageSource;
        }

        public final java.lang.Object getOrderManagementUrl() {
            return this.orderManagementUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.logoImageUrl;
            java.lang.String str2 = this.trackingNumber;
            java.lang.String str3 = this.transactionNumber;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = this.status;
            java.lang.String str4 = this.statusMessage;
            java.lang.Object obj2 = this.deliveryTime;
            java.lang.String str5 = this.exceptionSummary;
            java.lang.String str6 = this.exceptionDetails;
            java.lang.Object obj3 = this.trackingLink;
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress = this.destinationAddress;
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier = this.carrier;
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> list = this.shipmentUpdates;
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant = this.merchant;
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> list2 = this.items;
            java.lang.String str7 = this.packageNickname;
            boolean z = this.markedAsDelivered;
            java.lang.String str8 = this.orderNumber;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list3 = this.tags;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageTrackingSource = this.packageSource;
            java.lang.Object obj4 = this.orderManagementUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShipmentPackage(id=");
            sb.append(str);
            sb.append(", logoImageUrl=");
            sb.append(obj);
            sb.append(", trackingNumber=");
            sb.append(str2);
            sb.append(", transactionNumber=");
            sb.append(str3);
            sb.append(", status=");
            sb.append(packageTrackingStatus);
            sb.append(", statusMessage=");
            sb.append(str4);
            sb.append(", deliveryTime=");
            sb.append(obj2);
            sb.append(", exceptionSummary=");
            sb.append(str5);
            sb.append(", exceptionDetails=");
            sb.append(str6);
            sb.append(", trackingLink=");
            sb.append(obj3);
            sb.append(", destinationAddress=");
            sb.append(destinationAddress);
            sb.append(", carrier=");
            sb.append(carrier);
            sb.append(", shipmentUpdates=");
            sb.append(list);
            sb.append(", merchant=");
            sb.append(merchant);
            sb.append(", items=");
            sb.append(list2);
            sb.append(", packageNickname=");
            sb.append(str7);
            sb.append(", markedAsDelivered=");
            sb.append(z);
            sb.append(", orderNumber=");
            sb.append(str8);
            sb.append(", tags=");
            sb.append(list3);
            sb.append(", packageSource=");
            sb.append(packageTrackingSource);
            sb.append(", orderManagementUrl=");
            sb.append(obj4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.logoImageUrl;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            int hashCode3 = this.trackingNumber.hashCode();
            java.lang.String str = this.transactionNumber;
            int hashCode4 = str == null ? 0 : str.hashCode();
            int hashCode5 = this.status.hashCode();
            java.lang.String str2 = this.statusMessage;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            java.lang.Object obj2 = this.deliveryTime;
            int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.String str3 = this.exceptionSummary;
            int hashCode8 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.exceptionDetails;
            int hashCode9 = str4 == null ? 0 : str4.hashCode();
            java.lang.Object obj3 = this.trackingLink;
            int hashCode10 = obj3 == null ? 0 : obj3.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress = this.destinationAddress;
            int hashCode11 = destinationAddress == null ? 0 : destinationAddress.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier = this.carrier;
            int hashCode12 = carrier == null ? 0 : carrier.hashCode();
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> list = this.shipmentUpdates;
            int hashCode13 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant = this.merchant;
            int hashCode14 = merchant == null ? 0 : merchant.hashCode();
            java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> list2 = this.items;
            int hashCode15 = list2 == null ? 0 : list2.hashCode();
            java.lang.String str5 = this.packageNickname;
            int hashCode16 = str5 == null ? 0 : str5.hashCode();
            int hashCode17 = java.lang.Boolean.hashCode(this.markedAsDelivered);
            java.lang.String str6 = this.orderNumber;
            int hashCode18 = str6 == null ? 0 : str6.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> list3 = this.tags;
            int hashCode19 = list3 == null ? 0 : list3.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageTrackingSource = this.packageSource;
            int hashCode20 = packageTrackingSource == null ? 0 : packageTrackingSource.hashCode();
            java.lang.Object obj4 = this.orderManagementUrl;
            return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (obj4 != null ? obj4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage shipmentPackage = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, shipmentPackage.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoImageUrl, shipmentPackage.logoImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingNumber, shipmentPackage.trackingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionNumber, shipmentPackage.transactionNumber) && this.status == shipmentPackage.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusMessage, shipmentPackage.statusMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.deliveryTime, shipmentPackage.deliveryTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.exceptionSummary, shipmentPackage.exceptionSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.exceptionDetails, shipmentPackage.exceptionDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingLink, shipmentPackage.trackingLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationAddress, shipmentPackage.destinationAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrier, shipmentPackage.carrier) && kotlin.jvm.internal.Intrinsics.areEqual(this.shipmentUpdates, shipmentPackage.shipmentUpdates) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, shipmentPackage.merchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, shipmentPackage.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageNickname, shipmentPackage.packageNickname) && this.markedAsDelivered == shipmentPackage.markedAsDelivered && kotlin.jvm.internal.Intrinsics.areEqual(this.orderNumber, shipmentPackage.orderNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, shipmentPackage.tags) && this.packageSource == shipmentPackage.packageSource && kotlin.jvm.internal.Intrinsics.areEqual(this.orderManagementUrl, shipmentPackage.orderManagementUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage copy(java.lang.String id, java.lang.Object logoImageUrl, java.lang.String trackingNumber, java.lang.String transactionNumber, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus status, java.lang.String statusMessage, java.lang.Object deliveryTime, java.lang.String exceptionSummary, java.lang.String exceptionDetails, java.lang.Object trackingLink, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> shipmentUpdates, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant, java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> items, java.lang.String packageNickname, boolean markedAsDelivered, java.lang.String orderNumber, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> tags, com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource packageSource, java.lang.Object orderManagementUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentPackage(id, logoImageUrl, trackingNumber, transactionNumber, status, statusMessage, deliveryTime, exceptionSummary, exceptionDetails, trackingLink, destinationAddress, carrier, shipmentUpdates, merchant, items, packageNickname, markedAsDelivered, orderNumber, tags, packageSource, orderManagementUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getExceptionDetails() {
            return this.exceptionDetails;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getExceptionSummary() {
            return this.exceptionSummary;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getDeliveryTime() {
            return this.deliveryTime;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getStatusMessage() {
            return this.statusMessage;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getTransactionNumber() {
            return this.transactionNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTrackingNumber() {
            return this.trackingNumber;
        }

        /* renamed from: component21, reason: from getter */
        public final java.lang.Object getOrderManagementUrl() {
            return this.orderManagementUrl;
        }

        /* renamed from: component20, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingSource getPackageSource() {
            return this.packageSource;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingShipmentTag> component19() {
            return this.tags;
        }

        /* renamed from: component18, reason: from getter */
        public final java.lang.String getOrderNumber() {
            return this.orderNumber;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getMarkedAsDelivered() {
            return this.markedAsDelivered;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.String getPackageNickname() {
            return this.packageNickname;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item> component15() {
            return this.items;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant getMerchant() {
            return this.merchant;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate> component13() {
            return this.shipmentUpdates;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier getCarrier() {
            return this.carrier;
        }

        /* renamed from: component11, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress getDestinationAddress() {
            return this.destinationAddress;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Object getTrackingLink() {
            return this.trackingLink;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$DestinationAddress;", "", "", "adminArea2", "adminArea1", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$DestinationAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdminArea2", "getAdminArea1", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DestinationAddress {
        public static final int $stable = 8;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public DestinationAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.adminArea2 = str;
            this.adminArea1 = str2;
            this.postalCode = str3;
            this.countryCode = obj;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.adminArea2;
            java.lang.String str2 = this.adminArea1;
            java.lang.String str3 = this.postalCode;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DestinationAddress(adminArea2=");
            sb.append(str);
            sb.append(", adminArea1=");
            sb.append(str2);
            sb.append(", postalCode=");
            sb.append(str3);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.adminArea2;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.adminArea1;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.postalCode;
            return (((((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, destinationAddress.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, destinationAddress.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, destinationAddress.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, destinationAddress.countryCode);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress copy(java.lang.String adminArea2, java.lang.String adminArea1, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress(adminArea2, adminArea1, postalCode, countryCode);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.DestinationAddress destinationAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = destinationAddress.adminArea2;
            }
            if ((i & 2) != 0) {
                str2 = destinationAddress.adminArea1;
            }
            if ((i & 4) != 0) {
                str3 = destinationAddress.postalCode;
            }
            if ((i & 8) != 0) {
                obj = destinationAddress.countryCode;
            }
            return destinationAddress.copy(str, str2, str3, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Carrier;", "", "", "name", "logoImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Carrier;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getLogoImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Carrier {
        public static final int $stable = 8;
        private final java.lang.Object logoImageUrl;
        private final java.lang.String name;

        public Carrier(java.lang.String str, java.lang.Object obj) {
            this.name = str;
            this.logoImageUrl = obj;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.logoImageUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Carrier(name=");
            sb.append(str);
            sb.append(", logoImageUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.logoImageUrl;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, carrier.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoImageUrl, carrier.logoImageUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier copy(java.lang.String name2, java.lang.Object logoImageUrl) {
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier(name2, logoImageUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Carrier carrier, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = carrier.name;
            }
            if ((i & 2) != 0) {
                obj = carrier.logoImageUrl;
            }
            return carrier.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentUpdate;", "", "", "checkPointMessage", "updateTime", "updateTimeDescription", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "shipmentStatus", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Location;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Location;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "component5", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Location;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Location;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$ShipmentUpdate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCheckPointMessage", "Ljava/lang/Object;", "getUpdateTime", "getUpdateTimeDescription", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "getShipmentStatus", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Location;", "getLocation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShipmentUpdate {
        public static final int $stable = 8;
        private final java.lang.String checkPointMessage;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location;
        private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus shipmentStatus;
        private final java.lang.Object updateTime;
        private final java.lang.String updateTimeDescription;

        public ShipmentUpdate(java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location) {
            this.checkPointMessage = str;
            this.updateTime = obj;
            this.updateTimeDescription = str2;
            this.shipmentStatus = packageTrackingStatus;
            this.location = location;
        }

        public final java.lang.String getCheckPointMessage() {
            return this.checkPointMessage;
        }

        public final java.lang.Object getUpdateTime() {
            return this.updateTime;
        }

        public final java.lang.String getUpdateTimeDescription() {
            return this.updateTimeDescription;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getShipmentStatus() {
            return this.shipmentStatus;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location getLocation() {
            return this.location;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.checkPointMessage;
            java.lang.Object obj = this.updateTime;
            java.lang.String str2 = this.updateTimeDescription;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = this.shipmentStatus;
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location = this.location;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShipmentUpdate(checkPointMessage=");
            sb.append(str);
            sb.append(", updateTime=");
            sb.append(obj);
            sb.append(", updateTimeDescription=");
            sb.append(str2);
            sb.append(", shipmentStatus=");
            sb.append(packageTrackingStatus);
            sb.append(", location=");
            sb.append(location);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.checkPointMessage;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.updateTime;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            java.lang.String str2 = this.updateTimeDescription;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = this.shipmentStatus;
            int hashCode4 = packageTrackingStatus == null ? 0 : packageTrackingStatus.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location = this.location;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (location != null ? location.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate shipmentUpdate = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.checkPointMessage, shipmentUpdate.checkPointMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateTime, shipmentUpdate.updateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateTimeDescription, shipmentUpdate.updateTimeDescription) && this.shipmentStatus == shipmentUpdate.shipmentStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.location, shipmentUpdate.location);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate copy(java.lang.String checkPointMessage, java.lang.Object updateTime, java.lang.String updateTimeDescription, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus shipmentStatus, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location) {
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate(checkPointMessage, updateTime, updateTimeDescription, shipmentStatus, location);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location getLocation() {
            return this.location;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus getShipmentStatus() {
            return this.shipmentStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getUpdateTimeDescription() {
            return this.updateTimeDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getUpdateTime() {
            return this.updateTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCheckPointMessage() {
            return this.checkPointMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.ShipmentUpdate shipmentUpdate, java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = shipmentUpdate.checkPointMessage;
            }
            if ((i & 2) != 0) {
                obj = shipmentUpdate.updateTime;
            }
            java.lang.Object obj3 = obj;
            if ((i & 4) != 0) {
                str2 = shipmentUpdate.updateTimeDescription;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                packageTrackingStatus = shipmentUpdate.shipmentStatus;
            }
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus2 = packageTrackingStatus;
            if ((i & 16) != 0) {
                location = shipmentUpdate.location;
            }
            return shipmentUpdate.copy(str, obj3, str3, packageTrackingStatus2, location);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ>\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Location;", "", "", "adminArea2", "adminArea1", "countryCode", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Location;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdminArea2", "getAdminArea1", "Ljava/lang/Object;", "getCountryCode", "getPostalCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Location {
        public static final int $stable = 8;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Location(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.adminArea2 = str;
            this.adminArea1 = str2;
            this.countryCode = obj;
            this.postalCode = str3;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.adminArea2;
            java.lang.String str2 = this.adminArea1;
            java.lang.Object obj = this.countryCode;
            java.lang.String str3 = this.postalCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(adminArea2=");
            sb.append(str);
            sb.append(", adminArea1=");
            sb.append(str2);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(", postalCode=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.adminArea2;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.adminArea1;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            int hashCode3 = this.countryCode.hashCode();
            java.lang.String str3 = this.postalCode;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, location.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, location.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, location.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, location.postalCode);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location copy(java.lang.String adminArea2, java.lang.String adminArea1, java.lang.Object countryCode, java.lang.String postalCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location(adminArea2, adminArea1, countryCode, postalCode);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Location location, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = location.adminArea2;
            }
            if ((i & 2) != 0) {
                str2 = location.adminArea1;
            }
            if ((i & 4) != 0) {
                obj = location.countryCode;
            }
            if ((i & 8) != 0) {
                str3 = location.postalCode;
            }
            return location.copy(str, str2, obj, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Merchant;", "", "", "__typename", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnMerchant;", "onMerchant", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnShipmentPackageExternalMerchant;", "onShipmentPackageExternalMerchant", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnMerchant;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnShipmentPackageExternalMerchant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnMerchant;", "component3", "()Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnShipmentPackageExternalMerchant;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnMerchant;Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnShipmentPackageExternalMerchant;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnMerchant;", "getOnMerchant", "Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnShipmentPackageExternalMerchant;", "getOnShipmentPackageExternalMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant onMerchant;
        private final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant;

        public Merchant(java.lang.String str, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant onMerchant, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMerchant = onMerchant;
            this.onShipmentPackageExternalMerchant = onShipmentPackageExternalMerchant;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant getOnMerchant() {
            return this.onMerchant;
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant getOnShipmentPackageExternalMerchant() {
            return this.onShipmentPackageExternalMerchant;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant onMerchant = this.onMerchant;
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant = this.onShipmentPackageExternalMerchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(__typename=");
            sb.append(str);
            sb.append(", onMerchant=");
            sb.append(onMerchant);
            sb.append(", onShipmentPackageExternalMerchant=");
            sb.append(onShipmentPackageExternalMerchant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant onMerchant = this.onMerchant;
            int hashCode2 = onMerchant == null ? 0 : onMerchant.hashCode();
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant = this.onShipmentPackageExternalMerchant;
            return (((hashCode * 31) + hashCode2) * 31) + (onShipmentPackageExternalMerchant != null ? onShipmentPackageExternalMerchant.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, merchant.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMerchant, merchant.onMerchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.onShipmentPackageExternalMerchant, merchant.onShipmentPackageExternalMerchant);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant copy(java.lang.String __typename, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant onMerchant, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant(__typename, onMerchant, onShipmentPackageExternalMerchant);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant getOnShipmentPackageExternalMerchant() {
            return this.onShipmentPackageExternalMerchant;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant getOnMerchant() {
            return this.onMerchant;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Merchant merchant, java.lang.String str, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant onMerchant, com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = merchant.__typename;
            }
            if ((i & 2) != 0) {
                onMerchant = merchant.onMerchant;
            }
            if ((i & 4) != 0) {
                onShipmentPackageExternalMerchant = merchant.onShipmentPackageExternalMerchant;
            }
            return merchant.copy(str, onMerchant, onShipmentPackageExternalMerchant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnMerchant;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnMerchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMerchant {
        public static final int $stable = 0;
        private final java.lang.String id;

        public OnMerchant(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMerchant(id=");
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
            return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant) other).id);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnMerchant onMerchant, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMerchant.id;
            }
            return onMerchant.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnShipmentPackageExternalMerchant;", "", "", "name", "logoImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$OnShipmentPackageExternalMerchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getLogoImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnShipmentPackageExternalMerchant {
        public static final int $stable = 8;
        private final java.lang.Object logoImageUrl;
        private final java.lang.String name;

        public OnShipmentPackageExternalMerchant(java.lang.String str, java.lang.Object obj) {
            this.name = str;
            this.logoImageUrl = obj;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Object obj = this.logoImageUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnShipmentPackageExternalMerchant(name=");
            sb.append(str);
            sb.append(", logoImageUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.logoImageUrl;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, onShipmentPackageExternalMerchant.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoImageUrl, onShipmentPackageExternalMerchant.logoImageUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant copy(java.lang.String name2, java.lang.Object logoImageUrl) {
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant(name2, logoImageUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoImageUrl() {
            return this.logoImageUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.OnShipmentPackageExternalMerchant onShipmentPackageExternalMerchant, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onShipmentPackageExternalMerchant.name;
            }
            if ((i & 2) != 0) {
                obj = onShipmentPackageExternalMerchant.logoImageUrl;
            }
            return onShipmentPackageExternalMerchant.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Item;", "", "", "name", "", "quantity", "imageUrl", "", "Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageItemTag;", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getQuantity", "Ljava/lang/Object;", "getImageUrl", "Ljava/util/List;", "getTags"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.Object imageUrl;
        private final java.lang.String name;
        private final java.lang.Integer quantity;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, java.lang.Integer num, java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.quantity = num;
            this.imageUrl = obj;
            this.tags = list;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Integer getQuantity() {
            return this.quantity;
        }

        public final java.lang.Object getImageUrl() {
            return this.imageUrl;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> getTags() {
            return this.tags;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.Integer num = this.quantity;
            java.lang.Object obj = this.imageUrl;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list = this.tags;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(name=");
            sb.append(str);
            sb.append(", quantity=");
            sb.append(num);
            sb.append(", imageUrl=");
            sb.append(obj);
            sb.append(", tags=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.Integer num = this.quantity;
            int hashCode2 = num == null ? 0 : num.hashCode();
            java.lang.Object obj = this.imageUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list = this.tags;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item item = (com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, item.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, item.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, item.tags);
        }

        public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item copy(java.lang.String name2, java.lang.Integer quantity, java.lang.Object imageUrl, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item(name2, quantity, imageUrl, tags);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> component4() {
            return this.tags;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getQuantity() {
            return this.quantity;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery.Item item, java.lang.String str, java.lang.Integer num, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = item.name;
            }
            if ((i & 2) != 0) {
                num = item.quantity;
            }
            if ((i & 4) != 0) {
                obj = item.imageUrl;
            }
            if ((i & 8) != 0) {
                list = item.tags;
            }
            return item.copy(str, num, obj, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/GetPackageDetailQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPackageDetail($input: ShipmentPackageInput!) { shipmentPackage(input: $input) { id logoImageUrl trackingNumber transactionNumber status statusMessage deliveryTime exceptionSummary exceptionDetails trackingLink destinationAddress { adminArea2 adminArea1 postalCode countryCode } carrier { name logoImageUrl } shipmentUpdates { checkPointMessage updateTime updateTimeDescription shipmentStatus location { adminArea2 adminArea1 countryCode postalCode } } merchant { __typename ... on Merchant { id } ... on ShipmentPackageExternalMerchant { name logoImageUrl } } items { name quantity imageUrl tags } packageNickname markedAsDelivered orderNumber tags packageSource orderManagementUrl } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput shipmentPackageInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPackageDetailQuery(input=");
        sb.append(shipmentPackageInput);
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
        return (other instanceof com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery) other).input);
    }

    public final com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery copy(com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery copy$default(com.paypal.oslo.feature.packagetracking.graphql.GetPackageDetailQuery getPackageDetailQuery, com.paypal.oslo.api.graphql.schema.type.ShipmentPackageInput shipmentPackageInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            shipmentPackageInput = getPackageDetailQuery.input;
        }
        return getPackageDetailQuery.copy(shipmentPackageInput);
    }
}
