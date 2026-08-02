package com.paypal.oslo.feature.qrc.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b*+,-./0)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/type/ConfirmQRCodePaymentInput;", "input", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/ConfirmQRCodePaymentInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/ConfirmQRCodePaymentInput;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/ConfirmQRCodePaymentInput;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/graphql/type/ConfirmQRCodePaymentInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OPERATION_NAME, "RequiredAction", "OnQRCodeSessionPollingAction", "OnQRCodeSessionBasicAction", "OnQRCodeSessionErrorAction", "Payment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ConfirmQrCodePaymentMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data> {
    public static final java.lang.String OPERATION_ID = "9c339c8dad5f517656718bb0e7c2fd96d693ddeb7707ba1d80a4be59ce953b47";
    public static final java.lang.String OPERATION_NAME = "ConfirmQrCodePayment";
    private final com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Companion INSTANCE = new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Companion(null);
    public static final int $stable = 8;

    public ConfirmQrCodePaymentMutation(com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput confirmQRCodePaymentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmQRCodePaymentInput, "");
        this.input = confirmQRCodePaymentInput;
    }

    public final com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput getInput() {
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
        com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.qrc.graphql.adapter.ConfirmQrCodePaymentMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.feature.qrc.graphql.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.qrc.graphql.selections.ConfirmQrCodePaymentMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "confirmQrCodePayment", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "getConfirmQrCodePayment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment;

        public Data(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmQrCodePayment, "");
            this.confirmQrCodePayment = confirmQrCodePayment;
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment getConfirmQrCodePayment() {
            return this.confirmQrCodePayment;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment = this.confirmQrCodePayment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(confirmQrCodePayment=");
            sb.append(confirmQrCodePayment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.confirmQrCodePayment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmQrCodePayment, ((com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data) other).confirmQrCodePayment);
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data copy(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmQrCodePayment, "");
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data(confirmQrCodePayment);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment getConfirmQrCodePayment() {
            return this.confirmQrCodePayment;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Data data, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                confirmQrCodePayment = data.confirmQrCodePayment;
            }
            return data.copy(confirmQrCodePayment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "", "", "id", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;", "requiredAction", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;", "payment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;", "component3", "()Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$ConfirmQrCodePayment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;", "getRequiredAction", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;", "getPayment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmQrCodePayment {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment;
        private final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction;

        public ConfirmQrCodePayment(java.lang.String str, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.requiredAction = requiredAction;
            this.payment = payment;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction getRequiredAction() {
            return this.requiredAction;
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment getPayment() {
            return this.payment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction = this.requiredAction;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment = this.payment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmQrCodePayment(id=");
            sb.append(str);
            sb.append(", requiredAction=");
            sb.append(requiredAction);
            sb.append(", payment=");
            sb.append(payment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction = this.requiredAction;
            int hashCode2 = requiredAction == null ? 0 : requiredAction.hashCode();
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment = this.payment;
            return (((hashCode * 31) + hashCode2) * 31) + (payment != null ? payment.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, confirmQrCodePayment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.requiredAction, confirmQrCodePayment.requiredAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.payment, confirmQrCodePayment.payment);
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment copy(java.lang.String id, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment(id, requiredAction, payment);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment getPayment() {
            return this.payment;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction getRequiredAction() {
            return this.requiredAction;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.ConfirmQrCodePayment confirmQrCodePayment, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = confirmQrCodePayment.id;
            }
            if ((i & 2) != 0) {
                requiredAction = confirmQrCodePayment.requiredAction;
            }
            if ((i & 4) != 0) {
                payment = confirmQrCodePayment.payment;
            }
            return confirmQrCodePayment.copy(str, requiredAction, payment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;", "", "", "__typename", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;", "onQRCodeSessionPollingAction", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;", "onQRCodeSessionBasicAction", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;", "onQRCodeSessionErrorAction", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;", "component3", "()Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;", "component4", "()Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$RequiredAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;", "getOnQRCodeSessionPollingAction", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;", "getOnQRCodeSessionBasicAction", "Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;", "getOnQRCodeSessionErrorAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequiredAction {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction;
        private final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction;
        private final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction;

        public RequiredAction(java.lang.String str, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onQRCodeSessionPollingAction = onQRCodeSessionPollingAction;
            this.onQRCodeSessionBasicAction = onQRCodeSessionBasicAction;
            this.onQRCodeSessionErrorAction = onQRCodeSessionErrorAction;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction getOnQRCodeSessionPollingAction() {
            return this.onQRCodeSessionPollingAction;
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction getOnQRCodeSessionBasicAction() {
            return this.onQRCodeSessionBasicAction;
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction getOnQRCodeSessionErrorAction() {
            return this.onQRCodeSessionErrorAction;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction = this.onQRCodeSessionPollingAction;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction = this.onQRCodeSessionBasicAction;
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction = this.onQRCodeSessionErrorAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequiredAction(__typename=");
            sb.append(str);
            sb.append(", onQRCodeSessionPollingAction=");
            sb.append(onQRCodeSessionPollingAction);
            sb.append(", onQRCodeSessionBasicAction=");
            sb.append(onQRCodeSessionBasicAction);
            sb.append(", onQRCodeSessionErrorAction=");
            sb.append(onQRCodeSessionErrorAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction = this.onQRCodeSessionPollingAction;
            int hashCode2 = onQRCodeSessionPollingAction == null ? 0 : onQRCodeSessionPollingAction.hashCode();
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction = this.onQRCodeSessionBasicAction;
            int hashCode3 = onQRCodeSessionBasicAction == null ? 0 : onQRCodeSessionBasicAction.hashCode();
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction = this.onQRCodeSessionErrorAction;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onQRCodeSessionErrorAction != null ? onQRCodeSessionErrorAction.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, requiredAction.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onQRCodeSessionPollingAction, requiredAction.onQRCodeSessionPollingAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.onQRCodeSessionBasicAction, requiredAction.onQRCodeSessionBasicAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.onQRCodeSessionErrorAction, requiredAction.onQRCodeSessionErrorAction);
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction copy(java.lang.String __typename, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction(__typename, onQRCodeSessionPollingAction, onQRCodeSessionBasicAction, onQRCodeSessionErrorAction);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction getOnQRCodeSessionErrorAction() {
            return this.onQRCodeSessionErrorAction;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction getOnQRCodeSessionBasicAction() {
            return this.onQRCodeSessionBasicAction;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction getOnQRCodeSessionPollingAction() {
            return this.onQRCodeSessionPollingAction;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.RequiredAction requiredAction, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction, com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requiredAction.__typename;
            }
            if ((i & 2) != 0) {
                onQRCodeSessionPollingAction = requiredAction.onQRCodeSessionPollingAction;
            }
            if ((i & 4) != 0) {
                onQRCodeSessionBasicAction = requiredAction.onQRCodeSessionBasicAction;
            }
            if ((i & 8) != 0) {
                onQRCodeSessionErrorAction = requiredAction.onQRCodeSessionErrorAction;
            }
            return requiredAction.copy(str, onQRCodeSessionPollingAction, onQRCodeSessionBasicAction, onQRCodeSessionErrorAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "name", "", "maximumPollingInterval", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionPollingAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "getName", "Ljava/lang/Integer;", "getMaximumPollingInterval"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnQRCodeSessionPollingAction {
        public static final int $stable = 0;
        private final java.lang.Integer maximumPollingInterval;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name;

        public OnQRCodeSessionPollingAction(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodeSessionActionType, "");
            this.name = qRCodeSessionActionType;
            this.maximumPollingInterval = num;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType getName() {
            return this.name;
        }

        public final java.lang.Integer getMaximumPollingInterval() {
            return this.maximumPollingInterval;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType = this.name;
            java.lang.Integer num = this.maximumPollingInterval;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnQRCodeSessionPollingAction(name=");
            sb.append(qRCodeSessionActionType);
            sb.append(", maximumPollingInterval=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.Integer num = this.maximumPollingInterval;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction) other;
            return this.name == onQRCodeSessionPollingAction.name && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumPollingInterval, onQRCodeSessionPollingAction.maximumPollingInterval);
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name2, java.lang.Integer maximumPollingInterval) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction(name2, maximumPollingInterval);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getMaximumPollingInterval() {
            return this.maximumPollingInterval;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionPollingAction onQRCodeSessionPollingAction, com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qRCodeSessionActionType = onQRCodeSessionPollingAction.name;
            }
            if ((i & 2) != 0) {
                num = onQRCodeSessionPollingAction.maximumPollingInterval;
            }
            return onQRCodeSessionPollingAction.copy(qRCodeSessionActionType, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "name", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionBasicAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnQRCodeSessionBasicAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name;

        public OnQRCodeSessionBasicAction(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodeSessionActionType, "");
            this.name = qRCodeSessionActionType;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnQRCodeSessionBasicAction(name=");
            sb.append(qRCodeSessionActionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction) && this.name == ((com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction) other).name;
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionBasicAction onQRCodeSessionBasicAction, com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qRCodeSessionActionType = onQRCodeSessionBasicAction.name;
            }
            return onQRCodeSessionBasicAction.copy(qRCodeSessionActionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "name", "", "errorReason", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$OnQRCodeSessionErrorAction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeSessionActionType;", "getName", "Ljava/lang/String;", "getErrorReason", "getIssue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnQRCodeSessionErrorAction {
        public static final int $stable = 0;
        private final java.lang.String errorReason;
        private final java.lang.String issue;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name;

        public OnQRCodeSessionErrorAction(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodeSessionActionType, "");
            this.name = qRCodeSessionActionType;
            this.errorReason = str;
            this.issue = str2;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType getName() {
            return this.name;
        }

        public final java.lang.String getErrorReason() {
            return this.errorReason;
        }

        public final java.lang.String getIssue() {
            return this.issue;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType = this.name;
            java.lang.String str = this.errorReason;
            java.lang.String str2 = this.issue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnQRCodeSessionErrorAction(name=");
            sb.append(qRCodeSessionActionType);
            sb.append(", errorReason=");
            sb.append(str);
            sb.append(", issue=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.errorReason;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.issue;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction) other;
            return this.name == onQRCodeSessionErrorAction.name && kotlin.jvm.internal.Intrinsics.areEqual(this.errorReason, onQRCodeSessionErrorAction.errorReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.issue, onQRCodeSessionErrorAction.issue);
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType name2, java.lang.String errorReason, java.lang.String issue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction(name2, errorReason, issue);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getIssue() {
            return this.issue;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorReason() {
            return this.errorReason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.OnQRCodeSessionErrorAction onQRCodeSessionErrorAction, com.paypal.oslo.feature.qrc.graphql.type.QRCodeSessionActionType qRCodeSessionActionType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qRCodeSessionActionType = onQRCodeSessionErrorAction.name;
            }
            if ((i & 2) != 0) {
                str = onQRCodeSessionErrorAction.errorReason;
            }
            if ((i & 4) != 0) {
                str2 = onQRCodeSessionErrorAction.issue;
            }
            return onQRCodeSessionErrorAction.copy(qRCodeSessionActionType, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;", "", "", "id", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;", "paymentMethod", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentStatus;", "status", "statusReason", "transactionTime", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentStatus;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;", "component3", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentStatus;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentStatus;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Payment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;", "getPaymentMethod", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentStatus;", "getStatus", "getStatusReason", "getTransactionTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payment {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod paymentMethod;
        private final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus status;
        private final java.lang.String statusReason;
        private final java.lang.String transactionTime;

        public Payment(java.lang.String str, com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod qRCodePaymentMethod, com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus qRCodePaymentStatus, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodePaymentMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodePaymentStatus, "");
            this.id = str;
            this.paymentMethod = qRCodePaymentMethod;
            this.status = qRCodePaymentStatus;
            this.statusReason = str2;
            this.transactionTime = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getStatusReason() {
            return this.statusReason;
        }

        public final java.lang.String getTransactionTime() {
            return this.transactionTime;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod qRCodePaymentMethod = this.paymentMethod;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus qRCodePaymentStatus = this.status;
            java.lang.String str2 = this.statusReason;
            java.lang.String str3 = this.transactionTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payment(id=");
            sb.append(str);
            sb.append(", paymentMethod=");
            sb.append(qRCodePaymentMethod);
            sb.append(", status=");
            sb.append(qRCodePaymentStatus);
            sb.append(", statusReason=");
            sb.append(str2);
            sb.append(", transactionTime=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.paymentMethod.hashCode();
            int hashCode3 = this.status.hashCode();
            java.lang.String str = this.statusReason;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.transactionTime;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment = (com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, payment.id) && this.paymentMethod == payment.paymentMethod && this.status == payment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusReason, payment.statusReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTime, payment.transactionTime);
        }

        public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment copy(java.lang.String id, com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod paymentMethod, com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus status, java.lang.String statusReason, java.lang.String transactionTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment(id, paymentMethod, status, statusReason, transactionTime);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getTransactionTime() {
            return this.transactionTime;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getStatusReason() {
            return this.statusReason;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation.Payment payment, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod qRCodePaymentMethod, com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus qRCodePaymentStatus, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = payment.id;
            }
            if ((i & 2) != 0) {
                qRCodePaymentMethod = payment.paymentMethod;
            }
            com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod qRCodePaymentMethod2 = qRCodePaymentMethod;
            if ((i & 4) != 0) {
                qRCodePaymentStatus = payment.status;
            }
            com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentStatus qRCodePaymentStatus2 = qRCodePaymentStatus;
            if ((i & 8) != 0) {
                str2 = payment.statusReason;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                str3 = payment.transactionTime;
            }
            return payment.copy(str, qRCodePaymentMethod2, qRCodePaymentStatus2, str4, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/ConfirmQrCodePaymentMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ConfirmQrCodePayment($input: ConfirmQRCodePaymentInput!) { confirmQrCodePayment(input: $input) { id requiredAction { __typename ... on QRCodeSessionPollingAction { name maximumPollingInterval } ... on QRCodeSessionBasicAction { name } ... on QRCodeSessionErrorAction { name errorReason issue } } payment { id paymentMethod status statusReason transactionTime } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput confirmQRCodePaymentInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmQrCodePaymentMutation(input=");
        sb.append(confirmQRCodePaymentInput);
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
        return (other instanceof com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation) other).input);
    }

    public final com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation copy(com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation copy$default(com.paypal.oslo.feature.qrc.graphql.ConfirmQrCodePaymentMutation confirmQrCodePaymentMutation, com.paypal.oslo.feature.qrc.graphql.type.ConfirmQRCodePaymentInput confirmQRCodePaymentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            confirmQRCodePaymentInput = confirmQrCodePaymentMutation.input;
        }
        return confirmQrCodePaymentMutation.copy(confirmQRCodePaymentInput);
    }
}
