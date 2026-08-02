package com.paypal.oslo.feature.bnplservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CancelBNPLAutopayInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CancelBNPLAutopayInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CancelBNPLAutopayInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CancelBNPLAutopayInput;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CancelBNPLAutopayInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.OPERATION_NAME, "NextPaymentDueAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CancelBnplAutopayMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data> {
    public static final java.lang.String OPERATION_ID = "518c350a0f11d3d3472722058e03972f8a012299cda11e24c733611c60d1fb0c";
    public static final java.lang.String OPERATION_NAME = "CancelBnplAutopay";
    private final com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Companion(null);
    public static final int $stable = 8;

    public CancelBnplAutopayMutation(com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput cancelBNPLAutopayInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelBNPLAutopayInput, "");
        this.input = cancelBNPLAutopayInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput getInput() {
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
        com.paypal.oslo.feature.bnplservicing.graphql.adapter.CancelBnplAutopayMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.adapter.CancelBnplAutopayMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplservicing.graphql.selections.CancelBnplAutopayMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$CancelBnplAutopay;", "cancelBnplAutopay", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$CancelBnplAutopay;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$CancelBnplAutopay;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$CancelBnplAutopay;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$CancelBnplAutopay;", "getCancelBnplAutopay"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay;

        public Data(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay) {
            this.cancelBnplAutopay = cancelBnplAutopay;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay getCancelBnplAutopay() {
            return this.cancelBnplAutopay;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay = this.cancelBnplAutopay;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cancelBnplAutopay=");
            sb.append(cancelBnplAutopay);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay = this.cancelBnplAutopay;
            if (cancelBnplAutopay == null) {
                return 0;
            }
            return cancelBnplAutopay.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancelBnplAutopay, ((com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data) other).cancelBnplAutopay);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data copy(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data(cancelBnplAutopay);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay getCancelBnplAutopay() {
            return this.cancelBnplAutopay;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.Data data, com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cancelBnplAutopay = data.cancelBnplAutopay;
            }
            return data.copy(cancelBnplAutopay);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$CancelBnplAutopay;", "", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$NextPaymentDueAmount;", "nextPaymentDueAmount", "nextPaymentDueDate", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$NextPaymentDueAmount;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$NextPaymentDueAmount;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$NextPaymentDueAmount;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$CancelBnplAutopay;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$NextPaymentDueAmount;", "getNextPaymentDueAmount", "Ljava/lang/Object;", "getNextPaymentDueDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelBnplAutopay {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount;
        private final java.lang.Object nextPaymentDueDate;

        public CancelBnplAutopay(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount, java.lang.Object obj) {
            this.nextPaymentDueAmount = nextPaymentDueAmount;
            this.nextPaymentDueDate = obj;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount getNextPaymentDueAmount() {
            return this.nextPaymentDueAmount;
        }

        public final java.lang.Object getNextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount = this.nextPaymentDueAmount;
            java.lang.Object obj = this.nextPaymentDueDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelBnplAutopay(nextPaymentDueAmount=");
            sb.append(nextPaymentDueAmount);
            sb.append(", nextPaymentDueDate=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount = this.nextPaymentDueAmount;
            int hashCode = nextPaymentDueAmount == null ? 0 : nextPaymentDueAmount.hashCode();
            java.lang.Object obj = this.nextPaymentDueDate;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay = (com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDueAmount, cancelBnplAutopay.nextPaymentDueAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPaymentDueDate, cancelBnplAutopay.nextPaymentDueDate);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay copy(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount, java.lang.Object nextPaymentDueDate) {
            return new com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay(nextPaymentDueAmount, nextPaymentDueDate);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getNextPaymentDueDate() {
            return this.nextPaymentDueDate;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount getNextPaymentDueAmount() {
            return this.nextPaymentDueAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.CancelBnplAutopay cancelBnplAutopay, com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                nextPaymentDueAmount = cancelBnplAutopay.nextPaymentDueAmount;
            }
            if ((i & 2) != 0) {
                obj = cancelBnplAutopay.nextPaymentDueDate;
            }
            return cancelBnplAutopay.copy(nextPaymentDueAmount, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$NextPaymentDueAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "bnplServicingMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;)Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$NextPaymentDueAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "getBnplServicingMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NextPaymentDueAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;

        public NextPaymentDueAmount(java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            this.__typename = str;
            this.bnplServicingMoneyFragment = bnplServicingMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment = this.bnplServicingMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NextPaymentDueAmount(__typename=");
            sb.append(str);
            sb.append(", bnplServicingMoneyFragment=");
            sb.append(bnplServicingMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplServicingMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount = (com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, nextPaymentDueAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplServicingMoneyFragment, nextPaymentDueAmount.bnplServicingMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount(__typename, bnplServicingMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment getBnplServicingMoneyFragment() {
            return this.bnplServicingMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation.NextPaymentDueAmount nextPaymentDueAmount, java.lang.String str, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = nextPaymentDueAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplServicingMoneyFragment = nextPaymentDueAmount.bnplServicingMoneyFragment;
            }
            return nextPaymentDueAmount.copy(str, bnplServicingMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/CancelBnplAutopayMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CancelBnplAutopay($input: CancelBNPLAutopayInput!) { cancelBnplAutopay(input: $input) { nextPaymentDueAmount { __typename ...BnplServicingMoneyFragment } nextPaymentDueDate } }  fragment BnplServicingMoneyFragment on Money { currencyCode value }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput cancelBNPLAutopayInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelBnplAutopayMutation(input=");
        sb.append(cancelBNPLAutopayInput);
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
        return (other instanceof com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation) other).input);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation copy(com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation copy$default(com.paypal.oslo.feature.bnplservicing.graphql.CancelBnplAutopayMutation cancelBnplAutopayMutation, com.paypal.oslo.api.graphql.schema.type.CancelBNPLAutopayInput cancelBNPLAutopayInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancelBNPLAutopayInput = cancelBnplAutopayMutation.input;
        }
        return cancelBnplAutopayMutation.copy(cancelBNPLAutopayInput);
    }
}
