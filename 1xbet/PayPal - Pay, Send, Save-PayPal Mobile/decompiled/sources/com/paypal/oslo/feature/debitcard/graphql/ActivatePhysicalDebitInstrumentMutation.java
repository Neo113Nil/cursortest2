package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivatePhysicalDebitInstrumentInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivatePhysicalDebitInstrumentInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivatePhysicalDebitInstrumentInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivatePhysicalDebitInstrumentInput;)Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ActivatePhysicalDebitInstrumentInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActivatePhysicalDebitInstrumentMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data> {
    public static final java.lang.String OPERATION_ID = "59a31fc37acbf2043e396c41237367f5afb7d619007758b5ac9de7862ca27c20";
    public static final java.lang.String OPERATION_NAME = "ActivatePhysicalDebitInstrument";
    private final com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Companion(null);
    public static final int $stable = 8;

    public ActivatePhysicalDebitInstrumentMutation(com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput activatePhysicalDebitInstrumentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatePhysicalDebitInstrumentInput, "");
        this.input = activatePhysicalDebitInstrumentInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.ActivatePhysicalDebitInstrumentMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.ActivatePhysicalDebitInstrumentMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.ActivatePhysicalDebitInstrumentMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$ActivatePhysicalDebitInstrument;", "activatePhysicalDebitInstrument", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$ActivatePhysicalDebitInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$ActivatePhysicalDebitInstrument;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$ActivatePhysicalDebitInstrument;)Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$ActivatePhysicalDebitInstrument;", "getActivatePhysicalDebitInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument activatePhysicalDebitInstrument;

        public Data(com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument activatePhysicalDebitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatePhysicalDebitInstrument, "");
            this.activatePhysicalDebitInstrument = activatePhysicalDebitInstrument;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument getActivatePhysicalDebitInstrument() {
            return this.activatePhysicalDebitInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument activatePhysicalDebitInstrument = this.activatePhysicalDebitInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(activatePhysicalDebitInstrument=");
            sb.append(activatePhysicalDebitInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activatePhysicalDebitInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.activatePhysicalDebitInstrument, ((com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data) other).activatePhysicalDebitInstrument);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data copy(com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument activatePhysicalDebitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatePhysicalDebitInstrument, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data(activatePhysicalDebitInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument getActivatePhysicalDebitInstrument() {
            return this.activatePhysicalDebitInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.Data data, com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument activatePhysicalDebitInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activatePhysicalDebitInstrument = data.activatePhysicalDebitInstrument;
            }
            return data.copy(activatePhysicalDebitInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$ActivatePhysicalDebitInstrument;", "", "", "instrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "lifecycleState", "", "isPrimary", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "component4", "()Z", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;Z)Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$ActivatePhysicalDebitInstrument;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "getLifecycleState", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivatePhysicalDebitInstrument {
        public static final int $stable = 0;
        private final java.lang.String instrumentId;
        private final boolean isPrimary;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState lifecycleState;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;

        public ActivatePhysicalDebitInstrument(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductName, "");
            this.instrumentId = str;
            this.productName = debitInstrumentProductName;
            this.lifecycleState = debitInstrumentLifecycleState;
            this.isPrimary = z;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getLifecycleState() {
            return this.lifecycleState;
        }

        public final boolean isPrimary() {
            return this.isPrimary;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.instrumentId;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
            boolean z = this.isPrimary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivatePhysicalDebitInstrument(instrumentId=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitInstrumentProductName);
            sb.append(", lifecycleState=");
            sb.append(debitInstrumentLifecycleState);
            sb.append(", isPrimary=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.instrumentId.hashCode();
            int hashCode2 = this.productName.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
            return (((((hashCode * 31) + hashCode2) * 31) + (debitInstrumentLifecycleState == null ? 0 : debitInstrumentLifecycleState.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isPrimary);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument activatePhysicalDebitInstrument = (com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, activatePhysicalDebitInstrument.instrumentId) && this.productName == activatePhysicalDebitInstrument.productName && this.lifecycleState == activatePhysicalDebitInstrument.lifecycleState && this.isPrimary == activatePhysicalDebitInstrument.isPrimary;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument copy(java.lang.String instrumentId, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState lifecycleState, boolean isPrimary) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument(instrumentId, productName, lifecycleState, isPrimary);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsPrimary() {
            return this.isPrimary;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getLifecycleState() {
            return this.lifecycleState;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument copy$default(com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation.ActivatePhysicalDebitInstrument activatePhysicalDebitInstrument, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activatePhysicalDebitInstrument.instrumentId;
            }
            if ((i & 2) != 0) {
                debitInstrumentProductName = activatePhysicalDebitInstrument.productName;
            }
            if ((i & 4) != 0) {
                debitInstrumentLifecycleState = activatePhysicalDebitInstrument.lifecycleState;
            }
            if ((i & 8) != 0) {
                z = activatePhysicalDebitInstrument.isPrimary;
            }
            return activatePhysicalDebitInstrument.copy(str, debitInstrumentProductName, debitInstrumentLifecycleState, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ActivatePhysicalDebitInstrumentMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ActivatePhysicalDebitInstrument($input: ActivatePhysicalDebitInstrumentInput!) { activatePhysicalDebitInstrument(input: $input) { instrumentId productName lifecycleState isPrimary } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput activatePhysicalDebitInstrumentInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivatePhysicalDebitInstrumentMutation(input=");
        sb.append(activatePhysicalDebitInstrumentInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation copy(com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation copy$default(com.paypal.oslo.feature.debitcard.graphql.ActivatePhysicalDebitInstrumentMutation activatePhysicalDebitInstrumentMutation, com.paypal.oslo.api.graphql.schema.type.ActivatePhysicalDebitInstrumentInput activatePhysicalDebitInstrumentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activatePhysicalDebitInstrumentInput = activatePhysicalDebitInstrumentMutation.input;
        }
        return activatePhysicalDebitInstrumentMutation.copy(activatePhysicalDebitInstrumentInput);
    }
}
