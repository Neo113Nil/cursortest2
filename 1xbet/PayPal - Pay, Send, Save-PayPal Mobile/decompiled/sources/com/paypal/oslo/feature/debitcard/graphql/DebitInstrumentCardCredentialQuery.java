package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCardCredentialInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCardCredentialInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCardCredentialInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCardCredentialInput;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentCardCredentialInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentCardCredentialQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data> {
    public static final java.lang.String OPERATION_ID = "6234a58296a87afaf72b39f98fd4126955242b2251418d69e738d4f4e153306b";
    public static final java.lang.String OPERATION_NAME = "DebitInstrumentCardCredential";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Companion(null);
    public static final int $stable = 8;

    public DebitInstrumentCardCredentialQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput debitInstrumentCardCredentialInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardCredentialInput, "");
        this.input = debitInstrumentCardCredentialInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentCardCredentialQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.DebitInstrumentCardCredentialQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "debitInstrumentCardCredential", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "getDebitInstrumentCardCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential;

        public Data(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential) {
            this.debitInstrumentCardCredential = debitInstrumentCardCredential;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential getDebitInstrumentCardCredential() {
            return this.debitInstrumentCardCredential;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential = this.debitInstrumentCardCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(debitInstrumentCardCredential=");
            sb.append(debitInstrumentCardCredential);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential = this.debitInstrumentCardCredential;
            if (debitInstrumentCardCredential == null) {
                return 0;
            }
            return debitInstrumentCardCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentCardCredential, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data) other).debitInstrumentCardCredential);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential) {
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data(debitInstrumentCardCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential getDebitInstrumentCardCredential() {
            return this.debitInstrumentCardCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentCardCredential = data.debitInstrumentCardCredential;
            }
            return data.copy(debitInstrumentCardCredential);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJn\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "cardNumber", "lastNChars", "cardVerificationCode", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "scheme", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component3", "()Ljava/lang/Object;", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "component8", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$DebitInstrumentCardCredential;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Ljava/lang/Object;", "getCardNumber", "getLastNChars", "getCardVerificationCode", "getExpiryDate", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getScheme"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrumentCardCredential {
        public static final int $stable = 8;
        private final java.lang.Object cardNumber;
        private final java.lang.Object cardVerificationCode;
        private final java.lang.Object expiryDate;
        private final java.lang.String id;
        private final java.lang.Object lastNChars;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand scheme;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState status;

        public DebitInstrumentCardCredential(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.productName = debitInstrumentProductName;
            this.cardNumber = obj;
            this.lastNChars = obj2;
            this.cardVerificationCode = obj3;
            this.expiryDate = obj4;
            this.status = debitInstrumentLifecycleState;
            this.scheme = cardBrand;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        public final java.lang.Object getCardNumber() {
            return this.cardNumber;
        }

        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.Object getCardVerificationCode() {
            return this.cardVerificationCode;
        }

        public final java.lang.Object getExpiryDate() {
            return this.expiryDate;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getScheme() {
            return this.scheme;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            java.lang.Object obj = this.cardNumber;
            java.lang.Object obj2 = this.lastNChars;
            java.lang.Object obj3 = this.cardVerificationCode;
            java.lang.Object obj4 = this.expiryDate;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.status;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.scheme;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentCardCredential(id=");
            sb.append(str);
            sb.append(", productName=");
            sb.append(debitInstrumentProductName);
            sb.append(", cardNumber=");
            sb.append(obj);
            sb.append(", lastNChars=");
            sb.append(obj2);
            sb.append(", cardVerificationCode=");
            sb.append(obj3);
            sb.append(", expiryDate=");
            sb.append(obj4);
            sb.append(", status=");
            sb.append(debitInstrumentLifecycleState);
            sb.append(", scheme=");
            sb.append(cardBrand);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
            int hashCode2 = debitInstrumentProductName == null ? 0 : debitInstrumentProductName.hashCode();
            java.lang.Object obj = this.cardNumber;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.lastNChars;
            int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.cardVerificationCode;
            int hashCode5 = obj3 == null ? 0 : obj3.hashCode();
            java.lang.Object obj4 = this.expiryDate;
            int hashCode6 = obj4 == null ? 0 : obj4.hashCode();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.status;
            int hashCode7 = debitInstrumentLifecycleState == null ? 0 : debitInstrumentLifecycleState.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.scheme;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (cardBrand != null ? cardBrand.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential debitInstrumentCardCredential = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, debitInstrumentCardCredential.id) && this.productName == debitInstrumentCardCredential.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, debitInstrumentCardCredential.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, debitInstrumentCardCredential.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardVerificationCode, debitInstrumentCardCredential.cardVerificationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDate, debitInstrumentCardCredential.expiryDate) && this.status == debitInstrumentCardCredential.status && this.scheme == debitInstrumentCardCredential.scheme;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, java.lang.Object cardNumber, java.lang.Object lastNChars, java.lang.Object cardVerificationCode, java.lang.Object expiryDate, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState status, com.paypal.oslo.api.graphql.schema.type.CardBrand scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery.DebitInstrumentCardCredential(id, productName, cardNumber, lastNChars, cardVerificationCode, expiryDate, status, scheme);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getScheme() {
            return this.scheme;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getExpiryDate() {
            return this.expiryDate;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getCardVerificationCode() {
            return this.cardVerificationCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCardNumber() {
            return this.cardNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
            return this.productName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentCardCredentialQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query DebitInstrumentCardCredential($input: DebitInstrumentCardCredentialInput!) { debitInstrumentCardCredential(input: $input) { id productName cardNumber lastNChars cardVerificationCode expiryDate status scheme } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput debitInstrumentCardCredentialInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentCardCredentialQuery(input=");
        sb.append(debitInstrumentCardCredentialInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentCardCredentialQuery debitInstrumentCardCredentialQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentCardCredentialInput debitInstrumentCardCredentialInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentCardCredentialInput = debitInstrumentCardCredentialQuery.input;
        }
        return debitInstrumentCardCredentialQuery.copy(debitInstrumentCardCredentialInput);
    }
}
