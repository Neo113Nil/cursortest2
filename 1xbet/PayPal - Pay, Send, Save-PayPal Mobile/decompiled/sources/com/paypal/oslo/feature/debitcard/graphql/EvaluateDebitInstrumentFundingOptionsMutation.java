package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\r*+,-./012345)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateDebitInstrumentFundingOptionsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateDebitInstrumentFundingOptionsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EvaluateDebitInstrumentFundingOptionsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EvaluateDebitInstrumentFundingOptionsInput;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateDebitInstrumentFundingOptionsInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.OPERATION_NAME, "Funding", "Options", "FundingSource", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Contingency", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "UserPreferences", "FundingSource1", "Image1", "Contingency1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EvaluateDebitInstrumentFundingOptionsMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data> {
    public static final java.lang.String OPERATION_ID = "15e80ed80027e104f5b8f2edf98cedb6ac5bc769bf466eef6ae3b7ab05eb8f3b";
    public static final java.lang.String OPERATION_NAME = "EvaluateDebitInstrumentFundingOptions";
    private final com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Companion(null);
    public static final int $stable = 8;

    public EvaluateDebitInstrumentFundingOptionsMutation(com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput evaluateDebitInstrumentFundingOptionsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateDebitInstrumentFundingOptionsInput, "");
        this.input = evaluateDebitInstrumentFundingOptionsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.EvaluateDebitInstrumentFundingOptionsMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.EvaluateDebitInstrumentFundingOptionsMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;", "evaluateDebitInstrumentFundingOptions", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;", "getEvaluateDebitInstrumentFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions evaluateDebitInstrumentFundingOptions;

        public Data(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions evaluateDebitInstrumentFundingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateDebitInstrumentFundingOptions, "");
            this.evaluateDebitInstrumentFundingOptions = evaluateDebitInstrumentFundingOptions;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions getEvaluateDebitInstrumentFundingOptions() {
            return this.evaluateDebitInstrumentFundingOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions evaluateDebitInstrumentFundingOptions = this.evaluateDebitInstrumentFundingOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(evaluateDebitInstrumentFundingOptions=");
            sb.append(evaluateDebitInstrumentFundingOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.evaluateDebitInstrumentFundingOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluateDebitInstrumentFundingOptions, ((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data) other).evaluateDebitInstrumentFundingOptions);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data copy(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions evaluateDebitInstrumentFundingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateDebitInstrumentFundingOptions, "");
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data(evaluateDebitInstrumentFundingOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions getEvaluateDebitInstrumentFundingOptions() {
            return this.evaluateDebitInstrumentFundingOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data data, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions evaluateDebitInstrumentFundingOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                evaluateDebitInstrumentFundingOptions = data.evaluateDebitInstrumentFundingOptions;
            }
            return data.copy(evaluateDebitInstrumentFundingOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;", "funding", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$EvaluateDebitInstrumentFundingOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;", "getFunding"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EvaluateDebitInstrumentFundingOptions {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding;

        public EvaluateDebitInstrumentFundingOptions(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding) {
            this.funding = funding;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding getFunding() {
            return this.funding;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding = this.funding;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateDebitInstrumentFundingOptions(funding=");
            sb.append(funding);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding = this.funding;
            if (funding == null) {
                return 0;
            }
            return funding.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.funding, ((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions) other).funding);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions copy(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions(funding);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding getFunding() {
            return this.funding;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.EvaluateDebitInstrumentFundingOptions evaluateDebitInstrumentFundingOptions, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                funding = evaluateDebitInstrumentFundingOptions.funding;
            }
            return evaluateDebitInstrumentFundingOptions.copy(funding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;", "options", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Funding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;", "getOptions", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;", "getConfiguration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Funding {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options;

        public Funding(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration) {
            this.options = options;
            this.configuration = configuration;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options getOptions() {
            return this.options;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration getConfiguration() {
            return this.configuration;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options = this.options;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration = this.configuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Funding(options=");
            sb.append(options);
            sb.append(", configuration=");
            sb.append(configuration);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options = this.options;
            int hashCode = options == null ? 0 : options.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration = this.configuration;
            return (hashCode * 31) + (configuration != null ? configuration.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.options, funding.options) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, funding.configuration);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding copy(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding(options, configuration);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options getOptions() {
            return this.options;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                options = funding.options;
            }
            if ((i & 2) != 0) {
                configuration = funding.configuration;
            }
            return funding.copy(options, configuration);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;", "", "", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource;", "fundingSources", "", "canOptOutOfPrimary", "canOptOutOfSecondary", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Options;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFundingSources", "Ljava/lang/Boolean;", "getCanOptOutOfPrimary", "getCanOptOutOfSecondary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Options {
        public static final int $stable = 8;
        private final java.lang.Boolean canOptOutOfPrimary;
        private final java.lang.Boolean canOptOutOfSecondary;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> fundingSources;

        public Options(java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> list, java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.fundingSources = list;
            this.canOptOutOfPrimary = bool;
            this.canOptOutOfSecondary = bool2;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> getFundingSources() {
            return this.fundingSources;
        }

        public final java.lang.Boolean getCanOptOutOfPrimary() {
            return this.canOptOutOfPrimary;
        }

        public final java.lang.Boolean getCanOptOutOfSecondary() {
            return this.canOptOutOfSecondary;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> list = this.fundingSources;
            java.lang.Boolean bool = this.canOptOutOfPrimary;
            java.lang.Boolean bool2 = this.canOptOutOfSecondary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Options(fundingSources=");
            sb.append(list);
            sb.append(", canOptOutOfPrimary=");
            sb.append(bool);
            sb.append(", canOptOutOfSecondary=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> list = this.fundingSources;
            int hashCode = list == null ? 0 : list.hashCode();
            java.lang.Boolean bool = this.canOptOutOfPrimary;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.canOptOutOfSecondary;
            return (((hashCode * 31) + hashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, options.fundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.canOptOutOfPrimary, options.canOptOutOfPrimary) && kotlin.jvm.internal.Intrinsics.areEqual(this.canOptOutOfSecondary, options.canOptOutOfSecondary);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> fundingSources, java.lang.Boolean canOptOutOfPrimary, java.lang.Boolean canOptOutOfSecondary) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options(fundingSources, canOptOutOfPrimary, canOptOutOfSecondary);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getCanOptOutOfSecondary() {
            return this.canOptOutOfSecondary;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getCanOptOutOfPrimary() {
            return this.canOptOutOfPrimary;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> component1() {
            return this.fundingSources;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options, java.util.List list, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = options.fundingSources;
            }
            if ((i & 2) != 0) {
                bool = options.canOptOutOfPrimary;
            }
            if ((i & 4) != 0) {
                bool2 = options.canOptOutOfSecondary;
            }
            return options.copy(list, bool, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJp\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b0\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource;", "", "", "id", "issuerName", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "lastNchars", "classification", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;", "image", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "status", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;", "contingency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component4", "()Ljava/lang/Object;", "component5", "component6", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;", "component7", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "component8", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getIssuerName", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "Ljava/lang/Object;", "getLastNchars", "getClassification", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;", "getImage", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "getStatus", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;", "getContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingSource {
        public static final int $stable = 8;
        private final java.lang.String classification;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image;
        private final java.lang.String issuerName;
        private final java.lang.Object lastNchars;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public FundingSource(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.Object obj, java.lang.String str3, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency) {
            this.id = str;
            this.issuerName = str2;
            this.type = fundingInstrumentType;
            this.lastNchars = obj;
            this.classification = str3;
            this.image = image;
            this.status = debitInstrumentFundingSourceStatus;
            this.contingency = contingency;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.Object getLastNchars() {
            return this.lastNchars;
        }

        public final java.lang.String getClassification() {
            return this.classification;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image getImage() {
            return this.image;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency getContingency() {
            return this.contingency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.issuerName;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.Object obj = this.lastNchars;
            java.lang.String str3 = this.classification;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image = this.image;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = this.status;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency = this.contingency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(id=");
            sb.append(str);
            sb.append(", issuerName=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", lastNchars=");
            sb.append(obj);
            sb.append(", classification=");
            sb.append(str3);
            sb.append(", image=");
            sb.append(image);
            sb.append(", status=");
            sb.append(debitInstrumentFundingSourceStatus);
            sb.append(", contingency=");
            sb.append(contingency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.issuerName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            int hashCode3 = fundingInstrumentType == null ? 0 : fundingInstrumentType.hashCode();
            java.lang.Object obj = this.lastNchars;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            java.lang.String str3 = this.classification;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image = this.image;
            int hashCode6 = image == null ? 0 : image.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = this.status;
            int hashCode7 = debitInstrumentFundingSourceStatus == null ? 0 : debitInstrumentFundingSourceStatus.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency = this.contingency;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (contingency != null ? contingency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource fundingSource = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingSource.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, fundingSource.issuerName) && this.type == fundingSource.type && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNchars, fundingSource.lastNchars) && kotlin.jvm.internal.Intrinsics.areEqual(this.classification, fundingSource.classification) && kotlin.jvm.internal.Intrinsics.areEqual(this.image, fundingSource.image) && this.status == fundingSource.status && kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, fundingSource.contingency);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource copy(java.lang.String id, java.lang.String issuerName, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.Object lastNchars, java.lang.String classification, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus status, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource(id, issuerName, type, lastNchars, classification, image, status, contingency);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency getContingency() {
            return this.contingency;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getClassification() {
            return this.classification;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getLastNchars() {
            return this.lastNchars;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;", "", "url", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Image {
        public static final int $stable = 8;
        private final java.lang.Object url;

        public Image(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.url = obj;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Image(url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image) other).url);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image copy(java.lang.Object url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = image.url;
            }
            return image.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "type", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contingency {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType type;

        public Contingency(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType) {
            this.type = debitInstrumentContingencyType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contingency(type=");
            sb.append(debitInstrumentContingencyType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = this.type;
            if (debitInstrumentContingencyType == null) {
                return 0;
            }
            return debitInstrumentContingencyType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency) && this.type == ((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency) other).type;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType type) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentContingencyType = contingency.type;
            }
            return contingency.copy(debitInstrumentContingencyType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ^\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;", "fundingMethod", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;", "primaryFundingSourceType", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentSecondaryFundingSourceType;", "secondaryFundingSourceTypes", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;", "statusReason", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;", "userPreferences", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatus;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatus;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;", "component6", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;Ljava/util/List;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatus;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Configuration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;", "getFundingMethod", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;", "getPrimaryFundingSourceType", "Ljava/util/List;", "getSecondaryFundingSourceTypes", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionStatusReason;", "getStatusReason", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;", "getUserPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Configuration {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType fundingMethod;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType primaryFundingSourceType;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> secondaryFundingSourceTypes;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason statusReason;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences;

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> list, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus debitInstrumentFundingOptionStatus, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences) {
            this.fundingMethod = debitInstrumentFundingOptionType;
            this.primaryFundingSourceType = debitInstrumentPrimaryFundingSourceType;
            this.secondaryFundingSourceTypes = list;
            this.status = debitInstrumentFundingOptionStatus;
            this.statusReason = debitInstrumentFundingOptionStatusReason;
            this.userPreferences = userPreferences;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType getFundingMethod() {
            return this.fundingMethod;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType getPrimaryFundingSourceType() {
            return this.primaryFundingSourceType;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> getSecondaryFundingSourceTypes() {
            return this.secondaryFundingSourceTypes;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason getStatusReason() {
            return this.statusReason;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences getUserPreferences() {
            return this.userPreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType = this.fundingMethod;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType = this.primaryFundingSourceType;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> list = this.secondaryFundingSourceTypes;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus debitInstrumentFundingOptionStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason = this.statusReason;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences = this.userPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(fundingMethod=");
            sb.append(debitInstrumentFundingOptionType);
            sb.append(", primaryFundingSourceType=");
            sb.append(debitInstrumentPrimaryFundingSourceType);
            sb.append(", secondaryFundingSourceTypes=");
            sb.append(list);
            sb.append(", status=");
            sb.append(debitInstrumentFundingOptionStatus);
            sb.append(", statusReason=");
            sb.append(debitInstrumentFundingOptionStatusReason);
            sb.append(", userPreferences=");
            sb.append(userPreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType = this.fundingMethod;
            int hashCode = debitInstrumentFundingOptionType == null ? 0 : debitInstrumentFundingOptionType.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType = this.primaryFundingSourceType;
            int hashCode2 = debitInstrumentPrimaryFundingSourceType == null ? 0 : debitInstrumentPrimaryFundingSourceType.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> list = this.secondaryFundingSourceTypes;
            int hashCode3 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus debitInstrumentFundingOptionStatus = this.status;
            int hashCode4 = debitInstrumentFundingOptionStatus == null ? 0 : debitInstrumentFundingOptionStatus.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason = this.statusReason;
            int hashCode5 = debitInstrumentFundingOptionStatusReason == null ? 0 : debitInstrumentFundingOptionStatusReason.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences = this.userPreferences;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (userPreferences != null ? userPreferences.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration) other;
            return this.fundingMethod == configuration.fundingMethod && this.primaryFundingSourceType == configuration.primaryFundingSourceType && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryFundingSourceTypes, configuration.secondaryFundingSourceTypes) && this.status == configuration.status && this.statusReason == configuration.statusReason && kotlin.jvm.internal.Intrinsics.areEqual(this.userPreferences, configuration.userPreferences);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType fundingMethod, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType primaryFundingSourceType, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> secondaryFundingSourceTypes, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus status, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason statusReason, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration(fundingMethod, primaryFundingSourceType, secondaryFundingSourceTypes, status, statusReason, userPreferences);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences getUserPreferences() {
            return this.userPreferences;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason getStatusReason() {
            return this.statusReason;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> component3() {
            return this.secondaryFundingSourceTypes;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType getPrimaryFundingSourceType() {
            return this.primaryFundingSourceType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType getFundingMethod() {
            return this.fundingMethod;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType, java.util.List list, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus debitInstrumentFundingOptionStatus, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentFundingOptionType = configuration.fundingMethod;
            }
            if ((i & 2) != 0) {
                debitInstrumentPrimaryFundingSourceType = configuration.primaryFundingSourceType;
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType2 = debitInstrumentPrimaryFundingSourceType;
            if ((i & 4) != 0) {
                list = configuration.secondaryFundingSourceTypes;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                debitInstrumentFundingOptionStatus = configuration.status;
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus debitInstrumentFundingOptionStatus2 = debitInstrumentFundingOptionStatus;
            if ((i & 16) != 0) {
                debitInstrumentFundingOptionStatusReason = configuration.statusReason;
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatusReason debitInstrumentFundingOptionStatusReason2 = debitInstrumentFundingOptionStatusReason;
            if ((i & 32) != 0) {
                userPreferences = configuration.userPreferences;
            }
            return configuration.copy(debitInstrumentFundingOptionType, debitInstrumentPrimaryFundingSourceType2, list2, debitInstrumentFundingOptionStatus2, debitInstrumentFundingOptionStatusReason2, userPreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;", "primaryFundingOption", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$UserPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;", "getFundingSource", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;", "getPrimaryFundingOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserPreferences {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType primaryFundingOption;

        public UserPreferences(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource1, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType) {
            this.fundingSource = fundingSource1;
            this.primaryFundingOption = debitInstrumentPrimaryFundingSourceType;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 getFundingSource() {
            return this.fundingSource;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType getPrimaryFundingOption() {
            return this.primaryFundingOption;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource1 = this.fundingSource;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType = this.primaryFundingOption;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserPreferences(fundingSource=");
            sb.append(fundingSource1);
            sb.append(", primaryFundingOption=");
            sb.append(debitInstrumentPrimaryFundingSourceType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource1 = this.fundingSource;
            int hashCode = fundingSource1 == null ? 0 : fundingSource1.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType = this.primaryFundingOption;
            return (hashCode * 31) + (debitInstrumentPrimaryFundingSourceType != null ? debitInstrumentPrimaryFundingSourceType.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, userPreferences.fundingSource) && this.primaryFundingOption == userPreferences.primaryFundingOption;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences copy(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType primaryFundingOption) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences(fundingSource, primaryFundingOption);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType getPrimaryFundingOption() {
            return this.primaryFundingOption;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 getFundingSource() {
            return this.fundingSource;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource1, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType debitInstrumentPrimaryFundingSourceType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingSource1 = userPreferences.fundingSource;
            }
            if ((i & 2) != 0) {
                debitInstrumentPrimaryFundingSourceType = userPreferences.primaryFundingOption;
            }
            return userPreferences.copy(fundingSource1, debitInstrumentPrimaryFundingSourceType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJp\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b0\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;", "", "", "id", "issuerName", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "type", "lastNchars", "classification", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;", "image", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "status", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;", "contingency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "component4", "()Ljava/lang/Object;", "component5", "component6", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;", "component7", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "component8", "()Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$FundingSource1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getIssuerName", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "getType", "Ljava/lang/Object;", "getLastNchars", "getClassification", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;", "getImage", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "getStatus", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;", "getContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingSource1 {
        public static final int $stable = 8;
        private final java.lang.String classification;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image;
        private final java.lang.String issuerName;
        private final java.lang.Object lastNchars;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus status;
        private final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type;

        public FundingSource1(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType, java.lang.Object obj, java.lang.String str3, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image1, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency1) {
            this.id = str;
            this.issuerName = str2;
            this.type = fundingInstrumentType;
            this.lastNchars = obj;
            this.classification = str3;
            this.image = image1;
            this.status = debitInstrumentFundingSourceStatus;
            this.contingency = contingency1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.Object getLastNchars() {
            return this.lastNchars;
        }

        public final java.lang.String getClassification() {
            return this.classification;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 getImage() {
            return this.image;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 getContingency() {
            return this.contingency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.issuerName;
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.Object obj = this.lastNchars;
            java.lang.String str3 = this.classification;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image1 = this.image;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = this.status;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency1 = this.contingency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource1(id=");
            sb.append(str);
            sb.append(", issuerName=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(fundingInstrumentType);
            sb.append(", lastNchars=");
            sb.append(obj);
            sb.append(", classification=");
            sb.append(str3);
            sb.append(", image=");
            sb.append(image1);
            sb.append(", status=");
            sb.append(debitInstrumentFundingSourceStatus);
            sb.append(", contingency=");
            sb.append(contingency1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.issuerName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType = this.type;
            int hashCode3 = fundingInstrumentType == null ? 0 : fundingInstrumentType.hashCode();
            java.lang.Object obj = this.lastNchars;
            int hashCode4 = obj == null ? 0 : obj.hashCode();
            java.lang.String str3 = this.classification;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image1 = this.image;
            int hashCode6 = image1 == null ? 0 : image1.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus = this.status;
            int hashCode7 = debitInstrumentFundingSourceStatus == null ? 0 : debitInstrumentFundingSourceStatus.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency1 = this.contingency;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (contingency1 != null ? contingency1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource1 = (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingSource1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, fundingSource1.issuerName) && this.type == fundingSource1.type && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNchars, fundingSource1.lastNchars) && kotlin.jvm.internal.Intrinsics.areEqual(this.classification, fundingSource1.classification) && kotlin.jvm.internal.Intrinsics.areEqual(this.image, fundingSource1.image) && this.status == fundingSource1.status && kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, fundingSource1.contingency);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 copy(java.lang.String id, java.lang.String issuerName, com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType type, java.lang.Object lastNchars, java.lang.String classification, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus status, com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1(id, issuerName, type, lastNchars, classification, image, status, contingency);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 getContingency() {
            return this.contingency;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getClassification() {
            return this.classification;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getLastNchars() {
            return this.lastNchars;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;", "", "url", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Image1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Image1 {
        public static final int $stable = 8;
        private final java.lang.Object url;

        public Image1(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.url = obj;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Image1(url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1) other).url);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 copy(java.lang.Object url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image1, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = image1.url;
            }
            return image1.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "type", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;)Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Contingency1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contingency1 {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType type;

        public Contingency1(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType) {
            this.type = debitInstrumentContingencyType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contingency1(type=");
            sb.append(debitInstrumentContingencyType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = this.type;
            if (debitInstrumentContingencyType == null) {
                return 0;
            }
            return debitInstrumentContingencyType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1) && this.type == ((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1) other).type;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType type) {
            return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency1, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentContingencyType = contingency1.type;
            }
            return contingency1.copy(debitInstrumentContingencyType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation EvaluateDebitInstrumentFundingOptions($input: EvaluateDebitInstrumentFundingOptionsInput!) { evaluateDebitInstrumentFundingOptions(input: $input) { funding { options { fundingSources { id issuerName type lastNchars classification image { url } status contingency { type } } canOptOutOfPrimary canOptOutOfSecondary } configuration { fundingMethod primaryFundingSourceType secondaryFundingSourceTypes status statusReason userPreferences { fundingSource { id issuerName type lastNchars classification image { url } status contingency { type } } primaryFundingOption } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput evaluateDebitInstrumentFundingOptionsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateDebitInstrumentFundingOptionsMutation(input=");
        sb.append(evaluateDebitInstrumentFundingOptionsInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation copy(com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation copy$default(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation evaluateDebitInstrumentFundingOptionsMutation, com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput evaluateDebitInstrumentFundingOptionsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluateDebitInstrumentFundingOptionsInput = evaluateDebitInstrumentFundingOptionsMutation.input;
        }
        return evaluateDebitInstrumentFundingOptionsMutation.copy(evaluateDebitInstrumentFundingOptionsInput);
    }
}
