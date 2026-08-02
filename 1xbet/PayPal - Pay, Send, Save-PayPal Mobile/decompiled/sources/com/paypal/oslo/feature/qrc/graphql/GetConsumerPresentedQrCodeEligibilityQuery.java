package com.paypal.oslo.feature.qrc.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/type/ConsumerPresentedQRCodeEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/ConsumerPresentedQRCodeEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/ConsumerPresentedQRCodeEligibilityInput;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/ConsumerPresentedQRCodeEligibilityInput;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/graphql/type/ConsumerPresentedQRCodeEligibilityInput;", "getInput", "Companion", "Data", "ConsumerPresentedQrCodeEligibility", "QrCodeEligibilityStatus", "QrCodeCapability"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetConsumerPresentedQrCodeEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "96d975a4895b66dd709e8542f02ba235ad418d0e534f79827e72c5f25b4ecb92";
    public static final java.lang.String OPERATION_NAME = "GetConsumerPresentedQrCodeEligibility";
    private final com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public GetConsumerPresentedQrCodeEligibilityQuery(com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput consumerPresentedQRCodeEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerPresentedQRCodeEligibilityInput, "");
        this.input = consumerPresentedQRCodeEligibilityInput;
    }

    public final com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput getInput() {
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
        com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.GetConsumerPresentedQrCodeEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.feature.qrc.graphql.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.qrc.graphql.selections.GetConsumerPresentedQrCodeEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "consumerPresentedQrCodeEligibility", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "getConsumerPresentedQrCodeEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility;

        public Data(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerPresentedQrCodeEligibility, "");
            this.consumerPresentedQrCodeEligibility = consumerPresentedQrCodeEligibility;
        }

        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility getConsumerPresentedQrCodeEligibility() {
            return this.consumerPresentedQrCodeEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility = this.consumerPresentedQrCodeEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(consumerPresentedQrCodeEligibility=");
            sb.append(consumerPresentedQrCodeEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.consumerPresentedQrCodeEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerPresentedQrCodeEligibility, ((com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data) other).consumerPresentedQrCodeEligibility);
        }

        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data copy(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerPresentedQrCodeEligibility, "");
            return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data(consumerPresentedQrCodeEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility getConsumerPresentedQrCodeEligibility() {
            return this.consumerPresentedQrCodeEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data copy$default(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.Data data, com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                consumerPresentedQrCodeEligibility = data.consumerPresentedQrCodeEligibility;
            }
            return data.copy(consumerPresentedQrCodeEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "", "", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeEligibilityStatus;", "qrCodeEligibilityStatuses", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getQrCodeEligibilityStatuses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsumerPresentedQrCodeEligibility {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> qrCodeEligibilityStatuses;

        public ConsumerPresentedQrCodeEligibility(java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.qrCodeEligibilityStatuses = list;
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> getQrCodeEligibilityStatuses() {
            return this.qrCodeEligibilityStatuses;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> list = this.qrCodeEligibilityStatuses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerPresentedQrCodeEligibility(qrCodeEligibilityStatuses=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.qrCodeEligibilityStatuses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeEligibilityStatuses, ((com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility) other).qrCodeEligibilityStatuses);
        }

        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility copy(java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> qrCodeEligibilityStatuses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCodeEligibilityStatuses, "");
            return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility(qrCodeEligibilityStatuses);
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> component1() {
            return this.qrCodeEligibilityStatuses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility copy$default(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = consumerPresentedQrCodeEligibility.qrCodeEligibilityStatuses;
            }
            return consumerPresentedQrCodeEligibility.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeEligibilityStatus;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "qrCodeType", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;", "status", "", "statusReason", "", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeCapability;", "qrCodeCapabilities", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeEligibilityStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "getQrCodeType", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;", "getStatus", "Ljava/lang/String;", "getStatusReason", "Ljava/util/List;", "getQrCodeCapabilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QrCodeEligibilityStatus {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> qrCodeCapabilities;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus status;
        private final java.lang.String statusReason;

        public QrCodeEligibilityStatus(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus, java.lang.String str, java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> list) {
            this.qrCodeType = qRCodeType;
            this.status = qRCodeEligibilityStatus;
            this.statusReason = str;
            this.qrCodeCapabilities = list;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType getQrCodeType() {
            return this.qrCodeType;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getStatusReason() {
            return this.statusReason;
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> getQrCodeCapabilities() {
            return this.qrCodeCapabilities;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType = this.qrCodeType;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus = this.status;
            java.lang.String str = this.statusReason;
            java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> list = this.qrCodeCapabilities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QrCodeEligibilityStatus(qrCodeType=");
            sb.append(qRCodeType);
            sb.append(", status=");
            sb.append(qRCodeEligibilityStatus);
            sb.append(", statusReason=");
            sb.append(str);
            sb.append(", qrCodeCapabilities=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType = this.qrCodeType;
            int hashCode = qRCodeType == null ? 0 : qRCodeType.hashCode();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus = this.status;
            int hashCode2 = qRCodeEligibilityStatus == null ? 0 : qRCodeEligibilityStatus.hashCode();
            java.lang.String str = this.statusReason;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> list = this.qrCodeCapabilities;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus qrCodeEligibilityStatus = (com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus) other;
            return this.qrCodeType == qrCodeEligibilityStatus.qrCodeType && this.status == qrCodeEligibilityStatus.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusReason, qrCodeEligibilityStatus.statusReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.qrCodeCapabilities, qrCodeEligibilityStatus.qrCodeCapabilities);
        }

        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus status, java.lang.String statusReason, java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> qrCodeCapabilities) {
            return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus(qrCodeType, status, statusReason, qrCodeCapabilities);
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> component4() {
            return this.qrCodeCapabilities;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getStatusReason() {
            return this.statusReason;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType getQrCodeType() {
            return this.qrCodeType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus copy$default(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus qrCodeEligibilityStatus, com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qRCodeType = qrCodeEligibilityStatus.qrCodeType;
            }
            if ((i & 2) != 0) {
                qRCodeEligibilityStatus = qrCodeEligibilityStatus.status;
            }
            if ((i & 4) != 0) {
                str = qrCodeEligibilityStatus.statusReason;
            }
            if ((i & 8) != 0) {
                list = qrCodeEligibilityStatus.qrCodeCapabilities;
            }
            return qrCodeEligibilityStatus.copy(qRCodeType, qRCodeEligibilityStatus, str, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeCapability;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;", "capability", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;", "status", "", "statusReason", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$QrCodeCapability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;", "getCapability", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;", "getStatus", "Ljava/lang/String;", "getStatusReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class QrCodeCapability {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability capability;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus status;
        private final java.lang.String statusReason;

        public QrCodeCapability(com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability qRCodeCapability, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus, java.lang.String str) {
            this.capability = qRCodeCapability;
            this.status = qRCodeEligibilityStatus;
            this.statusReason = str;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability getCapability() {
            return this.capability;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getStatusReason() {
            return this.statusReason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability qRCodeCapability = this.capability;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus = this.status;
            java.lang.String str = this.statusReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QrCodeCapability(capability=");
            sb.append(qRCodeCapability);
            sb.append(", status=");
            sb.append(qRCodeEligibilityStatus);
            sb.append(", statusReason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability qRCodeCapability = this.capability;
            int hashCode = qRCodeCapability == null ? 0 : qRCodeCapability.hashCode();
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus = this.status;
            int hashCode2 = qRCodeEligibilityStatus == null ? 0 : qRCodeEligibilityStatus.hashCode();
            java.lang.String str = this.statusReason;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability qrCodeCapability = (com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability) other;
            return this.capability == qrCodeCapability.capability && this.status == qrCodeCapability.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusReason, qrCodeCapability.statusReason);
        }

        public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability capability, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus status, java.lang.String statusReason) {
            return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability(capability, status, statusReason);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getStatusReason() {
            return this.statusReason;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability getCapability() {
            return this.capability;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability copy$default(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability qrCodeCapability, com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability qRCodeCapability, com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qRCodeCapability = qrCodeCapability.capability;
            }
            if ((i & 2) != 0) {
                qRCodeEligibilityStatus = qrCodeCapability.status;
            }
            if ((i & 4) != 0) {
                str = qrCodeCapability.statusReason;
            }
            return qrCodeCapability.copy(qRCodeCapability, qRCodeEligibilityStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetConsumerPresentedQrCodeEligibility($input: ConsumerPresentedQRCodeEligibilityInput!) { consumerPresentedQrCodeEligibility(input: $input) { qrCodeEligibilityStatuses { qrCodeType status statusReason qrCodeCapabilities { capability status statusReason } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput consumerPresentedQRCodeEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetConsumerPresentedQrCodeEligibilityQuery(input=");
        sb.append(consumerPresentedQRCodeEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery copy(com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery copy$default(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery getConsumerPresentedQrCodeEligibilityQuery, com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput consumerPresentedQRCodeEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            consumerPresentedQRCodeEligibilityInput = getConsumerPresentedQrCodeEligibilityQuery.input;
        }
        return getConsumerPresentedQrCodeEligibilityQuery.copy(consumerPresentedQRCodeEligibilityInput);
    }
}
