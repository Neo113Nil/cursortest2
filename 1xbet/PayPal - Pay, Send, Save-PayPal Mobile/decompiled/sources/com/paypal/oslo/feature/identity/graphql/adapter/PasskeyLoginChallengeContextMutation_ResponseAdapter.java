package com.paypal.oslo.feature.identity.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/PasskeyLoginChallengeContextMutation_ResponseAdapter;", "", "<init>", "()V", "Data", "Authenticate", "OnAuthenticationChallengeResult", "Challenge", "OnPasskeyCredentialRequestOptionAuthenticationChallenge", "AllowedCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyLoginChallengeContextMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/PasskeyLoginChallengeContextMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("authenticate");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate authenticate = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                authenticate = (com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Authenticate.INSTANCE, true).fromJson(reader, customScalarAdapters);
            }
            if (authenticate != null) {
                return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data(authenticate);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "authenticate");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("authenticate");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Authenticate.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAuthenticate());
        }
    }

    private PasskeyLoginChallengeContextMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/PasskeyLoginChallengeContextMutation_ResponseAdapter$Authenticate;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Authenticate;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Authenticate implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Authenticate INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Authenticate();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Authenticate() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("AuthenticationChallengeResult"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onAuthenticationChallengeResult = com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnAuthenticationChallengeResult.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate(str, onAuthenticationChallengeResult);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Authenticate value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnAuthenticationChallengeResult() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnAuthenticationChallengeResult.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAuthenticationChallengeResult());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/PasskeyLoginChallengeContextMutation_ResponseAdapter$OnAuthenticationChallengeResult;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnAuthenticationChallengeResult;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnAuthenticationChallengeResult implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnAuthenticationChallengeResult INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnAuthenticationChallengeResult();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"correlationId", "challenges"});
        public static final int $stable = 8;

        private OnAuthenticationChallengeResult() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Challenge.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult(str, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "challenges");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnAuthenticationChallengeResult value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("correlationId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCorrelationId());
            writer.name("challenges");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Challenge.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getChallenges());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/PasskeyLoginChallengeContextMutation_ResponseAdapter$Challenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Challenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Challenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$Challenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Challenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Challenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.Challenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Challenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PasskeyCredentialRequestOptionAuthenticationChallenge"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPasskeyCredentialRequestOptionAuthenticationChallenge = com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge(str, onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.Challenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPasskeyCredentialRequestOptionAuthenticationChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPasskeyCredentialRequestOptionAuthenticationChallenge());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/PasskeyLoginChallengeContextMutation_ResponseAdapter$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$OnPasskeyCredentialRequestOptionAuthenticationChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPasskeyCredentialRequestOptionAuthenticationChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextId", "challengeType", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "relyingPartyId", "userVerification", "allowedCredentials"});
        public static final int $stable = 8;

        private OnPasskeyCredentialRequestOptionAuthenticationChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    authenticationChallengeType = com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    passkeyUserVerification = com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyUserVerification_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.AllowedCredential.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (authenticationChallengeType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str3 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "relyingPartyId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (passkeyUserVerification == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "userVerification");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge(str, authenticationChallengeType, str2, str3, passkeyUserVerification, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "allowedCredentials");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.OnPasskeyCredentialRequestOptionAuthenticationChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getContextId());
            writer.name("challengeType");
            com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeType());
            writer.name(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallenge());
            writer.name("relyingPartyId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getRelyingPartyId());
            writer.name("userVerification");
            com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyUserVerification_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getUserVerification());
            writer.name("allowedCredentials");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.AllowedCredential.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getAllowedCredentials());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/PasskeyLoginChallengeContextMutation_ResponseAdapter$AllowedCredential;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/PasskeyLoginChallengeContextMutation$AllowedCredential;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AllowedCredential implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.AllowedCredential INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.PasskeyLoginChallengeContextMutation_ResponseAdapter.AllowedCredential();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type", "transports"});
        public static final int $stable = 8;

        private AllowedCredential() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.PasskeyAuthenticationType passkeyAuthenticationType = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    passkeyAuthenticationType = com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyAuthenticationType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyAuthenticationTransport_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (passkeyAuthenticationType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential(str, passkeyAuthenticationType, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "transports");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation.AllowedCredential value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyAuthenticationType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("transports");
            com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyAuthenticationTransport_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, (java.util.List) value.getTransports());
        }
    }
}
