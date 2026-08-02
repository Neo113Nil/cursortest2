package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004()*'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$Data;", "", "id", "<init>", "(Ljava/lang/Object;)V", "", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getId", "Companion", "Data", "PaymentDestinations", "SupportedDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GetPaymentDestinationsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "b86a7904d500a1803724bce57448f5d22e5faae6455c5fdc60cac68db61a0531";
    public static final java.lang.String OPERATION_NAME = "GetPaymentDestinations";
    private final java.lang.Object id;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Companion(null);
    public static final int $stable = 8;

    public GetPaymentDestinationsQuery(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.id = obj;
    }

    public final java.lang.Object getId() {
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
        com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentDestinationsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentDestinationsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.GetPaymentDestinationsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$PaymentDestinations;", "paymentDestinations", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$PaymentDestinations;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$PaymentDestinations;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$PaymentDestinations;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$PaymentDestinations;", "getPaymentDestinations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations;

        public Data(com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDestinations, "");
            this.paymentDestinations = paymentDestinations;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations getPaymentDestinations() {
            return this.paymentDestinations;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations = this.paymentDestinations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(paymentDestinations=");
            sb.append(paymentDestinations);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentDestinations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDestinations, ((com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data) other).paymentDestinations);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data copy(com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDestinations, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data(paymentDestinations);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations getPaymentDestinations() {
            return this.paymentDestinations;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data data, com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentDestinations = data.paymentDestinations;
            }
            return data.copy(paymentDestinations);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$PaymentDestinations;", "", "", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$SupportedDestination;", "supportedDestinations", "", "__typename", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$PaymentDestinations;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getSupportedDestinations", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentDestinations {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> supportedDestinations;

        public PaymentDestinations(java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> list, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.supportedDestinations = list;
            this.__typename = str;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> getSupportedDestinations() {
            return this.supportedDestinations;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> list = this.supportedDestinations;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentDestinations(supportedDestinations=");
            sb.append(list);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.supportedDestinations.hashCode() * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations = (com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.supportedDestinations, paymentDestinations.supportedDestinations) && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentDestinations.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations copy(java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> supportedDestinations, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedDestinations, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations(supportedDestinations, __typename);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> component1() {
            return this.supportedDestinations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = paymentDestinations.supportedDestinations;
            }
            if ((i & 2) != 0) {
                str = paymentDestinations.__typename;
            }
            return paymentDestinations.copy(list, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$SupportedDestination;", "", "countryCode", "currencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentProcessor;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PROCESSOR, "", "__typename", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentProcessor;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentProcessor;", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentProcessor;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$SupportedDestination;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCountryCode", "getCurrencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentProcessor;", "getPaymentProcessor", "Ljava/lang/String;", "get__typename"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SupportedDestination {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object countryCode;
        private final java.lang.Object currencyCode;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentProcessor paymentProcessor;

        public SupportedDestination(java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.PaymentProcessor paymentProcessor, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentProcessor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.countryCode = obj;
            this.currencyCode = obj2;
            this.paymentProcessor = paymentProcessor;
            this.__typename = str;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentProcessor getPaymentProcessor() {
            return this.paymentProcessor;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.countryCode;
            java.lang.Object obj2 = this.currencyCode;
            com.paypal.oslo.api.graphql.schema.type.PaymentProcessor paymentProcessor = this.paymentProcessor;
            java.lang.String str = this.__typename;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedDestination(countryCode=");
            sb.append(obj);
            sb.append(", currencyCode=");
            sb.append(obj2);
            sb.append(", paymentProcessor=");
            sb.append(paymentProcessor);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.countryCode.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.paymentProcessor.hashCode()) * 31) + this.__typename.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination supportedDestination = (com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, supportedDestination.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, supportedDestination.currencyCode) && this.paymentProcessor == supportedDestination.paymentProcessor && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, supportedDestination.__typename);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination copy(java.lang.Object countryCode, java.lang.Object currencyCode, com.paypal.oslo.api.graphql.schema.type.PaymentProcessor paymentProcessor, java.lang.String __typename) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentProcessor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination(countryCode, currencyCode, paymentProcessor, __typename);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentProcessor getPaymentProcessor() {
            return this.paymentProcessor;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination supportedDestination, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.PaymentProcessor paymentProcessor, java.lang.String str, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = supportedDestination.countryCode;
            }
            if ((i & 2) != 0) {
                obj2 = supportedDestination.currencyCode;
            }
            if ((i & 4) != 0) {
                paymentProcessor = supportedDestination.paymentProcessor;
            }
            if ((i & 8) != 0) {
                str = supportedDestination.__typename;
            }
            return supportedDestination.copy(obj, obj2, paymentProcessor, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPaymentDestinations($id: PaymentTransferAttemptID!) { paymentDestinations(id: $id) { supportedDestinations { countryCode currencyCode paymentProcessor __typename } __typename } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPaymentDestinationsQuery(id=");
        sb.append(obj);
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
        return (other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery) other).id);
    }

    public final com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery copy(java.lang.Object id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery getPaymentDestinationsQuery, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = getPaymentDestinationsQuery.id;
        }
        return getPaymentDestinationsQuery.copy(obj);
    }
}
