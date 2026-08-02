package com.paypal.oslo.feature.identity.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "StepUpIdentityChallenge", "OnTextOneTimePasscodeIdentityChallenge", "PhoneNumber", "OnEmailOneTimePasscodeIdentityChallenge", "EmailAddress", "OnWhatsappOneTimePasscodeIdentityChallenge", "PhoneNumber1", "OnPhoneOneTimePasscodeIdentityChallenge", "PhoneNumber2", "OnSecurityQuestionIdentityChallenge", "SecurityQuestion", "OnAuthenticatorAppIdentityChallenge", "OnSilentAuthenticationIdentityChallenge", "PhoneNumber3", "OnWebViewIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepUpIdentityChallengesQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("stepUpIdentityChallenges");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.StepUpIdentityChallenge.INSTANCE, true))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("stepUpIdentityChallenges");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.StepUpIdentityChallenge.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getStepUpIdentityChallenges());
        }
    }

    private StepUpIdentityChallengesQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$StepUpIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$StepUpIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$StepUpIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$StepUpIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StepUpIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.StepUpIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.StepUpIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private StepUpIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge onSecurityQuestionIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge onSilentAuthenticationIdentityChallenge;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge onWebViewIdentityChallenge = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.TEXT_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onTextOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onTextOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.EMAIL_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onEmailOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onEmailOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.WHATSAPP_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onWhatsappOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onWhatsappOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.PHONE_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPhoneOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPhoneOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.SECURITY_QUESTION), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onSecurityQuestionIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSecurityQuestionIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onSecurityQuestionIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.AUTHENTICATOR_APP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onAuthenticatorAppIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnAuthenticatorAppIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onAuthenticatorAppIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.SILENT_AUTH), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onSilentAuthenticationIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSilentAuthenticationIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onSilentAuthenticationIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("WebViewIdentityChallenge"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onWebViewIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWebViewIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge(str, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onSecurityQuestionIdentityChallenge, onAuthenticatorAppIdentityChallenge, onSilentAuthenticationIdentityChallenge, onWebViewIdentityChallenge);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.StepUpIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnTextOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnTextOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnEmailOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnEmailOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnWhatsappOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnWhatsappOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnPhoneOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPhoneOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnSecurityQuestionIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSecurityQuestionIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnSecurityQuestionIdentityChallenge());
            }
            if (value.getOnAuthenticatorAppIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnAuthenticatorAppIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAuthenticatorAppIdentityChallenge());
            }
            if (value.getOnSilentAuthenticationIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSilentAuthenticationIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnSilentAuthenticationIdentityChallenge());
            }
            if (value.getOnWebViewIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWebViewIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnWebViewIdentityChallenge());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnTextOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnTextOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnTextOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "nonce", "partialToken", "phoneNumbers"});
        public static final int $stable = 8;

        private OnTextOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge(str, str2, str3, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "phoneNumbers");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnTextOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
            writer.name("phoneNumbers");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getPhoneNumbers());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$PhoneNumber;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneNumber implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"challengeId", "maskedNumber", "notified"});
        public static final int $stable = 8;

        private PhoneNumber() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber(str, str2, bool);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "maskedNumber");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("challengeId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallengeId());
            writer.name("maskedNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedNumber());
            writer.name("notified");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getNotified());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnEmailOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnEmailOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnEmailOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "nonce", "partialToken", "emailAddresses"});
        public static final int $stable = 8;

        private OnEmailOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.EmailAddress.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge(str, str2, str3, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "emailAddresses");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnEmailOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
            writer.name("emailAddresses");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.EmailAddress.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getEmailAddresses());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$EmailAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$EmailAddress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$EmailAddress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$EmailAddress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmailAddress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.EmailAddress INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.EmailAddress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"challengeId", "maskedEmail", "notified"});
        public static final int $stable = 8;

        private EmailAddress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "maskedEmail");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress(str, str2, bool.booleanValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "notified");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.EmailAddress value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("challengeId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallengeId());
            writer.name("maskedEmail");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedEmail());
            writer.name("notified");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getNotified()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnWhatsappOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWhatsappOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnWhatsappOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "nonce", "partialToken", "phoneNumbers"});
        public static final int $stable = 8;

        private OnWhatsappOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge(str, str2, str3, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "phoneNumbers");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWhatsappOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
            writer.name("phoneNumbers");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getPhoneNumbers());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$PhoneNumber1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneNumber1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber1 INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"challengeId", "maskedNumber", "notified"});
        public static final int $stable = 8;

        private PhoneNumber1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1(str, str2, bool);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "maskedNumber");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("challengeId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallengeId());
            writer.name("maskedNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedNumber());
            writer.name("notified");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getNotified());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnPhoneOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnPhoneOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPhoneOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "nonce", "partialToken", "phoneNumbers"});
        public static final int $stable = 8;

        private OnPhoneOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber2.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge(str, str2, str3, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "phoneNumbers");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnPhoneOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
            writer.name("phoneNumbers");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber2.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getPhoneNumbers());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$PhoneNumber2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber2;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber2;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber2;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneNumber2 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber2 INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber2();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"challengeId", "maskedNumber", "notified"});
        public static final int $stable = 8;

        private PhoneNumber2() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2(str, str2, bool);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "maskedNumber");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber2 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("challengeId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallengeId());
            writer.name("maskedNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedNumber());
            writer.name("notified");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getNotified());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnSecurityQuestionIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSecurityQuestionIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnSecurityQuestionIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSecurityQuestionIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSecurityQuestionIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "nonce", "partialToken", "securityQuestions"});
        public static final int $stable = 8;

        private OnSecurityQuestionIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.SecurityQuestion.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge(str, str2, str3, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "securityQuestions");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSecurityQuestionIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
            writer.name("securityQuestions");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.SecurityQuestion.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getSecurityQuestions());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$SecurityQuestion;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$SecurityQuestion;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$SecurityQuestion;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$SecurityQuestion;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SecurityQuestion implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.SecurityQuestion INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.SecurityQuestion();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"challengeId", "question"});
        public static final int $stable = 8;

        private SecurityQuestion() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion(str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "question");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.SecurityQuestion value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("challengeId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallengeId());
            writer.name("question");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getQuestion());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnAuthenticatorAppIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnAuthenticatorAppIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnAuthenticatorAppIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnAuthenticatorAppIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnAuthenticatorAppIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "nonce", "partialToken"});
        public static final int $stable = 8;

        private OnAuthenticatorAppIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge(str, str2, str3);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnAuthenticatorAppIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnSilentAuthenticationIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnSilentAuthenticationIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnSilentAuthenticationIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSilentAuthenticationIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnSilentAuthenticationIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "nonce", "partialToken", "phoneNumbers"});
        public static final int $stable = 8;

        private OnSilentAuthenticationIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber3.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge(str, str2, str3, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "phoneNumbers");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnSilentAuthenticationIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
            writer.name("phoneNumbers");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber3.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getPhoneNumbers());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$PhoneNumber3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber3;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber3;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$PhoneNumber3;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneNumber3 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber3 INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.PhoneNumber3();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"challengeId", "maskedNumber", "notified", "evaluateURL"});
        public static final int $stable = 8;

        private PhoneNumber3() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3(str, str2, bool, str3);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "maskedNumber");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.PhoneNumber3 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("challengeId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getChallengeId());
            writer.name("maskedNumber");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMaskedNumber());
            writer.name("notified");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getNotified());
            writer.name("evaluateURL");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getEvaluateURL());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/StepUpIdentityChallengesQuery_ResponseAdapter$OnWebViewIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/StepUpIdentityChallengesQuery$OnWebViewIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnWebViewIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWebViewIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.StepUpIdentityChallengesQuery_ResponseAdapter.OnWebViewIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "challengeMethod", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID, "returnUri", "returnUriParam", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "flowContext", "webChallengeUrl"});
        public static final int $stable = 8;

        private OnWebViewIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        
            if (r9 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        
            return new com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "webChallengeUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "returnUriParam");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "returnUri");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "challengeMethod");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r2 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        
            if (r3 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r4 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (r5 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            if (r6 == null) goto L23;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.Object obj = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        stepUpIdentityChallengeMethod = com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.StepUpIdentityChallengesQuery.OnWebViewIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("challengeMethod");
            com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeMethod());
            writer.name(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_STEP_UP_CONTEXT_ID);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getStepUpContextId());
            writer.name("returnUri");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getReturnUri());
            writer.name("returnUriParam");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getReturnUriParam());
            writer.name(com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFlowName());
            writer.name("flowContext");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFlowContext());
            writer.name("webChallengeUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getWebChallengeUrl());
        }
    }
}
