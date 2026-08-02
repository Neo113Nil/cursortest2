package com.paypal.oslo.api.graphql.shared.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "AuthenticationChallengeFragment", "Challenge", "OnGenericAuthenticationChallenge", "OnOneTimePasswordAuthenticationChallenge", "OnOneTimePasswordGenerateCodeAuthenticationChallenge", "Phone", "OnPasskeyCredentialRequestOptionAuthenticationChallenge", "AllowedCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AuthenticationChallengeFragmentImpl_ResponseAdapter {
    public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$AuthenticationChallengeFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthenticationChallengeFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.AuthenticationChallengeFragment INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.AuthenticationChallengeFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"correlationId", "challenges"});

        private AuthenticationChallengeFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Challenge.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment(str, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "challenges");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("correlationId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCorrelationId());
            writer.name("challenges");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Challenge.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getChallenges());
        }
    }

    private AuthenticationChallengeFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$Challenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Challenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Challenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Challenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Challenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Challenge INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Challenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");

        private Challenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge onOneTimePasswordAuthenticationChallenge;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge onPasskeyCredentialRequestOptionAuthenticationChallenge = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("GenericAuthenticationChallenge"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onGenericAuthenticationChallenge = com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnGenericAuthenticationChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onGenericAuthenticationChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OneTimePasswordAuthenticationChallenge"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onOneTimePasswordAuthenticationChallenge = com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordAuthenticationChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onOneTimePasswordAuthenticationChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OneTimePasswordGenerateCodeAuthenticationChallenge"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onOneTimePasswordGenerateCodeAuthenticationChallenge = com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordGenerateCodeAuthenticationChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onOneTimePasswordGenerateCodeAuthenticationChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PasskeyCredentialRequestOptionAuthenticationChallenge"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPasskeyCredentialRequestOptionAuthenticationChallenge = com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge(str, onGenericAuthenticationChallenge, onOneTimePasswordAuthenticationChallenge, onOneTimePasswordGenerateCodeAuthenticationChallenge, onPasskeyCredentialRequestOptionAuthenticationChallenge);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Challenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnGenericAuthenticationChallenge() != null) {
                com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnGenericAuthenticationChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnGenericAuthenticationChallenge());
            }
            if (value.getOnOneTimePasswordAuthenticationChallenge() != null) {
                com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordAuthenticationChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnOneTimePasswordAuthenticationChallenge());
            }
            if (value.getOnOneTimePasswordGenerateCodeAuthenticationChallenge() != null) {
                com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordGenerateCodeAuthenticationChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnOneTimePasswordGenerateCodeAuthenticationChallenge());
            }
            if (value.getOnPasskeyCredentialRequestOptionAuthenticationChallenge() != null) {
                com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPasskeyCredentialRequestOptionAuthenticationChallenge());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$OnGenericAuthenticationChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnGenericAuthenticationChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnGenericAuthenticationChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnGenericAuthenticationChallenge INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnGenericAuthenticationChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextId", "challengeType"});

        private OnGenericAuthenticationChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    authenticationChallengeType = com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (authenticationChallengeType != null) {
                return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge(str, authenticationChallengeType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "challengeType");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnGenericAuthenticationChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getContextId());
            writer.name("challengeType");
            com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$OnOneTimePasswordAuthenticationChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordAuthenticationChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnOneTimePasswordAuthenticationChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordAuthenticationChallenge INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordAuthenticationChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextId", "challengeType", "nonce"});

        private OnOneTimePasswordAuthenticationChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    authenticationChallengeType = com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (authenticationChallengeType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge(str2, authenticationChallengeType, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "nonce");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordAuthenticationChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getContextId());
            writer.name("challengeType");
            com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeType());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnOneTimePasswordGenerateCodeAuthenticationChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnOneTimePasswordGenerateCodeAuthenticationChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordGenerateCodeAuthenticationChallenge INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnOneTimePasswordGenerateCodeAuthenticationChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextId", "challengeType", "phones", "nonce"});

        private OnOneTimePasswordGenerateCodeAuthenticationChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = null;
            java.util.List list = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    authenticationChallengeType = com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Phone.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (authenticationChallengeType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "phones");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge(str2, authenticationChallengeType, list, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "nonce");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnOneTimePasswordGenerateCodeAuthenticationChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getContextId());
            writer.name("challengeType");
            com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeType());
            writer.name("phones");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Phone.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getPhones());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$Phone;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Phone;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Phone;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$Phone;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Phone implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Phone INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.Phone();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"maskedPhoneNumber", "phoneChallengeId"});

        private Phone() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "maskedPhoneNumber");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone(str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "phoneChallengeId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.Phone value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("maskedPhoneNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedPhoneNumber());
            writer.name("phoneChallengeId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getPhoneChallengeId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$OnPasskeyCredentialRequestOptionAuthenticationChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPasskeyCredentialRequestOptionAuthenticationChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.OnPasskeyCredentialRequestOptionAuthenticationChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextId", "challengeType", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "relayingPartyId", "allowedCredentials", "userVerification"});

        private OnPasskeyCredentialRequestOptionAuthenticationChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.PasskeyUserVerification passkeyUserVerification = null;
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
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.AllowedCredential.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    passkeyUserVerification = com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyUserVerification_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
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
                com.apollographql.apollo.api.Assertions.missingField(reader, "relayingPartyId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "allowedCredentials");
                throw new kotlin.KotlinNothingValueException();
            }
            if (passkeyUserVerification != null) {
                return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge(str, authenticationChallengeType, str2, str3, list, passkeyUserVerification);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "userVerification");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.OnPasskeyCredentialRequestOptionAuthenticationChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getContextId());
            writer.name("challengeType");
            com.paypal.oslo.api.graphql.schema.type.adapter.AuthenticationChallengeType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeType());
            writer.name(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallenge());
            writer.name("relayingPartyId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getRelayingPartyId());
            writer.name("allowedCredentials");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.AllowedCredential.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getAllowedCredentials());
            writer.name("userVerification");
            com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyUserVerification_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getUserVerification());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragmentImpl_ResponseAdapter$AllowedCredential;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$AllowedCredential;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$AllowedCredential;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationChallengeFragment$AllowedCredential;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AllowedCredential implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential> {
        public static final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.AllowedCredential INSTANCE = new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragmentImpl_ResponseAdapter.AllowedCredential();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("transports");

        private AllowedCredential() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyAuthenticationTransport_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "transports");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.api.graphql.shared.fragment.AuthenticationChallengeFragment.AllowedCredential value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("transports");
            com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PasskeyAuthenticationTransport_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, (java.util.List) value.getTransports());
        }
    }
}
