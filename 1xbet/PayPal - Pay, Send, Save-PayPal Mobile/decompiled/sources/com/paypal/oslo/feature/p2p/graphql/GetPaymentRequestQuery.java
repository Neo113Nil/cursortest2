package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f*+,-./01234)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestInput;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestInput;", "getInput", "Companion", "Data", "PaymentRequest", "Amount", "Receiver", "Name", "OnPersonName", "OnBusinessName", "Note", "Media", com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_PREFIX_PAYMENT_LINK, "Disclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GetPaymentRequestQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data> {
    public static final java.lang.String OPERATION_ID = "879585e68214e3f4f6998217b1b8157520a345a04c574c00d65b8762e5530dac";
    public static final java.lang.String OPERATION_NAME = "GetPaymentRequest";
    private final com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Companion(null);
    public static final int $stable = 8;

    public GetPaymentRequestQuery(com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput paymentRequestInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestInput, "");
        this.input = paymentRequestInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput getInput() {
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
        com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentRequestQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentRequestQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.GetPaymentRequestQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;", "paymentRequest", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;", "getPaymentRequest"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest;

        public Data(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest) {
            this.paymentRequest = paymentRequest;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest getPaymentRequest() {
            return this.paymentRequest;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest = this.paymentRequest;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(paymentRequest=");
            sb.append(paymentRequest);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest = this.paymentRequest;
            if (paymentRequest == null) {
                return 0;
            }
            return paymentRequest.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentRequest, ((com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data) other).paymentRequest);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data copy(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest) {
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data(paymentRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest getPaymentRequest() {
            return this.paymentRequest;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Data data, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentRequest = data.paymentRequest;
            }
            return data.copy(paymentRequest);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!Jl\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010.\u001a\u0004\b/\u0010\u0014R \u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b8\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b;\u00103\u001a\u0004\b:\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010\u001fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;", "", "id", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Amount;", "amount", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestStatus;", "status", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Receiver;", "receiver", "createTime", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Note;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentLink;", "paymentLink", "", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Disclosure;", "disclosures", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Amount;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestStatus;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Receiver;Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Note;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentLink;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Amount;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestStatus;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Receiver;", "component5", "component6", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Note;", "component7", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentLink;", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Amount;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestStatus;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Receiver;Ljava/lang/Object;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Note;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentLink;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Amount;", "getAmount", "getAmount$annotations", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestStatus;", "getStatus", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Receiver;", "getReceiver", "getCreateTime", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Note;", "getNote", "getNote$annotations", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentLink;", "getPaymentLink", "Ljava/util/List;", "getDisclosures"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentRequest {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount amount;
        private final java.lang.Object createTime;
        private final java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> disclosures;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver receiver;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentRequestStatus status;

        @kotlin.Deprecated(message = "Use `requestedAmount` instead.")
        public static /* synthetic */ void getAmount$annotations() {
        }

        @kotlin.Deprecated(message = "Use paymentTransferNote field instead")
        public static /* synthetic */ void getNote$annotations() {
        }

        public PaymentRequest(java.lang.Object obj, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount amount, com.paypal.oslo.api.graphql.schema.type.PaymentRequestStatus paymentRequestStatus, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver receiver, java.lang.Object obj2, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink, java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.id = obj;
            this.amount = amount;
            this.status = paymentRequestStatus;
            this.receiver = receiver;
            this.createTime = obj2;
            this.note = note;
            this.paymentLink = paymentLink;
            this.disclosures = list;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver getReceiver() {
            return this.receiver;
        }

        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note getNote() {
            return this.note;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> getDisclosures() {
            return this.disclosures;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.id;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount amount = this.amount;
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestStatus paymentRequestStatus = this.status;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver receiver = this.receiver;
            java.lang.Object obj2 = this.createTime;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note = this.note;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink = this.paymentLink;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> list = this.disclosures;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentRequest(id=");
            sb.append(obj);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(", status=");
            sb.append(paymentRequestStatus);
            sb.append(", receiver=");
            sb.append(receiver);
            sb.append(", createTime=");
            sb.append(obj2);
            sb.append(", note=");
            sb.append(note);
            sb.append(", paymentLink=");
            sb.append(paymentLink);
            sb.append(", disclosures=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.status.hashCode();
            int hashCode4 = this.receiver.hashCode();
            int hashCode5 = this.createTime.hashCode();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note = this.note;
            int hashCode6 = note == null ? 0 : note.hashCode();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink = this.paymentLink;
            int hashCode7 = paymentLink == null ? 0 : paymentLink.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> list = this.disclosures;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest paymentRequest = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentRequest.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, paymentRequest.amount) && this.status == paymentRequest.status && kotlin.jvm.internal.Intrinsics.areEqual(this.receiver, paymentRequest.receiver) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, paymentRequest.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, paymentRequest.note) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentLink, paymentRequest.paymentLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, paymentRequest.disclosures);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest copy(java.lang.Object id, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount amount, com.paypal.oslo.api.graphql.schema.type.PaymentRequestStatus status, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver receiver, java.lang.Object createTime, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink, java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> disclosures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createTime, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest(id, amount, status, receiver, createTime, note, paymentLink, disclosures);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> component8() {
            return this.disclosures;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink getPaymentLink() {
            return this.paymentLink;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note getNote() {
            return this.note;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getCreateTime() {
            return this.createTime;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver getReceiver() {
            return this.receiver;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount amount = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJH\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Receiver;", "", "", "accountId", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "type", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Name;", "name", "profilePhotoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Name;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "component4", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Name;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Name;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Receiver;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "Ljava/lang/Object;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentReceiverType;", "getType", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Name;", "getName", "getProfilePhotoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Receiver {
        public static final int $stable = 8;
        private final java.lang.String accountId;
        private final java.lang.Object id;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name;
        private final java.lang.Object profilePhotoUrl;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type;

        public Receiver(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReceiverType, "");
            this.accountId = str;
            this.id = obj;
            this.type = paymentReceiverType;
            this.name = name2;
            this.profilePhotoUrl = obj2;
        }

        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public final java.lang.Object getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name getName() {
            return this.name;
        }

        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.accountId;
            java.lang.Object obj = this.id;
            com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType = this.type;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2 = this.name;
            java.lang.Object obj2 = this.profilePhotoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Receiver(accountId=");
            sb.append(str);
            sb.append(", id=");
            sb.append(obj);
            sb.append(", type=");
            sb.append(paymentReceiverType);
            sb.append(", name=");
            sb.append(name2);
            sb.append(", profilePhotoUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.accountId;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.id.hashCode();
            int hashCode3 = this.type.hashCode();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2 = this.name;
            int hashCode4 = name2 == null ? 0 : name2.hashCode();
            java.lang.Object obj = this.profilePhotoUrl;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver receiver = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, receiver.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, receiver.id) && this.type == receiver.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, receiver.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, receiver.profilePhotoUrl);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver copy(java.lang.String accountId, java.lang.Object id, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType type, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2, java.lang.Object profilePhotoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver(accountId, id, type, name2, profilePhotoUrl);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getProfilePhotoUrl() {
            return this.profilePhotoUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver receiver, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = receiver.accountId;
            }
            if ((i & 2) != 0) {
                obj = receiver.id;
            }
            java.lang.Object obj4 = obj;
            if ((i & 4) != 0) {
                paymentReceiverType = receiver.type;
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType2 = paymentReceiverType;
            if ((i & 8) != 0) {
                name2 = receiver.name;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name3 = name2;
            if ((i & 16) != 0) {
                obj2 = receiver.profilePhotoUrl;
            }
            return receiver.copy(str, obj4, paymentReceiverType2, name3, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Name;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnPersonName;", "onPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnBusinessName;", "onBusinessName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnBusinessName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnPersonName;", "component3", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnBusinessName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnPersonName;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnBusinessName;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnPersonName;", "getOnPersonName", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnBusinessName;", "getOnBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName;

        public Name(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onPersonName = onPersonName;
            this.onBusinessName = onBusinessName;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName = this.onPersonName;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName = this.onBusinessName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(__typename=");
            sb.append(str);
            sb.append(", onPersonName=");
            sb.append(onPersonName);
            sb.append(", onBusinessName=");
            sb.append(onBusinessName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName = this.onPersonName;
            int hashCode2 = onPersonName == null ? 0 : onPersonName.hashCode();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName = this.onBusinessName;
            return (((hashCode * 31) + hashCode2) * 31) + (onBusinessName != null ? onBusinessName.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2 = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, name2.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonName, name2.onPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBusinessName, name2.onBusinessName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name(__typename, onPersonName, onBusinessName);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName getOnBusinessName() {
            return this.onBusinessName;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName getOnPersonName() {
            return this.onPersonName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.__typename;
            }
            if ((i & 2) != 0) {
                onPersonName = name2.onPersonName;
            }
            if ((i & 4) != 0) {
                onBusinessName = name2.onBusinessName;
            }
            return name2.copy(str, onPersonName, onBusinessName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnPersonName;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnPersonName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getSecondSurname", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class OnPersonName {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String secondSurname;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public OnPersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.secondSurname = str4;
            this.middleName = str5;
            this.suffix = str6;
            this.fullName = str7;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.secondSurname;
            java.lang.String str5 = this.middleName;
            java.lang.String str6 = this.suffix;
            java.lang.String str7 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPersonName(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", secondSurname=");
            sb.append(str4);
            sb.append(", middleName=");
            sb.append(str5);
            sb.append(", suffix=");
            sb.append(str6);
            sb.append(", fullName=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.prefix;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.secondSurname;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.middleName;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.suffix;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.fullName;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, onPersonName.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, onPersonName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, onPersonName.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, onPersonName.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, onPersonName.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, onPersonName.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, onPersonName.fullName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String secondSurname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName(prefix, givenName, surname, secondSurname, middleName, suffix, fullName);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPersonName.prefix;
            }
            if ((i & 2) != 0) {
                str2 = onPersonName.givenName;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = onPersonName.surname;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = onPersonName.secondSurname;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = onPersonName.middleName;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = onPersonName.suffix;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = onPersonName.fullName;
            }
            return onPersonName.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnBusinessName;", "", "", "businessName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$OnBusinessName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class OnBusinessName {
        public static final int $stable = 0;
        private final java.lang.String businessName;

        public OnBusinessName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBusinessName(businessName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.businessName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, ((com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName) other).businessName);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName copy(java.lang.String businessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName(businessName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBusinessName.businessName;
            }
            return onBusinessName.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Note;", "", "", "memo", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Media;", io.ktor.http.LinkHeader.Parameters.Media, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Media;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Media;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Media;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Note;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMemo", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Media;", "getMedia"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Note {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media;
        private final java.lang.String memo;

        public Note(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media) {
            this.memo = str;
            this.media = media;
        }

        public final java.lang.String getMemo() {
            return this.memo;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media getMedia() {
            return this.media;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.memo;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media = this.media;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Note(memo=");
            sb.append(str);
            sb.append(", media=");
            sb.append(media);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.memo;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media = this.media;
            return (hashCode * 31) + (media != null ? media.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.memo, note.memo) && kotlin.jvm.internal.Intrinsics.areEqual(this.media, note.media);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note copy(java.lang.String memo, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media) {
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note(memo, media);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media getMedia() {
            return this.media;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMemo() {
            return this.memo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = note.memo;
            }
            if ((i & 2) != 0) {
                media = note.media;
            }
            return note.copy(str, media);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Media;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "provider", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "component3", "()Ljava/lang/Object;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Media;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/MediaProvider;", "getProvider", "Ljava/lang/Object;", "getContentType", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Media {
        public static final int $stable = 8;
        private final java.lang.Object contentType;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.MediaProvider provider;
        private final java.lang.Object referenceUrl;

        public Media(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.id = str;
            this.provider = mediaProvider;
            this.contentType = obj;
            this.referenceUrl = obj2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MediaProvider getProvider() {
            return this.provider;
        }

        public final java.lang.Object getContentType() {
            return this.contentType;
        }

        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider = this.provider;
            java.lang.Object obj = this.contentType;
            java.lang.Object obj2 = this.referenceUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Media(id=");
            sb.append(str);
            sb.append(", provider=");
            sb.append(mediaProvider);
            sb.append(", contentType=");
            sb.append(obj);
            sb.append(", referenceUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.id.hashCode() * 31) + this.provider.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.referenceUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, media.id) && this.provider == media.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, media.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, media.referenceUrl);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.MediaProvider provider, java.lang.Object contentType, java.lang.Object referenceUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media(id, provider, contentType, referenceUrl);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getContentType() {
            return this.contentType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MediaProvider getProvider() {
            return this.provider;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = media.id;
            }
            if ((i & 2) != 0) {
                mediaProvider = media.provider;
            }
            if ((i & 4) != 0) {
                obj = media.contentType;
            }
            if ((i & 8) != 0) {
                obj2 = media.referenceUrl;
            }
            return media.copy(str, mediaProvider, obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J&\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentLink;", "", "url", "expirationTime", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl", "getExpirationTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentLink {
        public static final int $stable = 8;
        private final java.lang.Object expirationTime;
        private final java.lang.Object url;

        public PaymentLink(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.url = obj;
            this.expirationTime = obj2;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.Object obj2 = this.expirationTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentLink(url=");
            sb.append(obj);
            sb.append(", expirationTime=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.expirationTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, paymentLink.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationTime, paymentLink.expirationTime);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink copy(java.lang.Object url, java.lang.Object expirationTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationTime, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink(url, expirationTime);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getExpirationTime() {
            return this.expirationTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = paymentLink.url;
            }
            if ((i & 2) != 0) {
                obj2 = paymentLink.expirationTime;
            }
            return paymentLink.copy(obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Disclosure;", "", "", "__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;", "paymentRequestDisclosureFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Disclosure;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;", "getPaymentRequestDisclosureFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disclosure {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment paymentRequestDisclosureFragment;

        public Disclosure(java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment paymentRequestDisclosureFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestDisclosureFragment, "");
            this.__typename = str;
            this.paymentRequestDisclosureFragment = paymentRequestDisclosureFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment getPaymentRequestDisclosureFragment() {
            return this.paymentRequestDisclosureFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment paymentRequestDisclosureFragment = this.paymentRequestDisclosureFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Disclosure(__typename=");
            sb.append(str);
            sb.append(", paymentRequestDisclosureFragment=");
            sb.append(paymentRequestDisclosureFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.paymentRequestDisclosureFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure disclosure = (com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, disclosure.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentRequestDisclosureFragment, disclosure.paymentRequestDisclosureFragment);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure copy(java.lang.String __typename, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment paymentRequestDisclosureFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestDisclosureFragment, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure(__typename, paymentRequestDisclosureFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment getPaymentRequestDisclosureFragment() {
            return this.paymentRequestDisclosureFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure disclosure, java.lang.String str, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment paymentRequestDisclosureFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = disclosure.__typename;
            }
            if ((i & 2) != 0) {
                paymentRequestDisclosureFragment = disclosure.paymentRequestDisclosureFragment;
            }
            return disclosure.copy(str, paymentRequestDisclosureFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPaymentRequest($input: PaymentRequestInput!) { paymentRequest(input: $input) { id amount { currencyCode value } status receiver { accountId id type name { __typename ... on PersonName { prefix givenName surname secondSurname middleName suffix fullName } ... on BusinessName { businessName } } profilePhotoUrl } createTime note { memo media { id provider contentType referenceUrl } } paymentLink { url expirationTime } disclosures { __typename ...PaymentRequestDisclosureFragment } } }  fragment PaymentRequestDisclosureFragment on PaymentRequestDisclosure { __typename ... on PaymentLinkDisclosure { priority expiryTime } ... on PaymentLinkSecurityWarningDisclosure { priority email expiryTime scamUrl } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput paymentRequestInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPaymentRequestQuery(input=");
        sb.append(paymentRequestInput);
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
        return (other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery) other).input);
    }

    public final com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery copy(com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery getPaymentRequestQuery, com.paypal.oslo.api.graphql.schema.type.PaymentRequestInput paymentRequestInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paymentRequestInput = getPaymentRequestQuery.input;
        }
        return getPaymentRequestQuery.copy(paymentRequestInput);
    }
}
