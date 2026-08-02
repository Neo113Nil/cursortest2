package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000b*+,-./0123)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OPERATION_NAME, "OnProvisionDebitInstrumentSuccess", "DebitInstrument", "Product", "LargeImage", "Front", "SmallImage", "Front1", "OnProvisionDebitInstrumentContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProvisionDebitInstrumentMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data> {
    public static final java.lang.String OPERATION_ID = "156e0c91d5fa465318243a3265da959abf2d5500e9804f952ee772f09cc65836";
    public static final java.lang.String OPERATION_NAME = "ProvisionDebitInstrument";
    private final com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Companion(null);
    public static final int $stable = 8;

    public ProvisionDebitInstrumentMutation(com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput provisionDebitInstrumentInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionDebitInstrumentInput, "");
        this.input = provisionDebitInstrumentInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.ProvisionDebitInstrumentMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.ProvisionDebitInstrumentMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.ProvisionDebitInstrumentMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$ProvisionDebitInstrument;", "provisionDebitInstrument", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$ProvisionDebitInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$ProvisionDebitInstrument;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$ProvisionDebitInstrument;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$ProvisionDebitInstrument;", "getProvisionDebitInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument;

        public Data(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionDebitInstrument, "");
            this.provisionDebitInstrument = provisionDebitInstrument;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument getProvisionDebitInstrument() {
            return this.provisionDebitInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument = this.provisionDebitInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(provisionDebitInstrument=");
            sb.append(provisionDebitInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.provisionDebitInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionDebitInstrument, ((com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data) other).provisionDebitInstrument);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data copy(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionDebitInstrument, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data(provisionDebitInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument getProvisionDebitInstrument() {
            return this.provisionDebitInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data data, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                provisionDebitInstrument = data.provisionDebitInstrument;
            }
            return data.copy(provisionDebitInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$ProvisionDebitInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentSuccess;", "onProvisionDebitInstrumentSuccess", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentContingency;", "onProvisionDebitInstrumentContingency", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentSuccess;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentContingency;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentSuccess;", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentContingency;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentSuccess;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentContingency;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$ProvisionDebitInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentSuccess;", "getOnProvisionDebitInstrumentSuccess", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentContingency;", "getOnProvisionDebitInstrumentContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionDebitInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess;

        public ProvisionDebitInstrument(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onProvisionDebitInstrumentSuccess = onProvisionDebitInstrumentSuccess;
            this.onProvisionDebitInstrumentContingency = onProvisionDebitInstrumentContingency;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess getOnProvisionDebitInstrumentSuccess() {
            return this.onProvisionDebitInstrumentSuccess;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency getOnProvisionDebitInstrumentContingency() {
            return this.onProvisionDebitInstrumentContingency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess = this.onProvisionDebitInstrumentSuccess;
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency = this.onProvisionDebitInstrumentContingency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionDebitInstrument(__typename=");
            sb.append(str);
            sb.append(", onProvisionDebitInstrumentSuccess=");
            sb.append(onProvisionDebitInstrumentSuccess);
            sb.append(", onProvisionDebitInstrumentContingency=");
            sb.append(onProvisionDebitInstrumentContingency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess = this.onProvisionDebitInstrumentSuccess;
            int hashCode2 = onProvisionDebitInstrumentSuccess == null ? 0 : onProvisionDebitInstrumentSuccess.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency = this.onProvisionDebitInstrumentContingency;
            return (((hashCode * 31) + hashCode2) * 31) + (onProvisionDebitInstrumentContingency != null ? onProvisionDebitInstrumentContingency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument = (com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, provisionDebitInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onProvisionDebitInstrumentSuccess, provisionDebitInstrument.onProvisionDebitInstrumentSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onProvisionDebitInstrumentContingency, provisionDebitInstrument.onProvisionDebitInstrumentContingency);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument(__typename, onProvisionDebitInstrumentSuccess, onProvisionDebitInstrumentContingency);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency getOnProvisionDebitInstrumentContingency() {
            return this.onProvisionDebitInstrumentContingency;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess getOnProvisionDebitInstrumentSuccess() {
            return this.onProvisionDebitInstrumentSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = provisionDebitInstrument.__typename;
            }
            if ((i & 2) != 0) {
                onProvisionDebitInstrumentSuccess = provisionDebitInstrument.onProvisionDebitInstrumentSuccess;
            }
            if ((i & 4) != 0) {
                onProvisionDebitInstrumentContingency = provisionDebitInstrument.onProvisionDebitInstrumentContingency;
            }
            return provisionDebitInstrument.copy(str, onProvisionDebitInstrumentSuccess, onProvisionDebitInstrumentContingency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentSuccess;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "debitInstrument", "", "processId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "getDebitInstrument", "Ljava/lang/String;", "getProcessId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnProvisionDebitInstrumentSuccess {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument;
        private final java.lang.String processId;

        public OnProvisionDebitInstrumentSuccess(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            this.debitInstrument = debitInstrument;
            this.processId = str;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final java.lang.String getProcessId() {
            return this.processId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument = this.debitInstrument;
            java.lang.String str = this.processId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnProvisionDebitInstrumentSuccess(debitInstrument=");
            sb.append(debitInstrument);
            sb.append(", processId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debitInstrument.hashCode();
            java.lang.String str = this.processId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess = (com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, onProvisionDebitInstrumentSuccess.debitInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.processId, onProvisionDebitInstrumentSuccess.processId);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess copy(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument, java.lang.String processId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess(debitInstrument, processId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProcessId() {
            return this.processId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrument = onProvisionDebitInstrumentSuccess.debitInstrument;
            }
            if ((i & 2) != 0) {
                str = onProvisionDebitInstrumentSuccess.processId;
            }
            return onProvisionDebitInstrumentSuccess.copy(debitInstrument, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "lastNChars", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Product;", "product", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Product;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Product;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Product;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Ljava/lang/Object;", "getLastNChars", "Ljava/util/List;", "getActions", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Product;", "getProduct"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrument {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions;
        private final java.lang.String id;
        private final java.lang.Object lastNChars;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;

        /* JADX WARN: Multi-variable type inference failed */
        public DebitInstrument(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.productName = debitInstrumentProductName;
            this.lastNChars = obj;
            this.actions = list;
            this.product = product;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getActions() {
            return this.actions;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product getProduct() {
            return this.product;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            java.lang.Object obj = this.lastNChars;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product = this.product;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrument(id=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitInstrumentProductName);
            sb.append(", lastNChars=");
            sb.append(obj);
            sb.append(", actions=");
            sb.append(list);
            sb.append(", product=");
            sb.append(product);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            int hashCode2 = debitInstrumentProductName == null ? 0 : debitInstrumentProductName.hashCode();
            java.lang.Object obj = this.lastNChars;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            int hashCode4 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product = this.product;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (product != null ? product.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, debitInstrument.id) && this.productName == debitInstrument.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, debitInstrument.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, debitInstrument.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, debitInstrument.product);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, java.lang.Object lastNChars, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument(id, productName, lastNChars, actions, product);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product getProduct() {
            return this.product;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> component4() {
            return this.actions;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Object obj, java.util.List list, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = debitInstrument.id;
            }
            if ((i & 2) != 0) {
                debitInstrumentProductName = debitInstrument.productName;
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName2 = debitInstrumentProductName;
            if ((i & 4) != 0) {
                obj = debitInstrument.lastNChars;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                list = debitInstrument.actions;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                product = debitInstrument.product;
            }
            return debitInstrument.copy(str, debitInstrumentProductName2, obj3, list2, product);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Product;", "", "", "shortName", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$LargeImage;", "largeImage", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$SmallImage;", "smallImage", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "brand", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$LargeImage;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$SmallImage;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$LargeImage;", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$SmallImage;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$LargeImage;Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$SmallImage;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Product;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getShortName", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$LargeImage;", "getLargeImage", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$SmallImage;", "getSmallImage", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getBrand"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage;
        private final java.lang.String shortName;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage;

        public Product(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand) {
            this.shortName = str;
            this.largeImage = largeImage;
            this.smallImage = smallImage;
            this.brand = cardBrand;
        }

        public final java.lang.String getShortName() {
            return this.shortName;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage getLargeImage() {
            return this.largeImage;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage getSmallImage() {
            return this.smallImage;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.shortName;
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage = this.largeImage;
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage = this.smallImage;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(shortName=");
            sb.append(str);
            sb.append(", largeImage=");
            sb.append(largeImage);
            sb.append(", smallImage=");
            sb.append(smallImage);
            sb.append(", brand=");
            sb.append(cardBrand);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.shortName;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage = this.largeImage;
            int hashCode2 = largeImage == null ? 0 : largeImage.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage = this.smallImage;
            int hashCode3 = smallImage == null ? 0 : smallImage.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cardBrand != null ? cardBrand.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product = (com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.shortName, product.shortName) && kotlin.jvm.internal.Intrinsics.areEqual(this.largeImage, product.largeImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.smallImage, product.smallImage) && this.brand == product.brand;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product copy(java.lang.String shortName, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage, com.paypal.oslo.api.graphql.schema.type.CardBrand brand) {
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product(shortName, largeImage, smallImage, brand);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage getSmallImage() {
            return this.smallImage;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage getLargeImage() {
            return this.largeImage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getShortName() {
            return this.shortName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = product.shortName;
            }
            if ((i & 2) != 0) {
                largeImage = product.largeImage;
            }
            if ((i & 4) != 0) {
                smallImage = product.smallImage;
            }
            if ((i & 8) != 0) {
                cardBrand = product.brand;
            }
            return product.copy(str, largeImage, smallImage, cardBrand);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$LargeImage;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front;", "front", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$LargeImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front;", "getFront"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LargeImage {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front front;

        public LargeImage(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front front) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
            this.front = front;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front getFront() {
            return this.front;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front front = this.front;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LargeImage(front=");
            sb.append(front);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.front.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.front, ((com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage) other).front);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage copy(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front front) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage(front);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front getFront() {
            return this.front;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front front, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                front = largeImage.front;
            }
            return largeImage.copy(front);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front;", "", "referenceUrl", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Front {
        public static final int $stable = 8;
        private final java.lang.Object referenceUrl;

        public Front(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.referenceUrl = obj;
        }

        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.referenceUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Front(referenceUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.referenceUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, ((com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front) other).referenceUrl);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front copy(java.lang.Object referenceUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front(referenceUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front front, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = front.referenceUrl;
            }
            return front.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$SmallImage;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front1;", "front", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front1;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front1;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front1;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$SmallImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front1;", "getFront"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmallImage {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 front;

        public SmallImage(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 front1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front1, "");
            this.front = front1;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 getFront() {
            return this.front;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 front1 = this.front;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SmallImage(front=");
            sb.append(front1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.front.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.front, ((com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage) other).front);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage copy(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 front) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(front, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage(front);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 getFront() {
            return this.front;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 front1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                front1 = smallImage.front;
            }
            return smallImage.copy(front1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front1;", "", "referenceUrl", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Front1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getReferenceUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Front1 {
        public static final int $stable = 8;
        private final java.lang.Object referenceUrl;

        public Front1(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.referenceUrl = obj;
        }

        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.referenceUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Front1(referenceUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.referenceUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceUrl, ((com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1) other).referenceUrl);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 copy(java.lang.Object referenceUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceUrl, "");
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1(referenceUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getReferenceUrl() {
            return this.referenceUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 front1, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = front1.referenceUrl;
            }
            return front1.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentContingency;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyType;", "contingencyType", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyCode;", "contingencyCode", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyValue;", "contingencyValues", "", "processId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyType;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyCode;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyCode;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyType;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyCode;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$OnProvisionDebitInstrumentContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyType;", "getContingencyType", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProvisionContingencyCode;", "getContingencyCode", "Ljava/util/List;", "getContingencyValues", "Ljava/lang/String;", "getProcessId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnProvisionDebitInstrumentContingency {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode contingencyCode;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType contingencyType;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> contingencyValues;
        private final java.lang.String processId;

        /* JADX WARN: Multi-variable type inference failed */
        public OnProvisionDebitInstrumentContingency(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType debitInstrumentProvisionContingencyType, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode debitInstrumentProvisionContingencyCode, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> list, java.lang.String str) {
            this.contingencyType = debitInstrumentProvisionContingencyType;
            this.contingencyCode = debitInstrumentProvisionContingencyCode;
            this.contingencyValues = list;
            this.processId = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType getContingencyType() {
            return this.contingencyType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode getContingencyCode() {
            return this.contingencyCode;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> getContingencyValues() {
            return this.contingencyValues;
        }

        public final java.lang.String getProcessId() {
            return this.processId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType debitInstrumentProvisionContingencyType = this.contingencyType;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode debitInstrumentProvisionContingencyCode = this.contingencyCode;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> list = this.contingencyValues;
            java.lang.String str = this.processId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnProvisionDebitInstrumentContingency(contingencyType=");
            sb.append(debitInstrumentProvisionContingencyType);
            sb.append(", contingencyCode=");
            sb.append(debitInstrumentProvisionContingencyCode);
            sb.append(", contingencyValues=");
            sb.append(list);
            sb.append(", processId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType debitInstrumentProvisionContingencyType = this.contingencyType;
            int hashCode = debitInstrumentProvisionContingencyType == null ? 0 : debitInstrumentProvisionContingencyType.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode debitInstrumentProvisionContingencyCode = this.contingencyCode;
            int hashCode2 = debitInstrumentProvisionContingencyCode == null ? 0 : debitInstrumentProvisionContingencyCode.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> list = this.contingencyValues;
            int hashCode3 = list == null ? 0 : list.hashCode();
            java.lang.String str = this.processId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency = (com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency) other;
            return this.contingencyType == onProvisionDebitInstrumentContingency.contingencyType && this.contingencyCode == onProvisionDebitInstrumentContingency.contingencyCode && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencyValues, onProvisionDebitInstrumentContingency.contingencyValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.processId, onProvisionDebitInstrumentContingency.processId);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType contingencyType, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode contingencyCode, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> contingencyValues, java.lang.String processId) {
            return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency(contingencyType, contingencyCode, contingencyValues, processId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getProcessId() {
            return this.processId;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> component3() {
            return this.contingencyValues;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode getContingencyCode() {
            return this.contingencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType getContingencyType() {
            return this.contingencyType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType debitInstrumentProvisionContingencyType, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode debitInstrumentProvisionContingencyCode, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentProvisionContingencyType = onProvisionDebitInstrumentContingency.contingencyType;
            }
            if ((i & 2) != 0) {
                debitInstrumentProvisionContingencyCode = onProvisionDebitInstrumentContingency.contingencyCode;
            }
            if ((i & 4) != 0) {
                list = onProvisionDebitInstrumentContingency.contingencyValues;
            }
            if ((i & 8) != 0) {
                str = onProvisionDebitInstrumentContingency.processId;
            }
            return onProvisionDebitInstrumentContingency.copy(debitInstrumentProvisionContingencyType, debitInstrumentProvisionContingencyCode, list, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ProvisionDebitInstrument($input: ProvisionDebitInstrumentInput!) { provisionDebitInstrument(input: $input) { __typename ... on ProvisionDebitInstrumentSuccess { debitInstrument { id productName lastNChars actions product { shortName largeImage { front { referenceUrl } } smallImage { front { referenceUrl } } brand } } processId } ... on ProvisionDebitInstrumentContingency { contingencyType contingencyCode contingencyValues processId } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput provisionDebitInstrumentInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionDebitInstrumentMutation(input=");
        sb.append(provisionDebitInstrumentInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation copy(com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation copy$default(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation provisionDebitInstrumentMutation, com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput provisionDebitInstrumentInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            provisionDebitInstrumentInput = provisionDebitInstrumentMutation.input;
        }
        return provisionDebitInstrumentMutation.copy(provisionDebitInstrumentInput);
    }
}
