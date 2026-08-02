package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;)Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CreateDebitInstrumentDigitizationDataInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.OPERATION_NAME, "RiskDecision"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateDebitInstrumentDigitizationDataMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data> {
    public static final java.lang.String OPERATION_ID = "48f1475366b974ae38e10ebb3defd3b892f47e8e8c116fac8d75222af87f6b66";
    public static final java.lang.String OPERATION_NAME = "CreateDebitInstrumentDigitizationData";
    private final com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Companion(null);
    public static final int $stable = 8;

    public CreateDebitInstrumentDigitizationDataMutation(com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput createDebitInstrumentDigitizationDataInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createDebitInstrumentDigitizationDataInput, "");
        this.input = createDebitInstrumentDigitizationDataInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.CreateDebitInstrumentDigitizationDataMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.CreateDebitInstrumentDigitizationDataMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.CreateDebitInstrumentDigitizationDataMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$CreateDebitInstrumentDigitizationData;", "createDebitInstrumentDigitizationData", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$CreateDebitInstrumentDigitizationData;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$CreateDebitInstrumentDigitizationData;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$CreateDebitInstrumentDigitizationData;)Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$CreateDebitInstrumentDigitizationData;", "getCreateDebitInstrumentDigitizationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData createDebitInstrumentDigitizationData;

        public Data(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData createDebitInstrumentDigitizationData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createDebitInstrumentDigitizationData, "");
            this.createDebitInstrumentDigitizationData = createDebitInstrumentDigitizationData;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData getCreateDebitInstrumentDigitizationData() {
            return this.createDebitInstrumentDigitizationData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData createDebitInstrumentDigitizationData = this.createDebitInstrumentDigitizationData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(createDebitInstrumentDigitizationData=");
            sb.append(createDebitInstrumentDigitizationData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.createDebitInstrumentDigitizationData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.createDebitInstrumentDigitizationData, ((com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data) other).createDebitInstrumentDigitizationData);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data copy(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData createDebitInstrumentDigitizationData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createDebitInstrumentDigitizationData, "");
            return new com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data(createDebitInstrumentDigitizationData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData getCreateDebitInstrumentDigitizationData() {
            return this.createDebitInstrumentDigitizationData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.Data data, com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData createDebitInstrumentDigitizationData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createDebitInstrumentDigitizationData = data.createDebitInstrumentDigitizationData;
            }
            return data.copy(createDebitInstrumentDigitizationData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$CreateDebitInstrumentDigitizationData;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$RiskDecision;", "riskDecision", "", "passData", "activationData", "ephemeralPublicKey", "preDigitizationData", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$RiskDecision;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$RiskDecision;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$RiskDecision;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$CreateDebitInstrumentDigitizationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$RiskDecision;", "getRiskDecision", "Ljava/lang/String;", "getPassData", "getActivationData", "getEphemeralPublicKey", "getPreDigitizationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateDebitInstrumentDigitizationData {
        public static final int $stable = 0;
        private final java.lang.String activationData;
        private final java.lang.String ephemeralPublicKey;
        private final java.lang.String passData;
        private final java.lang.String preDigitizationData;
        private final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision;

        public CreateDebitInstrumentDigitizationData(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.riskDecision = riskDecision;
            this.passData = str;
            this.activationData = str2;
            this.ephemeralPublicKey = str3;
            this.preDigitizationData = str4;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision getRiskDecision() {
            return this.riskDecision;
        }

        public final java.lang.String getPassData() {
            return this.passData;
        }

        public final java.lang.String getActivationData() {
            return this.activationData;
        }

        public final java.lang.String getEphemeralPublicKey() {
            return this.ephemeralPublicKey;
        }

        public final java.lang.String getPreDigitizationData() {
            return this.preDigitizationData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision = this.riskDecision;
            java.lang.String str = this.passData;
            java.lang.String str2 = this.activationData;
            java.lang.String str3 = this.ephemeralPublicKey;
            java.lang.String str4 = this.preDigitizationData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateDebitInstrumentDigitizationData(riskDecision=");
            sb.append(riskDecision);
            sb.append(", passData=");
            sb.append(str);
            sb.append(", activationData=");
            sb.append(str2);
            sb.append(", ephemeralPublicKey=");
            sb.append(str3);
            sb.append(", preDigitizationData=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision = this.riskDecision;
            int hashCode = riskDecision == null ? 0 : riskDecision.hashCode();
            java.lang.String str = this.passData;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.activationData;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.ephemeralPublicKey;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.preDigitizationData;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData createDebitInstrumentDigitizationData = (com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.riskDecision, createDebitInstrumentDigitizationData.riskDecision) && kotlin.jvm.internal.Intrinsics.areEqual(this.passData, createDebitInstrumentDigitizationData.passData) && kotlin.jvm.internal.Intrinsics.areEqual(this.activationData, createDebitInstrumentDigitizationData.activationData) && kotlin.jvm.internal.Intrinsics.areEqual(this.ephemeralPublicKey, createDebitInstrumentDigitizationData.ephemeralPublicKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.preDigitizationData, createDebitInstrumentDigitizationData.preDigitizationData);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData copy(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision, java.lang.String passData, java.lang.String activationData, java.lang.String ephemeralPublicKey, java.lang.String preDigitizationData) {
            return new com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData(riskDecision, passData, activationData, ephemeralPublicKey, preDigitizationData);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getPreDigitizationData() {
            return this.preDigitizationData;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getEphemeralPublicKey() {
            return this.ephemeralPublicKey;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getActivationData() {
            return this.activationData;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPassData() {
            return this.passData;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision getRiskDecision() {
            return this.riskDecision;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData copy$default(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.CreateDebitInstrumentDigitizationData createDebitInstrumentDigitizationData, com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                riskDecision = createDebitInstrumentDigitizationData.riskDecision;
            }
            if ((i & 2) != 0) {
                str = createDebitInstrumentDigitizationData.passData;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = createDebitInstrumentDigitizationData.activationData;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = createDebitInstrumentDigitizationData.ephemeralPublicKey;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                str4 = createDebitInstrumentDigitizationData.preDigitizationData;
            }
            return createDebitInstrumentDigitizationData.copy(riskDecision, str5, str6, str7, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$RiskDecision;", "", "", "id", "paymentConsentDecisionCode", "paymentConsentDecisionDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$RiskDecision;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getPaymentConsentDecisionCode", "getPaymentConsentDecisionDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RiskDecision {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String paymentConsentDecisionCode;
        private final java.lang.String paymentConsentDecisionDescription;

        public RiskDecision(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.id = str;
            this.paymentConsentDecisionCode = str2;
            this.paymentConsentDecisionDescription = str3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getPaymentConsentDecisionCode() {
            return this.paymentConsentDecisionCode;
        }

        public final java.lang.String getPaymentConsentDecisionDescription() {
            return this.paymentConsentDecisionDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.paymentConsentDecisionCode;
            java.lang.String str3 = this.paymentConsentDecisionDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RiskDecision(id=");
            sb.append(str);
            sb.append(", paymentConsentDecisionCode=");
            sb.append(str2);
            sb.append(", paymentConsentDecisionDescription=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.paymentConsentDecisionCode;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.paymentConsentDecisionDescription;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision = (com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, riskDecision.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentConsentDecisionCode, riskDecision.paymentConsentDecisionCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentConsentDecisionDescription, riskDecision.paymentConsentDecisionDescription);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision copy(java.lang.String id, java.lang.String paymentConsentDecisionCode, java.lang.String paymentConsentDecisionDescription) {
            return new com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision(id, paymentConsentDecisionCode, paymentConsentDecisionDescription);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPaymentConsentDecisionDescription() {
            return this.paymentConsentDecisionDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPaymentConsentDecisionCode() {
            return this.paymentConsentDecisionCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision copy$default(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation.RiskDecision riskDecision, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = riskDecision.id;
            }
            if ((i & 2) != 0) {
                str2 = riskDecision.paymentConsentDecisionCode;
            }
            if ((i & 4) != 0) {
                str3 = riskDecision.paymentConsentDecisionDescription;
            }
            return riskDecision.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/CreateDebitInstrumentDigitizationDataMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateDebitInstrumentDigitizationData($input: CreateDebitInstrumentDigitizationDataInput!) { createDebitInstrumentDigitizationData(input: $input) { riskDecision { id paymentConsentDecisionCode paymentConsentDecisionDescription } passData activationData ephemeralPublicKey preDigitizationData } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput createDebitInstrumentDigitizationDataInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateDebitInstrumentDigitizationDataMutation(input=");
        sb.append(createDebitInstrumentDigitizationDataInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation copy(com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation copy$default(com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation createDebitInstrumentDigitizationDataMutation, com.paypal.oslo.api.graphql.schema.type.CreateDebitInstrumentDigitizationDataInput createDebitInstrumentDigitizationDataInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createDebitInstrumentDigitizationDataInput = createDebitInstrumentDigitizationDataMutation.input;
        }
        return createDebitInstrumentDigitizationDataMutation.copy(createDebitInstrumentDigitizationDataInput);
    }
}
