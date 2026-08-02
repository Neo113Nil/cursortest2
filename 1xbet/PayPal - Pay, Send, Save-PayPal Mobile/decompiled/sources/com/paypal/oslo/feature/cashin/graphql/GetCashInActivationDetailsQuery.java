package com.paypal.oslo.feature.cashin.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CashInActivationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInActivationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CashInActivationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CashInActivationInput;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CashInActivationInput;", "getInput", "Companion", "Data", "CashInActivation", "Partner", "Retailer", "Fee", "Partner1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetCashInActivationDetailsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "58f24a201a7d39880412ac5f9490662d1b87047d20d836595d7636e5bf31c762";
    public static final java.lang.String OPERATION_NAME = "GetCashInActivationDetails";
    private final com.paypal.oslo.api.graphql.schema.type.CashInActivationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Companion INSTANCE = new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Companion(null);
    public static final int $stable = 8;

    public GetCashInActivationDetailsQuery(com.paypal.oslo.api.graphql.schema.type.CashInActivationInput cashInActivationInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInActivationInput, "");
        this.input = cashInActivationInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CashInActivationInput getInput() {
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
        com.paypal.oslo.feature.cashin.graphql.adapter.GetCashInActivationDetailsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cashin.graphql.adapter.GetCashInActivationDetailsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cashin.graphql.selections.GetCashInActivationDetailsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;", "cashInActivation", "<init>", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;)V", "component1", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;", "copy", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;", "getCashInActivation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation;

        public Data(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation) {
            this.cashInActivation = cashInActivation;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation getCashInActivation() {
            return this.cashInActivation;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation = this.cashInActivation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cashInActivation=");
            sb.append(cashInActivation);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation = this.cashInActivation;
            if (cashInActivation == null) {
                return 0;
            }
            return cashInActivation.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashInActivation, ((com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data) other).cashInActivation);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data copy(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation) {
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data(cashInActivation);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation getCashInActivation() {
            return this.cashInActivation;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data data, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cashInActivation = data.cashInActivation;
            }
            return data.copy(cashInActivation);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;", "", "", "code", "codeActivationTime", "codeExpirationTime", "Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;", "codeType", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner;", "partner", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Retailer;", "retailer", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Retailer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;", "component5", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner;", "component6", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Retailer;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Retailer;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "Ljava/lang/Object;", "getCodeActivationTime", "getCodeExpirationTime", "Lcom/paypal/oslo/api/graphql/schema/type/CashInCodeType;", "getCodeType", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner;", "getPartner", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Retailer;", "getRetailer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CashInActivation {
        public static final int $stable = 8;
        private final java.lang.String code;
        private final java.lang.Object codeActivationTime;
        private final java.lang.Object codeExpirationTime;
        private final com.paypal.oslo.api.graphql.schema.type.CashInCodeType codeType;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner partner;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer;

        public CashInActivation(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner partner, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInCodeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retailer, "");
            this.code = str;
            this.codeActivationTime = obj;
            this.codeExpirationTime = obj2;
            this.codeType = cashInCodeType;
            this.partner = partner;
            this.retailer = retailer;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.Object getCodeActivationTime() {
            return this.codeActivationTime;
        }

        public final java.lang.Object getCodeExpirationTime() {
            return this.codeExpirationTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CashInCodeType getCodeType() {
            return this.codeType;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner getPartner() {
            return this.partner;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer getRetailer() {
            return this.retailer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.code;
            java.lang.Object obj = this.codeActivationTime;
            java.lang.Object obj2 = this.codeExpirationTime;
            com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType = this.codeType;
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner partner = this.partner;
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer = this.retailer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInActivation(code=");
            sb.append(str);
            sb.append(", codeActivationTime=");
            sb.append(obj);
            sb.append(", codeExpirationTime=");
            sb.append(obj2);
            sb.append(", codeType=");
            sb.append(cashInCodeType);
            sb.append(", partner=");
            sb.append(partner);
            sb.append(", retailer=");
            sb.append(retailer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.code.hashCode() * 31) + this.codeActivationTime.hashCode()) * 31) + this.codeExpirationTime.hashCode()) * 31) + this.codeType.hashCode()) * 31) + this.partner.hashCode()) * 31) + this.retailer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation = (com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.code, cashInActivation.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeActivationTime, cashInActivation.codeActivationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeExpirationTime, cashInActivation.codeExpirationTime) && this.codeType == cashInActivation.codeType && kotlin.jvm.internal.Intrinsics.areEqual(this.partner, cashInActivation.partner) && kotlin.jvm.internal.Intrinsics.areEqual(this.retailer, cashInActivation.retailer);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation copy(java.lang.String code, java.lang.Object codeActivationTime, java.lang.Object codeExpirationTime, com.paypal.oslo.api.graphql.schema.type.CashInCodeType codeType, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner partner, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeActivationTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeExpirationTime, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retailer, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation(code, codeActivationTime, codeExpirationTime, codeType, partner, retailer);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer getRetailer() {
            return this.retailer;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner getPartner() {
            return this.partner;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CashInCodeType getCodeType() {
            return this.codeType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getCodeExpirationTime() {
            return this.codeExpirationTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCodeActivationTime() {
            return this.codeActivationTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner partner, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = cashInActivation.code;
            }
            if ((i & 2) != 0) {
                obj = cashInActivation.codeActivationTime;
            }
            java.lang.Object obj4 = obj;
            if ((i & 4) != 0) {
                obj2 = cashInActivation.codeExpirationTime;
            }
            java.lang.Object obj5 = obj2;
            if ((i & 8) != 0) {
                cashInCodeType = cashInActivation.codeType;
            }
            com.paypal.oslo.api.graphql.schema.type.CashInCodeType cashInCodeType2 = cashInCodeType;
            if ((i & 16) != 0) {
                partner = cashInActivation.partner;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner partner2 = partner;
            if ((i & 32) != 0) {
                retailer = cashInActivation.retailer;
            }
            return cashInActivation.copy(str, obj4, obj5, cashInCodeType2, partner2, retailer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Partner {
        public static final int $stable = 0;
        private final java.lang.String id;

        public Partner(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Partner(id=");
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
            return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner) other).id);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner partner, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = partner.id;
            }
            return partner.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJf\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Retailer;", "", "", "id", "name", "logoUrl", "", "Lcom/paypal/oslo/api/graphql/schema/type/CashInRetailerCapability;", "capabilities", "tags", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Fee;", "fee", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner1;", "partner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Fee;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Fee;", "component7", "()Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner1;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Fee;Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner1;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Retailer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl", "Ljava/util/List;", "getCapabilities", "getTags", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Fee;", "getFee", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner1;", "getPartner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retailer {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> capabilities;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee;
        private final java.lang.String id;
        private final java.lang.Object logoUrl;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 partner;
        private final java.util.List<java.lang.String> tags;

        /* JADX WARN: Multi-variable type inference failed */
        public Retailer(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list, java.util.List<java.lang.String> list2, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 partner1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner1, "");
            this.id = str;
            this.name = str2;
            this.logoUrl = obj;
            this.capabilities = list;
            this.tags = list2;
            this.fee = fee;
            this.partner = partner1;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> getCapabilities() {
            return this.capabilities;
        }

        public final java.util.List<java.lang.String> getTags() {
            return this.tags;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee getFee() {
            return this.fee;
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 getPartner() {
            return this.partner;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoUrl;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list = this.capabilities;
            java.util.List<java.lang.String> list2 = this.tags;
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee = this.fee;
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 partner1 = this.partner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Retailer(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", capabilities=");
            sb.append(list);
            sb.append(", tags=");
            sb.append(list2);
            sb.append(", fee=");
            sb.append(fee);
            sb.append(", partner=");
            sb.append(partner1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            int hashCode3 = this.logoUrl.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list = this.capabilities;
            int hashCode4 = list == null ? 0 : list.hashCode();
            java.util.List<java.lang.String> list2 = this.tags;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.fee.hashCode()) * 31) + this.partner.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer = (com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, retailer.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, retailer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, retailer.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, retailer.capabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, retailer.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.fee, retailer.fee) && kotlin.jvm.internal.Intrinsics.areEqual(this.partner, retailer.partner);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> capabilities, java.util.List<java.lang.String> tags, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 partner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fee, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partner, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer(id, name2, logoUrl, capabilities, tags, fee, partner);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 getPartner() {
            return this.partner;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee getFee() {
            return this.fee;
        }

        public final java.util.List<java.lang.String> component5() {
            return this.tags;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> component4() {
            return this.capabilities;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.util.List list, java.util.List list2, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee, com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 partner1, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = retailer.id;
            }
            if ((i & 2) != 0) {
                str2 = retailer.name;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                obj = retailer.logoUrl;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                list = retailer.capabilities;
            }
            java.util.List list3 = list;
            if ((i & 16) != 0) {
                list2 = retailer.tags;
            }
            java.util.List list4 = list2;
            if ((i & 32) != 0) {
                fee = retailer.fee;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee2 = fee;
            if ((i & 64) != 0) {
                partner1 = retailer.partner;
            }
            return retailer.copy(str, str3, obj3, list3, list4, fee2, partner1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Fee;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Fee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Fee {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public Fee(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fee(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee = (com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fee.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fee.value);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = fee.currencyCode;
            }
            if ((i & 2) != 0) {
                str = fee.value;
            }
            return fee.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner1;", "", "", "id", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Partner1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Partner1 {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.Object logoUrl;

        public Partner1(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.logoUrl = obj;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.logoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Partner1(id=");
            sb.append(str);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.logoUrl;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1)) {
                return false;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 partner1 = (com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, partner1.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, partner1.logoUrl);
        }

        public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 copy(java.lang.String id, java.lang.Object logoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1(id, logoUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Partner1 partner1, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = partner1.id;
            }
            if ((i & 2) != 0) {
                obj = partner1.logoUrl;
            }
            return partner1.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCashInActivationDetails($input: CashInActivationInput!) { cashInActivation(input: $input) { code codeActivationTime codeExpirationTime codeType partner { id } retailer { id name logoUrl capabilities tags fee { currencyCode value } partner { id logoUrl } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CashInActivationInput cashInActivationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCashInActivationDetailsQuery(input=");
        sb.append(cashInActivationInput);
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
        return (other instanceof com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery) other).input);
    }

    public final com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery copy(com.paypal.oslo.api.graphql.schema.type.CashInActivationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CashInActivationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery copy$default(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery getCashInActivationDetailsQuery, com.paypal.oslo.api.graphql.schema.type.CashInActivationInput cashInActivationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cashInActivationInput = getCashInActivationDetailsQuery.input;
        }
        return getCashInActivationDetailsQuery.copy(cashInActivationInput);
    }
}
