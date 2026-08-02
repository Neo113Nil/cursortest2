package com.paypal.oslo.feature.identity.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OPERATION_NAME, "AvailableChallenge", "OnTextOneTimePasscodeIdentityChallenge", "OnEmailOneTimePasscodeIdentityChallenge", "OnWhatsappOneTimePasscodeIdentityChallenge", "OnPhoneOneTimePasscodeIdentityChallenge", "OnAuthenticatorAppIdentityChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliverStepUpIdentityChallengeMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("deliverStepUpIdentityChallenge");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                deliverStepUpIdentityChallenge = (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.DeliverStepUpIdentityChallenge.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (deliverStepUpIdentityChallenge != null) {
                return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data(deliverStepUpIdentityChallenge);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "deliverStepUpIdentityChallenge");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("deliverStepUpIdentityChallenge");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.DeliverStepUpIdentityChallenge.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getDeliverStepUpIdentityChallenge());
        }
    }

    private DeliverStepUpIdentityChallengeMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$DeliverStepUpIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$DeliverStepUpIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeliverStepUpIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.DeliverStepUpIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.DeliverStepUpIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"notifyChallengeResultStatus", "challengeId", "deliveryMethod", "deliveryTarget", "canRetry", "stepUpStatus", "availableChallenges"});
        public static final int $stable = 8;

        private DeliverStepUpIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge(r2, r3, r4, r5, r6, r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "stepUpStatus");
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "canRetry");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "notifyChallengeResultStatus");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r2 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        
            if (r0 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            r6 = r0.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        
            if (r7 == null) goto L18;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus = null;
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeStatus stepUpIdentityChallengeStatus = null;
            java.util.List list = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        notifyStepUpIdentityChallengeResultStatus = com.paypal.oslo.api.graphql.schema.type.adapter.NotifyStepUpIdentityChallengeResultStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        stepUpIdentityChallengeMethod = (com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        stepUpIdentityChallengeStatus = com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("notifyChallengeResultStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.NotifyStepUpIdentityChallengeResultStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getNotifyChallengeResultStatus());
            writer.name("challengeId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getChallengeId());
            writer.name("deliveryMethod");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeMethod_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getDeliveryMethod());
            writer.name("deliveryTarget");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDeliveryTarget());
            writer.name("canRetry");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getCanRetry()));
            writer.name("stepUpStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.StepUpIdentityChallengeStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStepUpStatus());
            writer.name("availableChallenges");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getAvailableChallenges());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$AvailableChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$AvailableChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$AvailableChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$AvailableChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AvailableChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.AvailableChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AvailableChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.TEXT_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onTextOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onTextOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.EMAIL_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onEmailOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onEmailOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.WHATSAPP_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onWhatsappOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onWhatsappOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.PHONE_OTP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPhoneOneTimePasscodeIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPhoneOneTimePasscodeIdentityChallenge = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.AUTHENTICATOR_APP), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onAuthenticatorAppIdentityChallenge = com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge(str, onTextOneTimePasscodeIdentityChallenge, onEmailOneTimePasscodeIdentityChallenge, onWhatsappOneTimePasscodeIdentityChallenge, onPhoneOneTimePasscodeIdentityChallenge, onAuthenticatorAppIdentityChallenge);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnTextOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnTextOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnEmailOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnEmailOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnWhatsappOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnWhatsappOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnPhoneOneTimePasscodeIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPhoneOneTimePasscodeIdentityChallenge());
            }
            if (value.getOnAuthenticatorAppIdentityChallenge() != null) {
                com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge.INSTANCE.toJson(writer, customScalarAdapters, value.getOnAuthenticatorAppIdentityChallenge());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$OnTextOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnTextOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnTextOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnTextOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnTextOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragmentImpl_ResponseAdapter.TextOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragmentImpl_ResponseAdapter.TextOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getTextOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$OnEmailOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnEmailOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnEmailOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnEmailOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnEmailOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragmentImpl_ResponseAdapter.EmailOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragmentImpl_ResponseAdapter.EmailOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getEmailOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$OnWhatsappOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnWhatsappOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnWhatsappOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnWhatsappOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnWhatsappOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragmentImpl_ResponseAdapter.WhatsappOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragmentImpl_ResponseAdapter.WhatsappOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getWhatsappOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$OnPhoneOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnPhoneOneTimePasscodeIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPhoneOneTimePasscodeIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnPhoneOneTimePasscodeIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnPhoneOneTimePasscodeIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragmentImpl_ResponseAdapter.PhoneOtpChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragmentImpl_ResponseAdapter.PhoneOtpChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPhoneOtpChallengeFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/adapter/DeliverStepUpIdentityChallengeMutation_ResponseAdapter$OnAuthenticatorAppIdentityChallenge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$OnAuthenticatorAppIdentityChallenge;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnAuthenticatorAppIdentityChallenge implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge> {
        public static final com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge INSTANCE = new com.paypal.oslo.feature.identity.graphql.adapter.DeliverStepUpIdentityChallengeMutation_ResponseAdapter.OnAuthenticatorAppIdentityChallenge();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnAuthenticatorAppIdentityChallenge() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment fromJson = com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragmentImpl_ResponseAdapter.AuthenticatorAppChallengeFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragmentImpl_ResponseAdapter.AuthenticatorAppChallengeFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getAuthenticatorAppChallengeFragment());
        }
    }
}
