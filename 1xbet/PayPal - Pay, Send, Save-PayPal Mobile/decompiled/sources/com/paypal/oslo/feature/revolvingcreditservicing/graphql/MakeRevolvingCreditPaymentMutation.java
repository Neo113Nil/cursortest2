package com.paypal.oslo.feature.revolvingcreditservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/MakeRevolvingCreditPaymentInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MakeRevolvingCreditPaymentInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MakeRevolvingCreditPaymentInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MakeRevolvingCreditPaymentInput;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/MakeRevolvingCreditPaymentInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.OPERATION_NAME, "Amount", "FundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MakeRevolvingCreditPaymentMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data> {
    public static final java.lang.String OPERATION_ID = "04c5a7a26eade2f672b8b55ffc748e252696a6c92874c125839b93fd493d7b30";
    public static final java.lang.String OPERATION_NAME = "MakeRevolvingCreditPayment";
    private final com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Companion(null);
    public static final int $stable = 8;

    public MakeRevolvingCreditPaymentMutation(com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput makeRevolvingCreditPaymentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeRevolvingCreditPaymentInput, "");
        this.input = makeRevolvingCreditPaymentInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput getInput() {
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.MakeRevolvingCreditPaymentMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.MakeRevolvingCreditPaymentMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.MakeRevolvingCreditPaymentMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$MakeRevolvingCreditPayment;", "makeRevolvingCreditPayment", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$MakeRevolvingCreditPayment;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$MakeRevolvingCreditPayment;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$MakeRevolvingCreditPayment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$MakeRevolvingCreditPayment;", "getMakeRevolvingCreditPayment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment;

        public Data(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment) {
            this.makeRevolvingCreditPayment = makeRevolvingCreditPayment;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment getMakeRevolvingCreditPayment() {
            return this.makeRevolvingCreditPayment;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment = this.makeRevolvingCreditPayment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(makeRevolvingCreditPayment=");
            sb.append(makeRevolvingCreditPayment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment = this.makeRevolvingCreditPayment;
            if (makeRevolvingCreditPayment == null) {
                return 0;
            }
            return makeRevolvingCreditPayment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.makeRevolvingCreditPayment, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data) other).makeRevolvingCreditPayment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data(makeRevolvingCreditPayment);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment getMakeRevolvingCreditPayment() {
            return this.makeRevolvingCreditPayment;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Data data, com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                makeRevolvingCreditPayment = data.makeRevolvingCreditPayment;
            }
            return data.copy(makeRevolvingCreditPayment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$MakeRevolvingCreditPayment;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Amount;", "amount", "date", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$FundingInstrument;", "fundingInstruments", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;", "type", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Amount;Ljava/lang/Object;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Amount;", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Amount;Ljava/lang/Object;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$MakeRevolvingCreditPayment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Amount;", "getAmount", "Ljava/lang/Object;", "getDate", "Ljava/util/List;", "getFundingInstruments", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MakeRevolvingCreditPayment {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount amount;
        private final java.lang.Object date;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument> fundingInstruments;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType type;

        public MakeRevolvingCreditPayment(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount amount, java.lang.Object obj, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument> list, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType revolvingCreditPaymentType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentType, "");
            this.amount = amount;
            this.date = obj;
            this.fundingInstruments = list;
            this.type = revolvingCreditPaymentType;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.Object getDate() {
            return this.date;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount amount = this.amount;
            java.lang.Object obj = this.date;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument> list = this.fundingInstruments;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType revolvingCreditPaymentType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeRevolvingCreditPayment(amount=");
            sb.append(amount);
            sb.append(", date=");
            sb.append(obj);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(", type=");
            sb.append(revolvingCreditPaymentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            java.lang.Object obj = this.date;
            return (((((hashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.fundingInstruments.hashCode()) * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, makeRevolvingCreditPayment.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, makeRevolvingCreditPayment.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, makeRevolvingCreditPayment.fundingInstruments) && this.type == makeRevolvingCreditPayment.type;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount amount, java.lang.Object date, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument> fundingInstruments, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment(amount, date, fundingInstruments, type);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType getType() {
            return this.type;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument> component3() {
            return this.fundingInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getDate() {
            return this.date;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount getAmount() {
            return this.amount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.MakeRevolvingCreditPayment makeRevolvingCreditPayment, com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount amount, java.lang.Object obj, java.util.List list, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType revolvingCreditPaymentType, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                amount = makeRevolvingCreditPayment.amount;
            }
            if ((i & 2) != 0) {
                obj = makeRevolvingCreditPayment.date;
            }
            if ((i & 4) != 0) {
                list = makeRevolvingCreditPayment.fundingInstruments;
            }
            if ((i & 8) != 0) {
                revolvingCreditPaymentType = makeRevolvingCreditPayment.type;
            }
            return makeRevolvingCreditPayment.copy(amount, obj, list, revolvingCreditPaymentType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "revolvingCreditMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditMoneyFragment;", "getRevolvingCreditMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            this.__typename = str;
            this.revolvingCreditMoneyFragment = revolvingCreditMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment = this.revolvingCreditMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditMoneyFragment=");
            sb.append(revolvingCreditMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount amount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditMoneyFragment, amount.revolvingCreditMoneyFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditMoneyFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount(__typename, revolvingCreditMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment getRevolvingCreditMoneyFragment() {
            return this.revolvingCreditMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.Amount amount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditMoneyFragment = amount.revolvingCreditMoneyFragment;
            }
            return amount.copy(str, revolvingCreditMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$FundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentFundingInstrumentsFragment;", "revolvingCreditPaymentFundingInstrumentsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentFundingInstrumentsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentFundingInstrumentsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentFundingInstrumentsFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$FundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentFundingInstrumentsFragment;", "getRevolvingCreditPaymentFundingInstrumentsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment;

        public FundingInstrument(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentFundingInstrumentsFragment, "");
            this.__typename = str;
            this.revolvingCreditPaymentFundingInstrumentsFragment = revolvingCreditPaymentFundingInstrumentsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment getRevolvingCreditPaymentFundingInstrumentsFragment() {
            return this.revolvingCreditPaymentFundingInstrumentsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment = this.revolvingCreditPaymentFundingInstrumentsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrument(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditPaymentFundingInstrumentsFragment=");
            sb.append(revolvingCreditPaymentFundingInstrumentsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditPaymentFundingInstrumentsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPaymentFundingInstrumentsFragment, fundingInstrument.revolvingCreditPaymentFundingInstrumentsFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentFundingInstrumentsFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument(__typename, revolvingCreditPaymentFundingInstrumentsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment getRevolvingCreditPaymentFundingInstrumentsFragment() {
            return this.revolvingCreditPaymentFundingInstrumentsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation.FundingInstrument fundingInstrument, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditPaymentFundingInstrumentsFragment = fundingInstrument.revolvingCreditPaymentFundingInstrumentsFragment;
            }
            return fundingInstrument.copy(str, revolvingCreditPaymentFundingInstrumentsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/MakeRevolvingCreditPaymentMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation MakeRevolvingCreditPayment($input: MakeRevolvingCreditPaymentInput!) { makeRevolvingCreditPayment(input: $input) { amount { __typename ...RevolvingCreditMoneyFragment } date fundingInstruments { __typename ...RevolvingCreditPaymentFundingInstrumentsFragment } type } }  fragment RevolvingCreditMoneyFragment on Money { currencyCode value }  fragment RevolvingCreditImageFragment on CreditImage { url assetName }  fragment RevolvingCreditPaymentFundingInstrumentsFragment on RevolvingCreditPaymentFundingInstrument { __typename ... on RevolvingCreditPaymentFundingInstrumentBalance { id art { __typename ...RevolvingCreditImageFragment } amount { __typename ...RevolvingCreditMoneyFragment } } ... on RevolvingCreditPaymentFundingInstrumentBank { id type bankLastNChars: lastNChars name art { __typename ...RevolvingCreditImageFragment } } ... on RevolvingCreditPaymentFundingInstrumentCard { id cardLastNChars: lastNChars name art { __typename ...RevolvingCreditImageFragment } productClass } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput makeRevolvingCreditPaymentInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeRevolvingCreditPaymentMutation(input=");
        sb.append(makeRevolvingCreditPaymentInput);
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
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation) other).input);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation copy(com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.MakeRevolvingCreditPaymentMutation makeRevolvingCreditPaymentMutation, com.paypal.oslo.api.graphql.schema.type.MakeRevolvingCreditPaymentInput makeRevolvingCreditPaymentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            makeRevolvingCreditPaymentInput = makeRevolvingCreditPaymentMutation.input;
        }
        return makeRevolvingCreditPaymentMutation.copy(makeRevolvingCreditPaymentInput);
    }
}
