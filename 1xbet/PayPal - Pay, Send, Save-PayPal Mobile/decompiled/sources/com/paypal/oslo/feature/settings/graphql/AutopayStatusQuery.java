package com.paypal.oslo.feature.settings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\r*+,-./012345)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayInput;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayInput;", "getInput", "Companion", "Data", "RevolvingCreditAutopay", "OnRevolvingCreditAutopayUnenrolled", "OnRevolvingCreditAutopayEnrolled", "FundingInstrument", "OnRevolvingCreditPaymentFundingInstrumentBank", "Art", "OnRevolvingCreditPaymentFundingInstrumentCard", "Art1", "OnRevolvingCreditPaymentFundingInstrumentBalance", "Amount", "Art2"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AutopayStatusQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data> {
    public static final java.lang.String OPERATION_ID = "b1a279dca50ef734e506cb4bdb237c613a5a40a619a9f81be2a74943e94ba4ae";
    public static final java.lang.String OPERATION_NAME = "AutopayStatus";
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Companion INSTANCE = new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Companion(null);
    public static final int $stable = 8;

    public AutopayStatusQuery(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput revolvingCreditAutopayInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayInput, "");
        this.input = revolvingCreditAutopayInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput getInput() {
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
        com.paypal.oslo.feature.settings.graphql.adapter.AutopayStatusQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.settings.graphql.adapter.AutopayStatusQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.settings.graphql.selections.AutopayStatusQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$RevolvingCreditAutopay;", "revolvingCreditAutopay", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$RevolvingCreditAutopay;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$RevolvingCreditAutopay;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$RevolvingCreditAutopay;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$RevolvingCreditAutopay;", "getRevolvingCreditAutopay"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay;

        public Data(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay) {
            this.revolvingCreditAutopay = revolvingCreditAutopay;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay getRevolvingCreditAutopay() {
            return this.revolvingCreditAutopay;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay = this.revolvingCreditAutopay;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(revolvingCreditAutopay=");
            sb.append(revolvingCreditAutopay);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay = this.revolvingCreditAutopay;
            if (revolvingCreditAutopay == null) {
                return 0;
            }
            return revolvingCreditAutopay.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAutopay, ((com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data) other).revolvingCreditAutopay);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data copy(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay) {
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data(revolvingCreditAutopay);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay getRevolvingCreditAutopay() {
            return this.revolvingCreditAutopay;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data data, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                revolvingCreditAutopay = data.revolvingCreditAutopay;
            }
            return data.copy(revolvingCreditAutopay);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$RevolvingCreditAutopay;", "", "", "__typename", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayUnenrolled;", "onRevolvingCreditAutopayUnenrolled", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayEnrolled;", "onRevolvingCreditAutopayEnrolled", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayUnenrolled;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayEnrolled;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayUnenrolled;", "component3", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayEnrolled;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayUnenrolled;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayEnrolled;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$RevolvingCreditAutopay;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayUnenrolled;", "getOnRevolvingCreditAutopayUnenrolled", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayEnrolled;", "getOnRevolvingCreditAutopayEnrolled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditAutopay {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled;

        public RevolvingCreditAutopay(java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRevolvingCreditAutopayUnenrolled = onRevolvingCreditAutopayUnenrolled;
            this.onRevolvingCreditAutopayEnrolled = onRevolvingCreditAutopayEnrolled;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled getOnRevolvingCreditAutopayUnenrolled() {
            return this.onRevolvingCreditAutopayUnenrolled;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled getOnRevolvingCreditAutopayEnrolled() {
            return this.onRevolvingCreditAutopayEnrolled;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled = this.onRevolvingCreditAutopayUnenrolled;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled = this.onRevolvingCreditAutopayEnrolled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAutopay(__typename=");
            sb.append(str);
            sb.append(", onRevolvingCreditAutopayUnenrolled=");
            sb.append(onRevolvingCreditAutopayUnenrolled);
            sb.append(", onRevolvingCreditAutopayEnrolled=");
            sb.append(onRevolvingCreditAutopayEnrolled);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled = this.onRevolvingCreditAutopayUnenrolled;
            int hashCode2 = onRevolvingCreditAutopayUnenrolled == null ? 0 : onRevolvingCreditAutopayUnenrolled.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled = this.onRevolvingCreditAutopayEnrolled;
            return (((hashCode * 31) + hashCode2) * 31) + (onRevolvingCreditAutopayEnrolled != null ? onRevolvingCreditAutopayEnrolled.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditAutopay.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditAutopayUnenrolled, revolvingCreditAutopay.onRevolvingCreditAutopayUnenrolled) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditAutopayEnrolled, revolvingCreditAutopay.onRevolvingCreditAutopayEnrolled);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay copy(java.lang.String __typename, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay(__typename, onRevolvingCreditAutopayUnenrolled, onRevolvingCreditAutopayEnrolled);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled getOnRevolvingCreditAutopayEnrolled() {
            return this.onRevolvingCreditAutopayEnrolled;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled getOnRevolvingCreditAutopayUnenrolled() {
            return this.onRevolvingCreditAutopayUnenrolled;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditAutopay.__typename;
            }
            if ((i & 2) != 0) {
                onRevolvingCreditAutopayUnenrolled = revolvingCreditAutopay.onRevolvingCreditAutopayUnenrolled;
            }
            if ((i & 4) != 0) {
                onRevolvingCreditAutopayEnrolled = revolvingCreditAutopay.onRevolvingCreditAutopayEnrolled;
            }
            return revolvingCreditAutopay.copy(str, onRevolvingCreditAutopayUnenrolled, onRevolvingCreditAutopayEnrolled);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayUnenrolled;", "", "", "enrollmentEligible", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayUnenrolled;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnrollmentEligible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditAutopayUnenrolled {
        public static final int $stable = 0;
        private final boolean enrollmentEligible;

        public OnRevolvingCreditAutopayUnenrolled(boolean z) {
            this.enrollmentEligible = z;
        }

        public final boolean getEnrollmentEligible() {
            return this.enrollmentEligible;
        }

        public final java.lang.String toString() {
            boolean z = this.enrollmentEligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditAutopayUnenrolled(enrollmentEligible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enrollmentEligible);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled) && this.enrollmentEligible == ((com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled) other).enrollmentEligible;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled copy(boolean enrollmentEligible) {
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled(enrollmentEligible);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnrollmentEligible() {
            return this.enrollmentEligible;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onRevolvingCreditAutopayUnenrolled.enrollmentEligible;
            }
            return onRevolvingCreditAutopayUnenrolled.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0015R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0015R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayEnrolled;", "", "effectiveDueTime", "", "effectiveInCurrentBillingCycle", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;", "paymentAmountOptionType", "", "__typename", "", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$FundingInstrument;", "fundingInstruments", "<init>", "(Ljava/lang/Object;ZLcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;ZLcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditAutopayEnrolled;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getEffectiveDueTime", "Z", "getEffectiveInCurrentBillingCycle", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAutopayPaymentAmountOptionType;", "getPaymentAmountOptionType", "Ljava/lang/String;", "get__typename", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditAutopayEnrolled {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final java.lang.Object effectiveDueTime;
        private final boolean effectiveInCurrentBillingCycle;
        private final java.util.List<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument> fundingInstruments;
        private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType paymentAmountOptionType;

        public OnRevolvingCreditAutopayEnrolled(java.lang.Object obj, boolean z, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType, java.lang.String str, java.util.List<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayPaymentAmountOptionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.effectiveDueTime = obj;
            this.effectiveInCurrentBillingCycle = z;
            this.paymentAmountOptionType = revolvingCreditAutopayPaymentAmountOptionType;
            this.__typename = str;
            this.fundingInstruments = list;
        }

        public final java.lang.Object getEffectiveDueTime() {
            return this.effectiveDueTime;
        }

        public final boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType getPaymentAmountOptionType() {
            return this.paymentAmountOptionType;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.effectiveDueTime;
            boolean z = this.effectiveInCurrentBillingCycle;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType = this.paymentAmountOptionType;
            java.lang.String str = this.__typename;
            java.util.List<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument> list = this.fundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditAutopayEnrolled(effectiveDueTime=");
            sb.append(obj);
            sb.append(", effectiveInCurrentBillingCycle=");
            sb.append(z);
            sb.append(", paymentAmountOptionType=");
            sb.append(revolvingCreditAutopayPaymentAmountOptionType);
            sb.append(", __typename=");
            sb.append(str);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.effectiveDueTime;
            return ((((((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Boolean.hashCode(this.effectiveInCurrentBillingCycle)) * 31) + this.paymentAmountOptionType.hashCode()) * 31) + this.__typename.hashCode()) * 31) + this.fundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveDueTime, onRevolvingCreditAutopayEnrolled.effectiveDueTime) && this.effectiveInCurrentBillingCycle == onRevolvingCreditAutopayEnrolled.effectiveInCurrentBillingCycle && this.paymentAmountOptionType == onRevolvingCreditAutopayEnrolled.paymentAmountOptionType && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onRevolvingCreditAutopayEnrolled.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, onRevolvingCreditAutopayEnrolled.fundingInstruments);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled copy(java.lang.Object effectiveDueTime, boolean effectiveInCurrentBillingCycle, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType paymentAmountOptionType, java.lang.String __typename, java.util.List<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument> fundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAmountOptionType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled(effectiveDueTime, effectiveInCurrentBillingCycle, paymentAmountOptionType, __typename, fundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument> component5() {
            return this.fundingInstruments;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType getPaymentAmountOptionType() {
            return this.paymentAmountOptionType;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getEffectiveDueTime() {
            return this.effectiveDueTime;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled, java.lang.Object obj, boolean z, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType, java.lang.String str, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onRevolvingCreditAutopayEnrolled.effectiveDueTime;
            }
            if ((i & 2) != 0) {
                z = onRevolvingCreditAutopayEnrolled.effectiveInCurrentBillingCycle;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                revolvingCreditAutopayPaymentAmountOptionType = onRevolvingCreditAutopayEnrolled.paymentAmountOptionType;
            }
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType2 = revolvingCreditAutopayPaymentAmountOptionType;
            if ((i & 8) != 0) {
                str = onRevolvingCreditAutopayEnrolled.__typename;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                list = onRevolvingCreditAutopayEnrolled.fundingInstruments;
            }
            return onRevolvingCreditAutopayEnrolled.copy(obj, z2, revolvingCreditAutopayPaymentAmountOptionType2, str2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$FundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "onRevolvingCreditPaymentFundingInstrumentBank", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "onRevolvingCreditPaymentFundingInstrumentCard", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "onRevolvingCreditPaymentFundingInstrumentBalance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBank;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentCard;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "component3", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "component4", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBank;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentCard;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$FundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "getOnRevolvingCreditPaymentFundingInstrumentBank", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "getOnRevolvingCreditPaymentFundingInstrumentCard", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "getOnRevolvingCreditPaymentFundingInstrumentBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard;

        public FundingInstrument(java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onRevolvingCreditPaymentFundingInstrumentBank = onRevolvingCreditPaymentFundingInstrumentBank;
            this.onRevolvingCreditPaymentFundingInstrumentCard = onRevolvingCreditPaymentFundingInstrumentCard;
            this.onRevolvingCreditPaymentFundingInstrumentBalance = onRevolvingCreditPaymentFundingInstrumentBalance;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank getOnRevolvingCreditPaymentFundingInstrumentBank() {
            return this.onRevolvingCreditPaymentFundingInstrumentBank;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard getOnRevolvingCreditPaymentFundingInstrumentCard() {
            return this.onRevolvingCreditPaymentFundingInstrumentCard;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance getOnRevolvingCreditPaymentFundingInstrumentBalance() {
            return this.onRevolvingCreditPaymentFundingInstrumentBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = this.onRevolvingCreditPaymentFundingInstrumentBank;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = this.onRevolvingCreditPaymentFundingInstrumentCard;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = this.onRevolvingCreditPaymentFundingInstrumentBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrument(__typename=");
            sb.append(str);
            sb.append(", onRevolvingCreditPaymentFundingInstrumentBank=");
            sb.append(onRevolvingCreditPaymentFundingInstrumentBank);
            sb.append(", onRevolvingCreditPaymentFundingInstrumentCard=");
            sb.append(onRevolvingCreditPaymentFundingInstrumentCard);
            sb.append(", onRevolvingCreditPaymentFundingInstrumentBalance=");
            sb.append(onRevolvingCreditPaymentFundingInstrumentBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = this.onRevolvingCreditPaymentFundingInstrumentBank;
            int hashCode2 = onRevolvingCreditPaymentFundingInstrumentBank == null ? 0 : onRevolvingCreditPaymentFundingInstrumentBank.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = this.onRevolvingCreditPaymentFundingInstrumentCard;
            int hashCode3 = onRevolvingCreditPaymentFundingInstrumentCard == null ? 0 : onRevolvingCreditPaymentFundingInstrumentCard.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = this.onRevolvingCreditPaymentFundingInstrumentBalance;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onRevolvingCreditPaymentFundingInstrumentBalance != null ? onRevolvingCreditPaymentFundingInstrumentBalance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, fundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPaymentFundingInstrumentBank, fundingInstrument.onRevolvingCreditPaymentFundingInstrumentBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPaymentFundingInstrumentCard, fundingInstrument.onRevolvingCreditPaymentFundingInstrumentCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRevolvingCreditPaymentFundingInstrumentBalance, fundingInstrument.onRevolvingCreditPaymentFundingInstrumentBalance);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument(__typename, onRevolvingCreditPaymentFundingInstrumentBank, onRevolvingCreditPaymentFundingInstrumentCard, onRevolvingCreditPaymentFundingInstrumentBalance);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance getOnRevolvingCreditPaymentFundingInstrumentBalance() {
            return this.onRevolvingCreditPaymentFundingInstrumentBalance;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard getOnRevolvingCreditPaymentFundingInstrumentCard() {
            return this.onRevolvingCreditPaymentFundingInstrumentCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank getOnRevolvingCreditPaymentFundingInstrumentBank() {
            return this.onRevolvingCreditPaymentFundingInstrumentBank;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.FundingInstrument fundingInstrument, java.lang.String str, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                onRevolvingCreditPaymentFundingInstrumentBank = fundingInstrument.onRevolvingCreditPaymentFundingInstrumentBank;
            }
            if ((i & 4) != 0) {
                onRevolvingCreditPaymentFundingInstrumentCard = fundingInstrument.onRevolvingCreditPaymentFundingInstrumentCard;
            }
            if ((i & 8) != 0) {
                onRevolvingCreditPaymentFundingInstrumentBalance = fundingInstrument.onRevolvingCreditPaymentFundingInstrumentBalance;
            }
            return fundingInstrument.copy(str, onRevolvingCreditPaymentFundingInstrumentBank, onRevolvingCreditPaymentFundingInstrumentCard, onRevolvingCreditPaymentFundingInstrumentBalance);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b(\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "", "", "name", "id", "lastNDigits", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "__typename", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art;", "art", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component5", "component6", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getId", "Ljava/lang/Object;", "getLastNDigits", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "get__typename", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art;", "getArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPaymentFundingInstrumentBank {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art;
        private final java.lang.String id;
        private final java.lang.Object lastNDigits;
        private final java.lang.String name;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public OnRevolvingCreditPaymentFundingInstrumentBank(java.lang.String str, java.lang.String str2, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str3, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.name = str;
            this.id = str2;
            this.lastNDigits = obj;
            this.type = bankAccountType;
            this.__typename = str3;
            this.art = art;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getLastNDigits() {
            return this.lastNDigits;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art getArt() {
            return this.art;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.id;
            java.lang.Object obj = this.lastNDigits;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.lang.String str3 = this.__typename;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art = this.art;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPaymentFundingInstrumentBank(name=");
            sb.append(str);
            sb.append(", id=");
            sb.append(str2);
            sb.append(", lastNDigits=");
            sb.append(obj);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", __typename=");
            sb.append(str3);
            sb.append(", art=");
            sb.append(art);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.id.hashCode();
            java.lang.Object obj = this.lastNDigits;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            int hashCode4 = bankAccountType == null ? 0 : bankAccountType.hashCode();
            int hashCode5 = this.__typename.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art = this.art;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (art != null ? art.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, onRevolvingCreditPaymentFundingInstrumentBank.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRevolvingCreditPaymentFundingInstrumentBank.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNDigits, onRevolvingCreditPaymentFundingInstrumentBank.lastNDigits) && this.type == onRevolvingCreditPaymentFundingInstrumentBank.type && kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onRevolvingCreditPaymentFundingInstrumentBank.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.art, onRevolvingCreditPaymentFundingInstrumentBank.art);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank copy(java.lang.String name2, java.lang.String id, java.lang.Object lastNDigits, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.lang.String __typename, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank(name2, id, lastNDigits, type, __typename, art);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art getArt() {
            return this.art;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLastNDigits() {
            return this.lastNDigits;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank, java.lang.String str, java.lang.String str2, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str3, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onRevolvingCreditPaymentFundingInstrumentBank.name;
            }
            if ((i & 2) != 0) {
                str2 = onRevolvingCreditPaymentFundingInstrumentBank.id;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                obj = onRevolvingCreditPaymentFundingInstrumentBank.lastNDigits;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                bankAccountType = onRevolvingCreditPaymentFundingInstrumentBank.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 16) != 0) {
                str3 = onRevolvingCreditPaymentFundingInstrumentBank.__typename;
            }
            java.lang.String str5 = str3;
            if ((i & 32) != 0) {
                art = onRevolvingCreditPaymentFundingInstrumentBank.art;
            }
            return onRevolvingCreditPaymentFundingInstrumentBank.copy(str, str4, obj3, bankAccountType2, str5, art);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art;", "", "", "assetName", "url", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetName", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Art {
        public static final int $stable = 8;
        private final java.lang.String assetName;
        private final java.lang.Object url;

        public Art(java.lang.String str, java.lang.Object obj) {
            this.assetName = str;
            this.url = obj;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetName;
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Art(assetName=");
            sb.append(str);
            sb.append(", url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.assetName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.url;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, art.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, art.url);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art copy(java.lang.String assetName, java.lang.Object url) {
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art(assetName, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art art, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = art.assetName;
            }
            if ((i & 2) != 0) {
                obj = art.url;
            }
            return art.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art1;", "art", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art1;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art1;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art1;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getLastNChars", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art1;", "getArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPaymentFundingInstrumentCard {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art;
        private final java.lang.String id;
        private final java.lang.Object lastNChars;

        public OnRevolvingCreditPaymentFundingInstrumentCard(java.lang.String str, java.lang.Object obj, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.id = str;
            this.lastNChars = obj;
            this.art = art1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 getArt() {
            return this.art;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.lastNChars;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art1 = this.art;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPaymentFundingInstrumentCard(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(obj);
            sb.append(", art=");
            sb.append(art1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.lastNChars.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art1 = this.art;
            return (((hashCode * 31) + hashCode2) * 31) + (art1 == null ? 0 : art1.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRevolvingCreditPaymentFundingInstrumentCard.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onRevolvingCreditPaymentFundingInstrumentCard.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.art, onRevolvingCreditPaymentFundingInstrumentCard.art);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard copy(java.lang.String id, java.lang.Object lastNChars, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard(id, lastNChars, art);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 getArt() {
            return this.art;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard, java.lang.String str, java.lang.Object obj, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art1, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onRevolvingCreditPaymentFundingInstrumentCard.id;
            }
            if ((i & 2) != 0) {
                obj = onRevolvingCreditPaymentFundingInstrumentCard.lastNChars;
            }
            if ((i & 4) != 0) {
                art1 = onRevolvingCreditPaymentFundingInstrumentCard.art;
            }
            return onRevolvingCreditPaymentFundingInstrumentCard.copy(str, obj, art1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art1;", "", "", "assetName", "url", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetName", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Art1 {
        public static final int $stable = 8;
        private final java.lang.String assetName;
        private final java.lang.Object url;

        public Art1(java.lang.String str, java.lang.Object obj) {
            this.assetName = str;
            this.url = obj;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetName;
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Art1(assetName=");
            sb.append(str);
            sb.append(", url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.assetName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.url;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art1 = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, art1.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, art1.url);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 copy(java.lang.String assetName, java.lang.Object url) {
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1(assetName, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art1 art1, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = art1.assetName;
            }
            if ((i & 2) != 0) {
                obj = art1.url;
            }
            return art1.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Amount;", "amount", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art2;", "art", "", "id", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Amount;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art2;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Amount;", "component2", "()Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art2;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Amount;Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art2;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Amount;", "getAmount", "Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art2;", "getArt", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevolvingCreditPaymentFundingInstrumentBalance {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount;
        private final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art;
        private final java.lang.String id;

        public OnRevolvingCreditPaymentFundingInstrumentBalance(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = amount;
            this.art = art2;
            this.id = str;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount getAmount() {
            return this.amount;
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 getArt() {
            return this.art;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount = this.amount;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art2 = this.art;
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevolvingCreditPaymentFundingInstrumentBalance(amount=");
            sb.append(amount);
            sb.append(", art=");
            sb.append(art2);
            sb.append(", id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount = this.amount;
            int hashCode = amount == null ? 0 : amount.hashCode();
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art2 = this.art;
            return (((hashCode * 31) + (art2 != null ? art2.hashCode() : 0)) * 31) + this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, onRevolvingCreditPaymentFundingInstrumentBalance.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.art, onRevolvingCreditPaymentFundingInstrumentBalance.art) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, onRevolvingCreditPaymentFundingInstrumentBalance.id);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance copy(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art, java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance(amount, art, id);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 getArt() {
            return this.art;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount, com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = onRevolvingCreditPaymentFundingInstrumentBalance.amount;
            }
            if ((i & 2) != 0) {
                art2 = onRevolvingCreditPaymentFundingInstrumentBalance.art;
            }
            if ((i & 4) != 0) {
                str = onRevolvingCreditPaymentFundingInstrumentBalance.id;
            }
            return onRevolvingCreditPaymentFundingInstrumentBalance.copy(amount, art2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Amount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art2;", "", "", "assetName", "url", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Art2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetName", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Art2 {
        public static final int $stable = 8;
        private final java.lang.String assetName;
        private final java.lang.Object url;

        public Art2(java.lang.String str, java.lang.Object obj) {
            this.assetName = str;
            this.url = obj;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetName;
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Art2(assetName=");
            sb.append(str);
            sb.append(", url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.assetName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Object obj = this.url;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art2 = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, art2.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, art2.url);
        }

        public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 copy(java.lang.String assetName, java.lang.Object url) {
            return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2(assetName, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Art2 art2, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = art2.assetName;
            }
            if ((i & 2) != 0) {
                obj = art2.url;
            }
            return art2.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/AutopayStatusQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query AutopayStatus($input: RevolvingCreditAutopayInput!) { revolvingCreditAutopay(input: $input) { __typename ... on RevolvingCreditAutopayUnenrolled { enrollmentEligible } ... on RevolvingCreditAutopayEnrolled { effectiveDueTime effectiveInCurrentBillingCycle paymentAmountOptionType __typename fundingInstruments { __typename ... on RevolvingCreditPaymentFundingInstrumentBank { name id lastNDigits: lastNChars type __typename art { assetName url } } ... on RevolvingCreditPaymentFundingInstrumentCard { id lastNChars art { assetName url } } ... on RevolvingCreditPaymentFundingInstrumentBalance { amount { currencyCode value } art { assetName url } id } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput revolvingCreditAutopayInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayStatusQuery(input=");
        sb.append(revolvingCreditAutopayInput);
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
        return (other instanceof com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery) other).input);
    }

    public final com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery copy$default(com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery autopayStatusQuery, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput revolvingCreditAutopayInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditAutopayInput = autopayStatusQuery.input;
        }
        return autopayStatusQuery.copy(revolvingCreditAutopayInput);
    }
}
