package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b*+,-./0)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentTokenEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentTokenEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentTokenEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentTokenEligibilityInput;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentTokenEligibilityInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.OPERATION_NAME, "DeviceEligibility", "EligibilityReason", "FundingCard", "CardHolder", "Product"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DebitInstrumentTokenEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "40c23cbb86b47b54e45199ea051624130e8509b817d0eb4d582fcaabed2282b2";
    public static final java.lang.String OPERATION_NAME = "DebitInstrumentTokenEligibility";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public DebitInstrumentTokenEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput debitInstrumentTokenEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenEligibilityInput, "");
        this.input = debitInstrumentTokenEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentTokenEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentTokenEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.DebitInstrumentTokenEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DebitInstrumentTokenEligibility;", "debitInstrumentTokenEligibilities", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDebitInstrumentTokenEligibilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility> debitInstrumentTokenEligibilities;

        public Data(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.debitInstrumentTokenEligibilities = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility> getDebitInstrumentTokenEligibilities() {
            return this.debitInstrumentTokenEligibilities;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility> list = this.debitInstrumentTokenEligibilities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(debitInstrumentTokenEligibilities=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstrumentTokenEligibilities.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentTokenEligibilities, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data) other).debitInstrumentTokenEligibilities);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility> debitInstrumentTokenEligibilities) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenEligibilities, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data(debitInstrumentTokenEligibilities);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility> component1() {
            return this.debitInstrumentTokenEligibilities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.debitInstrumentTokenEligibilities;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JP\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DebitInstrumentTokenEligibility;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "tokenProductName", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;", "eligibilityStatus", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;", "deviceEligibility", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$EligibilityReason;", "eligibilityReasons", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;", "fundingCard", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;", "component3", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DebitInstrumentTokenEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getTokenProductName", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityStatus;", "getEligibilityStatus", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;", "getDeviceEligibility", "getDeviceEligibility$annotations", "()V", "Ljava/util/List;", "getEligibilityReasons", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;", "getFundingCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrumentTokenEligibility {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> eligibilityReasons;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus eligibilityStatus;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard;
        private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName tokenProductName;

        @kotlin.Deprecated(message = "Use deviceEligibilities instead.")
        public static /* synthetic */ void getDeviceEligibility$annotations() {
        }

        public DebitInstrumentTokenEligibility(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus debitInstrumentEligibilityStatus, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility, java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> list, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentEligibilityStatus, "");
            this.tokenProductName = debitInstrumentProductName;
            this.eligibilityStatus = debitInstrumentEligibilityStatus;
            this.deviceEligibility = deviceEligibility;
            this.eligibilityReasons = list;
            this.fundingCard = fundingCard;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getTokenProductName() {
            return this.tokenProductName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility getDeviceEligibility() {
            return this.deviceEligibility;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> getEligibilityReasons() {
            return this.eligibilityReasons;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard getFundingCard() {
            return this.fundingCard;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.tokenProductName;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus debitInstrumentEligibilityStatus = this.eligibilityStatus;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility = this.deviceEligibility;
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> list = this.eligibilityReasons;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard = this.fundingCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentTokenEligibility(tokenProductName=");
            sb.append(debitInstrumentProductName);
            sb.append(", eligibilityStatus=");
            sb.append(debitInstrumentEligibilityStatus);
            sb.append(", deviceEligibility=");
            sb.append(deviceEligibility);
            sb.append(", eligibilityReasons=");
            sb.append(list);
            sb.append(", fundingCard=");
            sb.append(fundingCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.tokenProductName;
            int hashCode = debitInstrumentProductName == null ? 0 : debitInstrumentProductName.hashCode();
            int hashCode2 = this.eligibilityStatus.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility = this.deviceEligibility;
            int hashCode3 = deviceEligibility == null ? 0 : deviceEligibility.hashCode();
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> list = this.eligibilityReasons;
            int hashCode4 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard = this.fundingCard;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (fundingCard != null ? fundingCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility debitInstrumentTokenEligibility = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility) other;
            return this.tokenProductName == debitInstrumentTokenEligibility.tokenProductName && this.eligibilityStatus == debitInstrumentTokenEligibility.eligibilityStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceEligibility, debitInstrumentTokenEligibility.deviceEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibilityReasons, debitInstrumentTokenEligibility.eligibilityReasons) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingCard, debitInstrumentTokenEligibility.fundingCard);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName tokenProductName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus eligibilityStatus, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility, java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> eligibilityReasons, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility(tokenProductName, eligibilityStatus, deviceEligibility, eligibilityReasons, fundingCard);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard getFundingCard() {
            return this.fundingCard;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> component4() {
            return this.eligibilityReasons;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility getDeviceEligibility() {
            return this.deviceEligibility;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getTokenProductName() {
            return this.tokenProductName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility debitInstrumentTokenEligibility, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus debitInstrumentEligibilityStatus, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility, java.util.List list, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentProductName = debitInstrumentTokenEligibility.tokenProductName;
            }
            if ((i & 2) != 0) {
                debitInstrumentEligibilityStatus = debitInstrumentTokenEligibility.eligibilityStatus;
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityStatus debitInstrumentEligibilityStatus2 = debitInstrumentEligibilityStatus;
            if ((i & 4) != 0) {
                deviceEligibility = debitInstrumentTokenEligibility.deviceEligibility;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility2 = deviceEligibility;
            if ((i & 8) != 0) {
                list = debitInstrumentTokenEligibility.eligibilityReasons;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                fundingCard = debitInstrumentTokenEligibility.fundingCard;
            }
            return debitInstrumentTokenEligibility.copy(debitInstrumentProductName, debitInstrumentEligibilityStatus2, deviceEligibility2, list2, fundingCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0003\u0010\bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;", "", "", "isPrimaryEligible", "isCompanionEligible", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "isPrimaryEligible$annotations", "()V", "isCompanionEligible$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceEligibility {
        public static final int $stable = 0;
        private final java.lang.Boolean isCompanionEligible;
        private final java.lang.Boolean isPrimaryEligible;

        @kotlin.Deprecated(message = "Use deviceEligibilities instead.")
        public static /* synthetic */ void isCompanionEligible$annotations() {
        }

        @kotlin.Deprecated(message = "Use deviceEligibilities instead.")
        public static /* synthetic */ void isPrimaryEligible$annotations() {
        }

        public DeviceEligibility(java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.isPrimaryEligible = bool;
            this.isCompanionEligible = bool2;
        }

        public final java.lang.Boolean isPrimaryEligible() {
            return this.isPrimaryEligible;
        }

        public final java.lang.Boolean isCompanionEligible() {
            return this.isCompanionEligible;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.isPrimaryEligible;
            java.lang.Boolean bool2 = this.isCompanionEligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceEligibility(isPrimaryEligible=");
            sb.append(bool);
            sb.append(", isCompanionEligible=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.isPrimaryEligible;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.isCompanionEligible;
            return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.isPrimaryEligible, deviceEligibility.isPrimaryEligible) && kotlin.jvm.internal.Intrinsics.areEqual(this.isCompanionEligible, deviceEligibility.isCompanionEligible);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility copy(java.lang.Boolean isPrimaryEligible, java.lang.Boolean isCompanionEligible) {
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility(isPrimaryEligible, isCompanionEligible);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getIsCompanionEligible() {
            return this.isCompanionEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getIsPrimaryEligible() {
            return this.isPrimaryEligible;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = deviceEligibility.isPrimaryEligible;
            }
            if ((i & 2) != 0) {
                bool2 = deviceEligibility.isCompanionEligible;
            }
            return deviceEligibility.copy(bool, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$EligibilityReason;", "", "", "reason", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$EligibilityReason;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityReason {
        public static final int $stable = 0;
        private final java.lang.String description;
        private final java.lang.String reason;

        public EligibilityReason(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
            this.description = str2;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.String str2 = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityReason(reason=");
            sb.append(str);
            sb.append(", description=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode();
            java.lang.String str = this.description;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason eligibilityReason = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, eligibilityReason.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, eligibilityReason.description);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason copy(java.lang.String reason, java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason(reason, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason eligibilityReason, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = eligibilityReason.reason;
            }
            if ((i & 2) != 0) {
                str2 = eligibilityReason.description;
            }
            return eligibilityReason.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b2\u00103JÒ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010!R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bE\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bF\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bG\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bH\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bK\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bL\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bM\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\bN\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bP\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u00101R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bT\u00103"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;", "", "", "__typename", "", "primary", "createdTime", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentServicingAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "campaignId", "virtualCard", "countryCode", "primaryCurrencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/Month;", "expirationMonth", "expirationYear", com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_EXPIRED, "activatedTime", "cardNickname", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$CardHolder;", "cardHolder", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Product;", "product", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "debitInstrumentCoreFragment", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/Month;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$CardHolder;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/Month;", "component10", "component11", "component12", "component13", "component14", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$CardHolder;", "component15", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Product;", "component16", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/Month;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$CardHolder;Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Product;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Ljava/lang/Boolean;", "getPrimary", "Ljava/lang/Object;", "getCreatedTime", "Ljava/util/List;", "getActions", "getCampaignId", "getVirtualCard", "getCountryCode", "getPrimaryCurrencyCode", "Lcom/paypal/oslo/api/graphql/schema/type/Month;", "getExpirationMonth", "getExpirationYear", "getExpired", "getActivatedTime", "getCardNickname", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$CardHolder;", "getCardHolder", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Product;", "getProduct", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCoreFragment;", "getDebitInstrumentCoreFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingCard {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions;
        private final java.lang.Object activatedTime;
        private final java.lang.String campaignId;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder;
        private final java.lang.String cardNickname;
        private final java.lang.Object countryCode;
        private final java.lang.Object createdTime;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment;
        private final com.paypal.oslo.api.graphql.schema.type.Month expirationMonth;
        private final java.lang.Object expirationYear;
        private final java.lang.Boolean expired;
        private final java.lang.Boolean primary;
        private final java.lang.Object primaryCurrencyCode;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product;
        private final java.lang.Boolean virtualCard;

        /* JADX WARN: Multi-variable type inference failed */
        public FundingCard(java.lang.String str, java.lang.Boolean bool, java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list, java.lang.String str2, java.lang.Boolean bool2, java.lang.Object obj2, java.lang.Object obj3, com.paypal.oslo.api.graphql.schema.type.Month month, java.lang.Object obj4, java.lang.Boolean bool3, java.lang.Object obj5, java.lang.String str3, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCoreFragment, "");
            this.__typename = str;
            this.primary = bool;
            this.createdTime = obj;
            this.actions = list;
            this.campaignId = str2;
            this.virtualCard = bool2;
            this.countryCode = obj2;
            this.primaryCurrencyCode = obj3;
            this.expirationMonth = month;
            this.expirationYear = obj4;
            this.expired = bool3;
            this.activatedTime = obj5;
            this.cardNickname = str3;
            this.cardHolder = cardHolder;
            this.product = product;
            this.debitInstrumentCoreFragment = debitInstrumentCoreFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.Boolean getPrimary() {
            return this.primary;
        }

        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> getActions() {
            return this.actions;
        }

        public final java.lang.String getCampaignId() {
            return this.campaignId;
        }

        public final java.lang.Boolean getVirtualCard() {
            return this.virtualCard;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        public final com.paypal.oslo.api.graphql.schema.type.Month getExpirationMonth() {
            return this.expirationMonth;
        }

        public final java.lang.Object getExpirationYear() {
            return this.expirationYear;
        }

        public final java.lang.Boolean getExpired() {
            return this.expired;
        }

        public final java.lang.Object getActivatedTime() {
            return this.activatedTime;
        }

        public final java.lang.String getCardNickname() {
            return this.cardNickname;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product getProduct() {
            return this.product;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment getDebitInstrumentCoreFragment() {
            return this.debitInstrumentCoreFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.Boolean bool = this.primary;
            java.lang.Object obj = this.createdTime;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            java.lang.String str2 = this.campaignId;
            java.lang.Boolean bool2 = this.virtualCard;
            java.lang.Object obj2 = this.countryCode;
            java.lang.Object obj3 = this.primaryCurrencyCode;
            com.paypal.oslo.api.graphql.schema.type.Month month = this.expirationMonth;
            java.lang.Object obj4 = this.expirationYear;
            java.lang.Boolean bool3 = this.expired;
            java.lang.Object obj5 = this.activatedTime;
            java.lang.String str3 = this.cardNickname;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder = this.cardHolder;
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product = this.product;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment = this.debitInstrumentCoreFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingCard(__typename=");
            sb.append(str);
            sb.append(", primary=");
            sb.append(bool);
            sb.append(", createdTime=");
            sb.append(obj);
            sb.append(", actions=");
            sb.append(list);
            sb.append(", campaignId=");
            sb.append(str2);
            sb.append(", virtualCard=");
            sb.append(bool2);
            sb.append(", countryCode=");
            sb.append(obj2);
            sb.append(", primaryCurrencyCode=");
            sb.append(obj3);
            sb.append(", expirationMonth=");
            sb.append(month);
            sb.append(", expirationYear=");
            sb.append(obj4);
            sb.append(", expired=");
            sb.append(bool3);
            sb.append(", activatedTime=");
            sb.append(obj5);
            sb.append(", cardNickname=");
            sb.append(str3);
            sb.append(", cardHolder=");
            sb.append(cardHolder);
            sb.append(", product=");
            sb.append(product);
            sb.append(", debitInstrumentCoreFragment=");
            sb.append(debitInstrumentCoreFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            java.lang.Boolean bool = this.primary;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.Object obj = this.createdTime;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> list = this.actions;
            int hashCode4 = list == null ? 0 : list.hashCode();
            java.lang.String str = this.campaignId;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool2 = this.virtualCard;
            int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Object obj2 = this.countryCode;
            int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.primaryCurrencyCode;
            int hashCode8 = obj3 == null ? 0 : obj3.hashCode();
            com.paypal.oslo.api.graphql.schema.type.Month month = this.expirationMonth;
            int hashCode9 = month == null ? 0 : month.hashCode();
            java.lang.Object obj4 = this.expirationYear;
            int hashCode10 = obj4 == null ? 0 : obj4.hashCode();
            java.lang.Boolean bool3 = this.expired;
            int hashCode11 = bool3 == null ? 0 : bool3.hashCode();
            java.lang.Object obj5 = this.activatedTime;
            int hashCode12 = obj5 == null ? 0 : obj5.hashCode();
            java.lang.String str2 = this.cardNickname;
            int hashCode13 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder = this.cardHolder;
            int hashCode14 = cardHolder == null ? 0 : cardHolder.hashCode();
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product = this.product;
            return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (product != null ? product.hashCode() : 0)) * 31) + this.debitInstrumentCoreFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.primary, fundingCard.primary) && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, fundingCard.createdTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, fundingCard.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, fundingCard.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCard, fundingCard.virtualCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, fundingCard.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, fundingCard.primaryCurrencyCode) && this.expirationMonth == fundingCard.expirationMonth && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationYear, fundingCard.expirationYear) && kotlin.jvm.internal.Intrinsics.areEqual(this.expired, fundingCard.expired) && kotlin.jvm.internal.Intrinsics.areEqual(this.activatedTime, fundingCard.activatedTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNickname, fundingCard.cardNickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolder, fundingCard.cardHolder) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, fundingCard.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentCoreFragment, fundingCard.debitInstrumentCoreFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard copy(java.lang.String __typename, java.lang.Boolean primary, java.lang.Object createdTime, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions, java.lang.String campaignId, java.lang.Boolean virtualCard, java.lang.Object countryCode, java.lang.Object primaryCurrencyCode, com.paypal.oslo.api.graphql.schema.type.Month expirationMonth, java.lang.Object expirationYear, java.lang.Boolean expired, java.lang.Object activatedTime, java.lang.String cardNickname, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCoreFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard(__typename, primary, createdTime, actions, campaignId, virtualCard, countryCode, primaryCurrencyCode, expirationMonth, expirationYear, expired, activatedTime, cardNickname, cardHolder, product, debitInstrumentCoreFragment);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.Month getExpirationMonth() {
            return this.expirationMonth;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getVirtualCard() {
            return this.virtualCard;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCampaignId() {
            return this.campaignId;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> component4() {
            return this.actions;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCreatedTime() {
            return this.createdTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getPrimary() {
            return this.primary;
        }

        /* renamed from: component16, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment getDebitInstrumentCoreFragment() {
            return this.debitInstrumentCoreFragment;
        }

        /* renamed from: component15, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product getProduct() {
            return this.product;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder getCardHolder() {
            return this.cardHolder;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getCardNickname() {
            return this.cardNickname;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Object getActivatedTime() {
            return this.activatedTime;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Boolean getExpired() {
            return this.expired;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Object getExpirationYear() {
            return this.expirationYear;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$CardHolder;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "debitInstrumentCardHolderFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$CardHolder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentCardHolderFragment;", "getDebitInstrumentCardHolderFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class CardHolder {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment;

        public CardHolder(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardHolderFragment, "");
            this.__typename = str;
            this.debitInstrumentCardHolderFragment = debitInstrumentCardHolderFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment getDebitInstrumentCardHolderFragment() {
            return this.debitInstrumentCardHolderFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment = this.debitInstrumentCardHolderFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardHolder(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentCardHolderFragment=");
            sb.append(debitInstrumentCardHolderFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentCardHolderFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, cardHolder.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentCardHolderFragment, cardHolder.debitInstrumentCardHolderFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardHolderFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder(__typename, debitInstrumentCardHolderFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment getDebitInstrumentCardHolderFragment() {
            return this.debitInstrumentCardHolderFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment debitInstrumentCardHolderFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardHolder.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentCardHolderFragment = cardHolder.debitInstrumentCardHolderFragment;
            }
            return cardHolder.copy(str, debitInstrumentCardHolderFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Product;", "", "", "__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "debitInstrumentProductFullFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Product;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "getDebitInstrumentProductFullFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Product {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment;

        public Product(java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductFullFragment, "");
            this.__typename = str;
            this.debitInstrumentProductFullFragment = debitInstrumentProductFullFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment getDebitInstrumentProductFullFragment() {
            return this.debitInstrumentProductFullFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment = this.debitInstrumentProductFullFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(__typename=");
            sb.append(str);
            sb.append(", debitInstrumentProductFullFragment=");
            sb.append(debitInstrumentProductFullFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.debitInstrumentProductFullFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, product.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentProductFullFragment, product.debitInstrumentProductFullFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product copy(java.lang.String __typename, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductFullFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product(__typename, debitInstrumentProductFullFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment getDebitInstrumentProductFullFragment() {
            return this.debitInstrumentProductFullFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product, java.lang.String str, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment debitInstrumentProductFullFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = product.__typename;
            }
            if ((i & 2) != 0) {
                debitInstrumentProductFullFragment = product.debitInstrumentProductFullFragment;
            }
            return product.copy(str, debitInstrumentProductFullFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query DebitInstrumentTokenEligibility($input: DebitInstrumentTokenEligibilityInput!) { debitInstrumentTokenEligibilities(input: $input) { tokenProductName eligibilityStatus deviceEligibility { isPrimaryEligible isCompanionEligible } eligibilityReasons { reason description } fundingCard { __typename ...DebitInstrumentCoreFragment primary createdTime actions campaignId virtualCard countryCode primaryCurrencyCode expirationMonth expirationYear expired activatedTime cardNickname cardHolder { __typename ...DebitInstrumentCardHolderFragment } product { __typename ...DebitInstrumentProductFullFragment } } } }  fragment DebitInstrumentStatusFragment on DebitInstrumentStatus { lifecycleState displayState statusChangeReasons }  fragment DebitInstrumentPinFragment on DebitInstrumentPin { status profileName origin }  fragment DebitInstrumentShipmentFragment on DebitInstrumentShipment { status shipmentDate estimatedArrivalDate }  fragment DebitInstrumentCoreFragment on DebitInstrument { id productName lastNChars status { __typename ...DebitInstrumentStatusFragment } pin { __typename ...DebitInstrumentPinFragment } shipment { __typename ...DebitInstrumentShipmentFragment } }  fragment DebitInstrumentCardHolderFragment on DebitInstrumentCardHolder { firstName lastName billingAddress { id address { addressLine1 addressLine2 adminArea1 adminArea2 countryCode postalCode } displayAddress normalizationStatus } }  fragment DebitInstrumentProductCoreFragment on DebitInstrumentProduct { name legalName longName shortName largeImage { back { contentType referenceUrl } front { contentType referenceUrl } } }  fragment DebitInstrumentProductFullFragment on DebitInstrumentProduct { __typename ...DebitInstrumentProductCoreFragment smallImage { back { contentType referenceUrl } front { contentType referenceUrl } } physicalCardOrderProgressCardArt { contentType referenceUrl } learnMoreUrl faqUrl helpUrl cardHolderAgreementUrl virtualCardHolderAgreementUrl privacyPolicyUrl feeUrl actionUrls { activateCard learnMore faq reportCardLost } tags availableActions brand capabilities maxAdditionalCardsAllowed issuanceConfig { defaultDebitIssuanceFormFactor allowFormFactorChoice formFactors } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput debitInstrumentTokenEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentTokenEligibilityQuery(input=");
        sb.append(debitInstrumentTokenEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery debitInstrumentTokenEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput debitInstrumentTokenEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentTokenEligibilityInput = debitInstrumentTokenEligibilityQuery.input;
        }
        return debitInstrumentTokenEligibilityQuery.copy(debitInstrumentTokenEligibilityInput);
    }
}
