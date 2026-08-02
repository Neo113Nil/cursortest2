package com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "External", "BuyerInfo", "OnExternalBuyerInfoSuccessResponse", "Phone", "Name", "ProfileImage", "Contingency", "OnExternalPhoneNumberRequiredContingency", "OnExternalEConsentContingency", "OnExternalBuyerInfoErrorResponse", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetBuyerInfoQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL);
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External external = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                external = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.External.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data(external);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.External.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getExternal());
        }
    }

    private GetBuyerInfoQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$External;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$External;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class External implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.External INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.External();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("buyerInfo");
        public static final int $stable = 8;

        private External() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo buyerInfo = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                buyerInfo = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.BuyerInfo.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External(buyerInfo);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.External value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("buyerInfo");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.BuyerInfo.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getBuyerInfo());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$BuyerInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$BuyerInfo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BuyerInfo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.BuyerInfo INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.BuyerInfo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private BuyerInfo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse onExternalBuyerInfoSuccessResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse onExternalBuyerInfoErrorResponse = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalBuyerInfoSuccessResponse"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalBuyerInfoSuccessResponse = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoSuccessResponse.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalBuyerInfoSuccessResponse = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalBuyerInfoErrorResponse"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalBuyerInfoErrorResponse = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoErrorResponse.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo(str, onExternalBuyerInfoSuccessResponse, onExternalBuyerInfoErrorResponse);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.BuyerInfo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalBuyerInfoSuccessResponse() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoSuccessResponse.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalBuyerInfoSuccessResponse());
            }
            if (value.getOnExternalBuyerInfoErrorResponse() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoErrorResponse.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalBuyerInfoErrorResponse());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$OnExternalBuyerInfoSuccessResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoSuccessResponse;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalBuyerInfoSuccessResponse implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoSuccessResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoSuccessResponse();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"userId", "email", "phone", "name", "profileImage", "contingencies"});
        public static final int $stable = 8;

        private OnExternalBuyerInfoSuccessResponse() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone phone = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name name2 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage profileImage = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    phone = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Phone.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    name2 = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Name.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    profileImage = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.ProfileImage.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Contingency.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "userId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "email");
                throw new kotlin.KotlinNothingValueException();
            }
            if (name2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse(str, obj, phone, name2, profileImage, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "contingencies");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoSuccessResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("userId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getUserId());
            writer.name("email");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getEmail());
            writer.name("phone");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Phone.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPhone());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Name.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getName());
            writer.name("profileImage");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.ProfileImage.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getProfileImage());
            writer.name("contingencies");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Contingency.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getContingencies());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$Phone;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Phone;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Phone implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Phone INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Phone();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "extensionNumber"});
        public static final int $stable = 8;

        private Phone() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone(str, str2, str3);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Phone value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("countryCode");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCountryCode());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNationalNumber());
            writer.name("extensionNumber");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getExtensionNumber());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$Name;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Name;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Name implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Name INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Name();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "orthography"});
        public static final int $stable = 8;

        private Name() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name(r2, r3, r4, r5, r6, r7, r8);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography externalOrthography = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        externalOrthography = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalOrthography) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalOrthography_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Name value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("prefix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPrefix());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGivenName());
            writer.name("surname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSurname());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMiddleName());
            writer.name("suffix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSuffix());
            writer.name("fullName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFullName());
            writer.name("orthography");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalOrthography_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getOrthography());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$ProfileImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$ProfileImage;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProfileImage implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.ProfileImage INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.ProfileImage();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"locationType", "imagePath", "pathFormatType", "originalMimeType", "originalWidth", "originalHeight", "backgroundColor", "foregroundColor", "labelColor"});
        public static final int $stable = 8;

        private ProfileImage() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
        
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType externalImageLocationType = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType externalImagePathFormatType = null;
            java.lang.String str2 = null;
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        externalImageLocationType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImageLocationType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalImageLocationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        externalImagePathFormatType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalImagePathFormatType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalImagePathFormatType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num2 = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.ProfileImage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("locationType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalImageLocationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getLocationType());
            writer.name("imagePath");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getImagePath());
            writer.name("pathFormatType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalImagePathFormatType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getPathFormatType());
            writer.name("originalMimeType");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getOriginalMimeType());
            writer.name("originalWidth");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getOriginalWidth());
            writer.name("originalHeight");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getOriginalHeight());
            writer.name("backgroundColor");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBackgroundColor());
            writer.name("foregroundColor");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getForegroundColor());
            writer.name("labelColor");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getLabelColor());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$Contingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Contingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Contingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Contingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Contingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Contingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Contingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Contingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency onExternalPhoneNumberRequiredContingency;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency onExternalEConsentContingency = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalPhoneNumberRequiredContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalPhoneNumberRequiredContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalPhoneNumberRequiredContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalPhoneNumberRequiredContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalEConsentContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalEConsentContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalEConsentContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency(str, onExternalPhoneNumberRequiredContingency, onExternalEConsentContingency);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Contingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalPhoneNumberRequiredContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalPhoneNumberRequiredContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalPhoneNumberRequiredContingency());
            }
            if (value.getOnExternalEConsentContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalEConsentContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalEConsentContingency());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$OnExternalPhoneNumberRequiredContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalPhoneNumberRequiredContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalPhoneNumberRequiredContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalPhoneNumberRequiredContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalPhoneNumberRequiredContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalPhoneNumberRequiredContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalPhoneNumberRequiredContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$OnExternalEConsentContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalEConsentContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalEConsentContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalEConsentContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalEConsentContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalEConsentContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalEConsentContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$OnExternalBuyerInfoErrorResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$OnExternalBuyerInfoErrorResponse;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalBuyerInfoErrorResponse implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoErrorResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.OnExternalBuyerInfoErrorResponse();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
        public static final int $stable = 8;

        private OnExternalBuyerInfoErrorResponse() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Error.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.OnExternalBuyerInfoErrorResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Error.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getErrors());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/GetBuyerInfoQuery_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Error;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Error;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/GetBuyerInfoQuery$Error;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Error implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Error INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.GetBuyerInfoQuery_ResponseAdapter.Error();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private Error() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBuyerInfoErrorReason externalBuyerInfoErrorReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalBuyerInfoErrorReason = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBuyerInfoErrorReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalBuyerInfoErrorReason != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error(externalBuyerInfoErrorReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.GetBuyerInfoQuery.Error value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBuyerInfoErrorReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }
}
