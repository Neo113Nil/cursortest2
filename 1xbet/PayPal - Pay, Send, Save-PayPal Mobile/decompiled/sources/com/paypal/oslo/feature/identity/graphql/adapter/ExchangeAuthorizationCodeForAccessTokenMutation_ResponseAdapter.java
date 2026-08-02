package com.paypal.oslo.feature.identity.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("exchangeAuthorizationCodeForAccessToken");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken exchangeAuthorizationCodeForAccessToken = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                exchangeAuthorizationCodeForAccessToken = (com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter.ExchangeAuthorizationCodeForAccessToken.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (exchangeAuthorizationCodeForAccessToken != null) {
                return new com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data(exchangeAuthorizationCodeForAccessToken);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "exchangeAuthorizationCodeForAccessToken");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("exchangeAuthorizationCodeForAccessToken");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter.ExchangeAuthorizationCodeForAccessToken.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getExchangeAuthorizationCodeForAccessToken());
        }
    }

    private ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter$ExchangeAuthorizationCodeForAccessToken;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExchangeAuthorizationCodeForAccessToken implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter.ExchangeAuthorizationCodeForAccessToken INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ExchangeAuthorizationCodeForAccessTokenMutation_ResponseAdapter.ExchangeAuthorizationCodeForAccessToken();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "expiresInSec", "expiresAtTime"});
        public static final int $stable = 8;

        private ExchangeAuthorizationCodeForAccessToken() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Integer num = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
                throw new kotlin.KotlinNothingValueException();
            }
            if (num != null) {
                int intValue = num.intValue();
                if (obj != null) {
                    return new com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken(str, intValue, obj);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "expiresAtTime");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "expiresInSec");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getToken());
            writer.name("expiresInSec");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getExpiresInSec()));
            writer.name("expiresAtTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getExpiresAtTime());
        }
    }
}
