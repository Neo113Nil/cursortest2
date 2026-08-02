package com.paypal.oslo.feature.inappcheckout.graphql.checkout;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\r)*+,-./01234(B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Data;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/Object;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getToken", "Companion", "Data", "External", "BuyerInfo", "OnExternalBuyerInfoSuccessResponse", "Phone", "Name", "ProfileImage", "Contingency", "OnExternalPhoneNumberRequiredContingency", "OnExternalEConsentContingency", "OnExternalBuyerInfoErrorResponse", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetBuyerInfoQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data> {
    public static final java.lang.String OPERATION_ID = "57ab9ac00fdcaca5c2f54add1f2813368324f6af49abc56c6abb55049154ff5e";
    public static final java.lang.String OPERATION_NAME = "GetBuyerInfo";
    private final java.lang.Object token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Companion(null);
    public static final int $stable = 8;

    public GetBuyerInfoQuery(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.token = obj;
    }

    public final java.lang.Object getToken() {
        return this.token;
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
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.inappcheckout.graphql.checkout.selections.GetBuyerInfoQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;", com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;", "getExternal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external;

        public Data(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external) {
            this.external = external;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External getExternal() {
            return this.external;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external = this.external;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(external=");
            sb.append(external);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external = this.external;
            if (external == null) {
                return 0;
            }
            return external.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.external, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data) other).external);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data(external);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External getExternal() {
            return this.external;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data data, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                external = data.external;
            }
            return data.copy(external);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "buyerInfo", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "getBuyerInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class External {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo;

        public External(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo) {
            this.buyerInfo = buyerInfo;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo getBuyerInfo() {
            return this.buyerInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo = this.buyerInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("External(buyerInfo=");
            sb.append(buyerInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo = this.buyerInfo;
            if (buyerInfo == null) {
                return 0;
            }
            return buyerInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External) && kotlin.jvm.internal.Intrinsics.areEqual(this.buyerInfo, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External) other).buyerInfo);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External(buyerInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo getBuyerInfo() {
            return this.buyerInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                buyerInfo = external.buyerInfo;
            }
            return external.copy(buyerInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "", "", "__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;", "onExternalBuyerInfoSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;", "onExternalBuyerInfoErrorResponse", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;", "getOnExternalBuyerInfoSuccessResponse", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;", "getOnExternalBuyerInfoErrorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BuyerInfo {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse;

        public BuyerInfo(java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onExternalBuyerInfoSuccessResponse = onExternalBuyerInfoSuccessResponse;
            this.onExternalBuyerInfoErrorResponse = onExternalBuyerInfoErrorResponse;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse getOnExternalBuyerInfoSuccessResponse() {
            return this.onExternalBuyerInfoSuccessResponse;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse getOnExternalBuyerInfoErrorResponse() {
            return this.onExternalBuyerInfoErrorResponse;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse = this.onExternalBuyerInfoSuccessResponse;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse = this.onExternalBuyerInfoErrorResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BuyerInfo(__typename=");
            sb.append(str);
            sb.append(", onExternalBuyerInfoSuccessResponse=");
            sb.append(onExternalBuyerInfoSuccessResponse);
            sb.append(", onExternalBuyerInfoErrorResponse=");
            sb.append(onExternalBuyerInfoErrorResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse = this.onExternalBuyerInfoSuccessResponse;
            int hashCode2 = onExternalBuyerInfoSuccessResponse == null ? 0 : onExternalBuyerInfoSuccessResponse.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse = this.onExternalBuyerInfoErrorResponse;
            return (((hashCode * 31) + hashCode2) * 31) + (onExternalBuyerInfoErrorResponse != null ? onExternalBuyerInfoErrorResponse.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, buyerInfo.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalBuyerInfoSuccessResponse, buyerInfo.onExternalBuyerInfoSuccessResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalBuyerInfoErrorResponse, buyerInfo.onExternalBuyerInfoErrorResponse);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo copy(java.lang.String __typename, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo(__typename, onExternalBuyerInfoSuccessResponse, onExternalBuyerInfoErrorResponse);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse getOnExternalBuyerInfoErrorResponse() {
            return this.onExternalBuyerInfoErrorResponse;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse getOnExternalBuyerInfoSuccessResponse() {
            return this.onExternalBuyerInfoSuccessResponse;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo, java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = buyerInfo.__typename;
            }
            if ((i & 2) != 0) {
                onExternalBuyerInfoSuccessResponse = buyerInfo.onExternalBuyerInfoSuccessResponse;
            }
            if ((i & 4) != 0) {
                onExternalBuyerInfoErrorResponse = buyerInfo.onExternalBuyerInfoErrorResponse;
            }
            return buyerInfo.copy(str, onExternalBuyerInfoSuccessResponse, onExternalBuyerInfoErrorResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;", "", "", "userId", "email", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;", "phone", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;", "name", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;", "profileImage", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Contingency;", "contingencies", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;", "component4", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;", "component5", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUserId", "Ljava/lang/Object;", "getEmail", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;", "getPhone", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;", "getName", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;", "getProfileImage", "Ljava/util/List;", "getContingencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalBuyerInfoSuccessResponse {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> contingencies;
        private final java.lang.Object email;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage;
        private final java.lang.String userId;

        public OnExternalBuyerInfoSuccessResponse(java.lang.String str, java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name2, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage, java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.userId = str;
            this.email = obj;
            this.phone = phone;
            this.name = name2;
            this.profileImage = profileImage;
            this.contingencies = list;
        }

        public final java.lang.String getUserId() {
            return this.userId;
        }

        public final java.lang.Object getEmail() {
            return this.email;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone getPhone() {
            return this.phone;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage getProfileImage() {
            return this.profileImage;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> getContingencies() {
            return this.contingencies;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.userId;
            java.lang.Object obj = this.email;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone = this.phone;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name2 = this.name;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage = this.profileImage;
            java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> list = this.contingencies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalBuyerInfoSuccessResponse(userId=");
            sb.append(str);
            sb.append(", email=");
            sb.append(obj);
            sb.append(", phone=");
            sb.append(phone);
            sb.append(", name=");
            sb.append(name2);
            sb.append(", profileImage=");
            sb.append(profileImage);
            sb.append(", contingencies=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.userId.hashCode();
            int hashCode2 = this.email.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone = this.phone;
            int hashCode3 = phone == null ? 0 : phone.hashCode();
            int hashCode4 = this.name.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage = this.profileImage;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (profileImage != null ? profileImage.hashCode() : 0)) * 31) + this.contingencies.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userId, onExternalBuyerInfoSuccessResponse.userId) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, onExternalBuyerInfoSuccessResponse.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, onExternalBuyerInfoSuccessResponse.phone) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, onExternalBuyerInfoSuccessResponse.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileImage, onExternalBuyerInfoSuccessResponse.profileImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencies, onExternalBuyerInfoSuccessResponse.contingencies);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse copy(java.lang.String userId, java.lang.Object email, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name2, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage, java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> contingencies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencies, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse(userId, email, phone, name2, profileImage, contingencies);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> component6() {
            return this.contingencies;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage getProfileImage() {
            return this.profileImage;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone getPhone() {
            return this.phone;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getEmail() {
            return this.email;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUserId() {
            return this.userId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse, java.lang.String str, java.lang.Object obj, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name2, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onExternalBuyerInfoSuccessResponse.userId;
            }
            if ((i & 2) != 0) {
                obj = onExternalBuyerInfoSuccessResponse.email;
            }
            java.lang.Object obj3 = obj;
            if ((i & 4) != 0) {
                phone = onExternalBuyerInfoSuccessResponse.phone;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone2 = phone;
            if ((i & 8) != 0) {
                name2 = onExternalBuyerInfoSuccessResponse.name;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name3 = name2;
            if ((i & 16) != 0) {
                profileImage = onExternalBuyerInfoSuccessResponse.profileImage;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage2 = profileImage;
            if ((i & 32) != 0) {
                list = onExternalBuyerInfoSuccessResponse.contingencies;
            }
            return onExternalBuyerInfoSuccessResponse.copy(str, obj3, phone2, name3, profileImage2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;", "", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "extensionNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getNationalNumber", "getExtensionNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String extensionNumber;
        private final java.lang.String nationalNumber;

        public Phone(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.countryCode = str;
            this.nationalNumber = str2;
            this.extensionNumber = str3;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        public final java.lang.String getExtensionNumber() {
            return this.extensionNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            java.lang.String str2 = this.nationalNumber;
            java.lang.String str3 = this.extensionNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(countryCode=");
            sb.append(str);
            sb.append(", nationalNumber=");
            sb.append(str2);
            sb.append(", extensionNumber=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.countryCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.nationalNumber;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.extensionNumber;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, phone.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, phone.nationalNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensionNumber, phone.extensionNumber);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone copy(java.lang.String countryCode, java.lang.String nationalNumber, java.lang.String extensionNumber) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone(countryCode, nationalNumber, extensionNumber);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExtensionNumber() {
            return this.extensionNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phone.countryCode;
            }
            if ((i & 2) != 0) {
                str2 = phone.nationalNumber;
            }
            if ((i & 4) != 0) {
                str3 = phone.extensionNumber;
            }
            return phone.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015Jd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalOrthography;", "orthography", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalOrthography;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalOrthography;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalOrthography;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getMiddleName", "getSuffix", "getFullName", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalOrthography;", "getOrthography"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography orthography;
        private final java.lang.String prefix;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public Name(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography externalOrthography) {
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.middleName = str4;
            this.suffix = str5;
            this.fullName = str6;
            this.orthography = externalOrthography;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography getOrthography() {
            return this.orthography;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.middleName;
            java.lang.String str5 = this.suffix;
            java.lang.String str6 = this.fullName;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography externalOrthography = this.orthography;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", middleName=");
            sb.append(str4);
            sb.append(", suffix=");
            sb.append(str5);
            sb.append(", fullName=");
            sb.append(str6);
            sb.append(", orthography=");
            sb.append(externalOrthography);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.prefix;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.middleName;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.suffix;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.fullName;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography externalOrthography = this.orthography;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (externalOrthography != null ? externalOrthography.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name2 = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, name2.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, name2.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, name2.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, name2.fullName) && this.orthography == name2.orthography;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography orthography) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name(prefix, givenName, surname, middleName, suffix, fullName, orthography);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography getOrthography() {
            return this.orthography;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography externalOrthography, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.prefix;
            }
            if ((i & 2) != 0) {
                str2 = name2.givenName;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = name2.surname;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = name2.middleName;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = name2.suffix;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = name2.fullName;
            }
            java.lang.String str11 = str6;
            if ((i & 64) != 0) {
                externalOrthography = name2.orthography;
            }
            return name2.copy(str, str7, str8, str9, str10, str11, externalOrthography);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J|\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b0\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b1\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b3\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImageLocationType;", "locationType", "", "imagePath", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImagePathFormatType;", "pathFormatType", "originalMimeType", "", "originalWidth", "originalHeight", "backgroundColor", "foregroundColor", "labelColor", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImageLocationType;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImagePathFormatType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImageLocationType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImagePathFormatType;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImageLocationType;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImagePathFormatType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImageLocationType;", "getLocationType", "Ljava/lang/String;", "getImagePath", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalImagePathFormatType;", "getPathFormatType", "getOriginalMimeType", "Ljava/lang/Integer;", "getOriginalWidth", "getOriginalHeight", "getBackgroundColor", "getForegroundColor", "getLabelColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProfileImage {
        public static final int $stable = 0;
        private final java.lang.String backgroundColor;
        private final java.lang.String foregroundColor;
        private final java.lang.String imagePath;
        private final java.lang.String labelColor;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType locationType;
        private final java.lang.Integer originalHeight;
        private final java.lang.String originalMimeType;
        private final java.lang.Integer originalWidth;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType pathFormatType;

        public ProfileImage(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType externalImageLocationType, java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType externalImagePathFormatType, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            this.locationType = externalImageLocationType;
            this.imagePath = str;
            this.pathFormatType = externalImagePathFormatType;
            this.originalMimeType = str2;
            this.originalWidth = num;
            this.originalHeight = num2;
            this.backgroundColor = str3;
            this.foregroundColor = str4;
            this.labelColor = str5;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType getLocationType() {
            return this.locationType;
        }

        public final java.lang.String getImagePath() {
            return this.imagePath;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType getPathFormatType() {
            return this.pathFormatType;
        }

        public final java.lang.String getOriginalMimeType() {
            return this.originalMimeType;
        }

        public final java.lang.Integer getOriginalWidth() {
            return this.originalWidth;
        }

        public final java.lang.Integer getOriginalHeight() {
            return this.originalHeight;
        }

        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final java.lang.String getForegroundColor() {
            return this.foregroundColor;
        }

        public final java.lang.String getLabelColor() {
            return this.labelColor;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType externalImageLocationType = this.locationType;
            java.lang.String str = this.imagePath;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType externalImagePathFormatType = this.pathFormatType;
            java.lang.String str2 = this.originalMimeType;
            java.lang.Integer num = this.originalWidth;
            java.lang.Integer num2 = this.originalHeight;
            java.lang.String str3 = this.backgroundColor;
            java.lang.String str4 = this.foregroundColor;
            java.lang.String str5 = this.labelColor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfileImage(locationType=");
            sb.append(externalImageLocationType);
            sb.append(", imagePath=");
            sb.append(str);
            sb.append(", pathFormatType=");
            sb.append(externalImagePathFormatType);
            sb.append(", originalMimeType=");
            sb.append(str2);
            sb.append(", originalWidth=");
            sb.append(num);
            sb.append(", originalHeight=");
            sb.append(num2);
            sb.append(", backgroundColor=");
            sb.append(str3);
            sb.append(", foregroundColor=");
            sb.append(str4);
            sb.append(", labelColor=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType externalImageLocationType = this.locationType;
            int hashCode = externalImageLocationType == null ? 0 : externalImageLocationType.hashCode();
            java.lang.String str = this.imagePath;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType externalImagePathFormatType = this.pathFormatType;
            int hashCode3 = externalImagePathFormatType == null ? 0 : externalImagePathFormatType.hashCode();
            java.lang.String str2 = this.originalMimeType;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.Integer num = this.originalWidth;
            int hashCode5 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.originalHeight;
            int hashCode6 = num2 == null ? 0 : num2.hashCode();
            java.lang.String str3 = this.backgroundColor;
            int hashCode7 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.foregroundColor;
            int hashCode8 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.labelColor;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage) other;
            return this.locationType == profileImage.locationType && kotlin.jvm.internal.Intrinsics.areEqual(this.imagePath, profileImage.imagePath) && this.pathFormatType == profileImage.pathFormatType && kotlin.jvm.internal.Intrinsics.areEqual(this.originalMimeType, profileImage.originalMimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalWidth, profileImage.originalWidth) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalHeight, profileImage.originalHeight) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, profileImage.backgroundColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.foregroundColor, profileImage.foregroundColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelColor, profileImage.labelColor);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType locationType, java.lang.String imagePath, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType pathFormatType, java.lang.String originalMimeType, java.lang.Integer originalWidth, java.lang.Integer originalHeight, java.lang.String backgroundColor, java.lang.String foregroundColor, java.lang.String labelColor) {
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage(locationType, imagePath, pathFormatType, originalMimeType, originalWidth, originalHeight, backgroundColor, foregroundColor, labelColor);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getLabelColor() {
            return this.labelColor;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getForegroundColor() {
            return this.foregroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Integer getOriginalHeight() {
            return this.originalHeight;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Integer getOriginalWidth() {
            return this.originalWidth;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getOriginalMimeType() {
            return this.originalMimeType;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType getPathFormatType() {
            return this.pathFormatType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType getLocationType() {
            return this.locationType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Contingency;", "", "", "__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;", "onExternalPhoneNumberRequiredContingency", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;", "onExternalEConsentContingency", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Contingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;", "getOnExternalPhoneNumberRequiredContingency", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;", "getOnExternalEConsentContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contingency {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency;

        public Contingency(java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onExternalPhoneNumberRequiredContingency = onExternalPhoneNumberRequiredContingency;
            this.onExternalEConsentContingency = onExternalEConsentContingency;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency getOnExternalPhoneNumberRequiredContingency() {
            return this.onExternalPhoneNumberRequiredContingency;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency getOnExternalEConsentContingency() {
            return this.onExternalEConsentContingency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency = this.onExternalPhoneNumberRequiredContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency = this.onExternalEConsentContingency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contingency(__typename=");
            sb.append(str);
            sb.append(", onExternalPhoneNumberRequiredContingency=");
            sb.append(onExternalPhoneNumberRequiredContingency);
            sb.append(", onExternalEConsentContingency=");
            sb.append(onExternalEConsentContingency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency = this.onExternalPhoneNumberRequiredContingency;
            int hashCode2 = onExternalPhoneNumberRequiredContingency == null ? 0 : onExternalPhoneNumberRequiredContingency.hashCode();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency = this.onExternalEConsentContingency;
            return (((hashCode * 31) + hashCode2) * 31) + (onExternalEConsentContingency != null ? onExternalEConsentContingency.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency contingency = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, contingency.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalPhoneNumberRequiredContingency, contingency.onExternalPhoneNumberRequiredContingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.onExternalEConsentContingency, contingency.onExternalEConsentContingency);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency copy(java.lang.String __typename, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency(__typename, onExternalPhoneNumberRequiredContingency, onExternalEConsentContingency);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency getOnExternalEConsentContingency() {
            return this.onExternalEConsentContingency;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency getOnExternalPhoneNumberRequiredContingency() {
            return this.onExternalPhoneNumberRequiredContingency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency contingency, java.lang.String str, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contingency.__typename;
            }
            if ((i & 2) != 0) {
                onExternalPhoneNumberRequiredContingency = contingency.onExternalPhoneNumberRequiredContingency;
            }
            if ((i & 4) != 0) {
                onExternalEConsentContingency = contingency.onExternalEConsentContingency;
            }
            return contingency.copy(str, onExternalPhoneNumberRequiredContingency, onExternalEConsentContingency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "name", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalPhoneNumberRequiredContingency {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName name;

        public OnExternalPhoneNumberRequiredContingency(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalContingencyName, "");
            this.name = externalContingencyName;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalPhoneNumberRequiredContingency(name=");
            sb.append(externalContingencyName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency) && this.name == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency) other).name;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalContingencyName = onExternalPhoneNumberRequiredContingency.name;
            }
            return onExternalPhoneNumberRequiredContingency.copy(externalContingencyName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "name", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalEConsentContingency {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName name;

        public OnExternalEConsentContingency(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalContingencyName, "");
            this.name = externalContingencyName;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalEConsentContingency(name=");
            sb.append(externalContingencyName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency) && this.name == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency) other).name;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalContingencyName = onExternalEConsentContingency.name;
            }
            return onExternalEConsentContingency.copy(externalContingencyName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;", "", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Error;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnExternalBuyerInfoErrorResponse {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error> errors;

        public OnExternalBuyerInfoErrorResponse(java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errors = list;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnExternalBuyerInfoErrorResponse(errors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse) other).errors);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse copy(java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse(errors);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onExternalBuyerInfoErrorResponse.errors;
            }
            return onExternalBuyerInfoErrorResponse.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Error;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBuyerInfoErrorReason;", "name", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBuyerInfoErrorReason;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBuyerInfoErrorReason;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBuyerInfoErrorReason;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBuyerInfoErrorReason;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason name;

        public Error(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason externalBuyerInfoErrorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBuyerInfoErrorReason, "");
            this.name = externalBuyerInfoErrorReason;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason externalBuyerInfoErrorReason = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(name=");
            sb.append(externalBuyerInfoErrorReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error) && this.name == ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error) other).name;
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error error, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason externalBuyerInfoErrorReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                externalBuyerInfoErrorReason = error.name;
            }
            return error.copy(externalBuyerInfoErrorReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBuyerInfo($token: externalToken!) { external { buyerInfo(token: $token) { __typename ... on externalBuyerInfoSuccessResponse { userId email phone { countryCode nationalNumber extensionNumber } name { prefix givenName surname middleName suffix fullName orthography } profileImage { locationType imagePath pathFormatType originalMimeType originalWidth originalHeight backgroundColor foregroundColor labelColor } contingencies { __typename ... on externalPhoneNumberRequiredContingency { name } ... on externalEConsentContingency { name } } } ... on externalBuyerInfoErrorResponse { errors { name } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.token;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetBuyerInfoQuery(token=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery) other).token);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery copy(java.lang.Object token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery(token);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getToken() {
        return this.token;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery getBuyerInfoQuery, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = getBuyerInfoQuery.token;
        }
        return getBuyerInfoQuery.copy(obj);
    }
}
