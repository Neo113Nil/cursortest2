package com.paypal.oslo.feature.identity.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OPERATION_NAME, "AvailableChallenge", "OnTextOneTimePasscodeIdentityChallenge", "OnEmailOneTimePasscodeIdentityChallenge", "OnWhatsappOneTimePasscodeIdentityChallenge", "OnPhoneOneTimePasscodeIdentityChallenge", "OnAuthenticatorAppIdentityChallenge", "OnSkipChangePasswordAndLoginIdentityChallenge", "OnChangePasswordIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateStepUpIdentityChallengeMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("validateStepUpIdentityChallenge");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                validateStepUpIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.ValidateStepUpIdentityChallenge.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (validateStepUpIdentityChallenge != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data(validateStepUpIdentityChallenge);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "validateStepUpIdentityChallenge");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("validateStepUpIdentityChallenge");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.ValidateStepUpIdentityChallenge.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getValidateStepUpIdentityChallenge());
        }
    }

    private ValidateStepUpIdentityChallengeMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$ValidateStepUpIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$ValidateStepUpIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ValidateStepUpIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.ValidateStepUpIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.ValidateStepUpIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"validationChallengeResultStatus", "canRetry", "stepUpStatus", "availableChallenges"});
        public static final int $stable = 8;

        private ValidateStepUpIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus = null;
            com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    validateStepUpIdentityChallengeResultStatus = (com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ValidateStepUpIdentityChallengeResultStatus_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    stepUpIdentityChallengeStatus = com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (stepUpIdentityChallengeStatus != null) {
                    return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge(validateStepUpIdentityChallengeResultStatus, booleanValue, stepUpIdentityChallengeStatus, list);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "stepUpStatus");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "canRetry");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("validationChallengeResultStatus");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ValidateStepUpIdentityChallengeResultStatus_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getValidationChallengeResultStatus());
            writer.name("canRetry");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getCanRetry()));
            writer.name("stepUpStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStepUpStatus());
            writer.name("availableChallenges");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getAvailableChallenges());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$AvailableChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$AvailableChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$AvailableChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$AvailableChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AvailableChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AvailableChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge onSkipChangePasswordAndLoginIdentityChallenge;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge onChangePasswordIdentityChallenge = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.TEXT_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onTextOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onTextOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.EMAIL_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onEmailOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onEmailOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.WHATSAPP_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onWhatsappOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onWhatsappOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.PHONE_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPhoneOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPhoneOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.AUTHENTICATOR_APP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onAuthenticatorAppIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onAuthenticatorAppIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.SKIP_AND_LOGIN), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onSkipChangePasswordAndLoginIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnSkipChangePasswordAndLoginIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onSkipChangePasswordAndLoginIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.CHANGE_PASSWORD), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onChangePasswordIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnChangePasswordIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge(str, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onAuthenticatorAppIdentityChallenge, onSkipChangePasswordAndLoginIdentityChallenge, onChangePasswordIdentityChallenge);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnTextOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnTextOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnEmailOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnEmailOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnWhatsappOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnWhatsappOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnPhoneOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPhoneOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnAuthenticatorAppIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAuthenticatorAppIdentityChallenge());
            }
            if (value.getOnSkipChangePasswordAndLoginIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnSkipChangePasswordAndLoginIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnSkipChangePasswordAndLoginIdentityChallenge());
            }
            if (value.getOnChangePasswordIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnChangePasswordIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnChangePasswordIdentityChallenge());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$OnTextOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnTextOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnTextOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragmentImpl_ResponseAdapter.TextOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragmentImpl_ResponseAdapter.TextOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getTextOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$OnEmailOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnEmailOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnEmailOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragmentImpl_ResponseAdapter.EmailOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragmentImpl_ResponseAdapter.EmailOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getEmailOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$OnWhatsappOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnWhatsappOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnWhatsappOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragmentImpl_ResponseAdapter.WhatsappOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragmentImpl_ResponseAdapter.WhatsappOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getWhatsappOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$OnPhoneOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPhoneOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnPhoneOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragmentImpl_ResponseAdapter.PhoneOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragmentImpl_ResponseAdapter.PhoneOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPhoneOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$OnAuthenticatorAppIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnAuthenticatorAppIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnAuthenticatorAppIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragmentImpl_ResponseAdapter.AuthenticatorAppChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragmentImpl_ResponseAdapter.AuthenticatorAppChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getAuthenticatorAppChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$OnSkipChangePasswordAndLoginIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnSkipChangePasswordAndLoginIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnSkipChangePasswordAndLoginIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnSkipChangePasswordAndLoginIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnSkipChangePasswordAndLoginIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "challengeMethod", "validationToken", "nonce", "partialToken"});
        public static final int $stable = 8;

        private OnSkipChangePasswordAndLoginIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    stepUpIdentityChallengeMethod = com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (stepUpIdentityChallengeMethod == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "challengeMethod");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge(str, stepUpIdentityChallengeMethod, str2, str3, str4);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "validationToken");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnSkipChangePasswordAndLoginIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("challengeMethod");
            com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeMethod());
            writer.name("validationToken");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValidationToken());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/ValidateStepUpIdentityChallengeMutation_ResponseAdapter$OnChangePasswordIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$OnChangePasswordIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnChangePasswordIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnChangePasswordIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.ValidateStepUpIdentityChallengeMutation_ResponseAdapter.OnChangePasswordIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "challengeMethod", "nonce", "partialToken"});
        public static final int $stable = 8;

        private OnChangePasswordIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    stepUpIdentityChallengeMethod = com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (stepUpIdentityChallengeMethod != null) {
                return new com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge(str, stepUpIdentityChallengeMethod, str2, str3);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "challengeMethod");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnChangePasswordIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("challengeMethod");
            com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getChallengeMethod());
            writer.name("nonce");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getNonce());
            writer.name("partialToken");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPartialToken());
        }
    }
}
