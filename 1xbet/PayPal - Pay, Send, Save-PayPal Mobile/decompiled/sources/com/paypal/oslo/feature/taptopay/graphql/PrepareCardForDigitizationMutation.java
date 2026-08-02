package com.paypal.oslo.feature.taptopay.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/PrepareCardForDigitizationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PrepareCardForDigitizationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PrepareCardForDigitizationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PrepareCardForDigitizationInput;)Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PrepareCardForDigitizationInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.OPERATION_NAME, "CardToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PrepareCardForDigitizationMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data> {
    public static final java.lang.String OPERATION_ID = "3e9f55b5371758a8b17d3f4950a871564f6b456180d3747fdb5eb0b798634372";
    public static final java.lang.String OPERATION_NAME = "PrepareCardForDigitization";
    private final com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Companion(null);
    public static final int $stable = 8;

    public PrepareCardForDigitizationMutation(com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput prepareCardForDigitizationInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prepareCardForDigitizationInput, "");
        this.input = prepareCardForDigitizationInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput getInput() {
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
        com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.taptopay.graphql.adapter.PrepareCardForDigitizationMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.taptopay.graphql.selections.PrepareCardForDigitizationMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "prepareCardForDigitization", "<init>", "(Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "copy", "(Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;)Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "getPrepareCardForDigitization"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization;

        public Data(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization) {
            this.prepareCardForDigitization = prepareCardForDigitization;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization getPrepareCardForDigitization() {
            return this.prepareCardForDigitization;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization = this.prepareCardForDigitization;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(prepareCardForDigitization=");
            sb.append(prepareCardForDigitization);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization = this.prepareCardForDigitization;
            if (prepareCardForDigitization == null) {
                return 0;
            }
            return prepareCardForDigitization.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.prepareCardForDigitization, ((com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data) other).prepareCardForDigitization);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data copy(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization) {
            return new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data(prepareCardForDigitization);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization getPrepareCardForDigitization() {
            return this.prepareCardForDigitization;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data copy$default(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.Data data, com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                prepareCardForDigitization = data.prepareCardForDigitization;
            }
            return data.copy(prepareCardForDigitization);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;", "cardToken", "", "preDigitizationData", "<init>", "(Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;", "getCardToken", "Ljava/lang/String;", "getPreDigitizationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrepareCardForDigitization {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken cardToken;
        private final java.lang.String preDigitizationData;

        public PrepareCardForDigitization(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken cardToken, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardToken, "");
            this.cardToken = cardToken;
            this.preDigitizationData = str;
        }

        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken getCardToken() {
            return this.cardToken;
        }

        public final java.lang.String getPreDigitizationData() {
            return this.preDigitizationData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken cardToken = this.cardToken;
            java.lang.String str = this.preDigitizationData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareCardForDigitization(cardToken=");
            sb.append(cardToken);
            sb.append(", preDigitizationData=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cardToken.hashCode();
            java.lang.String str = this.preDigitizationData;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization = (com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardToken, prepareCardForDigitization.cardToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.preDigitizationData, prepareCardForDigitization.preDigitizationData);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization copy(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken cardToken, java.lang.String preDigitizationData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardToken, "");
            return new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization(cardToken, preDigitizationData);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPreDigitizationData() {
            return this.preDigitizationData;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken getCardToken() {
            return this.cardToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization copy$default(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization, com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken cardToken, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardToken = prepareCardForDigitization.cardToken;
            }
            if ((i & 2) != 0) {
                str = prepareCardForDigitization.preDigitizationData;
            }
            return prepareCardForDigitization.copy(cardToken, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$CardToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardToken {
        public static final int $stable = 0;
        private final java.lang.String id;

        public CardToken(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardToken(id=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken) other).id);
        }

        public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken copy$default(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.CardToken cardToken, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardToken.id;
            }
            return cardToken.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation PrepareCardForDigitization($input: PrepareCardForDigitizationInput!) { prepareCardForDigitization(input: $input) { cardToken { id } preDigitizationData } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput prepareCardForDigitizationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareCardForDigitizationMutation(input=");
        sb.append(prepareCardForDigitizationInput);
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
        return (other instanceof com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation) other).input);
    }

    public final com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation copy(com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation copy$default(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation prepareCardForDigitizationMutation, com.paypal.oslo.api.graphql.schema.type.PrepareCardForDigitizationInput prepareCardForDigitizationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            prepareCardForDigitizationInput = prepareCardForDigitizationMutation.input;
        }
        return prepareCardForDigitizationMutation.copy(prepareCardForDigitizationInput);
    }
}
