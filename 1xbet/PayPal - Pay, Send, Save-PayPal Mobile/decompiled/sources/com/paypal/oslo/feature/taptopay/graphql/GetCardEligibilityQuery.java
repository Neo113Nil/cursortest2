package com.paypal.oslo.feature.taptopay.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\r*+,-./012345)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EvaluateEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateEligibilityInput;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateEligibilityInput;", "getInput", "Companion", "Data", "DeviceWalletEligibility", "DeviceWalletItem", "Instrument", "SpendingLimit", "ArtDetails", "Art", "PrimaryContent", "ThumbnailContent", "StackViewContent", "EvaluationState", "Reason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetCardEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "de2a2efd3a102ac304acc7b3bd4eb8460021de00124cb048f92c44c2303889d0";
    public static final java.lang.String OPERATION_NAME = "GetCardEligibility";
    private final com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public GetCardEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput evaluateEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateEligibilityInput, "");
        this.input = evaluateEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput getInput() {
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
        com.paypal.oslo.feature.taptopay.graphql.adapter.GetCardEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taptopay.graphql.adapter.GetCardEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.taptopay.graphql.selections.GetCardEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;", "deviceWalletEligibility", "<init>", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;", "copy", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;", "getDeviceWalletEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility;

        public Data(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletEligibility, "");
            this.deviceWalletEligibility = deviceWalletEligibility;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility getDeviceWalletEligibility() {
            return this.deviceWalletEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility = this.deviceWalletEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(deviceWalletEligibility=");
            sb.append(deviceWalletEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.deviceWalletEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletEligibility, ((com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data) other).deviceWalletEligibility);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data copy(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletEligibility, "");
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data(deviceWalletEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility getDeviceWalletEligibility() {
            return this.deviceWalletEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Data data, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deviceWalletEligibility = data.deviceWalletEligibility;
            }
            return data.copy(deviceWalletEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;", "", "", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletItem;", "deviceWalletItems", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDeviceWalletItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceWalletEligibility {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> deviceWalletItems;

        public DeviceWalletEligibility(java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> list) {
            this.deviceWalletItems = list;
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> getDeviceWalletItems() {
            return this.deviceWalletItems;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> list = this.deviceWalletItems;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceWalletEligibility(deviceWalletItems=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> list = this.deviceWalletItems;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletItems, ((com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility) other).deviceWalletItems);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility copy(java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> deviceWalletItems) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility(deviceWalletItems);
        }

        public final java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> component1() {
            return this.deviceWalletItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = deviceWalletEligibility.deviceWalletItems;
            }
            return deviceWalletEligibility.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletItem;", "", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Instrument;", "instrument", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "financialProduct", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$EvaluationState;", "evaluationState", "<init>", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Instrument;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$EvaluationState;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Instrument;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component3", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$EvaluationState;", "copy", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Instrument;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$EvaluationState;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Instrument;", "getInstrument", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getFinancialProduct", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$EvaluationState;", "getEvaluationState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceWalletItem {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType financialProduct;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument;

        public DeviceWalletItem(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState) {
            this.instrument = instrument;
            this.financialProduct = fundingInstrumentType;
            this.evaluationState = evaluationState;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument getInstrument() {
            return this.instrument;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getFinancialProduct() {
            return this.financialProduct;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState getEvaluationState() {
            return this.evaluationState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument = this.instrument;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.financialProduct;
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState = this.evaluationState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceWalletItem(instrument=");
            sb.append(instrument);
            sb.append(", financialProduct=");
            sb.append(fundingInstrumentType);
            sb.append(", evaluationState=");
            sb.append(evaluationState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument = this.instrument;
            int hashCode = instrument == null ? 0 : instrument.hashCode();
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.financialProduct;
            int hashCode2 = fundingInstrumentType == null ? 0 : fundingInstrumentType.hashCode();
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState = this.evaluationState;
            return (((hashCode * 31) + hashCode2) * 31) + (evaluationState != null ? evaluationState.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem deviceWalletItem = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, deviceWalletItem.instrument) && this.financialProduct == deviceWalletItem.financialProduct && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluationState, deviceWalletItem.evaluationState);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem copy(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType financialProduct, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem(instrument, financialProduct, evaluationState);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState getEvaluationState() {
            return this.evaluationState;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getFinancialProduct() {
            return this.financialProduct;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument getInstrument() {
            return this.instrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem deviceWalletItem, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                instrument = deviceWalletItem.instrument;
            }
            if ((i & 2) != 0) {
                fundingInstrumentType = deviceWalletItem.financialProduct;
            }
            if ((i & 4) != 0) {
                evaluationState = deviceWalletItem.evaluationState;
            }
            return deviceWalletItem.copy(instrument, fundingInstrumentType, evaluationState);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJx\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b6\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Instrument;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "productDescription", "lastFourChars", "brand", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$SpendingLimit;", "spendingLimit", "createTime", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;", "artDetails", "validityDuration", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$SpendingLimit;Ljava/lang/Object;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$SpendingLimit;", "component7", "()Ljava/lang/Object;", "component8", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;", "component9", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$SpendingLimit;Ljava/lang/Object;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;Ljava/lang/Object;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Instrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "getProductDescription", "getLastFourChars", "getBrand", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$SpendingLimit;", "getSpendingLimit", "Ljava/lang/Object;", "getCreateTime", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;", "getArtDetails", "getValidityDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Instrument {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails;
        private final java.lang.String brand;
        private final java.lang.Object createTime;
        private final java.lang.String id;
        private final java.lang.String lastFourChars;
        private final java.lang.String productDescription;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;
        private final java.lang.Object validityDuration;

        public Instrument(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit, java.lang.Object obj, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.id = str;
            this.type = fundingInstrumentType;
            this.productDescription = str2;
            this.lastFourChars = str3;
            this.brand = str4;
            this.spendingLimit = spendingLimit;
            this.createTime = obj;
            this.artDetails = artDetails;
            this.validityDuration = obj2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String getProductDescription() {
            return this.productDescription;
        }

        public final java.lang.String getLastFourChars() {
            return this.lastFourChars;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit getSpendingLimit() {
            return this.spendingLimit;
        }

        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails getArtDetails() {
            return this.artDetails;
        }

        public final java.lang.Object getValidityDuration() {
            return this.validityDuration;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.String str2 = this.productDescription;
            java.lang.String str3 = this.lastFourChars;
            java.lang.String str4 = this.brand;
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit = this.spendingLimit;
            java.lang.Object obj = this.createTime;
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails = this.artDetails;
            java.lang.Object obj2 = this.validityDuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instrument(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", productDescription=");
            sb.append(str2);
            sb.append(", lastFourChars=");
            sb.append(str3);
            sb.append(", brand=");
            sb.append(str4);
            sb.append(", spendingLimit=");
            sb.append(spendingLimit);
            sb.append(", createTime=");
            sb.append(obj);
            sb.append(", artDetails=");
            sb.append(artDetails);
            sb.append(", validityDuration=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            java.lang.String str = this.productDescription;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.lastFourChars;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.brand;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit = this.spendingLimit;
            int hashCode6 = spendingLimit == null ? 0 : spendingLimit.hashCode();
            java.lang.Object obj = this.createTime;
            int hashCode7 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails = this.artDetails;
            int hashCode8 = artDetails == null ? 0 : artDetails.hashCode();
            java.lang.Object obj2 = this.validityDuration;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, instrument.id) && this.type == instrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.productDescription, instrument.productDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourChars, instrument.lastFourChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, instrument.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.spendingLimit, instrument.spendingLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, instrument.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.artDetails, instrument.artDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.validityDuration, instrument.validityDuration);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.String productDescription, java.lang.String lastFourChars, java.lang.String brand, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit, java.lang.Object createTime, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails, java.lang.Object validityDuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument(id, type, productDescription, lastFourChars, brand, spendingLimit, createTime, artDetails, validityDuration);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getValidityDuration() {
            return this.validityDuration;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails getArtDetails() {
            return this.artDetails;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit getSpendingLimit() {
            return this.spendingLimit;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getLastFourChars() {
            return this.lastFourChars;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProductDescription() {
            return this.productDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$SpendingLimit;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$SpendingLimit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SpendingLimit {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public SpendingLimit(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SpendingLimit(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, spendingLimit.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, spendingLimit.value);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = spendingLimit.currencyCode;
            }
            if ((i & 2) != 0) {
                str = spendingLimit.value;
            }
            return spendingLimit.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;", "", "", "id", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Art;", "art", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Art;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Art;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Art;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Art;", "getArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ArtDetails {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art;
        private final java.lang.String id;

        public ArtDetails(java.lang.String str, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art) {
            this.id = str;
            this.art = art;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art getArt() {
            return this.art;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art = this.art;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ArtDetails(id=");
            sb.append(str);
            sb.append(", art=");
            sb.append(art);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art = this.art;
            return (hashCode * 31) + (art != null ? art.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, artDetails.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.art, artDetails.art);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails copy(java.lang.String id, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails(id, art);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art getArt() {
            return this.art;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails, java.lang.String str, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = artDetails.id;
            }
            if ((i & 2) != 0) {
                art = artDetails.art;
            }
            return artDetails.copy(str, art);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Art;", "", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$PrimaryContent;", "primaryContent", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ThumbnailContent;", "thumbnailContent", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$StackViewContent;", "stackViewContent", "<init>", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$PrimaryContent;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ThumbnailContent;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$StackViewContent;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$PrimaryContent;", "component2", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ThumbnailContent;", "component3", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$StackViewContent;", "copy", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$PrimaryContent;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ThumbnailContent;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$StackViewContent;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Art;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$PrimaryContent;", "getPrimaryContent", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ThumbnailContent;", "getThumbnailContent", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$StackViewContent;", "getStackViewContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Art {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent;

        public Art(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent) {
            this.primaryContent = primaryContent;
            this.thumbnailContent = thumbnailContent;
            this.stackViewContent = stackViewContent;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent getPrimaryContent() {
            return this.primaryContent;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent getThumbnailContent() {
            return this.thumbnailContent;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent getStackViewContent() {
            return this.stackViewContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent = this.primaryContent;
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent = this.thumbnailContent;
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent = this.stackViewContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Art(primaryContent=");
            sb.append(primaryContent);
            sb.append(", thumbnailContent=");
            sb.append(thumbnailContent);
            sb.append(", stackViewContent=");
            sb.append(stackViewContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent = this.primaryContent;
            int hashCode = primaryContent == null ? 0 : primaryContent.hashCode();
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent = this.thumbnailContent;
            int hashCode2 = thumbnailContent == null ? 0 : thumbnailContent.hashCode();
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent = this.stackViewContent;
            return (((hashCode * 31) + hashCode2) * 31) + (stackViewContent != null ? stackViewContent.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryContent, art.primaryContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailContent, art.thumbnailContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.stackViewContent, art.stackViewContent);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art copy(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art(primaryContent, thumbnailContent, stackViewContent);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent getStackViewContent() {
            return this.stackViewContent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent getThumbnailContent() {
            return this.thumbnailContent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent getPrimaryContent() {
            return this.primaryContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                primaryContent = art.primaryContent;
            }
            if ((i & 2) != 0) {
                thumbnailContent = art.thumbnailContent;
            }
            if ((i & 4) != 0) {
                stackViewContent = art.stackViewContent;
            }
            return art.copy(primaryContent, thumbnailContent, stackViewContent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$PrimaryContent;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "height", "width", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$PrimaryContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType", "Ljava/lang/Integer;", "getHeight", "getWidth"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryContent {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Integer width;

        public PrimaryContent(java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
            this.height = num;
            this.width = num2;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.Integer num = this.height;
            java.lang.Integer num2 = this.width;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryContent(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(", height=");
            sb.append(num);
            sb.append(", width=");
            sb.append(num2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.height;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.width;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, primaryContent.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, primaryContent.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, primaryContent.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, primaryContent.width);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType, java.lang.Integer height, java.lang.Integer width) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent(baseCdnLinkPath, mimeType, height, width);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent, java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryContent.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = primaryContent.mimeType;
            }
            if ((i & 4) != 0) {
                num = primaryContent.height;
            }
            if ((i & 8) != 0) {
                num2 = primaryContent.width;
            }
            return primaryContent.copy(obj, str, num, num2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ThumbnailContent;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "height", "width", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ThumbnailContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType", "Ljava/lang/Integer;", "getHeight", "getWidth"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThumbnailContent {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Integer width;

        public ThumbnailContent(java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
            this.height = num;
            this.width = num2;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.Integer num = this.height;
            java.lang.Integer num2 = this.width;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThumbnailContent(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(", height=");
            sb.append(num);
            sb.append(", width=");
            sb.append(num2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.height;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.width;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, thumbnailContent.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, thumbnailContent.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, thumbnailContent.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, thumbnailContent.width);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType, java.lang.Integer height, java.lang.Integer width) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent(baseCdnLinkPath, mimeType, height, width);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent, java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = thumbnailContent.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = thumbnailContent.mimeType;
            }
            if ((i & 4) != 0) {
                num = thumbnailContent.height;
            }
            if ((i & 8) != 0) {
                num2 = thumbnailContent.width;
            }
            return thumbnailContent.copy(obj, str, num, num2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ@\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$StackViewContent;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "height", "width", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$StackViewContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType", "Ljava/lang/Integer;", "getHeight", "getWidth"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StackViewContent {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.Integer height;
        private final java.lang.String mimeType;
        private final java.lang.Integer width;

        public StackViewContent(java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
            this.height = num;
            this.width = num2;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.Integer getHeight() {
            return this.height;
        }

        public final java.lang.Integer getWidth() {
            return this.width;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.Integer num = this.height;
            java.lang.Integer num2 = this.width;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StackViewContent(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(", height=");
            sb.append(num);
            sb.append(", width=");
            sb.append(num2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.height;
            int hashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.width;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, stackViewContent.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, stackViewContent.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, stackViewContent.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, stackViewContent.width);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType, java.lang.Integer height, java.lang.Integer width) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent(baseCdnLinkPath, mimeType, height, width);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent, java.lang.Object obj, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = stackViewContent.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = stackViewContent.mimeType;
            }
            if ((i & 4) != 0) {
                num = stackViewContent.height;
            }
            if ((i & 8) != 0) {
                num2 = stackViewContent.width;
            }
            return stackViewContent.copy(obj, str, num, num2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$EvaluationState;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletEligibilityStatus;", "status", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Reason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletEligibilityStatus;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Reason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletEligibilityStatus;", "component2", "()Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Reason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletEligibilityStatus;Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Reason;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$EvaluationState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletEligibilityStatus;", "getStatus", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Reason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EvaluationState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason;
        private final com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus status;

        public EvaluationState(com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus deviceWalletEligibilityStatus, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason) {
            this.status = deviceWalletEligibilityStatus;
            this.reason = reason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus deviceWalletEligibilityStatus = this.status;
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluationState(status=");
            sb.append(deviceWalletEligibilityStatus);
            sb.append(", reason=");
            sb.append(reason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus deviceWalletEligibilityStatus = this.status;
            int hashCode = deviceWalletEligibilityStatus == null ? 0 : deviceWalletEligibilityStatus.hashCode();
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason = this.reason;
            return (hashCode * 31) + (reason != null ? reason.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState) other;
            return this.status == evaluationState.status && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, evaluationState.reason);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState copy(com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus status, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState(status, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState, com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus deviceWalletEligibilityStatus, com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deviceWalletEligibilityStatus = evaluationState.status;
            }
            if ((i & 2) != 0) {
                reason = evaluationState.reason;
            }
            return evaluationState.copy(deviceWalletEligibilityStatus, reason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Reason;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletIneligibilityReasonCode;", "code", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletIneligibilityReasonCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletIneligibilityReasonCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletIneligibilityReasonCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Reason;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletIneligibilityReasonCode;", "getCode", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Reason {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode code;
        private final java.lang.String description;

        public Reason(com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode deviceWalletIneligibilityReasonCode, java.lang.String str) {
            this.code = deviceWalletIneligibilityReasonCode;
            this.description = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode getCode() {
            return this.code;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode deviceWalletIneligibilityReasonCode = this.code;
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Reason(code=");
            sb.append(deviceWalletIneligibilityReasonCode);
            sb.append(", description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode deviceWalletIneligibilityReasonCode = this.code;
            int hashCode = deviceWalletIneligibilityReasonCode == null ? 0 : deviceWalletIneligibilityReasonCode.hashCode();
            java.lang.String str = this.description;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason = (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason) other;
            return this.code == reason.code && kotlin.jvm.internal.Intrinsics.areEqual(this.description, reason.description);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason copy(com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode code, java.lang.String description) {
            return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason(code, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Reason reason, com.paypal.oslo.api.graphql.schema.type.DeviceWalletIneligibilityReasonCode deviceWalletIneligibilityReasonCode, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deviceWalletIneligibilityReasonCode = reason.code;
            }
            if ((i & 2) != 0) {
                str = reason.description;
            }
            return reason.copy(deviceWalletIneligibilityReasonCode, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCardEligibility($input: EvaluateEligibilityInput!) { deviceWalletEligibility(input: $input) { deviceWalletItems { instrument { id type productDescription lastFourChars brand spendingLimit { currencyCode value } createTime artDetails { id art { primaryContent { baseCdnLinkPath mimeType height width } thumbnailContent { baseCdnLinkPath mimeType height width } stackViewContent { baseCdnLinkPath mimeType height width } } } validityDuration } financialProduct evaluationState { status reason { code description } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput evaluateEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCardEligibilityQuery(input=");
        sb.append(evaluateEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery copy$default(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery getCardEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.EvaluateEligibilityInput evaluateEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluateEligibilityInput = getCardEligibilityQuery.input;
        }
        return getCardEligibilityQuery.copy(evaluateEligibilityInput);
    }
}
