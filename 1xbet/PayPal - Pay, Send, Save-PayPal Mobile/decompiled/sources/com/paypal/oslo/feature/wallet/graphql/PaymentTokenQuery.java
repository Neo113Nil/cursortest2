package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b'()*+,-&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Data;", "", "id", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Companion", "Data", com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.OPERATION_NAME, "PaymentTokenArt", "PrimaryImage", "RealTimeBalance", "Available", "Amount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PaymentTokenQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "4f283cc46b02778a44b48ce5bcf6ea0a16b98d16fda3df25b6094d4fdf46f445";
    public static final java.lang.String OPERATION_NAME = "PaymentToken";
    private final java.lang.String id;

    public PaymentTokenQuery(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
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
        com.paypal.oslo.feature.wallet.graphql.adapter.PaymentTokenQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.PaymentTokenQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.PaymentTokenQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;", "paymentToken", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;", "getPaymentToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken;

        public Data(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken) {
            this.paymentToken = paymentToken;
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken getPaymentToken() {
            return this.paymentToken;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken = this.paymentToken;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(paymentToken=");
            sb.append(paymentToken);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken = this.paymentToken;
            if (paymentToken == null) {
                return 0;
            }
            return paymentToken.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentToken, ((com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data) other).paymentToken);
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken) {
            return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data(paymentToken);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken getPaymentToken() {
            return this.paymentToken;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Data data, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentToken = data.paymentToken;
            }
            return data.copy(paymentToken);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJn\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;", "", "", "id", "lastNChars", "productDisplayName", "productIdentifier", "issuerDisplayName", "partnerSettingsUrl", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentTokenArt;", "paymentTokenArt", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$RealTimeBalance;", "realTimeBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentTokenArt;Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$RealTimeBalance;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Object;", "component7", "()Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentTokenArt;", "component8", "()Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$RealTimeBalance;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentTokenArt;Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$RealTimeBalance;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "getProductDisplayName", "getProductIdentifier", "getIssuerDisplayName", "Ljava/lang/Object;", "getPartnerSettingsUrl", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentTokenArt;", "getPaymentTokenArt", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$RealTimeBalance;", "getRealTimeBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentToken {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.String issuerDisplayName;
        private final java.lang.String lastNChars;
        private final java.lang.Object partnerSettingsUrl;
        private final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt;
        private final java.lang.String productDisplayName;
        private final java.lang.String productIdentifier;
        private final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance;

        public PaymentToken(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.lastNChars = str2;
            this.productDisplayName = str3;
            this.productIdentifier = str4;
            this.issuerDisplayName = str5;
            this.partnerSettingsUrl = obj;
            this.paymentTokenArt = paymentTokenArt;
            this.realTimeBalance = realTimeBalance;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getProductDisplayName() {
            return this.productDisplayName;
        }

        public final java.lang.String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final java.lang.String getIssuerDisplayName() {
            return this.issuerDisplayName;
        }

        public final java.lang.Object getPartnerSettingsUrl() {
            return this.partnerSettingsUrl;
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt getPaymentTokenArt() {
            return this.paymentTokenArt;
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance getRealTimeBalance() {
            return this.realTimeBalance;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.productDisplayName;
            java.lang.String str4 = this.productIdentifier;
            java.lang.String str5 = this.issuerDisplayName;
            java.lang.Object obj = this.partnerSettingsUrl;
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt = this.paymentTokenArt;
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance = this.realTimeBalance;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentToken(id=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", productDisplayName=");
            sb.append(str3);
            sb.append(", productIdentifier=");
            sb.append(str4);
            sb.append(", issuerDisplayName=");
            sb.append(str5);
            sb.append(", partnerSettingsUrl=");
            sb.append(obj);
            sb.append(", paymentTokenArt=");
            sb.append(paymentTokenArt);
            sb.append(", realTimeBalance=");
            sb.append(realTimeBalance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.lastNChars;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.productDisplayName;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.productIdentifier;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.issuerDisplayName;
            int hashCode5 = str4 == null ? 0 : str4.hashCode();
            java.lang.Object obj = this.partnerSettingsUrl;
            int hashCode6 = obj == null ? 0 : obj.hashCode();
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt = this.paymentTokenArt;
            int hashCode7 = paymentTokenArt == null ? 0 : paymentTokenArt.hashCode();
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance = this.realTimeBalance;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (realTimeBalance != null ? realTimeBalance.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken paymentToken = (com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, paymentToken.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, paymentToken.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.productDisplayName, paymentToken.productDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.productIdentifier, paymentToken.productIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerDisplayName, paymentToken.issuerDisplayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerSettingsUrl, paymentToken.partnerSettingsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTokenArt, paymentToken.paymentTokenArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.realTimeBalance, paymentToken.realTimeBalance);
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken copy(java.lang.String id, java.lang.String lastNChars, java.lang.String productDisplayName, java.lang.String productIdentifier, java.lang.String issuerDisplayName, java.lang.Object partnerSettingsUrl, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentToken(id, lastNChars, productDisplayName, productIdentifier, issuerDisplayName, partnerSettingsUrl, paymentTokenArt, realTimeBalance);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance getRealTimeBalance() {
            return this.realTimeBalance;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt getPaymentTokenArt() {
            return this.paymentTokenArt;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getPartnerSettingsUrl() {
            return this.partnerSettingsUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getIssuerDisplayName() {
            return this.issuerDisplayName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getProductIdentifier() {
            return this.productIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProductDisplayName() {
            return this.productDisplayName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentTokenArt;", "", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PrimaryImage;", "primaryImage", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PrimaryImage;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PrimaryImage;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PrimaryImage;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PaymentTokenArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PrimaryImage;", "getPrimaryImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTokenArt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage;

        public PaymentTokenArt(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage) {
            this.primaryImage = primaryImage;
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage getPrimaryImage() {
            return this.primaryImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage = this.primaryImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTokenArt(primaryImage=");
            sb.append(primaryImage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage = this.primaryImage;
            if (primaryImage == null) {
                return 0;
            }
            return primaryImage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImage, ((com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt) other).primaryImage);
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt copy(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage) {
            return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt(primaryImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage getPrimaryImage() {
            return this.primaryImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt copy$default(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PaymentTokenArt paymentTokenArt, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                primaryImage = paymentTokenArt.primaryImage;
            }
            return paymentTokenArt.copy(primaryImage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PrimaryImage;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$PrimaryImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryImage {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.String mimeType;

        public PrimaryImage(java.lang.Object obj, java.lang.String str) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryImage(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage = (com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, primaryImage.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, primaryImage.mimeType);
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType) {
            return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage(baseCdnLinkPath, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage copy$default(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.PrimaryImage primaryImage, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryImage.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = primaryImage.mimeType;
            }
            return primaryImage.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$RealTimeBalance;", "", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Available;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Available;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Available;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Available;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$RealTimeBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Available;", "getAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RealTimeBalance {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available;

        public RealTimeBalance(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available) {
            this.available = available;
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available getAvailable() {
            return this.available;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available = this.available;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RealTimeBalance(available=");
            sb.append(available);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available = this.available;
            if (available == null) {
                return 0;
            }
            return available.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.available, ((com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance) other).available);
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance copy(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available) {
            return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance(available);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available getAvailable() {
            return this.available;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance copy$default(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.RealTimeBalance realTimeBalance, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                available = realTimeBalance.available;
            }
            return realTimeBalance.copy(available);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Available;", "", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Amount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Amount;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Amount;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Amount;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Available;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount;

        public Available(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.amount = amount;
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Available(amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available) other).amount);
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available copy(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available copy$default(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Available available, com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = available.amount;
            }
            return available.copy(amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Amount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount = (com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, amount.value);
        }

        public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount copy$default(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.Amount amount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = amount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = amount.value;
            }
            return amount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/PaymentTokenQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query PaymentToken($id: ID!) { paymentToken(id: $id) { id lastNChars productDisplayName productIdentifier issuerDisplayName partnerSettingsUrl paymentTokenArt { primaryImage { baseCdnLinkPath mimeType } } realTimeBalance { available { amount { currencyCode value } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTokenQuery(id=");
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery) other).id);
    }

    public final com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery copy$default(com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery paymentTokenQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentTokenQuery.id;
        }
        return paymentTokenQuery.copy(str);
    }
}
